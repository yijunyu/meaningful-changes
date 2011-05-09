/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.util;

import java.util.Collection;

import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContextImpl;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.model.Output;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContextImpl;

/**
 * TODO remove?
 * @author artem
 */
public class ContextFactory {

	public static XpandExecutionContext createXpandContext(ResourceManager resourceManager) {
		return new XpandExecutionContextImpl(resourceManager, null, null);
	}

	public static XpandExecutionContext createXpandContext(ResourceManager resourceManager, Output output, Collection<Variable> globalVars) {
		return new XpandExecutionContextImpl(resourceManager, output, null, globalVars);
	}

	public static ExecutionContext createXtendContext(ResourceManager resourceManager) {
		return new ExecutionContextImpl(resourceManager);
	}
}
