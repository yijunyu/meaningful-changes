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

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.gef.ui.actions.UpdateAction;

class UpdatableActionGroup {
	public void addAction(UpdateAction action) {
		assert action != null;
		myActions.add(action);
	}

	public void removeAction(UpdateAction action) {
		myActions.remove(action);
	}

	public void update() {
		for (Iterator<UpdateAction> it = myActions.iterator(); it.hasNext();) {
			UpdateAction next = it.next();
			next.update();
		}
	}

	private ArrayList<UpdateAction> myActions = new ArrayList<UpdateAction>();
}