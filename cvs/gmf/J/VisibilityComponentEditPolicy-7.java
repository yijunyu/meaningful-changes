/******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.diagram.ui.editpolicies;

import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.GroupRequest;

import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.SetPropertyCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.EtoolsProxyCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.properties.Properties;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramResourceManager;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;


/**
 * Component edit policy which sets the <code>Property.ID_ISVISIBLE</code> to
 * <i>false</i> rather than deleting the view.  Doesn't support delete semantic.
 * 
 * @author jcorchis
 */
public class VisibilityComponentEditPolicy
	extends ComponentEditPolicy {
	
	/** 
	 * Return to make the <code>GraphicalEditPart</code>'s figure not visible.
	 * @param deleteRequest the original delete request.
	 */
	protected Command createDeleteViewCommand(GroupRequest deleteRequest) {
		CompositeCommand cc = new CompositeCommand(null);
		List toDel = deleteRequest.getEditParts();
		if (toDel == null || toDel.isEmpty()) {
			SetPropertyCommand c = new SetPropertyCommand(
				DiagramResourceManager.getInstance().getString("Command.hideLabel.Label"), //$NON-NLS-1$
				new EObjectAdapter((View) getHost().getModel()),
				Properties.ID_ISVISIBLE, Boolean.FALSE);
			cc.compose(c);
		} else {
			for (int i = 0; i < toDel.size(); i++) {
				IGraphicalEditPart gep = (IGraphicalEditPart) toDel.get(i);
				SetPropertyCommand c = new SetPropertyCommand(
					DiagramResourceManager.getInstance().getString("Command.hideLabel.Label"), //$NON-NLS-1$
					new EObjectAdapter((View)gep.getModel()),
					Properties.ID_ISVISIBLE,
					Boolean.FALSE);
				cc.compose(c);
			}
		}
		return new EtoolsProxyCommand(cc.unwrap());		
	}

	/** 
	 * Returns null.
	 * @see #shouldDeleteSemantic()
	 * @param deleteRequest the original delete request.
	 */
	protected Command createDeleteSemanticCommand(GroupRequest deleteRequest) {
		return null;
	}


}