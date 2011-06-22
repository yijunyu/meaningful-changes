/*
 * Copyright (c) 2005, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common.codegen;

import org.eclipse.osgi.util.NLS;

// XXX try package-local class as it doesn't need to be exposed
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.gmf.internal.common.codegen.messages"; //$NON-NLS-1$

	private Messages() {
	}

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	public static String merge;

	public static String interrupted;

	public static String unexpected;

	public static String problems; 

	public static String initproject;

	public static String start;

	public static String exception;

	public static String organizeImportsFail;
}
