/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.util;

import java.util.Map;

import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContextImpl;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.model.Output;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContextImpl;

/**
 * @author artem
 */
public class ContextFactory {

	public static XpandExecutionContext createXpandContext(ResourceManager resourceManager) {
		return new XpandExecutionContextImpl(resourceManager, null, null);
	}

	// FIXME no much sense in GlobalVarsMap<String, Varaible<String, value>> - nobody cares about variable's name in this case
	public static XpandExecutionContext createXpandContext(ResourceManager resourceManager, Output output, Map<String, Variable> globalVars) {
		return new XpandExecutionContextImpl(resourceManager, output, null, globalVars);
	}

	public static ExecutionContext createXtendContext(ResourceManager resourceManager) {
		return new ExecutionContextImpl(resourceManager);
	}
}
