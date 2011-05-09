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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.expression.ast.DeclaredParameter;
import org.eclipse.gmf.internal.xpand.expression.ast.Identifier;
import org.eclipse.gmf.internal.xpand.model.XpandAdvice;
import org.eclipse.gmf.internal.xpand.model.XpandDefinition;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;

/**
 * @author Sven Efftinge
 */
public class Advice extends AbstractDefinition implements XpandAdvice {

    public final static String DEF_VAR_NAME = "targetDef";

    private final Identifier pointCut;

    private final boolean wildParams;

    public Advice(final int start, final int end, final int line, final Identifier pointCut, final Identifier type,
            final DeclaredParameter[] params, final boolean wildParams, final Statement[] body) {
        super(start, end, line, type, params, body);
        this.pointCut = pointCut;
        this.wildParams = wildParams;
    }

    public Identifier getPointCut() {
        return pointCut;
    }

    @Override
    public String toString() {
        return getOwner().getFullyQualifiedName() + " " + pointCut.getValue() + getParamString() + " FOR "
                + getType().getValue();
    }

    @Override
    public void analyze(XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
        ctx = ctx.cloneWithVariable(new Variable(DEF_VAR_NAME, BuiltinMetaModel.DEFINITION_TYPE));
        super.analyze(ctx, issues);
    }

    private String getParamString() {
        if ((getParams() == null) || (getParams().length == 0)) {
			return wildParams ? "(*)" : "";
		}
        final StringBuffer buff = new StringBuffer("(");
        for (int i = 0; i < getParams().length; i++) {
            final DeclaredParameter p = getParams()[i];
            buff.append(p.getName().getValue()).append(" ").append(p.getType().getValue());
            if (i + 1 < getParams().length) {
                buff.append(",");
            }
        }
        if (wildParams) {
            buff.append(",*");
        }
        return buff.append(")").toString();
    }

    private Pattern p = null;

    public boolean matches(final XpandDefinition def, XpandExecutionContext ctx) {
        if (p == null) {
            p = Pattern.compile(pointCut.getValue().replaceAll("\\*", ".*"));
        }
        final Matcher m = p.matcher(def.getName());
        if (m.matches()) {
            ctx = ctx.cloneWithResource(def.getOwner());
            final EClassifier t = ctx.getTypeForName(def.getTargetType());
            final EClassifier[] paramTypes = new EClassifier[def.getParams().length];
            for (int i = 0; i < paramTypes.length; i++) {
                paramTypes[i] = ctx.getTypeForName(def.getParams()[i].getType().getValue());
            }
            if ((getParams().length == paramTypes.length) || (wildParams && (getParams().length <= paramTypes.length))) {

                ctx = (XpandExecutionContext) ctx.cloneWithResource(def.getOwner());
                final EClassifier at = ctx.getTypeForName(getTargetType());
                if (BuiltinMetaModel.isAssignableFrom(at, t)) {
                    for (int i = 0; i < getParams().length; i++) {
                        final EClassifier pt = ctx.getTypeForName(getParams()[i].getType().getValue());
                        if (!BuiltinMetaModel.isAssignableFrom(pt, paramTypes[i])) {
							return false;
						}
                    }
                    return true;
                }
            }
        }
        return false;
    }

}
