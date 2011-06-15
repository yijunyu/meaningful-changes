/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.wizards.strategy;

import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.eclipse.emf.ecore.ENamedElement;

/**
 * Removes elements that don't match specified patterns 
 * @author artem
 */
public class NameFilterStrategy implements Strategy<ENamedElement> {
	private final Pattern[] myPatterns;

	/**
	 * @param namePatterns - regexp. <code>IllegalArgumentException</code> is thrown is some pattern is illegal
	 * @throws IllegalArgumentException 
	 */
	public NameFilterStrategy(String[] namePatterns) {
		assert namePatterns != null && namePatterns.length > 1;
		myPatterns = new Pattern[namePatterns.length];
		try {
			for (int i = 0; i < namePatterns.length; i++) {
				myPatterns[i] = Pattern.compile(namePatterns[i]);
			}
		} catch (PatternSyntaxException ex) {
			throw new IllegalArgumentException(ex.getMessage());
		}
	}

	public String getID() {
		return "nameFilter";
	}

	/**
	 * @param soFar - expects <code>List&lt;ENamedElement&gt;</code>
	 */
	public void filter(Collection<ENamedElement> soFar, Hierarchy hierarchy) {
		for (Iterator<ENamedElement> it = soFar.iterator(); it.hasNext();) {
			if (!match(it.next().getName())) {
				it.remove();
			}
		}
	}

	protected boolean match(String name) {
		if (name == null)
		for (int i = 0; i < myPatterns.length; i++) {
			if (myPatterns[i].matcher(name).matches()) {
				return true;
			}
		}
		return false;
	}
}
