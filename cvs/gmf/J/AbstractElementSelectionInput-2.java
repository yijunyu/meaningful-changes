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

import java.util.List;

import org.eclipse.core.runtime.IAdaptable;

/**
 * Abstract implementation of an IElementSelectionInput.
 * 
 * @author Anthony Hunter <a href="mailto:anthonyh@ca.ibm.com">
 *         anthonyh@ca.ibm.com </a>
 */
public class AbstractElementSelectionInput
	implements IElementSelectionInput {

	/**
	 * The scope used for the search for matching objects.
	 */
	private ElementSelectionScope scope;

	/**
	 * A list of the input types.
	 */
	private List types;

	/**
	 * A context for the input.
	 */
	private IAdaptable context;

	/**
	 * Constructor for an AbstractElementSelectionInput
	 * 
	 * @param types
	 *            A list of the types.
	 * @param context
	 *            A context for the input.
	 * @param scope
	 *            The scope used for the search for matching objects.
	 */
	public AbstractElementSelectionInput(List types, IAdaptable context,
			ElementSelectionScope scope) {
		super();
		this.types = types;
		this.context = context;
		this.scope = scope;
	}

	/**
	 * @inheritDoc
	 */
	public ElementSelectionScope getScope() {
		return scope;
	}

	/**
	 * @inheritDoc
	 */
	public List getTypes() {
		return types;
	}

	/**
	 * @inheritDoc
	 */
	public IAdaptable getContext() {
		return context;
	}

}