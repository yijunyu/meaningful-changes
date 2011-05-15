/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2003, 2004.  All Rights Reserved.              |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.gef.ui.internal.figures;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.gmf.runtime.draw2d.ui.figures.IOvalAnchorableFigure;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.SlidableOvalAnchor;

/**
 * Draws a circle figure.  The figures bounds are guaranteed to be the circle
 * diameter
 * @author mhanner
 * @canBeSeenBy org.eclipse.gmf.runtime.gef.ui.*
 */
public class CircleFigure extends DefaultSizeNodeFigure implements IOvalAnchorableFigure {

	
	/** Create an instance. */
	public CircleFigure() {
		this( MapMode.DPtoLP(25) );
	}
	
	/**
	 * Constructor for StateLineFigure.
	 * @param width figure width
	 * @param height figure height
	 */
	public CircleFigure(int width, int height) {
		super( width, height );
	}
	
	/**
	 * Constructor for StateLineFigure.
	 * @param dim figure dimensions
	 */
	public CircleFigure( Dimension dim ) {
		super(dim);
	}
	
	/**
	 * Constructor for StateLineFigure.
	 * @param diameter circle diameter
	 */
	public CircleFigure( int diameter ) {
		this( diameter, diameter );
	}
	/**
	 * Draw the state object.
	 * @see org.eclipse.draw2d.Figure#paintBorder(org.eclipse.draw2d.Graphics)
	 */
	protected void paintFigure(Graphics g) {
		Rectangle r = Rectangle.SINGLETON;
		r.setBounds(getBounds());
		//
		// draw the circle.
		g.fillOval(r);

		r.width--;
		r.height--;
		g.drawOval(r);
	}

	
	/** Return <code>getBounds()</code>. */
	public final Rectangle getOvalBounds() {
		return getBounds();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure#createAnchor(org.eclipse.draw2d.geometry.PrecisionPoint)
	 */
	protected ConnectionAnchor createAnchor(PrecisionPoint p) {
		if (p==null)
			// If the old terminal for the connection anchor cannot be resolved (by SlidableAnchor) a null
			// PrecisionPoint will passed in - this is handled here
			return createDefaultAnchor();
		return new SlidableOvalAnchor(this, p);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure#createDefaultAnchor()
	 */
	protected ConnectionAnchor createDefaultAnchor() {
		return new SlidableOvalAnchor(this);
	}
}