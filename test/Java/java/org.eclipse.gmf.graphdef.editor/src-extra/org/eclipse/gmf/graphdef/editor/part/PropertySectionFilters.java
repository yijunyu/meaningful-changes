/*
 *  Copyright (c) 2006, 2007 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.part;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

public class PropertySectionFilters {

	public static Object transformSelection(Object selection) {
		if (selection instanceof EditPart) {
			Object model = ((EditPart) selection).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (selection instanceof View) {
			return ((View) selection).getElement();
		}
		if (selection instanceof IAdaptable) {
			View view = (View) ((IAdaptable) selection).getAdapter(View.class);
			if (view != null) {
				return view.getElement();
			}
		}
		return selection;
	}

}
