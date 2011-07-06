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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.ui.IWorkbenchPartSite;

/**
 * @author bblajer
 */
interface IDiagramManager {
	public IWorkbenchPartSite getSite();
	public void configurePalette(PaletteRoot paletteRoot);
	public AdapterFactory getDomainAdapterFactory();
	public boolean isFlyoutPalette();
	public void configureGraphicalViewer();
	public void initializeGraphicalViewer();
}
