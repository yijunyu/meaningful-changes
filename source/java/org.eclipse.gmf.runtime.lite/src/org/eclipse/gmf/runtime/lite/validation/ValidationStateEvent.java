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

import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;

/**
 * Event that describes the change in a validation state.
 * @see IValidationStateListener
 */
@SuppressWarnings("serial")
public class ValidationStateEvent extends EventObject {
	private final Map<URI, Collection<ViolationDescriptor>> myOldViolations;
	private final Map<URI, Collection<ViolationDescriptor>> myNewViolations;
	private final Set<URI> myAllKeys;

	public ValidationStateEvent(ValidationState state, Map<URI, Collection<ViolationDescriptor>> oldViolations, Map<URI, Collection<ViolationDescriptor>> newViolations) {
		super(state);
		myOldViolations = oldViolations;
		myNewViolations = newViolations;
		myAllKeys = new HashSet<URI>(myOldViolations.keySet());
		myAllKeys.addAll(myNewViolations.keySet());
	}

	public ValidationState getSourceValidationState() {
		return (ValidationState) getSource();
	}

	public Collection<ViolationDescriptor> getOldViolations(URI uri) {
		Collection<ViolationDescriptor> result = myOldViolations.get(uri);
		if (result == null) {
			return Collections.emptyList();
		}
		return result;
	}

	public Collection<ViolationDescriptor> getNewViolations(URI uri) {
		Collection<ViolationDescriptor> result = myNewViolations.get(uri);
		if (result == null) {
			return Collections.emptyList();
		}
		return result;
	}

	public Iterable<URI> getViolationKeys() {
		return myAllKeys;
	}
}
