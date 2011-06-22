/*
 * Copyright (c) 2005, 2006 Borland Software Corporation
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

import org.eclipse.emf.codegen.ecore.ui.EmptyProjectWizard;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.gmf.internal.bridge.wizards.pages.ShowDashboardPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * Quick way to introduce GMF Project wizard. XXX Get rid of EmptyProjectWizard
 * and ecore.ui dependency once you know what could be added here.
 * 
 * @author artem
 */
public class NewGMFProjectWizard extends EmptyProjectWizard {

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		setWindowTitle(Plugin.getBundleString("newProjectWizard.name")); //$NON-NLS-1$
	}

	private static final String SD_PROPERTY = "show_dashboard"; //$NON-NLS-1$

	private boolean showDashboard;

	private ShowDashboardPage sdp;

	private String initialProjectName;

	public NewGMFProjectWizard() {
		super();
		showDashboard = Plugin.getDefault().getPreferenceStore().getBoolean(SD_PROPERTY);
	}

	public void addPages() {
		super.addPages();
		WizardNewProjectCreationPage page = (WizardNewProjectCreationPage) getPage("NewProjectCreationPage");  //$NON-NLS-1$
		if (page != null) {
			page.setInitialProjectName(initialProjectName);
			page.setDescription(Plugin.getBundleString("newProjectWizard.desc")); //$NON-NLS-1$
			page.setTitle(Plugin.getBundleString("newProjectWizard.name")); //$NON-NLS-1$
		}
		sdp = new ShowDashboardPage("Show Dashboard", showDashboard); //$NON-NLS-1$
		sdp.setTitle(Plugin.getBundleString("showDashboardPage.name")); //$NON-NLS-1$
		sdp.setDescription(Plugin.getBundleString("showDashboardPage.desc")); //$NON-NLS-1$
		addPage(sdp);
	}

	public void setShowDashboard(boolean showDashboard) {
		this.showDashboard = showDashboard;
	}

	public boolean performFinish() {
		showDashboard = sdp.isShowDashboard();
		Plugin.getDefault().getPreferenceStore().setValue(SD_PROPERTY, showDashboard);
		boolean created = super.performFinish();
		if (!created) {
			return false;
		}
		if (showDashboard) {
			getShell().getDisplay().asyncExec(new Runnable() {
				public void run() {
					openDashboardView();
				}
			});
		}
		return created;
	}

	protected void openDashboardView() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null && window.getActivePage() != null) {
			try {
				window.getActivePage().showView("org.eclipse.gmf.bridge.ui.dashboard.DashboardPart"); //$NON-NLS-1$
			} catch (PartInitException e) {
				Plugin.log(e);
			}
		}
	}

	public void setInitialProjectName(String initialProjectName) {
		this.initialProjectName = initialProjectName;
	}
}
