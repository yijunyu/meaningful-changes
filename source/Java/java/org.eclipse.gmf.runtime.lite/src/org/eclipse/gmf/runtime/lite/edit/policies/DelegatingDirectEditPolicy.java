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

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

/**
 * Edit policy that understands direct edit requests, but does nothing in response to it.
 * This may used by edit parts that delegate direct edit request to child edit parts.
 */
public class DelegatingDirectEditPolicy extends DirectEditPolicy {
	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		return null;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
	}
}
