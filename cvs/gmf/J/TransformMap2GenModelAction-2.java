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
package org.eclipse.gmf.internal.bridge.ui.dashboard.actions;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.bridge.ui.dashboard.DashboardAction;
import org.eclipse.gmf.bridge.ui.dashboard.DashboardFacade;
import org.eclipse.gmf.bridge.ui.dashboard.DashboardState;
import org.eclipse.gmf.internal.bridge.transform.TransformOptions;
import org.eclipse.gmf.internal.bridge.transform.TransformToGenModelOperation;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

/**
 * @author dstadnik
 */
public class TransformMap2GenModelAction implements DashboardAction {

	private DashboardFacade context;

	public void init(DashboardFacade context) {
		this.context = context;
	}

	public boolean isEnabled() {
		DashboardState state = context.getState();
		if (context.isStrict()) {
			if (state.getDM() == null || state.getDGM() == null || state.getTDM() == null) {
				return false;
			}
		}
		return state.getMM() != null;
	}

	public void run() {
		DashboardState state = context.getState();
		URI mm = state.getMM();
		URI gm = state.getGM();
		if (gm == null) {
			gm = mm.trimFileExtension().appendFileExtension("gmfgen"); //$NON-NLS-1$
			state.setGM(gm);
		}
		try {
			TransformToGenModelOperation op = new TransformToGenModelOperation();
			configureOptions(op.getOptions());
			final ResourceSet rs = new ResourceSetImpl();
			op.loadMappingModel(rs, mm, new NullProgressMonitor());
			op.loadGenModel(rs, state.getDGM(), new NullProgressMonitor());
			op.setGenURI(gm);
			op.executeTransformation(rs, new NullProgressMonitor());
		} catch (CoreException ex) {
			// XXX Is it legal to show UI from the action? Provide shell from context then.
			final Shell s = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			ErrorDialog.openError(s, null, ex.getMessage(), ex.getStatus());
		} finally {
			context.updateStatus();
		}
	}

	protected void configureOptions(TransformOptions options) {
		options.setUseRuntimeFigures(true);
		options.setUseMapMode(true);
		options.setGenerateRCP(false);
	}
}
