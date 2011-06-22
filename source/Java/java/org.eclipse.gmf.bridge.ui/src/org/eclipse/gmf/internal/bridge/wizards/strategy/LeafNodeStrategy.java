/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
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

/**
 * Simple strategy that filters out metaclasses that are not leaves
 * @author artem
 */
public class LeafNodeStrategy implements Strategy<EClass> {

	public String getID() {
		return "leafNode";
	}

	/**
	 * @param soFar - expects <code>List&lt;EClass&gt;</code>
	 */
	public void filter(Collection<EClass> soFar, Hierarchy hierarchy) {
		for (Iterator<EClass> it = soFar.iterator(); it.hasNext();) {
			if (!hierarchy.isLeaf(it.next())) {
				it.remove();
			}
		}
	}
}
