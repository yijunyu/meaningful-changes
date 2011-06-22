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
package org.eclipse.gmf.internal.bridge.wizards;

import org.eclipse.osgi.util.NLS;

/**
 * @author dstadnik
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.gmf.internal.bridge.wizards.messages"; //$NON-NLS-1$

	private Messages() {
	}

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	public static String SimpleModelWizardDomainModelSelectionPageTitle;

	public static String SimpleModelWizardDomainModelSelectionPageDesc;

	public static String SimpleModelWizardGraphModelSelectionPageTitle;

	public static String SimpleModelWizardGraphModelSelectionPageDesc;

	public static String SimpleModelWizardGraphDefinitionPageTitle;

	public static String SimpleModelWizardGraphDefinitionPageDesc;

	public static String SimpleModelWizardToolDefinitionPageDesc;

	public static String SimpleModelWizardToolDefinitionPageTitle;

	public static String SimpleModelWizardToolModelSelectionPageDesc;

	public static String SimpleModelWizardToolModelSelectionPageTitle;

	public static String WizardUtilUnableToOpenEditor;
}
