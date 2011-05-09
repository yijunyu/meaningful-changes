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
package org.eclipse.gmf.runtime.lite.edit.parts.update;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EStructuralFeature;

public class RefreshAdapter extends AdapterImpl {
	private final IUpdatableEditPart myHost;

	public RefreshAdapter(IUpdatableEditPart editPart) {
		myHost = editPart;
	}

	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);
		if (msg.isTouch()) {
			return;
		}
		IUpdatableEditPart.Refresher refresher = myHost.getRefresher((EStructuralFeature) msg.getFeature(), msg);
		if (refresher != null) {
			refresher.refresh();
		}
	}
}
