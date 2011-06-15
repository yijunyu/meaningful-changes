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

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Names dispenser that generates unique names by appending
 * ascending numbers to the semantic part.
 * 
 * @author dstadnik
 */
public class IncrementalNamesDispenser extends AbstractNamesDispenser {

	private Set<String> namesPool = new HashSet<String>();

	private int initialIndex;

	public IncrementalNamesDispenser() {
		initialIndex = 2;
	}

	public IncrementalNamesDispenser(int initialIndex) {
		this.initialIndex = initialIndex;
	}

	protected final Collection<String> getNamesPool() {
		return namesPool;
	}

	public String get(String prefixPart, String semanticPart, String suffixPart) {
		String name = composeName(prefixPart, semanticPart, suffixPart);
		if (!contains(name)) {
			add(name);
			return name;
		}
		for (int i = initialIndex; i <= Integer.MAX_VALUE; i++) {
			name = composeName(prefixPart, semanticPart + i, suffixPart);
			if (!contains(name)) {
				add(name);
				return name;
			}
		}
		throw new IllegalStateException();
	}
}
