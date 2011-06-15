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
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.lite.services.IViewDecorator;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Command to create a notational node within a given parent. 
 * @author bblajer
 */
public class CreateNotationalNodeCommand extends CreateNotationalElementCommand {
	public final Command myExposeCommand;

	public CreateNotationalNodeCommand(View parent, EObject domainElement, Rectangle constraint, IViewDecorator decorator) {
		this(parent, domainElement, constraint, decorator, true);
	}
	/**
	 * Creates a command that, upon execution, will create a notational node as a child of the given parent view
	 * to represent the given domain element.
	 * The created node will be assigned the <code>Bounds</code> layout constraint with bounds taken from the given constraint
	 * parameter. The node will be decorated with the given {@link IViewDecorator}.
	 * The node will be optionally made visible by expanding the parent's {@link DrawerStyle}, if one is present. 
	 * @param parent
	 * @param domainElement
	 * @param constraint
	 * @param decorator
	 * @param expose
	 */
	public CreateNotationalNodeCommand(View parent, EObject domainElement, Rectangle constraint, IViewDecorator decorator, boolean expose) {
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
		if (expose) {
			myExposeCommand = new ExpandDrawerCommand(parent);
		} else {
			myExposeCommand = null;
		}
	}

	protected boolean prepare() {
		if (getCreatedView() instanceof Node == false) {
			return false;
		}
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(getParent());
		if (domain != null && domain.isReadOnly(getParent().eResource())) {
			return false;
		}
		if (myExposeCommand != null && !myExposeCommand.canExecute()) {
			return false;
		}
		return true;
	}

	public boolean canUndo() {
		if (myExposeCommand != null && !myExposeCommand.canUndo()) {
			return false;
		}
		return true;
	}

	public void execute() {
		if (myExposeCommand != null) {
			myExposeCommand.execute();
		}
		getParent().insertChild(getCreatedView());
	}

	public void undo() {
		getParent().removeChild(getCreatedView());
		if (myExposeCommand != null) {
			myExposeCommand.undo();
		}
	}

	public void redo() {
		execute();
	}
}
