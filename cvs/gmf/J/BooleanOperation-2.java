/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.expression.ast;

import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.EvaluationException;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;

public class BooleanOperation extends Expression {

	private static final String IMPLIES = "implies";

	private static final String OR = "||";

	private static final String AND = "&&";

	private String operator;

	private Expression left;

	private Expression right;

	public BooleanOperation(final int start, final int end, final int line, final String operator, final Expression e, final Expression r) {
		super(start, end, line);
		assert operator != null;
		this.operator = operator;
		left = e;
		right = r;
	}

	@Override
	protected Object evaluateInternal(final ExecutionContext ctx) {
		final Boolean l = evaluateToBoolean(left, ctx);
		if (l == null) {
			return null;
		}
		if (operator.equals(AND)) {
			if (!l.booleanValue()) {
				return Boolean.FALSE;
			}
			final Boolean r = evaluateToBoolean(right, ctx);
			if (r == null) {
				return null;
			}
			return Boolean.valueOf(l.booleanValue() && r.booleanValue());
		} else if (operator.equals(OR)) {
			if (l.booleanValue()) {
				return Boolean.TRUE;
			}

			final Boolean r = evaluateToBoolean(right, ctx);
			if (r == null) {
				return null;
			}
			return Boolean.valueOf(l.booleanValue() || r.booleanValue());
		} else if (operator.equals(IMPLIES)) {
			if (!l.booleanValue()) {
				return Boolean.TRUE;
			}
			return evaluateToBoolean(right, ctx);
		} else {
			throw new EvaluationException("Unkown Boolean operator " + operator, this);
		}
	}

	private Boolean evaluateToBoolean(final Expression expr, final ExecutionContext ctx) {
		final Object l = expr.evaluate(ctx);
		if (l == null) {
			return null;
		}
		if (!(l instanceof Boolean)) {
			final EClassifier t = BuiltinMetaModel.getType(l);
			throw new EvaluationException("Boolean expected but was " + t.getName(), expr);
		}
		return (Boolean) l;
	}

	public EClassifier analyze(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
		final EClassifier l = left.analyze(ctx, issues);
		final EClassifier r = right.analyze(ctx, issues);
		if ((l == null) || (r == null)) {
			return null;
		}

		final EDataType dt = EcorePackage.eINSTANCE.getEBoolean();
		if (!dt.equals(l)) {
			issues.add(new AnalysationIssue(AnalysationIssue.INCOMPATIBLE_TYPES, "Boolean expected! Found : " + l.getName(), left));
		}
		if (!dt.equals(r)) {
			issues.add(new AnalysationIssue(AnalysationIssue.INCOMPATIBLE_TYPES, "Boolean expected! Found : " + r.getName(), right));
		}

		return dt;
	}

}
