/*
 * Copyright (c) 2007 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.popup.actions;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.gmf.internal.bridge.wizards.WizardUtil;
import org.eclipse.gmf.internal.common.ui.ElementSelectorExtension;
import org.eclipse.gmf.internal.common.ui.ExtensibleModelSelectionPage;
import org.eclipse.gmf.internal.common.ui.ListElementSelectorExtension;
import org.eclipse.gmf.internal.common.ui.PredefinedModelExtension;
import org.eclipse.gmf.internal.common.ui.ResourceLocationProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public class GMFGenExtensionModelWizard extends Wizard implements IWorkbenchWizard {
	private static final String GMFGEN_FILE_EXTENSION = "gmfgen"; //$NON-NLS-1$
	private static final String ECORE_FILE_EXTENSION = "ecore"; //$NON-NLS-1$

	private IWorkbench myWorkbench;
	private IStructuredSelection mySelection;
	private ElementSelectorExtension myRootElementSelectorExtension;
	private ResourceSet myResourceSet;
	private ResourceLocationProvider myResourceLocationProvider;
	
	public GMFGenExtensionModelWizard() {
		super();
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		myWorkbench = workbench;
		mySelection = selection;
		setWindowTitle(Messages.GMFGenExtensionModelWizard_windowTitle);
	}
	
	public IWorkbench getWorkbench() {
		return myWorkbench;
	}
	
	public IStructuredSelection getSelection() {
		return mySelection;
	}
	
	protected ResourceSet getResourceSet() {
		if (myResourceSet == null) {
			myResourceSet = new ResourceSetImpl();
		}
		return myResourceSet;
	}

	public ElementSelectorExtension getRootElementSelectorExtension() {
		return myRootElementSelectorExtension;
	}
	
	public ResourceLocationProvider getResourceLocationProvider() {
		return myResourceLocationProvider;
	}
	
	@Override
	public void addPages() {
		myResourceLocationProvider = new ResourceLocationProvider(getSelection());
		ExtensibleModelSelectionPage domainModelSelectionPage = new ExtensibleModelSelectionPage("domain", myResourceLocationProvider, getResourceSet(), ECORE_FILE_EXTENSION); //$NON-NLS-1$
		domainModelSelectionPage.setTitle(Messages.GMFGenExtensionModelWizard_pageTitle);
		domainModelSelectionPage.setDescription(Messages.GMFGenExtensionModelWizard_pageDescription);
		List<URI> uris = myResourceLocationProvider.getSelectedURIs(ECORE_FILE_EXTENSION);
		domainModelSelectionPage.addExtension("prem", new PredefinedModelExtension(domainModelSelectionPage, uris)); //$NON-NLS-1$
		myRootElementSelectorExtension = new ListElementSelectorExtension() {

			protected String getModelElementName() {
				return Messages.GMFGenExtensionModelWizard_classChooserLabel;
			}

			protected String getModelElementLabel(EObject modelElement) {
				String name = ((EClass) modelElement).getName();
				if (name == null || name.trim().length() == 0) {
					name = Messages.GMFGenExtensionModelWizard_unnamedClassName;
				}
				return name;
			}

			@Override
			protected boolean isApplicable(EObject element) {
				EClass clazz = (EClass) element;
				return !clazz.isAbstract();
			}
			
			@Override
			protected EClass getModelElementClass() {
				return EcorePackage.eINSTANCE.getEClass();
			}

			@Override
			protected void sortModelElements(List<EObject> elements) {
				// we override this method to turn off sorting of the list and provide natural classes order
			};
		};
		domainModelSelectionPage.addExtension("domainElement", myRootElementSelectorExtension); //$NON-NLS-1$
		addPage(domainModelSelectionPage);
		super.addPages();
	}

	@Override
	public boolean performFinish() {
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {

			protected void execute(IProgressMonitor progressMonitor) {
				try {
					ElementSelectorExtension extension = getRootElementSelectorExtension();
					EClass rootClass = (EClass) extension.getModelElement();
					EObject instantiated = rootClass.getEPackage().getEFactoryInstance().create(rootClass);
					List<URI> gmfgenURIs = getResourceLocationProvider().getSelectedURIs(GMFGEN_FILE_EXTENSION);
					for (int i=0; i<gmfgenURIs.size(); i++) {
						URI nextGmfgenURI = gmfgenURIs.get(i);
						addExtensionMetamodelRootToGmfgen(nextGmfgenURI, instantiated);
					}
				} catch (Exception ex) {
					Plugin.log(ex);
				} finally {
					progressMonitor.done();
				}
			}
		};

		try {
			getContainer().run(false, false, operation);
			List<IFile> selectedGmfgenFiles = getResourceLocationProvider().getSelectedFiles(GMFGEN_FILE_EXTENSION, false);
			WizardUtil.selectReveal(getWorkbench(), new StructuredSelection(selectedGmfgenFiles));
			if (!selectedGmfgenFiles.isEmpty()) {
				WizardUtil.openInEditor(getWorkbench(), selectedGmfgenFiles.get(0));
			}
		} catch (InvocationTargetException ex) {
			return false;
		} catch (InterruptedException ex) {
			return false;
		} catch (PartInitException ex) {
			Plugin.log(ex);
		}
		return true;
	}

	protected void addExtensionMetamodelRootToGmfgen(URI nextGmfgenURI, EObject instantiated) throws IOException {
		Resource gmfgenModel = getResourceSet().createResource(nextGmfgenURI, ContentHandler.UNSPECIFIED_CONTENT_TYPE);
		gmfgenModel.load(getResourceSet().getLoadOptions());
		gmfgenModel.getContents().add(instantiated);
		gmfgenModel.save(null);
		gmfgenModel.unload();
	}

}
