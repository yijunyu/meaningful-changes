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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.EvaluationException;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;

public class ConstructorCallExpression extends Expression {

    private Identifier type;

    public ConstructorCallExpression(final int i, final int end, final int j, final Identifier type) {
        super(i, end, j);
        this.type = type;
    }

    @Override
    protected Object evaluateInternal(final ExecutionContext ctx) {
        final EClassifier t = ctx.getTypeForName(type.getValue());
        if (t != null) {
			return BuiltinMetaModel.newInstance(t);
		} else {
			throw new EvaluationException("Couldn't find type " + type, this);
		}
    }

    public EClassifier analyze(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        final EClassifier t = ctx.getTypeForName(type.getValue());
        if (t == null) {
            issues.add(new AnalysationIssue(AnalysationIssue.Type.TYPE_NOT_FOUND, "Type not found : " + type, type));
            return null;
        }
        if (t instanceof EEnum) {
        	issues.add(new AnalysationIssue(AnalysationIssue.Type.INCOMPATIBLE_TYPES, "Can't instantiate enum " + type, type));
        	return null;
        }
        if ((t instanceof EClass) && (((EClass) t).isAbstract() || ((EClass) t).isInterface())) {
        	issues.add(new AnalysationIssue(AnalysationIssue.Type.INCOMPATIBLE_TYPES, "Can't instantiate abstract type " + type, type));
        	return null;
        }
        return t;
    }

}
