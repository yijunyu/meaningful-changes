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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ICellEditorValidator;

/**
 * A label text displayer composed of two independent displayers, one for read-only operations (displaying labels) and one for 
 * write-only operations (parsing the input and creating the associated command).
 */
public class CompositeLabelTextDisplayer extends AbstractLabelTextDisplayer {
	private final ILabelTextDisplayer myReader;
	private final ILabelTextDisplayer myWriter;

	public CompositeLabelTextDisplayer(ILabelTextDisplayer reader, ILabelTextDisplayer writer) {
		myReader = reader;
		myWriter = writer;
	}

	@Override
	public Command getApplyCommand(EObject source, String newValue) {
		if (myWriter == null) {
			return UnexecutableCommand.INSTANCE;
		}
		return myWriter.getApplyCommand(source, newValue);
	}

	@Override
	public String getEditText(EObject source) {
		return myReader.getEditText(source);
	}

	@Override
	public ICellEditorValidator getValidator() {
		if (myWriter == null) {
			return null;
		}
		return myWriter.getValidator();
	}

	public String getDisplayText(EObject source) {
		return myReader.getDisplayText(source);
	}

	public boolean isAffectingEvent(Notification notification) {
		return myReader.isAffectingEvent(notification);
	}
}
