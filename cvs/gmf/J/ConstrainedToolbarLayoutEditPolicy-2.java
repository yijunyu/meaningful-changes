/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2002, 2003.  All Rights Reserved.              |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.diagram.ui.editpolicies;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Transposer;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

import org.eclipse.gmf.runtime.diagram.ui.commands.EtoolsProxyCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GateEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ResizableCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.TextCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.SetCompartmentRatioCommand;
import org.eclipse.gmf.runtime.diagram.ui.internal.editparts.FixedLocationResizableEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.editpolicies.TextSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.PresentationResourceManager;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapMode;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeModelCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import com.ibm.xtools.notation.View;

/**
 * A layout editpolicy for containers with constrained toolbar layout manager
 * 
 * @author melaasar
 */
public class ConstrainedToolbarLayoutEditPolicy
	extends ConstrainedLayoutEditPolicy {

	/**
	 * The null constraint
	 */
	private static final double NULL_CONSTRAINT = -1;

	/**
	 * Indicates whether the layout manager is horizontal (or vertical)
	 */
	private boolean horizontal;

	private Transposer transposer = new Transposer();

	/**
	 * Creates a new vertical ConstrainedFlowLayoutEditPolicy 
	 */
	public ConstrainedToolbarLayoutEditPolicy() {
		this(false);
	}

	/**
	 * Creates a new ConstrainedFlowLayoutEditPolicy with the given orientation
	 * @param horizontal
	 */
	public ConstrainedToolbarLayoutEditPolicy(boolean horizontal) {
		this.horizontal = horizontal;
		transposer.setEnabled(horizontal);
	}

	/**
	 * @return Whether the editpolicy is horizontal
	 */
	protected boolean isHorizontal() {
		return horizontal;
	}

	
	/**
	* @see org.eclipse.gef.editpolicies.LayoutEditPolicy#createChildEditPolicy(org.eclipse.gef.EditPart)
	*/
	protected EditPolicy createChildEditPolicy(EditPart child) {
		if( child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null )
		{
			if (child instanceof ResizableCompartmentEditPart)
				return new ResizableCompartmentEditPolicy(isHorizontal());
			else if (child instanceof TextCompartmentEditPart)
				return new TextSelectionEditPolicy();
			else if ( child instanceof GateEditPart)
				return new GateNonResizableEditPolicy();
			else if ( child instanceof FixedLocationResizableEditPart)
				return  child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		}
		return child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
	}

	/**
	 * @see org.eclipse.gef.EditPolicy#getCommand(org.eclipse.gef.Request)
	 */
	public Command getCommand(Request request) {
		if (RequestConstants.REQ_AUTOSIZE.equals(request.getType()))
			return getAutoSizeCommand(request);
		return super.getCommand(request);
	}

	/**
	 * @see org.eclipse.gef.EditPolicy#getTargetEditPart(org.eclipse.gef.Request)
	 */
	public EditPart getTargetEditPart(Request request) {
		return understandsRequest(request) ? getHost() : null;
	}

	/**
	 * @see org.eclipse.gef.EditPolicy#understandsRequest(org.eclipse.gef.Request)
	 */
	public boolean understandsRequest(Request req) {
		if (RequestConstants.REQ_AUTOSIZE.equals(req.getType()))
			return true;
		return super.understandsRequest(req);
	}

	/**
	 * Creates and returns an autosize command that reverts the layout constraints
	 * @param request teh request
	 * @return command
	 */
	protected Command getAutoSizeCommand(Request request) {
		CompositeModelCommand cmc = new CompositeModelCommand(PresentationResourceManager.getI18NString("Command.AdjustRatioCommand.Label")); //$NON-NLS-1$
		Iterator children = getHost().getChildren().iterator();
		while (children.hasNext()) {
			IGraphicalEditPart child = (IGraphicalEditPart) children.next();
			if (child instanceof ResizableCompartmentEditPart) {
				cmc.compose(new SetCompartmentRatioCommand(new EObjectAdapter((View)child.getModel()), NULL_CONSTRAINT));
			}
		}
		return cmc.isEmpty() ? null : new EtoolsProxyCommand(cmc.unwrap());
	}

	/**
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#getResizeChildrenCommand(org.eclipse.gef.requests.ChangeBoundsRequest)
	 */
	protected Command getResizeChildrenCommand(ChangeBoundsRequest req) {
		CompositeModelCommand cmc = new CompositeModelCommand(PresentationResourceManager.getI18NString("Command.AdjustRatioCommand.Label")); //$NON-NLS-1$
		
		boolean before = transposer.t(req.getMoveDelta()).y != 0;
		GraphicalEditPart c = (GraphicalEditPart) req.getEditParts().get(0);
		IFigure p = c.getFigure();
		if (!(p instanceof ResizableCompartmentFigure)) {
			return null;
		}
		IFigure a = ((ResizableCompartmentFigure) p).getAdjacentSibling(before);

		double parentHeight = transposer.t(p.getParent().getSize()).height;
		double heightDelta = MapMode.DPtoLP(transposer.t(req.getSizeDelta()).height);

		Map registry = getHost().getViewer().getVisualPartMap();
		Iterator figures = p.getParent().getChildren().iterator();
		while (figures.hasNext()) {
			IFigure f = (IFigure) figures.next();
			IGraphicalEditPart part = (IGraphicalEditPart) registry.get(f);
			if (part instanceof ResizableCompartmentEditPart) {
				double r = NULL_CONSTRAINT;
				if (f.isVisible()) {
					int height = transposer.t(f.getSize()).height;
					if (f == p)
						r = (height + heightDelta) / parentHeight;
					else if (f == a)
						r = (height - heightDelta) / parentHeight;
					else
						r = height / parentHeight;
				}
				cmc.compose(new SetCompartmentRatioCommand(new EObjectAdapter((View)part.getModel()), r));
			}
		}
		return new EtoolsProxyCommand(cmc);
	}

	/**
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#createAddCommand(org.eclipse.gef.EditPart, java.lang.Object)
	 */
	protected Command createAddCommand(EditPart child, Object constraint) {
		return null;
	}

	/**
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#createChangeConstraintCommand(org.eclipse.gef.EditPart, java.lang.Object)
	 */
	protected Command createChangeConstraintCommand(
		EditPart child,
		Object constraint) {
		return null;
	}

	/**
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#getConstraintFor(org.eclipse.draw2d.geometry.Point)
	 */
	protected Object getConstraintFor(Point point) {
		return null;
	}

	/**
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#getConstraintFor(org.eclipse.draw2d.geometry.Rectangle)
	 */
	protected Object getConstraintFor(Rectangle rect) {
		return null;
	}

	/**
	 * @see org.eclipse.gef.editpolicies.LayoutEditPolicy#getCreateCommand(org.eclipse.gef.requests.CreateRequest)
	 */
	protected Command getCreateCommand(CreateRequest request) {
		return null;
	}

	/**
	 * @see org.eclipse.gef.editpolicies.LayoutEditPolicy#getDeleteDependantCommand(org.eclipse.gef.Request)
	 */
	protected Command getDeleteDependantCommand(Request request) {
		return null;
	}

}