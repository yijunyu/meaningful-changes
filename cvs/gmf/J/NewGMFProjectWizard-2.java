/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.wizards;

import org.eclipse.jdt.ui.wizards.JavaCapabilityConfigurationPage;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

/**
 * @author artem
 */
public class NewGMFProjectWizard extends Wizard {
	private JavaCapabilityConfigurationPage myFirstPage;

	public NewGMFProjectWizard() {
	}

	public void addPage(IWizardPage page) {
		super.addPage(page);
		myFirstPage = new JavaCapabilityConfigurationPage();
		addPage(myFirstPage);
	}

	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

}
