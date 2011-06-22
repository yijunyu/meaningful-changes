/*
 * Copyright (c) 2005, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *    Radek Dvorak (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.validate.expressions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmf.internal.validate.GMFValidationPlugin;
import org.eclipse.osgi.util.NLS;

/**
 * This class maintains all contribution to
 * <code>org.eclipse.gmf.validate.expressions</code> extension point.
 * <p>
 * It collects all contributions of all providers at this class initialization
 * time. It only creates and caches only descriptors of provider implementations.
 * A provider itself is initialized lazily on demand.
 */
public class ExpressionProviderRegistry {
	private static final ExpressionProviderRegistry INSTANCE = new ExpressionProviderRegistry(); 
			
	private Map<String, Descriptor> registry;
	
	private ExpressionProviderRegistry() {
		registry = new HashMap<String, Descriptor>();
		initialiaze();
	}
	
	/**
	 * Gets the instance of providers registry.
	 */
	public static ExpressionProviderRegistry getInstance() {
		return INSTANCE;
	}
	
	/**
	 * Gets the provider for the given language.
	 * 
	 * @param language
	 *            the identifier of the language
	 * @return the provider supporting expressions in the given language or
	 *         <code>null</code> if no such provider is found
	 */
	public IModelExpressionProvider getProvider(String language) {
		Descriptor descriptor = getDescriptor(language);
		if(descriptor != null && descriptor.getStatus().isOK()) {
			return descriptor.getProvider();
		}
		return null;
	}
	
	/**
	 * Gets supported expression languages by providers in this registry.
	 * @return set of language identifiers strings, never <code>null</code>
	 */
	public Set<String> getLanguages() {
		return registry.keySet();
	}
	
	/**
	 * Gets descriptor of the provider supporting the given language.
	 * 
	 * @param language
	 *            the identifier of the expression language whose provider is to
	 *            be retrieved
	 * @return corresponding provider descriptor or <code>null</code> if no
	 *         such provider is found.
	 */
	public Descriptor getDescriptor(String language) {
		return registry.get(language); 
	}
	
	
	private void initialiaze() {
		IConfigurationElement[] configs = Platform.getExtensionRegistry().getConfigurationElementsFor(
				Descriptor.GLOBAL_EXTENSION_ID);
		for (int i = 0; i < configs.length; i++) {
			IConfigurationElement element = configs[i];
			Descriptor descriptor = new Descriptor(element);
			if(descriptor.getStatus().isOK()) {
				String lang = descriptor.getLanguage();
				assert lang != null;
				Descriptor currentDsc = registry.get(lang);				
				if(currentDsc == null) {
					registry.put(lang, descriptor);
				} else {
					String message = NLS.bind(Messages.providerAlreadyExistsIgnore, new Object[] { 
						currentDsc.getProviderClassName(), lang, 
						descriptor.getProviderClassName() 
					});
					GMFValidationPlugin.log(GMFValidationPlugin.createStatus(IStatus.ERROR, 0, message, null));
				}
			}
		}
		registry = Collections.unmodifiableMap(registry);
	}	
	
	static class Descriptor {
		static final String EXTENSION_ID = "expressionProviders"; //$NON-NLS-1$	
		static final String GLOBAL_EXTENSION_ID = GMFValidationPlugin.getPluginId() + "." + EXTENSION_ID; //$NON-NLS-1$ 

		public static final String ATTR_CLASS = "class"; //$NON-NLS-1$
		public static final String ATTR_LANGUAGE = "language"; //$NON-NLS-1$
		public static final String ATTR_REQUIRES_MODEL_CLASS = "requiresModelClass"; //$NON-NLS-1$		
		public static final String ATTR_NAME = "name"; //$NON-NLS-1$		
		public static final String ATTR_DESCRIPTION = "description"; //$NON-NLS-1$		
		public static final String ATTR_LOOSELY_TYPED = "isLooselyTyped"; //$NON-NLS-1$		
			
		private IConfigurationElement configElement;
		private String language;
		private String className;
		private boolean modelReflection;
		private boolean isLooselyTyped;		
		private String name;
		private String description;		
		private IStatus status;		
		private IModelExpressionProvider provider;
		
		Descriptor(IConfigurationElement config) { 
			this.status = Status.OK_STATUS;
			try {
				configure(config);
			} catch (InvalidRegistryObjectException e) {
				GMFValidationPlugin.log(IStatus.ERROR, Messages.initDescriptorFailure, e);				
			}
		}

		public IStatus getStatus() {
			return status;
		}		
		
		public String getLanguage() {
			return language;
		}
		
		public boolean supportsModelReflection() {
			return modelReflection;
		}
		
		public boolean isLooselyTyped() {
			return isLooselyTyped;
		}
		
		public String getProviderClassName() {
			return className;
		}
		
		public String getName() {
			return name;
		}
		
		public String getDescription() {
			return description;
		}
			
		IModelExpressionProvider getProvider() {
			if(provider == null && getStatus().isOK()) {
				try {
					provider = (IModelExpressionProvider)configElement.createExecutableExtension(ATTR_CLASS);	
				} catch(CoreException e) {					
					String message = NLS.bind(Messages.providerCreationFailure, getProviderClassName());
					GMFValidationPlugin.log(IStatus.ERROR, message, e);
				}
			}
			return provider;
		}
				
		private void configure(IConfigurationElement config) {
			this.configElement = config;
			language = configElement.getAttribute(ATTR_LANGUAGE);
			if(language == null || language.trim().length() == 0) {
				this.status = GMFValidationPlugin.createStatus(IStatus.ERROR, 0, 
						Messages.missingProviderLanguage, null);
			}
			className = config.getAttribute(ATTR_CLASS);
			if(className == null || className.trim().length() == 0) {
				this.status = GMFValidationPlugin.createStatus(IStatus.ERROR, 0, 
						Messages.missingProviderClass, null);
			}
			
			modelReflection = "true".equals(config.getAttribute(ATTR_REQUIRES_MODEL_CLASS)); //$NON-NLS-1$
			isLooselyTyped = "true".equals(config.getAttribute(ATTR_LOOSELY_TYPED)); //$NON-NLS-1$
			name = config.getAttribute(ATTR_NAME);
			description = config.getAttribute(ATTR_DESCRIPTION);						
		}	
	}
}
