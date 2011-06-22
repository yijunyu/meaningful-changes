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
package org.eclipse.gmf.runtime.lite.edit.parts.tree;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.TreeEditPart;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Edit part factory to be used for content outline page.
 */
public class DiagramTreeEditPartFactory implements EditPartFactory {
	private final EditPartViewer myGraphicalViewer;

	public DiagramTreeEditPartFactory(EditPartViewer graphicalViewer) {
		myGraphicalViewer = graphicalViewer;
	}

	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			EditPart graphicalEditPart = (EditPart) myGraphicalViewer.getEditPartRegistry().get(model);
			if (graphicalEditPart == null) {
				return null;
			}
			return (EditPart) graphicalEditPart.getAdapter(TreeEditPart.class);
		}
		return null;
	}

}
