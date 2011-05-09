/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common.codegen;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.common.codegen.ImportAssistant;
import org.eclipse.gmf.internal.xpand.BufferOutput;
import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.XpandFacade;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;
import org.eclipse.gmf.internal.xpand.util.ContextFactory;

/**
 * @author artem
 */
public class XpandTextEmitter implements TextEmitter {
	private final ResourceManager myResourceManager;
	private final String myTemplateFQN;
	private final ClassLoader myContext;

	public XpandTextEmitter(ResourceManager manager, String templateFQN, ClassLoader context) {
		assert manager != null && templateFQN != null;
		myResourceManager = manager;
		myTemplateFQN = templateFQN;
		myContext = context;
	}

	public String generate(IProgressMonitor monitor, Object[] arguments) throws InterruptedException, InvocationTargetException, UnexpectedBehaviourException {
		StringBuilder result = new StringBuilder();
		// JET gets single Object as an argument, and that's Object[] {diagram, importUtil} in our case.
		// FIXME it's JETEmitterAdapter's role to wrap Object[] into single Object passed to emitter, not XpandEmitter's
		Object[] actualArguments = arguments != null && arguments.length == 1 && arguments[0] instanceof Object[] ? (Object[]) arguments[0] : arguments;
		new XpandFacade(createContext(result)).evaluate(myTemplateFQN, extractTarget(actualArguments), extractArguments(actualArguments));
		return result.toString();
	}

	protected Object extractTarget(Object[] arguments) {
		assert arguments != null && arguments.length > 0;
		return arguments[0];
	}

	protected Object[] extractArguments(Object[] arguments) {
		assert arguments != null && arguments.length > 0;
		ArrayList<Object> res = new ArrayList<Object>(arguments.length);
		// strip first one off, assume it's target
		for (int i = 1; i < arguments.length; i++) {
			if (false == arguments[i] instanceof ImportAssistant) {
				// strip assistant off
				res.add(arguments[i]);
			}
		}
		return res.toArray();
	}

	private XpandExecutionContext createContext(StringBuilder result) {
		final BufferOutput output = new BufferOutput(result);
		final List<Variable> globals = Collections.emptyList();
		return ContextFactory.createXpandContext(myResourceManager, output, globals, myContext);
	}
}