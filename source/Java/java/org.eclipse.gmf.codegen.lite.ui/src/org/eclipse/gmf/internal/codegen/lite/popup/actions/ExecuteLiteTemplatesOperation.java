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
package org.eclipse.gmf.internal.codegen.lite.popup.actions;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.internal.codegen.lite.Generator;
import org.eclipse.gmf.internal.codegen.popup.actions.ExecuteTemplatesOperation;

/**
 * @author dstadnik
 */
public class ExecuteLiteTemplatesOperation extends ExecuteTemplatesOperation {

	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		Generator g = new Generator(getGenModel());
		g.run(monitor);
		myRunStatus = g.getRunStatus();
	}
}
