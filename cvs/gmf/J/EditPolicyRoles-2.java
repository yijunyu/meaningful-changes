/**
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.policies;

import org.eclipse.gef.RequestConstants;

/**
 * Constants that are used as keys for installing edit policies.
 */
public interface EditPolicyRoles {
	/**
	 * The key used to install an edit policy that handles {@link RequestConstants#REQ_OPEN open} requests.
	 * Typically, this edit policy will open another diagram in response to the request.
	 */
	public static final String OPEN_ROLE = "OpenEditPolicy";
}
