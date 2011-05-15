/******************************************************************************
 * Copyright (c) 2002, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.diagram.ui.actions.internal;

import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.actions.DiagramAction;
import org.eclipse.gmf.runtime.diagram.ui.actions.internal.l10n.DiagramActionsResourceManager;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.requests.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.internal.requests.ApplyAppearancePropertiesRequest;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbenchPage;

/**
 * Action that takes the appearance properties of edit part first in the selection, and
 * applies it to the rest of the selected objects.
 * 
 * @author Natalia Balaba
 * @canBeSeenBy %level1
 * @author melaasar
 */
public class CopyAppearancePropertiesAction extends DiagramAction {

	/**
	 * @param workbenchPage
	 */
	public CopyAppearancePropertiesAction(IWorkbenchPage workbenchPage) {
		super(workbenchPage);

		setId(ActionIds.ACTION_COPY_APPEARANCE_PROPERTIES);
		setText(DiagramActionsResourceManager.getInstance().getString("CopyAppearancePropertiesAction.text")); //$NON-NLS-1$
		setToolTipText(DiagramActionsResourceManager.getInstance().getString("CopyAppearancePropertiesAction.toolTip")); //$NON-NLS-1$

		ImageDescriptor enabledImage = DiagramActionsResourceManager.getInstance()
		.getImageDescriptor(
			DiagramActionsResourceManager.IMAGE_COPY_APPEARANCE);
		setImageDescriptor(enabledImage); 
		setDisabledImageDescriptor(DiagramActionsResourceManager.getInstance()
			.getImageDescriptor(
				DiagramActionsResourceManager.IMAGE_COPY_APPEARANCE_DISABLED));
		setHoverImageDescriptor(enabledImage);
	}

	/**
	 * @see org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler#isSelectionListener()
	 */
	protected boolean isSelectionListener() {
		return true;
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.actions.DiagramAction#createTargetRequest()
	 */
	protected Request createTargetRequest() {
		return new ApplyAppearancePropertiesRequest();
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.actions.DiagramAction#updateTargetRequest()
	 */
	protected void updateTargetRequest() {
		ApplyAppearancePropertiesRequest request =
			(ApplyAppearancePropertiesRequest) getTargetRequest();
		List set = super.createOperationSet();
		if (!set.isEmpty()) {
			IGraphicalEditPart editPart = (IGraphicalEditPart) set.get(0);
			request.setViewToCopyFrom(editPart.getNotationView());
		}
		super.updateTargetRequest();
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.actions.DiagramAction#createOperationSet()
	 */
	protected List createOperationSet() {
		List operationSet = super.createOperationSet();
		if (!operationSet.isEmpty())
			operationSet.remove(0);
		return operationSet;
	}
}