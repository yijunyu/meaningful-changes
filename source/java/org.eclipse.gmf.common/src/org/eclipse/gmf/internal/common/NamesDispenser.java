/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package org.eclipse.gmf.internal.common;

/**
 * Maintains names pool and provides names accordingly to some convention.
 * 
 * @author dstadnik
 */
public interface NamesDispenser {

	/**
	 * @return true if the name was dispensed
	 */
	public boolean contains(String name);

	/**
	 * Dispenses a name. Returned name is added to the pool of dispensed names.
	 * 
	 * @param prefixPart prefix of the name, null means no prefix
	 * @param semanticPart middle part of the name
	 * @param suffixPart suffix of the name, null means no suffix
	 * @return a name
	 */
	public String get(String prefixPart, String semanticPart, String suffixPart);

	/**
	 * Dispenses a name with null prefix.
	 */
	public String get(String semanticPart, String suffixPart);

	/**
	 * Dispenses a name with null prefix and suffix.
	 */
	public String get(String semanticPart);

	/**
	 * Notifies dispenser that the name should be considered being dispensed.
	 * 
	 * @return true if the name was not dispensed before
	 */
	public boolean add(String name);

	/**
	 * Clears all dispensed names data
	 */
	public void clear();
}
