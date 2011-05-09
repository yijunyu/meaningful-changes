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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.util.Generator;
import org.eclipse.gmf.internal.codegen.CodeGenUIPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
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

	private static final String ASK_OK = "ask_ok";

	private IFile mySelection;

	private IWorkbenchPart myPart;

	protected IStatus myRunStatus;
	private GenEditorGenerator myGenModel;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		myPart = targetPart;
	}

	// TODO Jobs
	public void run(IAction action) {
		try {
			loadGenModel();
			assert getGenModel() != null;
			IStatus isGenModelValid = validateGenModel();
			if (!isGenModelValid.isOK()) {
				final String[] buttons = new String[] {IDialogConstants.PROCEED_LABEL, IDialogConstants.CANCEL_LABEL };
				final int[] buttonIDs = new int[] {IDialogConstants.PROCEED_ID, IDialogConstants.CANCEL_ID };
				final String msg = CodeGenUIPlugin.getBundleString("generatecode.badsrc");
				ErrorDialogEx dlg = new ErrorDialogEx(getShell(), action.getText(), msg, isGenModelValid, buttons, buttonIDs, 0);
				if (dlg.open() == IDialogConstants.CANCEL_ID) {
					return;
				}
			}
			
			doRunWithStatus();

			if (getRunStatus().isOK()) {
				if (!MessageDialogWithToggle.ALWAYS.equals(getPreferences().getString(ASK_OK))) {
					MessageDialogWithToggle.openInformation(getShell(), action.getText(), CodeGenUIPlugin.getBundleString("generatecode.ok"), CodeGenUIPlugin.getBundleString("generatecode.neveragain"), false, getPreferences(), ASK_OK);
				}
			} else if (myRunStatus.matches(IStatus.ERROR)) {
				CodeGenUIPlugin.getDefault().getLog().log(getRunStatus());
				ErrorDialog.openError(getShell(), action.getText(), CodeGenUIPlugin.getBundleString("generatecode.err"), getRunStatus());
			} else if (myRunStatus.matches(IStatus.WARNING)) {
				ErrorDialog.openError(getShell(), action.getText(), CodeGenUIPlugin.getBundleString("generatecode.warn"), getRunStatus());
			} else if (myRunStatus.matches(IStatus.INFO)) {
				ErrorDialog.openError(getShell(), action.getText(), CodeGenUIPlugin.getBundleString("generatecode.info"), getRunStatus());
			}
		} catch (InterruptedException ex) {
			// presumably, user canceled the operation, don't bother him with additional messages
		} finally {
			unloadGenModel();
		}
	}

	/**
	 * @return
	 */
	private void doRunWithStatus() throws InterruptedException {
		myRunStatus = Status.CANCEL_STATUS;
		try {
			new ProgressMonitorDialog(getShell()).run(true, true, this);
		} catch (InvocationTargetException ex) {
			Throwable targetException = ex.getTargetException();
			if (targetException instanceof CoreException) {
				myRunStatus = ((CoreException)targetException).getStatus();
			} else {
				myRunStatus = new Status(IStatus.ERROR, CodeGenUIPlugin.getPluginID(), 0, "Exception occurred while generating code", targetException);
			}
		}
	}

	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		Generator g = new Generator(getGenModel());
		g.run(monitor);
		myRunStatus = g.getRunStatus();
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

	private IStatus getRunStatus() {
		return myRunStatus;
	}

	protected final GenEditorGenerator getGenModel() {
		return myGenModel;
	}

	private void loadGenModel() {
		URI selected = URI.createPlatformResourceURI(mySelection.getFullPath().toString());
		ResourceSet srcResSet = new ResourceSetImpl();
// [vano]: see https://bugs.eclipse.org/bugs/show_bug.cgi?id=128998 for a details		
		srcResSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		Resource srcRes = srcResSet.getResource(selected, true);
		Object root = srcRes.getContents().get(0);
		if (root instanceof GenDiagram) {
			myGenModel = ((GenDiagram) root).getEditorGen();
		} else if (root instanceof GenEditorGenerator) {
			myGenModel = (GenEditorGenerator) root;
		}
		if (myGenModel != null && myGenModel.getDomainGenModel() != null) {
			myGenModel.getDomainGenModel().reconcile();
		}
	}

	private void unloadGenModel() {
		if (myGenModel != null && myGenModel.eResource() != null) {
			myGenModel.eResource().unload();
		}
		myGenModel = null;
	}

	private IStatus validateGenModel() {
		return BasicDiagnostic.toIStatus(Diagnostician.INSTANCE.validate(getGenModel()));
	}

	private Shell getShell() {
		return myPart.getSite().getShell();
	}

	private static IPreferenceStore getPreferences() {
		return CodeGenUIPlugin.getDefault().getPreferenceStore();
	}
}
