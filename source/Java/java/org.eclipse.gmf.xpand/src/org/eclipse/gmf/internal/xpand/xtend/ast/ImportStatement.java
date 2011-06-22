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
package org.eclipse.gmf.internal.xpand.xtend.ast;

import org.eclipse.gmf.internal.xpand.expression.ast.Identifier;
import org.eclipse.gmf.internal.xpand.expression.ast.SyntaxElement;

public class ImportStatement extends SyntaxElement {

    private final Identifier importedId;
    private final String nsImport;

    private final boolean exported;

    public ImportStatement(int start, int end, int line, String nsImport) {
    	super(start, end, line);
    	exported = false;
    	this.nsImport = nsImport;
    	importedId = null;
    }

    public ImportStatement(final int start, final int end, final int line, final Identifier importedID,
            final boolean exported) {
        super(start, end, line);
        importedId = importedID;
        this.exported = exported;
        nsImport = null;
    }

    /**
     * @return null if import was a plain string. Use {@link #getValue()} instead
     */
    public Identifier getImportedId() {
        return importedId;
    }

    public String getValue() {
    	if (importedId != null) {
    		return importedId.getValue();
    	}
    	return nsImport;
    }

    public boolean isExported() {
        return exported;
    }

}
