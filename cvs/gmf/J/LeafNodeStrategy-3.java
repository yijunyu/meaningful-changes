/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.wizards.strategy;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * Simple strategy that filters out metaclasses that are not leaves
 * @author artem
 */
public class LeafNodeStrategy implements Strategy {

	public String getID() {
		return "leafNode";
	}

	/**
	 * @param soFar - expects <code>List&lt;EClass&gt;</code>
	 */
	public void filter(Collection<EObject> soFar, Hierarchy hierarchy) {
		for (Iterator it = soFar.iterator(); it.hasNext();) {
			EClass next = (EClass) it.next();
			if (!hierarchy.isLeaf(next)) {
				it.remove();
			}
		}
	}
}
