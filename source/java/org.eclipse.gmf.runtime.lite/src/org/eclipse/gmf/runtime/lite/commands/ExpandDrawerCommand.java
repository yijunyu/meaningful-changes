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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Command that, upon execution, ensures that the compartment (or another view that has a {@link DrawerStyle) attached) is expanded.
 * @author bblajer
 */
public class ExpandDrawerCommand extends CommandWrapper { 
	private final Command myProxy;

	public ExpandDrawerCommand(View drawer) {
		DrawerStyle style = (DrawerStyle) drawer.getStyle(NotationPackage.eINSTANCE.getDrawerStyle());
		if (style == null) {
			myProxy = IdentityCommand.INSTANCE;
		} else {
			myProxy = SetCommand.create(TransactionUtil.getEditingDomain(style), style, NotationPackage.eINSTANCE.getDrawerStyle_Collapsed(), Boolean.FALSE);
		}
	}

	@Override
	protected Command createCommand() {
		return myProxy;
	}
}
