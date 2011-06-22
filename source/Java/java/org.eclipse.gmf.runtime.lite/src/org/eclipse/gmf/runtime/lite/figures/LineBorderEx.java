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

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.swt.graphics.Color;

/**
 * A line border with configurability of which sides to paint.
 * @author bblajer
 */
public class LineBorderEx extends LineBorder {
	private final int myPosition;

	public LineBorderEx(int position) {
		myPosition = position;
	}

	public LineBorderEx(Color color, int width, int position) {
		super(color, width);
		myPosition = position;
	}

	public LineBorderEx(Color color, int position) {
		super(color);
		myPosition = position;
	}

	@Override
	public boolean isOpaque() {
		return false;
	}

	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		tempRect.setBounds(getPaintRectangle(figure, insets));
		if (getWidth() % 2 == 1) {
			tempRect.width--;
			tempRect.height--;
		}
		tempRect.shrink(getWidth() / 2, getWidth() / 2);
		graphics.setLineWidth(getWidth());
		if ((myPosition & PositionConstants.TOP) > 0) {
			graphics.drawLine(tempRect.getTopLeft(), tempRect.getTopRight());
		}
		if ((myPosition & PositionConstants.BOTTOM) > 0) {
			graphics.drawLine(tempRect.getBottomLeft(), tempRect.getBottomRight());
		}
		if ((myPosition & PositionConstants.LEFT) > 0) {
			graphics.drawLine(tempRect.getTopLeft(), tempRect.getBottomLeft());
		}
		if ((myPosition & PositionConstants.RIGHT) > 0) {
			graphics.drawLine(tempRect.getTopRight(), tempRect.getBottomRight());
		}
	}
}
