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

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * Helper adapter that tracks specific feature of the notifier(s) it is 
 * attached to (with regular <code>objOfInterest.eAdapters().add(attachAdapter)</code> call)
 * and attaches/detaches provided adapter when feature value changes (set/unset, add/remove)
 * 
 * @author artem
 */
public final class AttachAdapter extends AdapterImpl {
	
	private final Adapter[] myAdapters;
	private final EReference myRef; // may add support for multiple references later
	private final ChangeTracker myTracker;

	/**
	 * Plain attaching/detaching adapter, with no additional change tracker.
	 * @see #AttachAdapter(EReference, ChangeTracker, Adapter...)
	 */
	public AttachAdapter(EReference reference, Adapter... attachAdapters) {
		this(reference, null, attachAdapters);
	}

	/**
	 * @param reference - feature to track, non-null, adapter's target expected to conform feature's container type 
	 * @param tracker - notified on feature change in addition to attached/detached adapters, may be null. 
	 * 		If specified, gets notification *after* adapters were attached/detached.
	 * @param attachAdapters - copy by reference, do not change initial array
	 */
	public AttachAdapter(EReference reference, ChangeTracker tracker, Adapter... attachAdapters) {
		assert attachAdapters != null;
		assert !Arrays.asList(attachAdapters).contains(null);
		assert reference != null;
		myAdapters = attachAdapters;
		myRef = reference;
		myTracker = tracker;
	}

	//
	// API ends
	//
	
	@Override
	public void setTarget(Notifier newTarget) {
		if (newTarget instanceof EObject) {
			final EObject eTarget = (EObject) newTarget;
			if (checkTarget(eTarget) && eTarget.eIsSet(myRef)) {
				Object value = eTarget.eGet(myRef, false);
				if (myRef.isMany() && value instanceof List) {
					for (Object o : (List<?>) value) {
						if (o instanceof EObject) {
							attachTo((EObject) o);
						}
					}
				} else if (value instanceof EObject) {
					attachTo((EObject) value);
				}
			}
		}
		super.setTarget(newTarget);
	}

	@Override
	public void unsetTarget(Notifier oldTarget) {
		if (oldTarget instanceof EObject) {
			final EObject eTarget = (EObject) oldTarget;
			if (checkTarget(eTarget) && eTarget.eIsSet(myRef)) {
				Object value = eTarget.eGet(myRef, false);
				if (myRef.isMany() && value instanceof List) {
					for (Object o : (List<?>) value) {
						if (o instanceof EObject) {
							detachFrom((EObject) o);
						}
					}
				} else if (value instanceof EObject) {
					detachFrom((EObject) value);
				}
			}
		}
		super.unsetTarget(oldTarget);
	}

	@Override
	public void notifyChanged(Notification msg) {
		if (msg.isTouch()) {
			return;
		}
		if (!myRef.equals(msg.getFeature())) {
			return;
		}
		switch (msg.getEventType()) {
		case Notification.ADD :
			// XXX since we do know it's a EReference, can't we just cast?
			if (msg.getNewValue() instanceof EObject) {
				attachTo((EObject) msg.getNewValue());
			} else {
				System.out.println("AttachAdapter.notifyChanged() - EReference.add(nonEObject)!!!"); //FIXME remove debug printout
			}
			break;
		case Notification.ADD_MANY :
			if (msg.getNewValue() instanceof Collection) {
				for (Object o : (Collection<?>) msg.getNewValue()) {
					if (o instanceof EObject) {
						attachTo((EObject) o);
					}
				}
			}
			break;
		case Notification.REMOVE :
			if (msg.getOldValue() instanceof EObject) {
				detachFrom((EObject) msg.getOldValue());
			}
			break;
		case Notification.REMOVE_MANY :
			if (msg.getOldValue() instanceof Collection) {
				for (Object o : (Collection<?>) msg.getOldValue()) {
					if (o instanceof EObject) {
						detachFrom((EObject) o);
					}
				}
			}
		case Notification.SET :
			if (msg.getOldValue() instanceof EObject) {
				detachFrom((EObject) msg.getOldValue());
			}
			if (msg.getNewValue() instanceof EObject) {
				attachTo((EObject) msg.getNewValue());
			}
			break;
		case Notification.UNSET :
			// XXX not sure whether unset gives oldValue or newValue
			// EContentAdapter handles UNSET in a different way - FIXME!!!
			if (msg.getOldValue() instanceof EObject) {
				detachFrom((EObject) msg.getOldValue());
			}
			break;
		}
		// dispatch to tracker afterwards, so that respective adapters are already attached/detached  
		if (myTracker != null) {
			myTracker.modelChanged(msg);
		}
	}

	// API note: next two methods may become protected, if needed 
	private void attachTo(EObject obj) {
		for (int i = 0; i < myAdapters.length; i++) {
			obj.eAdapters().add(myAdapters[i]);
		}
	}
	private void detachFrom(EObject obj) {
		for (int i = myAdapters.length - 1; i >= 0; i--) {
			obj.eAdapters().remove(myAdapters[i]);
		}
	}

	private boolean checkTarget(EObject eTarget) {
		return myRef.getEContainingClass().isSuperTypeOf(eTarget.eClass());
	}
}
