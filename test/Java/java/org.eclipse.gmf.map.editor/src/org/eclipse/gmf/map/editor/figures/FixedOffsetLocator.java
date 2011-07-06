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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.handles.HandleBounds;

/**
 * @author dstadnik
 */
public class FixedOffsetLocator implements Locator {

	protected IFigure reference;

	protected Point offset;

	protected int alignment; // PositionConstants

	public FixedOffsetLocator(IFigure reference, Point offset, int alignment) {
		this.reference = reference;
		this.offset = offset;
		this.alignment = alignment;
	}

	public void relocate(IFigure target) {
		Rectangle bounds = reference instanceof HandleBounds ? ((HandleBounds) reference).getHandleBounds() : reference.getBounds();
		bounds = bounds.getCopy();
		reference.translateToAbsolute(bounds);
		target.translateToRelative(bounds);
		setLocation(bounds, target);
		target.setSize(target.getPreferredSize());
	}

	protected void setLocation(Rectangle refBounds, IFigure target) {
		Point p;
		switch (alignment) {
		case PositionConstants.LEFT:
			p = refBounds.getLeft();
			break;
		case PositionConstants.RIGHT:
			p = refBounds.getRight();
			break;
		default:
			p = refBounds.getCenter();
			break;
		}
		target.setLocation(p.getTranslated(offset));
	}
}
