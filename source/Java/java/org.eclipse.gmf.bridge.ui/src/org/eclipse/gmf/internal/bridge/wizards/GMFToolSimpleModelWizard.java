/*
 * Copyright (c) 2006, 2007 Borland Software Corp.
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.internal.bridge.resolver.StructureResolver;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.gmf.internal.bridge.wizards.pages.simple.DefinitionPage;
import org.eclipse.gmf.internal.bridge.wizards.pages.simple.DomainModelSelectionPage;
import org.eclipse.gmf.internal.bridge.wizards.pages.simple.DomainModelSourceImpl;
import org.eclipse.gmf.internal.bridge.wizards.pages.simple.StructureBuilder;
import org.eclipse.gmf.internal.bridge.wizards.pages.simple.ToolDefBuilder;
import org.eclipse.gmf.internal.common.URIUtil;
import org.eclipse.gmf.internal.common.ui.ModelSelectionPage;
import org.eclipse.gmf.internal.common.ui.ResourceLocationProvider;
import org.eclipse.gmf.tooldef.ToolRegistry;
import org.eclipse.gmf.tooldef.presentation.GMFToolModelWizard;

/**
 * @author dstadnik
 */
public class GMFToolSimpleModelWizard extends GMFToolModelWizard {

	protected ModelSelectionPage toolingModelSelectionPage;

	protected DefinitionPage toolingDefinitionPage;

	protected WizardOperationMode mode = new WizardOperationMode("gmftool", WizardOperationMode.CREATE); //$NON-NLS-1$

	public void setMode(String mode) {
		this.mode.setMode(mode);
	}

	/**
	 * Returns true if wizard operates in reconcile mode.
	 * Resource must be available if returns true.
	 */
	protected boolean isInReconcileMode() {
		return toolingModelSelectionPage != null && toolingModelSelectionPage.getResource() != null;
	}

	public boolean performFinish() {
		if (isInReconcileMode()) {
			reconcileModel();
			try {
				WizardUtil.saveModel(getContainer(), toolingModelSelectionPage.getResource());
			} catch (Exception exception) {
				Plugin.log(exception);
				return false;
			}
			IFile modelFile = getModelFile();
			if (modelFile != null) {
				WizardUtil.openEditor(modelFile);
			}
			return true;
		} else {
			return super.performFinish();
		}
	}

	protected EObject createInitialModel() {
		ToolDefBuilder builder = new ToolDefBuilder(null);
		return builder.process(toolingDefinitionPage.getModel());
	}

	protected void reconcileModel() {
		ToolRegistry existingToolRegistry = null;
		for (EObject element : toolingModelSelectionPage.getResource().getContents()) {
			if (element instanceof ToolRegistry) {
				existingToolRegistry = (ToolRegistry) element;
				break;
			}
		}
		ToolDefBuilder builder = new ToolDefBuilder(existingToolRegistry);
		ToolRegistry toolRegistry = builder.process(toolingDefinitionPage.getModel());
		if (toolRegistry != null && existingToolRegistry != toolRegistry) {
			toolingModelSelectionPage.getResource().getContents().add(toolRegistry);
		}
	}

	public void addPages() {
		ResourceLocationProvider rloc = new ResourceLocationProvider(selection);
		ResourceSet resourceSet = new ResourceSetImpl();
		if (mode.detectReconcile(rloc)) {
			toolingModelSelectionPage = new ModelSelectionPage("ToolingModelSelectionPage", rloc, resourceSet, "gmftool"); //$NON-NLS-1$ //$NON-NLS-2$
			toolingModelSelectionPage.setPageComplete(false);
			toolingModelSelectionPage.setModelRequired(true);
			toolingModelSelectionPage.setTitle(Messages.SimpleModelWizardToolModelSelectionPageTitle);
			toolingModelSelectionPage.setDescription(Messages.SimpleModelWizardToolModelSelectionPageDesc);
			addPage(toolingModelSelectionPage);
		} else {
			super.addPages();
			if (selection != null && !selection.isEmpty()) {
				Object selected = selection.getFirstElement();
				if (selected instanceof IFile) {
					newFileCreationPage.setFileName(WizardUtil.getDefaultFileName((IFile) selected, "gmftool")); //$NON-NLS-1$
				}
			}
		}

		DomainModelSelectionPage domainModelSelectionPage = new DomainModelSelectionPage("DomainModelSelectionPage", rloc, resourceSet); //$NON-NLS-1$
		domainModelSelectionPage.setTitle(Messages.SimpleModelWizardDomainModelSelectionPageTitle);
		domainModelSelectionPage.setDescription(Messages.SimpleModelWizardDomainModelSelectionPageDesc);
		addPage(domainModelSelectionPage);

		toolingDefinitionPage = new DefinitionPage("ToolingDefinitionPage", new StructureBuilder(new StructureResolver(), false), domainModelSelectionPage) { //$NON-NLS-1$

			protected DomainModelSourceImpl createDomainModelSource(EPackage contents, EClass diagramElement) {
				if (isInReconcileMode()) {
					return new DomainModelSourceImpl(contents, diagramElement) {

						public boolean isDisabled(EObject domainElement) {
							return ToolDefBuilder.getCreationTool(toolingModelSelectionPage.getResource().getAllContents(), domainElement) != null;
						}
					};
				}
				return super.createDomainModelSource(contents, diagramElement);
			}
		};
		toolingDefinitionPage.setTitle(Messages.SimpleModelWizardToolDefinitionPageTitle);
		toolingDefinitionPage.setDescription(Messages.SimpleModelWizardToolDefinitionPageDesc);
		addPage(toolingDefinitionPage);
	}

	public IFile getModelFile() {
		if (isInReconcileMode()) {
			return URIUtil.getFile(toolingModelSelectionPage.getResource().getURI());
		}
		return super.getModelFile();
	}
}
