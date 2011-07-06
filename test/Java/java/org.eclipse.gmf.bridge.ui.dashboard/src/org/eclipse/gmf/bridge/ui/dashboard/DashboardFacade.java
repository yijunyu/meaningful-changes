/*
 * Copyright (c) 2006, 2007 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package org.eclipse.gmf.bridge.ui.dashboard;

import org.eclipse.swt.widgets.Shell;

/**
 * EXPERIMENTAL
 * 
 * @author dstadnik
 */
public interface DashboardFacade {

	public static final String LOCATION_DM = "domain_model"; //$NON-NLS-1$

	public static final String LOCATION_DGM = "domain_genmodel"; //$NON-NLS-1$

	public static final String LOCATION_GDM = "graphdef_model"; //$NON-NLS-1$

	public static final String LOCATION_TDM = "tooldef_model"; //$NON-NLS-1$

	public static final String LOCATION_MM = "map_model"; //$NON-NLS-1$

	public static final String LOCATION_GM = "genmodel"; //$NON-NLS-1$

	public static final String LOCATION_MM2GM = "map_model-genmodel"; //$NON-NLS-1$

	public static final String OPTION_RCP = "rcp"; //$NON-NLS-1$

	public DashboardState getState();

	public void updateStatus();

	public boolean isStrict();

	public Shell getShell();
}
