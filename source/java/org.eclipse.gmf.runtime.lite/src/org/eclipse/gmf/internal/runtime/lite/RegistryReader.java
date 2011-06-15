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

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionDelta;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IRegistryChangeEvent;
import org.eclipse.core.runtime.IRegistryChangeListener;

/**
 * Reads the extension point registry and creates objects representing registry values (registers the values).
 * Objects may be kept in sync with the registry by overriding {@link #unreadElement(IConfigurationElement)}.
 */
public abstract class RegistryReader implements IRegistryChangeListener {
	private IExtensionRegistry myExtensionRegistry;
	private String myPluginID;
	private String myExtensionPointID;
	private boolean myIsActive;

	public RegistryReader(IExtensionRegistry extensionRegistry, String pluginID, String extensionPointID) {
		myExtensionRegistry = extensionRegistry;
		myPluginID = pluginID;
		myExtensionPointID = extensionPointID;
	}

	/**
	 * Reads the given configuration element and registers this element declaration. Returns whether the element's child configuration elements
	 * should be recursively processed.
	 * If the element is not recognized or invalid, the implementors may either return <code>false</code> or throw an
	 * {@link IllegalArgumentException}.
	 * @throws IllegalArgumentException if the element is not recognized or invalid (optional).
	 */
	protected boolean readElement(IConfigurationElement configurationElement) throws IllegalArgumentException {
		return false;
	}

	/**
	 * Reads the given configuration element and unregisters this element declaration. Returns whether the element's child configuration elements 
	 * should be recursively processed.
	 * If the element is not recognized or invalid, the implementors may either return <code>false</code> or throw an
	 * {@link IllegalArgumentException}.
	 * @throws IllegalArgumentException if the element is not recognized or invalid (optional).
	 */
	protected boolean unreadElement(IConfigurationElement configurationElement) throws IllegalArgumentException {
		return false;
	}

	public void readRegistry() {
		assert !myIsActive;
		myIsActive = true;
		IExtensionPoint extensionPoint = myExtensionRegistry.getExtensionPoint(myPluginID, myExtensionPointID);
		if (extensionPoint != null) {
			for (IConfigurationElement element : extensionPoint.getConfigurationElements()) {
				recursiveReadElement(element, true);
			}
		}
		myExtensionRegistry.addRegistryChangeListener(this);
	}

	public void dispose() {
		if (myIsActive) {
			myExtensionRegistry.removeRegistryChangeListener(this);
			myIsActive = false;
		}
	}

	public void registryChanged(IRegistryChangeEvent event) {
		for (IExtensionDelta extensionDelta : event.getExtensionDeltas(myPluginID, myExtensionPointID)) {
			boolean isAdd = extensionDelta.getKind() == IExtensionDelta.ADDED;
			for (IConfigurationElement element : extensionDelta.getExtension().getConfigurationElements()) {
				recursiveReadElement(element, isAdd);
			}
		}
	}

	private void recursiveReadElement(IConfigurationElement element, boolean isAdd) {
		try {
			boolean recurse = isAdd ? readElement(element) : unreadElement(element);
			if (recurse) {
				for (IConfigurationElement child : element.getChildren()) {
					recursiveReadElement(child, isAdd);
				}
			}
		} catch (IllegalArgumentException e) {
			logError(element, "Exception occurred while reading plugin registry", e);	//$NON-NLS-1$
		}
	}

	protected void logError(IConfigurationElement element, String message) {
		logError(element, message, null);
	}

	protected void logError(IConfigurationElement element, String message, Throwable e) {
		Activator.getDefault().logError(formatMessage(message, element), e);	//$NON-NLS-1$
	}

	private String formatMessage(String message, IConfigurationElement context) {
		if (context == null) {
			return message;
		}
		StringBuilder buf = new StringBuilder();
		buf.append("Plugin ").append(context.getDeclaringExtension().getContributor().getName()).append(", extension ").append(context.getDeclaringExtension().getExtensionPointUniqueIdentifier()).append(": ");
		buf.append(message);
		return buf.toString();
	}
}
