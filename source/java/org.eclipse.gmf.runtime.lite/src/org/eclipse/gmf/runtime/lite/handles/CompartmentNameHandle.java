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
package org.eclipse.gmf.runtime.lite.handles;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.TreeSearch;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.ZoomListener;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.handles.AbstractHandle;
import org.eclipse.gmf.runtime.lite.figures.ICompartmentHandleLocatorProvider;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;

public class CompartmentNameHandle extends AbstractHandle implements ZoomListener {
	private final Label myLabel;

	public CompartmentNameHandle(GraphicalEditPart owner, String title) {
		setOwner(owner);
		setLocator(new CompartmentHandleLocator());
		myLabel = new Label();
		setLayoutManager(new StackLayout());
		add(myLabel);
		myZoomManager = (ZoomManager) getOwner().getViewer().getProperty(ZoomManager.class.toString());
		double zoomLevel = myZoomManager == null ? 1.0 : myZoomManager.getZoom();
		zoomLevel *= getFontScaleFactor();
		if (getOwnerFigure().getFont() != null) {
			Font font = getScaledFont(zoomLevel);
			myLabel.setFont(font);
			if (myZoomManager != null) {
				myZoomManager.addZoomListener(this);
			}
		}
		myLabel.setLabelAlignment(PositionConstants.BOTTOM);
		myLabel.setText(title);
	}

	@Override
	public void ancestorRemoved(IFigure ancestor) {
		replaceFont(null);
		if (myZoomManager != null) {
			myZoomManager.removeZoomListener(CompartmentNameHandle.this);
		}
	}

	public void zoomChanged(double zoom) {
		Font font = getScaledFont(zoom * getFontScaleFactor());
		replaceFont(font);
	}

	protected void replaceFont(Font newFont) {
		Font font = myLabel.getFont();
		myLabel.setFont(newFont);
		if (font != null) {
			font.dispose();
		}
	}

	private Font getScaledFont(double scaleFactor) {
		FontData[] datas = getOwnerFigure().getFont().getFontData();
		for (int i = 0; i < datas.length; i++) {
			datas[i].height *= scaleFactor;
		}
		return new Font(getOwnerFigure().getFont().getDevice(), datas);
	}

	protected double getFontScaleFactor() {
		return 1.0 / 1.5;	//make compartment name 1.5 times smaller than labels
	}

	protected final Label getLabel() {
		return myLabel;
	}

	@Override
	public IFigure findFigureAt(int x, int y, TreeSearch search) {
		IFigure result = super.findFigureAt(x, y, search);
		if (result == myLabel) {
			return this;
		}
		return result;
	}

	@Override
	protected DragTracker createDragTracker() {
		return null;
	}

	protected class CompartmentHandleLocator implements Locator {
		public void relocate(IFigure target) {
			if (getOwnerFigure() instanceof ICompartmentHandleLocatorProvider) {
				((ICompartmentHandleLocatorProvider) getOwnerFigure()).getCompartmentHandleLocator().relocate(target);
				return;
			}
			Rectangle theBounds = getOwnerFigure().getClientArea();
			getOwnerFigure().translateToAbsolute(theBounds);
			target.translateToRelative(theBounds);
			Dimension preferredSize = target.getPreferredSize();
			theBounds.height = Math.min(theBounds.height, preferredSize.height);
			theBounds.width = Math.max(theBounds.width, preferredSize.width);
			target.setSize(theBounds.getSize().expand(-1, -1));
			target.setLocation(theBounds.getLocation().translate(0, -target.getSize().height/2));
		}
	}

	private ZoomManager myZoomManager;
}
