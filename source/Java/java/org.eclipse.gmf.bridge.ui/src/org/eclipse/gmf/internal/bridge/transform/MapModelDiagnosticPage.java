/**
 * Copyright (c) 2007 Borland Software Corporation
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

import org.eclipse.emf.common.util.Diagnostic;


class MapModelDiagnosticPage extends ModelDiagnosticPage {
	
	MapModelDiagnosticPage(String pageName) {
		super(pageName);
		setTitle(Messages.TransformToGenModelWizard_title_mapdiagnostic);
		setDescription(Messages.TransformToGenModelWizard_descr_mapdiagnostic);
	}

	@Override
	protected boolean getIgnoreOption() {
		return getOperation().getOptions().getIgnoreMapModelValidation();
	}

	@Override
	protected Diagnostic getValidationResult() {
		return getOperation().getMapmodelValidationResult();
	}

	@Override
	protected void setIgnoreOption(boolean ignore) {
		getOperation().getOptions().setIgnoreMapModelValidation(ignore);
	}

}
