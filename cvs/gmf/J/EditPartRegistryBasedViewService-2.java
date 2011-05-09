/**
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.parts.update.canonical;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Implementation of {@link IViewService} that uses EditPartRegistry to match views with domain elements.
 * In order for this service to work correctly, edit parts must register themselves against domain elements in {@link AbstractEditPart#registerModel()} method.
 */
public class EditPartRegistryBasedViewService implements IViewService {
	private final EditPartViewer myViewer;

	public EditPartRegistryBasedViewService(EditPartViewer viewer) {
		myViewer = viewer;
	}

	public View findView(EObject modelElement) {
		if (modelElement == null) {
			return null;
		}
		EditPart editPart = (EditPart) myViewer.getEditPartRegistry().get(modelElement);
		if (editPart != null && editPart.getModel() instanceof View) {
			return (View) editPart.getModel();
		}
		View parentView = findView(modelElement.eContainer());
		if (parentView != null) {
			View result = findNode(parentView, modelElement);
			if (result != null) {
				return result;
			}
		}
		return findEdge(modelElement);
	}
	
	/**
	 * Finds a notational node that corresponds to the given underlying domain element in a subtree starting from the given parent element. 
	 * @generated
	 */
	private View findNode(View parentView, EObject modelElement) {
		for(Iterator it = parentView.getChildren().iterator(); it.hasNext(); ) {
			View next = (View) it.next();
			if (!next.isSetElement() || next.getElement() == parentView) {
				View result = findNode(next, modelElement);
				if (result != null) {
					return result;
				}
			}
			if (next.isSetElement() && next.getElement() == modelElement) {
				return next;
			}
		}
		return null;
	}

	/**
	 * Finds a notational edge that corresponds to the given underlying domain element. 
	 * @generated
	 */
	private View findEdge(EObject modelElement) {
		for(Iterator it = getDiagram().getEdges().iterator(); it.hasNext(); ) {
			Edge next = (Edge) it.next();
			if (next.isSetElement() && next.getElement() == modelElement) {
				return next;
			}
		}
		return null;
	}

	private Diagram getDiagram() {
		return (Diagram) myViewer.getContents().getModel();
	}
}
