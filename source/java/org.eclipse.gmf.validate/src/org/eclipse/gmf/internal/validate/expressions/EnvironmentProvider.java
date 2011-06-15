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

import java.util.HashMap;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

/**
 * This class provides the client with parsing and evaluation environments.
 */
public class EnvironmentProvider {
	
	// no instances
	private EnvironmentProvider() {
	}
	
	/**
	 * Creates environment for parsing an expression.
	 * @return the empty environment instance
	 */
	public static IParseEnvironment createParseEnv() {
		return new EnvImpl();
	}

	/**
	 * Creates environment for evaluating an expression.
	 * @return the empty evaluation environment instance
	 */	
	public static IEvaluationEnvironment createEvaluationEnv() {
		return new EvalEnvImpl();
	}
		

	private static class EnvImpl extends HashMap<String, EClassifier> implements IParseEnvironment {
		private static final long serialVersionUID = 5282996418130231176L;
		
		private EPackage.Registry importReg;		
		EnvImpl() {
			super(5);			
		}
		
		public void setVariable(String name, EClassifier type) {
			if(type == null || type.getName() == null) {
				throw new IllegalArgumentException("Invalid EClassifier passed:" + type); //$NON-NLS-1$
			}
			if(name == null) {
				throw new IllegalArgumentException("null variable name passed"); //$NON-NLS-1$
			}
			
			put(name, type);
		}
		
		public EClassifier getTypeOf(String name) {		
			return get(name);
		}
		
		public Set<String> getVariableNames() {		
			return keySet();
		}
		
		public void clear() {		
			super.clear();
			importReg = null;
		}
		
		public EPackage.Registry getImportRegistry() {
			return importReg;
		}

		public void setImportRegistry(EPackage.Registry importReg) {
			this.importReg = importReg;
		}
	}
	
	private static class EvalEnvImpl extends HashMap<String, Object> implements IEvaluationEnvironment {
		private static final long serialVersionUID = 9087665669257460401L;

		EvalEnvImpl() {
			super(5);
		}
		
		public void setVariable(String name, Object value) {
			put(name, value);
		}
		
		public Object getValueOf(String name) {
			return get(name);
		}
		
		public Set<String> getVariableNames() {		
			return keySet();
		}		
		
		public void clear() {		
			super.clear();
		}
	}	
}
