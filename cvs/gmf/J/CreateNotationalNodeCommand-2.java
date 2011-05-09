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

import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

public class CreateNotationalNodeCommand extends CreateNotationalElementCommand {
	public CreateNotationalNodeCommand(View parent) {
		super(parent);
	}

	public boolean canExecute() {
		return getCreatedView() instanceof Node;
	}

	public boolean canUndo() {
		return true;
	}

	public void execute() {
		getParent().insertChild(getCreatedView());
	}

	public void undo() {
		getParent().removeChild(getCreatedView());
	}

	public void redo() {
		execute();
	}
}
