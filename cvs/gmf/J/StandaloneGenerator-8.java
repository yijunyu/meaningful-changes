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

import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.common.codegen.ImportAssistant;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.util.FigureQualifiedNameSwitch;
import org.eclipse.gmf.internal.common.codegen.DelegateImportManager;
import org.eclipse.gmf.internal.common.codegen.GeneratorBase;
import org.eclipse.gmf.internal.common.codegen.ImportUtil;

public class StandaloneGenerator extends GeneratorBase {
	private final Config myArgs;
	private final FigureGallery[] myInput;
	private final FigureGenerator myFigureGenerator;
	private DelegateImportManager myMapModeImportHack;
	private final StandaloneEmitters myAuxiliaryGenerators;
	private boolean mySkipPluginStructire;
	private final FigureQualifiedNameSwitch myFigureNameSwitch;
	private final GenerationInfoImpl myGenerationInfo;
	
	public interface GenerationInfo {
		public Config getConfig(); 
		public Enumeration/*<Figure>*/ getProcessedFigures();
		public String getGeneratedClassFQN(Figure figure);
	}
	
	public interface Config {
		public String getPluginID();
		public String getPluginFriendlyName();
		public String getPluginProviderName();
		public String getMainPackageName();

		public String getPluginActivatorClassName();
		public String getPluginActivatorPackageName();

		public boolean needsMapMode();
	}

	public static class ConfigImpl implements Config {
		private final String myPluginId;
		private final String myMainPackageName;
		private final String myPluginFriendlyName;
		private final String myPluginProviderName;
		
		private final String myPluginActivatorClassName;
		private final String myPluginActivatorPackageName;

		private final boolean myNeedsMapMode;
		
		public ConfigImpl(String pluginId, String mainPackageName){
			this(pluginId, mainPackageName, true);
		}

		public ConfigImpl(String pluginId, String mainPackageName, boolean useMapMode) {
			this(pluginId, mainPackageName, pluginId, "", "PluginActivator", (mainPackageName == null ? "" : mainPackageName + ".")  + "activator", useMapMode);
		}

		public ConfigImpl(String pluginId, String mainPackageName, String pluginFriendlyName, String pluginProviderName, String pluginActivatorClassName, String pluginActivatorPackageName, boolean needsMapMode){
			myPluginId = pluginId;
			myMainPackageName = mainPackageName == null ? "" : mainPackageName;
			myPluginFriendlyName = pluginFriendlyName;
			myPluginProviderName = pluginProviderName;
			myPluginActivatorClassName = pluginActivatorClassName;
			myPluginActivatorPackageName = pluginActivatorPackageName;
			myNeedsMapMode = needsMapMode;
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
		
		public boolean needsMapMode() {
			return myNeedsMapMode;
		}
	}

	public StandaloneGenerator(FigureGallery input, Config config, FigureQualifiedNameSwitch fqnSwitch) {
		this(new FigureGallery[] {input}, config, fqnSwitch);
	}

	public StandaloneGenerator(FigureGallery[] input, Config config, FigureQualifiedNameSwitch fqnSwitch) {
		assert input != null && config != null && fqnSwitch != null && !Arrays.asList(input).contains(null);
		myArgs = config;
		myInput = input;
		myFigureNameSwitch = fqnSwitch;
		String pluginActivatorFQN = composePluginActivatorClassFQN(config);
		MapModeCodeGenStrategy strategy;
		if (config.needsMapMode()) {
			myMapModeImportHack = new DelegateImportManager();
			strategy = new MapModeCodeGenStrategy.RuntimeMapModeFromPluginClass(myMapModeImportHack, pluginActivatorFQN);
		} else {
			strategy = new MapModeCodeGenStrategy.StaticIdentityMapMode();
		}
		
		myFigureGenerator = new FigureGenerator(fqnSwitch, strategy);
		myAuxiliaryGenerators = new StandaloneEmitters();
		myGenerationInfo = new GenerationInfoImpl(myArgs);
	}
	
	public GenerationInfo getGenerationInfo() {
		return myGenerationInfo;
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
	
	protected URL getJMergeControlFile() {
		return null;
	}
	
	protected List createReferencedProjectsList() {
		return Collections.EMPTY_LIST;
	}
	
	protected void customRun() throws InterruptedException, UnexpectedBehaviourException {
		initializeEditorProject(myArgs.getPluginID(), createReferencedProjectsList());
		
		if (!mySkipPluginStructire){
			generatePluginStructure();
		}
		try {
			generatePluginActivator();
			generateTopLevelFigures();
		} catch (IllegalStateException e){
			throw new UnexpectedBehaviourException(e);
		}
	}
	
	private void generatePluginActivator() throws UnexpectedBehaviourException, InterruptedException{
		Object[] args = new Object[] {myArgs, new ImportUtil(myArgs.getPluginActivatorPackageName(), myArgs.getPluginActivatorClassName())};
		doGenerateJavaClass(myAuxiliaryGenerators.getPluginActivatorEmitter(), myArgs.getPluginActivatorPackageName(), myArgs.getPluginActivatorClassName(), new Object[] {args});		
	}
	
	private void generatePluginStructure() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateFile(myAuxiliaryGenerators.getBuildPropertiesEmitter(), new Path("build.properties"), new Object[] { myArgs });
		doGenerateFile(myAuxiliaryGenerators.getManifestMFEmitter(), new Path("META-INF/MANIFEST.MF"), new Object[] { new Object[] { myArgs, getRequiredBundles() } });
		doGenerateFile(myAuxiliaryGenerators.getPluginPropertiesEmitter(), new Path("plugin.properties"), new Object[] { myArgs });
	}

	private String[] getRequiredBundles() {
		HashSet rv = new HashSet();
		for (int i = 0; i < myInput.length; i++) {
			if (myInput[i].getImplementationBundle() != null && myInput[i].getImplementationBundle().trim().length() > 0) {
				rv.add(myInput[i].getImplementationBundle());
				}
			String[] additional = myFigureNameSwitch.getDependencies(myInput[i]);
			rv.addAll(Arrays.asList(additional));
		}
		return (String[]) rv.toArray(new String[rv.size()]);
	}

	private void generateTopLevelFigures() throws InterruptedException {
		for (int i = 0; i < myInput.length; i++) {
			for (Iterator it = myInput[i].getFigures().iterator(); it.hasNext();){
				Figure next = (Figure) it.next();
				visitFigure(next);
			}
		}
	}
	
	private void visitFigure(Figure figure) throws InterruptedException {
		final ImportAssistant importAssistant = new ImportUtil(getPackageName(), CodeGenUtil.validJavaIdentifier(figure.getName()));
		Object[] args = new Object[] { figure, importAssistant };
		if (myMapModeImportHack != null) {
			myMapModeImportHack.setDelegate(importAssistant);
		}
		doGenerateJavaClass(myFigureGenerator, getPackageName(), importAssistant.getCompilationUnitName(), args);
		myGenerationInfo.registerFQN(figure, composeFQN(getPackageName(), importAssistant.getCompilationUnitName()));
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
	
	private static class GenerationInfoImpl implements GenerationInfo {
		private final Map myFigure2FQN = new IdentityHashMap();
		private final Config myConfig;
		
		public GenerationInfoImpl(Config config){
			myConfig = config;
		}
		
		public Config getConfig() {
			return myConfig;
		}
		
		public void registerFQN(Figure figure, String fqn){
			myFigure2FQN.put(figure, fqn);
		}
		
		public String getGeneratedClassFQN(Figure figure) {
			return (String)myFigure2FQN.get(figure);
		}
		
		public Enumeration getProcessedFigures() {
			return Collections.enumeration(myFigure2FQN.keySet());
		}
		
	}
	
}
