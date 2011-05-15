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

package org.eclipse.gmf.internal.graphdef.codegen.ui;

import org.eclipse.gmf.graphdef.codegen.standalone.StandaloneGeneratorConfig;

public class StandaloneGeneratorConfigAdapter implements StandaloneGeneratorConfig {
	private final ConverterSection mySection;

	public StandaloneGeneratorConfigAdapter(ConverterSection section){
		mySection = section;
		getPluginActivatorClassName();
	}
	
	public String getMainPackageName() {
		return mySection.getStringOption(ConverterSection.OPTION_MAIN_PACKAGE_NAME);
	}
	
	public String getPluginActivatorClassName() {
		String activatorFQN = mySection.getPluginActivatorClassFQN();
		if (activatorFQN == null){
			activatorFQN = "";
		}
		return extractClassName(activatorFQN);
	}
	
	public String getPluginActivatorPackageName() {
		String activatorFQN = mySection.getPluginActivatorClassFQN();
		if (activatorFQN == null){
			activatorFQN = "";
		}
		return extractPackageName(activatorFQN);
	}
	
	public String getPluginFriendlyName() {
		return notNull(mySection.getPluginFriendlyName());
	}
	
	public String getPluginID() {
		return notNull(mySection.getPluginID());
	}
	
	public String getPluginProviderName() {
		return notNull(mySection.getPluginProviderName());
	}
	
	public boolean needsMapMode() {
		return mySection.getBooleanOption(ConverterSection.OPTION_NEEDS_MAP_MODE);
	}
	
	/**
	 * FIXME: this does not work if fqn is inner class
	 * However, default PDE plugin generator treats any input string this way  
	 */
	private static String extractPackageName(String fqn){
		int lastDot = fqn.lastIndexOf('.');
		return lastDot < 0 ? "" : fqn.substring(0, lastDot);
	}
	
	/**
	 * @see StandaloneGeneratorConfigAdapter#extractPackageName(String)
	 */
	private static String extractClassName(String fqn){
		int lastDot = fqn.lastIndexOf('.');
		return lastDot < 0 ? fqn : fqn.substring(lastDot + ".".length());
	}
	
	private static String notNull(String text){
		return text == null ? "" : text;
	}

}