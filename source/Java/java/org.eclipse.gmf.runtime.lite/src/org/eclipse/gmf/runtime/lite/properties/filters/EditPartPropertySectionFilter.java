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
import org.eclipse.jface.viewers.IFilter;


/**
 * Filter that matches all elements.
 */
public class EditPartPropertySectionFilter implements IFilter {
	public boolean select(Object toTest) {
		return toTest instanceof EditPart;
	}
}
