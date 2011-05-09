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
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.expression.ast.DeclaredParameter;
import org.eclipse.gmf.internal.xpand.expression.ast.Identifier;
import org.eclipse.gmf.internal.xpand.expression.ast.SyntaxElement;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;
import org.eclipse.gmf.internal.xpand.model.XpandResource;

public abstract class AbstractDefinition extends SyntaxElement implements XpandAnalyzable, XpandEvaluatable {

    private Identifier type;

    private DeclaredParameter[] params;

    private Statement[] body;

    private Template owner = null;

    public void setOwner(final Template owner) {
        this.owner = owner;
    }

    public AbstractDefinition(final int start, final int end, final int line, final Identifier type,
            final DeclaredParameter[] params, final Statement[] body) {
        super(start, end, line);
        this.type = type;
        this.params = params;
        this.body = body;
    }

    public Identifier getType() {
        return type;
    }

    public Statement[] getBody() {
        return body;
    }

    public DeclaredParameter[] getParams() {
        return params;
    }

    public XpandResource getOwner() {
        return owner;
    }

    public void analyze(XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
        final EClassifier thisType = ctx.getTypeForName(getType().getValue());
        if (thisType == null) {
            issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, "Couldn't find " + getType().getValue(),
                    getType()));
        }
        ctx = ctx.cloneWithVariable(new Variable(ExecutionContext.IMPLICIT_VARIABLE, thisType));
        for (int i = 0; i < getParams().length; i++) {
            final DeclaredParameter param = getParams()[i];
            EClassifier paramType = ctx.getTypeForName(param.getType().getValue());
            if (paramType == null) {
                issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, "Couldn't find "
                        + param.getType().getValue(), param.getType()));
                paramType = EcorePackage.eINSTANCE.getEObject();
            }
            final String name = param.getName().getValue();
            ctx = (XpandExecutionContext) ctx.cloneWithVariable(new Variable(name, paramType));
        }
        for (int i = 0; i < getBody().length; i++) {
            getBody()[i].analyze(ctx, issues);
        }
    }

    public void evaluate(XpandExecutionContext ctx) {
        ctx = (XpandExecutionContext) ctx.cloneWithResource(getOwner());
        for (int i = 0; i < getBody().length; i++) {
            getBody()[i].evaluate(ctx);
        }
    }

    public String getTargetType() {
        return getType().getValue();
    }
}
