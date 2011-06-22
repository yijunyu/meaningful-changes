/**
 * Copyright (c) 2008 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.edit.polocies;

import java.util.Iterator;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.LayoutHelper;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;

public abstract class AbstractDomainBasedXYLayoutEditPolicy extends XYLayoutEditPolicy {

	private IMapMode myMapMode;

	public AbstractDomainBasedXYLayoutEditPolicy(IMapMode mapMode) {
		assert mapMode != null;
		myMapMode = mapMode;
	}

	protected IMapMode getMapMode() {
		return myMapMode;
	}

	@Override
	protected org.eclipse.draw2d.geometry.Point getLayoutOrigin() {
		return ((GraphicalEditPart) getHost()).getContentPane().getClientArea().getLocation();
	}

	@Override
	protected Rectangle getCurrentConstraintFor(org.eclipse.gef.GraphicalEditPart child) {
		IFigure fig = child.getFigure();
		Object constraint = fig.getParent().getLayoutManager().getConstraint(fig);
		if (constraint instanceof Rectangle) {
			return (Rectangle) constraint;
		}
		return fig.getBounds().getCopy();
	}

	@Override
	protected Command createAddCommand(EditPart child, Object constraint) {
		if (child instanceof IGraphicalEditPart && constraint instanceof Rectangle) {
			return createSetBoundsCommand((IGraphicalEditPart) child, (Rectangle) constraint);
		}
		return null;
	}

	@Override
	protected Command createChangeConstraintCommand(EditPart child, Object constraint) {
		if (child instanceof IGraphicalEditPart && constraint instanceof Rectangle) {
			Command setBoundsCommand = createSetBoundsCommand((IGraphicalEditPart) child, (Rectangle) constraint);
			if (setBoundsCommand != null) {
				return setBoundsCommand;
			}
		}
		return new Command() {
		};
	}

	protected Command createSetBoundsCommand(IGraphicalEditPart editPart, Rectangle bounds) {
		View view = editPart.getNotationView();
		EObject element = view.getElement();
		ICommand setBoundsCommand = createSetBoundsCommand(editPart.getEditingDomain(), DiagramUIMessages.SetLocationCommand_Label_Resize, view.eResource(), bounds, element);
		if (setBoundsCommand != null) {
			return new ICommandProxy(setBoundsCommand);
		}
		return null;
	}

	/**
	 * This method will be called as a part of CanonicalUpdate, so we should not
	 * reset size/location for such elements. Skipping LayoutHelper.UNDEFINED
	 * location passed inside CreateRequest to handle this situation correctly.
	 */
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		if (request instanceof CreateViewRequest && getHost() instanceof IGraphicalEditPart && !LayoutHelper.UNDEFINED.getLocation().equals(request.getLocation())) {
			CreateViewRequest req = (CreateViewRequest) request;
			IGraphicalEditPart host = (IGraphicalEditPart) getHost();

			TransactionalEditingDomain editingDomain = host.getEditingDomain();
			CompositeTransactionalCommand cc = new CompositeTransactionalCommand(editingDomain, DiagramUIMessages.AddCommand_Label);

			Iterator iter = req.getViewDescriptors().iterator();
			final Rectangle BOUNDS = (Rectangle) getConstraintFor(request);
			while (iter.hasNext()) {
				CreateViewRequest.ViewDescriptor viewDescriptor = (CreateViewRequest.ViewDescriptor) iter.next();
				Rectangle rect = getBoundsOffest(req, BOUNDS, viewDescriptor);
				cc.compose(createSetBoundsCommand(editingDomain, DiagramUIMessages.SetLocationCommand_Label_Resize, host.getNotationView().eResource(), viewDescriptor, rect));
			}

			if (cc.reduce() == null)
				return null;

			return chainGuideAttachmentCommands(request, new ICommandProxy(cc.reduce()));

		}
		return null;
	}

	protected abstract ICommand createSetBoundsCommand(TransactionalEditingDomain editingDomain, String label, Resource resource, CreateViewRequest.ViewDescriptor viewDescriptor, Rectangle rect);

	protected abstract ICommand createSetBoundsCommand(TransactionalEditingDomain editingDomain, String label, Resource resource, Rectangle bounds, EObject element);

}
