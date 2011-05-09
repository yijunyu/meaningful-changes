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
package org.eclipse.gmf.internal.codegen.popup.actions;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.util.Generator;
import org.eclipse.gmf.internal.codegen.CodeGenUIPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Runs generation of diagram editor project
 * 
 * @author artem
 */
public class ExecuteTemplatesAction implements IObjectActionDelegate, IRunnableWithProgress {

	private static final String ASK_INFO = "ask_info";
	private static final String ASK_OK = "ask_ok";

	private IFile mySelection;

	private IWorkbenchPart myPart;

	private IStatus myRunStatus;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		myPart = targetPart;
	}

	public void run(IAction action) {
		try {
			myRunStatus = Status.CANCEL_STATUS;
			new ProgressMonitorDialog(myPart.getSite().getShell()).run(true, true, this);

			if (getRunStatus().isOK()) {
				if (!MessageDialogWithToggle.ALWAYS.equals(getPreferences().getString(ASK_OK))) {
					MessageDialogWithToggle.openInformation(getShell(), getStatusDialogTitle(), CodeGenUIPlugin.getBundleString("generatecode.ok"), CodeGenUIPlugin.getBundleString("generatecode.neveragain"), false, getPreferences(), ASK_OK);
				}
			} else if ((myRunStatus.getSeverity() & IStatus.ERROR) != 0) {
				CodeGenUIPlugin.getDefault().getLog().log(getRunStatus());
				MessageDialog.openError(getShell(), getStatusDialogTitle(), formatMessage("generatecode.err", getRunStatus()));
			} else if ((myRunStatus.getSeverity() & IStatus.WARNING) != 0) {
				MessageDialog.openWarning(getShell(), getStatusDialogTitle(), formatMessage("generatecode.warn", getRunStatus()));
			} else if ((myRunStatus.getSeverity() & IStatus.INFO) != 0) {
				if (!MessageDialogWithToggle.ALWAYS.equals(getPreferences().getString(ASK_INFO))) {
					MessageDialogWithToggle.openInformation(getShell(), getStatusDialogTitle(), formatMessage("generatecode.info", getRunStatus()), CodeGenUIPlugin.getBundleString("generatecode.neveragain"), false, getPreferences(), ASK_INFO);
				}
			}
		} catch (InvocationTargetException ex) {

		} catch (InterruptedException ex) {
		}
	}

	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		URI selected = URI.createPlatformResourceURI(mySelection.getFullPath().toString());
		ResourceSet srcResSet = new ResourceSetImpl();
		Resource srcRes = srcResSet.getResource(selected, true);
		GenDiagram gd = (GenDiagram) srcRes.getContents().get(0);
		gd.getEMFGenModel().reconcile();
		Generator g = new Generator(gd);
		g.run(monitor);
		myRunStatus = g.getRunStatus();
	}

	private String getStatusDialogTitle() {
		return CodeGenUIPlugin.getBundleString("generatecode.status.title");
	}

	public void selectionChanged(IAction action, ISelection selection) {
		mySelection = null;
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false) {
			return;
		}
		mySelection = (IFile) ((IStructuredSelection) selection).getFirstElement();
		action.setEnabled(true);
	}

	private String formatMessage(String bundleStringKey, IStatus status) {
		if (status.isMultiStatus()) {
			IStatus[] children = status.getChildren();
			StringBuffer sb = new StringBuffer();
			// don't care about too nested statuses just because will switch to
			// jobs soon, with
			// required support already in place
			for (int i = 0; i < children.length; i++) {
				sb.append(children[i].getMessage());
				sb.append('\n');
			}
			return CodeGenUIPlugin.getBundleString(bundleStringKey, new Object[] { sb.toString() });
		} else {
			return CodeGenUIPlugin.getBundleString(bundleStringKey, new Object[] { status.getMessage() });
		}
	}

	private IStatus getRunStatus() {
		return myRunStatus;
	}

	private static IPreferenceStore getPreferences() {
		return CodeGenUIPlugin.getDefault().getPreferenceStore();
	}

	private Shell getShell() {
		return myPart.getSite().getShell();
	}
}
