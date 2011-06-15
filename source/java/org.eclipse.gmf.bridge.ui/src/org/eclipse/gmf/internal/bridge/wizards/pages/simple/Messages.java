/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.wizards.pages.simple;

import org.eclipse.osgi.util.NLS;

/**
 * @author dstadnik
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.gmf.internal.bridge.wizards.pages.simple.messages"; //$NON-NLS-1$

	private Messages() {
	}

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	public static String DefinitionPageDefaults;

	public static String DefinitionPageDeselectAll;

	public static String DefinitionPageElement;

	public static String DefinitionPageElementsToProcess;

	public static String DiagramElementSelectorElement;

	public static String DiagramElementSelectorExContainedNodes;

	public static String DiagramElementSelectorExLinks;

	public static String DiagramElementSelectorNoName;

	public static String GraphDefBuilder0;

	public static String GraphDefBuilder1;

	public static String GraphDefBuilder5;

	public static String GraphDefBuilder6;

	public static String ToolDefBuilder0;

	public static String ToolDefBuilder1;
}
