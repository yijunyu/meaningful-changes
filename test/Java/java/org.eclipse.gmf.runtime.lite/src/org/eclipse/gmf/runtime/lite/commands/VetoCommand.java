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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;

/**
 * Command that, if can be executed, does nothing.  
 * @author bblajer
 */
public abstract class VetoCommand extends CommandWrapper {
	public VetoCommand() {
		super();
	}

	public VetoCommand(String label) {
		super(label);
	}

	public VetoCommand(String label, String description) {
		super(label, description);
	}

	@Override
	protected Command createCommand() {
		return shouldExecute() ? IdentityCommand.INSTANCE : UnexecutableCommand.INSTANCE;
	}

	protected abstract boolean shouldExecute();
}
