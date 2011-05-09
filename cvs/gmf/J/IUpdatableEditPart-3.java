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
package org.eclipse.gmf.runtime.lite.edit.parts.update;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IUpdatableEditPart {
	public Refresher getRefresher(EStructuralFeature feature, Notification msg);

	public interface Refresher {
		public void refresh();
	}

	public class CompositeRefresher implements Refresher {
		public void addRefresher(Refresher refresher) {
			refreshers.add(refresher);
		}

		public void removeRefresher(Refresher refresher) {
			refreshers.remove(refresher);
		}

		public void refresh() {
			for(Refresher next : refreshers) {
				next.refresh();
			}
		}

		private Collection<Refresher> refreshers = new ArrayList<Refresher>();
	}
}
