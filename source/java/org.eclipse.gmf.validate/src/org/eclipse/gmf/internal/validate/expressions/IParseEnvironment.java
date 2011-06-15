/*
 * Copyright (c) 2005, 2006 Borland Software Corporation
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

import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * The parse environment maintains declarations of variables
 * reuired for successful parsing of an expression. Variables are maintained as 
 * key-value pairs with variable name as the key and type as the value. 
 */
public interface IParseEnvironment {
	/**
	 * Gets the names of all variables currently set in this environments.
	 * @return set of String objects representing the names, never <code>null</code>   
	 */
	Set<String> getVariableNames();
		
	/**
	 * Declare variable in this environment.
	 * If a variable of the given name already exists, the old entry is
	 * is replaced.
	 * 
	 * @param name <code>non-null</code> name which uniquely identifies the variable
	 * @param type <code>non-null</code> type of the declared variable.</p>
	 * 	For non-model types (plain java classes) the client can pass {@link EDataType}
	 * 	classifiers encapsulating the instance class.
	 * @throws IllegalArgumentException if <code>name</code> is not a valid variable name or
	 * 	<code>type</code> is not a valid type classifier.   
	 */
	void setVariable(String name, EClassifier type);
	
	/**
	 * Gets the type of the given variable.
	 * 
	 * @param name the name of the variable declared in this environment
	 * @return 
	 */
	EClassifier getTypeOf(String name);	

	/**
	 * Gets package registry to be used for external model import.
	 * @return the registry or <code>null</code> of no registry is set in this environment. 
	 * @see #setImportRegistry(org.eclipse.emf.ecore.EPackage.Registry)
	 */
	EPackage.Registry getImportRegistry();

	/**
	 * Sets optional package registry with pre-initialized model packages to be 
	 * available in this environment.
	 */
	void setImportRegistry(EPackage.Registry registry);
	
	/**
	 * Removes all variables set in this environment and sets the import registry to <code>null</code>
	 */	
	void clear();	
}
