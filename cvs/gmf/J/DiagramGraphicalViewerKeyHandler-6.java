/******************************************************************************
 * Copyright (c) 2000, 2008  IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.diagram.ui.internal.parts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;

/**
 * @author melaasar
 * @canBeSeenBy org.eclipse.gmf.runtime.diagram.ui.*
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 *
 * <p>
 * Code taken from Eclipse reference bugzilla #98820
 *
 */
public class DiagramGraphicalViewerKeyHandler
	extends GraphicalViewerKeyHandler {

	/**
	 * @param viewer
	 */
	public DiagramGraphicalViewerKeyHandler(GraphicalViewer viewer) {
		super(viewer);
	}

	/**
	 * @see org.eclipse.gef.KeyHandler#keyPressed(org.eclipse.swt.events.KeyEvent)
	 */
	public boolean keyPressed(KeyEvent event) {
		switch (event.keyCode) {
			case SWT.HOME :
				if ((event.stateMask & SWT.ALT) != 0) {
					if (navigateEndSibling(event, PositionConstants.WEST))
						return true;
				} else {
					if (navigateEndSibling(event, PositionConstants.NORTH))
						return true;
				}
                break;
			case SWT.END :
				if ((event.stateMask & SWT.ALT) != 0) {
					if (navigateEndSibling(event, PositionConstants.EAST))
						return true;
				} else {
					if (navigateEndSibling(event, PositionConstants.SOUTH))
						return true;
				}
                break;
			case SWT.PAGE_UP :
				if ((event.stateMask & SWT.ALT) != 0) {
					if (navigatePageSibling(event, PositionConstants.WEST))
						return true;
				} else {
					if (navigatePageSibling(event, PositionConstants.NORTH))
						return true;
				}
                break;
			case SWT.PAGE_DOWN :
				if ((event.stateMask & SWT.ALT) != 0) {
					if (navigatePageSibling(event, PositionConstants.EAST))
						return true;
				} else {
					if (navigatePageSibling(event, PositionConstants.SOUTH))
						return true;
				}
	        case SWT.TAB:
	            if ((event.stateMask & SWT.SHIFT) != 0) {
                    if (navigateNextHorizontalSibling(isViewerMirrored() ? PositionConstants.EAST
                        : PositionConstants.WEST)) {
                        return true;
                    }
                } else {
                    if (navigateNextHorizontalSibling(isViewerMirrored() ? PositionConstants.WEST
                        : PositionConstants.EAST)) {
                        return true;
                    }
                }
                break;
		}
		return super.keyPressed(event);
	}

	/**
	 * @return
	 */
	protected GraphicalEditPart getFocusPart() {
		return (GraphicalEditPart) getViewer().getFocusEditPart();
	}

	/**
	 * @param part
	 * @param event
	 */
	protected void navigateToPart(EditPart part, KeyEvent event) {
		if (part == null)
			return;
		if (!part.isSelectable()) {
			getViewer().deselectAll();
			getViewer().setFocus(part);
		} else if ((event.stateMask & SWT.SHIFT) != 0) {
			getViewer().appendSelection(part);
			getViewer().setFocus(part);
		} else if ((event.stateMask & SWT.CONTROL) != 0)
			getViewer().setFocus(part);
		else
			getViewer().select(part);
		getViewer().reveal(part);
	}

	/**
	 * @return
	 */
	protected List getPartNavigationSiblings() {
        EditPart epParent = findParent(getFocusPart());
        if (epParent != null)
            return epParent.getChildren();
        else
            return null;
	}

	/**
	 * @param figure
	 * @return
	 */
	protected Point getFigureInterestingPoint(IFigure figure) {
		return figure.getBounds().getCenter();
	}

	protected Viewport findViewport(GraphicalEditPart part) {
        if (part == null) 
            return null;
        
		IFigure figure = null;
		Viewport port = null;
		do {
			if (figure == null)
				figure = part.getContentPane();
			else
				figure = figure.getParent();
			if (figure instanceof Viewport) {
				port = (Viewport) figure;
				break;
			}
		} while (figure != null);
		return port;
	}

	/**
	 * @param event
	 * @param direction
	 * @param page
	 * @param list
	 * @return
	 */
	protected boolean navigatePageSibling(KeyEvent event, int direction) {
		GraphicalEditPart epStart = getFocusPart();
		IFigure figure = epStart.getFigure();
		Point pStart = getFigureInterestingPoint(figure);
		figure.translateToAbsolute(pStart);

		GraphicalEditPart epParent = (GraphicalEditPart) findParent(epStart);
		Viewport viewport = findViewport(epParent);
		Rectangle bounds =
			(viewport != null)
				? new Rectangle(viewport.getBounds())
				: epParent.getFigure().getClientArea();
		figure.translateToAbsolute(bounds);
		int pageDistance = 0;
		switch (direction) {
			case PositionConstants.NORTH :
			case PositionConstants.SOUTH :
				pageDistance = bounds.height;
				break;
			case PositionConstants.EAST :
			case PositionConstants.WEST :
				pageDistance = bounds.width;
				break;
		}

		List editParts =
			findPageSibling(
				getPartNavigationSiblings(),
				pStart,
				pageDistance,
				direction,
				epStart);
		if (editParts.isEmpty())
			return false;
		if ((event.stateMask & SWT.SHIFT) != 0) {
			Iterator parts = editParts.iterator();
			while (parts.hasNext())
				navigateToPart((EditPart) parts.next(), event);
		} else {
			EditPart part = (EditPart) editParts.get(editParts.size() - 1);
			navigateToPart(part, event);
		}
		return true;
	}

	/**
	 * @param event
	 * @param direction
	 * @param list
	 * @return
	 */
	protected boolean navigateEndSibling(KeyEvent event, int direction) {
		GraphicalEditPart epStart = getFocusPart();
		IFigure figure = epStart.getFigure();
		Point pStart = getFigureInterestingPoint(figure);
		figure.translateToAbsolute(pStart);
		List editParts =
			findEndSibling(
				getPartNavigationSiblings(),
				pStart,
				direction,
				epStart);
		if (editParts.isEmpty())
			return false;
		if ((event.stateMask & SWT.SHIFT) != 0) {
			Iterator parts = editParts.iterator();
			while (parts.hasNext())
				navigateToPart((EditPart) parts.next(), event);
		} else {
			EditPart part = (EditPart) editParts.get(editParts.size() - 1);
			navigateToPart(part, event);
		}
		return true;
	}

	/**
	 * @param siblings
	 * @param pStart
	 * @param minDistance
	 * @param direction
	 * @param exclude
	 * @return
	 */
	private List findPageSibling(
		List siblings,
		Point pStart,
		int pageDistance,
		int direction,
		EditPart exclude) {
		GraphicalEditPart epCurrent;
		GraphicalEditPart epFinal = null;
		List selection = new ArrayList();
		IFigure figure;
		Point pCurrent;
		int distance = 0;

		Iterator iter = siblings.iterator();
		while (iter.hasNext()) {
			epCurrent = (GraphicalEditPart) iter.next();
			if (epCurrent == exclude
				|| !epCurrent.getFigure().isVisible()
				|| epCurrent.getFigure().getBounds().isEmpty())
				continue;
			figure = epCurrent.getFigure();
			pCurrent = getFigureInterestingPoint(figure);
			figure.translateToAbsolute(pCurrent);
			if (pStart.getPosition(pCurrent) != direction)
				continue;

			int d = pCurrent.getDistanceOrthogonal(pStart);
			if (d <= pageDistance) {
				selection.add(epCurrent);
				if (d > distance) {
					distance = d;
					epFinal = epCurrent;
				}
			}
			if (epFinal != null) {
				selection.remove(epFinal);
				selection.add(epFinal);
			}
		}
		return selection;
	}

	/**
	 * @param siblings
	 * @param pStart
	 * @param direction
	 * @param exclude
	 * @return
	 */
	private List findEndSibling(
		List siblings,
		Point pStart,
		int direction,
		EditPart exclude) {
		GraphicalEditPart epCurrent;
		GraphicalEditPart epFinal = null;
		List selection = new ArrayList();
		IFigure figure;
		Point pCurrent;
		int distance = 0;

		Iterator iter = siblings.iterator();
		while (iter.hasNext()) {
			epCurrent = (GraphicalEditPart) iter.next();
			if (epCurrent == exclude
				|| !epCurrent.getFigure().isVisible()
				|| epCurrent.getFigure().getBounds().isEmpty())
				continue;
			figure = epCurrent.getFigure();
			pCurrent = getFigureInterestingPoint(figure);
			figure.translateToAbsolute(pCurrent);
			if (pStart.getPosition(pCurrent) != direction)
				continue;

			selection.add(epCurrent);
			int d = pCurrent.getDistanceOrthogonal(pStart);
			if (d > distance) {
				distance = d;
				epFinal = epCurrent;
			}
		}
		if (epFinal != null) {
			selection.remove(epFinal);
			selection.add(epFinal);
		}
		return selection;
	}
    
    
    /**
     * @param child
     * @return EditPart
     */
    private EditPart findParent(EditPart child) {
        //check to see if we are not looking for a parent on RootEditPart, 
        //as it does not have a parent.
        if (child instanceof RootEditPart)
            return child;
        else
            return child.getParent(); //any other EditPart    
    }

    /**
     * Traverses to the closest EditPart in the given list that is also in the
     * given direction (EAST or WEST). The x-location alone is used to determine
     * the closest sibling. If the direction is EAST and there are no EditParts
     * to the EAST then the farthest WEST EditPart is returned (and vice versa).
     * This allows the user to cycle through all the EditParts using the TAB
     * key.
     * 
     * @param direction
     *            the direction in which to navigate (either
     *            PositionConstants.WEST or PositionConstants.EAST)
     * @return true if a sibling was found to navigate to; false otherwise.
     */
    private boolean navigateNextHorizontalSibling(int direction) {
        GraphicalEditPart epStart = getFocusEditPart();
        EditPart next = null;
        if (epStart instanceof DiagramEditPart) {
            next = findClosestHorizontalSibling(epStart.getChildren(),
                new Point(0, 0), PositionConstants.EAST, null);
        } else {
            IFigure figure = epStart.getFigure();
            Point pStart = figure.getBounds().getCenter();
            figure.translateToAbsolute(pStart);
            next = findClosestHorizontalSibling(getNavigationSiblings(),
                pStart, direction, epStart);
        }
        if (next == null)
            return false;

        getViewer().select(next);
        getViewer().reveal(next);
        return true;
    }

    /**
     * Given an absolute point (pStart) and a list of EditParts, this method
     * finds the closest EditPart (except for the one to be excluded) in the
     * given direction (EAST or WEST). The x-location alone is used to determine
     * the closest sibling. If the direction is EAST and there are no EditParts
     * to the EAST then the farthest WEST EditPart is returned (and vice versa).
     * This allows the user to cycle through all the EditParts using the TAB
     * key.
     * 
     * @param siblings
     *            List of sibling EditParts
     * @param pStart
     *            The starting point (must be in absolute coordinates) from
     *            which the next sibling is to be found.
     * @param direction
     *            PositionConstants.EAST or PositionConstants.WEST
     * @param exclude
     *            The EditPart to be excluded from the search
     */
    private GraphicalEditPart findClosestHorizontalSibling(List siblings,
            Point pStart, int direction, EditPart exclude) {
        GraphicalEditPart epCurrent;
        GraphicalEditPart epFinal = null;
        GraphicalEditPart epCycle = null; // in case there are no more shapes
                                            // in this direction
        IFigure figure;
        Point pCurrent;
        int distance = Integer.MAX_VALUE;
        int xCycle = direction == PositionConstants.EAST ? Integer.MAX_VALUE
            : 0;

        Iterator iter = siblings.iterator();
        while (iter.hasNext()) {
            epCurrent = (GraphicalEditPart) iter.next();
            if (epCurrent == exclude || !epCurrent.isSelectable())
                continue;
            figure = epCurrent.getFigure();
            pCurrent = figure.getBounds().getCenter();
            figure.translateToAbsolute(pCurrent);

            int dx = pCurrent.x - pStart.x;

            if ((direction == PositionConstants.EAST && dx > 0)
                || (direction == PositionConstants.WEST && dx < 0)) {
                int abs_dx = Math.abs(dx);
                if (abs_dx < distance) {
                    distance = abs_dx;
                    epFinal = epCurrent;
                }
            }

            if (epFinal == null) {
                if (direction == PositionConstants.EAST && pCurrent.x < xCycle) {
                    xCycle = pCurrent.x;
                    epCycle = epCurrent;
                } else if (direction == PositionConstants.WEST
                    && pCurrent.x > xCycle) {
                    xCycle = pCurrent.x;
                    epCycle = epCurrent;
                }
            }
        }
        if (epFinal == null) {
            return epCycle;
        }
        return epFinal;
    }
    
}