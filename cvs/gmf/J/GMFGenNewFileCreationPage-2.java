/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Fedorov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.transform;

import java.text.MessageFormat;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class GMFGenNewFileCreationPage extends WizardNewFileCreationPage {

	static final String EXT_GMFGEN = "gmfgen"; //$NON-NLS-1$

	public GMFGenNewFileCreationPage(String pageId, IStructuredSelection selection) {
		super(pageId, selection);
	}

	protected boolean validatePage() {
		if (super.validatePage()) {
			// Make sure the file ends in ".gmfgen".
			//
			String enteredExt = new Path(getFileName()).getFileExtension();
			if (enteredExt == null || !enteredExt.equals(EXT_GMFGEN)) {
				String pattern = Messages.GMFGenNewFileCreationPage_e_filename;
				setErrorMessage(MessageFormat.format(pattern, new Object [] { EXT_GMFGEN }));
				return false;
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}

	public IFile getModelFile() {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
	}
}
