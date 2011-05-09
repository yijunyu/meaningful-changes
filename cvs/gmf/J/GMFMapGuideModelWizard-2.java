/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.gmf.internal.bridge.wizards.pages.EntriesPage;
import org.eclipse.gmf.internal.bridge.wizards.pages.Messages;
import org.eclipse.gmf.internal.bridge.wizards.pages.NewMapFileCreationPage;
import org.eclipse.gmf.internal.bridge.wizards.pages.WizardInput;
import org.eclipse.gmf.internal.common.ui.ResourceLocationProvider;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.presentation.MapRefModelPages;
import org.eclipse.gmf.tooldef.GMFToolFactory;
import org.eclipse.gmf.tooldef.Palette;
import org.eclipse.gmf.tooldef.ToolRegistry;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @author artem
 */
public class GMFMapGuideModelWizard extends Wizard implements INewWizard {

	protected IStructuredSelection mySelection;

	protected final WizardInput myHolder;

	protected final MapRefModelPages refPages;

	private IWorkbench myWorkbench;

	private ToolRegistry myRegistry;

	public GMFMapGuideModelWizard() {
		setNeedsProgressMonitor(true);
		setWindowTitle(Messages.wizardTitle);
		myHolder = new WizardInput() {

			public EPackage getDomainModel() {
				return refPages.getDomainModel();
			}

			public Canvas getCanvasDef() {
				return refPages.getCanvas();
			}

			public ToolRegistry getToolDef() {
				if (isNewBlankToolDef()) {
					return myRegistry;
				}
				Palette palette = refPages.getPalette();
				if (palette == null) {
					return null;
				}
				return (ToolRegistry) palette.eContainer();
			}

			public boolean isNewBlankToolDef() {
				return refPages.shouldCreateNewToolingModel(false);
			}
		};
		refPages = new MapRefModelPages(true, myHolder.getResourceSet()) {

			/*
			 * graph page is the last since tooling should be selected
			 * prior to canvas update; see WizardInput.feedDefaultMapping()
			 */
			public void addPages(Wizard wizard, ISelection selection) {
				ResourceLocationProvider rloc = new ResourceLocationProvider(selection);
				addDomainPage(wizard, rloc);
				addToolPage(wizard, rloc);
				addGraphPage(wizard, rloc);
			}
		};
	}

	public void addPages() {
		addNewFilePage();
		refPages.addPages(this, mySelection);
		refPages.getDomainModelSelectionPage().setModelRequired(true);
		refPages.getGraphModelSelectionPage().setModelRequired(true);
		refPages.getToolModelSelectionPage().setModelRequired(true);
		refPages.getDomainModelExt().addObserver(new Observer() {

			public void update(Observable o, Object arg) {
				CanvasMapping cm = myHolder.getMapping().getDiagram();
				cm.setDomainModel((EPackage) arg);
			}
		});
		refPages.getDomainElementExt().addObserver(new Observer() {

			public void update(Observable o, Object arg) {
				CanvasMapping cm = myHolder.getMapping().getDiagram();
				cm.setDomainMetaElement((EClass) arg);
			}
		});
		refPages.getCanvasExt().addObserver(new Observer() {

			public void update(Observable o, Object arg) {
				CanvasMapping cm = myHolder.getMapping().getDiagram();
				cm.setDiagramCanvas((Canvas) arg);
				myHolder.feedDefaultMapping();
			}
		});
		refPages.allowNewToolingModel();
		refPages.getCreateNewToolingModelExt().addObserver(new Observer() {

			public void update(Observable o, Object arg) {
				if (((Boolean) arg).booleanValue()) {
					createBlankToolDef();
				}
			}
		});
		addDoMapPage();
	}

	@SuppressWarnings("unchecked")
	public URI createBlankToolDef() {
		checkUnload(myRegistry);
		myRegistry = null;
		IPath toolDefFile = myHolder.getMappingFile().getFullPath().removeFileExtension().addFileExtension(WizardInput.TOOLDEF_FILE_EXT);
		String baseName = myHolder.getMappingFile().getFullPath().removeFileExtension().lastSegment();
		int i = 1;
		final IWorkspace wr = myHolder.getMappingFile().getProject().getWorkspace();
		while (wr.getRoot().findMember(toolDefFile) != null) {
			toolDefFile = toolDefFile.removeLastSegments(1).append(baseName + i).addFileExtension(WizardInput.TOOLDEF_FILE_EXT);
			i++;
		}
		URI toolDefURI = URI.createPlatformResourceURI(toolDefFile.toString());
		myRegistry = GMFToolFactory.eINSTANCE.createToolRegistry();
		myRegistry.setPalette(GMFToolFactory.eINSTANCE.createPalette());
		myHolder.getResourceSet().createResource(toolDefURI).getContents().add(myRegistry);
		return toolDefURI;
	}

	private void checkUnload(EObject eobj) {
		if (eobj == null) {
			return;
		}
		if (eobj.eResource().getResourceSet() == myHolder.getResourceSet() && eobj.eResource().isLoaded()) {
			eobj.eResource().unload();
		}
	}

	protected void addNewFilePage() {
		addPage(new NewMapFileCreationPage(mySelection, myHolder));
	}

	protected void addDoMapPage() {
		addPage(new EntriesPage(myHolder));
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		myWorkbench = workbench;
		mySelection = selection;
	}

	public boolean performFinish() {
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {

			protected void execute(IProgressMonitor progressMonitor) {
				try {
					Map<String, Object> options = new HashMap<String, Object>();
					options.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
					if (myHolder.isNewBlankToolDef()) {
						myHolder.getToolDef().eResource().save(options);
					}
					myHolder.getMapping().eResource().save(options);
				} catch (Exception ex) {
					Plugin.log(ex);
				} finally {
					progressMonitor.done();
				}
			}
		};

		try {
			getContainer().run(false, false, operation);
			WizardUtil.selectReveal(myWorkbench, new StructuredSelection(getModelFile()));
			WizardUtil.openInEditor(myWorkbench, getModelFile());
		} catch (InvocationTargetException ex) {
			return false;
		} catch (InterruptedException ex) {
			return false;
		} catch (PartInitException ex) {
			Plugin.log(ex);
		}
		return true;
	}

	public IFile getModelFile() {
		return myHolder.getMappingFile();
	}

	public WizardInput getWizardInput() {
		return myHolder;
	}
}
