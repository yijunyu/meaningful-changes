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

/**
 * Allows to update the violations for a given validation state (and thus for a given diagram).
 * Violations may be updated using {@link #addViolation(ViolationDescriptor)} and {@link #removeViolation(ViolationDescriptor)} methods.
 * <p/>After the violations are updated, {@link #commitChanges()} method should be used to commit the updated state 
 * and notify the listeners about the update. If changes are invalid for some reason, {@link #discardChanges()} method
 * may be used to revert all the changes and invalidate the updater.
 * @see ValidationState#startUpdate(boolean)
 */
public interface IValidationStateUpdater {
	public void addViolation(ViolationDescriptor violation);

	/**
	 * Completes the update and reports changes. 
	 * After this method has been called, this instance must not be used.
	 */
	public void commitChanges();
	/**
	 * Reverts all the changes. 
	 * After this method has been called, this instance must not be used.
	 */
	public void discardChanges();
}
