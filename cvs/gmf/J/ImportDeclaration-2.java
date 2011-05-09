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

import org.eclipse.gmf.internal.xpand.expression.ast.Identifier;
import org.eclipse.gmf.internal.xpand.expression.ast.SyntaxElement;

/**
 * *
 * 
 * @author Sven Efftinge *
 */
public class ImportDeclaration extends SyntaxElement {

    private Identifier importString;

    public ImportDeclaration(final int start, final int end, final int line, final Identifier importString) {
        super(start, end, line);
        this.importString = importString;
    }

    public Identifier getImportString() {
        return importString;
    }
}
