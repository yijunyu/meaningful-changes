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
package org.eclipse.gmf.internal.xpand;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.EvaluationException;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.model.XpandDefinition;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;
import org.eclipse.gmf.internal.xpand.model.XpandResource;

/**
 * *
 * 
 * @author Sven Efftinge *
 */
public class XpandFacade {
    private XpandExecutionContext ctx = null;

    public XpandFacade(final XpandExecutionContext ctx) {
        this.ctx = ctx;
    }

    public void evaluate(final String definitionName, final Object targetObject, Object[] params) {
        params = params == null ? new Object[0] : params;
        final EClassifier targetType = BuiltinMetaModel.getType(targetObject);
        final EClassifier[] paramTypes = new EClassifier[params.length];
        for (int i = 0; i < paramTypes.length; i++) {
            paramTypes[i] = BuiltinMetaModel.getType(params[i]);
        }

        final XpandDefinition def = ctx.findDefinition(definitionName, targetType, paramTypes);
        if (def == null)
            throw new EvaluationException("No Definition " + definitionName + getParamString(paramTypes) + " for "
                    + targetType.getName() + " could be found!", null);

        ctx = (XpandExecutionContext) ctx.cloneWithVariable(new Variable(ExecutionContext.IMPLICIT_VARIABLE,
                targetObject));
        for (int i = 0; i < params.length; i++) {
            final Variable v = new Variable(def.getParams()[i].getName().getValue(), params[i]);
            ctx = (XpandExecutionContext) ctx.cloneWithVariable(v);
        }
        ctx = (XpandExecutionContext) ctx.cloneWithResource(def.getOwner());
        def.evaluate(ctx);
    }

    private String getParamString(final EClassifier[] paramTypes) {
        if (paramTypes.length == 0)
            return "";
        final StringBuffer buff = new StringBuffer("(");
        for (int i = 0; i < paramTypes.length; i++) {
            final EClassifier t = paramTypes[i];
            buff.append(t.getName());
            if (i + 1 < paramTypes.length) {
                buff.append(",");
            }
        }
        buff.append(")");
        return buff.toString();
    }

    public AnalysationIssue[] analyze(final String templateName) {
        final Set<AnalysationIssue> issues = new HashSet<AnalysationIssue>();
        final XpandResource tpl = ctx.findTemplate(templateName);
        tpl.analyze(ctx, issues);
        return issues.toArray(new AnalysationIssue[issues.size()]);
    }
}
