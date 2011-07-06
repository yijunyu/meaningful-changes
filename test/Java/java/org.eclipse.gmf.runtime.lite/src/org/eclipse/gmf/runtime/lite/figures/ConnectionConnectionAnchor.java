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

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;


public class ConnectionConnectionAnchor extends ChopboxAnchor {
	public ConnectionConnectionAnchor(Connection figure) {
		super(figure);
	}

	@Override
	protected Rectangle getBox() {
		PointList points = ((Connection) getOwner()).getPoints();
		if (points == null || points.size() == 0) {
			return super.getBox();
		}
		return new Rectangle(points.getMidpoint(), new Dimension(1,1));
	}
}
