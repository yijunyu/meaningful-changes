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
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.internal.runtime.lite.Activator;

/**
 * Abstract command that wraps a EMF command and is a GEF command.
 */
public abstract class AbstractWrappingCommand extends Command {
	private final TransactionalEditingDomain myEditingDomain;

	public AbstractWrappingCommand(TransactionalEditingDomain editingDomain) {
		myEditingDomain = editingDomain;
	}

	public void execute() {
		try {
			getOperation().execute(new NullProgressMonitor(), null);
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
		AbstractEMFOperation canExecute = new AbstractEMFOperation(myEditingDomain, "canExecute") {
			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				result[0] = getOperation().canExecute();
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
			getOperation().undo(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			Activator.getDefault().logError("exception occurred while undoing operation", e);
		}
	}

	public boolean canUndo() {
		return getOperation().canUndo();
	}

	public void redo() {
		try {
			getOperation().redo(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			Activator.getDefault().logError("exception occurred while redoing operation", e);
		}
	}

	@Override
	public void dispose() {
		getOperation().dispose();
		super.dispose();
	}

	protected final TransactionalEditingDomain getEditingDomain() {
		return myEditingDomain;
	}

	protected abstract IUndoableOperation getOperation();
}
