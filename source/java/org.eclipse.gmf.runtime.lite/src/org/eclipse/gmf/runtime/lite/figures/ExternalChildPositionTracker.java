/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.figures;

import org.eclipse.draw2d.AncestorListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.GraphicalEditPart;

/**
 * Updates position of external children when its ancestors are moved. 
 */
public class ExternalChildPositionTracker implements AncestorListener {
	private final GraphicalEditPart myEditPart;

	public ExternalChildPositionTracker(GraphicalEditPart editPart) {
		myEditPart = editPart;
	}

	public void ancestorAdded(IFigure ancestor) {
		myEditPart.getFigure().revalidate();
	}

	public void ancestorMoved(IFigure ancestor) {
		myEditPart.getFigure().revalidate();
	}

	public void ancestorRemoved(IFigure ancestor) {
		myEditPart.getFigure().revalidate();
	}
}
