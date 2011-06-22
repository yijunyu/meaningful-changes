/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: dvorak - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.popup.actions;

import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.internal.common.migrate.ModelLoadHelper;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Performs migration of the model contained in the file selection to the latest
 * version of it metamodel.   
 */
public class MigrateModelAction implements IObjectActionDelegate {
	
	private IFile fileSelection;
	private IWorkbenchPart wrkbenchPart;

	
	public MigrateModelAction() {
		super();
	}
	
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		wrkbenchPart = targetPart;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.fileSelection = null;
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false) {
			return;
		}
		this.fileSelection = (IFile) ((IStructuredSelection) selection).getFirstElement();
		action.setEnabled(true);
	}

	public void run(IAction action) {		
		final IFile modelFile = this.fileSelection;
		URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
		ModelLoadHelper loadHelper = new ModelLoadHelper(new ResourceSetImpl(), fileURI);

		if (!loadHelper.isOK()) {
			DiagnosticsDialog.openOk(getShell(), action.getText(), Messages.migration_problemsDetectedTitle, loadHelper.getDiagnostics());
			return;
		}
		InputDialog dlg = new InputDialog(getShell(), Messages.migration_modelDestinationFileTitle, 
				Messages.migration_specifyFileNameLabel, modelFile.getName(), new IInputValidator() {

			public String isValid(String newText) {
				IStatus fileNameStatus = ResourcesPlugin.getWorkspace().validateName(newText, IResource.FILE);
				return fileNameStatus.isOK() ? null : fileNameStatus.getMessage();
			}
		});

		if (dlg.open() != Window.OK) {
			return;
		}
		
		Resource resource = loadHelper.getLoadedResource();

		String destFileName = dlg.getValue();
		if (fileSelection.getParent().findMember(destFileName) != null) {
			boolean overwrite = MessageDialog.openQuestion(getShell(), Messages.migration_confirmModelOverwriteTitle, 
						NLS.bind(Messages.migration_confirmModelOverwriteMessage, destFileName));
			if (!overwrite) {
				return;
			}
		}

		URI migratedURI = fileURI.trimSegments(1).appendSegment(destFileName);
		resource.setURI(migratedURI);
		IStatus saveStatus = Status.OK_STATUS;
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (Exception e) {
			saveStatus = BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e));
		}

		openErrorDialog(action.getText(), Messages.migration_destinationModelSaveError, saveStatus);
	}

	private void openErrorDialog(String title, String message, IStatus errorStatus) {
		final String[] buttons = new String[] { IDialogConstants.OK_LABEL };
		final int[] buttonIDs = new int[] { IDialogConstants.OK_ID };
		ErrorDialogEx dlg = new ErrorDialogEx(getShell(), title, message, errorStatus, buttons, buttonIDs, 0);
		dlg.open();
	}

	private Shell getShell() {
		return wrkbenchPart.getSite().getShell();
	}
}
