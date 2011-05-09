/**
 * Copyright (c) 2006, 2007 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.edit.parts;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.gmfgraph.Alignment;
import org.eclipse.gmf.gmfgraph.BorderLayout;
import org.eclipse.gmf.gmfgraph.BorderLayoutData;
import org.eclipse.gmf.gmfgraph.FlowLayout;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.GridLayout;
import org.eclipse.gmf.gmfgraph.Layout;
import org.eclipse.gmf.gmfgraph.LayoutData;
import org.eclipse.gmf.gmfgraph.Layoutable;
import org.eclipse.gmf.gmfgraph.LineKind;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.XYLayoutData;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.View;

public abstract class AbstractFigureEditPart extends ShapeNodeEditPart {

	public AbstractFigureEditPart(View view) {
		super(view);
	}

	public Object getLayoutConstraint() {
		Layoutable layoutable = (Layoutable) ((View) getModel()).getElement();
		if (layoutable == null || layoutable.getLayoutData() == null) {
			return null;
		}
		LayoutData layoutData = layoutable.getLayoutData();
		switch (layoutData.eClass().getClassifierID()) {
		case GMFGraphPackage.BORDER_LAYOUT_DATA: {
			BorderLayoutData borderLayoutData = (BorderLayoutData) layoutData;
			if (borderLayoutData.getAlignment() != null) {
				switch (borderLayoutData.getAlignment().getValue()) {
				case Alignment.CENTER:
				case Alignment.FILL: {
					return org.eclipse.draw2d.BorderLayout.CENTER;
				}
				case Alignment.BEGINNING: {
					return borderLayoutData.isVertical() ? org.eclipse.draw2d.BorderLayout.TOP : org.eclipse.draw2d.BorderLayout.LEFT;
				}
				case Alignment.END: {
					return borderLayoutData.isVertical() ? org.eclipse.draw2d.BorderLayout.BOTTOM : org.eclipse.draw2d.BorderLayout.RIGHT;
				}
				}
			}
			break;
		}
		case GMFGraphPackage.CUSTOM_LAYOUT_DATA: {
			// TODO: implement custom layout
			break;
		}
		case GMFGraphPackage.GRID_LAYOUT_DATA: {
			// not implemented yet in .gmfgraph
			break;
		}
		case GMFGraphPackage.XY_LAYOUT_DATA: {
			final XYLayoutData xyLayoutData = (XYLayoutData) layoutData;
			Rectangle result = new Rectangle();
			if (xyLayoutData.getTopLeft() != null) {
				result.setLocation(getMapMode().DPtoLP(xyLayoutData.getTopLeft().getX()), getMapMode().DPtoLP(xyLayoutData.getTopLeft().getY()));
			}
			if (xyLayoutData.getSize() != null) {
				result.setSize(getMapMode().DPtoLP(xyLayoutData.getSize().getDx()), getMapMode().DPtoLP(xyLayoutData.getSize().getDy()));
			}
			return result;
		}
		}
		return null;
	}

	protected void addChildVisual(EditPart childEditPart, int index) {
		IFigure child = ((GraphicalEditPart) childEditPart).getFigure();
		Object layoutConstraint = null;
		if (childEditPart instanceof AbstractFigureEditPart) {
			layoutConstraint = ((AbstractFigureEditPart) childEditPart).getLayoutConstraint();
		}
		LayoutManager layoutManager = getContentPane().getLayoutManager();
		if (layoutManager instanceof org.eclipse.draw2d.BorderLayout) {
			if (org.eclipse.draw2d.BorderLayout.BOTTOM != layoutConstraint && org.eclipse.draw2d.BorderLayout.CENTER != layoutConstraint && org.eclipse.draw2d.BorderLayout.LEFT != layoutConstraint
					&& org.eclipse.draw2d.BorderLayout.RIGHT != layoutConstraint && org.eclipse.draw2d.BorderLayout.TOP != layoutConstraint) {
				// TODO: put figure into special pain with unconstrained
				// elements instead
				layoutConstraint = null;
			}
		} else if (layoutManager instanceof GridLayout) {
			// not implemented yet in .gmfgraph
		} else if (layoutManager instanceof XYLayout) {
			if (false == layoutConstraint instanceof Rectangle) {
				// TODO: put figure into special pain with unconstrained
				// elements instead
				layoutConstraint = null;
			}
		}
		getContentPane().add(child, layoutConstraint, index);
	}

	/**
	 * This method will be called then new LayoutData object was associated with
	 * this model element.
	 * 
	 * All the layout constraints (LayoutData objects) are actually stored in
	 * model, so just calling <code>handleMajorSemanticChange()</code> to
	 * re-create this EditPart and reload all the LayoutDatas from model
	 * 
	 */
	protected void layoutDataChanged(LayoutData layoutData) {
		if (isFigureRefreshAllowed()) {
			handleMajorSemanticChange();
		}
	}

	/**
	 * This method will be called then layout was changed in model. The same
	 * method will be called to initialize layout on creating figure.
	 * 
	 * The only one way to change layout is to change corresponding model
	 * element now.
	 */
	protected void layoutChanged(Layout layout) {
		if (layout == null) {
			setFigureLayoutManager(null);
			return;
		}

		switch (layout.eClass().getClassifierID()) {
		case GMFGraphPackage.BORDER_LAYOUT: {
			BorderLayout borderLayout = (BorderLayout) layout;
			org.eclipse.draw2d.BorderLayout layoutManager;
			if (getFigureLayoutManager() instanceof org.eclipse.draw2d.BorderLayout) {
				layoutManager = (org.eclipse.draw2d.BorderLayout) getFigureLayoutManager();
			} else {
				layoutManager = new org.eclipse.draw2d.BorderLayout();
				setFigureLayoutManager(layoutManager);
			}
			if (borderLayout.getSpacing() != null) {
				layoutManager.setHorizontalSpacing(getMapMode().DPtoLP(borderLayout.getSpacing().getDx()));
				layoutManager.setVerticalSpacing(getMapMode().DPtoLP(borderLayout.getSpacing().getDy()));
			}
			break;
		}
		case GMFGraphPackage.CUSTOM_LAYOUT: {
			// TODO: implement custom layout
			break;
		}
		case GMFGraphPackage.FLOW_LAYOUT: {
			FlowLayout flowLayout = (FlowLayout) layout;
			if (flowLayout.isForceSingleLine()) {
				ToolbarLayout layoutManager;
				if (getFigureLayoutManager() instanceof ToolbarLayout) {
					layoutManager = (ToolbarLayout) getFigureLayoutManager();
				} else {
					layoutManager = new ToolbarLayout();
					setFigureLayoutManager(layoutManager);
				}
				layoutManager.setStretchMinorAxis(flowLayout.isMatchMinorSize());
				layoutManager.setMinorAlignment(getDraw2dAllignment(flowLayout.getMinorAlignment(), flowLayout.isForceSingleLine()));
				layoutManager.setSpacing(flowLayout.getMajorSpacing());
				layoutManager.setVertical(flowLayout.isVertical());
			} else {
				org.eclipse.draw2d.FlowLayout layoutManager;
				if (getFigureLayoutManager() instanceof org.eclipse.draw2d.FlowLayout) {
					layoutManager = (org.eclipse.draw2d.FlowLayout) getFigureLayoutManager();
				} else {
					layoutManager = new org.eclipse.draw2d.FlowLayout();
					setFigureLayoutManager(layoutManager);
				}
				layoutManager.setStretchMinorAxis(flowLayout.isMatchMinorSize());
				layoutManager.setMinorAlignment(getDraw2dAllignment(flowLayout.getMinorAlignment(), flowLayout.isForceSingleLine()));
				layoutManager.setMajorAlignment(getDraw2dAllignment(flowLayout.getMajorAlignment(), flowLayout.isForceSingleLine()));
				layoutManager.setMajorSpacing(flowLayout.getMajorSpacing());
				layoutManager.setMinorSpacing(flowLayout.getMinorSpacing());
				layoutManager.setHorizontal(!flowLayout.isVertical());
			}
			break;
		}
		case GMFGraphPackage.GRID_LAYOUT: {
			// not implemented yet in .gmfgraph
			// GridLayout gridLayout = (GridLayout) layout;
			/*
			 * < % =
			 * importManager.getImportedName("org.eclipse.gmf.internal.codegen.draw2d.GridLayout")%>
			 * layoutManager; if (myFigure.getLayoutManager() instanceof < % =
			 * importManager.getImportedName("org.eclipse.gmf.internal.codegen.draw2d.GridLayout")%>) {
			 * layoutManager = (< % =
			 * importManager.getImportedName("org.eclipse.gmf.internal.codegen.draw2d.GridLayout")%>)
			 * myFigure.getLayoutManager(); } else { layoutManager = new < % =
			 * importManager.getImportedName("org.eclipse.gmf.internal.codegen.draw2d.GridLayout")%>();
			 * myFigure.setLayoutManager(layoutManager); }
			 */
			break;
		}
		case GMFGraphPackage.STACK_LAYOUT: {
			if (false == getFigureLayoutManager() instanceof StackLayout) {
				setFigureLayoutManager(new StackLayout());
			}
			break;
		}
		case GMFGraphPackage.XY_LAYOUT: {
			if (false == getFigureLayoutManager() instanceof XYLayout) {
				setFigureLayoutManager(new XYLayout());
			}
			break;
		}
		}
		if (isFigureRefreshAllowed()) {
			handleMajorSemanticChange();
		}
	}

	/**
	 * Blocking refresh of figure if it was not finally created.
	 */
	private boolean isFigureRefreshAllowed() {
		return figure != null;
	}

	protected abstract LayoutManager getFigureLayoutManager();

	protected abstract void setFigureLayoutManager(LayoutManager layoutManager);

	// ModelData transformers
	private int getDraw2dAllignment(Alignment alignment, boolean isToolbar) {
		switch (alignment.getValue()) {
		case Alignment.BEGINNING:
			return isToolbar ? ToolbarLayout.ALIGN_TOPLEFT : org.eclipse.draw2d.FlowLayout.ALIGN_LEFTTOP;
		case Alignment.END:
			return isToolbar ? ToolbarLayout.ALIGN_BOTTOMRIGHT : org.eclipse.draw2d.FlowLayout.ALIGN_RIGHTBOTTOM;
		}
		return isToolbar ? ToolbarLayout.ALIGN_CENTER : org.eclipse.draw2d.FlowLayout.ALIGN_CENTER;
	}

	protected int getLineStyle(LineKind lineKind) {
		switch (lineKind.getValue()) {
		case LineKind.LINE_DASH: {
			return Graphics.LINE_DASH;
		}
		case LineKind.LINE_DOT: {
			return Graphics.LINE_DOT;
		}
		case LineKind.LINE_DASHDOT: {
			return Graphics.LINE_DASHDOT;
		}
		case LineKind.LINE_DASHDOTDOT: {
			return Graphics.LINE_DASHDOTDOT;
		}
		case LineKind.LINE_CUSTOM: {
			return Graphics.LINE_CUSTOM;
		}
		default: {
			return Graphics.LINE_SOLID;
		}
		}
	}

	protected PointList getPointList(Collection template) {
		PointList result = new PointList();
		for (Iterator it = template.iterator(); it.hasNext();) {
			Point nextPoint = (Point) it.next();
			result.addPoint(new org.eclipse.draw2d.geometry.Point(getMapMode().DPtoLP(nextPoint.getX()), getMapMode().DPtoLP(nextPoint.getY())));
		}
		return result;
	}

}
