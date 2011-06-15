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

public class DefaultDecision extends Decision {
	
	private boolean myInverted;

	public DefaultDecision(EStructuralFeature feature){
		this(feature, false);
	}
	
	public DefaultDecision(EStructuralFeature feature, boolean inverted){
		super(feature);
		myInverted = inverted;
	}
	
	public void apply(EObject current, EObject old) {
		assert current.eClass().equals(old.eClass());
		if (!(myInverted ^ isValueSet(current)) && (myInverted ^ isValueSet(old))) {
			preserveOld(current, old);
		} else {
			acceptNew(current, old);
		}
	}
}
