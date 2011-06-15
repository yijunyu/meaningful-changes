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

public abstract class Literal extends Expression {

    private final String literalValue;

    public Literal(final int start, final int end, final int line, final String literalValue) {
        super(start, end, line);
        this.literalValue = literalValue;
    }

    public String getLiteralValue() {
        return literalValue;
    }

    @Override
    public String toString() {
        return literalValue;
    }
}
