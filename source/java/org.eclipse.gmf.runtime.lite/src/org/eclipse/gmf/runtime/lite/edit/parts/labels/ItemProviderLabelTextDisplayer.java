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
package org.eclipse.gmf.runtime.lite.edit.parts.labels;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

/**
 * Label text displayer that displays the text as provided by the <code>IItemLabelProvider</code>.
 * The label is not editable.
 */
public class ItemProviderLabelTextDisplayer extends AbstractLabelTextDisplayer {
	private final AdapterFactory myAdapterFactory;

	public ItemProviderLabelTextDisplayer(AdapterFactory adapterFactory) {
		myAdapterFactory = adapterFactory;
	}

	public String getDisplayText(EObject source) {
		if (source == null) {
			return "";
		}
		IItemLabelProvider labelProvider = (IItemLabelProvider) myAdapterFactory.adapt(source, IItemLabelProvider.class);
		if (labelProvider != null) {
			return labelProvider.getText(source);
		}
		return "";
	}

	public boolean isAffectingEvent(Notification notification) {
		if (notification == null || notification.isTouch()) {
			return false;
		}
		return true;
	}
}
