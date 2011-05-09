/*
 *  Copyright (c) 2006, 2007 Borland Software Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.edit.parts;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.gmfgraph.AbstractFigure;
import org.eclipse.gmf.gmfgraph.ColorConstants;
import org.eclipse.gmf.gmfgraph.ConstantColor;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Layoutable;
import org.eclipse.gmf.gmfgraph.RGBColor;
import org.eclipse.gmf.gmfgraph.RoundedRectangle;
import org.eclipse.gmf.gmfgraph.XYLayout;
import org.eclipse.gmf.gmfgraph.XYLayoutData;
import org.eclipse.gmf.graphdef.editor.edit.policies.RoundedRectangleCanonicalEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.policies.RoundedRectangleItemSemanticEditPolicy;
import org.eclipse.gmf.graphdef.editor.part.GMFGraphDiagramEditorPlugin;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RoundedRectangleEditPart extends AbstractFigureEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3013;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public RoundedRectangleEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new RoundedRectangleItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new RoundedRectangleCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}

			protected Point getLayoutOrigin() {
				return ((GraphicalEditPart) getHost()).getContentPane().getClientArea().getLocation();
			}

			protected Rectangle getCurrentConstraintFor(org.eclipse.gef.GraphicalEditPart child) {
				Rectangle result = super.getCurrentConstraintFor(child);
				if (result == null) {
					IFigure fig = child.getFigure();
					result = fig.getBounds().getCopy();
				}
				return result;
			}

		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		RoundedRectangleFigure figure = new RoundedRectangleFigure();
		figure.setUseLocalCoordinates(true);
		myFigure = figure;
		RoundedRectangle modelElement = (RoundedRectangle) ((View) getModel()).getElement();
		if (modelElement != null) {
			{
				layoutDataChanged(modelElement.getLayoutData());
			}
			{
				layoutChanged(modelElement.getLayout());
			}
			{
				myFigure.setOutline(modelElement.isOutline());
			}
			{
				myFigure.setFill(modelElement.isFill());
			}
			{
				myFigure.setLineWidth(modelElement.getLineWidth());
			}
			{
				myFigure.setLineStyle(getLineStyle(modelElement.getLineKind()));
			}
			{
				myFigure.setFillXOR(modelElement.isXorFill());
			}
			{
				myFigure.setOutlineXOR(modelElement.isXorOutline());
			}
			{
				myFigure.setCornerDimensions(new Dimension(getMapMode().DPtoLP(modelElement.getCornerWidth()), getMapMode().DPtoLP(modelElement.getCornerHeight())));
			}
			{
				myFigure.setCornerDimensions(new Dimension(getMapMode().DPtoLP(modelElement.getCornerWidth()), getMapMode().DPtoLP(modelElement.getCornerHeight())));
			}
		}
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public RoundedRectangleFigure getPrimaryShape() {
		return (RoundedRectangleFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(40), getMapMode().DPtoLP(40));
		myNodeFigure = result;
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	private RoundedRectangleFigure myFigure;

// TODO: use myFigure?
	/**
	 * @generated
	 */
	protected Figure myNodeFigure;

	/**
	 * @generated
	 */
	public void activate() {
		if (isActive()) {
			return;
		}
		View view = (View) getModel();
		if (view.getElement() == null) {
			super.activate();
			return;
		}

		final RoundedRectangle modelElement = (RoundedRectangle) view.getElement();

		final NotificationListener Layoutable_LayoutData_PropertiesListener = new NotificationListener() {

			public void notifyChanged(Notification notification) {
				layoutDataChanged(modelElement.getLayoutData());
			}
		};
		if (modelElement.getLayoutData() != null) {
			addListenerFilter("Layoutable_LayoutData_PropertiesListener", Layoutable_LayoutData_PropertiesListener, modelElement.getLayoutData());
		}
		addListenerFilter("Layoutable_LayoutData_Listener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				removeListenerFilter("Layoutable_LayoutData_PropertiesListener");
				if (modelElement.getLayoutData() != null) {
					addListenerFilter("Layoutable_LayoutData_PropertiesListener", Layoutable_LayoutData_PropertiesListener, modelElement.getLayoutData());
				}
				layoutDataChanged(modelElement.getLayoutData());
			}
		}, modelElement, GMFGraphPackage.eINSTANCE.getLayoutable_LayoutData());

		final NotificationListener Layoutable_Layout_PropertiesListener = new NotificationListener() {

			public void notifyChanged(Notification notification) {
				layoutChanged(modelElement.getLayout());
			}
		};
		if (modelElement.getLayout() != null) {
			addListenerFilter("Layoutable_Layout_PropertiesListener", Layoutable_Layout_PropertiesListener, modelElement.getLayout());
		}
		addListenerFilter("Layoutable_Layout_Listener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				removeListenerFilter("Layoutable_Layout_PropertiesListener");
				if (modelElement.getLayout() != null) {
					addListenerFilter("Layoutable_Layout_PropertiesListener", Layoutable_Layout_PropertiesListener, modelElement.getLayout());
				}
				layoutChanged(modelElement.getLayout());
			}
		}, modelElement, GMFGraphPackage.eINSTANCE.getLayoutable_Layout());

		addListenerFilter("Shape_Outline_Listener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				myFigure.setOutline(modelElement.isOutline());
			}
		}, modelElement, GMFGraphPackage.eINSTANCE.getShape_Outline());

		addListenerFilter("Shape_Fill_Listener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				myFigure.setFill(modelElement.isFill());
			}
		}, modelElement, GMFGraphPackage.eINSTANCE.getShape_Fill());

		addListenerFilter("Shape_LineWidth_Listener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				myFigure.setLineWidth(modelElement.getLineWidth());
			}
		}, modelElement, GMFGraphPackage.eINSTANCE.getShape_LineWidth());

		addListenerFilter("Shape_LineKind_Listener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				myFigure.setLineStyle(getLineStyle(modelElement.getLineKind()));
			}
		}, modelElement, GMFGraphPackage.eINSTANCE.getShape_LineKind());

		addListenerFilter("Shape_XorFill_Listener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				myFigure.setFillXOR(modelElement.isXorFill());
			}
		}, modelElement, GMFGraphPackage.eINSTANCE.getShape_XorFill());

		addListenerFilter("Shape_XorOutline_Listener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				myFigure.setOutlineXOR(modelElement.isXorOutline());
			}
		}, modelElement, GMFGraphPackage.eINSTANCE.getShape_XorOutline());

		addListenerFilter("RoundedRectangle_CornerWidth_Listener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				myFigure.setCornerDimensions(new Dimension(getMapMode().DPtoLP(modelElement.getCornerWidth()), getMapMode().DPtoLP(modelElement.getCornerHeight())));
				myFigure.repaint();
			}
		}, modelElement, GMFGraphPackage.eINSTANCE.getRoundedRectangle_CornerWidth());

		addListenerFilter("RoundedRectangle_CornerHeight_Listener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				myFigure.setCornerDimensions(new Dimension(getMapMode().DPtoLP(modelElement.getCornerWidth()), getMapMode().DPtoLP(modelElement.getCornerHeight())));
				myFigure.repaint();
			}
		}, modelElement, GMFGraphPackage.eINSTANCE.getRoundedRectangle_CornerHeight());

		final Bounds bounds = (Bounds) ((Node) view).getLayoutConstraint();
		final int sizeX;
		final int sizeY;
		if (modelElement.getPreferredSize() != null) {
			sizeX = getMapMode().DPtoLP(modelElement.getPreferredSize().getDx());
			sizeY = getMapMode().DPtoLP(modelElement.getPreferredSize().getDy());
		} else {
			sizeX = getMapMode().DPtoLP(20);
			sizeY = getMapMode().DPtoLP(20);
		}
		final int locationX;
		final int locationY;
		if (modelElement.getLocation() != null) {
			locationX = getMapMode().DPtoLP(modelElement.getLocation().getX());
			locationY = getMapMode().DPtoLP(modelElement.getLocation().getY());
		} else {
			locationX = bounds.getX();
			locationY = bounds.getY();
		}
		if (sizeX != bounds.getWidth() || sizeY != bounds.getHeight() || locationX != bounds.getX() || locationY != bounds.getY()) {
			try {
				new AbstractEMFOperation(getEditingDomain(), "Synchronizing view size with the model", Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE)) { //$NON-NLS-1$

					protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
						bounds.setX(locationX);
						bounds.setY(locationY);
						bounds.setWidth(sizeX);
						bounds.setHeight(sizeY);
						return Status.OK_STATUS;
					}
				}.execute(new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to synchronize view size with the model", e); //$NON-NLS-1$			
			}
		}
		addListenerFilter("BoundsListener", new NotificationListener() {

			public void notifyChanged(final Notification notification) {
				try {
					new AbstractEMFOperation(getEditingDomain(), "Synchronizing model size with the view", Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE)) { //$NON-NLS-1$

						protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
							Bounds bounds = (Bounds) notification.getNotifier();
							org.eclipse.gmf.gmfgraph.Dimension dim = modelElement.getPreferredSize();
							if (dim == null) {
								dim = GMFGraphFactory.eINSTANCE.createDimension();
								modelElement.setPreferredSize(dim);
							}
							org.eclipse.gmf.gmfgraph.Point location = modelElement.getLocation();
							if (location == null) {
								location = GMFGraphFactory.eINSTANCE.createPoint();
								modelElement.setLocation(location);
							}

							int x = getMapMode().LPtoDP(bounds.getX());
							int y = getMapMode().LPtoDP(bounds.getY());
							int width = getMapMode().LPtoDP(bounds.getWidth());
							int height = getMapMode().LPtoDP(bounds.getHeight());
							if (location.getX() != x || location.getY() != y) {
								location.setX(x);
								location.setY(y);
							}
							if (dim.getDx() != width || dim.getDy() != height) {
								dim.setDx(width);
								dim.setDy(height);
							}

							myNodeFigure.setPreferredSize(bounds.getWidth(), bounds.getHeight());
							myNodeFigure.setLocation(new Point(bounds.getX(), bounds.getY()));

							if (modelElement.getLayoutData() instanceof XYLayoutData
									|| (modelElement.eContainer() instanceof Layoutable && ((Layoutable) modelElement.eContainer()).getLayout() instanceof XYLayout)) {
								XYLayoutData xyLayoutData = (XYLayoutData) modelElement.getLayoutData();
								if (xyLayoutData == null) {
									xyLayoutData = GMFGraphFactory.eINSTANCE.createXYLayoutData();
									modelElement.setLayoutData(xyLayoutData);
									xyLayoutData.setTopLeft(GMFGraphFactory.eINSTANCE.createPoint());
									xyLayoutData.getTopLeft().setX(0);
									xyLayoutData.getTopLeft().setY(0);
									xyLayoutData.setSize(GMFGraphFactory.eINSTANCE.createDimension());
									xyLayoutData.getSize().setDx(40);
									xyLayoutData.getSize().setDy(40);
								}
								org.eclipse.gmf.gmfgraph.Point topLeft;
								if (xyLayoutData.getTopLeft() != null) {
									topLeft = xyLayoutData.getTopLeft();
								} else {
									topLeft = GMFGraphFactory.eINSTANCE.createPoint();
									xyLayoutData.setTopLeft(topLeft);
								}
								if (topLeft.getX() != location.getX() || topLeft.getY() != location.getY()) {
									topLeft.setX(location.getX());
									topLeft.setY(location.getY());
								}

								org.eclipse.gmf.gmfgraph.Dimension size;
								if (xyLayoutData.getSize() != null) {
									size = xyLayoutData.getSize();
								} else {
									size = GMFGraphFactory.eINSTANCE.createDimension();
									xyLayoutData.setSize(size);
								}
								if (size.getDx() != dim.getDx() || size.getDy() != dim.getDy()) {
									size.setDx(dim.getDx());
									size.setDy(dim.getDy());
								}
							}
							return Status.OK_STATUS;
						}
					}.execute(new NullProgressMonitor(), null);
				} catch (ExecutionException e) {
					GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to synchronize model size with the view", e); //$NON-NLS-1$			
				}
				if (getRoot() != null) {
					handleMajorSemanticChange();
				}
			}
		}, bounds);

		final FillStyle theFillStyle = (FillStyle) view.getStyle(NotationPackage.eINSTANCE.getFillStyle());
		if (modelElement.getBackgroundColor() != null) {
			final int rgbColor;
			if (modelElement.getBackgroundColor() instanceof RGBColor) {
				RGBColor modelColor = (RGBColor) modelElement.getBackgroundColor();
				rgbColor = (modelColor.getRed() & 0xFF) | ((modelColor.getGreen() & 0xFF) << 8) | ((modelColor.getBlue() & 0xFF) << 16);
			} else {
				ConstantColor modelColor = (ConstantColor) modelElement.getBackgroundColor();
				rgbColor = getRgbColor(modelColor);
			}
			if (rgbColor != -1 && theFillStyle.getFillColor() != rgbColor) {
				AbstractEMFOperation setColorOperation = new AbstractEMFOperation(getEditingDomain(),
						"Synchronizing view Background color with the model", Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE)) { //$NON-NLS-1$

					protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
						theFillStyle.setFillColor(rgbColor);
						return Status.OK_STATUS;
					}
				};
				try {
					setColorOperation.execute(new NullProgressMonitor(), null);
				} catch (ExecutionException e) {
					GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to synchronize view Background color with the model", e); //$NON-NLS-1$
				}
			}
		}
		final LineStyle theLineStyle = (LineStyle) view.getStyle(NotationPackage.eINSTANCE.getLineStyle());
		if (modelElement.getForegroundColor() != null) {
			final int rgbColor;
			if (modelElement.getForegroundColor() instanceof RGBColor) {
				RGBColor modelColor = (RGBColor) modelElement.getForegroundColor();
				rgbColor = (modelColor.getRed() & 0xFF) | ((modelColor.getGreen() & 0xFF) << 8) | ((modelColor.getBlue() & 0xFF) << 16);
			} else {
				ConstantColor modelColor = (ConstantColor) modelElement.getForegroundColor();
				rgbColor = getRgbColor(modelColor);
			}
			if (rgbColor != -1 && theLineStyle.getLineColor() != rgbColor) {
				AbstractEMFOperation setColorOperation = new AbstractEMFOperation(getEditingDomain(),
						"Synchronizing view Foreground color with the model", Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE)) { //$NON-NLS-1$

					protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
						theLineStyle.setLineColor(rgbColor);
						return Status.OK_STATUS;
					}
				};
				try {
					setColorOperation.execute(new NullProgressMonitor(), null);
				} catch (ExecutionException e) {
					GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to synchronize view Foreground color with the model", e); //$NON-NLS-1$
				}
			}
		}

		final FillStyle theFillStyle1 = (FillStyle) view.getStyle(NotationPackage.eINSTANCE.getFillStyle());
		addListenerFilter("FillStyleListener", new NotificationListener() {

			public void notifyChanged(final Notification notification) {
				try {
					new AbstractEMFOperation(getEditingDomain(), "Synchronizing model Background color with the view", Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE)) { //$NON-NLS-1$

						protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
							FillStyle theFillStyle = (FillStyle) notification.getNotifier();
							if (notification.getFeatureID(FillStyle.class) == NotationPackage.FILL_STYLE__FILL_COLOR) {
								int color = theFillStyle.getFillColor();
								RGBColor modelColor;
								if (modelElement.getBackgroundColor() instanceof RGBColor) {
									modelColor = (RGBColor) modelElement.getBackgroundColor();
								} else {
									modelColor = GMFGraphFactory.eINSTANCE.createRGBColor();
									modelElement.setBackgroundColor(modelColor);
								}
								if (modelColor.getRed() != (color & 0x000000FF) || modelColor.getGreen() != (color & 0x0000FF00) >> 8 || modelColor.getBlue() != (color & 0x00FF0000) >> 16) {
									modelColor.setRed(color & 0x000000FF);
									modelColor.setGreen((color & 0x0000FF00) >> 8);
									modelColor.setBlue((color & 0x00FF0000) >> 16);
								}
							}
							return Status.OK_STATUS;
						}
					}.execute(new NullProgressMonitor(), null);
				} catch (ExecutionException e) {
					GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to synchronize model Background color with the view", e); //$NON-NLS-1$
				}
			}
		}, theFillStyle1);
		final LineStyle theLineStyle1 = (LineStyle) view.getStyle(NotationPackage.eINSTANCE.getLineStyle());
		addListenerFilter("LineStyleListener", new NotificationListener() {

			public void notifyChanged(final Notification notification) {
				try {
					new AbstractEMFOperation(getEditingDomain(), "Synchronizing model Foreground color with the view", Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE)) { //$NON-NLS-1$

						protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
							LineStyle theLineStyle = (LineStyle) notification.getNotifier();
							if (notification.getFeatureID(LineStyle.class) == NotationPackage.LINE_STYLE__LINE_COLOR) {
								int color = theLineStyle.getLineColor();
								RGBColor modelColor;
								if (modelElement.getForegroundColor() instanceof RGBColor) {
									modelColor = (RGBColor) modelElement.getForegroundColor();
								} else {
									modelColor = GMFGraphFactory.eINSTANCE.createRGBColor();
									modelElement.setForegroundColor(modelColor);
								}
								if (modelColor.getRed() != (color & 0x000000FF) || modelColor.getGreen() != (color & 0x0000FF00) >> 8 || modelColor.getBlue() != (color & 0x00FF0000) >> 16) {
									modelColor.setRed(color & 0x000000FF);
									modelColor.setGreen((color & 0x0000FF00) >> 8);
									modelColor.setBlue((color & 0x00FF0000) >> 16);
								}
							}
							return Status.OK_STATUS;
						}
					}.execute(new NullProgressMonitor(), null);
				} catch (ExecutionException e) {
					GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to synchronize model Foreground color with the view", e); //$NON-NLS-1$
				}
			}
		}, theLineStyle1);

		super.activate();
	}

	/**
	 * @generated
	 */
	protected LayoutManager getFigureLayoutManager() {
		return myFigure.getLayoutManager();
	}

	/**
	 * @generated
	 */
	protected void setFigureLayoutManager(LayoutManager layoutManager) {
		myFigure.setLayoutManager(layoutManager);
	}

	/**
	 * @generated
	 */
	protected void refreshBounds() {
		if (((View) getParent().getModel()).getElement() instanceof AbstractFigure) {
			int width = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
			int height = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height())).intValue();
			myNodeFigure.setPreferredSize(new Dimension(width, height));
		} else {
			super.refreshBounds();
		}
	}

	/**
	 * @generated
	 */
	public static int getRgbColor(ConstantColor modelColor) {
		final int rgbColor;
		switch (modelColor.getValue().getValue()) {
		case ColorConstants.WHITE: {
			rgbColor = org.eclipse.draw2d.ColorConstants.white.getRGB().hashCode();
			break;
		}
		case ColorConstants.BLACK: {
			rgbColor = org.eclipse.draw2d.ColorConstants.black.getRGB().hashCode();
			break;
		}
		case ColorConstants.LIGHT_GRAY: {
			rgbColor = org.eclipse.draw2d.ColorConstants.lightGray.getRGB().hashCode();
			break;
		}
		case ColorConstants.GRAY: {
			rgbColor = org.eclipse.draw2d.ColorConstants.gray.getRGB().hashCode();
			break;
		}
		case ColorConstants.DARK_GRAY: {
			rgbColor = org.eclipse.draw2d.ColorConstants.darkGray.getRGB().hashCode();
			break;
		}
		case ColorConstants.RED: {
			rgbColor = org.eclipse.draw2d.ColorConstants.red.getRGB().hashCode();
			break;
		}
		case ColorConstants.ORANGE: {
			rgbColor = org.eclipse.draw2d.ColorConstants.orange.getRGB().hashCode();
			break;
		}
		case ColorConstants.YELLOW: {
			rgbColor = org.eclipse.draw2d.ColorConstants.yellow.getRGB().hashCode();
			break;
		}
		case ColorConstants.GREEN: {
			rgbColor = org.eclipse.draw2d.ColorConstants.green.getRGB().hashCode();
			break;
		}
		case ColorConstants.LIGHT_GREEN: {
			rgbColor = org.eclipse.draw2d.ColorConstants.lightGreen.getRGB().hashCode();
			break;
		}
		case ColorConstants.DARK_GREEN: {
			rgbColor = org.eclipse.draw2d.ColorConstants.darkGreen.getRGB().hashCode();
			break;
		}
		case ColorConstants.CYAN: {
			rgbColor = org.eclipse.draw2d.ColorConstants.cyan.getRGB().hashCode();
			break;
		}
		case ColorConstants.LIGHT_BLUE: {
			rgbColor = org.eclipse.draw2d.ColorConstants.lightBlue.getRGB().hashCode();
			break;
		}
		case ColorConstants.BLUE: {
			rgbColor = org.eclipse.draw2d.ColorConstants.blue.getRGB().hashCode();
			break;
		}
		case ColorConstants.DARK_BLUE: {
			rgbColor = org.eclipse.draw2d.ColorConstants.darkBlue.getRGB().hashCode();
			break;
		}
		default:
			rgbColor = -1;
		}
		return rgbColor;
	}

	/**
	 * @generated
	 */
	public class RoundedRectangleFigure extends org.eclipse.draw2d.RoundedRectangle {

		/**
		 * @generated
		 */
		public RoundedRectangleFigure() {

			this.setLayoutManager(new org.eclipse.draw2d.XYLayout());
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

}
