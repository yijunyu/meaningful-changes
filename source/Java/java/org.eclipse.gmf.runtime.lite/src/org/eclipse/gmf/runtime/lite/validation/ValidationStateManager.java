/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.validation;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

/**
 * Manages the state of the validation and reports changes to registered {@link IValidationStateListener listeners}. 
 */
public class ValidationStateManager {
//	private static ValidationStateManager INSTANCE;

	private ArrayList<IValidationStateListener> myListeners = new ArrayList<IValidationStateListener>();
	private HashMap<URI, WeakReference<ValidationState>> myValidationStates = new HashMap<URI, WeakReference<ValidationState>>();

//	public static ValidationStateManager getInstance() {
//		if (INSTANCE == null) {
//			INSTANCE = new ValidationStateManager();
//		}
//		return INSTANCE;
//	}

	public ValidationStateManager() {
	}

	public void addValidationStateListener(IValidationStateListener listener) {
		if (listener != null && !myListeners.contains(listener)) {
			myListeners.add(listener);
		}
	}

	public void removeValidationStateListener(IValidationStateListener listener) {
		myListeners.remove(listener);
	}

	public ValidationState getValidationState(URI diagramUri) {
		WeakReference<ValidationState> ref = myValidationStates.get(diagramUri);
		ValidationState result = null;
		if (ref != null) {
			result = ref.get();
		}
		if (result == null) {
			result = new ValidationState(this, diagramUri);
			myValidationStates.put(diagramUri, new WeakReference<ValidationState>(result));
		}
		return result;
	}

	void fireValidationStateChanged(ValidationState source, Map<URI, Collection<ViolationDescriptor>> oldViolations, Map<URI, Collection<ViolationDescriptor>> newViolations) {
		if (myListeners.isEmpty()) {
			return;
		}
		ValidationStateEvent evt = new ValidationStateEvent(source, oldViolations, newViolations);
		for (IValidationStateListener next : new ArrayList<IValidationStateListener>(myListeners)) {
			next.validationStateChanged(evt);
		}
	}
}
