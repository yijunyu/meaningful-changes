/**
 * Copyright (c) 2007 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.parts.decorations;

import org.eclipse.gef.GraphicalEditPart;

/**
 * Edit part that know how to decorate itself externally.
 * @author bblajer
 */
public interface IDecoratableEditPart extends GraphicalEditPart {
	public IDecorationManager getDecorationManager();
}
