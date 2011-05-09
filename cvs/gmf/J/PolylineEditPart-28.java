/*
 *  Copyright (c) 2006, 2008 Borland Software Corporation and others.
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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.graphdef.editor.edit.policies.PolylineCanonicalEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.policies.PolylineItemSemanticEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.polocies.PointContainerXYLayoutEditPolicy;
import org.eclipse.gmf.graphdef.editor.sheet.AttachAdapter;
import org.eclipse.gmf.graphdef.editor.sheet.ChangeTracker;
import org.eclipse.gmf.graphdef.editor.sheet.MultipleTargetsFeatureTracker;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableEditPolicyEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PolylineEditPart extends AbstractFigureEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3014;

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
	public PolylineEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PolylineItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new PolylineCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new PointContainerXYLayoutEditPolicy(getMapMode());
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new Polyline();
	}

	/**
	 * @generated
	 */
	public Polyline getPrimaryShape() {
		return (Polyline) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigureExt result = new DefaultSizeNodeFigureExt(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
		result.setMinimumSize(new Dimension(0, 0));
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		NonResizableEditPolicyEx editPolicy = new NonResizableEditPolicyEx();
		editPolicy.setDragAllowed(false);
		return editPolicy;
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
		figure.setLayoutManager(new XYLayout() {

			public Point getOrigin(IFigure parent) {
				return new Point();
			}
		});
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = figure;
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
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
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
		} else if (NotationPackage.eINSTANCE.getFillStyle_FillColor().equals(feature)) {
			return;
		} else if (NotationPackage.eINSTANCE.getLineStyle_LineColor().equals(feature)) {
			return;
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated
	 */
	private Collection<Adapter> myDomainElementAdapters = new ArrayList<Adapter>();

	/**
	 * @generated
	 */
	private org.eclipse.gmf.gmfgraph.Polyline getGmfgraphElement() {
		View view = getNotationView();
		if (view == null) {
			return null;
		}
		EObject element = view.getElement();
		if (element instanceof org.eclipse.gmf.gmfgraph.Polyline) {
			org.eclipse.gmf.gmfgraph.Polyline modelFigureElement = (org.eclipse.gmf.gmfgraph.Polyline) element;
			return modelFigureElement;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected void removeSemanticListeners() {
		org.eclipse.gmf.gmfgraph.Polyline modelElement = getGmfgraphElement();
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
		org.eclipse.gmf.gmfgraph.Polyline modelElement = getGmfgraphElement();
		if (modelElement != null) {
			refreshBounds();
			refreshLayoutData();
			getPrimaryShape().setOutline(modelElement.isOutline());
			getPrimaryShape().setFill(modelElement.isFill());
			getPrimaryShape().setLineStyle(getLineStyle(modelElement.getLineKind()));
			getPrimaryShape().setFillXOR(modelElement.isXorFill());
			getPrimaryShape().setOutlineXOR(modelElement.isXorOutline());
			getPrimaryShape().setLayoutManager(getLayoutManager(modelElement.getLayout()));
			refreshLayoutManager();
			getPrimaryShape().setBackgroundColor(getColor(modelElement.getBackgroundColor()));
			getPrimaryShape().setForegroundColor(getColor(modelElement.getForegroundColor()));
			refreshFont();
			getPrimaryShape().setPoints(getPointList(modelElement.getTemplate()));
			refreshMainFigureBounds();
			getPrimaryShape().setLineWidth(modelElement.getLineWidth());
			refreshMainFigureBounds();
		}
	}

	/**
	 * @generated
	 */
	public void activate() {
		if (isActive()) {
			return;
		}
		final org.eclipse.gmf.gmfgraph.Polyline modelElement = getGmfgraphElement();
		if (modelElement == null) {
			super.activate();
			return;
		}

		ChangeTracker refreshBoundsTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				refreshBounds();
			}
		};
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_Location(), refreshBoundsTracker, new MultipleTargetsFeatureTracker(refreshBoundsTracker,
				GMFGraphPackage.eINSTANCE.getPoint_X()), new MultipleTargetsFeatureTracker(refreshBoundsTracker, GMFGraphPackage.eINSTANCE.getPoint_Y())));
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_PreferredSize(), refreshBoundsTracker, new MultipleTargetsFeatureTracker(refreshBoundsTracker,
				GMFGraphPackage.eINSTANCE.getDimension_Dx()), new MultipleTargetsFeatureTracker(refreshBoundsTracker, GMFGraphPackage.eINSTANCE.getDimension_Dy())));

		ChangeTracker refreshLayoutDataTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				refreshLayoutData();
			}
		};
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getLayoutable_LayoutData(), refreshLayoutDataTracker, new AttachAdapter(GMFGraphPackage.eINSTANCE
				.getXYLayoutData_TopLeft(), refreshLayoutDataTracker, new MultipleTargetsFeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getPoint_X()),
				new MultipleTargetsFeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getPoint_Y())), new AttachAdapter(GMFGraphPackage.eINSTANCE.getXYLayoutData_Size(),
				refreshLayoutDataTracker, new MultipleTargetsFeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getDimension_Dx()), new MultipleTargetsFeatureTracker(
						refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getDimension_Dy())), new MultipleTargetsFeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE
				.getBorderLayoutData_Alignment()), new MultipleTargetsFeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getBorderLayoutData_Vertical()),
				new MultipleTargetsFeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getGridLayoutData_GrabExcessHorizontalSpace()), new MultipleTargetsFeatureTracker(
						refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getGridLayoutData_GrabExcessVerticalSpace()), new MultipleTargetsFeatureTracker(refreshLayoutDataTracker,
						GMFGraphPackage.eINSTANCE.getGridLayoutData_VerticalAlignment()), new MultipleTargetsFeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE
						.getGridLayoutData_HorizontalAlignment()), new MultipleTargetsFeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getGridLayoutData_VerticalSpan()),
				new MultipleTargetsFeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getGridLayoutData_HorizontalSpan()), new MultipleTargetsFeatureTracker(refreshLayoutDataTracker,
						GMFGraphPackage.eINSTANCE.getGridLayoutData_HorizontalIndent()), new AttachAdapter(GMFGraphPackage.eINSTANCE.getGridLayoutData_SizeHint(), refreshLayoutDataTracker,
						new MultipleTargetsFeatureTracker(refreshLayoutDataTracker, GMFGraphPackage.eINSTANCE.getDimension_Dx()), new MultipleTargetsFeatureTracker(refreshLayoutDataTracker,
								GMFGraphPackage.eINSTANCE.getDimension_Dy()))));

		ChangeTracker outlineTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setOutline(modelElement.isOutline());
			}
		};
		myDomainElementAdapters.add(new MultipleTargetsFeatureTracker(outlineTracker, GMFGraphPackage.eINSTANCE.getShape_Outline()));

		ChangeTracker fillTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setFill(modelElement.isFill());
			}
		};
		myDomainElementAdapters.add(new MultipleTargetsFeatureTracker(fillTracker, GMFGraphPackage.eINSTANCE.getShape_Fill()));

		ChangeTracker lineStyleTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setLineStyle(getLineStyle(modelElement.getLineKind()));
			}
		};
		myDomainElementAdapters.add(new MultipleTargetsFeatureTracker(lineStyleTracker, GMFGraphPackage.eINSTANCE.getShape_LineKind()));

		ChangeTracker fillXORTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setFillXOR(modelElement.isXorFill());
			}
		};
		myDomainElementAdapters.add(new MultipleTargetsFeatureTracker(fillXORTracker, GMFGraphPackage.eINSTANCE.getShape_XorFill()));

		ChangeTracker outlineXORTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setOutlineXOR(modelElement.isXorOutline());
			}
		};
		myDomainElementAdapters.add(new MultipleTargetsFeatureTracker(outlineXORTracker, GMFGraphPackage.eINSTANCE.getShape_XorOutline()));

		ChangeTracker layoutManagerTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setLayoutManager(getLayoutManager(modelElement.getLayout()));
				refreshLayoutManager();
			}
		};
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getLayoutable_Layout(), layoutManagerTracker, new AttachAdapter(GMFGraphPackage.eINSTANCE.getBorderLayout_Spacing(),
				layoutManagerTracker, new MultipleTargetsFeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getDimension_Dx()), new MultipleTargetsFeatureTracker(layoutManagerTracker,
						GMFGraphPackage.eINSTANCE.getDimension_Dy())), new MultipleTargetsFeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getFlowLayout_Vertical()),
				new MultipleTargetsFeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getFlowLayout_MatchMinorSize()), new MultipleTargetsFeatureTracker(layoutManagerTracker,
						GMFGraphPackage.eINSTANCE.getFlowLayout_ForceSingleLine()), new MultipleTargetsFeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getFlowLayout_MajorAlignment()),
				new MultipleTargetsFeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getFlowLayout_MinorAlignment()), new MultipleTargetsFeatureTracker(layoutManagerTracker,
						GMFGraphPackage.eINSTANCE.getFlowLayout_MajorSpacing()), new MultipleTargetsFeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getFlowLayout_MinorSpacing()),
				new MultipleTargetsFeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getGridLayout_NumColumns()), new MultipleTargetsFeatureTracker(layoutManagerTracker,
						GMFGraphPackage.eINSTANCE.getGridLayout_EqualWidth()), new AttachAdapter(GMFGraphPackage.eINSTANCE.getGridLayout_Margins(), layoutManagerTracker,
						new MultipleTargetsFeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getDimension_Dx()), new MultipleTargetsFeatureTracker(layoutManagerTracker,
								GMFGraphPackage.eINSTANCE.getDimension_Dy())), new AttachAdapter(GMFGraphPackage.eINSTANCE.getGridLayout_Spacing(), layoutManagerTracker,
						new MultipleTargetsFeatureTracker(layoutManagerTracker, GMFGraphPackage.eINSTANCE.getDimension_Dx()), new MultipleTargetsFeatureTracker(layoutManagerTracker,
								GMFGraphPackage.eINSTANCE.getDimension_Dy()))));

		ChangeTracker backgroundColorTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setBackgroundColor(getColor(modelElement.getBackgroundColor()));
			}
		};
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_BackgroundColor(), backgroundColorTracker, new MultipleTargetsFeatureTracker(backgroundColorTracker,
				GMFGraphPackage.eINSTANCE.getConstantColor_Value()), new MultipleTargetsFeatureTracker(backgroundColorTracker, GMFGraphPackage.eINSTANCE.getRGBColor_Red()),
				new MultipleTargetsFeatureTracker(backgroundColorTracker, GMFGraphPackage.eINSTANCE.getRGBColor_Green()), new MultipleTargetsFeatureTracker(backgroundColorTracker,
						GMFGraphPackage.eINSTANCE.getRGBColor_Blue())));

		ChangeTracker foregroundColorTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setForegroundColor(getColor(modelElement.getForegroundColor()));
			}
		};
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_ForegroundColor(), foregroundColorTracker, new MultipleTargetsFeatureTracker(foregroundColorTracker,
				GMFGraphPackage.eINSTANCE.getConstantColor_Value()), new MultipleTargetsFeatureTracker(foregroundColorTracker, GMFGraphPackage.eINSTANCE.getRGBColor_Red()),
				new MultipleTargetsFeatureTracker(foregroundColorTracker, GMFGraphPackage.eINSTANCE.getRGBColor_Green()), new MultipleTargetsFeatureTracker(foregroundColorTracker,
						GMFGraphPackage.eINSTANCE.getRGBColor_Blue())));

		ChangeTracker refreshFontTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				refreshFont();
			}
		};
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_Font(), refreshFontTracker, new MultipleTargetsFeatureTracker(refreshFontTracker, GMFGraphPackage.eINSTANCE
				.getBasicFont_FaceName()), new MultipleTargetsFeatureTracker(refreshFontTracker, GMFGraphPackage.eINSTANCE.getBasicFont_Height()), new MultipleTargetsFeatureTracker(
				refreshFontTracker, GMFGraphPackage.eINSTANCE.getBasicFont_Style())));

		ChangeTracker pointsTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setPoints(getPointList(modelElement.getTemplate()));
				refreshMainFigureBounds();
			}
		};
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getPolyline_Template(), pointsTracker, new MultipleTargetsFeatureTracker(pointsTracker, GMFGraphPackage.eINSTANCE
				.getPoint_X()), new MultipleTargetsFeatureTracker(pointsTracker, GMFGraphPackage.eINSTANCE.getPoint_Y())));

		ChangeTracker lineWidthTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setLineWidth(modelElement.getLineWidth());
				refreshMainFigureBounds();
			}
		};
		myDomainElementAdapters.add(new MultipleTargetsFeatureTracker(lineWidthTracker, GMFGraphPackage.eINSTANCE.getShape_LineWidth()));
		modelElement.eAdapters().addAll(myDomainElementAdapters);
		super.activate();
	}

	/**
	 * @generated
	 */
	protected void refreshBounds() {
		org.eclipse.gmf.gmfgraph.Polyline modelElement = getGmfgraphElement();
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
	public void refreshMainFigureBounds() {
		DefaultSizeNodeFigureExt nodeFigure = (DefaultSizeNodeFigureExt) getFigure();
		nodeFigure.fireFigureMoved();
		nodeFigure.revalidate();
	}

	/**
	 * @generated
	 */
	class DefaultSizeNodeFigureExt extends DefaultSizeNodeFigure {

		/**
		 * @generated
		 */
		DefaultSizeNodeFigureExt(int width, int height) {
			super(width, height);
		}

		/**
		 * @generated
		 */
		public void setBounds(Rectangle rect) {
			getPrimaryShape().setBounds(rect);
		}

		/**
		 * @generated
		 */
		public Rectangle getBounds() {
			Rectangle polylineBounds = getPrimaryShape().getBounds().getCopy();
			polylineBounds.width += 8;
			polylineBounds.height += 8;
			return polylineBounds;
		}

		/**
		 * @generated
		 */
		public void fireFigureMoved() {
			super.fireFigureMoved();
		}

	}

}
