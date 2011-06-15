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

import java.util.EventListener;

/**
 * Listener that is notified when a validation state is changed. 
 * @see ValidationStateManager#addValidationStateListener(IValidationStateListener)
 * @see ValidationStateManager#removeValidationStateListener(IValidationStateListener)
 */
public interface IValidationStateListener extends EventListener {
	/**
	 * Notifies the listener about the change in the validation state.
	 * The event object is only valid for the duration of the invocation of this method. 
	 * @param event
	 */
	public void validationStateChanged(ValidationStateEvent event);
}
