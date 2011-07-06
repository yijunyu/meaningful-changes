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

public class LinkDescriptor extends ElementDescriptor {
	private EObject mySource;
	private EObject myDestination;

	public LinkDescriptor(EObject source, EObject destination, EObject linkElement, int linkVID) {
		super(linkElement, linkVID);
		mySource = source;
		myDestination = destination;
	}

	public LinkDescriptor(EObject source, EObject destination, int linkVID) {
		this(source, destination, null, linkVID);
	}

	public EObject getSource() {
		return mySource;
	}

	public EObject getDestination() {
		return myDestination;
	}
}
