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
package org.eclipse.gmf.runtime.lite.shortcuts;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.lite.commands.CreateNotationalElementCommand;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Interface that should be implemented by a diagram plugin that provides shortcut elements to other diagrams.
 */
public interface IShortcutProvider {
	/**
	 * Creates shortcut edit part for the given shortcut view in the given parent.
	 */
	public EditPart createShortcutEditPart(EditPart context, View shortcutView);

	/**
	 * Returns the command to create a shortcut in the given containerView for the given underlying model object.
	 * May return <code>null</code> if the receiver is not applicable for the given underlying model object.
	 */
	public CreateNotationalElementCommand getCreateShortcutCommand(View containerView, EObject underlyingModelObject);

	/**
	 * Returns the command to refresh the notational representation of the given top-level shortcut. Should return null to indicate a no-op command.
	 */
	public Command getRefreshShortcutCommand(View shortcut);
}
