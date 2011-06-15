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

import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.graphdef.editor.edit.policies.RoundedRectangleCanonicalEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.policies.RoundedRectangleItemSemanticEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.polocies.FigureContainerXYLayoutEditPolicy;
import org.eclipse.gmf.graphdef.editor.sheet.AttachAdapter;
import org.eclipse.gmf.graphdef.editor.sheet.ChangeTracker;
import org.eclipse.gmf.graphdef.editor.sheet.FeatureTracker;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
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
		return new FigureContainerXYLayoutEditPolicy(getMapMode());
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		RoundedRectangleFigure figure = new RoundedRectangleFigure();
		figure.setUseLocalCoordinates(true);
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
	public class RoundedRectangleFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		public RoundedRectangleFigure() {
			this.setLayoutManager(new XYLayout());
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

	/**
	 * @generated
	 */
	private Collection<Adapter> myDomainElementAdapters = new ArrayList<Adapter>();

	/**
	 * @generated
	 */
	private org.eclipse.gmf.gmfgraph.RoundedRectangle getGmfgraphElement() {
		View view = getNotationView();
		if (view == null) {
			return null;
		}
		EObject element = view.getElement();
		if (element instanceof org.eclipse.gmf.gmfgraph.RoundedRectangle) {
			org.eclipse.gmf.gmfgraph.RoundedRectangle modelFigureElement = (org.eclipse.gmf.gmfgraph.RoundedRectangle) element;
			return modelFigureElement;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected void removeSemanticListeners() {
		org.eclipse.gmf.gmfgraph.RoundedRectangle modelElement = getGmfgraphElement();
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
		org.eclipse.gmf.gmfgraph.RoundedRectangle modelElement = getGmfgraphElement();
		if (modelElement != null) {
			refreshBounds();
			refreshLayoutData();
			getPrimaryShape().setOutline(modelElement.isOutline());
			getPrimaryShape().setFill(modelElement.isFill());
			getPrimaryShape().setLineWidth(modelElement.getLineWidth());
			getPrimaryShape().setLineStyle(getLineStyle(modelElement.getLineKind()));
			getPrimaryShape().setFillXOR(modelElement.isXorFill());
			getPrimaryShape().setOutlineXOR(modelElement.isXorOutline());
			getPrimaryShape().setCornerDimensions(getCornerDimensions(modelElement.getCornerWidth(), modelElement.getCornerHeight()));
			getPrimaryShape().setLayoutManager(getLayoutManager(modelElement.getLayout()));
			refreshLayoutManager();
			getPrimaryShape().setBackgroundColor(getColor(modelElement.getBackgroundColor()));
			getPrimaryShape().setForegroundColor(getColor(modelElement.getForegroundColor()));
			refreshFont();
		}
	}

	/**
	 * @generated
	 */
	public void activate() {
		if (isActive()) {
			return;
		}
		final org.eclipse.gmf.gmfgraph.RoundedRectangle modelElement = getGmfgraphElement();
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

		ChangeTracker cornerDimensionsTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setCornerDimensions(getCornerDimensions(modelElement.getCornerWidth(), modelElement.getCornerHeight()));
			}
		};
		myDomainElementAdapters.add(new FeatureTracker(cornerDimensionsTracker, GMFGraphPackage.eINSTANCE.getRoundedRectangle_CornerWidth()));
		myDomainElementAdapters.add(new FeatureTracker(cornerDimensionsTracker, GMFGraphPackage.eINSTANCE.getRoundedRectangle_CornerHeight()));

		ChangeTracker layoutManagerTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setLayoutManager(getLayoutManager(modelElement.getLayout()));
				refreshLayoutManager();
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

		ChangeTracker backgroundColorTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setBackgroundColor(getColor(modelElement.getBackgroundColor()));
			}
		};
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_BackgroundColor(), backgroundColorTracker, new FeatureTracker(backgroundColorTracker,
				GMFGraphPackage.eINSTANCE.getConstantColor_Value()), new FeatureTracker(backgroundColorTracker, GMFGraphPackage.eINSTANCE.getRGBColor_Red()), new FeatureTracker(
				backgroundColorTracker, GMFGraphPackage.eINSTANCE.getRGBColor_Green()), new FeatureTracker(backgroundColorTracker, GMFGraphPackage.eINSTANCE.getRGBColor_Blue())));

		ChangeTracker foregroundColorTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				getPrimaryShape().setForegroundColor(getColor(modelElement.getForegroundColor()));
			}
		};
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_ForegroundColor(), foregroundColorTracker, new FeatureTracker(foregroundColorTracker,
				GMFGraphPackage.eINSTANCE.getConstantColor_Value()), new FeatureTracker(foregroundColorTracker, GMFGraphPackage.eINSTANCE.getRGBColor_Red()), new FeatureTracker(
				foregroundColorTracker, GMFGraphPackage.eINSTANCE.getRGBColor_Green()), new FeatureTracker(foregroundColorTracker, GMFGraphPackage.eINSTANCE.getRGBColor_Blue())));

		ChangeTracker refreshFontTracker = new ChangeTracker() {

			public void modelChanged(Notification msg) {
				refreshFont();
			}
		};
		myDomainElementAdapters.add(new AttachAdapter(GMFGraphPackage.eINSTANCE.getFigure_Font(), refreshFontTracker, new FeatureTracker(refreshFontTracker, GMFGraphPackage.eINSTANCE
				.getBasicFont_FaceName()), new FeatureTracker(refreshFontTracker, GMFGraphPackage.eINSTANCE.getBasicFont_Height()), new FeatureTracker(refreshFontTracker, GMFGraphPackage.eINSTANCE
				.getBasicFont_Style())));
		modelElement.eAdapters().addAll(myDomainElementAdapters);
		super.activate();
	}

	/**
	 * @generated
	 */
	protected void refreshBounds() {
		org.eclipse.gmf.gmfgraph.RoundedRectangle modelElement = getGmfgraphElement();
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

}
