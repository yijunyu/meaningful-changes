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
package org.eclipse.gmf.runtime.lite.handles;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.tools.AbstractTool;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;


public class CompartmentCollapseTracker extends AbstractTool implements DragTracker {
	private final GraphicalEditPart myHost;

	public CompartmentCollapseTracker(GraphicalEditPart editPart) {
		myHost = editPart;
	}

	@Override
	protected List<?> createOperationSet() {
		List<GraphicalEditPart> list = new ArrayList<GraphicalEditPart>(1);
		list.add(myHost);
		return list;
	}

	@Override
	protected boolean handleButtonDown(int button) {
		View view = (View) myHost.getModel();
		if (view!=null){
			DrawerStyle style = (DrawerStyle)view.getStyle(NotationPackage.eINSTANCE.getDrawerStyle());
			if (style != null) {
				Boolean newValue = style.isCollapsed() ? Boolean.FALSE : Boolean.TRUE;
				setCurrentCommand(createCommand(style, newValue));
				executeCurrentCommand();
				return true;
			} 
		}
		return false;
	}

	private Command createCommand(DrawerStyle style, Boolean newValue) {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(style);
		return new WrappingCommand(editingDomain, SetCommand.create(editingDomain, style, NotationPackage.eINSTANCE.getDrawerStyle_Collapsed(), newValue));
	}

	@Override
	protected String getCommandName() {
		return "Collapse Compartment"; //$NON-NLS-1$
	}

	@Override
	protected String getDebugName() {
		return "Collapse Compartment Tool"; //$NON-NLS-1$
	}
}
