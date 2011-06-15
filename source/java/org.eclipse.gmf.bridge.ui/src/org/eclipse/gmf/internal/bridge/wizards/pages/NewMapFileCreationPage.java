/*
 * Copyright (c) 2006 Borland Software Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.wizards.pages;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.gmf.internal.bridge.wizards.WizardUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class NewMapFileCreationPage extends WizardNewFileCreationPage {
	private final WizardInput myInputHolder;

	public NewMapFileCreationPage(IStructuredSelection selection, WizardInput inputHolder) {
		super("newMapFileCreationPage", selection); //$NON-NLS-1$
		myInputHolder = inputHolder;
		setTitle(Messages.newPageTitle);
		setDescription(Messages.newPageDesc);
		setFileName(WizardUtil.getDefaultFileName(selection, "Theirs", "gmfmap")); //$NON-NLS-1$ //$NON-NLS-2$
	}

	protected boolean validatePage() {
		if (super.validatePage()) {
			// XXX don't like this - each page validation results in new file set to holder
			// rather need some end-of-page notification
			IPath p = getContainerFullPath().append(getFileName());
			myInputHolder.setMappingFile(ResourcesPlugin.getWorkspace().getRoot().getFile(p));
			return true;
		}
		return false;
	}
}
