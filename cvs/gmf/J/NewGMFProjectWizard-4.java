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

import org.eclipse.emf.codegen.ecore.ui.EmptyProjectWizard;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.gmf.internal.bridge.wizards.pages.ShowDashboardPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * Quick way to introduce GMF Project wizard.
 * XXX Get rid of EmptyProjectWizard and ecore.ui dependency once you know what could be added here.
 * 
 * @author artem
 */
public class NewGMFProjectWizard extends EmptyProjectWizard {

	private boolean showDashboard;

	private ShowDashboardPage sdp;

	public void addPages() {
		super.addPages();
		sdp = new ShowDashboardPage("Show Dashboard", showDashboard); //$NON-NLS-1$
		sdp.setTitle("Show Dashboard");
		sdp.setDescription("Show dashboard view for the created project");
		addPage(sdp);
	}

	public void setShowDashboard(boolean showDashboard) {
		this.showDashboard = showDashboard;
	}

	public boolean performFinish() {
		boolean created = super.performFinish();
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (created && sdp.isShowDashboard() && window != null && window.getActivePage() != null) {
			try {
				window.getActivePage().showView("org.eclipse.gmf.bridge.ui.dashboard.DashboardPart");
			} catch (PartInitException e) {
				Plugin.log(e);
			}
		}
		return created;
	}
}
