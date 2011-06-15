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
package org.eclipse.gmf.runtime.lite.edit.parts.labels;

import org.eclipse.draw2d.AbstractLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

public abstract class BaseExternalNodeLabelEditPart extends BaseExternalLabelEditPart {
	public BaseExternalNodeLabelEditPart(View view) {
		super(view);
	}

	public void refreshBounds() {
		Node node = (Node) getModel();
		if (node.getLayoutConstraint() == null) {
			return;
		}
		assert node.getLayoutConstraint() instanceof Location;
		final Location location = (Location) node.getLayoutConstraint();
		getFigure().getParent().setConstraint(getFigure(), new AbstractLocator() {
			protected Point getReferencePoint() {
				return getLabelLocation(((GraphicalEditPart) getParent()).getFigure()).translate(location.getX(), location.getY());
			}
			public int getRelativePosition() {
				return PositionConstants.SOUTH;
			}
		});
	}

	public Point getReferencePoint() {
		return getLabelLocation(((GraphicalEditPart) getParent()).getFigure());
	}

	protected Point getLabelLocation(IFigure parent) {
		Point result = parent.getBounds().getBottom();
		parent.translateToAbsolute(result);
		return result;
	}
}
