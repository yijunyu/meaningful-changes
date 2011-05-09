/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.gmf.internal.xpand.codeassist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.ast.Advice;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.ExpressionFacade;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.model.XpandAdvice;
import org.eclipse.gmf.internal.xpand.model.XpandDefinition;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;
import org.eclipse.gmf.internal.xpand.model.XpandResource;

public class FastAnalyzer {

	private static final Pattern PARAM_PATTERN = Pattern.compile("([\\[\\]:\\w]+)\\s+([\\w]+)");

	private final static Pattern IMPORT_PATTERN = Pattern.compile(XpandTokens.LT + "\\s*IMPORT\\s+\"([^\"]+)\"\\s*" + XpandTokens.RT);

	private final static Pattern EXTENSION_PATTERN = Pattern.compile(XpandTokens.LT + "\\s*EXTENSION\\s+([\\w\\:]+)\\s*" + XpandTokens.RT);

	private final static Pattern INCOMPLETE_IMPORT_PATTERN = Pattern.compile(XpandTokens.LT + "\\s*IMPORT\\s+[\\w\\:]*\\z");

	private final static Pattern INCOMPLETE_EXTENSION_PATTERN = Pattern.compile(XpandTokens.LT + "\\s*EXTENSION\\s+[\\w\\:]*\\z");

	private final static Pattern DEFINE_PATTERN = Pattern.compile("(DEFINE|AROUND)\\s*(([\\w\\*:]+)\\s*(\\(([\\[\\]:\\w\\s\\,]*)\\*?\\s*\\))?\\s*FOR\\s*([\\[\\]:\\w\\s]+))");

	private final static Pattern BLOCK_PATTERN = Pattern.compile(getBlockPattern());

	private final static Pattern FOREACH_PATTERN = Pattern.compile("FOREACH\\s+(.+)\\s+AS\\s+(\\w+)(\\s+ITERATOR\\s+(\\w+))?");

	private final static Pattern EXPAND_PATTERN = Pattern.compile("EXPAND\\s+([\\w:]*)\\z");

	private final static Pattern LET_PATTERN = Pattern.compile("LET\\s+(.+)\\s+AS\\s+(\\w+)");

	private final static Pattern TYPEDECL_DEFINE_PATTERN1 = Pattern.compile("(DEFINE|AROUND)\\s*[\\w\\*:]+\\s*\\(([^\\)]*)\\z");

	private final static Pattern TYPEDECL_DEFINE_PATTERN2 = Pattern.compile("(DEFINE|AROUND)\\s*[\\w\\*:]+\\s*(\\([\\[\\]:\\w\\s\\,]*\\*?\\s*\\))?\\s*FOR\\s+[^" + XpandTokens.RT + "\\s]*\\z");

	private final static Pattern TYPEDECL_PARAM_PATTERN = Pattern.compile("(,|\\(|\\A)\\s*[\\[\\]:\\w]*\\z");

	private final static Pattern TYPEDECL_TYPESELECT_PATTERN = Pattern.compile("typeSelect\\(\\s*[\\[\\]:\\w]*\\z");

	private final static Pattern IN_TAG_PATTERN = Pattern.compile(XpandTokens.LT + "([^" + XpandTokens.RT + "]*)\\z");

	private FastAnalyzer() {

	}

	public static boolean isInExpand(final String str) {
		return EXPAND_PATTERN.matcher(str).find();
	}

	public static boolean isInComment(final String str) {
		final int index = str.lastIndexOf(XpandTokens.LT + "REM" + XpandTokens.RT);
		if (index >= 0) {
			final int index2 = str.lastIndexOf(XpandTokens.LT + "ENDREM" + XpandTokens.RT);
			if (index2 == -1) {
				return true;
			}
			return index2 < index;
		}
		return false;
	}

	public static boolean isInDefine(final String str) {
		return !computeStack(str).isEmpty();
	}

	public static boolean isInTypeDecl(final String str) {
		Matcher m = IN_TAG_PATTERN.matcher(str);
		if (!m.find()) {
			return false;
		}
		final String tag = m.group(1);
		m = TYPEDECL_DEFINE_PATTERN1.matcher(tag);
		if (m.find()) {
			m = TYPEDECL_PARAM_PATTERN.matcher(m.group(2));
			return m.find();
		} else {
			m = TYPEDECL_DEFINE_PATTERN2.matcher(tag);
			if (m.find()) {
				return true;
			} else {
				m = TYPEDECL_TYPESELECT_PATTERN.matcher(tag);
				return m.find();
			}
		}

	}

	private static String getBlockPattern() {
		final String[] parts = new String[] { XpandTokens.DEFINE, XpandTokens.AROUND, XpandTokens.FOREACH, XpandTokens.LET, XpandTokens.IF, XpandTokens.FILE, XpandTokens.PROTECT };
		final StringBuffer buff = new StringBuffer();
		for (int i = 0; i < parts.length; i++) {
			final String part = parts[i];
			buff.append(XpandTokens.LT).append("\\s*").append(part);
			buff.append("|");
			buff.append(XpandTokens.LT).append("\\s*").append("END").append(part);
			if (i < parts.length - 1) {
				buff.append("|");
			}
		}
		return buff.toString();
	}

	public final static List<String> findImports(final String template) {
		final Matcher m = IMPORT_PATTERN.matcher(template);
		final List<String> result = new ArrayList<String>();
		while (m.find()) {
			result.add(m.group(1));
		}
		return result;
	}

	public final static List<String> findExtensions(final String template) {
		final Matcher m = EXTENSION_PATTERN.matcher(template);
		final List<String> result = new ArrayList<String>();
		while (m.find()) {
			result.add(m.group(1));
		}
		return result;
	}

	public final static Stack<StackElement> computeStack(String templatePart) {

		int start = templatePart.lastIndexOf(XpandTokens.ENDDEFINE);
		final int start1 = templatePart.lastIndexOf(XpandTokens.ENDAROUND);
		if (start1 > start) {
			start = start1;
		}
		if (start > 0) {
			templatePart = templatePart.substring(start);
		}

		final Stack<StackElement> stack = new Stack<StackElement>();

		final Matcher matcher = BLOCK_PATTERN.matcher(templatePart);
		while (matcher.find()) {
			final String txt = matcher.group();
			// handle variable scope
			if (txt.endsWith(XpandTokens.ENDFOREACH)) {
				stack.pop();
			} else if (txt.endsWith(XpandTokens.ENDLET)) {
				stack.pop();
			} else if (txt.endsWith(XpandTokens.ENDIF)) {
				stack.pop();
			} else if (txt.endsWith(XpandTokens.ENDPROTECT)) {
				stack.pop();
			} else if (txt.endsWith(XpandTokens.ENDFILE)) {
				stack.pop();
			} else if (txt.endsWith(XpandTokens.ENDDEFINE)) {
				stack.pop();
			} else if (txt.endsWith(XpandTokens.ENDAROUND)) {
				stack.pop();

			} else if (txt.endsWith(XpandTokens.DEFINE) || txt.endsWith(XpandTokens.AROUND)) {
				final StackElement se = new StackElement();
				if (txt.endsWith(XpandTokens.AROUND)) {
					se.block = XpandTokens.AROUND;
				} else {
					se.block = XpandTokens.DEFINE;
				}
				Matcher m = DEFINE_PATTERN.matcher(templatePart.substring(matcher.start()));
				if (m.find()) {
					LazyVar ctx = new LazyVar();
					ctx.typeName = m.group(6).trim();
					ctx.name = ExecutionContext.IMPLICIT_VARIABLE;
					se.variables.put(ctx.name, ctx);

					final String params = m.group(5);
					if ((params != null) && !"".equals(params.trim())) {
						final StringTokenizer st = new StringTokenizer(params, ",");
						while (st.hasMoreTokens()) {
							final String param = st.nextToken();
							m = PARAM_PATTERN.matcher(param);
							m.find();
							ctx = new LazyVar();
							ctx.typeName = m.group(1).trim();
							ctx.name = m.group(2).trim();
							se.variables.put(ctx.name, ctx);
						}
					}
					if (se.block.equals(XpandTokens.AROUND)) {
						ctx = new LazyVar();
						ctx.typeName = BuiltinMetaModel.DEFINITION_TYPE.getName();
						ctx.name = Advice.DEF_VAR_NAME;
						se.variables.put(ctx.name, ctx);
					}
					stack.push(se);
				}
			} else if (txt.endsWith(XpandTokens.FOREACH)) {
				final StackElement se = new StackElement();
				se.block = XpandTokens.FOREACH;
				final Matcher m = FOREACH_PATTERN.matcher(templatePart.substring(matcher.start()));
				if (m.find()) {
					LazyVar ctx = new LazyVar();
					ctx.expression = m.group(1);
					ctx.name = m.group(2);
					ctx.forEach = true;
					se.variables.put(ctx.name, ctx);
					stack.push(se);

					if (m.group(3) != null) {
						ctx = new LazyVar();
						ctx.typeName = BuiltinMetaModel.ITERATOR_TYPE.getName();
						ctx.name = m.group(4);
						se.variables.put(ctx.name, ctx);
					}
				}

			} else if (txt.endsWith(XpandTokens.LET)) {
				final StackElement se = new StackElement();
				se.block = XpandTokens.LET;
				final Matcher m = LET_PATTERN.matcher(templatePart.substring(matcher.start()));
				if (m.find()) {
					final LazyVar ctx = new LazyVar();
					ctx.expression = m.group(1);
					ctx.name = m.group(2);
					se.variables.put(ctx.name, ctx);
					stack.push(se);
				}
			} else if (txt.endsWith(XpandTokens.IF)) {
				final StackElement se = new StackElement();
				se.block = XpandTokens.IF;
				stack.push(se);
			} else if (txt.endsWith(XpandTokens.PROTECT)) {
				final StackElement se = new StackElement();
				se.block = XpandTokens.PROTECT;
				stack.push(se);
			} else if (txt.endsWith(XpandTokens.FILE)) {
				final StackElement se = new StackElement();
				se.block = XpandTokens.FILE;
				stack.push(se);
			}
		}
		return stack;
	}

	protected static boolean isInExtensionImport(final String s) {
		final Matcher m = INCOMPLETE_EXTENSION_PATTERN.matcher(s);
		return m.find();
	}

	protected static boolean isInImport(final String s) {
		final Matcher m = INCOMPLETE_IMPORT_PATTERN.matcher(s);
		return m.find();
	}

	public final static XpandPartition computePartition(final String str) {
		if (!isInTag(str)) {
			return XpandPartition.DEFAULT;
		}

		if (isInComment(str)) {
			return XpandPartition.COMMENT;
		}

		if (isInExpand(str)) {
			return XpandPartition.EXPAND_STATEMENT;
		}

		if (isInImport(str)) {
			return XpandPartition.NAMESPACE_IMPORT;
		}

		if (isInExtensionImport(str)) {
			return XpandPartition.EXTENSION_IMPORT;
		}

		if (isInTypeDecl(str)) {
			return XpandPartition.TYPE_DECLARATION;
		}

		return XpandPartition.EXPRESSION;
	}

	public final static XpandExecutionContext computeExecutionContext(final String str, XpandExecutionContext ctx, final XpandDefinition[] definitions) {
		final XpandPartition p = computePartition(str);
		if (p != XpandPartition.TYPE_DECLARATION && p != XpandPartition.EXPRESSION) {
			return ctx;
		}
		final List<String> imports = findImports(str);
		final List<String> extensions = findExtensions(str);
		// XXX what's the goal having this fake resource???
		final XpandResource tpl = new XpandResource() {

			public XpandDefinition[] getDefinitions() {
				return definitions;
			}

			public String getFullyQualifiedName() {
				throw new UnsupportedOperationException();
			}

			public String[] getImportedNamespaces() {
				return imports.toArray(new String[imports.size()]);
			}
			
			public String[] getImportedExtensions() {
				return extensions.toArray(new String[extensions.size()]);
			}

			public void analyze(XpandExecutionContext ctx, Set<AnalysationIssue> issues) {
			}

			public XpandAdvice[] getAdvices() {
				return new XpandAdvice[0];
			}
		};

		ctx = ctx.cloneWithResource(tpl);

		final Stack<StackElement> s = computeStack(str);

		for (StackElement element : s) {
			final Collection<LazyVar> vars = element.variables.values();
			for (LazyVar v : vars) {
				EClassifier vType = null;
				if (v.typeName != null) {
					vType = ctx.getTypeForName(v.typeName);
				} else {
					vType = new ExpressionFacade(ctx).analyze(v.expression, new HashSet<AnalysationIssue>());
					if (v.forEach) {
						if (BuiltinMetaModel.isParameterizedType(vType)) {
							vType = BuiltinMetaModel.getInnerType(vType);
						} else {
							vType = null; // EJavaObject, as it's in
											// similar code snippets out
											// there?
						}
					}
				}
				ctx = ctx.cloneWithVariable(new Variable(v.name, vType));
			}
		}
		return ctx;
	}

	public static boolean isInTag(final String str) {
		return IN_TAG_PATTERN.matcher(str).find();
	}

}
