/**
 * Copyright (c) 2007 Borland Software Corp.
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

import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;

/**
 * Edit policy for use with edit parts with list layout generated with the lite runtime.
 * @author bblajer
 */
public abstract class ListLayoutEditPolicy extends ConstrainedLayoutEditPolicy {
	/**
	 * Overrides <code>getCloneCommand()</code> to generate the proper constraint for each child
	 * being cloned. Once the constraint is calculated, {@link
	 * #createCloneCommand(EditPart,Object)} is called. Subclasses must implement this method.
	 * The logic of this method is taken from {@link ConstrainedLayoutEditPolicy#getAddCommand(Request)}.
	 * @see org.eclipse.gef.editpolicies.LayoutEditPolicy#getCloneCommand(Request)
	 */
	protected Command getCloneCommand(ChangeBoundsRequest request) {
		List<?> editParts = request.getEditParts();
		org.eclipse.gef.commands.CompoundCommand command = new org.eclipse.gef.commands.CompoundCommand();
		command.setDebugLabel("Clone in ListLayoutEditPolicy");//$NON-NLS-1$
		GraphicalEditPart childPart;
		Rectangle r;
		Object constraint;

		for (int i = 0; i < editParts.size(); i++) {
			childPart = (GraphicalEditPart) editParts.get(i);
			r = childPart.getFigure().getBounds().getCopy();
			//convert r to absolute from childpart figure
			childPart.getFigure().translateToAbsolute(r);
			r = request.getTransformedRectangle(r);
			//convert this figure to relative 
			getLayoutContainer().translateToRelative(r);
			getLayoutContainer().translateFromParent(r);
			r.translate(getLayoutOrigin().getNegated());
			constraint = getConstraintFor(r);
			command.add(createCloneCommand(childPart,
					translateToModelConstraint(constraint)));
		}
		return command.unwrap();
	}

	protected Command createCloneCommand(EditPart child, Object constraint) {
		return null;
	}

	@Override
	protected Command createChangeConstraintCommand(EditPart child, Object constraint) {
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Object getConstraintFor(Point point) {
		return null;
	}

	@Override
	protected Object getConstraintFor(Rectangle rect) {
		return null;
	}

	@Override
	protected EditPolicy createChildEditPolicy(EditPart child) {
		EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		if (result != null) {
			return result;
		}
		return super.createChildEditPolicy(child);
	}
}
