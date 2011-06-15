/*
 * Copyright (c) 2006, 2008 Borland Software Corporation
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

import java.text.MessageFormat;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ReflectiveMatcher implements Matcher {
	private final EStructuralFeature myFeature;
	
	public ReflectiveMatcher(EStructuralFeature feature) {
		assert feature != null;
		myFeature = feature;
	}

	public final boolean match(EObject current, EObject old) {
		assertCompatible(current, old);
		checkReflector(current.eClass());
		Object currentValue = current.eGet(myFeature);
		//do not allow match null against null
		return currentValue != null && currentValue.equals(old.eGet(myFeature));
	}
	
	private void assertCompatible(EObject current, EObject old) {
		if (!current.eClass().equals(old.eClass())){
			throw new IllegalStateException(MessageFormat.format("Objects not compatible: {0}, {1}", new Object[] {current, old}));
		}
	}
	
	private void checkReflector(EClass eClass) {
		if (!myFeature.getEContainingClass().isSuperTypeOf(eClass)) {
			// perhaps, we should respect case when same metamodel is loaded from different sources, and same
			// metaclasses are not 'equal' in Java sense
			throw new IllegalStateException(MessageFormat.format("EClass {0} is not compatible with expected class {1} ", new Object[] {eClass, myFeature.getEContainingClass()}));
		}
	}
}
