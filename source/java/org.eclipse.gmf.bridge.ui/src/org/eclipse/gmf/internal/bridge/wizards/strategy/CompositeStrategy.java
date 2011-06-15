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

import org.eclipse.emf.ecore.EObject;

/**
 * @author artem
 */
public class CompositeStrategy<T extends EObject> implements Strategy<T> {
	private final Strategy<T>[] myStrategies;

	public CompositeStrategy(Strategy<T>... strategies) {
		assert strategies != null;
		myStrategies = strategies;
		for (int i = 0 ; i < strategies.length; i++) {
			if (strategies[i] == null) {
				// XXX perhaps, replacing null with NullStrategy would be more polite?
				throw new NullPointerException();
			}
		}
	}

	public String getID() {
		return "composite";
	}

	public void filter(Collection<T> soFar, Hierarchy hierarchy) {
		for (int i = 0 ; i < myStrategies.length; i++) {
			myStrategies[i].filter(soFar, hierarchy);
		}
	}
}
