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

import java.util.Set;

/**
 * The evaluation environment maintains current values of variables
 * for the evaluation of an expression. Variables are maintained as 
 * key-value pairs with variable name as the key and its value object 
 * as the value part in the pair. 
 */
public interface IEvaluationEnvironment {
	/**
	 * Sets variable value in this environment.
	 * If a variable of the given name already exists, the old value
	 * is replaced.
	 * 
	 * @param name the name which uniquely identifies the variable
	 * @param value the value to which the given variable is to be initialized.
	 * 	Can be <code>null</code>
	 */
	void setVariable(String name, Object value);
	/**
	 * Gets variable value set in this environment.
	 * @param name the name of the variable to query for value
	 * @return the value of the given variable, or <code>null</code> if no 
	 * 	such variable is set in this environment.
	 *	Remark: Use {@link #getVariableNames()} in order to detect if the 
	 *	variable is present in the environment or has <code>null</code> value. 
	 */
	Object getValueOf(String name);
	
	/**
	 * Gets the names of all variables currently set in this environments.
	 * @return set of String objects representing the names, never <code>null</code>   
	 */
	Set<String> getVariableNames();
	
	/**
	 * Removes all variables set in this environment
	 */
	void clear();
}
