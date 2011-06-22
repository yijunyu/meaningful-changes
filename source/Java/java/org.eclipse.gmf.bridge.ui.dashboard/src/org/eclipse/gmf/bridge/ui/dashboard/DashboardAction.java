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
package org.eclipse.gmf.bridge.ui.dashboard;

/**
 * EXPERIMENTAL
 * 
 * @author dstadnik
 */
public interface DashboardAction {

	public void init(DashboardFacade context);

	public boolean isEnabled();

	public void run();
}
