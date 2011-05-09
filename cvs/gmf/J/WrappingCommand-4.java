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

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.EMFCommandOperation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.internal.runtime.lite.Activator;

public class WrappingCommand extends Command {
	private final IUndoableOperation operation;
	private final TransactionalEditingDomain editingDomain;

	public WrappingCommand(TransactionalEditingDomain editingDomain,
			org.eclipse.emf.common.command.Command emfCommand) {
		this.operation = new EMFCommandOperation(editingDomain, emfCommand);
		this.editingDomain = editingDomain;
	}

	public void execute() {
		try {
			operation.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			Activator.getDefault().logError("exception occurred while executing operation", e);
		}
	}

	public boolean canExecute() {
		/*
		 * Some commands (see StrictCompoundCommand) require read-write transaction to test for executability. 
		 * When they fail, the RollbackException is consumed, and the command is not rolled back, thus leaving the model in a modified state.
		 */
		final boolean[] result = new boolean[1];
		AbstractEMFOperation canExecute = new AbstractEMFOperation(editingDomain, "canExecute") {
			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				result[0] = operation.canExecute();
				return Status.OK_STATUS;
			}
		};
		try {
			canExecute.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			Activator.getDefault().logError("exception occurred while testing executability of operation", e);
		}
		return result[0];
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

	@Override
	public void dispose() {
		operation.dispose();
		super.dispose();
	}
}
