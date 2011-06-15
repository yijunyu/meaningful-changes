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

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.graphdef.editor.edit.commands.ChildAccessCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.ChildAccessReorientCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.EllipseCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.LabelCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.PolygonCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.PolylineCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.Rectangle2CreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.RoundedRectangleCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.parts.ChildAccessEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.EllipseEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.LabelEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.PolygonEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.PolylineEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Rectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangleEditPart;
import org.eclipse.gmf.graphdef.editor.part.GMFGraphVisualIDRegistry;
import org.eclipse.gmf.graphdef.editor.providers.GMFGraphElementTypes;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RoundedRectangle3ItemSemanticEditPolicy extends GMFGraphBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GMFGraphElementTypes.Rectangle_3011 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getRealFigure_Children());
			}
			return getGEFWrapper(new Rectangle2CreateCommand(req));
		}
		if (GMFGraphElementTypes.Ellipse_3012 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getRealFigure_Children());
			}
			return getGEFWrapper(new EllipseCreateCommand(req));
		}
		if (GMFGraphElementTypes.RoundedRectangle_3013 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getRealFigure_Children());
			}
			return getGEFWrapper(new RoundedRectangleCreateCommand(req));
		}
		if (GMFGraphElementTypes.Polyline_3014 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getRealFigure_Children());
			}
			return getGEFWrapper(new PolylineCreateCommand(req));
		}
		if (GMFGraphElementTypes.Polygon_3023 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getRealFigure_Children());
			}
			return getGEFWrapper(new PolygonCreateCommand(req));
		}
		if (GMFGraphElementTypes.Label_3026 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getRealFigure_Children());
			}
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
		addDestroyShortcutsCommand(cc);
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (GMFGraphVisualIDRegistry.getVisualID(node)) {
			case Rectangle2EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case EllipseEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case RoundedRectangleEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case PolylineEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case PolygonEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case LabelEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			}
		}
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
		if (GMFGraphElementTypes.ChildAccess_4002 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (GMFGraphElementTypes.ChildAccess_4002 == req.getElementType()) {
			return getGEFWrapper(new ChildAccessCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ChildAccessEditPart.VISUAL_ID:
			return getGEFWrapper(new ChildAccessReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
