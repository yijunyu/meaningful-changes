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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.notation.View;

public class UpdateManager extends EContentAdapter {
	private final EditPartViewer myViewer;

	public UpdateManager(EditPartViewer viewer) {
		myViewer = viewer;
	}

	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);
		if (msg.isTouch()) {
			return;
		}
		Collection affectedEditParts = findAffectedParts(msg);
		for(Iterator it = affectedEditParts.iterator(); it.hasNext(); ) {
			IUpdatableEditPart next = (IUpdatableEditPart) it.next();
			IUpdatableEditPart.Refresher refresher = next.getRefresher((EStructuralFeature)msg.getFeature(), msg);
			if (refresher != null) {
				refresher.refresh();
			}
		}
	}

	private Collection/*<IUpdatableEditPart>*/ findAffectedParts(Notification msg) {
		Object notifier = msg.getNotifier();
		if (notifier instanceof EObject) {
			org.eclipse.gmf.runtime.notation.View view = getView((EObject) notifier);
			if (view != null) {
				EditPart affectedEditPart = (EditPart) myViewer.getEditPartRegistry().get(view);
				if (affectedEditPart != null) {
					return Collections.singleton(affectedEditPart);
				}
			}
		}
		return Collections.EMPTY_LIST;
	}

	private View getView(EObject offspring) {
		while (offspring != null && offspring instanceof View == false || isFiltered((View) offspring)) {
			offspring = offspring.eContainer();
		}
		return (View) offspring;
	}

	protected boolean isFiltered(View view) {
		return myViewer.getEditPartRegistry().get(view) == null;
	}
}
