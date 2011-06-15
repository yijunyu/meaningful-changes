/*
 * Copyright (c) 2007 Borland Software Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.transform;

import org.eclipse.emf.common.util.Diagnostic;


class GMFGenModelDiagnosticPage extends ModelDiagnosticPage {

	GMFGenModelDiagnosticPage(String pageName) {
		super(pageName);
		setTitle(Messages.TransformToGenModelWizard_title_gmfgendiagnostic);
		setDescription(Messages.TransformToGenModelWizard_descr_gmfgendiagnostic);
	}

	@Override
	protected boolean getIgnoreOption() {
		return getOperation().getOptions().getIgnoreGMFGenValidation();
	}

	@Override
	protected Diagnostic getValidationResult() {
		return getOperation().getGMFGenValidationResult();
	}

	@Override
	protected void setIgnoreOption(boolean ignore) {
		getOperation().getOptions().setIgnoreGMFGenValidation(ignore);
	}

}
