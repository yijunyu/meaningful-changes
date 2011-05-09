package org.eclipse.gmf.internal.bridge.ui;

import org.eclipse.ui.plugin.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.BundleContext;

public class Plugin extends AbstractUIPlugin {

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

	public static void log (CoreException ex) {
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
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.gmf.bridge.ui", path);
	}
}
