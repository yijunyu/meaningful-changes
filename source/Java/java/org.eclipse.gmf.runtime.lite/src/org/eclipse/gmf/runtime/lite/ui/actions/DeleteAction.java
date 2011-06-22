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
package org.eclipse.gmf.runtime.lite.ui.actions;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.lite.requests.RequestConstants;
import org.eclipse.ui.IWorkbenchPart;


public class DeleteAction extends org.eclipse.gef.ui.actions.DeleteAction {
	public DeleteAction(IWorkbenchPart part) {
		super(part);
	}

	@Override
	protected void init() {
		super.init();
		setId(ActionIds.DELETE_FROM_MODEL);
		setText("Delete From Model");
	}

	@Override
	public Command createDeleteCommand(List objects) {
		if (objects.isEmpty()) {
			return null;
		}
		if (!(objects.get(0) instanceof EditPart)) {
			return null;
		}
		return createDeleteCommand(objects, RequestConstants.REQ_DELETE);
	}

	protected final Command createDeleteCommand(List<?> objects, String requestType) {
		GroupRequest deleteReq = new GroupRequest(requestType);
		deleteReq.setEditParts(objects);

		CompoundCommand compoundCmd = new CompoundCommand();
		for (int i = 0; i < objects.size(); i++) {
			EditPart object = (EditPart) objects.get(i);
			Command cmd = object.getCommand(deleteReq);
			if (cmd != null) {
				compoundCmd.add(cmd);
			}
		}
		return compoundCmd;
	}
}
