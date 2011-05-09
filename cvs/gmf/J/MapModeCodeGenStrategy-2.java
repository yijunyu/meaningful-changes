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

import org.eclipse.gmf.common.codegen.ImportAssistant;

public abstract class MapModeCodeGenStrategy {
	private final ImportAssistant myImportAssistant;

	public abstract String LPtoDP(int logicalUnit);
	public abstract String DPtoLP(int deviceUnit);
	
	public MapModeCodeGenStrategy(ImportAssistant importAssistant){
		myImportAssistant = importAssistant;
	}
	
	public ImportAssistant getImportAssistant() {
		return myImportAssistant;
	}
	
	public static class StaticIdentityMapMode extends MapModeCodeGenStrategy {
		public StaticIdentityMapMode(ImportAssistant importAssistant){
			super(importAssistant);
		}
		
		public String DPtoLP(int deviceUnit) {
			return String.valueOf(deviceUnit);
		}
		
		public String LPtoDP(int logicalUnit) {
			return String.valueOf(logicalUnit);
		}
	}
	
	public static class RuntimeUnspecifiedMapMode extends MapModeCodeGenStrategy {
		public RuntimeUnspecifiedMapMode(ImportAssistant importAssistant){
			super(importAssistant);
		}
		
		public String DPtoLP(int deviceUnit) {
			StringBuffer result = new StringBuffer();
			result.append(getMapModeAccessor());
			result.append('.');
			result.append("DPtoLP(");
			result.append(deviceUnit);
			result.append(')');
			return result.toString();
		}
		
		public String LPtoDP(int logicalUnit) {
			StringBuffer result = new StringBuffer();
			result.append(getMapModeAccessor());
			result.append('.');
			result.append("LPtoDP(");
			result.append(logicalUnit);
			result.append(')');
			return result.toString();
		}

		protected String getMapModeAccessor(){
			return "getMapMode()";
		}
	}
	
	public static class RuntimeMapModeFromPluginClass extends RuntimeUnspecifiedMapMode {
		private final String myPluginActivatorClassFQN;

		public RuntimeMapModeFromPluginClass(ImportAssistant importAssistant, String pluginActivatorClassFQN){
			super(importAssistant);
			myPluginActivatorClassFQN = pluginActivatorClassFQN;
		}
		
		protected String getMapModeAccessor() {
			StringBuffer result = new StringBuffer();
			result.append(getImportAssistant().getImportedName(myPluginActivatorClassFQN));
			result.append('.');
			result.append("getDefault().getMapMode()");
			return result.toString();
		}
	}
}
