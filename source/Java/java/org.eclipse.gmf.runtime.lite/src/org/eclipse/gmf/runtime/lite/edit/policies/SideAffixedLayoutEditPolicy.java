/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.policies;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.lite.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.lite.figures.SideAffixedFeedbackPositioner;

/**
 * Edit policy that operates with side-affixed children. Assumes side-affixed children are laid out using {@link BorderItemLocator} as
 * a constraint.
 */
public abstract class SideAffixedLayoutEditPolicy extends XYLayoutEditPolicyEx {
	@Override
	protected Point getLayoutOrigin() {
		return getLayoutContainer().getClientArea().getLocation();
	}

	@Override
	protected Rectangle getCurrentConstraintFor(GraphicalEditPart child) {
		IFigure fig = child.getFigure();
		Object constraint = fig.getParent().getLayoutManager().getConstraint(fig);
		if (constraint == null) {
			return new Rectangle();
		}
		return ((BorderItemLocator) constraint).getModelConstraint();
	}

	@SuppressWarnings("unchecked")
	protected final SideAffixedFeedbackPositioner getSideAffixedElementPositionerForRequest(CreateRequest request) {
		SideAffixedFeedbackPositioner itemLocator = (SideAffixedFeedbackPositioner) request.getExtendedData().get(SideAffixedFeedbackPositioner.class);
		if (itemLocator == null) {
			itemLocator = createSideAffixedFeedbackPositioner(request);
		}
		request.getExtendedData().put(SideAffixedFeedbackPositioner.class, itemLocator);
		return itemLocator;
	}

	/**
	 * @param request
	 * @return
	 */
	protected SideAffixedFeedbackPositioner createSideAffixedFeedbackPositioner(CreateRequest request) {
		return new SideAffixedFeedbackPositioner((GraphicalEditPart) getHost());
	}

	@Override
	protected IFigure getLayoutContainer() {
		return getHostFigure();
	}

	@Override
	protected Object getConstraintFor(CreateRequest request) {
		Point location = request.getLocation();
		Dimension size = request.getSize();
		if (size == null || size.isEmpty()) {
			size = new Dimension(0, 0);
		}
		Rectangle rect = new Rectangle(location, size);
		getLayoutContainer().translateToRelative(rect);

		adjustConstraint(request, rect);

		getLayoutContainer().translateFromParent(rect);
		rect.translate(getLayoutOrigin().getNegated());
		return getConstraintFor(rect);
	}

	protected abstract void adjustConstraint(CreateRequest request, Rectangle rect);
}
