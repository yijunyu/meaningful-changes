/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.expression.ast.DeclaredParameter;

public class XpandDefinitionWrap {

    private final XpandDefinition def;

    private final XpandExecutionContext ctx;

    public XpandDefinitionWrap(final XpandDefinition def, final XpandExecutionContext ctx) {
        this.def = def;
        this.ctx = ctx;
    }

    public String getName() {
        return def.getName();
    }

    public EClassifier getTargetType() {
        return ctx.getTypeForName(def.getTargetType());
    }

    public List<EClassifier> getParamTypes() {
        final DeclaredParameter[] p = def.getParams();
        final List<EClassifier> result = new ArrayList<EClassifier>();
        for (DeclaredParameter element : p) {
            result.add(ctx.getTypeForName(element.getType().getValue()));
        }
        return result;
    }

    public List<String> getParamNames() {
        final DeclaredParameter[] p = def.getParams();
        final List<String> result = new ArrayList<String>();
        for (DeclaredParameter element : p) {
            result.add(element.getName().getValue());
        }
        return result;
    }

    public void proceed() {
        def.evaluate(ctx);
    }

    public void proceed(final Object target, final List<?> list) {
        XpandExecutionContext context = ctx;
        if (target != null) {
            context = (XpandExecutionContext) context.cloneWithVariable(new Variable(ExecutionContext.IMPLICIT_VARIABLE, target));
        }
        if (list != null) {
            final List<String> n = getParamNames();
            for (int i = 0, x = list.size(); i < x;) {
                final Object o = list.get(i);
                if ((o != null) && (n.size() >= i)) {
                    context = context.cloneWithVariable(new Variable(n.get(i), o));
                }
            }
        }
        def.evaluate(context);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + '[' + def.toString() + ']';
    }
}

