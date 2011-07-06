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

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Default implementation of compartments for the lite runtime. It manages the place for the 
 * optional compartment name (which is visible only when the compartment owner is selected).
 * @author bblajer
 */
public class CompartmentFigure extends Figure implements ICompartmentHandleLocatorProvider {
	public CompartmentFigure() {
		setMinimumSize(new Dimension(10, 10));
		setHeaderHeight(10);
	}

	@Override
	public void addNotify() {
		if (getFont() != null) {
			setHeaderHeight(getFont().getFontData()[0].getHeight());
		}
		super.addNotify();
	}

	public void setHeaderHeight(int height) {
		super.setBorder(new CompoundBorder(new LineBorderEx(ColorConstants.black, 1, PositionConstants.TOP), new MarginBorder(height, 0, 0, 0)));
	}

	@Override
	public final void setBorder(Border border) {
		//Do nothing. The code of the figure relies on the fact that border is managed by itself.
	}

	public Locator getCompartmentHandleLocator() {
		return new Locator() {
			public void relocate(IFigure target) {
				Rectangle theBounds = CompartmentFigure.this.getBounds().getCopy();
				CompartmentFigure.this.translateToAbsolute(theBounds);
				target.translateToRelative(theBounds);
				Dimension preferredSize = target.getPreferredSize();
				theBounds.height = Math.min(theBounds.height, preferredSize.height);
				theBounds.width = Math.max(theBounds.width, preferredSize.width);
				target.setBounds(theBounds);
			}
		};
	}
}
