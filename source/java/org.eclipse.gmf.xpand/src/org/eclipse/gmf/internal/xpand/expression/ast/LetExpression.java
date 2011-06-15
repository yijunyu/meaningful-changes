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
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.Variable;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class LetExpression extends Expression {

    private Expression varExpression;

    private Expression targetExpression;

    private Identifier varName;

    public LetExpression(final int start, final int end, final int line, final Identifier varName,
            final Expression varExpression, final Expression target) {
        super(start, end, line);
        this.varName = varName;
        this.varExpression = varExpression;
        targetExpression = target;
    }

    @Override
    public Object evaluateInternal(ExecutionContext ctx) {
        final Object o = varExpression.evaluate(ctx);
        ctx = ctx.cloneWithVariable(new Variable(varName.getValue(), o));
        return targetExpression.evaluate(ctx);
    }

    public EClassifier analyze(ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        final EClassifier t = varExpression.analyze(ctx, issues);
        if (t == null) {
			return null;
		}
        ctx = ctx.cloneWithVariable(new Variable(varName.getValue(), t));
        return targetExpression.analyze(ctx, issues);
    }

    @Override
    public String toString() {
        return "let " + varName + "=" + varExpression + " : " + targetExpression;
    }
}
