/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.codeassist;

public class XpandPartition {

    public final static XpandPartition EXPRESSION = new XpandPartition("Expression");

    public final static XpandPartition TYPE_DECLARATION = new XpandPartition("Type Declaration");

    public final static XpandPartition NAMESPACE_IMPORT = new XpandPartition("Namespace Import");

    public final static XpandPartition EXTENSION_IMPORT = new XpandPartition("Extension Import");

    public static final XpandPartition DEFAULT = new XpandPartition("Default");

    public static final XpandPartition COMMENT = new XpandPartition("Comment");

    public final static XpandPartition EXPAND_STATEMENT = new XpandPartition("EXPAND_STATEMENT");

    private String name = null;

    public XpandPartition(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
    	return name;
    }
}
