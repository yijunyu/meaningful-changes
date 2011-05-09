/**
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Fedorov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.transform;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.internal.bridge.wizards.WizardUtil;
import org.eclipse.gmf.internal.common.ui.ResourceLocationProvider;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;


public class TransformToGenModelWizard extends Wizard implements IWorkbenchWizard {
	
	private static final String PAGE_ID_GMFGEN = "gmfgen"; //$NON-NLS-1$
	private static final String PAGE_ID_GENMODEL = "genmodel"; //$NON-NLS-1$
	private static final String PAGE_ID_GMFMAP = "gmfmap"; //$NON-NLS-1$
	private static final String PAGE_ID_TRANSFORM = "transform"; //$NON-NLS-1$
	
	private IStructuredSelection mySelection;

	private GMFGenNewFileCreationPage newFileCreationPage;
	private MapModelConfigurationPage mapModelPage;
	private GenModelConfigurationPage genModelPage;
	private ViewmapProducerWizardPage transformOptionPage;
	
	private TransformToGenModelOperation myOperation;

	ResourceSet resourceSet;
	
	@Override
	public void addPages() {
		super.addPages();
		
		final String defaultName = "My"; //$NON-NLS-1$
		newFileCreationPage = new GMFGenNewFileCreationPage(PAGE_ID_GMFGEN, mySelection);
		newFileCreationPage.setTitle(Messages.TransformToGenModelWizard_title_gmfgen);
		newFileCreationPage.setDescription(Messages.TransformToGenModelWizard_descr_gmfgen);
		IFile file = WizardUtil.findExistingFile(mySelection, GMFGenNewFileCreationPage.EXT_GMFGEN);
		if (file != null) {
			newFileCreationPage.setFileName(file.getName());
		} else {
			newFileCreationPage.setFileName(WizardUtil.getDefaultFileName(mySelection, defaultName, GMFGenNewFileCreationPage.EXT_GMFGEN));
		}
		addPage(newFileCreationPage);
		
		resourceSet = new ResourceSetImpl();
		ResourceLocationProvider rlp = new ResourceLocationProvider(mySelection);
		mapModelPage = new MapModelConfigurationPage(PAGE_ID_GMFMAP, rlp, resourceSet);
		mapModelPage.setTitle(Messages.TransformToGenModelWizard_title_mapmodel);
		mapModelPage.setDescription(Messages.TransformToGenModelWizard_descr_mapmodel);
		mapModelPage.setPageComplete(false);
		mapModelPage.setModelRequired(true);
		addPage(mapModelPage);

		genModelPage = new GenModelConfigurationPage(PAGE_ID_GENMODEL, rlp, resourceSet);
		genModelPage.setTitle(Messages.TransformToGenModelWizard_title_genmodel);
		genModelPage.setDescription(Messages.TransformToGenModelWizard_descr_genmodel);
		genModelPage.setPageComplete(false);
		genModelPage.setModelRequired(false);
		addPage(genModelPage);

		transformOptionPage = new ViewmapProducerWizardPage(PAGE_ID_TRANSFORM);
		transformOptionPage.setTitle(Messages.TransformToGenModelWizard_title_options);
		transformOptionPage.setDescription(Messages.TransformToGenModelWizard_descr_options);
		transformOptionPage.setPageComplete(false);
		addPage(transformOptionPage);
		
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#getNextPage(org.eclipse.jface.wizard.IWizardPage)
	 */
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page == mapModelPage) {
			try {
				GenModel genmmodel = getTransformOperation().findGenmodel(resourceSet);
				if (genmmodel == null) {
					genModelPage.setPageComplete(true);
					return transformOptionPage;
				}
			} catch (CoreException e) {
				genModelPage.setStatusMessage(e.getStatus());
			}
		}
		return super.getNextPage(page);
	}
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.mySelection = selection;
		setWindowTitle(Messages.TransformToGenModelWizard_title_wizard);
		setNeedsProgressMonitor(true);
		IFile mapFile = (IFile) selection.getFirstElement();
		URI mapURI = URI.createPlatformResourceURI(mapFile.getFullPath().toString(), true);
		initOperation(mapURI);
	}
	
	void initOperation(URI mapURI) {
		myOperation = new TransformToGenModelOperation(mapURI);
	}
	
	@Override
	public boolean performFinish() {
		try {
			final IStatus[] s = new IStatus[1];
			IRunnableWithProgress iwr = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					s[0] = getTransformOperation().executeTransformation(resourceSet, monitor);
				}
			};
			getContainer().run(false, false, iwr);
			if (s[0].isOK()) {
				setErrorMessage(null);
				saveTransformOptions();
				return true;
			}
			setErrorMessage(s[0].getMessage());
			return false;
		} catch (InvocationTargetException ex) {
			Throwable targetException = ex.getTargetException();
			if (targetException != null && targetException.getMessage() != null) {
				String message = targetException.getMessage();
				if (message == null) {
					message = Messages.TransformToGenModelWizard_e_generator_creation;
				}
			}
			return false;
		} catch (InterruptedException ex){
			setErrorMessage(Messages.TransformToGenModelWizard_e_operation_cancelled);
			return false;
		}
	}
	
	private void saveTransformOptions() {
		if (getTransformOperation() != null) {
			getTransformOperation().getOptions().flush();
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performCancel()
	 */
	@Override
	public boolean performCancel() {
		if (getTransformOperation() != null) {
			getTransformOperation().getOptions().reset();
		}
		return super.performCancel();
	}

	TransformToGenModelOperation getTransformOperation() {
		return myOperation;
	}
	
	IFile getTargetFile() {
		return newFileCreationPage.getModelFile();
	}
	
	private void setErrorMessage(String message) {
		WizardDialog wd = (WizardDialog) getContainer();
		WizardPage wp = (WizardPage) wd.getCurrentPage();
		if (wp != null) {
			wp.setErrorMessage(message);
		}
	}

}
