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

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.notation.NotationPackage;
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
		Collection<IUpdatableEditPart> affectedEditParts = findAffectedParts(msg);
		for(IUpdatableEditPart next : affectedEditParts) {
			if (next instanceof IExternallyUpdatableEditPart) {
				for (IExternallyUpdatableEditPart.ExternalRefresher nextExternalRefresher : ((IExternallyUpdatableEditPart) next).getExternalRefreshers()) {
					if (nextExternalRefresher.isAffectingEvent(msg)) {
						nextExternalRefresher.refresh();
					}
				}
			}
			IUpdatableEditPart.Refresher refresher = next.getRefresher((EStructuralFeature)msg.getFeature(), msg);
			if (refresher != null) {
				refresher.refresh();
			}
		}
	}

	private Collection<IUpdatableEditPart> findAffectedParts(Notification msg) {
		Object notifier = msg.getNotifier();
		if (notifier instanceof EObject) {
			org.eclipse.gmf.runtime.notation.View view = getView((EObject) notifier);
			if (view != null) {
				EditPart affectedEditPart = (EditPart) myViewer.getEditPartRegistry().get(view);
				if (affectedEditPart instanceof IUpdatableEditPart) {
					if (msg.getFeature() == NotationPackage.eINSTANCE.getView_Visible() && affectedEditPart.getParent() instanceof IUpdatableEditPart) {
						return Arrays.asList((IUpdatableEditPart) affectedEditPart, (IUpdatableEditPart) affectedEditPart.getParent());
					}
					return Collections.singleton((IUpdatableEditPart) affectedEditPart);
				}
				return Collections.emptyList();
			}
		}
		return Collections.emptyList();
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
