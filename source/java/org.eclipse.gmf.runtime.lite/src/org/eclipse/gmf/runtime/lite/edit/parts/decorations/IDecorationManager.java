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

import org.eclipse.draw2d.IFigure;

/**
 * An object that may be decorated externally. Decorations may be installed for arbitrary {@link String}
 * keys. Installing a decoration automatically replaces any previous decoration for the same key.
 * Installing a <code>null</code> decoration is the same as uninstalling the decoration for the given key.
 * <p/>Clients should not implement this interface directly, {@link AbstractDecorationManager} class should be subclassed instead.
 * @author bblajer
 */
public interface IDecorationManager {
	/**
	 * Installs the decoration with the given key. 
	 * @param key
	 * @param decoration
	 */
	public void installDecoration(String key, IFigure decoration);
}
