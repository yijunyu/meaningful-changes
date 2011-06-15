/**
 * Copyright (c) 2007 Borland Software Corp.
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

import java.util.Collection;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.handles.HandleBounds;
import org.eclipse.gmf.runtime.lite.edit.policies.SideAffixedLayoutEditPolicy;


/**
 * Defines position for side-affixed elements. Used both for already created elements (by {@link BorderItemLocator}
 * and for feedback positioning while creating the element (by {@link SideAffixedLayoutEditPolicy}).
 * @author bblajer
 */
public abstract class SideAffixedElementPositioner {
	private static final Dimension BORDER_ITEM_OFFSET_DEFAULT = new Dimension(1, 1);
	private static final Dimension GAP_DEFAULT = new Dimension(8, 8);

	private Dimension borderItemOffset = BORDER_ITEM_OFFSET_DEFAULT;
	private Dimension myGap = GAP_DEFAULT;

	/**
	 * @return Returns the borderItemOffset.
	 */
	public Dimension getBorderItemOffset() {
		return borderItemOffset;
	}

	/**
	 * @param borderItemOffset
	 *            The borderItemOffset to set.
	 */
	public void setBorderItemOffset(Dimension borderItemOffset) {
		this.borderItemOffset = borderItemOffset;
	}

	/**
	 * Utility to calculate the parent bounds with consideration for the handle
	 * bounds inset.
	 * 
	 * @return <code>Rectangle</code> that is the bounds of the parent.
	 */
	protected Rectangle getParentBorder() {
		if (getHostFigure() instanceof HandleBounds) {
			return ((HandleBounds) getHostFigure()).getHandleBounds().getCopy();
		}
		return getHostFigure().getBounds().getCopy();
	}

	/**
	 * Ensure the suggested location actually lies on the parent boundary. The
	 * side takes precedence.
	 * 
	 * @param suggestedLocation
	 * @param suggestedSide
	 * @return point
	 */
	private Rectangle locateOnParent(Rectangle suggestedLocation, int suggestedSide) {
		Rectangle bounds = getParentBorder();
		Dimension borderItemOffset = getBorderItemOffset();
		int parentFigureWidth = bounds.width;
		int parentFigureHeight = bounds.height;
		int parentFigureX = bounds.x;
		int parentFigureY = bounds.y;
		int westX = parentFigureX - suggestedLocation.width + borderItemOffset.width;
		int eastX = parentFigureX + parentFigureWidth - borderItemOffset.width;
		int southY = parentFigureY + parentFigureHeight - borderItemOffset.height;
		int northY = parentFigureY - suggestedLocation.height + borderItemOffset.height;
		int newX;
		int newY;
		if (suggestedSide == PositionConstants.WEST) {
			newX = westX;
			newY = constrainValue(northY + suggestedLocation.height, southY - suggestedLocation.height, suggestedLocation.y);
		} else if (suggestedSide == PositionConstants.EAST) {
			newX = eastX;
			newY = constrainValue(northY + suggestedLocation.height, southY - suggestedLocation.height, suggestedLocation.y);
		} else if (suggestedSide == PositionConstants.SOUTH) {
			newY = southY;
			newX = constrainValue(westX + suggestedLocation.width, eastX - suggestedLocation.width, suggestedLocation.x);
		} else { // NORTH
			newY = northY;
			newX = constrainValue(westX + suggestedLocation.width, eastX - suggestedLocation.width, suggestedLocation.x);
		}
		return new Rectangle(newX, newY, suggestedLocation.width, suggestedLocation.height);
	}

	private static int constrainValue(int min, int max, int defaultValue) {
		if (defaultValue < min) {
			return min;
		}
		if (defaultValue > max) {
			return max;
		}
		return defaultValue;
	}

	/**
	 * The preferred side takes precedence.
	 * 
	 * @param suggestedLocation
	 * @param suggestedSide
	 * @param circuitCount  recursion count to avoid an infinite loop
	 * @return point
	 */
	protected final Rectangle locateOnBorder(Rectangle suggestedLocation, int suggestedSide, int circuitCount) {
		Rectangle recommendedLocation = locateOnParent(suggestedLocation, suggestedSide);

		Dimension gap = getGap();
		int vertical_gap = gap.height;
		int horizontal_gap = gap.width;

		if (circuitCount < 4 && conflicts(recommendedLocation)) {
			if (suggestedSide == PositionConstants.WEST) {
				do {
					recommendedLocation.y += recommendedLocation.height + vertical_gap;
				} while (conflicts(recommendedLocation));
				if (recommendedLocation.y > getParentBorder().getBottomLeft().y - recommendedLocation.height) { // off the bottom,
					// wrap south
					return locateOnBorder(recommendedLocation, PositionConstants.SOUTH, circuitCount + 1);
				}
			} else if (suggestedSide == PositionConstants.SOUTH) {
				do {
					recommendedLocation.x += recommendedLocation.width + horizontal_gap;
				} while (conflicts(recommendedLocation));
				if (recommendedLocation.x > getParentBorder().getBottomRight().x - recommendedLocation.width) {
					return locateOnBorder(recommendedLocation, PositionConstants.EAST, circuitCount + 1);
				}
			} else if (suggestedSide == PositionConstants.EAST) {
				// move up the east side
				do {
					recommendedLocation.y -= (recommendedLocation.height + vertical_gap);
				} while (conflicts(recommendedLocation));
				if (recommendedLocation.y < getParentBorder().getTopRight().y) {
					// east is full, try north.
					return locateOnBorder(recommendedLocation, PositionConstants.NORTH, circuitCount + 1);
				}
			} else { // NORTH
				do {
					recommendedLocation.x -= (recommendedLocation.width + horizontal_gap);
				} while (conflicts(recommendedLocation));
				if (recommendedLocation.x < getParentBorder().getTopLeft().x) {
					return locateOnBorder(recommendedLocation, PositionConstants.WEST, circuitCount + 1);
				}
			}
		}
		return recommendedLocation;
	}

	/**
	 * Determine if the the given rectangle conflicts with the position of an
	 * existing borderItemFigure.
	 * 
	 * @param recommendedLocation
	 * @return <code>true</code> or <code>false</code>
	 */
	protected boolean conflicts(Rectangle recommendedLocation) {
		for (IFigure borderItem : getSiblings()) {
			if (borderItem.isVisible()) {
				if (borderItem.getBounds().intersects(recommendedLocation)) {
					return true;
				}
			}
		}
		return false;
	}

	protected abstract Collection<? extends IFigure> getSiblings();

	/**
	 * Returns the gap to introduce if a side-affixed element conflicts to its sibling.
	 */
	protected Dimension getGap() {
		return myGap;
	}

	/**
	 * Sets the gap to introduce if a side-affixed element conflicts to its sibling.
	 * @param gap
	 */
	protected void setGap(Dimension gap) {
		myGap = gap;
	}

	/**
	 * Returns the valid location that is as close as possible to the given location. The given argument will not be modified.
	 * @param proposedLocation proposed location. 
	 */
	public Rectangle getValidLocation(Rectangle proposedLocation) {
		int side = findClosestSideOfParent(proposedLocation, getParentBorder());
		Rectangle realLocation = new Rectangle(proposedLocation.getTopLeft(), getBorderItemSize());
		return locateOnBorder(realLocation, side, 0);
	}

	/**
	 * Find the closest side when x,y is inside parent.
	 * 
	 * @param proposedLocation
	 * @param parentBorder
	 * @return draw constant
	 */
	public static int findClosestSideOfParent(Rectangle proposedLocation, Rectangle parentBorder) {
		// Rectangle parentBorder = getParentBorder();
		Point parentCenter = parentBorder.getCenter();
		Point childCenter = proposedLocation.getCenter();
		if (childCenter.x < parentCenter.x) // West, North or South.
		{
			if (childCenter.y < parentCenter.y) // west or north
			{
				// closer to west or north?
				Point parentTopLeft = parentBorder.getTopLeft();
				if ((childCenter.x - parentTopLeft.x) <= (childCenter.y - parentTopLeft.y)) {
					return PositionConstants.WEST;
				} else {
					return PositionConstants.NORTH;
				}
			} else { // west or south
				Point parentBottomLeft = parentBorder.getBottomLeft();
				if ((childCenter.x - parentBottomLeft.x) <= (parentBottomLeft.y - childCenter.y)) {
					return PositionConstants.WEST;
				} else {
					return PositionConstants.SOUTH;
				}
			}
		} else { // EAST, NORTH or SOUTH
			if (childCenter.y < parentCenter.y) // north or east
			{
				Point parentTopRight = parentBorder.getTopRight();
				if ((parentTopRight.x - childCenter.x) <= (childCenter.y - parentTopRight.y)) {
					return PositionConstants.EAST;
				} else {
					return PositionConstants.NORTH;
				}
			} else { // south or east.
				Point parentBottomRight = parentBorder.getBottomRight();
				if ((parentBottomRight.x - childCenter.x) <= (parentBottomRight.y - childCenter.y)) {
					return PositionConstants.EAST;
				} else {
					return PositionConstants.SOUTH;
				}
			}
		}
	}

	protected abstract IFigure getHostFigure();

	protected abstract Dimension getBorderItemSize();
}
