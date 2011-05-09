/*
 * Copyright (c) 2006, 2007 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.graphdef.editor.edit.commands.Ellipse2CreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.Polyline2CreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.RectangleCreateCommand;
import org.eclipse.gmf.graphdef.editor.edit.commands.RoundedRectangle2CreateCommand;
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
		if (GMFGraphElementTypes.Rectangle_3001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures());
			}
			return getMSLWrapper(new RectangleCreateCommand(req));
		}
		if (GMFGraphElementTypes.Ellipse_3006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures());
			}
			return getMSLWrapper(new Ellipse2CreateCommand(req));
		}
		if (GMFGraphElementTypes.RoundedRectangle_3007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures());
			}
			return getMSLWrapper(new RoundedRectangle2CreateCommand(req));
		}
		if (GMFGraphElementTypes.Polyline_3008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures());
			}
			return getMSLWrapper(new Polyline2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
