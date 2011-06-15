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
package org.eclipse.gmf.internal.xpand.expression;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.xpand.expression.ast.Expression;
import org.eclipse.gmf.internal.xpand.expression.parser.ExpressionLexer;
import org.eclipse.gmf.internal.xpand.expression.parser.ExpressionParser;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class ExpressionFacade {

    private ExecutionContext execContext;

    public ExecutionContext getExecContext() {
        return execContext;
    }

    public ExpressionFacade(final ExecutionContext execCtx) {
        execContext = execCtx;
    }

    public EClassifier analyze(final String expression, final Set<AnalysationIssue> issues) {
        final Expression expr = parse(expression);
        return expr.analyze(execContext, issues);
    }

    public Object evaluate(final String expression) {
    	final Map<String, ?> context = Collections.emptyMap();
        return evaluate(expression, context);
    }

    public Object evaluate(final String expression, final Map<String, ?> context) {
        final Expression expr = parse(expression);
        ExecutionContext ctx = execContext;
        for (String key : context.keySet()) {
            final Variable v = new Variable(key, context.get(key));
            ctx = ctx.cloneWithVariable(v);
        }
        return expr.evaluate(ctx);
    }

    private Expression parse(final String expression) {
        final ExpressionLexer scanner = new ExpressionLexer(expression.toCharArray(), "nofile");
        final ExpressionParser parser = new ExpressionParser(scanner);
        scanner.lexer(parser);
        return parser.parser();
    }
}
