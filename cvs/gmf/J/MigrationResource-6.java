/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Radek Dvorak (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common.migrate;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.impl.SAXXMIHandler;
import org.eclipse.emf.ecore.xmi.impl.XMILoadImpl;
import org.eclipse.gmf.internal.common.ToolingResourceFactory.ToolResource;
import org.xml.sax.helpers.DefaultHandler;

/**
 * This resource implementation is intended to handle loading of old (incompatible) versions 
 * of tooling models.
 * <p>
 * This class makes use of {@link MigrationConfig.Registry#INSTANCE} end performs load-time migration 
 * in case that there is a migration config registered for the resource to load.
 * 
 * @see MigrationConfig
 */
class MigrationResource extends ToolResource {
	
	protected boolean oldVersionDetected;
	protected boolean migrationApplied;
	private Map<EObject, Map<String, String>> ignoredAttributes;
	private MigrationConfig config;

	MigrationResource(URI uri) {
		super(uri);
	}

	/*
	 * Create XMLLoad which handles old model migration at load-time 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl#createXMLLoad()
	 */
	protected XMLLoad createXMLLoad() {
		return new XMILoadImpl(createXMLHelper()) {

			protected DefaultHandler makeDefaultHandler() {
				return new MigrationHandler(MigrationResource.this, helper, options);			
			}
		};
	}

	protected final void doUnload() {
		try {
			super.doUnload();
		} finally {
			this.oldVersionDetected = false;
			this.migrationApplied = false;
		}
	}

	public final void doLoad(InputStream inputStream, Map options) throws IOException {
		try {
			ignoredAttributes = new HashMap<EObject, Map<String, String>>();
			super.doLoad(inputStream, options);
			handlePostLoad(null);			
		} catch (IOException e) {
			handlePostLoad(e);
			throw e;
		} catch (RuntimeException e) {
			handlePostLoad(e);
			throw e;
		} finally {
			ignoredAttributes = null;
			config = null;
		}
	}

	/**
	 * Called back if nsURI of old version is recognized during resource load.  
	 */
	protected void handleOldVersionDetected() {
		this.oldVersionDetected = true;
	}

	/**
	 * Called back at load-time in case an incompatible model construct required migration.  
	 */	
	protected void handleMigrationPatchApplied() {
		this.migrationApplied = true;
	}
	
	/**
	 * Called back after resource load finished.
	 * @param exception the exception thrown during {@link #doLoad(InputStream, Map)} or
	 * 		<code>null</code> in case of load success.
	 */
	protected void handlePostLoad(@SuppressWarnings("unused")Exception exception) {
		if (exception == null && config != null) {
			config.handleIgnoredAttributes(this, ignoredAttributes);
		}
	}

	/**
	 * Creates resource which checks for and reports incompatible model version
	 * in case that resource load fails.
	 * 
	 * @param uri the resource uri
	 * 
	 * @return resource object in unloaded state
	 */
	static Resource createCheckedResource(URI uri) {
		return new MigrationResource(uri) {
			
			protected XMLLoad createXMLLoad() {	
				final MigrationResource res = this;					
				return new XMILoadImpl(createXMLHelper()) {
					protected DefaultHandler makeDefaultHandler() {
						return new BCKWDCompatibleHandler(res, helper, options);			
					}
				};
			}
			
			@SuppressWarnings("unchecked")
			protected void handlePostLoad(Exception exception) {
				super.handlePostLoad(exception);
				// if old model version is loaded, check if any problems during resource load have occured
				// if yes, report an old version load attempt
				// otherwise, the resource happens to have no incompatible contents
				if(oldVersionDetected && exception != null || !getErrors().isEmpty() || !getWarnings().isEmpty()) {
					Diagnostic diagnostic = MigrationUtil.createMessageDiagnostic(this, Messages.oldModelVersionLoadErrorMigrationMayBeRequired);
					getErrors().add(0, diagnostic);
				}
			}
		};
	}
	
	/**
	 * Creates resource which performs only in-memory migration of old model versions at load-time
	 * and reports migration diagnostic.
	 *  
	 * @param uri the resource uri 
	 * @return resource object in unloaded state
	 */	
	static Resource createCheckAndMigrateOnLoadResource(URI uri) {
		return new MigrationResource(uri) {
			@SuppressWarnings("unchecked")
			protected void handlePostLoad(Exception exception) {
				super.handlePostLoad(exception);
				if(this.oldVersionDetected && migrationApplied) {
					Diagnostic diagnostic = MigrationUtil.createMessageDiagnostic(this, Messages.oldModelVersionLoadedMigrationRequired);
					getWarnings().add(0, diagnostic);
				}
			}
		};
	}	

	/**
	 * Handles detection of loaded model nsURI and checks if an old model version is to be loaded.
	 */
	private static class BCKWDCompatibleHandler extends SAXXMIHandler {
		MigrationConfig config;

		BCKWDCompatibleHandler(MigrationResource xmiResource, XMLHelper helper, Map options) {
			super(xmiResource, helper, options);
		}

		/*
		 * Detects if and old version of model is to be loaded
		 */
		@Override		
		protected EPackage getPackageForURI(String uriString) {
			if(config == null) {
				// Remark: ensure that GMF meta-models generated packages are initialized before accessing 
				// 	MigrationConfig.Registry, as a migrated package initialization code performs the migration config 
				// 	registration.
				//	TODO - better to use extension point for migration config registry     
				EPackage.Registry.INSTANCE.getEPackage(uriString);
				
				String ext = xmlResource.getURI().fileExtension();
				config = (ext != null) ? MigrationConfig.Registry.INSTANCE.getConfig(ext) : null;
				resource().config = config;
			}
			
			if(config != null) {
				if(!config.getMetamodelNsURI().equals(uriString) && 
					config.backwardSupportedNsURIs().contains(uriString)) {					
					resource().handleOldVersionDetected();
					
					return super.getPackageForURI(config.getMetamodelNsURI());
				}
			}

			return super.getPackageForURI(uriString);
		}
		
		MigrationResource resource() {
			assert xmlResource instanceof MigrationResource;
			return (MigrationResource)xmlResource;			
		}
	};	
	
	/**
	 * Handler performing migration changes at load-time 
	 */
	private static class MigrationHandler extends BCKWDCompatibleHandler {

		private FeatureKey processedFeatureKey;
		
		MigrationHandler(MigrationResource resource, XMLHelper helper, Map options) {
			super(resource, helper, options);
			this.processedFeatureKey = new FeatureKey();
		}

		@Override
		protected void setAttribValue(EObject object, String name, String value) {
			if (isMigrationEnabled() && config.shouldIgnoreAttribute(object, name)) {
				Map<EObject, Map<String, String>> ignoredAttributes = resource().ignoredAttributes;
				if (ignoredAttributes != null) {
					Map<String, String> attrs = ignoredAttributes.get(object);
					if (attrs == null) {
						attrs = new HashMap<String, String>();
						ignoredAttributes.put(object, attrs);
					}
					attrs.put(name, value);
				}
				notifyMigrationApplied(); // notify we had to migrate
				return; // do not try to set value 
			}
			super.setAttribValue(object, name, value);
		}

		@Override
		protected void createObject(EObject peekObject, EStructuralFeature feature) {
			if(isMigrationEnabled()) {
				processedFeatureKey.setFeature(feature);
				
				if(getXSIType() == null && feature instanceof EReference) { 			
					// adding xsi/xmi:type
					// @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=154712
					EClass oldDefaultRefType = (config != null) ? config.getAddedTypeInfo(processedFeatureKey) : null;
	
					if(oldDefaultRefType != null) {
						String typeQName = helper.getQName(oldDefaultRefType);
						super.createObjectFromTypeName(peekObject, typeQName, feature);
						// notify resource that a migration was neccessary 
						notifyMigrationApplied();
						return;
					}
				}
			} // end of migration
			
			super.createObject(peekObject, feature);								
		}

		private boolean isMigrationEnabled() {
			return config != null && resource().oldVersionDetected;
		}
		
		/**
		 * To be called if a migration patch had to be applied to load model successfully.
		 * <p>
		 * Note: It's important in order to detect whether an old model version which 
		 * was loaded contained incompatible constructs. No diagnostics are produced
		 * for old version models with compatible contents.
		 */
		private void notifyMigrationApplied() {
			resource().handleMigrationPatchApplied();
		}
	}
}
