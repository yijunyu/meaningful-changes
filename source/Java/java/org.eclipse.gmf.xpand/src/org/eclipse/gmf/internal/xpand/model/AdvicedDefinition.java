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
package org.eclipse.gmf.internal.xpand.model;

import org.eclipse.gmf.internal.xpand.ast.Advice;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.expression.ast.DeclaredParameter;

public class AdvicedDefinition implements XpandDefinition {

    private XpandAdvice advice;

    private XpandDefinition definition;

    public AdvicedDefinition(final XpandAdvice adv, final XpandDefinition def) {
        advice = adv;
        definition = def;
    }

    public XpandResource getOwner() {
        return definition.getOwner();
    }

    public void evaluate(final XpandExecutionContext ctx) {
        final XpandExecutionContext ctx1 = (XpandExecutionContext) ctx.cloneWithVariable(new Variable(
                Advice.DEF_VAR_NAME, new XpandDefinitionWrap(definition, ctx)));
        advice.evaluate(ctx1);
    }

    public DeclaredParameter[] getParams() {
        return definition.getParams();
    }

    public String getTargetType() {
        return definition.getTargetType();
    }

    public String getName() {
        return definition.getName();
    }

    @Override
    public String toString() {
        return definition.toString() + " adviced by " + advice.toString();
    }
}