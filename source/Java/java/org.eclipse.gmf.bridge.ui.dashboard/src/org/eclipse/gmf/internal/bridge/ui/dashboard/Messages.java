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
package org.eclipse.gmf.internal.bridge.ui.dashboard;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.gmf.internal.bridge.ui.dashboard.messages"; //$NON-NLS-1$

	public static String DashboardFigure_DGM;

	public static String DashboardFigure_GDM;

	public static String DashboardFigure_DM;

	public static String DashboardFigure_TDM;

	public static String DashboardFigure_MM;

	public static String DashboardFigure_GM;

	public static String DashboardMediator_Select;

	public static String DashboardMediator_Edit;

	public static String DashboardMediator_Project;

	public static String DashboardMediator_Progress;

	public static String DashboardMediator_FailToOpen;

	public static String DashboardMediator_Reload;

	public static String DashboardMediator_Create;

	public static String DashboardMediator_Derive;

	public static String DashboardMediator_Combine;

	public static String DashboardMediator_SelectProject;

	public static String DashboardMediator_Transform;

	public static String DashboardMediator_RCP;

	public static String DashboardPart_Synchronize;

	public static String DashboardPart_SynchronizeSelection;

	public static String ModelFigure_NoName;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
