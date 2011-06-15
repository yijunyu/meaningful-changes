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

import org.eclipse.gmf.internal.xpand.expression.SyntaxConstants;
import org.eclipse.gmf.internal.xpand.expression.ast.DeclaredParameter;
import org.eclipse.gmf.internal.xpand.expression.ast.Identifier;
import org.eclipse.gmf.internal.xpand.model.XpandDefinition;

/**
 * @author Sven Efftinge
 */
public class Definition extends AbstractDefinition implements XpandDefinition {
    private final Identifier name;

    public Definition(final int start, final int end, final int line, final Identifier name, final Identifier type,
            final DeclaredParameter[] params, final Statement[] body) {
        super(start, end, line, type, params, body);
        this.name = name;
    }

    public Identifier getDefName() {
        return name;
    }

    @Override
    public String toString() {
        return getOwner().getFullyQualifiedName() + SyntaxConstants.NS_DELIM + getName() + getParamString() + " FOR "
                + getType().getValue();
    }

    private String getParamString() {
        if ((getParams() == null) || (getParams().length == 0)) {
			return "";
		}
        final StringBuffer buff = new StringBuffer("(");
        for (int i = 0; i < getParams().length; i++) {
            final DeclaredParameter p = getParams()[i];
            buff.append(p.getName().getValue()).append(" ").append(p.getType().getValue());
            if (i + 1 < getParams().length) {
                buff.append(",");
            }
        }
        return buff.toString();
    }

    public String getName() {
        return getDefName().getValue();
    }

}
