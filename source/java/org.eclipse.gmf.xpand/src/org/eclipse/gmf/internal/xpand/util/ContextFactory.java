/*******************************************************************************
 * Copyright (c) 2006,2007 Eclipse.org
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
		return createXpandContext(resourceManager, null, null, (ClassLoadContext) null);
	}

	public static XpandExecutionContext createXpandContext(ResourceManager resourceManager, Output output, Collection<Variable> globalVars) {
		return createXpandContext(resourceManager, output, globalVars, (ClassLoadContext) null);
	}

	public static XpandExecutionContext createXpandContext(ResourceManager resourceManager, Output output, Collection<Variable> globalVars, ClassLoader context) {
		return createXpandContext(resourceManager, output, globalVars, context == null ? (ClassLoadContext) null : new ClassLoadContext.Naive(context));
	}

	public static XpandExecutionContext createXpandContext(ResourceManager resourceManager, Output output, Collection<Variable> globalVars, ClassLoadContext context) {
		final XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(resourceManager, output, null, globalVars);
		execCtx.setContextClassLoader(context);
		return execCtx;
	}

	public static ExecutionContext createXtendContext(ResourceManager resourceManager) {
		return new ExecutionContextImpl(resourceManager);
	}
}
