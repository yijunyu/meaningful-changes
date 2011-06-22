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
 *    Artem Tikhomirov (Borland) - redesigned as enumeration
 */
package org.eclipse.gmf.graphdef.codegen;

/**
 * @author artem
 */
public enum MapModeCodeGenStrategy { 
	STATIC(""), 
	DYNAMIC("rt_mm");

	private final String token;

	private MapModeCodeGenStrategy(String token) {
		assert token != null;
		this.token = token;
	}

	/**
	 * @return identifying token of this strategy 
	 */
	public String getToken() {
		return token;
	}
}
