/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.lite.edit.parts.labels.ILabelTextDisplayer;
import org.eclipse.gmf.runtime.lite.edit.parts.labels.ILabelController;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Direct edit policy which uses label text displayer to edit values.
 */
public class LabelDirectEditPolicy extends DirectEditPolicy {
	@Override
	public void setHost(EditPart host) {
		assert host instanceof ILabelController;
		super.setHost(host);
	}

	protected ILabelController getTextAwareEditPart() {
		return (ILabelController) getHost();
	}

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		ILabelTextDisplayer labelTextDisplayer = getTextAwareEditPart().getLabelTextDisplayer();
		if (labelTextDisplayer == null) {
			return UnexecutableCommand.INSTANCE;
		}
		String value = getCellEditorValue(request);
		if (value == null) {
			//Invalid value is transformed into a null by the validator.
			return UnexecutableCommand.INSTANCE;
		}
		View view = (View) getHost().getModel();
		if (view == null) {
			return UnexecutableCommand.INSTANCE;
		}
		EObject modelElement = view.getElement();
		return new WrappingCommand(TransactionUtil.getEditingDomain(view.getDiagram().getElement()), 
				labelTextDisplayer.getApplyCommand(modelElement, value));
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		getTextAwareEditPart().setLabelText(getCellEditorValue(request));
	}

	protected String getCellEditorValue(DirectEditRequest request) {
		return (String) request.getCellEditor().getValue();
	}
}
