/*
 * Copyright (c) 2006, 2007 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 *    Artem Tikhomirov (Borland) reorganized Map->Gen action
 */
package org.eclipse.gmf.internal.codegen.lite.dashboard;

import org.eclipse.gmf.internal.bridge.transform.TransformOptions;
import org.eclipse.gmf.internal.bridge.ui.dashboard.actions.TransformMap2GenModelAction;

public class GenerateLiteGMAction extends TransformMap2GenModelAction {

	protected void configureOptions(TransformOptions options) {
		super.configureOptions(options);
		options.setUseRuntimeFigures(false);
		options.setUseMapMode(false);
	}
}
