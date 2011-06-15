/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.ast;

import org.eclipse.gmf.internal.xpand.expression.ast.StringLiteral;
import org.eclipse.gmf.internal.xpand.expression.ast.SyntaxElement;

public class NamespaceImport extends SyntaxElement {
	private final String importString;

	public NamespaceImport(int start, int end, int line, StringLiteral importString) {
		super(start, end, line);
		this.importString = importString.getValue();
	}

	public String getImportString() {
		return importString;
	}

}
