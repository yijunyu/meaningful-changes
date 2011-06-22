/**
 * Copyright (c) 2008 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.edit.parts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.notation.View;

public abstract class AbstractPointEditPart extends ShapeNodeEditPart {

	public AbstractPointEditPart(View view) {
		super(view);
	}

	public Object getLayoutConstraint() {
		Point point = getPoint();
		if (point != null) {
			Rectangle result = new Rectangle();
			result.setLocation(getDraw2DLocation(point));
			result.setSize(getDraw2DSize(point));
			return result;
		}
		return null;
	}

	private Dimension getDraw2DSize(Point point) {
		return ((DefaultSizeNodeFigure) getNodeFigure()).getDefaultSize().getCopy();
	}

	private org.eclipse.draw2d.geometry.Point getDraw2DLocation(Point point) {
		return new org.eclipse.draw2d.geometry.Point(getMapMode().DPtoLP(point.getX()), getMapMode().DPtoLP(point.getY()));
	}

	@Override
	protected void refreshBounds() {
		Point point = getPoint();
		if (point == null) {
			return;
		}
		Object layoutConstraint = getLayoutConstraint();
		if (layoutConstraint instanceof Rectangle) {
			Rectangle bounds = (Rectangle) layoutConstraint;
			getFigure().setLocation(bounds.getLocation());
			getFigure().setSize(bounds.getSize());
			if (getFigure().getParent() != null) {
				getFigure().getParent().setConstraint(getFigure(), bounds);
			}
		}
	}

	private Point getPoint() {
		View view = getNotationView();
		if (view != null && view.getElement() instanceof Point) {
			return (Point) view.getElement();
		}
		return null;
	}

}
