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

import org.eclipse.gmf.graphdef.editor.edit.policies.CompartmentCanonicalEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.policies.CompartmentGraphicalNodeEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.policies.CompartmentItemSemanticEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.policies.GMFGraphTextSelectionEditPolicy;

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
public class CompartmentEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static String VISUAL_ID = "1001";

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
	public CompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new CompartmentGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new CompartmentCanonicalEditPolicy());
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
		DiagramElementFigure figure = new DiagramElementFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public DiagramElementFigure getPrimaryShape() {
		return (DiagramElementFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Compartment_nameEditPart) {
			((Compartment_nameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureDiagramElementFigure_NameLabel());
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
		return getChildBySemanticHint(Compartment_nameEditPart.VISUAL_ID);
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
	public class DiagramElementFigure extends org.eclipse.draw2d.RectangleFigure {

		/**
		 * @generated
		 */
		public DiagramElementFigure() {

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel childDiagramElementFigure_NameLabel = createFigureDiagramElementFigure_NameLabel();
			setFigureDiagramElementFigure_NameLabel(childDiagramElementFigure_NameLabel);
			add(childDiagramElementFigure_NameLabel);

		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fDiagramElementFigure_NameLabel;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureDiagramElementFigure_NameLabel() {
			return fDiagramElementFigure_NameLabel;
		}

		/**
		 * @generated
		 */
		protected void setFigureDiagramElementFigure_NameLabel(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel figure) {
			fDiagramElementFigure_NameLabel = figure;
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel createFigureDiagramElementFigure_NameLabel() {
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel DiagramElementFigure_NameLabel = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();

			return DiagramElementFigure_NameLabel;
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
