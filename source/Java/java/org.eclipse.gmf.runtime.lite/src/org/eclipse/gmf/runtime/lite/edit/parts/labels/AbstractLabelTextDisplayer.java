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
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ICellEditorValidator;

/**
 * Default implementation of {@link ILabelTextDisplayer}.
 */
public abstract class AbstractLabelTextDisplayer implements ILabelTextDisplayer {
	/**
	 * By default, labels are not editable. Clients may reimplement.
	 */
	public Command getApplyCommand(EObject source, String newValue) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * By default, the edit text is the same as the display text. Clients may reimplement.
	 */
	public String getEditText(EObject source) {
		return getDisplayText(source);
	}

	/**
	 * By default, no validation is performed. Clients may reimplement.
	 */
	public ICellEditorValidator getValidator() {
		return null;
	}
}
