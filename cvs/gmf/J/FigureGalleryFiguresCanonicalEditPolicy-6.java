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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.graphdef.editor.edit.parts.Ellipse2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Polyline2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RectangleEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.part.GMFGraphVisualIDRegistry;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FigureGalleryFiguresCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((FigureGallery) modelObject).getFigures().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = GMFGraphVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case RectangleEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Ellipse2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case RoundedRectangle2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Polyline2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			return view.isSetElement() && (view.getElement() == null || view.getElement().eIsProxy());
		}
		int nodeVID = GMFGraphVisualIDRegistry.getVisualID(view);
		switch (nodeVID) {
		case RectangleEditPart.VISUAL_ID:
		case Ellipse2EditPart.VISUAL_ID:
		case RoundedRectangle2EditPart.VISUAL_ID:
		case Polyline2EditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

}
