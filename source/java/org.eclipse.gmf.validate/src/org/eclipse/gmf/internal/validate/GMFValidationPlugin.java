/*
 * Copyright (c) 2005, 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *    Radek Dvorak (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.validate;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class GMFValidationPlugin extends Plugin {

	//The shared instance.
	private static GMFValidationPlugin plugin;
	
	/**
	 * The constructor.
	 */
	public GMFValidationPlugin() {
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 */
	public static GMFValidationPlugin getDefault() {
		return plugin;
	}

	/**
	 * Creates a new status object for this plugin.
	 *
	 * @param severity the severity; one of <code>OK</code>, <code>ERROR</code>, 
	 * <code>INFO</code>, <code>WARNING</code>,  or <code>CANCEL</code>
	 * @param code the plug-in-specific status code, or <code>OK</code>
	 * @param message a human-readable message, localized to the
	 *    current locale
	 * @param exception a low-level exception, or <code>null</code> if not
	 *    applicable 
	 */	
	public static IStatus createStatus(int severity, int code, String message, Throwable exception) {
		return new Status(severity, getPluginId(), code, message, exception);		
	}
	
	public static void log(int severity, String message, Throwable exception) {
		Status s = new Status(severity, getPluginId(),
			0, message != null ? message : "", exception); //$NON-NLS-1$		
		log(s);
	}
	
	public static void log(IStatus status) {
		if(status.getSeverity() >= IStatus.WARNING && Trace.shouldTrace()) {
			Trace.trace(status.getMessage());
		}
		getDefault().getLog().log(status);
	}
	
	public static String getPluginId() {
		return getDefault().getBundle().getSymbolicName();		
	}
}
