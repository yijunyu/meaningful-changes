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
package org.eclipse.gmf.runtime.lite.properties;

import java.util.EventObject;

import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.ui.views.properties.PropertySheetPage;

public class RootUndoablePropertySheetEntry extends UndoablePropertySheetEntry {
	private CommandStackListener commandStackListener = new CommandStackListener() {
		public void commandStackChanged(EventObject e) {
//			myPage.getControl().getDisplay().asyncExec(new Runnable() {
//				public void run() {
//					if (myPage != null && !myPage.getControl().isDisposed()) {
//						myPage.refresh();
//					}
//				}
//			});
			refreshFromRoot();
		}
	};

	private CommandStack stack;

	private final PropertySheetPage myPage;

	/**
	 * Constructs the root entry using the given command stack.
	 * @param stack the command stack
	 */
	public RootUndoablePropertySheetEntry(CommandStack stack, PropertySheetPage propertySheetPage) {
		setCommandStack(stack);
		myPage = propertySheetPage;
	}

	public void dispose() {
		if (stack != null) {
			stack.removeCommandStackListener(commandStackListener);
		}
		super.dispose();
	}

	CommandStack getCommandStack() {
		return stack;
	}

	@Override
	RootUndoablePropertySheetEntry getRoot() {
		return this;
	}

	@Override
	public void resetPropertyValue() {
		// root does not have a default value
		return;
	}

	public void setCommandStack(CommandStack stack) {
		if (stack == this.stack) {
			return;
		}
		if (this.stack != null) {
			this.stack.removeCommandStackListener(commandStackListener);
		}
		this.stack = stack;
		if (stack != null) {
			stack.addCommandStackListener(commandStackListener);
		}
	}

	@Override
	protected void informRoot(UndoablePropertySheetEntry child, CompoundCommand command) {
		if (stack != null) {
			stack.execute(command);
		}
	}
}
