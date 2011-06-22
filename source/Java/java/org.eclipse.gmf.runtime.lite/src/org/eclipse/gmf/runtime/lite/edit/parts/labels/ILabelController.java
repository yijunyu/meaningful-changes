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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.lite.edit.parts.update.IExternallyUpdatableEditPart;

/**
 * Implementors of this interface know how to display and update text. They are typically associated with edit parts.
 */
public interface ILabelController {
	/**
	 * Returns the label displayer associated with this edit part.
	 */
	public ILabelTextDisplayer getLabelTextDisplayer();

	/**
	 * Causes the given text to be displayed in the label controlled by this edit part.
	 */
	public void setLabelText(String text);

	public static class ExternalRefresherAdapter implements IExternallyUpdatableEditPart.ExternalRefresher {
		private final ILabelController myController;
		private final EObject mySource;

		public ExternalRefresherAdapter(ILabelController controller, EObject source) {
			myController = controller;
			mySource = source;
		}

		public boolean isAffectingEvent(Notification msg) {
			if (myController.getLabelTextDisplayer() == null) {
				return false;
			}
			return myController.getLabelTextDisplayer().isAffectingEvent(msg);
		}

		public void refresh() {
			if (myController.getLabelTextDisplayer() == null) {
				return;
			}
			myController.setLabelText(myController.getLabelTextDisplayer().getDisplayText(mySource));
		}
	}
}
