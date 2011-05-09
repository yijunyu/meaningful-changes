/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.internal.xpand.build.MetaModelSource;
import org.eclipse.gmf.internal.xpand.build.WorkspaceResourceManager;
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

	public static String getId() {
		return anInstance.getBundle().getSymbolicName();
	}
	public static void logWarn(String message) {
		log(new Status(IStatus.WARNING, getId(), 0, message, null));
	}
	public static void logError(Exception e) {
		if (e instanceof CoreException) {
			log(((CoreException) e).getStatus());
		} else {
			log(new Status(IStatus.ERROR, getId(), 0, e.getMessage(), e));
		}
	}
	public static void log(IStatus status) {
		anInstance.getLog().log(status);
	}

	private final Map<IProject, ResourceManager> resourceManagers = new HashMap<IProject, ResourceManager>();

	public static ResourceManager getResourceManager(IProject context) {
		if (anInstance.resourceManagers.containsKey(context)) {
			return anInstance.resourceManagers.get(context);
		}
		ResourceManager resourceManager = new WorkspaceResourceManager(context);
		registerResourceManager(context, resourceManager);
		return resourceManager;
	}

	public static void registerResourceManager(IProject project, ResourceManager resourceManager) {
		assert !anInstance.resourceManagers.containsKey(project);
		anInstance.resourceManagers.put(project, resourceManager);
	}

	private final Set<MetaModelSource> modelSources = new LinkedHashSet<MetaModelSource>();
	public static void registerModelSource(MetaModelSource modelSource) {
		assert modelSource != null;
		anInstance.modelSources.add(modelSource);
	}

	public static EPackage findMetaModel(String nsURI) {
		if (anInstance == null) {
			// this is for tests execution (which doesn't take place in plugin env)
			return null;
		}
		for (MetaModelSource s : anInstance.modelSources) {
			EPackage p = s.find(nsURI);
			if (p != null) {
				return p;
			}
		}
		return EPackage.Registry.INSTANCE.getEPackage(nsURI);
	}
}
