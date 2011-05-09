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
package org.eclipse.gmf.internal.xpand.parser;

import java.util.List;

import lpg.lpgjavaruntime.IToken;

import org.eclipse.gmf.internal.xpand.ast.Advice;
import org.eclipse.gmf.internal.xpand.ast.Definition;
import org.eclipse.gmf.internal.xpand.ast.ErrorStatement;
import org.eclipse.gmf.internal.xpand.ast.ExpandStatement;
import org.eclipse.gmf.internal.xpand.ast.ExpressionStatement;
import org.eclipse.gmf.internal.xpand.ast.FileStatement;
import org.eclipse.gmf.internal.xpand.ast.ForEachStatement;
import org.eclipse.gmf.internal.xpand.ast.IfStatement;
import org.eclipse.gmf.internal.xpand.ast.ImportDeclaration;
import org.eclipse.gmf.internal.xpand.ast.LetStatement;
import org.eclipse.gmf.internal.xpand.ast.NamespaceImport;
import org.eclipse.gmf.internal.xpand.ast.ProtectStatement;
import org.eclipse.gmf.internal.xpand.ast.Statement;
import org.eclipse.gmf.internal.xpand.ast.Template;
import org.eclipse.gmf.internal.xpand.ast.TextStatement;
import org.eclipse.gmf.internal.xpand.expression.ast.DeclaredParameter;
import org.eclipse.gmf.internal.xpand.expression.ast.Expression;
import org.eclipse.gmf.internal.xpand.expression.ast.Identifier;
import org.eclipse.gmf.internal.xpand.expression.ast.StringLiteral;
import org.eclipse.gmf.internal.xpand.expression.ast.SyntaxElement;
import org.eclipse.gmf.internal.xpand.expression.parser.ExpressionFactory;

/**
 * @author Sven Efftinge
 */
public class XpandFactory extends ExpressionFactory {

	public XpandFactory(final String fileName) {
		super(fileName);
	}

	public Template createTemplate(final List<NamespaceImport> imports, final List<ImportDeclaration> extensions, final List<Definition> defines, final List<Advice> advices, final IToken eof) {
		final NamespaceImport[] i = imports.toArray(new NamespaceImport[imports.size()]);
		final ImportDeclaration[] ext = extensions.toArray(new ImportDeclaration[extensions.size()]);

		final Definition[] d = defines.toArray(new Definition[defines.size()]);
		final Advice[] a = advices.toArray(new Advice[advices.size()]);
		final Template t = new Template(0, end(eof), 0, i, ext, d, a);
		return handle(t);
	}

	public Definition createDefinition(final IToken startToken, final IToken endToken, final IToken n, final List<SyntaxElement> p, final Identifier type, final List<SyntaxElement> s) {
		final int start = start(startToken);
		final int end = end(endToken);
		final int line = line(startToken);
		final Identifier name = createIdentifier(n);
		final DeclaredParameter[] params = p.toArray(new DeclaredParameter[p.size()]);
		final Statement[] body = s.toArray(new Statement[s.size()]);
		return handle(new Definition(start, end, line, name, type, params, body));
	}

	public TextStatement createTextStatement(final IToken t, final IToken m) {
		String text = t.toString();
		// XXX in fact, XpandLexer allows TEXT to be RG char only, in which case we'd get NPE here
		text = text.substring(1, text.length() - 1);
		return handle(new TextStatement(start(m != null ? m : t), end(t), line(m != null ? m : t), text, m != null));
	}

	public ForEachStatement createForEachStatement(final IToken start, final IToken end, final Expression e, final IToken v, final Expression sep, final IToken iter, final List<SyntaxElement> s) {
		final Statement[] body = s.toArray(new Statement[s.size()]);
		return handle(new ForEachStatement(start(start), end(end), line(start), createIdentifier(v), e, body, sep, iter != null ? createIdentifier(iter) : null));
	}

	public IfStatement createIfStatement(final IToken start, final Expression condition, final List<SyntaxElement> statements, final IfStatement elseIf) {
		final Statement[] body = statements.toArray(new Statement[statements.size()]);
		final int end = body[body.length - 1].getEnd();
		return handle(new IfStatement(start(start), end, line(start), condition, body, elseIf));
	}

	public LetStatement createLetStatement(final IToken start, final IToken end, final Expression e, final IToken name, final List<SyntaxElement> statements) {
		final Statement[] body = statements.toArray(new Statement[statements.size()]);
		return handle(new LetStatement(start(start), end(end), line(start), createIdentifier(name), e, body));
	}

	public ErrorStatement createErrorStatement(final IToken start, final Expression expr) {
		return handle(new ErrorStatement(start(start), expr.getEnd(), line(start), expr));
	}

	public ExpressionStatement createExpressionStatement(final Expression e) {
		return handle(new ExpressionStatement(e.getStart(), e.getEnd(), e.getLine(), e));
	}

	public FileStatement createFileStatement(final IToken start, final IToken end, final Expression fileName, final Identifier option, final List<SyntaxElement> statements) {
		final Statement[] body = statements.toArray(new Statement[statements.size()]);
		return handle(new FileStatement(start(start), end(end), line(start), fileName, body, option));
	}

	// FIXME disabled as token - no reason, just true/false 
	public ProtectStatement createProtectStatement(final IToken start, final IToken end, final Expression startC, final Expression endC, final Expression id, final IToken disabled, final List<SyntaxElement> statements) {
		final Statement[] body = statements.toArray(new Statement[statements.size()]);
		return handle(new ProtectStatement(start(start), end(end), line(start), startC, endC, body, id, disabled != null));
	}

	public ExpandStatement createExpandStatement(final IToken start, final Identifier definition, final List<Expression> parameters, final Expression target, final boolean foreach, final Expression sep) {
		final Expression[] params = parameters.toArray(new Expression[parameters.size()]);
		int end = definition.getEnd();
		if (sep != null) {
			end = sep.getEnd();
		} else if (target != null) {
			end = target.getEnd();
		} else if (params.length > 0) {
			end = params[params.length - 1].getEnd();
		}
		return handle(new ExpandStatement(start(start), end, line(start), definition, target, sep, params, foreach));
	}

	public NamespaceImport createNamespaceImport(IToken start, StringLiteral namespace) {
		return handle(new NamespaceImport(start(start), namespace.getEnd(), line(start), namespace));
	}

	public ImportDeclaration createImportDeclaration(final IToken start, final Identifier namespace) {
		return handle(new ImportDeclaration(start(start), namespace.getEnd(), line(start), namespace));
	}

	public Advice createAround(final IToken start, final IToken end, final Identifier n, final List<SyntaxElement> p, final boolean wildparams, final Identifier t, final List<SyntaxElement> s) {
		final DeclaredParameter[] params = p.toArray(new DeclaredParameter[p.size()]);
		final Statement[] body = s.toArray(new Statement[s.size()]);
		final Advice a = new Advice(start(start), end(end), line(start), n, t, params, wildparams, body);
		return handle(a);
	}

}
