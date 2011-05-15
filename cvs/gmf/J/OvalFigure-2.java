/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2002, 2003.  All Rights Reserved.              |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.gef.ui.internal.figures;



import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.gmf.runtime.draw2d.ui.figures.IOvalAnchorableFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.SlidableOvalAnchor;

/**
 * @author choang
 * @canBeSeenBy org.eclipse.gmf.runtime.gef.ui.*
 *
 * Graphic 2D figure for a oval whoses anchoring will use the OvalAnchor
 * 
 */
public class OvalFigure extends NodeFigure implements IOvalAnchorableFigure{

	public static double TAB_HEIGHT_PERCENT = .2;
	
	
	/**
	 * Constructor for OvalFigure.
	 */
	public OvalFigure() {
		super();
	} 
	
	protected void paintFigure(Graphics g) {
		super.paintFigure(g);

		Rectangle ovalRect = getOvalBounds();

		g.fillOval(ovalRect);
		g.drawOval(ovalRect);		

	}

	/**
	 * @return Rectangle that bounds the oval that is to be drawn.
	 * This may or may not be the same as the bounds of the figure itself.
	 */
	public Rectangle getOvalBounds() {
		
		Rectangle r = getBounds();

		Rectangle ovalRect = new Rectangle(r);

		// not using the full bounds of the rectangle to draw
		// the oval in as it results in the top and the left
		// edge of the oval being chopped off.  That is why 
		// we are indenting by 1
		ovalRect.setSize(r.width-1, r.height-1);
		
		return ovalRect;
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