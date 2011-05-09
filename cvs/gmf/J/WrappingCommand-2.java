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

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.EMFCommandOperation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.internal.runtime.lite.Activator;

public class WrappingCommand extends Command {
	private final IUndoableOperation operation;

	public WrappingCommand(TransactionalEditingDomain editingDomain,
			org.eclipse.emf.common.command.Command emfCommand) {
		this.operation = new EMFCommandOperation(editingDomain, emfCommand);
	}

	public void execute() {
		try {
			operation.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			Activator.getDefault().logError("exception occurred while executing operation", e);
		}
	}

	public boolean canExecute() {
		return operation.canExecute();
	}

	public void undo() {
		try {
			operation.undo(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			Activator.getDefault().logError("exception occurred while undoing operation", e);
		}
	}

	public boolean canUndo() {
		return operation.canUndo();
	}

	public void redo() {
		try {
			operation.redo(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			Activator.getDefault().logError("exception occurred while redoing operation", e);
		}
	}
}
