/**
 * Copyright (c) 2006 Eclipse.org
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
import org.eclipse.gef.commands.ForwardUndoCompoundCommand;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertySheetEntry;

/**
 * Copied from <code>org.eclipse.gef.ui.properties.UndoablePropertySheetEntry</code> to provide EMF compatibility.
 */
public class UndoablePropertySheetEntry extends PropertySheetEntry {
	private CommandStackListener commandStackListener;

	private CommandStack stack;

	private UndoablePropertySheetEntry() {
	}

	/**
	 * Constructs the root entry using the given command stack.
	 * @param stack the command stack
	 */
	public UndoablePropertySheetEntry(CommandStack stack) {
		setCommandStack(stack);
	}

	protected PropertySheetEntry createChildEntry() {
		return new UndoablePropertySheetEntry();
	}

	public void dispose() {
		if (stack != null)
			stack.removeCommandStackListener(commandStackListener);
		super.dispose();
	}

	CommandStack getCommandStack() {
		//only the root has, and is listening too, the command stack
		if (getParent() != null) {
			return ((UndoablePropertySheetEntry)getParent()).getCommandStack();
		}
		return stack;
	}

	public void resetPropertyValue() {
		CompoundCommand cc = new CompoundCommand();
		ResetValueCommand restoreCmd;

		if (getParent() == null) {
			// root does not have a default value
			return;
		}

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

	void setCommandStack(CommandStack stack) {
		this.stack = stack;
		commandStackListener = new CommandStackListener() {
			public void commandStackChanged(EventObject e) {
				refreshFromRoot();
			}
		};
		stack.addCommandStackListener(commandStackListener);
	}

	protected void valueChanged(PropertySheetEntry child) {
		valueChanged((UndoablePropertySheetEntry)child,
				new ForwardUndoCompoundCommand());
	}

	void valueChanged(UndoablePropertySheetEntry child, CompoundCommand command) {
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
		if (getParent() != null) {
			((UndoablePropertySheetEntry)getParent()).valueChanged(this, command);
		}else {
			//I am the root entry
			stack.execute(command);
		}
	}
}
