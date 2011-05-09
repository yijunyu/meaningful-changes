/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
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

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.util.FigureQualifiedNameSwitch;
import org.eclipse.gmf.internal.common.codegen.DefaultTextMerger;
import org.eclipse.gmf.internal.common.codegen.GeneratorBase;
import org.eclipse.gmf.internal.common.codegen.ImportUtil;
import org.eclipse.gmf.internal.common.codegen.TextEmitter;
import org.eclipse.gmf.internal.common.codegen.TextMerger;

/**
 * FIXME move to internal package as it's not necessary to expose this class to public
 */
public class StandaloneGenerator extends GeneratorBase {
	protected final Config myArgs;
	private final TextEmitter myFigureGenerator;
	private final StandaloneEmitters myAuxiliaryGenerators;
	private boolean mySkipPluginStructire;
	protected Processor myProcessor;
	private final Map<String, FigureDescriptor> myCallbackFigures = new LinkedHashMap<String, FigureDescriptor>(); 
	
	public interface Config {
		public String getPluginID();
		public String getPluginFriendlyName();
		public String getPluginProviderName();
		public String getMainPackageName();

		public String getPluginActivatorClassName();
		public String getPluginActivatorPackageName();
		public MapModeCodeGenStrategy getMapMode();
		public String getRuntimeToken();
	}

	public static class ConfigImpl implements Config {
		private final String myPluginId;
		private final String myMainPackageName;
		private final String myPluginFriendlyName;
		private final String myPluginProviderName;
		
		private final String myPluginActivatorClassName;
		private final String myPluginActivatorPackageName;

		private final MapModeCodeGenStrategy myMapMode;
		private final String myRuntimeToken;
		
		public ConfigImpl(String pluginId, String mainPackageName){
			this(pluginId, mainPackageName, MapModeCodeGenStrategy.DYNAMIC, null);
		}

		public ConfigImpl(String pluginId, String mainPackageName, MapModeCodeGenStrategy mapMode, String runtimeToken) {
			this(pluginId, mainPackageName, pluginId, "", "PluginActivator", (mainPackageName == null ? "" : mainPackageName + ".")  + "activator", mapMode, null);
		}

		public ConfigImpl(String pluginId, String mainPackageName, String pluginFriendlyName, String pluginProviderName, String pluginActivatorClassName, String pluginActivatorPackageName, MapModeCodeGenStrategy mapMode, String runtimeToken){
			myPluginId = pluginId;
			myMainPackageName = mainPackageName == null ? "" : mainPackageName;
			myPluginFriendlyName = pluginFriendlyName;
			myPluginProviderName = pluginProviderName;
			myPluginActivatorClassName = pluginActivatorClassName;
			myPluginActivatorPackageName = pluginActivatorPackageName;
			myMapMode = mapMode;
			myRuntimeToken = runtimeToken;
		}
		
		public String getMainPackageName() {
			return myMainPackageName;
		}
		
		public String getPluginFriendlyName() {
			return myPluginFriendlyName;
		}
		
		public String getPluginID() {
			return myPluginId;
		}
		
		public String getPluginProviderName() {
			return myPluginProviderName;
		}
		
		public String getPluginActivatorClassName() {
			return myPluginActivatorClassName;
		}
		
		public String getPluginActivatorPackageName() {
			return myPluginActivatorPackageName;
		}
		
		public MapModeCodeGenStrategy getMapMode() {
			return myMapMode;
		}

		public String getRuntimeToken() {
			return myRuntimeToken;
		}
	}

	public static abstract class Processor {
		public abstract void go(ProcessorCallback callback, Config config) throws InterruptedException ;

		public String[] getRequiredBundles(FigureQualifiedNameSwitch fqnSwitch) {
			return new String[0];
		}
	}

	public interface ProcessorCallback {
		public String visitFigure(FigureDescriptor f) throws InterruptedException;
	}


	public StandaloneGenerator(Processor p, Config config) {
		this(p, config, null);
	}

	public StandaloneGenerator(Processor p, Config config, URL[] dynamicTemplates) {
		assert p != null && config != null;
		myArgs = config;
		myProcessor = p;
		String pluginActivatorFQN = composePluginActivatorClassFQN(config);
		final MapModeCodeGenStrategy strategy;
		String accessor;
		if (config.getMapMode() == MapModeCodeGenStrategy.DYNAMIC) {
			strategy = MapModeCodeGenStrategy.DYNAMIC;
			accessor = pluginActivatorFQN + ".getDefault().";
		} else {
			strategy = config.getMapMode() == null ? MapModeCodeGenStrategy.STATIC : config.getMapMode();
			accessor = null;
		}
		
		myFigureGenerator = new FigureGenerator(config.getRuntimeToken(), getPackageName(), strategy, accessor, false, dynamicTemplates);
		myAuxiliaryGenerators = new StandaloneEmitters(strategy, dynamicTemplates);
	}

	/**
	 * Allows clients to skip generating of manifest.mf, pligin and build properties files. 
	 * "New-plugin-by-template" generator uses this feature because it delegates this generation to PDE defaults.
	 */
	public void setSkipPluginStructure(boolean skipManifest){
		mySkipPluginStructire = skipManifest;
	}
	
	protected void setupProgressMonitor() {
		//setupProgressMonitor("Generating GMFGraph plugin", 100);
	}
	
	@Override
	protected TextMerger createMergeService() {
		// jcontrol model that is not initialized can't merge, hence java merging won't happen
		return new DefaultTextMerger(new JControlModel());
	}
	
	protected void customRun() throws InterruptedException, UnexpectedBehaviourException {
		initializeEditorProject(myArgs.getPluginID(), null /*support only workspace project with figures*/);
		
		if (!mySkipPluginStructire){
			generatePluginStructure();
		}
		try {
			generateTopLevelFigures();
			generatePluginActivator();
		} catch (IllegalStateException e){
			throw new UnexpectedBehaviourException(e);
		}
	}
	
	protected void generatePluginActivator() throws UnexpectedBehaviourException, InterruptedException{
		Object[] args = new Object[] {myArgs, new ImportUtil(myArgs.getPluginActivatorPackageName(), myArgs.getPluginActivatorClassName()), new ArrayList<String>(myCallbackFigures.keySet())};
		doGenerateJavaClass(myAuxiliaryGenerators.getPluginActivatorEmitter(), myArgs.getPluginActivatorPackageName(), myArgs.getPluginActivatorClassName(), args);		
	}
	
	protected void generatePluginStructure() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateFile(myAuxiliaryGenerators.getBuildPropertiesEmitter(), new Path("build.properties"), myArgs);
		doGenerateFile(myAuxiliaryGenerators.getManifestMFEmitter(), new Path("META-INF/MANIFEST.MF"), myArgs, myProcessor.getRequiredBundles(null));
		doGenerateFile(myAuxiliaryGenerators.getPluginPropertiesEmitter(), new Path("plugin.properties"), myArgs);
	}

	private void generateTopLevelFigures() throws InterruptedException {
		myCallbackFigures.clear(); // just in case
		myProcessor.go(new ProcessorCallback() {
			public String visitFigure(FigureDescriptor f) throws InterruptedException {
				return StandaloneGenerator.this.visitFigure(f);
			}
		}, myArgs);
	}
	
	private String visitFigure(FigureDescriptor figureDescriptor) throws InterruptedException {
		// XXX either use compilationUnitName from Util.ext or pass cu name as template argument
		if (figureDescriptor.getName() == null) {
			throw new IllegalArgumentException("FigureDescriptor needs a name");
		}
		final String compilationUnitName = CodeGenUtil.validJavaIdentifier(CodeGenUtil.capName(figureDescriptor.getName()));  
		doGenerateJavaClass(myFigureGenerator, getPackageName(), compilationUnitName, figureDescriptor);
		final String qualifiedName = composeFQN(getPackageName(), compilationUnitName);
		myCallbackFigures.put(qualifiedName, figureDescriptor);
		return qualifiedName;
	}

	private String getPackageName(){
		return myArgs.getMainPackageName();
	}
	
	private static String composePluginActivatorClassFQN(Config config) {
		String packageName = config.getPluginActivatorPackageName();
		String className = config.getPluginActivatorClassName();
		return composeFQN(packageName, className);
	}

	private static String composeFQN(String packageName, String className){
		return packageName == null || "".equals(packageName) ? className : packageName + "." + className; 
	}
}
