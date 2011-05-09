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

import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.gef.commands.Command;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySource2;

/**
 * Copied from <code>org.eclipse.gef.ui.properties.ResetValueCommand</code> to provide EMF compatibility.
 */
class ResetValueCommand extends Command {
	/** the property that has to be reset */
	protected Object propertyName;
	/** the current non-default value of the property */
	protected Object undoValue;
	/** the property source whose property has to be reset */
	protected IPropertySource target;

	/**
	 * Default Constructor: Sets the label for the Command
	 */
	public ResetValueCommand() {
		super("Restore Default Value");
	}

	/**
	 * Returns <code>true</code> IFF:<br>
	 * 1) the target and property have been specified<br>
	 * 2) the property has a default value<br>
	 * 3) the value set for that property is not the default
	 */
	public boolean canExecute() {
		boolean answer = false;
		if (target != null && propertyName != null) {
			answer = target.isPropertySet(propertyName);
			if (target instanceof IPropertySource2) {
				answer = answer 
						&& (((IPropertySource2) target).isPropertyResettable(propertyName));
			}
		}
		return answer;
	}

	/**
	 * Caches the undo value and invokes redo()
	 */
	public void execute() {
		undoValue = target.getPropertyValue(propertyName);
		if (undoValue instanceof IPropertySource) {
			undoValue = ((IPropertySource) undoValue).getEditableValue();
		} else if (undoValue instanceof IItemPropertySource) {
			undoValue = ((IItemPropertySource) undoValue).getEditableValue(propertyName);
		}
		redo();
	}

	/**
	 * Sets the IPropertySource.
	 * @param propSource the IPropertySource whose property has to be reset
	 */
	public void setTarget(IPropertySource propSource) {
		target = propSource;
	}

	/**
	 * Resets the specified property on the specified IPropertySource
	 */
	public void redo() {
		target.resetPropertyValue(propertyName);
	}

	/**
	 * Sets the property that is to be reset.
	 * @param pName the property to be reset
	 */
	public void setPropertyId(Object pName) {
		propertyName = pName;
	}

	/**
	 * Restores the non-default value that was reset. 
	 */
	public void undo() {
		target.setPropertyValue(propertyName, undoValue);
	}
}
