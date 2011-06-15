package org.eclipse.gmf.internal.bridge.trace;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class GmfTracePlugin extends Plugin {

	private static GmfTracePlugin myInstance;

	public void start(BundleContext context) throws Exception {
		super.start(context);
		myInstance = this;
	}

	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		myInstance = null;
	}

	public static GmfTracePlugin getInstance() {
		return myInstance;
	}

	public void logError(String message, Throwable exception) {
		getLog().log(new Status(IStatus.ERROR, getBundle().getSymbolicName(), 0, message, exception));
	}

	public void logDebugInfo(String message) {
		if (isDebugging()) {
			getLog().log(new Status(IStatus.INFO, getBundle().getSymbolicName(), 0, message, null));
		}
	}

}
