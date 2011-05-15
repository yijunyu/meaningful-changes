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
package org.eclipse.gmf.internal.xpand.expression.codeassist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lpg.lpgjavaruntime.IToken;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.codeassist.LazyVar;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.ExpressionFacade;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.expression.parser.ExpressionParsersym;
import org.eclipse.gmf.internal.xpand.xtend.ast.Extension;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

public class ExpressionProposalComputer implements ProposalComputer {

	private final static Set<Integer> operators = new HashSet<Integer>();
	static {
		operators.add(ExpressionParsersym.TK_AND);
		operators.add(ExpressionParsersym.TK_DIV);
		operators.add(ExpressionParsersym.TK_DOT);
		operators.add(ExpressionParsersym.TK_EQ);
		operators.add(ExpressionParsersym.TK_GE);
		operators.add(ExpressionParsersym.TK_GT);
		operators.add(ExpressionParsersym.TK_LE);
		operators.add(ExpressionParsersym.TK_LT);
		operators.add(ExpressionParsersym.TK_MINUS);
		operators.add(ExpressionParsersym.TK_MULTI);
		operators.add(ExpressionParsersym.TK_NE);
		operators.add(ExpressionParsersym.TK_NOT);
		operators.add(ExpressionParsersym.TK_OR);
		operators.add(ExpressionParsersym.TK_PLUS);
	}

	private final static Set<Integer> stopper = new HashSet<Integer>();
	static {
		stopper.add(ExpressionParsersym.TK_LPAREN);
		stopper.add(ExpressionParsersym.TK_COLON);
		stopper.add(ExpressionParsersym.TK_QUESTION_MARK);
		stopper.add(ExpressionParsersym.TK_BAR);
		stopper.add(ExpressionParsersym.TK_LCURLY);
		stopper.add(ExpressionParsersym.TK_COMMA);
	}

	private final static Set<Integer> methodNames = new HashSet<Integer>();
	static {
		methodNames.add(ExpressionParsersym.TK_IDENT);
		methodNames.add(ExpressionParsersym.TK_collect);
		methodNames.add(ExpressionParsersym.TK_exists);
		methodNames.add(ExpressionParsersym.TK_notExists);
		methodNames.add(ExpressionParsersym.TK_forAll);
		methodNames.add(ExpressionParsersym.TK_reject);
		methodNames.add(ExpressionParsersym.TK_select);
		methodNames.add(ExpressionParsersym.TK_typeSelect);
	}

	private final static Set<Integer> operands = new HashSet<Integer>();
	static {
		operands.add(ExpressionParsersym.TK_IDENT);
		operands.add(ExpressionParsersym.TK_collect);
		operands.add(ExpressionParsersym.TK_exists);
		operands.add(ExpressionParsersym.TK_notExists);
		operands.add(ExpressionParsersym.TK_false);
		operands.add(ExpressionParsersym.TK_forAll);
		operands.add(ExpressionParsersym.TK_null);
		operands.add(ExpressionParsersym.TK_reject);
		operands.add(ExpressionParsersym.TK_select);
		operands.add(ExpressionParsersym.TK_true);
		operands.add(ExpressionParsersym.TK_typeSelect);
		operands.add(ExpressionParsersym.TK_INT_CONST);
		operands.add(ExpressionParsersym.TK_REAL_CONST);
		operands.add(ExpressionParsersym.TK_STRING);
	}

	private final static Map<Integer, Integer> blockTokens = new HashMap<Integer, Integer>();

	static {
		blockTokens.put(ExpressionParsersym.TK_LPAREN, ExpressionParsersym.TK_RPAREN);
		blockTokens.put(ExpressionParsersym.TK_LCURLY, ExpressionParsersym.TK_RCURLY);
	}

	private ExecutionContext executionContext;

	private ProposalFactory proposalFactory;

	public ExpressionProposalComputer() {
	}

	/**
	 * @param ctx
	 * @return
	 */
	public List<ICompletionProposal> computeProposals(final String txt, final ExecutionContext context, final ProposalFactory factory) {
		this.proposalFactory = factory;
		try {
			final String[] s = computePrefixAndTargetExpression(txt);
			final String prefix = s[0];
			final String expressionString = s[1];
			this.executionContext = computeExecutionContext(txt, context);
			final List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal>();

			if ((prefix.length() > 0) && (expressionString == null)) {
				proposals.addAll(new TypeProposalComputer().computeProposals(txt, executionContext, factory));
			}

			EClassifier targetType = null;
			if (expressionString != null) {
				final Set<AnalysationIssue> issues = new HashSet<AnalysationIssue>();
				targetType = new ExpressionFacade(executionContext).analyze(expressionString, issues);
				if (targetType == null) {
					return Collections.emptyList();
				}
			}
			if (targetType == null) {
				// variables
				final Map<String, Variable> vars = executionContext.getVisibleVariables();
				for (String varName : vars.keySet()) {
					if (varName.toLowerCase().startsWith(prefix.toLowerCase())) {
						final Object o = executionContext.getVariable(varName).getValue();
						proposals.add(factory.createVariableProposal(varName, (EClassifier) o, prefix));
					}
				}
				// members and extensions on this
				final Variable v = executionContext.getVariable(ExecutionContext.IMPLICIT_VARIABLE);
				if (v != null) {
					targetType = (EClassifier) v.getValue();
					proposals.addAll(getAllMemberProposals(targetType, prefix));
				}

				final Set<? extends Extension> exts = executionContext.getAllExtensions();
				for (Extension extension : exts) {
					if (extension.getName().toLowerCase().startsWith(prefix.toLowerCase())) {
						proposals.add(factory.createExtensionProposal(extension, prefix));
					}
				}
			} else {
				// members and extensions on targetType
				proposals.addAll(getAllMemberProposals(targetType, prefix));
			}
			return proposals;
		} finally {
			proposalFactory = null;
			executionContext = null;
		}
	}

	private final static Pattern COL_OP = Pattern.compile("((select|collect|exists|notExists|reject|forEach)\\s*\\(\\s*(\\w+)\\s*\\|)|(\\()|(\\))");

	private final static Pattern LET = Pattern.compile(".*let\\s*(\\w+)\\s*=\\s*([^:]+):([^:]*)");

	protected final static ExecutionContext computeExecutionContext(final String txt, ExecutionContext ctx) {
		final Stack<LazyVar> vars = new Stack<LazyVar>();
		Matcher m = LET.matcher(txt);
		while (m.find()) {
			final LazyVar v = new LazyVar();
			v.name = m.group(1);
			v.forEach = false;
			v.expression = m.group(2).trim();
			vars.push(v);
		}
		m = COL_OP.matcher(txt);
		while (m.find()) {
			if (m.group(1) != null) {
				final String[] s = computePrefixAndTargetExpression(txt.substring(0, m.start()));
				final String expressionString = s[1];
				final LazyVar v = new LazyVar();
				v.name = m.group(3);
				v.forEach = true;
				v.expression = expressionString;
				vars.push(v);
			} else if (m.group(4) != null) {
				vars.push(null);
			} else if (m.group(5) != null) {
				vars.pop();
			} else {
				throw new IllegalStateException("Match:" + m.group());
			}
		}
		for (LazyVar v : vars) {
			if (v != null) {
				EClassifier targetType = null;
				final String expressionString = v.expression;
				if (expressionString == null) {
					final Variable var = ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE);
					if ((var != null) && (var.getValue() instanceof EClassifier)) {
						EClassifier value = (EClassifier) var.getValue();
						if (BuiltinMetaModel.isParameterizedType(value)) {
							targetType = BuiltinMetaModel.getInnerType(value);
						}
					}
				} else {
					targetType = new ExpressionFacade(ctx).analyze(expressionString, new HashSet<AnalysationIssue>());
					if (v.forEach) {
						if (BuiltinMetaModel.isParameterizedType(targetType)) {
							targetType = BuiltinMetaModel.getInnerType(targetType);
						} else {
							targetType = null; // XXX EJavaObject as in other
							// code snippets?
						}
					}
				}

				if (targetType != null) {
					ctx = ctx.cloneWithVariable(new Variable(v.name, targetType));
				}
			}
		}
		return ctx;
	}

	/**
	 * @param targetType
	 * @param prefix
	 * @param ctx
	 * @param factory
	 * @return
	 */
	private List<ICompletionProposal> getAllMemberProposals(EClassifier targetType, final String prefix) {
		if (targetType == null) {
			return Collections.emptyList();
		}
		final List<ICompletionProposal> result = new ArrayList<ICompletionProposal>();

		result.addAll(internalGetAllMemberProposals(targetType, prefix, false));
		if (BuiltinMetaModel.isParameterizedType(targetType)) {
			result.addAll(getAllCollectionOperations(prefix, proposalFactory));
			targetType = BuiltinMetaModel.getInnerType(targetType);
			result.addAll(internalGetAllMemberProposals(targetType, prefix, true));
		}
		return result;
	}

	private List<ICompletionProposal> internalGetAllMemberProposals(EClassifier targetType, String prefix, boolean onCollection) {
		final List<ICompletionProposal> result = new LinkedList<ICompletionProposal>();
		final String prefixLowerCase = prefix.toLowerCase();
		for (EStructuralFeature f : BuiltinMetaModel.getAllFeatures(targetType)) {
			if (f.getName().toLowerCase().startsWith(prefixLowerCase)) {
				result.add(proposalFactory.createPropertyProposal(f, prefix, onCollection));
			}
		}
		for (EOperation op : BuiltinMetaModel.getAllOperation(targetType)) {
			if (op.getName().toLowerCase().startsWith(prefixLowerCase) && Character.isJavaIdentifierStart(op.getName().charAt(0))) {
				result.add(proposalFactory.createOperationProposal(op, prefix, onCollection));
			}
		}
		for (Extension e : executionContext.getAllExtensions()) {
			if (e.getName().toLowerCase().startsWith(prefixLowerCase) && (e.getParameterTypes().size() >= 1) && BuiltinMetaModel.isAssignableFrom(e.getParameterTypes().get(0), targetType)) {
				result.add(proposalFactory.createExtensionOnMemberPositionProposal(e, prefix, onCollection));
			}
		}
		return result;
	}

	// XXX could use ExpressionParsersym.orderedTerminalSymbols[TK_xx] to get
	// values like 'select', 'reject', etc
	private static List<ICompletionProposal> getAllCollectionOperations(final String prefix, final ProposalFactory f) {
		final List<ICompletionProposal> result = new ArrayList<ICompletionProposal>();
		final String marked = "expression-with-e";

		String s = "select(e|" + marked + ")";
		if (s.startsWith(prefix)) {
			result.add(f.createCollectionSpecificOperationProposal(s, s, prefix, s.indexOf(marked), marked.length()));
		}

		s = "reject(e|" + marked + ")";
		if (s.startsWith(prefix)) {
			result.add(f.createCollectionSpecificOperationProposal(s, s, prefix, s.indexOf(marked), marked.length()));
		}

		s = "collect(e|" + marked + ")";
		if (s.startsWith(prefix)) {
			result.add(f.createCollectionSpecificOperationProposal(s, s, prefix, s.indexOf(marked), marked.length()));
		}

		s = "exists(e|" + marked + ")";
		if (s.startsWith(prefix)) {
			result.add(f.createCollectionSpecificOperationProposal(s, s, prefix, s.indexOf(marked), marked.length()));
		}

		s = "notExists(e|" + marked + ")";
		if (s.startsWith(prefix)) {
			result.add(f.createCollectionSpecificOperationProposal(s, s, prefix, s.indexOf(marked), marked.length()));
		}

		s = "forAll(e|" + marked + ")";
		if (s.startsWith(prefix)) {
			result.add(f.createCollectionSpecificOperationProposal(s, s, prefix, s.indexOf(marked), marked.length()));
		}

		s = "typeSelect(EClassifier)";
		if (s.startsWith(prefix)) {
			result.add(f.createCollectionSpecificOperationProposal(s, s, prefix, s.indexOf("EClassifier"), "EClassifier".length()));
		}

		return result;
	}

	/**
	 * @param ctx
	 * @return
	 */
	protected final static String[] computePrefixAndTargetExpression(final String str) {
		final ReverseScanner scanner = new ReverseScanner(str);
		String prefix = "";
		final String expr = null;

		IToken t = scanner.previousToken();
		if (t != null) {
			// prefix consists of identifier parts
			if (!Character.isWhitespace(str.charAt(str.length() - 1))) {
				if (Character.isJavaIdentifierStart(t.toString().charAt(0))) {
					prefix = t.toString();
					t = scanner.previousToken(); // go to operator
				}
			}

			final int exprEnd = scanner.getOffset();
			// if t is a dot there is a target expression
			if ((t != null) && (t.getKind() == ExpressionParsersym.TK_DOT)) {
				boolean lastWasOperator = true;
				boolean stop = false;
				while (!stop && ((t = scanner.previousToken()) != null)) {
					if (isOperand(t)) {
						if (lastWasOperator) {
							lastWasOperator = false;
						} else { // two operands in sequence -> stopper!
							scanner.nextToken();
							stop = true;
						}
					} else if (t.getKind() == ExpressionParsersym.TK_DOT) {
						if (!lastWasOperator) {
							lastWasOperator = true;
						} else {
							// errorneous expression
							return new String[] { prefix, expr };
						}
					} else if (isBlockCloser(t) && lastWasOperator) {
						lastWasOperator = false;
						final Stack<IToken> s = new Stack<IToken>();
						s.push(t);
						while (!s.isEmpty()) {
							final IToken temp = scanner.previousToken();
							if (temp == null) {
								return new String[] { prefix, expr };
							}
							if (temp.getKind() == t.getKind()) {
								s.push(temp);
							} else if (isOpposite(temp, t)) {
								s.pop();
							}
						}
						if (t.getKind() == ExpressionParsersym.TK_RPAREN) {
							// we have an unambigous syntax here
							// a.method(with.param)
							// but also
							// anIdentifier
							// (another.parenthesized.expressions)
							final IToken temp = scanner.previousToken();
							if (!isMethodName(temp)) {
								scanner.nextToken();
							}
						}
					} else {
						scanner.nextToken(); // go one forward
						stop = true;
					}
				}
				return new String[] { prefix, str.substring(scanner.getOffset(), exprEnd).trim() };
			}
		}
		return new String[] { prefix, expr };
	}

	private final static boolean isMethodName(final IToken temp) {
		return methodNames.contains(temp.getKind());
	}

	private final static boolean isOpposite(final IToken left, final IToken right) {
		final Integer temp = blockTokens.get(left.getKind());
		return (temp != null) && (right.getKind() == temp.intValue());
	}

	private final static boolean isBlockCloser(final IToken t) {
		return blockTokens.values().contains(t.getKind());
	}

	private final static boolean isOperand(final IToken t) {
		return operands.contains(t.getKind());
	}

}