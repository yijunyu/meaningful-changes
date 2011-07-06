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
package org.eclipse.gmf.runtime.lite.edit.parts.update;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Default implementation of {@link IUpdatableEditPart.ComposeableRefresher}. 
 */
class ComposeableRefresherImpl implements IUpdatableEditPart.ComposeableRefresher {
	private final Collection<IUpdatableEditPart.Refresher> myRefreshers;
	public ComposeableRefresherImpl() {
		myRefreshers = new HashSet<IUpdatableEditPart.Refresher>();
	}
	public ComposeableRefresherImpl(Collection<IUpdatableEditPart.Refresher> refreshers) {
		myRefreshers = refreshers;
	}
	public void addRefresher(IUpdatableEditPart.Refresher refresher) {
		if (refresher == null) {
			return;
		}
		if (refresher instanceof IUpdatableEditPart.ComposeableRefresher) {
			for (IUpdatableEditPart.Refresher next : ((IUpdatableEditPart.ComposeableRefresher) refresher)) {
				addRefresher(next);
			}
		} else {
			myRefreshers.add(refresher);
		}
	}
	public Iterator<IUpdatableEditPart.Refresher> iterator() {
		return myRefreshers.iterator();
	}

	public void refresh() {
		for (IUpdatableEditPart.Refresher next : myRefreshers) {
			next.refresh();
		}
	}
}
