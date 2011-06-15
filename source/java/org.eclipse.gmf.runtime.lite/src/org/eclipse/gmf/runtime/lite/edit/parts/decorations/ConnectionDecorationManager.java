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

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Decoration manager that places decorations over the given connection figure.
 * The actual position of the decoration
 * is controlled by the {@link #getDecorationPosition(String)} method.
 * @author bblajer
 */
public class ConnectionDecorationManager extends AbstractDecorationManager {
	public ConnectionDecorationManager(Connection decorationParent) {
		super(decorationParent);
	}

	@Override
	protected Object getConstraint(String key, IFigure decoration) {
		return new DecorationLocator(getDecorationPosition(key));
	}

	/**
	 * Returns the {@link PositionConstants position} where the decorator with the given key
	 * should appear. By default, all decorators are positioned in the center of the connection
	 * Subclasses may reimplement.
	 * @param key the key which is used to install the decorator
	 */
	protected DecorationPosition getDecorationPosition(String key) {
		return DecorationPosition.CENTER;
	}

	public static enum DecorationPosition {
		SOURCE,
		CENTER,
		TARGET
	}

	private class DecorationLocator implements Locator {
		private final DecorationPosition myPosition;
		public DecorationLocator(DecorationPosition position) {
			myPosition = position;
		}
		public void relocate(IFigure target) {
			Dimension size = target.getPreferredSize();
			Connection connection = (Connection) getDecorationParent();
			Point pt;
			switch (myPosition) {
			case SOURCE:
				pt = connection.getPoints().getFirstPoint();
				break;
			case CENTER:
				pt = connection.getPoints().getMidpoint();
				break;
			case TARGET:
				pt = connection.getPoints().getLastPoint();
				break;
			default:
				pt = connection.getPoints().getMidpoint();
				break;
			}
			target.setBounds(new Rectangle(pt, size));
		}
	}
}
