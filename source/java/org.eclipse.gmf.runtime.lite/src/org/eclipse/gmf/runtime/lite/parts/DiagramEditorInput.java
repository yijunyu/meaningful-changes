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
package org.eclipse.gmf.runtime.lite.parts;

import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

/**
 * A simple implementation of an {@link org.eclipse.ui.IEditorInput} that may be used to open a diagram with the editing domain
 * specified by the diagram instance.
 */
public class DiagramEditorInput extends PlatformObject implements IEditorInput {
	private final Diagram myDiagram;

	public DiagramEditorInput(Diagram diagram) {
		assert diagram != null;
		myDiagram = diagram;
	}

	public Diagram getDiagram() {
		return myDiagram;
	}

	public boolean exists() {
		return myDiagram.eResource() != null;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DiagramEditorInput) {
			DiagramEditorInput that = (DiagramEditorInput) obj;
			return this.getDiagram().equals(that.getDiagram());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return getDiagram().hashCode();
	}

	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	public String getName() {
		return myDiagram.getName();
	}

	public IPersistableElement getPersistable() {
		return null;
	}

	public String getToolTipText() {
		return getName();
	}

	public Object getAdapter(Class adapter) {
		if (adapter == URI.class) {
			return EcoreUtil.getURI(myDiagram);
		}
		return super.getAdapter(adapter);
	}
}
