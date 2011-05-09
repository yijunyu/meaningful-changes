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

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.presentation.GMFGraphModelWizard;
import org.eclipse.gmf.internal.bridge.resolver.DomainModelSourceImpl;
import org.eclipse.gmf.internal.bridge.resolver.StructureBuilder;
import org.eclipse.gmf.internal.bridge.resolver.StructureResolver;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.gmf.internal.bridge.wizards.pages.DefinitionPage;
import org.eclipse.gmf.internal.bridge.wizards.pages.DomainModelSelectionPage;
import org.eclipse.gmf.internal.bridge.wizards.pages.GraphDefBuilder;
import org.eclipse.gmf.internal.common.ui.ModelSelectionPage;
import org.eclipse.gmf.internal.common.ui.ResourceLocationProvider;

/**
 * @author dstadnik
 */
public class GMFGraphSimpleModelWizard extends GMFGraphModelWizard {

	protected ModelSelectionPage graphicalModelSelectionPage;

	protected DefinitionPage graphicalDefinitionPage;

	protected WizardOperationMode mode = new WizardOperationMode("gmfgraph", WizardOperationMode.CREATE); //$NON-NLS-1$

	public void setMode(String mode) {
		this.mode.setMode(mode);
	}

	/**
	 * Returns true if wizard operates in reconcile mode.
	 * Resource must be available if returns true.
	 */
	protected boolean isInReconcileMode() {
		return graphicalModelSelectionPage != null && graphicalModelSelectionPage.getResource() != null;
	}

	public boolean performFinish() {
		if (isInReconcileMode()) {
			reconcileModel();
			try {
				WizardUtil.saveModel(getContainer(), graphicalModelSelectionPage.getResource());
			} catch (Exception exception) {
				Plugin.log(exception);
				return false;
			}
			WizardUtil.openEditor(graphicalModelSelectionPage.getResource().getURI());
			return true;
		} else {
			return super.performFinish();
		}
	}

	protected EObject createInitialModel() {
		GraphDefBuilder builder = new GraphDefBuilder(null);
		return builder.process(graphicalDefinitionPage.getModel());
	}

	@SuppressWarnings("unchecked")
	protected void reconcileModel() {
		Canvas existingCanvas = null;
		for (EObject element : (List<? extends EObject>) graphicalModelSelectionPage.getResource().getContents()) {
			if (element instanceof Canvas) {
				existingCanvas = (Canvas) element;
				break;
			}
		}
		GraphDefBuilder builder = new GraphDefBuilder(existingCanvas);
		Canvas canvas = builder.process(graphicalDefinitionPage.getModel());
		if (canvas != null && existingCanvas != canvas) {
			graphicalModelSelectionPage.getResource().getContents().add(canvas);
		}
	}

	public void addPages() {
		ResourceLocationProvider rloc = new ResourceLocationProvider(selection);
		if (mode.detectReconcile(rloc)) {
			graphicalModelSelectionPage = new ModelSelectionPage("GraphicalModelSelectionPage", rloc) { //$NON-NLS-1$

				protected String getModelFileExtension() {
					return "gmfgraph"; //$NON-NLS-1$
				}

				protected void setResource(Resource resource) {
					super.setResource(resource);
					setPageComplete(getResource() != null);
				}
			};
			graphicalModelSelectionPage.setPageComplete(false);
			graphicalModelSelectionPage.setTitle("Graphical Definition Model");
			graphicalModelSelectionPage.setDescription("Select graphical definition model to update. New diagram elements will be added to this model.");
			addPage(graphicalModelSelectionPage);
		} else {
			super.addPages();
			if (selection != null && !selection.isEmpty()) {
				Object selected = selection.getFirstElement();
				if (selected instanceof IFile) {
					newFileCreationPage.setFileName(WizardUtil.getDefaultFileName((IFile) selected, "gmfgraph")); //$NON-NLS-1$
				}
			}
		}

		DomainModelSelectionPage domainModelSelectionPage = new DomainModelSelectionPage("DomainModelSelectionPage", rloc); //$NON-NLS-1$
		domainModelSelectionPage.setTitle("Domain Model");
		domainModelSelectionPage.setDescription("Select file with ecore domain model");
		addPage(domainModelSelectionPage);

		graphicalDefinitionPage = new DefinitionPage("GraphicalDefinitionPage", new StructureBuilder(new StructureResolver(), true), domainModelSelectionPage) { //$NON-NLS-1$

			protected DomainModelSourceImpl createDomainModelSource(EPackage contents, EClass diagramElement) {
				if (isInReconcileMode()) {
					return new DomainModelSourceImpl(contents, diagramElement) {

						public boolean isDisabled(EObject domainElement) {
							return GraphDefBuilder.getDiagramElement(graphicalModelSelectionPage.getResource().getAllContents(), domainElement) != null;
						}
					};
				}
				return super.createDomainModelSource(contents, diagramElement);
			}
		};
		graphicalDefinitionPage.setTitle("Graphical Definition");
		graphicalDefinitionPage.setDescription("Specify basic graphical definition of the domain model");
		addPage(graphicalDefinitionPage);
	}
}
