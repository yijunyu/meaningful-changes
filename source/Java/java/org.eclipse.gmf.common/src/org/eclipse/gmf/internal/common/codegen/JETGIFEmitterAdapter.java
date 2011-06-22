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
package org.eclipse.gmf.internal.common.codegen;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.codegen.util.GIFEmitter;
import org.eclipse.gmf.common.UnexpectedBehaviourException;

/**
 * Odd name, true. Adapts GIFEmitter from JET to BinaryEmitter.
 * Knows that GIFEmitter takes up to two string arguments and tries to get such parameters from passed arguments.
 * @author artem
 */
public class JETGIFEmitterAdapter implements BinaryEmitter {
	private final GIFEmitter myJETGIFEmitter;

	public JETGIFEmitterAdapter(GIFEmitter jetGIFEmitter) {
		assert jetGIFEmitter != null;
		myJETGIFEmitter = jetGIFEmitter;
	}

	public byte[] generate(IProgressMonitor monitor, Object[] args) throws InterruptedException, InvocationTargetException, UnexpectedBehaviourException {
		String key1 = null;
		String key2 = null;
		if (args != null && args.length > 0 && args[0] instanceof String) {
			key1 = (String) args[0];
			if (args.length > 1 && args[1] instanceof String) {
				key2 = (String) args[1];
			}
		}
		return myJETGIFEmitter.generateGIF(key1, key2);
	}
}
