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
public class DashboardState {

	public String dmFileName;

	public String dgmFileName;

	public String gdmFileName;

	public String tdmFileName;

	public String mmFileName;

	public String gmFileName;

	public int getModelsCount() {
		return 6;
	}

	public int getSpecifiedModelsCount() {
		int count = 0;
		if (dmFileName != null) {
			count++;
		}
		if (dgmFileName != null) {
			count++;
		}
		if (gdmFileName != null) {
			count++;
		}
		if (tdmFileName != null) {
			count++;
		}
		if (mmFileName != null) {
			count++;
		}
		if (gmFileName != null) {
			count++;
		}
		return count;
	}
}
