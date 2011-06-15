/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.map.editor.part;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditorInput;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PartInitException;

/**
 * @generated
 */
public class GMFMapMatchingStrategy implements IEditorMatchingStrategy {

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

		IEditorPart editor = editorRef.getEditor(false);
		if (input instanceof DiagramEditorInput && editor instanceof GMFMapDiagramEditor) {
			Diagram editorDiagram = ((GMFMapDiagramEditor) editor).getDiagram();
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
