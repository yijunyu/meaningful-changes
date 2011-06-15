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
import org.eclipse.gmf.runtime.lite.requests.RequestConstants;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Action that deletes view only for shortcuts and children of non-canonical parents, 
 * and both the view and the model for children of canonical parents.
 */
public class DeleteViewAction extends DeleteAction {
	public DeleteViewAction(IWorkbenchPart part) {
		super(part);
	}

	@Override
	protected void init() {
		super.init();
		setId(ActionIds.DELETE_VIEW);
		setText("Delete From Diagram");
		setToolTipText("Delete From Diagram");
	}

	@Override
	public Command createDeleteCommand(List objects) {
		if (objects.isEmpty()) {
			return null;
		}
		if (!(objects.get(0) instanceof EditPart)) {
			return null;
		}
		return createDeleteCommand(objects, RequestConstants.REQ_DELETE_VIEW);
	}
}
