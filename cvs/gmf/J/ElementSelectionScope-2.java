/******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.common.ui.services.elementselection;

/**
 * Class for setting and testing flags used by the element selection service.
 * 
 * @author Anthony Hunter <a href="mailto:anthonyh@ca.ibm.com">
 *         anthonyh@ca.ibm.com </a>
 */
public class ElementSelectionScope {

	/**
	 * the scope for the element selection service.
	 */
	private int scope;

	/**
	 * Constructor for IconOptions
	 */
	public ElementSelectionScope() {
		this(0);
	}

	/**
	 * Constructor for ElementSelectionScope
	 * 
	 * @param scope
	 *            the scope
	 */
	private ElementSelectionScope(int scope) {
		this.scope = scope;
	}

	/**
	 * The default option to provide all visible types based on the context.
	 */
	public static final ElementSelectionScope VISIBLE = new ElementSelectionScope(
		0);

	/**
	 * Provide all types in the workspace and target environment (if
	 * applicable).
	 */
	public static final ElementSelectionScope GLOBAL = new ElementSelectionScope(
		1 << 1);

	/**
	 * Returns the scope as an integer bit flag
	 * 
	 * @return int the scope as an integer bit flag
	 */
	public int intValue() {
		return scope;
	}

	/**
	 * Tests if the specified option is set
	 * 
	 * @param scope
	 *            the scope as an integer bit flag
	 * @param option
	 *            the specified option
	 * @return boolean <code>true</code> if this option is set, otherwise
	 *         <code>false</code>
	 */
	public static boolean isSet(int scope, ElementSelectionScope option) {
		if ((scope & option.scope) != 0)
			return true;
		return false;
	}

	/**
	 * Sets the specified option
	 * 
	 * @param option
	 *            the specified option
	 */
	public void set(ElementSelectionScope option) {
		scope = scope | option.scope;
	}
}