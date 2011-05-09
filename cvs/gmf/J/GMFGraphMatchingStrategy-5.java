/*
 * Copyright (c) 2006, 2007 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.part;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditorInput;

import org.eclipse.gmf.runtime.notation.Diagram;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;

/**
 * @generated
 */
public class GMFGraphMatchingStrategy implements IEditorMatchingStrategy {

	/**
	 * @generated
	 */
	public boolean matches(IEditorReference editorRef, IEditorInput input) {
		IEditorInput editorInput;
		try {
			editorInput = editorRef.getEditorInput();
		} catch (PartInitException e) {
			return false;
		}

		if (editorInput.equals(input)) {
			return true;
		}

		if (editorInput instanceof IFileEditorInput && input instanceof IFileEditorInput) {
			return ((IFileEditorInput) editorInput).getFile().equals(((IFileEditorInput) input).getFile());
		}

		IEditorPart editor = editorRef.getEditor(false);
		if (input instanceof DiagramEditorInput && editor instanceof GMFGraphDiagramEditor) {
			Diagram editorDiagram = ((GMFGraphDiagramEditor) editor).getDiagram();
			Diagram otherDiagram = ((DiagramEditorInput) input).getDiagram();
			return equals(editorDiagram, otherDiagram);
		}
		return false;
	}

	/**
	 * @generated
	 */
	private boolean equals(Diagram editorDiagram, Diagram otherDiagram) {
		Resource editorResource = editorDiagram.eResource();
		Resource otherResource = otherDiagram.eResource();
		if (editorResource != null && otherResource != null) {
			URI editorURI = editorResource.getURI();
			URI otherURI = otherResource.getURI();
			String editorURIFragment = editorResource.getURIFragment(editorDiagram);
			String otherURIFragment = otherResource.getURIFragment(otherDiagram);
			return editorURI.equals(otherURI) && editorURIFragment.equals(otherURIFragment);
		}
		return false;
	}

}
