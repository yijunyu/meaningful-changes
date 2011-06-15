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
package org.eclipse.gmf.internal.common.ui;

import org.eclipse.osgi.util.NLS;

/**
 * @author dstadnik
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.gmf.internal.common.ui.messages"; //$NON-NLS-1$

	public static String CreateNewModelExtensionCreateNewModel;

	public static String ModelSelectionPageBadURI;

	public static String ModelSelectionPageBrowseFS;

	public static String ModelSelectionPageBrowseWS;

	public static String ModelSelectionPageErrorLoadingModel;

	public static String ModelSelectionPageFindInWS;

	public static String ModelSelectionPageLoad;

	public static String ModelSelectionPageModelNA;

	public static String ModelSelectionPageModelURI;

	public static String ModelSelectionPageSelectModel;

	public static String ModelSelectionPageSelectModelDesc;

	public static String PredefinedModelExtensionPredefinedModels;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
