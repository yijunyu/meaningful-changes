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
public class AnalysationIssue {

    public final static Type INCOMPATIBLE_TYPES = new Type("Incompatible types");

    public final static Type UNNECESSARY_CAST = new Type("Unnecessary cast");

    public final static Type FEATURE_NOT_FOUND = new Type("Callable not found");

    public static final Type TYPE_NOT_FOUND = new Type("Type not found");

    public static final Type INTERNAL_ERROR = new Type("Internal error");

    public static final Type JAVA_TYPE_NOT_FOUND = new Type("Java Type not found");

    public static final Type SYNTAX_ERROR = new Type("Syntax error");

    public final static class Type {
        private String name;

        public Type(final String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private Type type;

    private String message;

    private SyntaxElement element;

    public AnalysationIssue(final Type type, final String message, final SyntaxElement element) {
        this.type = type;
        this.message = message;
        this.element = element;
    }

    public SyntaxElement getElement() {
        return element;
    }

    public String getMessage() {
        return message;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "[" + type.name + "] - " + message + " : " + element;
    }
}
