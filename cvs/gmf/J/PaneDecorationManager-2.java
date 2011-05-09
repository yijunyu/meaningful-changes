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
package org.eclipse.gmf.runtime.lite.edit.parts.decorations;

import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Decoration manager that places decorations as children of a given figure.
 * The actual position of the decoration
 * is controlled by the {@link #getDecorationPosition(String)} method.
 * @author bblajer
 */
public class PaneDecorationManager extends AbstractDecorationManager {
	public PaneDecorationManager(IFigure decorationParent) {
		super(decorationParent);
		decorationParent.setLayoutManager(new DelegatingLayout());
	}

	@Override
	protected Object getConstraint(String key, IFigure decoration) {
		return new DecorationLocator(getDecorationPosition(key));
	}

	/**
	 * Returns the {@link PositionConstants position} where the decorator with the given key
	 * should appear. By default, all decorators are positioned to the north-west of the parent figure.
	 * Subclasses may reimplement.
	 * @param key the key which is used to install the decorator
	 */
	protected int getDecorationPosition(String key) {
		return PositionConstants.NORTH_WEST;
	}

	private class DecorationLocator implements Locator {
		private final int myPosition;
		public DecorationLocator(int position) {
			myPosition = position;
		}
		public void relocate(IFigure target) {
			Rectangle bounds = getDecorationParent().getBounds().getCopy();
			Dimension size = target.getPreferredSize();
			Point pt = bounds.getTopLeft();
			switch (myPosition & PositionConstants.EAST_WEST) {
			case PositionConstants.WEST:
				break;
			case 0:
			case PositionConstants.EAST_WEST:
				pt.x += (bounds.width - size.width)/2;
				break;
			case PositionConstants.EAST:
				pt.x += bounds.width - size.width;
				break;
			}
			switch (myPosition & PositionConstants.NORTH_SOUTH) {
			case PositionConstants.NORTH:
				break;
			case 0:
			case PositionConstants.NORTH_SOUTH:
				pt.y += (bounds.height - size.height)/2;
				break;
			case PositionConstants.SOUTH:
				pt.y += bounds.height - size.height;
				break;
			}
			target.setBounds(new Rectangle(pt, size));
		}
	}
}
