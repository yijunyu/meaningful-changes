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
 * @author artem
 */
public class ExcludeDiagramContainerNodeStrategy implements Strategy<EClass> {

	private final boolean myWithSubclasses;

	public ExcludeDiagramContainerNodeStrategy() {
		this(true);
	}

	public ExcludeDiagramContainerNodeStrategy(boolean withSubclasses) {
		myWithSubclasses = withSubclasses;
	}

	public String getID() {
		return "excludeDiagramContainer";
	}

	public void filter(Collection<EClass> soFar, Hierarchy hierarchy) {
		if (myWithSubclasses && hierarchy.getDiagramContainer() != null) {
			for (Iterator<EClass> it = soFar.iterator(); it.hasNext();) {
				EClass next = it.next();
				if (hierarchy.getDiagramContainer().isSuperTypeOf(next)) {
					it.remove();
				}
			}
		} else {
			soFar.remove(hierarchy.getDiagramContainer());
		}
	}
}
