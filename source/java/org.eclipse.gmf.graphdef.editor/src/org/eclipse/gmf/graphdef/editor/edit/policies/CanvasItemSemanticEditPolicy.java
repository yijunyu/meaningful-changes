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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

import org.eclipse.gmf.graphdef.editor.edit.commands.CompartmentCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.ConnectionCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.DiagramLabelCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.FigureGalleryCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.NodeCreateCommand;

import org.eclipse.gmf.graphdef.editor.providers.GMFGraphElementTypes;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CanvasItemSemanticEditPolicy extends GMFGraphBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GMFGraphElementTypes.Compartment_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getCanvas_Compartments());
			}
			return getGEFWrapper(new CompartmentCreateCommand(req));
		}
		if (GMFGraphElementTypes.Node_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getCanvas_Nodes());
			}
			return getGEFWrapper(new NodeCreateCommand(req));
		}
		if (GMFGraphElementTypes.Connection_2007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getCanvas_Connections());
			}
			return getGEFWrapper(new ConnectionCreateCommand(req));
		}
		if (GMFGraphElementTypes.FigureGallery_2008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getCanvas_Figures());
			}
			return getGEFWrapper(new FigureGalleryCreateCommand(req));
		}
		if (GMFGraphElementTypes.DiagramLabel_2009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getCanvas_Labels());
			}
			return getGEFWrapper(new DiagramLabelCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}
	}
}
