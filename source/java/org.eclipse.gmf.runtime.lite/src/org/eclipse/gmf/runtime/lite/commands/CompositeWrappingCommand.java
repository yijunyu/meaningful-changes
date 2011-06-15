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
import org.eclipse.core.commands.operations.AbstractOperation;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.CompositeEMFOperation;
import org.eclipse.emf.workspace.EMFCommandOperation;
import org.eclipse.gef.commands.Command;

/**
 * GEF Command that wraps an unlimited number of EMF Commands that should be executed 
 * in a context of one transaction.
 */
public class CompositeWrappingCommand extends AbstractWrappingCommand {
	private final CompositeEMFOperation myOperation;

	public CompositeWrappingCommand(TransactionalEditingDomain domain, String label) {
		super(domain);
		myOperation = new CompositeEMFOperation(domain, label);
		myOperation.setTransactionNestingEnabled(false);
	}

	public void add(org.eclipse.emf.common.command.Command command) {
		myOperation.add(new EMFCommandOperation(getEditingDomain(), command));
	}

	/**
	 * Adds a GEF command. If the command is a wrapper command for an EMF command, it will be executed in
	 * the same transaction context.
	 */
	public void add(final Command command) {
		if (command instanceof AbstractWrappingCommand) {
			AbstractWrappingCommand wrappingCommand = (AbstractWrappingCommand) command;
			myOperation.add(wrappingCommand.getOperation());
		} else {
			myOperation.add(new AbstractOperation(command.getLabel()) {
				@Override
				public IStatus undo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					if (monitor != null) {
						monitor.beginTask(command.getLabel(), 1);
					}
					try {
						command.undo();
					} finally {
						if (monitor != null) {
							monitor.done();
						}
					}
					return Status.OK_STATUS;
				}
				@Override
				public IStatus redo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					if (monitor != null) {
						monitor.beginTask(command.getLabel(), 1);
					}
					try {
						command.redo();
					} finally {
						if (monitor != null) {
							monitor.done();
						}
					}
					return Status.OK_STATUS;
				}
				@Override
				public IStatus execute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					if (monitor != null) {
						monitor.beginTask(command.getLabel(), 1);
					}
					try {
						command.execute();
					} finally {
						if (monitor != null) {
							monitor.done();
						}
					}
					return Status.OK_STATUS;
				}
				@Override
				public void dispose() {
					command.undo();
					super.dispose();
				}
				@Override
				public boolean canUndo() {
					return command.canUndo();
				}
				@Override
				public boolean canRedo() {
					return command.canExecute();
				}
				@Override
				public boolean canExecute() {
					return command.canExecute();
				}
			});
		}
	}

	@Override
	protected IUndoableOperation getOperation() {
		return myOperation;
	}
}
