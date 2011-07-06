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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;

/**
 * Represents a state of validation of a single diagram.
 */
public class ValidationState {
	private final URI myDiagramUri;
	private final ValidationStateManager myStateManager;
	private HashMap<URI, Collection<ViolationDescriptor>> myViolations = new HashMap<URI, Collection<ViolationDescriptor>>();
	private ValidationStateUpdater myUpdater;

	public ValidationState(ValidationStateManager stateManager, URI diagramUri) {
		myDiagramUri = diagramUri;
		myStateManager = stateManager;
	}

	/**
	 * @return the diagramUri
	 */
	public URI getDiagramUri() {
		return myDiagramUri;
	}

	public Collection<ViolationDescriptor> getViolations(URI uri) {
		return myViolations.get(uri);
	}

	public Collection<ViolationDescriptor> getAllViolations() {
		Collection<ViolationDescriptor> result = new ArrayList<ViolationDescriptor>();
		for (Collection<ViolationDescriptor> next : myViolations.values()) {
			result.addAll(next);
		}
		return result;
	}

	/**
	 * Starts an update operation. The operation will typically create the violations based on 
	 * the current state of the validation and report completion 
	 * using {@link IValidationStateUpdater#commitChanges()} method.
	 * After the operation is completed successfully, the {@link IValidationStateListener listeners} 
	 * registered to the {@link ValidationStateManager} will be notified about the change.
	 * It is expected that a single command may be active at any given time, and that a command will 
	 * not be used after is has been reported as completed.
	 */
	public IValidationStateUpdater startUpdate() {
		if (myUpdater != null) {
			throw new IllegalStateException();
		}
		myUpdater = new ValidationStateUpdater();
		return myUpdater;
	}

	private class ValidationStateUpdater implements IValidationStateUpdater {
		private HashMap<URI, Collection<ViolationDescriptor>> myUpdatedViolations;
		public ValidationStateUpdater() {
			myUpdatedViolations = new HashMap<URI, Collection<ViolationDescriptor>>();
		}
		public void addViolation(ViolationDescriptor violation) {
			if (violation == null) {
				return;
			}
			URI uri = violation.getUri();
			Collection<ViolationDescriptor> descriptors = get(uri, true);
			if (!descriptors.contains(violation)) {
				descriptors.add(violation);
			}
		}
		public void removeViolation(ViolationDescriptor violation) {
			if (violation == null) {
				return;
			}
			URI uri = violation.getUri();
			Collection<ViolationDescriptor> descriptors = get(uri, false);
			if (descriptors != null) {
				descriptors.remove(violation);
			}
		}
		private Collection<ViolationDescriptor> get(URI uri, boolean createIfMissing) {
			Collection<ViolationDescriptor> result = myUpdatedViolations.get(uri);
			if (result == null && createIfMissing) {
				result = new ArrayList<ViolationDescriptor>();
				myUpdatedViolations.put(uri, result);
			}
			return result;
		}
		public void commitChanges() {
			if (myUpdater != this) {
				throw new IllegalStateException();
			}
			try {
				HashMap<URI, Collection<ViolationDescriptor>> oldViolations = myViolations;
				myViolations = myUpdatedViolations;
				myStateManager.fireValidationStateChanged(ValidationState.this, Collections.unmodifiableMap(oldViolations), Collections.unmodifiableMap(myUpdatedViolations));
			} finally {
				myUpdater = null;
			}
		}
		public void discardChanges() {
			if (myUpdater == this) {
				myUpdater = null;
			}
		}
	}
}
