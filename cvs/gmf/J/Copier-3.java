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

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public interface Copier {
	/**
	 * Copies relevant content of the old object into the current ancestor.
	 * 
	 * @param currentParent
	 *            the parent node in the current tree. It is guarranteed that
	 *            parent was matched with <code>old.eContainer()</code>
	 * @param old
	 *            the element found in the old tree which does not have matched
	 *            element in the current tree
	 * @return just created element copied into the current tree or
	 *         <code>null</code> if copier decided to avoid creation of
	 *         element.
	 * 
	 * NOTE: in case if this method returns created element, result is
	 * considered as "matched" with <code>old</code> automatically, without
	 * any further matchings
	 */
	public EObject copyToCurrent(EObject currentParent, EObject old);
	
	public static final Copier NEVER_COPY = new Copier(){
		public EObject copyToCurrent(EObject currentParent, EObject old) {
			return null;
		}
	};
	
	public static final Copier COMPLETE_COPY = new Copier(){
	
		@SuppressWarnings("unchecked")
		public EObject copyToCurrent(EObject currentParent, EObject old) {
			safetyCheck(old);
			EClass currentParentEClass = currentParent.eClass();
			EObject oldParent = old.eContainer();
			EClass oldParentEClass = oldParent.eClass();
			EObject currentCopy = null;
			if (currentParentEClass.equals(oldParentEClass)){
				currentCopy = EcoreUtil.copy(old);
				EStructuralFeature containment = old.eContainingFeature();
				Object currentValue = currentParent.eGet(containment);
				if (currentValue instanceof Collection){
					((Collection)currentValue).add(currentCopy);
				} else {
					currentParent.eSet(containment, currentCopy);
				}
			}
			return currentCopy;
		}
		
		/**
		 * It is not trivial to copy the external references while reconciling.
		 * If you need this, do not use this simple implementation.
		 */
		private void safetyCheck(EObject old){
			if (!EcoreUtil.CrossReferencer.find(Collections.singleton(old)).isEmpty()){
				throw new IllegalArgumentException("I am not intended to copy elements woth cross references");
			}
		}
	
	};

}
