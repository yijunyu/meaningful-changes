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

import lpg.lpgjavaruntime.IToken;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class Identifier extends SyntaxElement {
    private String value;

    public Identifier(final int start, final int end, final int line, final String value) {
        super(start, end, line);
        this.value = value;
    }

    // FIXME not good to depend from IToken here, especially when migrating to different parser ;)
    public Identifier append(final IToken t) {
        value = value + t.toString();
        end = t.getEndColumn();
        return this;
    }

    public void append(final Identifier t) {
        value = value + t.value;
        end = t.end;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
