/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.map.editor.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author dstadnik
 */
public class ReferenceFigure extends Shape {

	private int offset = 8;

	public Insets getInsets() {
		Insets insets = new Insets(0, offset, 0, offset);
		if (getBorder() != null) {
			insets.add(getBorder().getInsets(this));
		}
		return insets;
	}

	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(getPoints());
	}

	protected void outlineShape(Graphics graphics) {
		graphics.drawPolygon(getPoints());
	}

	protected PointList getPoints() {
		Rectangle r = getBounds();
		int x = r.x + lineWidth / 2;
		int y = r.y + lineWidth / 2;
		int w = r.width - Math.max(1, lineWidth);
		int h = r.height - Math.max(1, lineWidth);
		PointList pl = new PointList(6);
		if (w < offset * 2) {
			pl.addPoint(x, y);
			pl.addPoint(x + w, y);
			pl.addPoint(x + w, y + h);
			pl.addPoint(x, y + h);
		} else {
			pl.addPoint(x + offset, y);
			pl.addPoint(x + w - offset, y);
			pl.addPoint(x + w, y + h / 2);
			pl.addPoint(x + w - offset, y + h);
			pl.addPoint(x + offset, y + h);
			pl.addPoint(x, y + h / 2);
		}
		return pl;
	}
}
