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
package org.eclipse.gmf.internal.validate;


public class DebugOptions {
	/**
	 * This class should not be instantiated because it has only static
	 * features.
	 */
	private DebugOptions() {
		super();
	}

	public static final String DEBUG = GMFValidationPlugin.getPluginId() + "/debug"; //$NON-NLS-1$

	public static final String META_DEFINITIONS = DEBUG + "/meta/definitions"; //$NON-NLS-1$
	public static final String CONSTRAINTS = DEBUG + "/constraints"; //$NON-NLS-1$

	
	public static final String EXCEPTIONS_CATCHING = DEBUG + "/exceptions/catching"; //$NON-NLS-1$
	public static final String EXCEPTIONS_THROWING = DEBUG + "/exceptions/throwing"; //$NON-NLS-1$

	public static final String METHODS_ENTERING = DEBUG + "/methods/entering"; //$NON-NLS-1$
	public static final String METHODS_EXITING = DEBUG + "/methods/exiting"; //$NON-NLS-1$
	
	public static final String CACHE = DEBUG + "/cache"; //$NON-NLS-1$
	
}
