/*
 * Copyright (c) 2006, 2007 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.ui.dashboard;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.draw2d.ActionEvent;
import org.eclipse.draw2d.ActionListener;
import org.eclipse.draw2d.CheckBox;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.presentation.EcoreModelWizard;
import org.eclipse.emf.importer.ui.EMFModelWizard;
import org.eclipse.emf.importer.ui.GenModelReloadActionDelegate;
import org.eclipse.gmf.bridge.ui.dashboard.DashboardAction;
import org.eclipse.gmf.bridge.ui.dashboard.DashboardFacade;
import org.eclipse.gmf.bridge.ui.dashboard.DashboardState;
import org.eclipse.gmf.codegen.gmfgen.presentation.GMFGenModelWizard;
import org.eclipse.gmf.gmfgraph.presentation.GMFGraphModelWizard;
import org.eclipse.gmf.internal.bridge.ui.dashboard.DashboardActionRegistry.DashboardActionDescriptor;
import org.eclipse.gmf.internal.bridge.ui.dashboard.actions.TransformMap2GenModelAction;
import org.eclipse.gmf.internal.bridge.wizards.GMFGraphSimpleModelWizard;
import org.eclipse.gmf.internal.bridge.wizards.GMFMapGuideModelWizard;
import org.eclipse.gmf.internal.bridge.wizards.GMFToolSimpleModelWizard;
import org.eclipse.gmf.internal.bridge.wizards.WizardOperationMode;
import org.eclipse.gmf.internal.common.URIUtil;
import org.eclipse.gmf.internal.common.ui.FileSelector;
import org.eclipse.gmf.mappings.presentation.GMFMapModelWizard;
import org.eclipse.gmf.tooldef.presentation.GMFToolModelWizard;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

/**
 * @author dstadnik
 */
public class DashboardMediator implements DashboardFacade {

	private static final boolean STRICT = true;

	private DashboardFigure view;

	private Shell shell;

	private IProject project;

	private DashboardState state;

	private Map<String, ActionContainer> locations;

	private Map<DashboardActionDescriptor, IFigure> contributions;

	private Map<String, CheckBox> optionFigures;

	public DashboardMediator(Shell shell) {
		state = new DashboardState();
		locations = new HashMap<String, ActionContainer>();
		contributions = new HashMap<DashboardActionDescriptor, IFigure>();
		optionFigures = new HashMap<String, CheckBox>();
		this.shell = shell;
	}

	public boolean isStrict() {
		return STRICT;
	}

	public Shell getShell() {
		return shell;
	}

	public void setView(DashboardFigure view) {
		this.view = view;
		locations.put(DashboardFacade.LOCATION_DM, view.getDMFigure());
		locations.put(DashboardFacade.LOCATION_DGM, view.getDGMFigure());
		locations.put(DashboardFacade.LOCATION_GDM, view.getGDMFigure());
		locations.put(DashboardFacade.LOCATION_TDM, view.getTDMFigure());
		locations.put(DashboardFacade.LOCATION_MM, view.getMMFigure());
		locations.put(DashboardFacade.LOCATION_GM, view.getGMFigure());
		locations.put(DashboardFacade.LOCATION_MM2GM, view.getMM2GMFigure());
		view.getDGMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Select, new SelectDGMAction()));
		view.getDGMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Edit, new EditDGMAction()));
		view.getDGMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Reload, new ReloadDGMAction()));
		view.getGDMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Select, new SelectGDMAction()));
		view.getGDMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Edit, new EditGDMAction()));
		view.getGDMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Create, new CreateGDMAction()));
		view.getDMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Select, new SelectDMAction()));
		view.getDMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Edit, new EditDMAction()));
		view.getDMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Create, new CreateDMAction()));
		view.getTDMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Select, new SelectTDMAction()));
		view.getTDMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Edit, new EditTDMAction()));
		view.getTDMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Create, new CreateTDMAction()));
		view.getMMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Select, new SelectMMAction()));
		view.getMMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Edit, new EditMMAction()));
		view.getMMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Create, new CreateMMAction()));
		view.getGMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Select, new SelectGMAction()));
		view.getGMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Edit, new EditGMAction()));
		view.getGMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Create, new CreateGMAction()));
		view.getDM2DGMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Derive, new DeriveDGMAction()));
		view.getDM2GDMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Derive, new DeriveGDMAction()));
		view.getDM2TDMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Derive, new DeriveTDMAction()));
		view.getDM2MMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Combine, new CombineMMAction()));
		view.getMM2GMFigure().addAction(createOptionFigure(Messages.DashboardMediator_RCP, DashboardFacade.OPTION_RCP));
		view.getMM2GMFigure().addAction(createLinkFigure(Messages.DashboardMediator_Transform, new TransformMap2GenModelAction()));
		for (DashboardActionDescriptor descriptor : Plugin.getDefault().getDashboardActionRegistry().getDescriptors()) {
			addDashboardAction(descriptor);
		}
		updateStatus();
	}

	public void addDashboardAction(DashboardActionDescriptor descriptor) {
		ActionContainer location = locations.get(descriptor.getLocation());
		if (location == null) {
			Plugin.getDefault().getLog().log(Plugin.createError("Unknown GMF Dashboard location: " + descriptor.getLocation(), null)); //$NON-NLS-1$
			return;
		}
		DashboardAction action = descriptor.createDashboardAction();
		if (action == null) {
			return;
		}
		IFigure actionFigure = createLinkFigure(descriptor.getLabel(), action);
		location.addAction(actionFigure, descriptor.isStandard());
		contributions.put(descriptor, actionFigure);
	}

	public void removeDashboardAction(DashboardActionDescriptor descriptor) {
		IFigure actionFigure = contributions.remove(descriptor);
		if (actionFigure == null) {
			return; // not contributed; just ignore
		}
		ActionContainer location = locations.get(descriptor.getLocation());
		if (location == null) {
			Plugin.getDefault().getLog().log(Plugin.createError("Unknown GMF Dashboard location: " + descriptor.getLocation(), null)); //$NON-NLS-1$
			return;
		}
		location.removeAction(actionFigure, descriptor.isStandard());
	}

	/**
	 * Also initializes the action.
	 */
	protected IFigure createLinkFigure(String text, DashboardAction action) {
		action.init(this);
		HyperlinkFigure linkFigure = new HyperlinkFigure(action);
		linkFigure.setText(text);
		return linkFigure;
	}

	protected IFigure createOptionFigure(String text, final String option) {
		final CheckBox optionFigure = new CheckBox(text);
		optionFigure.setRequestFocusEnabled(false);
		optionFigure.setFocusTraversable(false);
		optionFigure.setForegroundColor(ColorConstants.blue);
		optionFigure.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				getState().setOption(option, optionFigure.isSelected());
			}
		});
		optionFigures.put(option, optionFigure);
		return optionFigure;
	}

	public IProject getProject() {
		return project;
	}

	public DashboardState getState() {
		return state;
	}

	public void setProjectAndState(IProject project, DashboardState state) {
		this.project = project;
		this.state = state;
		if (this.state == null) {
			this.state = new DashboardState();
		}
		updateStatus();
	}

	public void updateStatus() {
		if (project == null) {
			view.getStatusLine(0).setText(Messages.DashboardMediator_SelectProject);
			view.getStatusLine(1).setText(""); //$NON-NLS-1$
		} else {
			view.getStatusLine(0).setText(MessageFormat.format(Messages.DashboardMediator_Project, new Object[] { project.getName() }));
			double done = (double) state.getSpecifiedModelsCount() / state.getModelsCount();
			view.getStatusLine(1).setText(MessageFormat.format(Messages.DashboardMediator_Progress, new Object[] { new Double(done) }));
		}
		setModelName(view.getDGMFigure(), state.getDGM());
		setModelName(view.getGDMFigure(), state.getGDM());
		setModelName(view.getDMFigure(), state.getDM());
		setModelName(view.getTDMFigure(), state.getTDM());
		setModelName(view.getMMFigure(), state.getMM());
		setModelName(view.getGMFigure(), state.getGM());
		optionFigures.get(DashboardFacade.OPTION_RCP).setSelected(state.getOption(DashboardFacade.OPTION_RCP));
		view.repaint(); // update hyperlinks
	}

	protected void setModelName(ModelFigure figure, URI uri) {
		figure.setName(uri == null ? null : uri.lastSegment());
		figure.setFullName(uri == null ? null : uri.toString());
	}

	protected abstract class SelectFileAction implements DashboardAction {

		public void init(DashboardFacade context) {
		}

		public boolean isEnabled() {
			return project != null;
		}

		public void run() {
			IFile file = getURI() == null ? null : URIUtil.getFile(getURI());
			file = FileSelector.selectFile(shell, getFigure().getDescription(), null, file, getFileExtension());
			if (file == null) {
				return;
			}
			setURI(URI.createPlatformResourceURI(file.getFullPath().toString(), true));
			updateStatus();
		}

		protected abstract ModelFigure getFigure();

		protected abstract URI getURI();

		protected abstract void setURI(URI uri);

		protected abstract String getFileExtension();
	}

	protected abstract class EditFileAction implements DashboardAction {

		public void init(DashboardFacade context) {
		}

		public boolean isEnabled() {
			return project != null && getURI() != null;
		}

		public void run() {
			IWorkbench workbench = PlatformUI.getWorkbench();
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			IFile modelFile = URIUtil.getFile(getURI());
			try {
				String fileName = modelFile.getFullPath().toString();
				String editorId = workbench.getEditorRegistry().getDefaultEditor(fileName).getId();
				page.openEditor(new FileEditorInput(modelFile), editorId);
			} catch (PartInitException pie) {
				String msg = MessageFormat.format(Messages.DashboardMediator_FailToOpen, new Object[] { getURI() });
				MessageDialog.openError(workbenchWindow.getShell(), msg, pie.getMessage());
			}
		}

		protected abstract URI getURI();
	}

	protected abstract class RunWizardAction implements DashboardAction {

		private static final int SIZING_WIZARD_WIDTH = 500;

		private static final int SIZING_WIZARD_HEIGHT = 500;

		public void init(DashboardFacade context) {
		}

		public boolean isEnabled() {
			return project != null;
		}

		public void run() {
			final IWizard wizard = createWizard();
			if (wizard instanceof IWorkbenchWizard) {
				((IWorkbenchWizard) wizard).init(PlatformUI.getWorkbench(), getSelection());
			}
			WizardDialog dialog = new WizardDialog(shell, wizard) {

				protected void finishPressed() {
					wizardFinished(wizard);
					super.finishPressed();
				}
			};
			dialog.create();
			dialog.getShell().setSize(Math.max(SIZING_WIZARD_WIDTH, dialog.getShell().getSize().x), SIZING_WIZARD_HEIGHT);
			dialog.open();
		}

		protected IStructuredSelection getSelection() {
			List<IFile> selection = new ArrayList<IFile>();
			addFile(selection, state.getDM());
			addFile(selection, state.getDGM());
			addFile(selection, state.getGDM());
			addFile(selection, state.getTDM());
			addFile(selection, state.getMM());
			addFile(selection, state.getGM());
			return new StructuredSelection(selection);
		}

		protected void addFile(List<IFile> files, URI uri) {
			if (uri == null) {
				return;
			}
			IFile file = URIUtil.getFile(uri);
			if (file != null) {
				files.add(file);
			}
		}

		protected abstract IWizard createWizard();

		protected void wizardFinished(IWizard wizard) {
		}
	}

	private class SelectDGMAction extends SelectFileAction {

		protected ModelFigure getFigure() {
			return DashboardMediator.this.view.getDGMFigure();
		}

		protected URI getURI() {
			return state.getDGM();
		}

		protected void setURI(URI uri) {
			state.setDGM(uri);
		}

		protected String getFileExtension() {
			return "genmodel"; //$NON-NLS-1$
		}
	}

	private class SelectGDMAction extends SelectFileAction {

		protected ModelFigure getFigure() {
			return DashboardMediator.this.view.getGDMFigure();
		}

		protected URI getURI() {
			return state.getGDM();
		}

		protected void setURI(URI uri) {
			state.setGDM(uri);
		}

		protected String getFileExtension() {
			return "gmfgraph"; //$NON-NLS-1$
		}
	}

	private class SelectDMAction extends SelectFileAction {

		protected ModelFigure getFigure() {
			return DashboardMediator.this.view.getDMFigure();
		}

		protected URI getURI() {
			return state.getDM();
		}

		protected void setURI(URI uri) {
			state.setDM(uri);
		}

		protected String getFileExtension() {
			return "ecore"; //$NON-NLS-1$
		}
	}

	private class SelectTDMAction extends SelectFileAction {

		protected ModelFigure getFigure() {
			return DashboardMediator.this.view.getTDMFigure();
		}

		protected URI getURI() {
			return state.getTDM();
		}

		protected void setURI(URI uri) {
			state.setTDM(uri);
		}

		protected String getFileExtension() {
			return "gmftool"; //$NON-NLS-1$
		}
	}

	private class SelectMMAction extends SelectFileAction {

		protected ModelFigure getFigure() {
			return DashboardMediator.this.view.getMMFigure();
		}

		protected URI getURI() {
			return state.getMM();
		}

		protected void setURI(URI uri) {
			state.setMM(uri);
		}

		protected String getFileExtension() {
			return "gmfmap"; //$NON-NLS-1$
		}
	}

	private class SelectGMAction extends SelectFileAction {

		protected ModelFigure getFigure() {
			return DashboardMediator.this.view.getGMFigure();
		}

		protected URI getURI() {
			return state.getGM();
		}

		protected void setURI(URI uri) {
			state.setGM(uri);
		}

		protected String getFileExtension() {
			return "gmfgen"; //$NON-NLS-1$
		}
	}

	private class EditDGMAction extends EditFileAction {

		protected URI getURI() {
			return state.getDGM();
		}
	}

	private class EditGDMAction extends EditFileAction {

		protected URI getURI() {
			return state.getGDM();
		}
	}

	private class EditDMAction extends EditFileAction {

		protected URI getURI() {
			return state.getDM();
		}
	}

	private class EditTDMAction extends EditFileAction {

		protected URI getURI() {
			return state.getTDM();
		}
	}

	private class EditMMAction extends EditFileAction {

		protected URI getURI() {
			return state.getMM();
		}
	}

	private class EditGMAction extends EditFileAction {

		protected URI getURI() {
			return state.getGM();
		}
	}

	private class CreateGDMAction extends RunWizardAction {

		protected IWizard createWizard() {
			return new GMFGraphModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((GMFGraphModelWizard) wizard).getModelFile();
			state.setGDM(file);
			updateStatus();
		}
	}

	private class CreateDMAction extends RunWizardAction {

		protected IWizard createWizard() {
			return new EcoreModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((EcoreModelWizard) wizard).getModelFile();
			state.setDM(file);
			updateStatus();
		}
	}

	private class CreateTDMAction extends RunWizardAction {

		protected IWizard createWizard() {
			return new GMFToolModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((GMFToolModelWizard) wizard).getModelFile();
			state.setTDM(file);
			updateStatus();
		}
	}

	private class CreateMMAction extends RunWizardAction {

		protected IWizard createWizard() {
			return new GMFMapModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((GMFMapModelWizard) wizard).getModelFile();
			state.setMM(file);
			updateStatus();
		}
	}

	private class CreateGMAction extends RunWizardAction {

		protected IWizard createWizard() {
			return new GMFGenModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((GMFGenModelWizard) wizard).getModelFile();
			state.setGM(file);
			updateStatus();
		}
	}

	private class ReloadDGMAction implements DashboardAction {

		public void init(DashboardFacade context) {
		}

		public boolean isEnabled() {
			return state.getDGM() != null;
		}

		public void run() {
			IFile file = URIUtil.getFile(state.getDGM());
			GenModelReloadActionDelegate action = new GenModelReloadActionDelegate();
			IAction uiAction = new Action() {
			};
			action.selectionChanged(uiAction, new StructuredSelection(file));
			action.run(uiAction);
			updateStatus();
		}
	}

	private class DeriveDGMAction extends RunWizardAction {

		public boolean isEnabled() {
			return super.isEnabled() && state.getDM() != null;
		}

		protected IWizard createWizard() {
			return new OpenEMFModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((OpenEMFModelWizard) wizard).getModelFile();
			state.setDGM(file);
			updateStatus();
		}

		protected IStructuredSelection getSelection() {
			return new StructuredSelection(URIUtil.getFile(state.getDM()));
		}
	}

	private static class OpenEMFModelWizard extends EMFModelWizard {

		public IFile getModelFile() {
			IPath path = genModelContainerPath.append(genModelFileName);
			return ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		}
	}

	private class DeriveGDMAction extends RunWizardAction {

		public boolean isEnabled() {
			return super.isEnabled() && state.getDM() != null;
		}

		protected IWizard createWizard() {
			GMFGraphSimpleModelWizard wizard = new GMFGraphSimpleModelWizard();
			wizard.setMode(WizardOperationMode.DETECT);
			return wizard;
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((GMFGraphSimpleModelWizard) wizard).getModelFile();
			state.setGDM(file);
			updateStatus();
		}
	}

	private class DeriveTDMAction extends RunWizardAction {

		public boolean isEnabled() {
			return super.isEnabled() && state.getDM() != null;
		}

		protected IWizard createWizard() {
			GMFToolSimpleModelWizard wizard = new GMFToolSimpleModelWizard();
			wizard.setMode(WizardOperationMode.DETECT);
			return wizard;
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((GMFToolSimpleModelWizard) wizard).getModelFile();
			state.setTDM(file);
			updateStatus();
		}
	}

	private class CombineMMAction extends RunWizardAction {

		public boolean isEnabled() {
			return project != null && state.getGDM() != null && state.getDM() != null && state.getTDM() != null;
		}

		protected IWizard createWizard() {
			return new GMFMapGuideModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((GMFMapGuideModelWizard) wizard).getModelFile();
			state.setMM(file);
			updateStatus();
		}
	}
}
