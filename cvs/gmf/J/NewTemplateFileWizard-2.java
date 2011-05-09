/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.editor.ui;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;


public class NewTemplateFileWizard extends BasicNewFileResourceWizard {
	
    public NewTemplateFileWizard() {
    }

    @Override
    public void addPages() {
/*
    	final String extension = "xpt";
    	WizardNewFileCreationPage page = new WizardNewFileCreationPage("newFilePage1", getSelection()) { //$NON-NLS-1$ 

    		@Override
    		public String getErrorMessage() {
    			if ( !getFileName().endsWith("."+extension) ) {
					return "extension must be ."+extension;
				}
    			return null;
    		}
    		@Override
    		protected InputStream getInitialContents() {
    			if (super.getInitialContents() == null) {
    				return new ByteArrayInputStream("\u00ab\u00bb".getBytes());
    			}
    			return super.getInitialContents(); 
    		}

    	};
		addPage(page);
*/
    	super.addPages();
    	WizardNewFileCreationPage page = (WizardNewFileCreationPage) getPage("newFilePage1");
    	page.setTitle("New Template File");
    	page.setDescription("Creates a new xPand Template File");
    	page.setFileName("NewTemplateFile.xpt");
    }
}
