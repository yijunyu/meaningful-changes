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
package org.eclipse.gmf.internal.xpand.ast;

import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.EvaluationException;
import org.eclipse.gmf.internal.xpand.expression.ast.Expression;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;

/**
 * @author Sven Efftinge
 */
public class IfStatement extends Statement {

    private final Expression condition;

    private final Statement[] thenPart;

    private IfStatement elseIf;

    public IfStatement(final int start, final int end, final int line, final Expression condition,
            final Statement[] thenPart, final IfStatement elseIf) {
        super(start, end, line);
        this.condition = condition;
        this.thenPart = thenPart;
        this.elseIf = elseIf;
    }

    public Expression getCondition() {
        return condition;
    }

    public IfStatement getElseIf() {
        return elseIf;
    }

    // XXX modifiable AST
    public void setElseIf(final IfStatement elseIf) {
        this.elseIf = elseIf;
    }

    public Statement[] getThenPart() {
        return thenPart;
    }

    public void analyze(final XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
        if (condition != null) {
            final EClassifier conType = getCondition().analyze(ctx, issues);
            if ((conType != null) && !BuiltinMetaModel.isAssignableFrom(EcorePackage.eINSTANCE.getEBoolean(), conType)) {
                issues.add(new AnalysationIssue(AnalysationIssue.Type.INCOMPATIBLE_TYPES, "Boolean expected!",
                        getCondition()));
            }
        }
        for (int i = 0; i < getThenPart().length; i++) {
            getThenPart()[i].analyze(ctx, issues);
        }
        if (getElseIf() != null) {
            getElseIf().analyze(ctx, issues);
        }
    }

    @Override
    public void evaluateInternal(final XpandExecutionContext ctx) {
        if (condition != null) {
            final Object result = getCondition().evaluate(ctx);
            if (result == null) {
				throw new EvaluationException("Nullevaluation!", getCondition());
			}
            if (!(result instanceof Boolean)) {
				throw new EvaluationException("Boolean expected!", getCondition());
			}
            if (((Boolean) result).booleanValue()) {
                for (int i = 0; i < getThenPart().length; i++) {
                    getThenPart()[i].evaluate(ctx);
                }
            } else if (getElseIf() != null) {
                getElseIf().evaluate(ctx);
            }
        } else {
            for (int i = 0; i < getThenPart().length; i++) {
                getThenPart()[i].evaluate(ctx);
            }
        }
    }

}
