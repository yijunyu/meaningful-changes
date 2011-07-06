/**
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.commands;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;

public class ChangeBoundsCommand extends AbstractCommand {
	private final Node myNode;
	private final ChangeBoundsRequest myRequest;
	private final IFigure myReferenceFigure;

	private Point myMoveDelta;
	private Dimension myResizeDelta;

	public ChangeBoundsCommand(Node node, ChangeBoundsRequest request, IFigure figure) {
		super("Change node position/size");
		myNode = node;
		myRequest = request;
		myReferenceFigure = figure;
	}

	public boolean canUndo() {
		return canExecute();
	}

	protected boolean prepare() {
		if (myNode.getLayoutConstraint() instanceof Bounds == false) {
			return false;
		}
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(myNode);
		if (domain != null && domain.isReadOnly(myNode.eResource())) {
			return false;
		}
		Bounds bounds = (Bounds) myNode.getLayoutConstraint();
		Rectangle original = new Rectangle(bounds.getX(),
				bounds.getY(), bounds.getWidth(), bounds.getHeight());
		myReferenceFigure.translateToAbsolute(original);
		Rectangle transformed = myRequest.getTransformedRectangle(original);
		myReferenceFigure.translateToRelative(transformed);
		myReferenceFigure.translateToRelative(original);
		myResizeDelta = transformed.getSize().expand(
				original.getSize().negate());
		myMoveDelta = transformed.getTopLeft().translate(
				original.getTopLeft().negate());
		return true;
	}

	public void undo() {
		execute(myMoveDelta.getNegated(), myResizeDelta.getNegated());
	}

	public void execute() {
		execute(myMoveDelta, myResizeDelta);
	}

	public void redo() {
		execute();
	}

	private void execute(Point move, Dimension resize) {
		Bounds bounds = (Bounds) myNode.getLayoutConstraint();
		bounds.setX(bounds.getX() + move.x);
		bounds.setY(bounds.getY() + move.y);
		bounds.setWidth(bounds.getWidth() + resize.width);
		bounds.setHeight(bounds.getHeight() + resize.height);
	}
}
