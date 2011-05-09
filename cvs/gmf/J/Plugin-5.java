/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.ui;

import java.text.MessageFormat;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Plugin extends AbstractUIPlugin {

	public static final String CHECKED_ICON = "/icons/cview16/checked.gif"; //$NON-NLS-1$

	public static final String UNCHECKED_ICON = "/icons/cview16/unchecked.gif"; //$NON-NLS-1$

	public static final String NODE_ICON = "/icons/cview16/node.gif"; //$NON-NLS-1$

	public static final String LINK_ICON = "/icons/cview16/link.gif"; //$NON-NLS-1$

	public static final String LABEL_ICON = "/icons/cview16/label.gif"; //$NON-NLS-1$

	private static Plugin plugin;

	public Plugin() {
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	public static Plugin getDefault() {
		return plugin;
	}
	
	public static String getBundleString(String key) {
		return Platform.getResourceBundle(getDefault().getBundle()).getString(key);
	}

	public static String getBundleString(String key, Object[] args) {
		String val = getBundleString(key);
		if (val == null) {
			return key;
		}
		return MessageFormat.format(val, args);
	}

	protected void initializeImageRegistry(ImageRegistry reg) {
		loadImage(reg, CHECKED_ICON);
		loadImage(reg, UNCHECKED_ICON);
		loadImage(reg, NODE_ICON);
		loadImage(reg, LINK_ICON);
		loadImage(reg, LABEL_ICON);
	}

	protected void loadImage(ImageRegistry registry, String id) {
		loadImage(registry, id, getBundle().getSymbolicName());
	}

	protected void loadImage(ImageRegistry registry, String id, String bundleId) {
		ImageDescriptor descriptor = imageDescriptorFromPlugin(bundleId, id);
		if (descriptor != null) {
			registry.put(id, descriptor);
		}
	}

	public static void log(CoreException ex) {
		log(ex.getStatus());
	}

	public static void log(Exception ex) {
		if (ex instanceof CoreException) {
			log((CoreException) ex);
		} else {
			log(new Status(IStatus.ERROR, getPluginID(), 0, ex.getMessage(), ex));
		}
	}

	public static String getPluginID() {
		return getDefault().getBundle().getSymbolicName();
	}

	public static void log(IStatus s) {
		getDefault().getLog().log(s);
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path.
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.gmf.bridge.ui", path); //$NON-NLS-1$
	}
}
