/**
 * Copyright (c) 2006 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.part;

import java.io.IOException;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;

import org.eclipse.core.commands.operations.OperationHistoryFactory;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

import org.eclipse.gmf.graphdef.editor.edit.parts.CanvasEditPart;

import org.eclipse.gmf.runtime.common.core.command.CommandResult;

import org.eclipse.gmf.runtime.diagram.core.services.ViewService;

import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;

import org.eclipse.gmf.runtime.notation.Diagram;

import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.jface.wizard.Wizard;

import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import org.eclipse.ui.ide.IDE;

/**
 * @generated
 */
public class GMFGraphNewDiagramFileWizard extends Wizard {

	/**
	 * @generated
	 */
	private TransactionalEditingDomain myEditingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();

	/**
	 * @generated
	 */
	private WizardNewFileCreationPage myFileCreationPage;

	/**
	 * @generated
	 */
	private IFile mySelectedModelFile;

	/**
	 * @generated
	 */
	private IWorkbenchPage myWorkbenchPage;

	/**
	 * @generated
	 */
	private IStructuredSelection mySelection;

	/**
	 * @generated
	 */
	public GMFGraphNewDiagramFileWizard(IFile selectedModelFile, IWorkbenchPage workbenchPage, IStructuredSelection selection) {
		mySelectedModelFile = selectedModelFile;
		myWorkbenchPage = workbenchPage;
		mySelection = selection;
	}

	/**
	 * @generated
	 */
	public void addPages() {
		myFileCreationPage = new WizardNewFileCreationPage("Initialize new Ecore diagram file", mySelection) {

			public void createControl(Composite parent) {
				super.createControl(parent);

				IContainer parentContainer = mySelectedModelFile.getParent();
				String originalFileName = mySelectedModelFile.getProjectRelativePath().removeFileExtension().lastSegment();
				String fileExtension = ".gmfgraph_diagram";
				String fileName = originalFileName + fileExtension;
				for (int i = 1; parentContainer.getFile(new Path(fileName)).exists(); i++) {
					fileName = originalFileName + i + fileExtension;
				}
				setFileName(fileName);
			}

		};
		myFileCreationPage.setTitle("Diagram file");
		myFileCreationPage.setDescription("Create new diagram and initialize it using specified " + CanvasEditPart.MODEL_ID + " model content");
		addPage(myFileCreationPage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		final EObject diagramModelObject = load();
		if (diagramModelObject == null) {
			MessageDialog.openError(getShell(), "Error", "Failed to load user model");
			return false;
		}

		IFile diagramFile = myFileCreationPage.createNewFile();
		try {
			diagramFile.setCharset("UTF-8", new NullProgressMonitor()); //$NON-NLS-1$
		} catch (CoreException e) {
			GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to set charset for diagram file", e); //$NON-NLS-1$
		}

		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final Resource diagramResource = resourceSet.createResource(URI.createPlatformResourceURI(diagramFile.getFullPath().toString()));

		List affectedFiles = new LinkedList();
		affectedFiles.add(mySelectedModelFile);
		affectedFiles.add(diagramFile);

		AbstractTransactionalCommand command = new AbstractTransactionalCommand(myEditingDomain, "Initializing diagram contents", affectedFiles) { //$NON-NLS-1$

			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				int diagramVID = GMFGraphVisualIDRegistry.getDiagramVisualID(diagramModelObject);
				if (diagramVID != CanvasEditPart.VISUAL_ID) {
					return CommandResult.newErrorCommandResult("Incorrect model object stored as a root resource object"); //$NON-NLS-1$
				}
				Diagram diagram = ViewService.createDiagram(diagramModelObject, CanvasEditPart.MODEL_ID, GMFGraphDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
				return CommandResult.newOKCommandResult();
			}
		};

		try {
			OperationHistoryFactory.getOperationHistory().execute(command, new NullProgressMonitor(), null);
			diagramResource.save(Collections.EMPTY_MAP);
			IDE.openEditor(myWorkbenchPage, diagramFile);
		} catch (ExecutionException e) {
			GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to create model and diagram", e); //$NON-NLS-1$
		} catch (IOException ex) {
			GMFGraphDiagramEditorPlugin.getInstance().logError("Save operation failed for: " + diagramFile.getFullPath().toString(), ex); //$NON-NLS-1$
		} catch (PartInitException ex) {
			GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to open editor", ex); //$NON-NLS-1$
		}
		return true;
	}

	/**
	 * @generated
	 */
	private EObject load() {
		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		try {
			Resource resource = resourceSet.getResource(URI.createPlatformResourceURI(mySelectedModelFile.getFullPath().toString()), true);
			return (EObject) resource.getContents().get(0);
		} catch (WrappedException ex) {
			GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to load resource: " + mySelectedModelFile.getFullPath().toString(), ex); //$NON-NLS-1$
		}
		return null;
	}

}