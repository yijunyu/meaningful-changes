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

public abstract class SyntaxElement {
    protected final int start;

    protected final int end;

    protected final int line;

    public SyntaxElement(final int start, final int end, final int line) {
        this.start = start;
        this.end = end;
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }

    private String fileName;

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
