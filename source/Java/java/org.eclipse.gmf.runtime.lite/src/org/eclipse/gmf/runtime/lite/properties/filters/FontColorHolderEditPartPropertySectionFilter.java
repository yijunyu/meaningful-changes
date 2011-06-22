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
package org.eclipse.gmf.runtime.lite.properties.filters;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IFilter;

/**
 * Filter that matches elements that have font and/or color styles.
 */
public class FontColorHolderEditPartPropertySectionFilter implements IFilter {
	public boolean select(Object toTest) {
		if (toTest instanceof EditPart) {
			Object model = ((EditPart) toTest).getModel();
			if (model instanceof View) {
				View view = (View) model;
				return view.getStyle(NotationPackage.eINSTANCE.getFontStyle()) != null ||
					view.getStyle(NotationPackage.eINSTANCE.getFillStyle()) != null ||
					view.getStyle(NotationPackage.eINSTANCE.getLineStyle()) != null;
			}
		}
		return false;
	}
}
