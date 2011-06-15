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

/**
 * Base names dispenser implementation.
 * 
 * @author dstadnik
 */
public abstract class AbstractNamesDispenser implements NamesDispenser {

	protected abstract Collection<String> getNamesPool();

	protected static String composeName(String prefixPart, String semanticPart, String suffixPart) {
		String s = suffixPart == null ? semanticPart : semanticPart + suffixPart;
		return prefixPart == null ? s : prefixPart + s;
	}

	public boolean contains(String name) {
		return getNamesPool().contains(name);
	}

	public final String get(String semanticPart, String suffixPart) {
		return get(null, semanticPart, suffixPart);
	}

	public final String get(String semanticPart) {
		return get(null, semanticPart, null);
	}

	public boolean add(String name) {
		return getNamesPool().add(name);
	}

	public void clear() {
		getNamesPool().clear();
	}
}
