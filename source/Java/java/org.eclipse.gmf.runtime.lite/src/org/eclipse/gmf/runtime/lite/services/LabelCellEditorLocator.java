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
package org.eclipse.gmf.runtime.lite.services;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;

/**
 * Places cell editor over the label. Respects the zoom level and adjusts the font size accordingly.
 */
public class LabelCellEditorLocator implements CellEditorLocator {
	private final EditPartViewer myViewer;
	private final Label myLabel;

	public LabelCellEditorLocator(EditPartViewer viewer, Label label) {
		myViewer = viewer;
		myLabel = label;
	}

	public void relocate(CellEditor celleditor) {
		Rectangle rect = getLabel().getTextBounds();
		getLabel().translateToAbsolute(rect);
		if (getLabel().getFont() != null) {
			ZoomManager zoomManager = getZoomManager();
			double zoomLevel = zoomManager == null ? 1.0 : zoomManager.getZoom();
			if (zoomLevel > 1.0) {
				FontData[] datas = getLabel().getFont().getFontData();
				for(int i = 0; i < datas.length; i++) {
					datas[i].height *= zoomLevel;
				}
				final Font font = new Font(getLabel().getFont().getDevice(), datas);
				celleditor.getControl().setFont(font);
				celleditor.getControl().addDisposeListener(new DisposeListener() {
					public void widgetDisposed(DisposeEvent e) {
						font.dispose();
					}
				});
			} else {
				celleditor.getControl().setFont(getLabel().getFont());
			}
		}
		int avr = FigureUtilities.getFontMetrics(celleditor.getControl().getFont()).getAverageCharWidth();
		rect.setSize(new Dimension(celleditor.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
		celleditor.getControl().setBounds(rect.x, rect.y, rect.width, rect.height);
	}

	protected ZoomManager getZoomManager() {
		return (ZoomManager) myViewer.getProperty(ZoomManager.class.toString());
	}

	protected Label getLabel() {
		return myLabel;
	}
}
