/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.map.editor.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.map.editor.edit.parts.MappingEditPart;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.presentation.MapRefModelPages;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class GMFMapCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected GMFMapCreationWizardPage page;

	/**
	 * @generated
	 */
	protected URI diagramURI;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final URI getDiagramURI() {
		return diagramURI;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	protected MapRefModelPages refPages;

	public void addPages() {
		super.addPages();
		if (page == null) {
			page = new GMFMapCreationWizardPage("Initial", getSelection()); //$NON-NLS-1$
		}
		addPage(page);
		refPages.addPages(this, selection);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagramURI = GMFMapDiagramEditorUtil.createAndOpenDiagram(page.getDiagramFileCreator(), page.getContainerFullPath(), page.getFileName(), page.getInitialContents(),
						MappingEditPart.MODEL_ID, getWorkbench().getActiveWorkbenchWindow(), monitor, isOpenNewlyCreatedDiagramEditor(), true);
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(), "Creation Problems", null, ((CoreException) e.getTargetException()).getStatus());
			} else {
				GMFMapDiagramEditorPlugin.getInstance().logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagramURI != null;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle("New GMFMap Diagram"); //$NON-NLS-1$
		setDefaultPageImageDescriptor(GMFMapDiagramEditorPlugin.getBundledImageDescriptor("icons/wizban/NewGMFMapWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
		refPages = new MapRefModelPages(true, null);
	}

	public Mapping createInitialModel() {
		return refPages.createMapping();
	}
}
