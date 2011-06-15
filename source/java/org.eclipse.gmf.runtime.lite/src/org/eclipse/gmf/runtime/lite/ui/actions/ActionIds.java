/**
 * Copyright (c) 2006 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.ui.actions;

import org.eclipse.ui.actions.ActionFactory;

/**
 * Declares Action IDs used within the lite runtime.
 */
public interface ActionIds {
	public static final String LAYOUT_ALL_ACTION = "layout_all";	//$NON-NLS-1$
	public static final String DELETE_VIEW = "delete_view";	//$NON-NLS-1$
	public static final String DELETE_VIEW_OR_MODEL = "delete_view_or_model";	//$NON-NLS-1$
	public static final String DELETE_FROM_MODEL = ActionFactory.DELETE.getId();
}
