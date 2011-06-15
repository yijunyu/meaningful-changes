/*
 * Copyright (c) 2005, 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *    Radek Dvorak (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.validate;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;

public interface IDefElementProvider {
	IStatus getStatus();
	
	public interface ContextProvider extends IDefElementProvider {
		/**
		 * Gets context classifier.
		 * 
		 * @param resolutionContext
		 *            contextual instance to be used for resolving the resulting
		 *            context classifier.
		 * @return classifer object or <code>null</code> is this provider was
		 *         not able to find out suitable classifier in this
		 *         <code>resolutionContext</code>.
		 *         <p>
		 *         Note: if this provider status is not <code>OK</code>, this
		 *         method returns <code>null</code>.
		 */
		EClassifier getContextClassifier(EObject resolutionContext);
	}
	
	public interface TypeProvider extends IDefElementProvider {
		/**
		 * Gets typed element represented by this provider.
		 * <p>
		 * 
		 * @return typed element or <code>null</code> if this provider
		 *         represents only plain classifier without extra info on
		 *         muliplicity, ordering, uniqueness which have impact on the
		 *         resulting model type.
		 */
		ETypedElement getTypedElement(EObject context);
		EClassifier getType(EObject context);		
		boolean hasTypedElement();
	}
	
	public interface StringValProvider extends IDefElementProvider {
		String getValue(EObject contextInstance);
	}	
}
