/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;

/**
 * @author artem
 */
public class JETEmitterAdapter implements TextEmitter {
	private final JETEmitter myEmitter;

	public JETEmitterAdapter(JETEmitter emitter){
		myEmitter = emitter;
	}
	
	public String generate(IProgressMonitor monitor, Object[] params) throws InterruptedException, InvocationTargetException {
		try {
			if (monitor != null && monitor.isCanceled()) {
				throw new InterruptedException();
			}
			return myEmitter.generate(monitor, adaptArgumentsForSkeleton(params));
		} catch (JETException ex) {
			throw new InvocationTargetException(ex);
		}
	}

	/**
	 * JET's generate() method usually takes single argument as input, unless overriden in skeleton 
	 */
	protected Object[] adaptArgumentsForSkeleton(Object[] params) {
		if (params == null || params.length <= 1) {
			return params;
		}
		// more than one argument, hence need to wrap into single object
		return new Object[] { params };
	}
}
