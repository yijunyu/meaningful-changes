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
package org.eclipse.gmf.internal.xpand.model;

import org.eclipse.gmf.internal.xpand.ResourceMarker;
import org.eclipse.gmf.internal.xpand.ast.XpandAnalyzable;

public interface XpandResource extends XpandAnalyzable, ResourceMarker {
	public static final String TEMPLATE_EXTENSION = "xpt";

	String getFullyQualifiedName(); // [artem] from Resource XXX reconsider - almost useless?

    XpandDefinition[] getDefinitions();

    XpandAdvice[] getAdvices();

    // XXX next two are mainly for code completion which uses own implementation of XpandResource
    String[] getImportedNamespaces();

    String[] getImportedExtensions();
}
