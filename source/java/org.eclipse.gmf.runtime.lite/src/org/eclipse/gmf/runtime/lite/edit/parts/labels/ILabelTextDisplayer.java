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
package org.eclipse.gmf.runtime.lite.edit.parts.labels;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ICellEditorValidator;

/**
 * Implementors of this interface are responsible for providing labels representing model elements
 * as well as for making it possible to edit the label and apply the values to the model element.
 * <p>IMPORTANT: This interface is <EM>not</EM> intended to be implemented by clients. 
 * Clients should inherit from {@link org.eclipse.gmf.runtime.lite.edit.parts.labels.AbstractLabelTextDisplayer}.  
 * New methods may be added in the future.
 */
public interface ILabelTextDisplayer {
	/**
	 * Returns the text a label for the given source object should display.
	 */
	public String getDisplayText(EObject source);

	/**
	 * Returns the text that should be displayed when the user edits the label.
	 */
	public String getEditText(EObject source);

	/**
	 * Returns the input validator or <code>null</code> if no validation is required. 
	 */
	public ICellEditorValidator getValidator();

	/**
	 * Returns the command that applies the new value.
	 */
	public Command getApplyCommand(EObject source, String newValue);

	/**
	 * Returns whether the given notification may cause a source to require update of the label.
	 */
	public boolean isAffectingEvent(Notification notification);
}
