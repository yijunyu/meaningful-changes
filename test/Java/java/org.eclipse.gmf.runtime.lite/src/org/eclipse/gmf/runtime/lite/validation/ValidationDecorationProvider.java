/**
 * Copyright (c) 2007 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gmf.runtime.lite.edit.parts.decorations.IDecoratableEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.decorations.IDecorationManager;

/**
 * @author bblajer
 */
public abstract class ValidationDecorationProvider implements IValidationStateListener {
	public static final String VALIDATION_KEY = "validation";	//$NON-NLS-1$

	public ValidationDecorationProvider() {
	}

	public void dispose() {
	}

	public void validationStateChanged(ValidationStateEvent event) {
		EObject sourceDiagram = getResourceSet().getEObject(event.getSourceValidationState().getDiagramUri(), false);
		if (sourceDiagram == null || !sourceDiagram.equals(getGraphicalViewer().getContents().getModel())) {
			return;
		}
		for(URI uri : event.getViolationKeys()) {
			EObject nextView = getResourceSet().getEObject(uri, false);
			GraphicalEditPart editPart = (GraphicalEditPart) getGraphicalViewer().getEditPartRegistry().get(nextView);
			if (editPart instanceof IDecoratableEditPart) {
				IDecoratableEditPart decoratableEditPart = (IDecoratableEditPart) editPart;
				IDecorationManager decorationManager = decoratableEditPart.getDecorationManager();
				if (decorationManager != null) {
					updateDecorations(decorationManager, event.getOldViolations(uri), event.getNewViolations(uri));
				}
			}
		}
	}

	/**
	 * @param decorationManager
	 * @param newViolations
	 */
	protected void updateDecorations(IDecorationManager decorationManager, Collection<ViolationDescriptor> oldViolations, Collection<ViolationDescriptor> newViolations) {
		if (newViolations.isEmpty()) {
			decorationManager.installDecoration(VALIDATION_KEY, null);
			return;
		}
		List<String> messages = new ArrayList<String>(newViolations.size());
		Severity highestSeverity = null;
		for (ViolationDescriptor next : newViolations) {
			Severity nextSeverity = next.getSeverity();
			if (highestSeverity == null || highestSeverity.compareTo(nextSeverity) < 0) {
				messages.clear();
				highestSeverity = nextSeverity;
			}
			if (highestSeverity.equals(nextSeverity)) {
				messages.add(next.getMessage());
			}
		}
		IFigure decoration = new ImageFigure(highestSeverity.getImage());
		String tooltip = formatLabel(messages);
		if (tooltip != null) {
			Label label = new Label(tooltip);
			decoration.setToolTip(label);
		}
		decorationManager.installDecoration(VALIDATION_KEY, decoration);
	}

	protected String formatLabel(List<String> messages) {
		assert !messages.isEmpty();
		if (messages.size() == 1) {
			return messages.get(0);
		}
		StringBuilder result = new StringBuilder();
		result.append("Multiple problems:");
		for(String next : messages) {
			result.append("\n").append(next);
		}
		return result.toString();
	}

	protected abstract ResourceSet getResourceSet();
	protected abstract GraphicalViewer getGraphicalViewer();
}
