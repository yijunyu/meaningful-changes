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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.lite.services.IViewDecorator;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;


public class CreateNotationalEdgeCommand extends CreateNotationalElementCommand {
	private final View source;
	private final View target;

	public CreateNotationalEdgeCommand(Diagram parent, EObject domainElement, View source, View target, IViewDecorator decorator) {
		super(parent);
		this.source = source;
		this.target = target;
		Edge edge = NotationFactory.eINSTANCE.createEdge();
		edge.setElement(domainElement);
		decorator.decorateView(edge);
		setCreatedView(edge);
	}

	protected boolean prepare() {
		if (getParent() == null || getCreatedView() == null || source == null || target == null) {
			return false;
		}
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(getParent());
		if (domain != null && domain.isReadOnly(getParent().eResource())) {
			return false;
		}
		return true;
	}

	public boolean canUndo() {
		return true;
	}

	public void execute() {
		Edge createdEdge = (Edge) getCreatedView();
		((Diagram) getParent()).insertEdge(createdEdge);
		createdEdge.setSource(source);
		createdEdge.setTarget(target);
	}

	public void undo() {
		Edge createdEdge = (Edge) getCreatedView();
		((Diagram) getParent()).removeEdge(createdEdge);
		createdEdge.setSource(null);
		createdEdge.setTarget(null);
	}

	public void redo() {
		execute();
	}
}
