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

import java.text.MessageFormat;
import java.util.HashMap;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.lite.commands.CreateNotationalElementCommand;
import org.eclipse.gmf.runtime.lite.shortcuts.IShortcutProvider;
import org.eclipse.gmf.runtime.lite.shortcuts.ShortcutProvidersRegistry;
import org.eclipse.gmf.runtime.notation.View;


public class ShortcutProvidersRegistryImpl extends ShortcutProvidersRegistry {
	private HashMap<String, IShortcutProvider> myRegistry;
	private RegistryReader myRegistryReader;
	@Override
	public IShortcutProvider getShortcutProvider(String modelID) {
		if (myRegistry == null) {
			initialize();
		}
		return myRegistry.get(modelID);
	}

	public IShortcutProvider[] getShortcutProviders() {
		if (myRegistry == null) {
			initialize();
		}
		return myRegistry.values().toArray(new IShortcutProvider[myRegistry.size()]);
	}

	private void initialize() {
		assert myRegistryReader == null;
		myRegistry = new HashMap<String, IShortcutProvider>();
		myRegistryReader = new RegistryReader(Platform.getExtensionRegistry(), Activator.PLUGIN_ID, EXT_POINT) {
			@Override
			protected boolean readElement(IConfigurationElement configurationElement) throws IllegalArgumentException {
				if (PROVIDER_TAG.equals(configurationElement.getName())) {
					Proxy providerProxy = new Proxy(configurationElement);
					String modelID = providerProxy.getModelID();
					if (myRegistry.containsKey(modelID)) {
						logError(configurationElement, MessageFormat.format("Duplicate shortcut provider registration for modelID {0}, ignored", modelID));
					} else {
						myRegistry.put(modelID, providerProxy);
					}
				}
				return false;
			}
			@Override
			protected boolean unreadElement(IConfigurationElement configurationElement) {
				if (PROVIDER_TAG.equals(configurationElement.getName())) {
					String modelID = configurationElement.getAttribute(MODEL_ID_ATTR);
					if (myRegistry.containsKey(modelID)) {
						//TODO: With duplicate declarations, we could actually remove some other registration.
						//But since duplicate declarations are logged and should be considered an error, anyway,
						//the code only correctly processes the situation with no more than a single declaration 
						//for a model ID.
						myRegistry.remove(modelID);
					}
				}
				return false;
			}
		};
		myRegistryReader.readRegistry();
	}

	public void dispose() {
		if (myRegistryReader != null) {
			myRegistryReader.dispose();
			myRegistryReader = null;
			myRegistry.clear();
			myRegistry = null;
		}
	}

	private static class Proxy implements IShortcutProvider {
		private IShortcutProvider myDelegate;
		private IConfigurationElement myDescriptor;
		public Proxy(IConfigurationElement descriptor) {
			myDescriptor = descriptor;
		}
		public String getModelID() {
			return myDescriptor.getAttribute(MODEL_ID_ATTR);
		}
		private void load() {
			if (myDelegate == null) {
				try {
					myDelegate = (IShortcutProvider) myDescriptor.createExecutableExtension(CLASS_ATTR);
				} catch (Throwable e) {
					Activator.getDefault().logError("Exception occurred while instantiating shortcut provider, provider will be disabled", e);	//$NON-NLS-1$
					myDelegate = Stub.INSTANCE;
				}
			}
		}
		public EditPart createShortcutEditPart(EditPart context, View shortcutView) {
			load();
			return myDelegate.createShortcutEditPart(context, shortcutView);
		}
		public CreateNotationalElementCommand getCreateShortcutCommand(View containerView, EObject underlyingModelObject) {
			load();
			return myDelegate.getCreateShortcutCommand(containerView, underlyingModelObject);
		}
		public Command getRefreshShortcutCommand(View shortcut) {
			load();
			return myDelegate.getRefreshShortcutCommand(shortcut);
		}
	}

	private static class Stub implements IShortcutProvider {
		public static final Stub INSTANCE = new Stub();

		public EditPart createShortcutEditPart(EditPart context, View shortcutView) {
			return null;
		}
		public CreateNotationalElementCommand getCreateShortcutCommand(View containerView, EObject underlyingModelObject) {
			return null;
		}
		public Command getRefreshShortcutCommand(View shortcut) {
			return null;
		}
	}

	private static final String EXT_POINT = "shortcutProviders";	//$NON-NLS-1$
	private static final String PROVIDER_TAG = "shortcutProvider";	//$NON-NLS-1$
	private static final String CLASS_ATTR = "class";	//$NON-NLS-1$
	private static final String MODEL_ID_ATTR = "modelID";	//$NON-NLS-1$
}
