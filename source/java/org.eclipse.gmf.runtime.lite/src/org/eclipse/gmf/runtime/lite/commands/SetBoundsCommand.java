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

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;

/**
 * @author bblajer
 */
public class SetBoundsCommand extends AbstractCommand {
	private final Node myNode;
	private final Rectangle myBounds;

	private Rectangle myOldBounds;

	public SetBoundsCommand(Node node, Rectangle bounds) {
		super("Set node position/size");
		myNode = node;
		myBounds = bounds;
	}

	public boolean canUndo() {
		return true;
	}

	protected boolean prepare() {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(myNode);
		if (domain != null && domain.isReadOnly(myNode.eResource())) {
			return false;
		}
		if (myNode.getLayoutConstraint() == null) {
			myOldBounds = null;
			return true;
		} else if (myNode.getLayoutConstraint() instanceof Bounds == false) {
			return false;
		}
		Bounds bounds = (Bounds) myNode.getLayoutConstraint();
		myOldBounds = new Rectangle(bounds.getX(),
				bounds.getY(), bounds.getWidth(), bounds.getHeight());
		return true;
	}

	public void redo() {
		execute();
	}

	public void execute() {
		execute(myBounds);
	}

	@Override
	public void undo() {
		execute(myOldBounds);
	}

	private void execute(Rectangle rect) {
		if (rect == null) {
			myNode.setLayoutConstraint(null);
			return;
		}
		Bounds bounds = (Bounds) myNode.getLayoutConstraint();
		if (bounds == null) {
			bounds = NotationFactory.eINSTANCE.createBounds();
			myNode.setLayoutConstraint(bounds);
		}
		bounds.setX(rect.x);
		bounds.setY(rect.y);
		bounds.setWidth(rect.width);
		bounds.setHeight(rect.height);
	}
}
