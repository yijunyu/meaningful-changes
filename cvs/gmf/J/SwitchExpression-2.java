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

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class SwitchExpression extends Expression {

    private Expression switchExpr = null;

    private Expression defaultExpr = null;

    private List<Case> cases = null;

    public SwitchExpression(final int start, final int end, final int line, final Expression switchExpr,
            final List<Case> cases, final Expression defaultExpr) {
        super(start, end, line);
        this.switchExpr = switchExpr;
        this.cases = cases;
        this.defaultExpr = defaultExpr;
    }

    @Override
    protected Object evaluateInternal(final ExecutionContext ctx) {
        Object switchVal = Boolean.TRUE;
        if (switchExpr != null) {
			switchVal = switchExpr.evaluate(ctx);
		}
        for (Case c : cases) {
            final Object caseCondVal = c.getCondition().evaluate(ctx);
            if (((switchVal != null) && switchVal.equals(caseCondVal)) || (switchVal == caseCondVal)) {
				return c.getThenPart().evaluate(ctx);
			}
        }
        return defaultExpr.evaluate(ctx);
    }

    public EClassifier analyze(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        EClassifier condEClassifier = EcorePackage.eINSTANCE.getEBoolean();
        if (switchExpr != null) {
			condEClassifier = switchExpr.analyze(ctx, issues);
		}
        if (condEClassifier == null) {
			return null;
		}
        EClassifier returnEClassifier = defaultExpr.analyze(ctx, issues);
        if (returnEClassifier == null) {
			return null;
		}
        for (Case c : cases) {
            final EClassifier caseCondEClassifier = c.getCondition().analyze(ctx, issues);
            if (caseCondEClassifier != null) {
                if (!BuiltinMetaModel.isAssignableFrom(condEClassifier, caseCondEClassifier)) {
                    issues.add(new AnalysationIssue(AnalysationIssue.INCOMPATIBLE_TYPES, condEClassifier.getName()
                            + " expected!", c.getCondition()));
                }
            }
            final EClassifier caseThenEClassifier = c.getThenPart().analyze(ctx, issues);
            if (caseThenEClassifier != null) {
                if (!BuiltinMetaModel.isAssignableFrom(returnEClassifier, caseThenEClassifier)) {
                    if (BuiltinMetaModel.isAssignableFrom(caseThenEClassifier, returnEClassifier)) {
                        returnEClassifier = caseThenEClassifier;
                    } else {
                        returnEClassifier = EcorePackage.eINSTANCE.getEJavaObject();
                    }
                }
            }
        }
        return returnEClassifier;
    }

    public List<Case> getCases() {
    	if (cases == null) {
    		return Collections.emptyList();
    	}
        return cases;
    }

    public Expression getDefaultExpr() {
        return defaultExpr;
    }

    public Expression getSwitchExpr() {
        return switchExpr;
    }
}
