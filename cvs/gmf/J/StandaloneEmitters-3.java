/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */
package org.eclipse.gmf.graphdef.codegen;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.graphdef.codegen.standalone.templates.BuildPropertiesGenerator;
import org.eclipse.gmf.graphdef.codegen.standalone.templates.ManifestMFGenerator;
import org.eclipse.gmf.graphdef.codegen.standalone.templates.PluginActivatorGenerator;
import org.eclipse.gmf.graphdef.codegen.standalone.templates.PluginPropertiesGenerator;
import org.eclipse.gmf.internal.codegen.dispatch.EmitterFactory;
import org.eclipse.gmf.internal.codegen.dispatch.NoSuchTemplateException;
import org.eclipse.gmf.internal.codegen.dispatch.StaticTemplateRegistry;
import org.eclipse.gmf.internal.codegen.dispatch.TemplateRegistry;

public class StandaloneEmitters extends EmitterFactory {
	
	public StandaloneEmitters(){
		super(getTemplatePath(), createTemplateRegistry());
	}
	
	public JETEmitter getBuildPropertiesEmitter() throws UnexpectedBehaviourException {
		return getRegistered(BuildPropertiesGenerator.class);
	}
	
	public JETEmitter getPluginPropertiesEmitter() throws UnexpectedBehaviourException {
		return getRegistered(PluginPropertiesGenerator.class);
	}
	
	public JETEmitter getManifestMFEmitter() throws UnexpectedBehaviourException {
		return getRegistered(ManifestMFGenerator.class);
	}
	
	public JETEmitter getPluginActivatorEmitter() throws UnexpectedBehaviourException {
		return getRegistered(PluginActivatorGenerator.class);
	}

	private JETEmitter getRegistered(Class key) throws UnexpectedBehaviourException {
		try {
			return acquireEmitter(key);
		} catch (NoSuchTemplateException ex) {
			throw new UnexpectedBehaviourException(ex.getMessage(), ex);
		}
	}

	private static String[] getTemplatePath() {
		// XXX for precompiled templates we use at the moment, there's no much value 
		return new String[] { Platform.getBundle("org.eclipse.gmf.graphdef.codegen").getEntry("/templates").toString() };
	}

	private static TemplateRegistry createTemplateRegistry() {
		StaticTemplateRegistry result = new StaticTemplateRegistry(StandaloneEmitters.class.getClassLoader());
		registerTemplate(result, BuildPropertiesGenerator.class, "/plugin/build.propertiesjet");
		registerTemplate(result, ManifestMFGenerator.class, "/plugin/manifest.mfjet");
		registerTemplate(result, PluginPropertiesGenerator.class, "/plugin/plugin.propertiesjet");
		registerTemplate(result, PluginActivatorGenerator.class, "/plugin/plugin.javajet");
		return result;
	}
	
	private static void registerTemplate(StaticTemplateRegistry registry, Class compiled, String path){
		registry.put(compiled, path, compiled);
	}
	
}
