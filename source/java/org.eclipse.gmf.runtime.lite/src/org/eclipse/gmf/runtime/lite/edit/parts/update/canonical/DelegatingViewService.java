/**
 * Copyright (c) 2006 Borland Software Corporation
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
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This implementation of <code>IViewService</code> delegates to another view service to locate an exact match. If no exact match is found, 
 * the same procedure is attempted for ancestors recursively until the match is found. Then, the element chain is traversed in the opposite direction 
 * trying to find a match in the context of the parent element's match.
 */
public abstract class DelegatingViewService implements IViewService {
	public interface IExactMatchFinder extends IViewService {
		public Diagram getDiagram();
	}

	private final IExactMatchFinder myExactMatchFinder;

	public DelegatingViewService(IExactMatchFinder exactMatchFinder) {
		myExactMatchFinder = exactMatchFinder;
	}

	public View findView(EObject modelElement) {
		if (modelElement == null) {
			return null;
		}
		View exactMatch = myExactMatchFinder.findView(modelElement);
		if (exactMatch != null) {
			return exactMatch;
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
	 */
	private View findNode(View parentView, EObject modelElement) {
		for(Iterator it = parentView.getChildren().iterator(); it.hasNext(); ) {
			View next = (View) it.next();
			if (!next.isSetElement() || next.getElement() == parentView.getElement()) {
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
		for(Iterator it = myExactMatchFinder.getDiagram().getEdges().iterator(); it.hasNext(); ) {
			Edge next = (Edge) it.next();
			if (next.isSetElement() && next.getElement() == modelElement) {
				return next;
			}
		}
		return null;
	}
}
