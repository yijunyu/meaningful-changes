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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Registry that allows registering and unregistering refreshers. Refreshers are classified primarily based on
 * structural features they are registered for (because this seems to be the most typical case), but further filtering is supported.
 * @see IUpdatableEditPart.Refresher
 */
public class RefreshersRegistry {
	private HashMap<EStructuralFeature, CompositeConditionalRefresher> myFeature2Refreshers; 

	public void add(EStructuralFeature feature, IUpdatableEditPart.Refresher refresher) {
		if (refresher == null) {
			return;
		}
		get(feature, true).add(refresher);
	}

	public void remove(EStructuralFeature feature, IUpdatableEditPart.Refresher refresher) {
		if (refresher == null) {
			return;
		}
		CompositeConditionalRefresher compositeRefresher = get(feature, false);
		if (compositeRefresher == null) {
			return;
		}
		compositeRefresher.remove(refresher);
	}

	private CompositeConditionalRefresher get(EStructuralFeature feature, boolean createIfMissing) {
		if (myFeature2Refreshers == null) {
			if (!createIfMissing) {
				return null;
			}
			myFeature2Refreshers = new HashMap<EStructuralFeature, CompositeConditionalRefresher>();
		}
		CompositeConditionalRefresher result = myFeature2Refreshers.get(feature);
		if (result == null) {
			if (createIfMissing) {
				result = new CompositeConditionalRefresher();
				myFeature2Refreshers.put(feature, result);
			}
		}
		return result;
	}

	public IUpdatableEditPart.Refresher getRefresher(EStructuralFeature feature, Notification msg) {
		CompositeConditionalRefresher compositeRefresher = get(feature, false);
		if (compositeRefresher == null) {
			return null;
		}
		return compositeRefresher.getFiltered(msg);
	}

	private static class CompositeConditionalRefresher {
		private Collection<IUpdatableEditPart.Refresher> myRefreshers;

		public void add(IUpdatableEditPart.Refresher refresher) {
			if (refresher == null) {
				return;
			}
			if (myRefreshers == null) {
				myRefreshers = new LinkedList<IUpdatableEditPart.Refresher>();
			}
			myRefreshers.add(refresher);
		}
		public void remove(IUpdatableEditPart.Refresher refresher) {
			if (refresher == null || myRefreshers == null) {
				return;
			}
			myRefreshers.remove(refresher);
		}
		public IUpdatableEditPart.Refresher getFiltered(Notification msg) {
			if (myRefreshers == null) {
				return null;
			}
			Collection<IUpdatableEditPart.Refresher> result = new HashSet<IUpdatableEditPart.Refresher>();
			for(IUpdatableEditPart.Refresher next : myRefreshers) {
				if (isAffecting(next, msg)) {
					result.add(next);
				}
			}
			return new ComposeableRefresherImpl(result);
		}

		private boolean isAffecting(IUpdatableEditPart.Refresher refresher, Notification msg) {
			if (refresher instanceof IExternallyUpdatableEditPart.ExternalRefresher) {
				return ((IExternallyUpdatableEditPart.ExternalRefresher) refresher).isAffectingEvent(msg);
			}
			return true;
		}

		public void refresh() {
			if (myRefreshers == null) {
				return;
			}
			for (IUpdatableEditPart.Refresher next : myRefreshers) {
				next.refresh();
			}
		}
	}
}
