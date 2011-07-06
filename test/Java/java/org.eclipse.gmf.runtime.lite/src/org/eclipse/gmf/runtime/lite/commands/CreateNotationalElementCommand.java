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
import org.eclipse.gmf.runtime.notation.View;

public abstract class CreateNotationalElementCommand extends AbstractCommand {
	private final View parent;
	private View createdView;

	public CreateNotationalElementCommand(View parent) {
		this.parent = parent;
	}

	protected void setCreatedView(View createdView) {
		this.createdView = createdView;
	}

	public View getCreatedView() {
		return createdView;
	}

	protected final View getParent() {
		return parent;
	}
}
