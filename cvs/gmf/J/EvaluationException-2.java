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
package org.eclipse.gmf.internal.xpand.expression;

import org.eclipse.gmf.internal.xpand.expression.ast.SyntaxElement;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class EvaluationException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 3781834199930386623L;

    private SyntaxElement element;

    private String message;

    public EvaluationException(final String msg, final SyntaxElement element) {
        super(msg);
        message = msg;
        this.element = element;
    }

    public EvaluationException(final Throwable ex, final SyntaxElement element) {
        super(ex);
        this.element = element;
    }

    public SyntaxElement getElement() {
        return element;
    }

    @Override
    public String getMessage() {
        return message
                + (element != null ? ":in " + element.getFileName() + " on line " + element.getLine() + " '" + element
                        + "'" : "");
    }
}
