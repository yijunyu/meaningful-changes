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
package org.eclipse.gmf.runtime.lite.figures;

import org.eclipse.draw2d.Locator;

/**
 * Interface optionally implemented by compartment figures that manage the position of 
 * compartment handles themselves.
 * @author bblajer
 */
public interface ICompartmentHandleLocatorProvider {
	public Locator getCompartmentHandleLocator();
}
