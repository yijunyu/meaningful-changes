/**
 * Copyright (c) 2006 Eclipse.org
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.lite.services.IViewDecorator;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;

public class CreateNotationalNodeCommand extends CreateNotationalElementCommand {
	public CreateNotationalNodeCommand(View parent, EObject domainElement, Rectangle constraint, IViewDecorator decorator) {
		super(parent);
		Node createdNode = NotationFactory.eINSTANCE.createNode();
		setCreatedView(createdNode);
		createdNode.setElement(domainElement);
		decorator.decorateView(createdNode);
		if (constraint != null) {
			Bounds bounds = NotationFactory.eINSTANCE.createBounds();
			createdNode.setLayoutConstraint(bounds);
			bounds.setX(constraint.x);
			bounds.setY(constraint.y);
			bounds.setWidth(constraint.width);
			bounds.setHeight(constraint.height);
		}
	}

	public boolean canExecute() {
		return getCreatedView() instanceof Node;
	}

	public boolean canUndo() {
		return true;
	}

	public void execute() {
		getParent().insertChild(getCreatedView());
	}

	public void undo() {
		getParent().removeChild(getCreatedView());
	}

	public void redo() {
		execute();
	}
}