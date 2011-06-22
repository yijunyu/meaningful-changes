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
package org.eclipse.gmf.runtime.lite.parts;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.gef.commands.CommandStack;

public class CommandStackAdapterManager extends AdapterImpl {
	@Override
	public boolean isAdapterForType(Object type) {
		return CommandStackAdapterManager.class.equals(type);
	}

	public CommandStack getCommandStack() {
		if (myCommandStack == null) {
			myCommandStack = new CommandStack();
		}
		return myCommandStack;
	}

	public void acquire() {
		myRefCount++;
	}

	public void release() {
		if (myRefCount == 0) {
			throw new IllegalStateException();
		}
		myRefCount--;
		if (myRefCount == 0) {
			myCommandStack.dispose();
			myCommandStack = null;
		}
	}

	public boolean isReleased() {
		return myRefCount == 0;
	}

	private CommandStack myCommandStack;
	private int myRefCount;
}