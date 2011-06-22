/*
 *  Copyright (c) 2006, 2007 Borland Software Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.graphdef.editor.edit.commands.CompartmentAccessorCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.CompartmentAccessorReorientCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.DiagramLabelAccessorCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.DiagramLabelAccessorReorientCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.NodeContentPaneCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.NodeContentPaneReorientCommand;
import org.eclipse.gmf.graphdef.editor.edit.parts.CompartmentAccessorEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.DiagramLabelAccessorEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.NodeContentPaneEditPart;
import org.eclipse.gmf.graphdef.editor.providers.GMFGraphElementTypes;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

/**
 * @generated
 */
public class ChildAccessItemSemanticEditPolicy extends GMFGraphBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (GMFGraphElementTypes.CompartmentAccessor_4003 == req.getElementType()) {
			return null;
		}
		if (GMFGraphElementTypes.DiagramLabelAccessor_4004 == req.getElementType()) {
			return null;
		}
		if (GMFGraphElementTypes.NodeContentPane_4006 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (GMFGraphElementTypes.CompartmentAccessor_4003 == req.getElementType()) {
			return getGEFWrapper(new CompartmentAccessorCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GMFGraphElementTypes.DiagramLabelAccessor_4004 == req.getElementType()) {
			return getGEFWrapper(new DiagramLabelAccessorCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GMFGraphElementTypes.NodeContentPane_4006 == req.getElementType()) {
			return getGEFWrapper(new NodeContentPaneCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case CompartmentAccessorEditPart.VISUAL_ID:
			return getGEFWrapper(new CompartmentAccessorReorientCommand(req));
		case DiagramLabelAccessorEditPart.VISUAL_ID:
			return getGEFWrapper(new DiagramLabelAccessorReorientCommand(req));
		case NodeContentPaneEditPart.VISUAL_ID:
			return getGEFWrapper(new NodeContentPaneReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
