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
package org.eclipse.gmf.internal.xpand.expression.ast;

import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.EvaluationException;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class IfExpression extends Expression {

    private Expression condition;

    private Expression thenPart;

    private Expression elsePart;

    public IfExpression(final int start, final int end, final int line, final Expression condition,
            final Expression thenPart, final Expression elsePart) {
        super(start, end, line);
        this.condition = condition;
        this.thenPart = thenPart;
        this.elsePart = elsePart;
    }

    public Expression getCondition() {
        return condition;
    }

    public Expression getElsePart() {
        return elsePart;
    }

    public Expression getThenPart() {
        return thenPart;
    }

    @Override
    public Object evaluateInternal(final ExecutionContext ctx) {
        final Object val = getCondition().evaluate(ctx);
        if (!(val instanceof Boolean)) {
			throw new EvaluationException("Boolean expected!", getCondition());
		}

        if (((Boolean) val).booleanValue()) {
			return getThenPart().evaluate(ctx);
		} else {
			return getElsePart().evaluate(ctx);
		}
    }

    public EClassifier analyze(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        final EClassifier conditionEClassifier = getCondition().analyze(ctx, issues);
        if ((conditionEClassifier != null) && !conditionEClassifier.equals(EcorePackage.eINSTANCE.getEBoolean())) {
            issues.add(new AnalysationIssue(AnalysationIssue.Type.INCOMPATIBLE_TYPES, "Boolean expected", getCondition()));
        }

        final EClassifier thenPartEClassifier = getThenPart().analyze(ctx, issues);
        final EClassifier elsePartEClassifier = getElsePart().analyze(ctx, issues);
        if ((thenPartEClassifier == null) || (elsePartEClassifier == null)) {
			return null;
		}
        if (BuiltinMetaModel.isAssignableFrom(thenPartEClassifier, elsePartEClassifier)) {
			return elsePartEClassifier;
		} else if (BuiltinMetaModel.isAssignableFrom(elsePartEClassifier, thenPartEClassifier)) {
			return thenPartEClassifier;
		} else {
			return EcorePackage.eINSTANCE.getEObject();
		}
    }

    @Override
    public String toString() {
        return condition.toString() + " ? " + thenPart + ":" + elsePart;
    }
}
