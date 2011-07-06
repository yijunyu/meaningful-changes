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
package org.eclipse.gmf.runtime.lite.edit.parts.labels;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.Node;

public abstract class BaseLinkLabelEditPart extends BaseExternalLabelEditPart {
	public BaseLinkLabelEditPart(View view) {
		super(view);
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
	}

	protected void refreshBounds() {
		Node node = (Node) getModel();
		assert node.getLayoutConstraint() instanceof Location;
		final Location location = (Location) node.getLayoutConstraint();
		GraphicalEditPart parent = (GraphicalEditPart) getParent();
		Connection connection = (Connection) parent.getFigure();
		parent.setLayoutConstraint(this, getFigure(), new org.eclipse.draw2d.ConnectionLocator(connection, getAlignment()) {
			protected org.eclipse.draw2d.geometry.Point getReferencePoint() {
				return super.getReferencePoint().translate(location.getX(), location.getY());
			}
		});
	}

	protected abstract int getAlignment();
}
