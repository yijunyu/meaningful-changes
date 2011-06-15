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

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class DeclaredParameter extends SyntaxElement {

    private Identifier type;

    private Identifier name;

    public DeclaredParameter(final int start, final int end, final int line, final Identifier type,
            final Identifier name) {
        super(start, end, line);
        this.type = type;
        this.name = name;
    }

    public Identifier getName() {
        return name;
    }

    public Identifier getType() {
        return type;
    }

    @Override
    public String toString() {
        return type.getValue() + " " + name.getValue();
    }
}
