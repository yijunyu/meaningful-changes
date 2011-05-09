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
package org.eclipse.gmf.internal.xpand.xtend.ast;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.expression.ast.DeclaredParameter;
import org.eclipse.gmf.internal.xpand.expression.ast.Expression;
import org.eclipse.gmf.internal.xpand.expression.ast.Identifier;

public class ExpressionExtensionStatement extends Extension {

    private Expression expression;

    public ExpressionExtensionStatement(final int start, final int end, final int line, final Identifier name,
            final Identifier returnType, final List<DeclaredParameter> formalParameters, final Expression expression,
            final boolean cached, final boolean isPrivate) {
        super(start, end, line, name, returnType, formalParameters, cached, isPrivate);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    private final Stack<List<EClassifier>> analyzations = new Stack<List<EClassifier>>();

    private final Stack<List<Object>> evaluations = new Stack<List<Object>>();

    @Override
    public Object evaluateInternal(final Object[] parameters, final ExecutionContext ctx) {
        final List<Object> params = Arrays.asList(parameters);
        if (!evaluations.contains(params)) {
            evaluations.push(params);
            try {
                return evaluateInternal2(parameters, ctx);
            } finally {
                evaluations.pop();
            }
        } else {
            throw new RuntimeException("Infinite recursion in '" + toString() + "'");
        }
    }

    protected Object evaluateInternal2(final Object[] parameters, ExecutionContext ctx) {
        ctx = ctx.cloneWithoutVariables();
        ctx = ctx.cloneWithResource(file);
        final List<String> paramNames = getParameterNames();
        for (int i = 0, x = paramNames.size(); i < x; i++) {
            final String name = paramNames.get(i);
            ctx = ctx.cloneWithVariable(new Variable(name, parameters[i]));
        }
        return expression.evaluate(ctx);
    }

    @Override
    public void analyzeInternal(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        expression.analyze(ctx, issues);
    }

    @Override
    protected EClassifier internalGetReturnType(final EClassifier[] parameters, final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        if (getReturnTypeIdentifier() != null) {
			return ctx.getTypeForName(getReturnTypeIdentifier().getValue());
		}
        if ((parameters == null) || (parameters.length != getParameterNames().size())) {
			return null;
		}
        final List<EClassifier> params = Arrays.asList(parameters);
        if (!analyzations.contains(params)) {
            analyzations.push(params);
            try {
                return analyzeInternal(parameters, ctx, issues);
            } finally {
                analyzations.pop();
            }
        } else {
            if (returnType == null) {
                issues.add(new AnalysationIssue(AnalysationIssue.INTERNAL_ERROR,
                        "Recursive extensions need to have a return type specified!", this));
                return null;
            }
            return ctx.getTypeForName(returnType.getValue());
        }
    }

    protected EClassifier analyzeInternal(final EClassifier[] parameters, ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        ctx = ctx.cloneWithoutVariables();
        ctx = ctx.cloneWithResource(file);
        final List<String> paramNames = getParameterNames();
        for (int i = 0, x = paramNames.size(); i < x; i++) {
            final String name = paramNames.get(i);
            final EClassifier t = parameters[i];
            ctx = ctx.cloneWithVariable(new Variable(name, t));
        }
        return expression.analyze(ctx, issues);
    }
}
