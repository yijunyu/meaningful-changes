/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
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

public abstract class Decision {
	private final EStructuralFeature myFeature;

	public abstract void apply(EObject current, EObject old);
	
	public Decision(EStructuralFeature feature){
		myFeature = feature;
	}
	
	protected final EStructuralFeature getFeature(){
		return myFeature;
	}
	
	public static class ALWAYS_OLD extends Decision {
		public ALWAYS_OLD(EStructuralFeature feature){
			super(feature);
		}
		
		public void apply(EObject current, EObject old) {
			preserveOld(current, old);
		}
	}
	
	public static class ALWAYS_NEW extends Decision {
		public ALWAYS_NEW(EStructuralFeature feature){
			super(feature);
		}
		
		public void apply(EObject current, EObject old) {
			acceptNew(current, old);
		}
	}

	protected void acceptNew(EObject current, EObject old) {
		// do nothing
	}

	protected void preserveOld(EObject current, EObject old) {
		Object oldValue = old.eGet(getFeature(), true);
		current.eSet(getFeature(), oldValue);
	}

	protected final boolean isValueSet(EObject obj) {
		return obj.eIsSet(getFeature());
	}
}
