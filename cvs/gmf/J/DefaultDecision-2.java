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
	public DefaultDecision(EStructuralFeature feature){
		super(feature);
	}
	
	public void apply(EObject current, EObject old) {
		assert current.eClass().equals(old.eClass());
		if (!current.eIsSet(getFeature()) && old.eIsSet(getFeature())) {
			preserveOld(current, old);
		} else {
			acceptNew(current, old);
		}
	}
}
