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

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.common.codegen.ImportAssistant;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.util.FigureQualifiedNameSwitch;
import org.eclipse.gmf.internal.common.codegen.DefaultTextMerger;
import org.eclipse.gmf.internal.common.codegen.DelegateImportManager;
import org.eclipse.gmf.internal.common.codegen.GeneratorBase;
import org.eclipse.gmf.internal.common.codegen.ImportUtil;
import org.eclipse.gmf.internal.common.codegen.TextEmitter;
import org.eclipse.gmf.internal.common.codegen.TextMerger;

public class StandaloneGenerator extends GeneratorBase {
	protected final Config myArgs;
	private final TextEmitter myFigureGenerator;
	private DelegateImportManager myMapModeImportHack;
	private final StandaloneEmitters myAuxiliaryGenerators;
	private boolean mySkipPluginStructire;
	protected final FigureQualifiedNameSwitch myFigureNameSwitch;
	protected Processor myProcessor;
	
	public interface Config {
		public String getPluginID();
		public String getPluginFriendlyName();
		public String getPluginProviderName();
		public String getMainPackageName();

		public String getPluginActivatorClassName();
		public String getPluginActivatorPackageName();

		public boolean needsMapMode(); // FIXME remove
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

	public static abstract class Processor {
		public abstract void go(ProcessorCallback callback, Config config) throws InterruptedException ;

		public String[] getRequiredBundles(FigureQualifiedNameSwitch fqnSwitch) {
			return new String[0];
		}
	}

	public interface ProcessorCallback {
		public String visitFigure(Figure f) throws InterruptedException;
	}


	public StandaloneGenerator(Processor p, Config config, FigureQualifiedNameSwitch fqnSwitch) {
		assert p != null && config != null && fqnSwitch != null;
		myArgs = config;
		myProcessor = p;
		myFigureNameSwitch = fqnSwitch;
		String pluginActivatorFQN = composePluginActivatorClassFQN(config);
		MapModeCodeGenStrategy strategy;
		if (config.needsMapMode()) {
			myMapModeImportHack = new DelegateImportManager();
			strategy = MapModeCodeGenStrategy.DYNAMIC;
		} else {
			strategy = MapModeCodeGenStrategy.StaticIdentity;
		}
		
		myFigureGenerator = createFigureGenerator(fqnSwitch, strategy);
		myAuxiliaryGenerators = new StandaloneEmitters();
	}

	protected TextEmitter createFigureGenerator(FigureQualifiedNameSwitch fqnSwitch, MapModeCodeGenStrategy strategy) {
		return new FigureGenerator(fqnSwitch, strategy, false);
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
			generatePluginActivator();
			generateTopLevelFigures();
		} catch (IllegalStateException e){
			throw new UnexpectedBehaviourException(e);
		}
	}
	
	protected void generatePluginActivator() throws UnexpectedBehaviourException, InterruptedException{
		Object[] args = new Object[] {myArgs, new ImportUtil(myArgs.getPluginActivatorPackageName(), myArgs.getPluginActivatorClassName())};
		doGenerateJavaClass(myAuxiliaryGenerators.getPluginActivatorEmitter(), myArgs.getPluginActivatorPackageName(), myArgs.getPluginActivatorClassName(), new Object[] {args});		
	}
	
	protected void generatePluginStructure() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateFile(myAuxiliaryGenerators.getBuildPropertiesEmitter(), new Path("build.properties"), new Object[] { myArgs });
		doGenerateFile(myAuxiliaryGenerators.getManifestMFEmitter(), new Path("META-INF/MANIFEST.MF"), new Object[] { new Object[] { myArgs, myProcessor.getRequiredBundles(myFigureNameSwitch) } });
		doGenerateFile(myAuxiliaryGenerators.getPluginPropertiesEmitter(), new Path("plugin.properties"), new Object[] { myArgs });
	}

	private void generateTopLevelFigures() throws InterruptedException {
		myProcessor.go(new ProcessorCallback() {
			public String visitFigure(Figure f) throws InterruptedException {
				return StandaloneGenerator.this.visitFigure(f);
			}
		}, myArgs);
	}
	
	private String visitFigure(Figure figure) throws InterruptedException {
		final ImportAssistant importAssistant = new ImportUtil(getPackageName(), CodeGenUtil.validJavaIdentifier(figure.getName()));
		Object[] args = new Object[] { figure, importAssistant };
		if (myMapModeImportHack != null) {
			myMapModeImportHack.setDelegate(importAssistant);
		}
		doGenerateJavaClass(myFigureGenerator, getPackageName(), importAssistant.getCompilationUnitName(), args);
		return composeFQN(getPackageName(), importAssistant.getCompilationUnitName());
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
