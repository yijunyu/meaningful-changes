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
package org.eclipse.gmf.internal.codegen.lite.dashboard;

import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.bridge.ui.dashboard.DashboardAction;
import org.eclipse.gmf.bridge.ui.dashboard.DashboardFacade;
import org.eclipse.gmf.bridge.ui.dashboard.DashboardState;
import org.eclipse.gmf.internal.codegen.popup.actions.TransformToGenModelOperation;

/**
 * @author dstadnik
 */
public class GenerateLiteGMAction implements DashboardAction {

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
			op.setUseRuntimeFigures(false);
			op.setUseMapMode(false);
			op.setRCP(false);
			op.setMapModelURI(mm);
			op.setGenModelURI(gm);
			op.run();
		} finally {
			context.updateStatus();
		}
	}
}
