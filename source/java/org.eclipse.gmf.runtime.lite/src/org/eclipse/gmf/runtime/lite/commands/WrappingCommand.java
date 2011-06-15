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

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.EMFCommandOperation;

public class WrappingCommand extends AbstractWrappingCommand {
	private final EMFCommandOperation operation;

	public WrappingCommand(TransactionalEditingDomain editingDomain,
			org.eclipse.emf.common.command.Command emfCommand) {
		super(editingDomain);
		this.operation = new EMFCommandOperation(editingDomain, emfCommand);
	}

	public org.eclipse.emf.common.command.Command getEMFCommand() {
		return operation.getCommand();
	}

	@Override
	protected IUndoableOperation getOperation() {
		return operation;
	}
}
