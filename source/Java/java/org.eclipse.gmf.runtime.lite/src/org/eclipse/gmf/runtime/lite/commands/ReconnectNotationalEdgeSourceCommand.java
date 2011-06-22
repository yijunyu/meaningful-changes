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

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

public class ReconnectNotationalEdgeSourceCommand extends AbstractCommand {
	private final Edge edge;
	private final View newSource;
	private View oldSource;

	public ReconnectNotationalEdgeSourceCommand(Edge edge, View newSource) {
		this.edge = edge;
		this.newSource = newSource;
	}

	protected boolean prepare() {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(edge);
		if (domain != null && domain.isReadOnly(edge.eResource())) {
			return false;
		}
		return newSource != null;
	}

	public boolean canUndo() {
		return oldSource != null;
	}

	public void execute() {
		oldSource = edge.getSource();
		edge.setSource(newSource);
	}

	public void redo() {
		execute();
	}

	public void undo() {
		edge.setSource(oldSource);
		oldSource = null;
	}
}
