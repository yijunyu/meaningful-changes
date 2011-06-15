/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.lite.popup.actions;

import org.eclipse.gmf.internal.codegen.popup.actions.ExecuteTemplatesAction;
import org.eclipse.gmf.internal.codegen.popup.actions.ExecuteTemplatesOperation;

/**
 * @author artem
 */
public class ExecuteLiteTemplatesAction extends ExecuteTemplatesAction {

	protected ExecuteTemplatesOperation createOperation() {
		return new ExecuteLiteTemplatesOperation();
	}
}
