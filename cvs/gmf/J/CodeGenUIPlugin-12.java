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
package org.eclipse.gmf.internal.codegen;

import java.text.MessageFormat;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class CodeGenUIPlugin extends AbstractUIPlugin {

	public static final String GMF_LOGO_IMAGE = "/icons/full/logo_banner.png";
	public static final String SYNC_ICON = "/icons/full/synced.gif";
	public static final String CHECKED_ICON = "/icons/full/checked.gif";
	public static final String UNCHECKED_ICON = "/icons/full/unchecked.gif";
	public static final String NODE_ICON = "/icons/full/node.gif";
	public static final String LINK_ICON = "/icons/full/link.gif";
	public static final String LABEL_ICON = "/icons/full/label.gif";
	public static final String GDM_ICON = "/icons/full/obj16/GMFGraphModelFile.gif";
	public static final String DM_ICON = "/icons/full/obj16/EcoreModelFile.gif";
	public static final String TDM_ICON = "/icons/full/obj16/GMFToolModelFile.gif";
	public static final String MM_ICON = "/icons/full/obj16/GMFMapModelFile.gif";
	public static final String GM_ICON = "/icons/full/obj16/GMFGenModelFile.gif";

	private static CodeGenUIPlugin plugin;

	public CodeGenUIPlugin() {
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	public static CodeGenUIPlugin getDefault() {
		return plugin;
	}

	protected void initializeImageRegistry(ImageRegistry reg) {
		loadImage(reg, GMF_LOGO_IMAGE);
		loadImage(reg, SYNC_ICON);
		loadImage(reg, CHECKED_ICON);
		loadImage(reg, UNCHECKED_ICON);
		loadImage(reg, NODE_ICON);
		loadImage(reg, LINK_ICON);
		loadImage(reg, LABEL_ICON);
		loadImage(reg, GDM_ICON,"org.eclipse.gmf.graphdef.edit");
		loadImage(reg, DM_ICON, "org.eclipse.emf.ecore.editor");
		loadImage(reg, TDM_ICON, "org.eclipse.gmf.tooldef.edit");
		loadImage(reg, MM_ICON, "org.eclipse.gmf.map.edit");
		loadImage(reg, GM_ICON, "org.eclipse.gmf.codegen.edit");
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

	public static IStatus createStatus(int statusCode, String message, Exception ex) {
		return new Status(statusCode, getPluginID(), 0, message, ex);
	}
	public static IStatus createError(String message, Exception ex) {
		return createStatus(IStatus.ERROR, message, ex);
	}
	public static IStatus createWarning(String message) {
		return createStatus(IStatus.WARNING, message, null);
	}
	public static IStatus createInfo(String message) {
		return createStatus(IStatus.INFO, message, null);
	}

	public static String getPluginID() {
		return getDefault().getBundle().getSymbolicName();
	}

	public static String formatMessage(String bundleStringKey, IStatus status) {
		if (status.isMultiStatus()) {
			IStatus[] children = status.getChildren();
			StringBuffer sb = new StringBuffer();
			// don't care about too nested statuses just because will switch to
			// jobs soon, with
			// required support already in place
			for (int i = 0; i < children.length && i < 3; i++) {
				sb.append(children[i].getMessage());
				sb.append('\n');
				sb.append('\n');
			}
			if (children.length >= 3) {
				sb.append("...");
			}
			return CodeGenUIPlugin.getBundleString(bundleStringKey, new Object[] { sb.toString() });
		} else {
			return CodeGenUIPlugin.getBundleString(bundleStringKey, new Object[] { status.getMessage() });
		}
	}
}
