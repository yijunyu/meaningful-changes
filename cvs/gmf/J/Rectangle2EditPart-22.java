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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.gmfgraph.ColorConstants;
import org.eclipse.gmf.gmfgraph.ConstantColor;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.RGBColor;
import org.eclipse.gmf.gmfgraph.Shape;
import org.eclipse.gmf.graphdef.editor.edit.policies.Rectangle2CanonicalEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.policies.Rectangle2ItemSemanticEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.polocies.DomainBasedXYLayoutEditPolicy;
import org.eclipse.gmf.graphdef.editor.part.GMFGraphDiagramEditorPlugin;
import org.eclipse.gmf.graphdef.editor.sheet.AttachAdapter;
import org.eclipse.gmf.graphdef.editor.sheet.ChangeTracker;
import org.eclipse.gmf.graphdef.editor.sheet.FeatureTracker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Rectangle2EditPart extends AbstractFigureEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3011;

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
	public Rectangle2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Rectangle2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new Rectangle2CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new DomainBasedXYLayoutEditPolicy(getMapMode());
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		RectangleFigure figure = new RectangleFigure();
		figure.setUseLocalCoordinates(true);
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public RectangleFigure getPrimaryShape() {
		return (RectangleFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
		result.setMinimumSize(new Dimension(0, 0));
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
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (NotationPackage.eINSTANCE.getSize_Width().equals(feature) || NotationPackage.eINSTANCE.getSize_Height().equals(feature) || NotationPackage.eINSTANCE.getLocation_X().equals(feature)
				|| NotationPackage.eINSTANCE.getLocation_Y().equals(feature)) {
			return;
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated
	 */
	public class RectangleFigure extends org.eclipse.draw2d.RectangleFigure {

		/**
		 * @generated
		 */
		public RectangleFigure() {

			this.setLayoutManager(new XYLayout());
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
	private Collection<Adapter> myDomainElementAdapters = new ArrayList<Adapter>();

	/**
	 * @generated
	 */
	private org.eclipse.gmf.gmfgraph.Rectangle getModelFigureElement() {
		Shape shape = getShape();
		if (shape instanceof org.eclipse.gmf.gmfgraph.Rectangle) {
			org.eclipse.gmf.gmfgraph.Rectangle modelFigureElement = (org.eclipse.gmf.gmfgraph.Rectangle) shape;
			return modelFigureElement;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected void removeSemanticListeners() {
		org.eclipse.gmf.gmfgraph.Rectangle modelElement = (org.eclipse.gmf.gmfgraph.Rectangle) getModelFigureElement();
		if (modelElement != null) {
			modelElement.eAdapters().removeAll(myDomainElementAdapters);
			myDomainElementAdapters.clear();
		}
		super.removeSemanticListeners();
	}

	/**
	 * @generated
	 */
	protected void setFigure(IFigure figure) {
		super.setFigure(figure);
		org.eclipse.gmf.gmfgraph.Rectangle modelElement = (org.eclipse.gmf.gmfgraph.Rectangle) getModelFigureElement();
		if (modelElement != null) {
			refreshBounds();
			refreshLayoutData();
			getPrimaryShape().setOutline(modelElement.isOutline());
			getPrimaryShape().setFill(modelElement.isFill());
			getPrimaryShape().setLineWidth(modelElement.getLineWidth());
			getPrimaryShape().setLineStyle(getLineStyle(modelElement.getLineKind()));
			getPrimaryShape().setFillXOR(modelElement.isXorFill());
			getPrimaryShape().setOutlineXOR(modelElement.isXorOutline());
			getPrimaryShape().setLayoutManager(getLayoutManager(modelElement.getLayout()));
		}
	}

	/**
	 * @generated
	 */
	public void activate() {
		if (isActive()) {
			return;
		}
		final org.eclipse.gmf.gmfgraph.Rectangle modelElement = (org.eclipse.gmf.gmfgraph.Rectangle) getModelFigureElement();
		if (modelElement == null) {
			super.activate();
			return;
		}

		ChangeTracker refreshBoundsTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				refreshBounds();
			}
		};
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_Location(), refreshBoundsTracker, new FeatureTracker(refreshBoundsTracker, GMFGraphPackage.eINSTANCE
				.getPoint_X()), new FeatureTracker(refreshBoundsTracker, GMFGraphPackage.eINSTANCE.getPoint_Y())));
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_PreferredSize(), refreshBoundsTracker, new FeatureTracker(refreshBoundsTracker, GMFGraphPackage.eINSTANCE
				.getDimension_Dx()), new FeatureTracker(refreshBoundsTracker, GMFGraphPackage.eINSTANCE.getDimension_Dy())));

		ChangeTracker refreshLayoutDataTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				refreshLayoutData();
			}
		};
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getLayoutable_LayoutData(), refreshLayoutDataTracker, new AttachAdapter(GMFGraphPackage.eINSTANCE
				.getXYLayoutData_TopLeft(), refreshLayoutDataTracker, new FeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getPoint_X()), new FeatureTracker(
				refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getPoint_Y())), new AttachAdapter(GMFGraphPackage.eINSTANCE.getXYLayoutData_Size(), refreshLayoutDataTracker, new FeatureTracker(
				refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getDimension_Dx()), new FeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getDimension_Dy())), new FeatureTracker(
				refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getBorderLayoutData_Alignment()), new FeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE
				.getBorderLayoutData_Vertical()), new FeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getGridLayoutData_GrabExcessHorizontalSpace()), new FeatureTracker(
				refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getGridLayoutData_GrabExcessVerticalSpace()), new FeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE
				.getGridLayoutData_VerticalAlignment()), new FeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getGridLayoutData_HorizontalAlignment()), new FeatureTracker(
				refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getGridLayoutData_VerticalSpan()), new FeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE
				.getGridLayoutData_HorizontalSpan()), new FeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getGridLayoutData_HorizontalIndent()), new AttachAdapter(
				GMFGraphPackage.eINSTANCE.getGridLayoutData_SizeHint(), refreshLayoutDataTracker, new FeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getDimension_Dx()),
				new FeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getDimension_Dy()))));

		ChangeTracker outlineTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setOutline(modelElement.isOutline());
			}
		};
		myDomainElementAdapters.add(new FeatureTracker(outlineTracker, GMFGraphPackage.eINSTANCE.getShape_Outline()));

		ChangeTracker fillTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setFill(modelElement.isFill());
			}
		};
		myDomainElementAdapters.add(new FeatureTracker(fillTracker, GMFGraphPackage.eINSTANCE.getShape_Fill()));

		ChangeTracker lineWidthTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setLineWidth(modelElement.getLineWidth());
			}
		};
		myDomainElementAdapters.add(new FeatureTracker(lineWidthTracker, GMFGraphPackage.eINSTANCE.getShape_LineWidth()));

		ChangeTracker lineStyleTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setLineStyle(getLineStyle(modelElement.getLineKind()));
			}
		};
		myDomainElementAdapters.add(new FeatureTracker(lineStyleTracker, GMFGraphPackage.eINSTANCE.getShape_LineKind()));

		ChangeTracker fillXORTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setFillXOR(modelElement.isXorFill());
			}
		};
		myDomainElementAdapters.add(new FeatureTracker(fillXORTracker, GMFGraphPackage.eINSTANCE.getShape_XorFill()));

		ChangeTracker outlineXORTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setOutlineXOR(modelElement.isXorOutline());
			}
		};
		myDomainElementAdapters.add(new FeatureTracker(outlineXORTracker, GMFGraphPackage.eINSTANCE.getShape_XorOutline()));

		ChangeTracker layoutManagerTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setLayoutManager(getLayoutManager(modelElement.getLayout()));
			}
		};
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getLayoutable_Layout(), layoutManagerTracker, new AttachAdapter(GMFGraphPackage.eINSTANCE.getBorderLayout_Spacing(),
				layoutManagerTracker, new FeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getDimension_Dx()), new FeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE
						.getDimension_Dy())), new FeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getFlowLayout_Vertical()), new FeatureTracker(layoutManagerTracker,
				GMFGraphPackage.eINSTANCE.getFlowLayout_MatchMinorSize()), new FeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getFlowLayout_ForceSingleLine()), new FeatureTracker(
				layoutManagerTracker, GMFGraphPackage.eINSTANCE.getFlowLayout_MajorAlignment()), new FeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getFlowLayout_MinorAlignment()),
				new FeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getFlowLayout_MajorSpacing()), new FeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE
						.getFlowLayout_MinorSpacing()), new FeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getGridLayout_NumColumns()), new FeatureTracker(layoutManagerTracker,
						GMFGraphPackage.eINSTANCE.getGridLayout_EqualWidth()), new AttachAdapter(GMFGraphPackage.eINSTANCE.getGridLayout_Margins(), layoutManagerTracker, new FeatureTracker(
						layoutManagerTracker, GMFGraphPackage.eINSTANCE.getDimension_Dx()), new FeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getDimension_Dy())), new AttachAdapter(
						GMFGraphPackage.eINSTANCE.getGridLayout_Spacing(), layoutManagerTracker, new FeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getDimension_Dx()),
						new FeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getDimension_Dy()))));
		modelElement.eAdapters().addAll(myDomainElementAdapters);

		View view = getNotationView();
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
	protected void refreshBounds() {
		org.eclipse.gmf.gmfgraph.Rectangle modelElement = (org.eclipse.gmf.gmfgraph.Rectangle) getModelFigureElement();
		if (modelElement == null) {
			return;
		}
		if (modelElement.getPreferredSize() != null) {
			getFigure().setPreferredSize(getDraw2dDimension(modelElement.getPreferredSize()));
		}
		if (modelElement.getLocation() != null) {
			getFigure().setLocation(getDraw2DPoint(modelElement.getLocation()));
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
}
