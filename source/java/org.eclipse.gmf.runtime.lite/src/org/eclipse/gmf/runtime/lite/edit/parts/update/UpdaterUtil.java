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
import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Various utility methods related to EMF notifications.
 */
public class UpdaterUtil {
	public static boolean affects(Notification notification, EClass clz) {
		if (notification.isTouch()) {
			return false;
		}
		switch (notification.getEventType()) {
		case Notification.ADD:
		case Notification.SET:
			return clz.isInstance(notification.getNewValue());
		case Notification.REMOVE:
		case Notification.UNSET:
			return clz.isInstance(notification.getOldValue());
		case Notification.ADD_MANY:
			return affects(notification.getNewValue(), clz);
		case Notification.REMOVE_MANY:
			return affects(notification.getOldValue(), clz);
		case Notification.MOVE:
			if (notification.getNotifier() instanceof EObject && notification.getFeature() instanceof EStructuralFeature) {
				return affects(((EObject) notification.getNotifier()).eGet((EStructuralFeature) notification.getFeature()), clz);
			}
			return false;
		}
		return false;
	}

	private static boolean affects(Object list, EClass clz) {
		if (list instanceof Collection<?>) {
			for(Object next : ((Collection<?>) list)) {
				if (clz.isInstance(next)) {
					return true;
				}
			}
		}
		return false;
	}

	public static Collection<EObject> getAffectedValues(Notification notification, EClass clz) {
		if (notification.isTouch()) {
			return Collections.emptyList();
		}
		switch (notification.getEventType()) {
		case Notification.ADD:
		case Notification.SET:
			if (clz.isInstance(notification.getNewValue())) {
				return Collections.singletonList((EObject) notification.getNewValue());
			}
			return Collections.emptyList();
		case Notification.REMOVE:
		case Notification.UNSET:
			if (clz.isInstance(notification.getOldValue())) {
				return Collections.singletonList((EObject) notification.getOldValue());
			}
		case Notification.ADD_MANY:
			return affectingObjects(notification.getNewValue(), clz);
		case Notification.REMOVE_MANY:
			return affectingObjects(notification.getOldValue(), clz);
		case Notification.MOVE:
			if (notification.getNotifier() instanceof EObject && notification.getFeature() instanceof EStructuralFeature) {
				return affectingObjects(((EObject) notification.getNotifier()).eGet((EStructuralFeature) notification.getFeature()), clz);
			}
			return Collections.emptyList();
		}
		return Collections.emptyList();
	}

	private static Collection<EObject> affectingObjects(Object list, EClass clz) {
		Collection<EObject> result = null;
		if (list instanceof Collection<?>) {
			for(Object next : ((Collection<?>) list)) {
				if (clz.isInstance(next)) {
					if (result == null) {
						result = new BasicEList<EObject>();
					}
					result.add((EObject) next);
				}
			}
		}
		if (result != null) {
			return result;
		}
		return Collections.emptyList();
	}
}
