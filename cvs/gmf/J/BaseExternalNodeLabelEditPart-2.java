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

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public abstract class BaseExternalNodeLabelEditPart extends AbstractGraphicalEditPart {
	public BaseExternalNodeLabelEditPart(org.eclipse.gmf.runtime.notation.View view) {
		setModel(view);
	}

	public void refreshBounds() {
		org.eclipse.gmf.runtime.notation.Node node = (org.eclipse.gmf.runtime.notation.Node) getModel();
		if (node.getLayoutConstraint() == null) {
			return;
		}
		assert node.getLayoutConstraint() instanceof org.eclipse.gmf.runtime.notation.Location;
		final org.eclipse.gmf.runtime.notation.Location location = (org.eclipse.gmf.runtime.notation.Location) node.getLayoutConstraint();
		getFigure().getParent().setConstraint(getFigure(), new org.eclipse.draw2d.AbstractLocator() {
			protected org.eclipse.draw2d.geometry.Point getReferencePoint() {
				return getLabelLocation(((org.eclipse.gef.GraphicalEditPart) getParent()).getFigure()).translate(location.getX(), location.getY());
			}
			public int getRelativePosition() {
				return org.eclipse.draw2d.PositionConstants.SOUTH;
			}
		});
	}

	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshBounds();
	}

	protected org.eclipse.gmf.runtime.lite.edit.parts.update.IUpdatableEditPart.Refresher boundsRefresher = new org.eclipse.gmf.runtime.lite.edit.parts.update.IUpdatableEditPart.Refresher() {
		public void refresh() {
			refreshBounds();
		}
	};

	public org.eclipse.draw2d.geometry.Point getReferencePoint() {
		return getLabelLocation(((org.eclipse.gef.GraphicalEditPart) getParent()).getFigure());
	}

	protected org.eclipse.draw2d.geometry.Point getLabelLocation(org.eclipse.draw2d.IFigure parent) {
		org.eclipse.draw2d.geometry.Point result = parent.getBounds().getBottom();
		parent.translateToAbsolute(result);
		return result;
	}
}
