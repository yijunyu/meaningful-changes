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

import org.eclipse.emf.ecore.EObject;

/**
 * @author artem
 */
public interface Strategy {

	String getID();

	/**
	 * @param soFar list to filter, should be modified directly
	 * @param hierarchy accessor to domain model  
	 * @return 
	 */
	<T extends EObject> void filter(Collection<T> soFar, Hierarchy hierarchy);
}
