/**
 * Copyright (c) 2008 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    vano - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.sheet;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IFilter;

public class ShapeEditPartPropertySectionFilter implements IFilter {

	public boolean select(Object toTest) {
		if (toTest instanceof ShapeEditPart) {
			ShapeEditPart shapeEditPart = (ShapeEditPart) toTest;
			View view = (View) shapeEditPart.getModel();
			return view.getStyle(NotationPackage.eINSTANCE.getShapeStyle()) != null;
		}
		return false;
	}

}
