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
package org.eclipse.gmf.internal.xpand.expression.parser;

import java.util.List;

import org.eclipse.gmf.internal.xpand.expression.ast.BooleanLiteral;
import org.eclipse.gmf.internal.xpand.expression.ast.BooleanOperation;
import org.eclipse.gmf.internal.xpand.expression.ast.Case;
import org.eclipse.gmf.internal.xpand.expression.ast.Cast;
import org.eclipse.gmf.internal.xpand.expression.ast.ChainExpression;
import org.eclipse.gmf.internal.xpand.expression.ast.CollectionExpression;
import org.eclipse.gmf.internal.xpand.expression.ast.ConstructorCallExpression;
import org.eclipse.gmf.internal.xpand.expression.ast.DeclaredParameter;
import org.eclipse.gmf.internal.xpand.expression.ast.Expression;
import org.eclipse.gmf.internal.xpand.expression.ast.FeatureCall;
import org.eclipse.gmf.internal.xpand.expression.ast.Identifier;
import org.eclipse.gmf.internal.xpand.expression.ast.IfExpression;
import org.eclipse.gmf.internal.xpand.expression.ast.IntegerLiteral;
import org.eclipse.gmf.internal.xpand.expression.ast.LetExpression;
import org.eclipse.gmf.internal.xpand.expression.ast.ListLiteral;
import org.eclipse.gmf.internal.xpand.expression.ast.NullLiteral;
import org.eclipse.gmf.internal.xpand.expression.ast.OperationCall;
import org.eclipse.gmf.internal.xpand.expression.ast.RealLiteral;
import org.eclipse.gmf.internal.xpand.expression.ast.StringLiteral;
import org.eclipse.gmf.internal.xpand.expression.ast.SwitchExpression;
import org.eclipse.gmf.internal.xpand.expression.ast.SyntaxElement;
import org.eclipse.gmf.internal.xpand.expression.ast.TypeSelectExpression;

import lpg.lpgjavaruntime.IToken;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class ExpressionFactory {

	private String fileName;

	public ExpressionFactory(final String string) {
		fileName = string;
	}

	public ExpressionFactory() {
		fileName = "nofile";
	}

	protected static int end(final IToken c) {
		return c.getEndColumn();
	}

	protected static int start(final IToken c) {
		return c.getColumn() - 1;
	}

	protected static int line(final IToken c) {
		return c.getLine();
	}

	public StringLiteral createStringLiteral(final IToken t) {
		return handle(new StringLiteral(start(t), end(t), line(t), t.toString()));
	}

	public IntegerLiteral createIntegerLiteral(final IToken t) {
		return handle(new IntegerLiteral(start(t), end(t), line(t), t.toString()));
	}

	public BooleanLiteral createBooleanLiteral(final IToken t) {
		return handle(new BooleanLiteral(start(t), end(t), line(t), t.toString()));
	}

	public NullLiteral createNullLiteral(final IToken t) {
		return handle(new NullLiteral(start(t), end(t), line(t)));
	}

	public ListLiteral createListLiteral(final IToken start, final IToken end, final List<Expression> paramExpr) {
		return handle(new ListLiteral(start(start), end(end), line(start), paramExpr.toArray(new Expression[paramExpr.size()])));
	}

	public FeatureCall createFeatureCall(final Identifier name, final Expression target) {
		return handle(new FeatureCall(name.getStart(), name.getEnd(), name.getLine(), name, target));
	}

	public Identifier createIdentifier(IToken name) {
		return new Identifier(start(name), end(name), line(name), name.toString());
	}

	public OperationCall createOperationCall(final IToken endToken, final IToken name, final Expression target, final List<Expression> parameterExpressions) {
		final int start = start(name);
		final int line = line(name);
		final int end = end(endToken);
		final Expression[] params = parameterExpressions.toArray(new Expression[parameterExpressions.size()]);
		return handle(new OperationCall(start, end, line, createIdentifier(name), target, params));
	}

	// XXX
	public OperationCall createOperationCall(final int start, final int end, final int line, final IToken name, final Expression target, final List<Expression> parameterExpressions) {
		final Expression[] params = parameterExpressions.toArray(new Expression[parameterExpressions.size()]);
		return handle(new OperationCall(start, end, line, createIdentifier(name), target, params));
	}

	public IfExpression createIf(final Expression cond, final Expression then, final Expression elseExpr) {
		final int start = cond.getStart();
		final int line = cond.getLine();
		final int end = elseExpr.getEnd();
		return handle(new IfExpression(start, end, line, cond, then, elseExpr));
	}

	public CollectionExpression createCollectionExpression(final IToken opName, final IToken endToken, final IToken elementName, final Expression closure, final Expression target) {
		return handle(new CollectionExpression(end(endToken), createIdentifier(opName), elementName == null ? null : elementName.toString(), closure, target));
	}

	public DeclaredParameter createDeclaredParameter(final Identifier type, final Identifier name) {
		return handle(new DeclaredParameter(type.getStart(), name.getEnd(), type.getLine(), type, name));
	}

	public Expression createCast(final IToken start, final Identifier t, final Expression e) {
		return handle(new Cast(start(start), e.getEnd(), line(start), t, e));
	}

	protected <T extends SyntaxElement> T handle(final T expr) {
		expr.setFileName(fileName);
		return expr;
	}

	public Case createCase(final IToken start, final Expression cond, final Expression then) {
		return handle(new Case(start(start), then.getEnd(), line(start), cond, then));
	}

	public SwitchExpression createSwitchExpression(final IToken start, final IToken end, final Expression switchExpr, final List<Case> cases, final Expression defaultExpr) {
		return handle(new SwitchExpression(start(start), end(end), line(start), switchExpr, cases, defaultExpr));
	}

	public ChainExpression createChainExpression(final Expression head, final Expression next) {
		return handle(new ChainExpression(head.getStart(), next.getEnd(), head.getLine(), head, next));
	}

	public RealLiteral createRealLiteral(final IToken token) {
		return handle(new RealLiteral(start(token), end(token), line(token), token.toString()));
	}

	public FeatureCall createTypeSelectExpression(final IToken id, final IToken c1, final Identifier ident, final Expression e) {
		return handle(new TypeSelectExpression(end(c1), createIdentifier(id), ident, e));
	}

	public BooleanOperation createBooleanOperation(final int start, final int end, final int line, final IToken name, final Expression e, final Expression r) {
		return handle(new BooleanOperation(start, end, line, name.toString(), e, r));
	}

	public LetExpression createLetExpression(final IToken start, final IToken v, final Expression varExpr, final Expression target) {
		return handle(new LetExpression(start(start), target.getEnd(), line(start), createIdentifier(v), varExpr, target));
	}

	public Expression createConstructorCall(final IToken s, final Identifier type) {
		return handle(new ConstructorCallExpression(start(s), type.getEnd(), line(s), type));
	}
}
