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
package org.eclipse.gmf.runtime.lite.shortcuts;

import org.eclipse.gmf.internal.runtime.lite.ShortcutProvidersRegistryImpl;

/**
 * Registry for shortcut providers. 
 */
public abstract class ShortcutProvidersRegistry {
	public static ShortcutProvidersRegistry INSTANCE = new ShortcutProvidersRegistryImpl();

	public abstract IShortcutProvider getShortcutProvider(String modelID);

	public abstract IShortcutProvider[] getShortcutProviders();
}
