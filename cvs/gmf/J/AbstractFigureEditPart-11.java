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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.tools.AbstractTool;
import org.eclipse.gmf.gmfgraph.Alignment;
import org.eclipse.gmf.gmfgraph.BasicFont;
import org.eclipse.gmf.gmfgraph.BorderLayout;
import org.eclipse.gmf.gmfgraph.BorderLayoutData;
import org.eclipse.gmf.gmfgraph.Color;
import org.eclipse.gmf.gmfgraph.ConstantColor;
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.FlowLayout;
import org.eclipse.gmf.gmfgraph.Font;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.GridLayout;
import org.eclipse.gmf.gmfgraph.GridLayoutData;
import org.eclipse.gmf.gmfgraph.Layout;
import org.eclipse.gmf.gmfgraph.LayoutData;
import org.eclipse.gmf.gmfgraph.LineKind;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.RGBColor;
import org.eclipse.gmf.gmfgraph.RealFigure;
import org.eclipse.gmf.gmfgraph.Shape;
import org.eclipse.gmf.gmfgraph.StackLayout;
import org.eclipse.gmf.gmfgraph.XYLayout;
import org.eclipse.gmf.gmfgraph.XYLayoutData;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConnectionHandleEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.handles.ConnectionHandle;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;

public abstract class AbstractFigureEditPart extends ShapeNodeEditPart {

	public static final String EMPTY_STRING = ""; //$NON-NLS-1$

	private static Integer getGridDataAlignment(Alignment alignment) {
		switch (alignment.getValue()) {
		case Alignment.BEGINNING:
			return GridData.BEGINNING;
		case Alignment.END:
			return GridData.END;
		case Alignment.CENTER:
			return GridData.CENTER;
		case Alignment.FILL:
			return GridData.FILL;
		}
		return null;
	}

	private static int getFlowLayoutAllignment(Alignment alignment, boolean isToolbar) {
		switch (alignment.getValue()) {
		case Alignment.BEGINNING:
			return isToolbar ? ToolbarLayout.ALIGN_TOPLEFT : org.eclipse.draw2d.FlowLayout.ALIGN_LEFTTOP;
		case Alignment.END:
			return isToolbar ? ToolbarLayout.ALIGN_BOTTOMRIGHT : org.eclipse.draw2d.FlowLayout.ALIGN_RIGHTBOTTOM;
		}
		return isToolbar ? ToolbarLayout.ALIGN_CENTER : org.eclipse.draw2d.FlowLayout.ALIGN_CENTER;
	}

	protected static int getLineStyle(LineKind lineKind) {
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

	protected static org.eclipse.swt.graphics.Color getColor(Color modelColor) {
		if (modelColor instanceof ConstantColor) {
			ConstantColor constantColor = (ConstantColor) modelColor;
			switch (constantColor.getValue()) {
			case BLACK_LITERAL:
				return org.eclipse.draw2d.ColorConstants.black;
			case BLUE_LITERAL:
				return org.eclipse.draw2d.ColorConstants.blue;
			case CYAN_LITERAL:
				return org.eclipse.draw2d.ColorConstants.cyan;
			case DARK_BLUE_LITERAL:
				return org.eclipse.draw2d.ColorConstants.darkBlue;
			case DARK_GRAY_LITERAL:
				return org.eclipse.draw2d.ColorConstants.darkGray;
			case DARK_GREEN_LITERAL:
				return org.eclipse.draw2d.ColorConstants.darkGreen;
			case GRAY_LITERAL:
				return org.eclipse.draw2d.ColorConstants.gray;
			case GREEN_LITERAL:
				return org.eclipse.draw2d.ColorConstants.green;
			case LIGHT_BLUE_LITERAL:
				return org.eclipse.draw2d.ColorConstants.lightBlue;
			case LIGHT_GRAY_LITERAL:
				return org.eclipse.draw2d.ColorConstants.lightGray;
			case LIGHT_GREEN_LITERAL:
				return org.eclipse.draw2d.ColorConstants.lightGreen;
			case ORANGE_LITERAL:
				return org.eclipse.draw2d.ColorConstants.orange;
			case RED_LITERAL:
				return org.eclipse.draw2d.ColorConstants.red;
			case WHITE_LITERAL:
				return org.eclipse.draw2d.ColorConstants.white;
			case YELLOW_LITERAL:
				return org.eclipse.draw2d.ColorConstants.yellow;
			}
		} else if (modelColor instanceof RGBColor) {
			RGBColor rgbColor = (RGBColor) modelColor;
			return DiagramColorRegistry.getInstance().getColor(new RGB(rgbColor.getRed(), rgbColor.getGreen(), rgbColor.getBlue()));
		}
		return null;
	}

	private FontData myCachedFontData;

	public AbstractFigureEditPart(View view) {
		super(view);
	}

	private Object getLayoutConstraint() {
		Shape shape = getShape();
		if (shape == null || shape.getLayoutData() == null) {
			return null;
		}
		LayoutData layoutData = shape.getLayoutData();
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
			GridLayoutData gridLayoutData = (GridLayoutData) layoutData;
			GridData result = new GridData();
			result.grabExcessHorizontalSpace = gridLayoutData.isGrabExcessHorizontalSpace();
			result.grabExcessVerticalSpace = gridLayoutData.isGrabExcessVerticalSpace();
			Integer alignment = getGridDataAlignment(gridLayoutData.getHorizontalAlignment());
			if (alignment != null) {
				result.horizontalAlignment = alignment;
			}
			alignment = getGridDataAlignment(gridLayoutData.getVerticalAlignment());
			if (alignment != null) {
				result.verticalAlignment = alignment;
			}
			result.verticalSpan = gridLayoutData.getVerticalSpan();
			result.horizontalSpan = gridLayoutData.getHorizontalSpan();
			result.horizontalIndent = getMapMode().DPtoLP(gridLayoutData.getHorizontalIndent());
			if (gridLayoutData.getSizeHint() != null) {
				result.widthHint = getMapMode().DPtoLP(gridLayoutData.getSizeHint().getDx());
				result.heightHint = getMapMode().DPtoLP(gridLayoutData.getSizeHint().getDy());
			} else {
				result.widthHint = SWT.DEFAULT;
				result.heightHint = SWT.DEFAULT;
			}
			return result;
		}
		case GMFGraphPackage.XY_LAYOUT_DATA: {
			final XYLayoutData xyLayoutData = (XYLayoutData) layoutData;
			Rectangle result = new Rectangle();
			if (xyLayoutData.getTopLeft() != null && xyLayoutData.getSize() != null) {
				result.setLocation(getMapMode().DPtoLP(xyLayoutData.getTopLeft().getX()), getMapMode().DPtoLP(xyLayoutData.getTopLeft().getY()));
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
			if (false == layoutConstraint instanceof GridData) {
				layoutConstraint = null;
			}
		} else if (layoutManager instanceof org.eclipse.draw2d.XYLayout) {
			if (false == layoutConstraint instanceof Rectangle) {
				// TODO: put figure into special pain with unconstrained
				// elements instead
				layoutConstraint = null;
			}
		}
		getContentPane().add(child, layoutConstraint, index);
	}

	protected LayoutManager getLayoutManager(Layout layout) {
		if (layout instanceof BorderLayout) {
			BorderLayout borderLayout = (BorderLayout) layout;
			org.eclipse.draw2d.BorderLayout layoutManager = new org.eclipse.draw2d.BorderLayout();
			if (borderLayout.getSpacing() != null) {
				layoutManager.setHorizontalSpacing(getMapMode().DPtoLP(borderLayout.getSpacing().getDx()));
				layoutManager.setVerticalSpacing(getMapMode().DPtoLP(borderLayout.getSpacing().getDy()));
			}
			return layoutManager;
		}

		if (layout instanceof FlowLayout) {
			FlowLayout flowLayout = (FlowLayout) layout;
			if (flowLayout.isForceSingleLine()) {
				ToolbarLayout layoutManager = new ToolbarLayout();
				layoutManager.setStretchMinorAxis(flowLayout.isMatchMinorSize());
				layoutManager.setMinorAlignment(getFlowLayoutAllignment(flowLayout.getMinorAlignment(), flowLayout.isForceSingleLine()));
				layoutManager.setSpacing(flowLayout.getMajorSpacing());
				layoutManager.setVertical(flowLayout.isVertical());
				return layoutManager;
			} else {
				org.eclipse.draw2d.FlowLayout layoutManager = new org.eclipse.draw2d.FlowLayout();
				layoutManager.setStretchMinorAxis(flowLayout.isMatchMinorSize());
				layoutManager.setMinorAlignment(getFlowLayoutAllignment(flowLayout.getMinorAlignment(), flowLayout.isForceSingleLine()));
				layoutManager.setMajorAlignment(getFlowLayoutAllignment(flowLayout.getMajorAlignment(), flowLayout.isForceSingleLine()));
				layoutManager.setMajorSpacing(flowLayout.getMajorSpacing());
				layoutManager.setMinorSpacing(flowLayout.getMinorSpacing());
				layoutManager.setHorizontal(!flowLayout.isVertical());
				return layoutManager;
			}
		}

		if (layout instanceof GridLayout) {
			GridLayout gridLayout = (GridLayout) layout;
			org.eclipse.draw2d.GridLayout layoutManager = new org.eclipse.draw2d.GridLayout();
			layoutManager.numColumns = gridLayout.getNumColumns();
			layoutManager.makeColumnsEqualWidth = gridLayout.isEqualWidth();
			if (gridLayout.getMargins() != null) {
				layoutManager.marginWidth = getMapMode().DPtoLP(gridLayout.getMargins().getDx());
				layoutManager.marginHeight = getMapMode().DPtoLP(gridLayout.getMargins().getDy());
			} else {
				int defaultMargin = 5;
				layoutManager.marginWidth = getMapMode().DPtoLP(defaultMargin);
				layoutManager.marginHeight = getMapMode().DPtoLP(defaultMargin);
			}
			if (gridLayout.getSpacing() != null) {
				layoutManager.horizontalSpacing = getMapMode().DPtoLP(gridLayout.getSpacing().getDx());
				layoutManager.verticalSpacing = getMapMode().DPtoLP(gridLayout.getSpacing().getDy());
			} else {
				int defaultSpacing = 5;
				layoutManager.horizontalSpacing = getMapMode().DPtoLP(defaultSpacing);
				layoutManager.verticalSpacing = getMapMode().DPtoLP(defaultSpacing);
			}
			return layoutManager;
		}

		if (layout instanceof StackLayout) {
			return new org.eclipse.draw2d.StackLayout();
		}

		if (layout instanceof XYLayout) {
			return new org.eclipse.draw2d.XYLayout();
		}

		return null;
	}

	protected org.eclipse.draw2d.geometry.Dimension getCornerDimensions(int width, int height) {
		return new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(width), getMapMode().DPtoLP(height));
	}

	// TODO: Either use this method or remove it.
	protected PointList getPointList(Collection template) {
		PointList result = new PointList();
		for (Iterator it = template.iterator(); it.hasNext();) {
			Point nextPoint = (Point) it.next();
			result.addPoint(new org.eclipse.draw2d.geometry.Point(getMapMode().DPtoLP(nextPoint.getX()), getMapMode().DPtoLP(nextPoint.getY())));
		}
		return result;
	}

	protected org.eclipse.draw2d.geometry.Dimension getDraw2dDimension(Dimension dimension) {
		return new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(dimension.getDx()), getMapMode().DPtoLP(dimension.getDy()));
	}

	protected org.eclipse.draw2d.geometry.Point getDraw2DPoint(Point point) {
		return new org.eclipse.draw2d.geometry.Point(getMapMode().DPtoLP(point.getX()), getMapMode().DPtoLP(point.getY()));
	}

	protected void refreshLayoutData() {
		if (!hasParentFigure()) {
			return;
		}
		Object layoutConstraint = getLayoutConstraint();
		if (layoutConstraint != null) {
			getFigure().getParent().setConstraint(getFigure(), layoutConstraint);
		}
		/*
		 *  It is important to call handleMajorSemanticChange() here because
		 *  in case of any changes in LayoutConstraints current EditPart can 
		 *  visually replace any other existing (sibling) EditParts, so we 
		 *  have to re-layout parent Figure.
		 */
		if (getParent() instanceof AbstractFigureEditPart) {
			((AbstractFigureEditPart) getParent()).handleMajorSemanticChange();	
		}
	}

	/**
	 * Parent figure == null if this method was called from setFigure() one.
	 */
	private boolean hasParentFigure() {
		return getFigure().getParent() != null;
	}

	protected void refreshLayoutManager() {
		if (!hasParentFigure()) {
			return;
		}
		handleMajorSemanticChange();
	}

	protected Shape getShape() {
		View view = getNotationView();
		if (view != null && view.getElement() instanceof Shape) {
			return (Shape) view.getElement();
		}
		return null;
	}

	/**
	 * Using this custom implementation instead of calling super.setFont()
	 * because we have to support unsetting font operation (setFont(null)).
	 * 
	 * TODO: getNodeFigure used here instead of getPrimaryShape() - better 
	 * use getPrimaryShape().
	 */
	protected void refreshFont() {
		Font modelFont = getShape().getFont();
		if (modelFont instanceof BasicFont) {
			BasicFont basicFont = (BasicFont) modelFont;
			int fontStyle = SWT.NONE;
			switch (basicFont.getStyle()) {
			case BOLD_LITERAL:
				fontStyle = SWT.BOLD;
				break;
			case ITALIC_LITERAL:
				fontStyle = SWT.ITALIC;
				break;
			}
			if (basicFont.getFaceName() == null) {
				return;
			}
			FontData fontData = new FontData(basicFont.getFaceName(), basicFont.getHeight(), fontStyle);
			if (myCachedFontData != null && myCachedFontData.equals(fontData)) {
				return;
			}
			org.eclipse.swt.graphics.Font font = getResourceManager().createFont(FontDescriptor.createFrom(fontData));
			getNodeFigure().setFont(font);
			getNodeFigure().repaint();
			if (myCachedFontData != null) {
				getResourceManager().destroyFont(FontDescriptor.createFrom(myCachedFontData));
			}
		} else {
			getNodeFigure().setFont(null);
			getNodeFigure().repaint();
		}
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();

		// override default connection handles behavior, that could be installed
		// by parent
		installEditPolicy(EditPolicyRoles.CONNECTION_HANDLES_ROLE, new MyConnectionHandleEditPolicy());
	}

	private static class MyConnectionHandleEditPolicy extends ConnectionHandleEditPolicy {

		protected List getHandleFigures() {
			IGraphicalEditPart selectedPart = (IGraphicalEditPart) getHost();
			List result = new ArrayList(selectedPart.getChildren().size());
			for (int i = 0; i < selectedPart.getChildren().size(); i++) {
				final EditPart next = (EditPart) selectedPart.getChildren().get(i);
				String tooltip = EMPTY_STRING;
				if (next instanceof AbstractFigureEditPart) {
					final AbstractFigureEditPart nextAF = (AbstractFigureEditPart) next;
					View model = (View) nextAF.getModel();
					RealFigure modelElement = (RealFigure) model.getElement();
					String name = modelElement.getName();
					tooltip = modelElement.eClass().getName() + ":" + (name != null && name.length() != 0 ? name : String.valueOf(i + 1));
				}
				result.add(new MyConnectionHandle(selectedPart, next, tooltip));
			}
			return result;
		}
	}

	private static class MyConnectionHandle extends ConnectionHandle {

		private final MyHandleTool myTool;

		public MyConnectionHandle(IGraphicalEditPart ownerEditPart, EditPart nextChild, String tooltip) {
			super(ownerEditPart, HandleDirection.INCOMING, tooltip);
			myTool = new MyHandleTool(nextChild, tooltip);
		}

		protected DragTracker createDragTracker() {
			return myTool;
		}
	}

	private static class MyHandleTool extends AbstractTool implements DragTracker {

		private final EditPart myTarget;

		private final String myCommandName;

		public MyHandleTool(EditPart target, String commandName) {
			super();
			myTarget = target;
			myCommandName = commandName;
		}

		protected boolean handleButtonUp(int button) {
			myTarget.getViewer().select(myTarget);
			return true;
		}

		protected String getCommandName() {
			return myCommandName;
		}
	}

}