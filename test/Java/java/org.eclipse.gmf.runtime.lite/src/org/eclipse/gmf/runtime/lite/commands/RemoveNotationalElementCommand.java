/**
 * Copyright (c) 2006 Borland Software Corporation
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

import java.util.Iterator;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

public class RemoveNotationalElementCommand extends AbstractCommand {
	private final View childView;
	private final View parentView;
	private EObject domainElement;
	private CompoundCommand removeEdgeCommands;

	public RemoveNotationalElementCommand(View parentView, View childView) {
		this.parentView = parentView;
		this.childView = childView;
	}

	protected boolean prepare() {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(getParent());
		if (domain != null && domain.isReadOnly(getParent().eResource())) {
			return false;
		}
		if (!parentView.getChildren().contains(childView)) {
			return false;
		}
		removeEdgeCommands = new CompoundCommand();
		for(Iterator it = childView.getSourceEdges().iterator(); it.hasNext(); ) {
			Edge next = (Edge) it.next();
			removeEdgeCommands.append(new RemoveNotationalEdgeCommand(childView.getDiagram(), next));
		}
		for(Iterator it = childView.getTargetEdges().iterator(); it.hasNext(); ) {
			Edge next = (Edge) it.next();
			removeEdgeCommands.append(new RemoveNotationalEdgeCommand(childView.getDiagram(), next));
		}
		if (removeEdgeCommands.isEmpty()) {
			return true;
		}
		return removeEdgeCommands.canExecute();
	}

	public boolean canUndo() {
		return true;
	}

	public void execute() {
		parentView.removeChild(childView);
		if (!removeEdgeCommands.isEmpty()) {
			removeEdgeCommands.execute();
		}
		sweepElement();
	}

	protected void sweepElement() {
		if (childView.isSetElement()) {
			domainElement = childView.getElement();
			childView.setElement(null);
		}
	}

	public void redo() {
		execute();
	}

	public void undo() {
		restoreElement();
		removeEdgeCommands.undo();
		parentView.insertChild(childView);
	}

	protected void restoreElement() {
		if (childView.isSetElement()) {
			childView.setElement(domainElement);
		}
	}

	protected final View getChildView() {
		return childView;
	}

	protected final View getParent() {
		return parentView;
	}
}
