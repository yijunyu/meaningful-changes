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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;


public class BorderItemLocator extends SideAffixedElementPositioner implements Locator {
	private final GraphicalEditPart myHostEditPart;
	private Rectangle myModelConstraint;


	private int preferredSide = PositionConstants.WEST;
	private int currentSide = PositionConstants.WEST;

	/**
	 * Constructs an instance of BorderItemLocator. 
	 * @param editPart the side affixed edit part
	 */
	public BorderItemLocator(GraphicalEditPart editPart) {
		myHostEditPart = editPart;
	}

	public void setModelConstraint(Rectangle rectangle) {
		myModelConstraint = rectangle;
		if (getTargetFigure().getParent() != null) {
			getTargetFigure().getParent().revalidate();
		}
	}

	protected final IFigure getTargetFigure() {
		return myHostEditPart.getFigure();
	}

	public Rectangle getModelConstraint() {
		return myModelConstraint;
	}

	/**
	 * Get the preferred location. If none has been previously set, use the
	 * preferred side to take an initial guess.
	 * 
	 * @return {@link Rectangle} A new rectangle representing the preferred location.
	 */
	protected Rectangle getPreferredLocation() {
		if (getModelConstraint() == null) {
			return getPreferredLocation(getPreferredSideOfParent());
		}
		return toContainerCoordinates(getModelConstraint().getCopy());
	}

	/**
	 * Get an initial location based on the side. ( choose middle of the side )
	 * 
	 * @param side
	 *            the preferred side of the parent figure on which to place this
	 *            border item as defined in {@link PositionConstants}
	 * @return point
	 */
	protected Rectangle getPreferredLocation(int side) {
		Rectangle bounds = getParentBorder();
		int parentFigureWidth = bounds.width;
		int parentFigureHeight = bounds.height;
		int parentFigureX = bounds.x;
		int parentFigureY = bounds.y;
		int x = parentFigureX;
		int y = parentFigureY;

		Dimension borderItemSize = getBorderItemSize();

		if (side == PositionConstants.WEST) {
			x += getBorderItemOffset().width - borderItemSize.width;
			y += (parentFigureHeight - borderItemSize.height) / 2;
		} else if (side == PositionConstants.EAST) {
			x += parentFigureWidth - getBorderItemOffset().width;
			y += (parentFigureHeight - borderItemSize.height) / 2;
		} else if (side == PositionConstants.NORTH) {
			x += (parentFigureWidth - borderItemSize.width) / 2;
			y += getBorderItemOffset().height - borderItemSize.height;
		} else if (side == PositionConstants.SOUTH) {
			x += (parentFigureWidth - borderItemSize.width) / 2;
			y += parentFigureHeight - getBorderItemOffset().height;
		}
		return new Rectangle(x, y, borderItemSize.width, borderItemSize.height);
	}

	/**
	 * Convert the relative coordinates in the model to ones that are relative to the
	 * container. 
	 * This is an auxiliary method.
	 * @param relativeOffset
	 * @return point
	 */
	public Rectangle toContainerCoordinates(Rectangle relativeOffset) {
		Point parentOrigin = getParentBorder().getTopLeft();
		relativeOffset.translate(parentOrigin);
		return relativeOffset;
	}

	public void relocate(IFigure borderItem) {
		assert getTargetFigure() == borderItem;
		Rectangle rectSuggested = getPreferredLocation();
		int closestSide = findClosestSideOfParent(rectSuggested, getParentBorder());
		setPreferredSideOfParent(closestSide);

		Rectangle newLocation = locateOnBorder(rectSuggested, getPreferredSideOfParent(), 0);
		
		borderItem.setBounds(newLocation);

		setCurrentSideOfParent(findClosestSideOfParent(newLocation, getParentBorder()));
	}

	/**
	 * getter for the parent figure
	 * 
	 * @return <code>IFigure</code>
	 */
	public IFigure getHostFigure() {
		return ((GraphicalEditPart) myHostEditPart.getParent()).getFigure();
	}

	/**
	 * Returns the preferred side of the parent figure on which to place this
	 * border item.
	 * 
	 * @return the preferred side of the parent figure on which to place this
	 *         border item as defined in {@link PositionConstants}
	 */
	public int getPreferredSideOfParent() {
		return preferredSide;
	}

	/**
	 * Sets the preferred side of the parent figure on which to place this
	 * border item.
	 * 
	 * @param preferredSide
	 *            the preferred side of the parent figure on which to place this
	 *            border item as defined in {@link PositionConstants}
	 */
	public void setPreferredSideOfParent(int preferredSide) {
		this.preferredSide = preferredSide;
		setCurrentSideOfParent(preferredSide);
	}
	
	public int getCurrentSideOfParent() {
		return currentSide;
	}

	/**
	 * Sets the side of the parent figure on which the border item should
	 * appear.
	 * 
	 * @param side
	 *            the side on which this border item appears as defined in
	 *            {@link PositionConstants}
	 */
	public void setCurrentSideOfParent(int side) {
		this.currentSide = side;
	}

	/**
	 * Gets the size of the border item figure.
	 * @param borderItem
	 * @return the size of the border item figure.
	 */
	protected Dimension getBorderItemSize() {
		Rectangle offset = getModelConstraint();
        Dimension size = offset == null ? null : offset.getSize();
        if (size == null || size.isEmpty()) {
        	size = getTargetFigure().getPreferredSize().getCopy();
        }
        return size;
	}

	@Override
	protected Collection<? extends IFigure> getSiblings() {
		List<?> children = myHostEditPart.getParent().getChildren();
		Collection<IFigure> result = new ArrayList<IFigure>(children.size());
		for (Object next : children) {
			GraphicalEditPart nextChild = (GraphicalEditPart) next;
			if (!nextChild.isActive()) {
				continue;
			}
			if (nextChild == myHostEditPart) {
				continue;
			}
			IFigure nextFigure = nextChild.getFigure();
			if (nextFigure.getParent() == myHostEditPart.getFigure().getParent()) {
				result.add(nextChild.getFigure());
			}
		}
		return result;
	}
}
