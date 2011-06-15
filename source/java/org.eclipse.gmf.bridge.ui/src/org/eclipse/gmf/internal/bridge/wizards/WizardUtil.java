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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
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
		String fileNameBase = getFileBaseName(file);
		String modelFilename = fileNameBase + '.' + extension;
		for (int i = 1; file.getParent().findMember(modelFilename) != null; ++i) {
			modelFilename = fileNameBase + i + '.' + extension;
		}
		return modelFilename;
	}

	public static String getCapped(String s) {
		if (s == null) {
			return ""; //$NON-NLS-1$
		}
		s = s.trim();
		return s.length() > 1 ? Character.toUpperCase(s.charAt(0)) + s.substring(1) : s.toUpperCase();
	}

	public static String getCapName(EObject element) {
		if (element instanceof EClass) {
			return WizardUtil.getCapName((EClass) element);
		} else if (element instanceof EStructuralFeature) {
			return WizardUtil.getCapName((EStructuralFeature) element);
		} else {
			return null;
		}
	}

	public static String getCapName(EClass type) {
		return getCapped(type.getName());
	}

	public static String getCapName(EStructuralFeature feature) {
		EClass type = feature.getEContainingClass();
		return getCapped(type.getName()) + getCapped(feature.getName());
	}

	public static String getCapName(EStructuralFeature feature, EClass containingClass) {
		return getCapped(containingClass.getName()) + getCapped(feature.getName());
	}

	@SuppressWarnings("unchecked")
	public static void saveModel(IWizardContainer container, final Resource resource) throws Exception {
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {

			protected void execute(IProgressMonitor progressMonitor) {
				try {
					Map options = new HashMap();
					options.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
					resource.save(options);
				} catch (Exception exception) {
					Plugin.log(exception);
				} finally {
					progressMonitor.done();
				}
			}
		};
		container.run(false, false, operation);
	}

	public static boolean openEditor(IFile modelFile) {
		IWorkbench workbench = PlatformUI.getWorkbench();

		// Select the new file resource in the current view.
		//
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		final IWorkbenchPart activePart = page.getActivePart();
		if (activePart instanceof ISetSelectionTarget) {
			final ISelection targetSelection = new StructuredSelection(modelFile);
			workbenchWindow.getShell().getDisplay().asyncExec(new Runnable() {

				public void run() {
					((ISetSelectionTarget) activePart).selectReveal(targetSelection);
				}
			});
		}

		// Open an editor on the new file.
		//
		try {
			page.openEditor(new FileEditorInput(modelFile), workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());
		} catch (PartInitException exception) {
			MessageDialog.openError(workbenchWindow.getShell(), NLS.bind(Messages.WizardUtilUnableToOpenEditor, modelFile), exception.getMessage());
			return false;
		}

		return true;
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

	/**
	 * In case selection points to file resource, tries to find file 
	 * with same name and specified extension.
	 * 
	 * @param selection context to look at
	 * @param fileExt filename extension to look for
	 * @return 
	 */
	public static IFile findExistingFile(IStructuredSelection selection, String fileExt) {
		if (selection == null || selection.isEmpty() || false == selection.getFirstElement() instanceof IFile) {
			return null;
		}
		IFile selected = (IFile) selection.getFirstElement();
		String fileNameBase = getFileBaseName(selected);
		IResource candidate = selected.getParent().findMember(fileNameBase + '.' + fileExt);
		if (candidate != null && candidate.getType() == IResource.FILE && candidate.exists()) {
			return (IFile) candidate;
		}
		return null;
	}

	private static String getFileBaseName(IFile file) {
		String fileNameBase = file.getName();
		if (file.getFileExtension() != null) {
			fileNameBase = fileNameBase.substring(0, fileNameBase.length() - (file.getFileExtension().length() + 1));
		}
		return fileNameBase;
	}
}
