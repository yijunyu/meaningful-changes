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
package org.eclipse.gmf.runtime.lite.edit.policies;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.lite.requests.RequestConstants;

/**
 * An edit policy that, in addition to the standard delete requests, understands 
 * requests to delete only the view representation.
 */
public class ComponentEditPolicyEx extends ComponentEditPolicy {
	/**
	 * Override to contribute to the command that deletes the notational view.
	 * @param deleteRequest the DeleteRequest
	 * @return Command <code>null</code> or a contribution to the delete
	 */
	protected Command getDeleteViewCommand(GroupRequest deleteRequest) {
		return getDeleteViewCommand(deleteRequest, false);
	}

	/**
	 * Override to contribute to the command that deletes the notational view. 
	 * @param deleteRequest the DeleteRequest
	 * @param isForced <code>true</code> if the command is requested as a part of view deletion of
	 * the edit part this edit part depends on (container or a link end).
	 * @return Command <code>null</code> or a contribution to the delete
	 */
	protected Command getDeleteViewCommand(GroupRequest deleteRequest, boolean isForced) {
		return null;
	}

	@Override
	public Command getCommand(Request request) {
		if (RequestConstants.REQ_DELETE_VIEW.equals(request.getType())) {
			return getDeleteViewCommand((GroupRequest) request);
		}
		if (RequestConstants.REQ_FORCED_DELETE_VIEW.equals(request.getType())) {
			return getDeleteViewCommand((GroupRequest) request, true);
		}
		return super.getCommand(request);
	}
}
