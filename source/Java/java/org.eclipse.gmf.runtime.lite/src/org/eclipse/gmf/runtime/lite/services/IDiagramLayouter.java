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
package org.eclipse.gmf.runtime.lite.services;

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.gef.GraphicalEditPart;

public interface IDiagramLayouter {
	public Command layout(GraphicalEditPart container);
	public Command layout(GraphicalEditPart container, List<GraphicalEditPart> selectedElements);
}
