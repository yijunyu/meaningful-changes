/**
 * Copyright (c) 2006 Borland Software Corp.
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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.lite.services.IDiagramLayouter;
import org.eclipse.ui.IWorkbenchPart;


public class LayoutDiagramAction extends WorkbenchPartAction {
	public LayoutDiagramAction(IWorkbenchPart part) {
		super(part);
	}

	@Override
	protected void init() {
		super.init();
		setId(ActionIds.LAYOUT_ALL_ACTION);
		setText("&Layout all");
		setToolTipText("Layouts the diagram");
	}

	@Override
	protected boolean calculateEnabled() {
		return getWorkbenchPart().getAdapter(IDiagramLayouter.class) != null && getWorkbenchPart().getAdapter(GraphicalViewer.class) != null;
	}

	@Override
	public void run() {
		GraphicalViewer viewer = (GraphicalViewer) getWorkbenchPart().getAdapter(GraphicalViewer.class);
		IDiagramLayouter layouter = (IDiagramLayouter) getWorkbenchPart().getAdapter(IDiagramLayouter.class);
		Command layoutCommand = layouter.layout((GraphicalEditPart) viewer.getContents());
		if (layoutCommand != null && layoutCommand.canExecute()) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(viewer.getContents().getModel());
			viewer.getEditDomain().getCommandStack().execute(new WrappingCommand(editingDomain, layoutCommand));
		}
	}
}
