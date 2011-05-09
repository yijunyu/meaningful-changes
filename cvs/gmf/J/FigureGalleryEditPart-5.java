package org.eclipse.gmf.graphdef.editor.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.StackLayout;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;

import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.handles.ResizableHandleKit;

import org.eclipse.gmf.graphdef.editor.edit.policies.FigureGalleryCanonicalEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.policies.FigureGalleryGraphicalNodeEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.policies.FigureGalleryItemSemanticEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.policies.GMFGraphTextSelectionEditPolicy;

import org.eclipse.gmf.graphdef.editor.part.GMFGraphVisualIDRegistry;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;

import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;

import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FigureGalleryEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1004;

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
	public FigureGalleryEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new FigureGalleryItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new FigureGalleryGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new FigureGalleryCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new GMFGraphTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		});
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		FigureGalleryFigure figure = new FigureGalleryFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public FigureGalleryFigure getPrimaryShape() {
		return (FigureGalleryFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FigureGallery_nameEditPart) {
			((FigureGallery_nameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureFigureGalleryFigure_NameLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		return new DefaultSizeNodeFigure(getMapMode().DPtoLP(40), getMapMode().DPtoLP(40));
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		return new ResizableShapeEditPolicy() {

			protected List createSelectionHandles() {
				final GraphicalEditPart part = (GraphicalEditPart) getHost();
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

			private void addMoveHandle(final GraphicalEditPart part, final List list) {
				MoveHandle moveHandle = new MoveHandle(part);
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(GMFGraphVisualIDRegistry.getType(FigureGallery_nameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (!addFixedChild(childEditPart)) {
			super.addChildVisual(childEditPart, -1);
		}
	}

	/**
	 * @generated
	 */
	public class FigureGalleryFigure extends org.eclipse.draw2d.RectangleFigure {

		/**
		 * @generated
		 */
		public FigureGalleryFigure() {

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel childFigureGalleryFigure_NameLabel = createFigureFigureGalleryFigure_NameLabel();
			setFigureFigureGalleryFigure_NameLabel(childFigureGalleryFigure_NameLabel);
			add(childFigureGalleryFigure_NameLabel);

		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fFigureGalleryFigure_NameLabel;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureFigureGalleryFigure_NameLabel() {
			return fFigureGalleryFigure_NameLabel;
		}

		/**
		 * @generated
		 */
		protected void setFigureFigureGalleryFigure_NameLabel(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel figure) {
			fFigureGalleryFigure_NameLabel = figure;
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel createFigureFigureGalleryFigure_NameLabel() {
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel FigureGalleryFigure_NameLabel = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();

			return FigureGalleryFigure_NameLabel;
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
