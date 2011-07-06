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

import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.ForwardUndoCompoundCommand;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertySheetEntry;

/**
 * Copied from <code>org.eclipse.gef.ui.properties.UndoablePropertySheetEntry</code> to provide EMF compatibility.
 */
class UndoablePropertySheetEntry extends PropertySheetEntry {
	UndoablePropertySheetEntry() {
	}

	protected PropertySheetEntry createChildEntry() {
		return new UndoablePropertySheetEntry();
	}

	CommandStack getCommandStack() {
		return getRoot().getCommandStack();
	}

	RootUndoablePropertySheetEntry getRoot() {
		return ((UndoablePropertySheetEntry)getParent()).getRoot();
	}

	public void resetPropertyValue() {
		CompoundCommand cc = new CompoundCommand();
		ResetValueCommand restoreCmd;

		//	Use our parent's values to reset our values.
		boolean change = false;
		Object[] objects = getParent().getValues();
		for (int i = 0; i < objects.length; i++) {
			IPropertySource source = getPropertySource(objects[i]);
			if (source.isPropertySet(getDescriptor().getId())) {
				//source.resetPropertyValue(getDescriptor()getId());
				restoreCmd = new ResetValueCommand();
				restoreCmd.setTarget(source);
				restoreCmd.setPropertyId(getDescriptor().getId());
				cc.add(restoreCmd);			
				change = true;
			}
		}
		if (change) {
			getCommandStack().execute(cc);
			refreshFromRoot();
		}
	}

	protected void valueChanged(PropertySheetEntry child) {
		valueChanged((UndoablePropertySheetEntry)child,
				new ForwardUndoCompoundCommand());
	}

	private void valueChanged(UndoablePropertySheetEntry child, CompoundCommand command) {
		CompoundCommand cc = new CompoundCommand();
		command.add(cc);

		SetValueCommand setCommand;
		for (int i = 0; i < getValues().length; i++) {
			setCommand = new SetValueCommand(child.getDisplayName());
			setCommand.setTarget(getPropertySource(getValues()[i]));
			setCommand.setPropertyId(child.getDescriptor().getId());
			setCommand.setPropertyValue(child.getValues()[i]);
			cc.add(setCommand);
		}

		// inform our parent
		informRoot(this, command);
	}

	protected void informRoot(UndoablePropertySheetEntry child, CompoundCommand command) {
		((UndoablePropertySheetEntry)getParent()).valueChanged(this, command);
	}
}
