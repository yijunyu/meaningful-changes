/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.popup.actions;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * ErrorDialog with button variability of MessageDialog
 * TODO add toggle mechanism like in MessageDialogWithToggle
 * @author artem
 */
public class ErrorDialogEx extends ErrorDialog {

	private final String[] myButtonLabels;

	private final int[] myButtonIDs;

	private final int myDefaultButtonIndex;


	public ErrorDialogEx(Shell parentShell, String title, String message, IStatus status, String[] dialogButtonLabels, int[] buttonIDs, int defaultIndex) {
		super(parentShell, title, message, status, IStatus.OK | IStatus.INFO | IStatus.WARNING | IStatus.ERROR);
		assert dialogButtonLabels.length == buttonIDs.length;
		assert dialogButtonLabels.length > 0;
		assert defaultIndex >= 0 && defaultIndex < dialogButtonLabels.length;
		myButtonLabels = dialogButtonLabels;
		myButtonIDs = buttonIDs;
		myDefaultButtonIndex = defaultIndex;
	}

	protected void createButtonsForButtonBar(Composite parent) {
		for (int i = 0; i < myButtonLabels.length; i++) {
			createButton(parent, myButtonIDs[i], myButtonLabels[i], myDefaultButtonIndex == i);
		}
		createDetailsButton(parent);
	}

	protected void buttonPressed(int buttonId) {
		if (IDialogConstants.DETAILS_ID == buttonId) {
			super.buttonPressed(buttonId);
		} else {
			setReturnCode(buttonId);
			close();
		}
	}
}
