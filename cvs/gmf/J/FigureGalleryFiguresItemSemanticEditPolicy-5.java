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

import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

import org.eclipse.gmf.graphdef.editor.edit.commands.Ellipse3CreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.FigureDescriptorCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.Polyline3CreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.Rectangle3CreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.RoundedRectangle3CreateCommand;

import org.eclipse.gmf.graphdef.editor.providers.GMFGraphElementTypes;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class FigureGalleryFiguresItemSemanticEditPolicy extends GMFGraphBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GMFGraphElementTypes.FigureDescriptor_3009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getFigureGallery_Descriptors());
			}
			return getGEFWrapper(new FigureDescriptorCreateCommand(req));
		}
		if (GMFGraphElementTypes.Rectangle_3018 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures());
			}
			return getGEFWrapper(new Rectangle3CreateCommand(req));
		}
		if (GMFGraphElementTypes.Ellipse_3019 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures());
			}
			return getGEFWrapper(new Ellipse3CreateCommand(req));
		}
		if (GMFGraphElementTypes.RoundedRectangle_3020 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures());
			}
			return getGEFWrapper(new RoundedRectangle3CreateCommand(req));
		}
		if (GMFGraphElementTypes.Polyline_3021 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures());
			}
			return getGEFWrapper(new Polyline3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
