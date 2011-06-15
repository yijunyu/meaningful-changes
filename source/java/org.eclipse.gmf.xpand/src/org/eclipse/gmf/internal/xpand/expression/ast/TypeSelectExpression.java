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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.EvaluationException;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.Variable;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class TypeSelectExpression extends FeatureCall {

    private Identifier typeLiteral;

    public TypeSelectExpression(final int end, final Identifier opName, final Identifier typeLiteral,
            final Expression target) {
        super(opName.getStart(), end, opName.getLine(), opName, target);
        this.typeLiteral = typeLiteral;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + typeLiteral + ")";
    }

    @Override
    public Object evaluateInternal(final ExecutionContext ctx) {
        Object targetObj = null;
        if (getTarget() == null) {
            final Variable v = ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE);
            if (v != null) {
				targetObj = v.getValue();
			}
        } else {
            targetObj = getTarget().evaluate(ctx);
        }
        if (targetObj == null) {
			return null;
		}
        if (!(targetObj instanceof Collection)) {

        }

        return executeTypeSelect((Collection) targetObj, ctx);
    }

    private Object executeTypeSelect(final Collection collection, final ExecutionContext ctx) {
        final Collection<Object> resultCol = new ArrayList<Object>();
        final EClassifier t = ctx.getTypeForName(typeLiteral.getValue());
        if (t == null) {
            throw new EvaluationException("Unkown type '" + typeLiteral + "'", typeLiteral);
        }
        for (final Iterator iter = collection.iterator(); iter.hasNext();) {
            final Object ele = iter.next();
            if ((ele!=null) && BuiltinMetaModel.isAssignableFrom(t, BuiltinMetaModel.getType(ele))) {
                resultCol.add(ele);
            }
        }
        return resultCol;
    }

    @Override
    public EClassifier analyze(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        EClassifier targetType = null;
        if (getTarget() == null) {
            final Variable v = ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE);
            if (v != null) {
				targetType = (EClassifier) v.getValue();
			}
        } else {
            targetType = getTarget().analyze(ctx, issues);
        }
        if (targetType == null) {
			return null;
		}

        if (!BuiltinMetaModel.isParameterizedType(targetType)) {
            issues.add(new AnalysationIssue(AnalysationIssue.Type.INCOMPATIBLE_TYPES, "Collection type expected! was : "
                    + targetType, getTarget()));
            return null;
        }

        final EClassifier closureEClassifier = ctx.getTypeForName(typeLiteral.getValue());
        if (closureEClassifier == null) {
            issues.add(new AnalysationIssue(AnalysationIssue.Type.TYPE_NOT_FOUND, "Couldn't find type " + typeLiteral,
                    typeLiteral));
            return null;
        }

        return BuiltinMetaModel.getListType(closureEClassifier);
    }

}
