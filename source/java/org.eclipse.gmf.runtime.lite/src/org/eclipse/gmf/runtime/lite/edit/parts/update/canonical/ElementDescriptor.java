/**
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.parts.update.canonical;

import org.eclipse.emf.ecore.EObject;


public class ElementDescriptor {
	private final EObject myElement;
	private final int myVisualID;

	public ElementDescriptor(EObject element, int visualID) {
		myElement = element;
		myVisualID = visualID;
	}

	public EObject getElement() {
		return myElement;
	}

	public int getVisualID() {
		return myVisualID;
	}
}
