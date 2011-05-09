/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

/**
 * @author dstadnik
 */
public class WizardUtil {

	private WizardUtil() {
	}

	public static String getDefaultFileName(IStructuredSelection selection, String defaultName, String extension) {
		if (selection != null && !selection.isEmpty()) {
			Object selected = selection.getFirstElement();
			if (selected instanceof IFile) {
				return getDefaultFileName((IFile) selected, extension);
			}
		}
		return defaultName + '.' + extension;
	}

	public static String getDefaultFileName(IFile file, String extension) {
		String fileNameBase = file.getName();
		if (file.getFileExtension() != null) {
			fileNameBase = fileNameBase.substring(0, fileNameBase.length() - (file.getFileExtension().length() + 1));
		}
		String modelFilename = fileNameBase + "." + extension;
		for (int i = 1; file.getParent().findMember(modelFilename) != null; ++i) {
			modelFilename = fileNameBase + i + "." + extension;
		}
		return modelFilename;
	}

	public static String getCapName(EStructuralFeature feature) {
		EClass type = feature.getEContainingClass();
		String name = type.getName();
		if (feature.getName().length() > 0) {
			name += Character.toUpperCase(feature.getName().charAt(0));
		}
		if (feature.getName().length() > 1) {
			name += feature.getName().substring(1);
		}
		return name;
	}

	public static void selectReveal(IWorkbench workbench, final ISelection selection) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		final IWorkbenchPart activePart = page.getActivePart();
		if (activePart instanceof ISetSelectionTarget) {
			workbench.getDisplay().asyncExec(new Runnable() {
				public void run() {
					((ISetSelectionTarget) activePart).selectReveal(selection);
				}
			});
		}
	}

	public static void openInEditor(IWorkbench workbench, IFile file) throws PartInitException {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		page.openEditor(new FileEditorInput(file), workbench.getEditorRegistry().getDefaultEditor(file.getFullPath().toString()).getId());
	}
}
