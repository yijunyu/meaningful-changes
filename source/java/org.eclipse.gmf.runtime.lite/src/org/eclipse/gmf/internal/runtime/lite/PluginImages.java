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
package org.eclipse.gmf.internal.runtime.lite;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * Bundle of all images used by this plugin.
 */
public class PluginImages {
	private static final String ROOT_PATH = "icons/";	//$NON-NLS-1$

	public static final String IMG_HANDLE_EXPAND = ROOT_PATH + "collapse.gif"; //$NON-NLS-1$
	public static final String IMG_HANDLE_COLLAPSE = ROOT_PATH + "expand.gif"; //$NON-NLS-1$

	public static final String IMG_FILL_COLOR = ROOT_PATH + "fill_color.gif"; //$NON-NLS-1$
	public static final String IMG_BOLD = ROOT_PATH + "bold.gif"; //$NON-NLS-1$
	public static final String IMG_ITALIC = ROOT_PATH + "italic.gif"; //$NON-NLS-1$
	public static final String IMG_FONT_COLOR = ROOT_PATH + "font_color.gif"; //$NON-NLS-1$
	public static final String IMG_LINE_COLOR = ROOT_PATH + "line_color.gif"; //$NON-NLS-1$

	static void initialize() {
		put(IMG_HANDLE_EXPAND);
		put(IMG_HANDLE_COLLAPSE);
		put(IMG_FILL_COLOR);
		put(IMG_BOLD);
		put(IMG_ITALIC);
		put(IMG_FONT_COLOR);
		put(IMG_LINE_COLOR);
	}

	private PluginImages() {
	}

	public static Image get(String key) {
		return Activator.getDefault().getImageRegistry().get(key);
	}

	private static void put(String key) {
		ImageDescriptor imageDescriptor = Activator.getImageDescriptor(key);
		Activator.getDefault().getImageRegistry().put(key, imageDescriptor);
	}
}
