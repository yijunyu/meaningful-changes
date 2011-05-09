package org.eclipse.gmf.graphdef.editor.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.StackLayout;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.transaction.Transaction;

import org.eclipse.emf.workspace.AbstractEMFOperation;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;

import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.handles.ResizableHandleKit;

import org.eclipse.gmf.gmfgraph.ConstantColor;
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.Ellipse;
import org.eclipse.gmf.gmfgraph.FigureMarker;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Layout;
import org.eclipse.gmf.gmfgraph.LayoutData;
import org.eclipse.gmf.gmfgraph.LineKind;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.RGBColor;
import org.eclipse.gmf.gmfgraph.XYLayoutData;

import org.eclipse.gmf.graphdef.editor.edit.policies.Ellipse2CanonicalEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.policies.Ellipse2GraphicalNodeEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.policies.Ellipse2ItemSemanticEditPolicy;

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
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Ellipse2EditPart extends AbstractFigureEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	private EllipseFigure myFigure;

	// TODO: use myFigure?
	/**
	 * @generated
	 */
	protected Figure myNodeFigure;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public Ellipse2EditPart(View view) {
		super(view);
	}

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

		final Ellipse modelElement = (Ellipse) view.getElement();

		final NotificationListener layoutListener = new NotificationListener() {

			public void notifyChanged(Notification notification) {
				Layout layout = (Layout) notification.getNotifier();
				layoutPropertyChanged(layout);
			}
		};
		if (modelElement.getLayout() != null) {
			addListenerFilter("LayoutPropertiesListener", layoutListener, modelElement.getLayout());
		}
		addListenerFilter("ModelElementLayoutListener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				Layout newLayout = (Layout) notification.getNewValue();
				removeListenerFilter("LayoutPropertiesListener");
				if (newLayout != null) {
					addListenerFilter("LayoutPropertiesListener", layoutListener, newLayout);
				}
				layoutChanged(newLayout, true);
			}
		}, modelElement, GMFGraphPackage.eINSTANCE.getLayoutable_Layout());

		final NotificationListener layoutDataListener = new NotificationListener() {

			public void notifyChanged(Notification notification) {
				layoutDataPropertyChanged();
			}
		};
		if (modelElement.getLayoutData() != null) {
			addListenerFilter("LayoutDataPropertiesListener", layoutDataListener, modelElement.getLayoutData());
		}
		addListenerFilter("ModelElementLayoutDataListener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				LayoutData newLayoutData = (LayoutData) notification.getNewValue();
				removeListenerFilter("LayoutDataPropertiesListener");
				if (newLayoutData != null) {
					addListenerFilter("LayoutDataPropertiesListener", layoutDataListener, newLayoutData);
				}
				layoutDataChanged();
			}
		}, modelElement, GMFGraphPackage.eINSTANCE.getLayoutable_LayoutData());

		addListenerFilter("ModelElementPropertiesListener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				switch (notification.getFeatureID(Ellipse.class)) {
				case org.eclipse.gmf.gmfgraph.GMFGraphPackage.ELLIPSE__OUTLINE: {
					boolean value = modelElement.isOutline();
					myFigure.setOutline(value);
					break;
				}
				case org.eclipse.gmf.gmfgraph.GMFGraphPackage.ELLIPSE__FILL: {
					boolean value = modelElement.isFill();
					myFigure.setFill(value);
					break;
				}
				case org.eclipse.gmf.gmfgraph.GMFGraphPackage.ELLIPSE__LINE_WIDTH: {
					int value = modelElement.getLineWidth();
					myFigure.setLineWidth(value);
					break;
				}
				case org.eclipse.gmf.gmfgraph.GMFGraphPackage.ELLIPSE__LINE_KIND: {
					LineKind value = modelElement.getLineKind();
					myFigure.setLineStyle("LINE_DASH".equals(value.getName()) ? org.eclipse.draw2d.Graphics.LINE_DASH : "LINE_DOT".equals(value.getName()) ? org.eclipse.draw2d.Graphics.LINE_DOT
							: "LINE_DASHDOT".equals(value.getName()) ? org.eclipse.draw2d.Graphics.LINE_DASHDOT
									: "LINE_DASHDOTDOT".equals(value.getName()) ? org.eclipse.draw2d.Graphics.LINE_DASHDOTDOT
											: "LINE_CUSTOM".equals(value.getName()) ? org.eclipse.draw2d.Graphics.LINE_CUSTOM : org.eclipse.draw2d.Graphics.LINE_SOLID);
					break;
				}
				case org.eclipse.gmf.gmfgraph.GMFGraphPackage.ELLIPSE__XOR_FILL: {
					boolean value = modelElement.isXorFill();
					myFigure.setFillXOR(value);
					break;
				}
				case org.eclipse.gmf.gmfgraph.GMFGraphPackage.ELLIPSE__XOR_OUTLINE: {
					boolean value = modelElement.isXorOutline();
					myFigure.setOutlineXOR(value);
					break;
				}
				}
				myFigure.repaint();
			}
		}, modelElement);

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
			AbstractEMFOperation setSizeOperation = new AbstractEMFOperation(getEditingDomain(),
					"Synchronizing view size with the model", Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE)) { //$NON-NLS-1$

				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					bounds.setX(locationX);
					bounds.setY(locationY);
					bounds.setWidth(sizeX);
					bounds.setHeight(sizeY);
					return Status.OK_STATUS;
				}
			};
			try {
				setSizeOperation.execute(new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to synchronize view size with the model", e); //$NON-NLS-1$			
			}
		}
		addListenerFilter("BoundsListener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				Bounds bounds = (Bounds) notification.getNotifier();
				Dimension dim = modelElement.getPreferredSize();
				if (dim == null) {
					dim = GMFGraphFactory.eINSTANCE.createDimension();
					modelElement.setPreferredSize(dim);
				}
				Point location = modelElement.getLocation();
				if (location == null) {
					location = GMFGraphFactory.eINSTANCE.createPoint();
					modelElement.setLocation(location);
				}

				int x = getMapMode().LPtoDP(bounds.getWidth());
				int y = getMapMode().LPtoDP(bounds.getHeight());
				int width = getMapMode().LPtoDP(bounds.getX());
				int height = getMapMode().LPtoDP(bounds.getY());
				if (dim.getDx() != x || dim.getDy() != y) {
					dim.setDx(x);
					dim.setDy(y);
				}
				if (location.getX() != width || location.getY() != height) {
					location.setX(width);
					location.setY(height);
				}

				myNodeFigure.setPreferredSize(bounds.getWidth(), bounds.getHeight());
				myNodeFigure.setLocation(new org.eclipse.draw2d.geometry.Point(bounds.getX(), bounds.getY()));

				if (modelElement.getLayoutData() instanceof XYLayoutData) {
					XYLayoutData xyLayoutData = (XYLayoutData) modelElement.getLayoutData();
					Point topLeft;
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

					Dimension size;
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
				if (getRoot() != null) {
					handleMajorSemanticChange();
				}
			}
		}, bounds);

		final ShapeStyle shapeStyle = (ShapeStyle) view.getStyle(NotationPackage.eINSTANCE.getShapeStyle());
		if (modelElement.getBackgroundColor() != null) {
			final int rgbColor;
			if (modelElement.getBackgroundColor() instanceof RGBColor) {
				RGBColor modelColor = (RGBColor) modelElement.getBackgroundColor();
				rgbColor = (modelColor.getRed() & 0xFF) | ((modelColor.getGreen() & 0xFF) << 8) | ((modelColor.getBlue() & 0xFF) << 16);
			} else {
				ConstantColor modelColor = (ConstantColor) modelElement.getBackgroundColor();
				switch (modelColor.getValue().getValue()) {
				/*
				 case <nextValue>: {
				 rgbColor = org.eclipse.draw2d.ColorConstants.<nextColorLiteral.getName()>.getRGB().hashCode();
				 break;
				 }
				 */
				default:
					rgbColor = -1;
				}
			}
			if (rgbColor != -1 && shapeStyle.getFillColor() != rgbColor) {
				AbstractEMFOperation setColorOperation = new AbstractEMFOperation(getEditingDomain(),
						"Synchronizing view Background color with the model", Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE)) { //$NON-NLS-1$

					protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
						shapeStyle.setFillColor(rgbColor);
						return Status.OK_STATUS;
					}
				};
				try {
					setColorOperation.execute(new NullProgressMonitor(), null);
				} catch (ExecutionException e) {
					GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to synchronize view Background background color with the model", e); //$NON-NLS-1$
				}
			}
		}
		if (modelElement.getForegroundColor() != null) {
			final int rgbColor;
			if (modelElement.getForegroundColor() instanceof RGBColor) {
				RGBColor modelColor = (RGBColor) modelElement.getForegroundColor();
				rgbColor = (modelColor.getRed() & 0xFF) | ((modelColor.getGreen() & 0xFF) << 8) | ((modelColor.getBlue() & 0xFF) << 16);
			} else {
				ConstantColor modelColor = (ConstantColor) modelElement.getForegroundColor();
				switch (modelColor.getValue().getValue()) {
				/*
				 case <nextValue>: {
				 rgbColor = org.eclipse.draw2d.ColorConstants.<nextColorLiteral.getName()>.getRGB().hashCode();
				 break;
				 }
				 */
				default:
					rgbColor = -1;
				}
			}
			if (rgbColor != -1 && shapeStyle.getLineColor() != rgbColor) {
				AbstractEMFOperation setColorOperation = new AbstractEMFOperation(getEditingDomain(),
						"Synchronizing view Foreground color with the model", Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE)) { //$NON-NLS-1$

					protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
						shapeStyle.setLineColor(rgbColor);
						return Status.OK_STATUS;
					}
				};
				try {
					setColorOperation.execute(new NullProgressMonitor(), null);
				} catch (ExecutionException e) {
					GMFGraphDiagramEditorPlugin.getInstance().logError("Unable to synchronize view Foreground background color with the model", e); //$NON-NLS-1$
				}
			}
		}
		addListenerFilter("ShapeStyleListener", new NotificationListener() {

			public void notifyChanged(Notification notification) {
				ShapeStyle shapeStyle = (ShapeStyle) notification.getNotifier();
				switch (notification.getFeatureID(ShapeStyle.class)) {
				case NotationPackage.SHAPE_STYLE__FILL_COLOR: {
					int color = shapeStyle.getFillColor();
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
					break;
				}
				case NotationPackage.SHAPE_STYLE__LINE_COLOR: {
					int color = shapeStyle.getLineColor();
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
					break;
				}
				}
			}
		}, shapeStyle);
		super.activate();
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Ellipse2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new Ellipse2GraphicalNodeEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new Ellipse2CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}

			protected org.eclipse.draw2d.geometry.Point getLayoutOrigin() {
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

		});
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		EllipseFigure figure = new EllipseFigure();
		figure.setUseLocalCoordinates(true);
		myFigure = figure;
		Ellipse modelElement = (Ellipse) ((View) getModel()).getElement();
		if (modelElement != null) {
			{
				boolean value = modelElement.isOutline();
				myFigure.setOutline(value);
			}
			{
				boolean value = modelElement.isFill();
				myFigure.setFill(value);
			}
			{
				int value = modelElement.getLineWidth();
				myFigure.setLineWidth(value);
			}
			{
				LineKind value = modelElement.getLineKind();
				myFigure.setLineStyle("LINE_DASH".equals(value.getName()) ? org.eclipse.draw2d.Graphics.LINE_DASH : "LINE_DOT".equals(value.getName()) ? org.eclipse.draw2d.Graphics.LINE_DOT
						: "LINE_DASHDOT".equals(value.getName()) ? org.eclipse.draw2d.Graphics.LINE_DASHDOT : "LINE_DASHDOTDOT".equals(value.getName()) ? org.eclipse.draw2d.Graphics.LINE_DASHDOTDOT
								: "LINE_CUSTOM".equals(value.getName()) ? org.eclipse.draw2d.Graphics.LINE_CUSTOM : org.eclipse.draw2d.Graphics.LINE_SOLID);
			}
			{
				boolean value = modelElement.isXorFill();
				myFigure.setFillXOR(value);
			}
			{
				boolean value = modelElement.isXorOutline();
				myFigure.setOutlineXOR(value);
			}
			layoutChanged(modelElement.getLayout(), false);
		}
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public EllipseFigure getPrimaryShape() {
		return (EllipseFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		return new DefaultSizeNodeFigure(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		return new ResizableShapeEditPolicy() {

			protected List createSelectionHandles() {
				final org.eclipse.gef.GraphicalEditPart part = (org.eclipse.gef.GraphicalEditPart) getHost();
				final List list = new ArrayList();
				addMoveHandle(part, list);

				ResizableHandleKit.addHandle(part, list, PositionConstants.NORTH);

				ResizableHandleKit.addHandle(part, list, PositionConstants.SOUTH);

				ResizableHandleKit.addHandle(part, list, PositionConstants.WEST);

				ResizableHandleKit.addHandle(part, list, PositionConstants.EAST);

				ResizableHandleKit.addHandle(part, list, PositionConstants.NORTH_EAST);

				ResizableHandleKit.addHandle(part, list, PositionConstants.NORTH_WEST);

				ResizableHandleKit.addHandle(part, list, PositionConstants.SOUTH_EAST);

				ResizableHandleKit.addHandle(part, list, PositionConstants.SOUTH_WEST);

				return list;
			}

			private void addMoveHandle(final org.eclipse.gef.GraphicalEditPart part, final List list) {
				MoveHandle moveHandle = new MoveHandle(part);
				// just make it look nice 
				moveHandle.setBorder(null);
				list.add(moveHandle);
			}
		};
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
		myNodeFigure = figure;
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
	public class EllipseFigure extends org.eclipse.draw2d.Ellipse {

		/**
		 * @generated
		 */
		public EllipseFigure() {

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
		if (((View) getParent().getModel()).getElement() instanceof FigureMarker) {
			int width = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
			int height = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height())).intValue();
			myNodeFigure.setPreferredSize(new org.eclipse.draw2d.geometry.Dimension(width, height));
		} else {
			super.refreshBounds();
		}
	}
}
