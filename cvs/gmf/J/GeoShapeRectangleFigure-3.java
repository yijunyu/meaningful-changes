/******************************************************************************
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/


package org.eclipse.gmf.runtime.diagram.ui.geoshapes.internal.draw2d.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author jschofie
 *
 * This Figure represents a Rectangle Figure
 */
public class GeoShapeRectangleFigure extends GeoShapeFigure {

	/**
	 * Constructor - Creates a rectangle with a given Default size
	 * 
	 * @param width inital width of the figure
	 * @param height initial height of the figure
	 */
	public GeoShapeRectangleFigure( int width, int height ) {
		super(width, height);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
	 */
	protected void paintFigure(Graphics g) {

		Rectangle r = getBounds().getCopy();
		
		// IF this figure has a border...
		if( isOpaque() && getBorder() != null ) {

			// Crop the rectangle to the insets
			r.crop( getBorder().getInsets( this ) );
			
			// Draw the rectangle with the fill color
			g.fillRectangle(r);
			
		} else {	
			// Otherwise draw and fill the rectangle

			// Draw the rectangle with the fill color
			g.fillRectangle(r);
		
			// Draw the rectangle outline
			g.drawRectangle(r.x, r.y, r.width - 1, r.height - 1);
		}
	}
}