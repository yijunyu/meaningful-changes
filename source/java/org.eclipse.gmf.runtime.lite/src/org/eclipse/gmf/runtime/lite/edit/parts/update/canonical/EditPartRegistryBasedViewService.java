/**
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.parts.update.canonical;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Implementation of {@link IViewService} that uses EditPartRegistry to match views with domain elements.
 * In order for this service to work correctly, edit parts must register themselves against domain elements in {@link AbstractEditPart#registerModel()} method.
 */
public class EditPartRegistryBasedViewService extends DelegatingViewService {
	public EditPartRegistryBasedViewService(EditPartViewer viewer) {
		super(new ExactMatchViewService(viewer));
	}

	private static class ExactMatchViewService implements IExactMatchFinder {
		private final EditPartViewer myViewer;

		public ExactMatchViewService(EditPartViewer viewer) {
			myViewer = viewer;
		}

		public View findView(EObject modelElement) {
			EditPart editPart = (EditPart) myViewer.getEditPartRegistry().get(modelElement);
			if (editPart != null && editPart.isActive() && editPart.getModel() instanceof View) {
				return (View) editPart.getModel();
			}
			return null;
		}

		public Diagram getDiagram() {
			return (Diagram) myViewer.getContents().getModel();
		}
	}
}
