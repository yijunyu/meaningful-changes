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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.internal.common.ui.ResourceLocationProvider;
import org.eclipse.gmf.mappings.Mapping;


class MapModelConfigurationPage extends ModelConfigurationPage {
	
	private static final String FILE_EXT_GMFMAP = "gmfmap"; //$NON-NLS-1$

	MapModelConfigurationPage(String pageId, ResourceLocationProvider rlp, ResourceSet resourceSet) {
		super(pageId, rlp, resourceSet);
	}

	protected String getModelFileExtension() {
		return FILE_EXT_GMFMAP;
	}
	
	@Override
	protected void initControls() {
		super.initControls();
		TransformToGenModelWizard wizard = (TransformToGenModelWizard) getWizard();
		IFile target = wizard.getTargetFile();
		getOperation().setGenURI(URI.createPlatformResourceURI(target.getFullPath().toString(), true));
	}
	
	@Override
	protected Resource doLoadResource(IProgressMonitor monitor) throws CoreException {
		TransformToGenModelOperation o = getOperation();
		o.reset(getURI());
		Mapping mapping = o.loadMappingModel(getResourceSet(), getURI(), monitor);
		return mapping.eResource();
	}

	TransformToGenModelOperation getOperation() {
		TransformToGenModelWizard wizard = (TransformToGenModelWizard) getWizard();
		return wizard.getTransformOperation();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gmf.internal.common.ui.ModelSelectionPage#resourceChanged()
	 */
	@Override
	protected void resourceChanged() {
		super.resourceChanged();
		IStatus load = getOperation().getLoadMappingStatus();
		if (load != null) {
			if ((load.getSeverity() == IStatus.WARNING) || (load.getSeverity() == IStatus.INFO) ) {
				setStatusMessage(load);
			}
		}
	}
}
