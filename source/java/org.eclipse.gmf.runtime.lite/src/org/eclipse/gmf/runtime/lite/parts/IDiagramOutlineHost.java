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
package org.eclipse.gmf.runtime.lite.parts;

import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.parts.SelectionSynchronizer;
import org.eclipse.swt.widgets.Control;

/**
 * Host for the diagram outline. This interface is not intended to be implemented by clients. 
 */
public interface IDiagramOutlineHost {
	public ActionRegistry getActionRegistry();

	public EditDomain getEditDomain();

	public EditPartViewer getGraphicalViewer();

	public SelectionSynchronizer getSelectionSynchronizer();

	public Control getGraphicalControl();
}
