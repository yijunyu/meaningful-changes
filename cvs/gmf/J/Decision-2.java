/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */

package org.eclipse.gmf.internal.common.reconcile;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Decision {
	public void apply(EObject current, EObject old, EStructuralFeature feature);
	
	public static final Decision PRESERVE_OLD = new Decision(){
		public void apply(EObject current, EObject old, EStructuralFeature feature) {
			Object oldValue = old.eGet(feature, true);
			current.eSet(feature, oldValue);
		}
	};
	
	public static final Decision ACCEPT_NEW = new Decision(){
		public void apply(EObject current, EObject old, EStructuralFeature feature) {
			//do nothing
		}
	};
}
