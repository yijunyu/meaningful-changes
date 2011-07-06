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

import org.eclipse.emf.common.notify.Notification;

public interface IExternallyUpdatableEditPart extends IUpdatableEditPart {
	public Collection<ExternalRefresher> getExternalRefreshers();

	public interface ExternalRefresher extends Refresher {
		public boolean isAffectingEvent(Notification msg);
	}
}
