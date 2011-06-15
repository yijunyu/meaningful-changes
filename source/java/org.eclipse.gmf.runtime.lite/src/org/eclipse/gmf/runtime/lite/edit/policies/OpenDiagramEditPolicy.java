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

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;

public abstract class OpenDiagramEditPolicy extends AbstractEditPolicy {
	@Override
	public Command getCommand(Request request) {
		if (REQ_OPEN.equals(request.getType())) {
			return getOpenCommand(request);
		}
		return super.getCommand(request);
	}

	@Override
	public boolean understandsRequest(Request req) {
		if (REQ_OPEN.equals(req.getType())) {
			return true;
		}
		return super.understandsRequest(req);
	}

	@Override
	public EditPart getTargetEditPart(Request request) {
		if (understandsRequest(request)) {
			return getHost();
		}
		return super.getTargetEditPart(request);
	}

	protected abstract Command getOpenCommand(Request openRequest);
}
