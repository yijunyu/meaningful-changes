/*
 * Copyright (c) 2008 Borland Software Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.sheet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Mediator to filter specific changes of the object it is attached to.
 * 
 * Note, this tracker dispatches notification only when attached to a target
 * EObject which is compatible with features being tracked (feature's owning
 * meta-class should be the same or superclass of target's meta-class. 
 * 
 * @author artem
 */
public final class FeatureTracker extends AdapterImpl {
	private final EStructuralFeature[] myFeatures;
	private final ChangeTracker myListener;

	public FeatureTracker(ChangeTracker listener, EStructuralFeature... features) {
		assert listener != null && features != null;
		myListener = listener;
		myFeatures = features;
	}

	@Override
	public void setTarget(Notifier newTarget) {
		if (newTarget instanceof EObject) {
			EClass metaClass = ((EObject) newTarget).eClass();
			for (EStructuralFeature sf : myFeatures) {
				if (sf.getEContainingClass().isSuperTypeOf(metaClass)) {
					super.setTarget(newTarget);
					break;
				}
			}
			return;
		}
		super.setTarget(newTarget);
	}

	@Override
	public void notifyChanged(Notification msg) {
		if (msg.isTouch()) {
			return;
		}
		for (EStructuralFeature sf : myFeatures) {
			if (sf.equals(msg.getFeature())) {
				myListener.modelChanged(msg);
				break;
			}
		}
	}
}
