/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;


public class Activator extends Plugin {
	private static Activator anInstance;

	public Activator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		anInstance = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		anInstance = null;
		super.stop(context);
	}

	public static String getID() {
		return anInstance.getBundle().getSymbolicName();
	}

	public static void log(IStatus s) {
		anInstance.getLog().log(s);
	}

	public static void logError(String message, Exception ex) {
		assert ex != null;
		if (message == null) {
			message = ex.getMessage() == null ? new String() : ex.getMessage();
		}
		log(new Status(IStatus.ERROR, getID(), 0, message, ex));
	}
}
