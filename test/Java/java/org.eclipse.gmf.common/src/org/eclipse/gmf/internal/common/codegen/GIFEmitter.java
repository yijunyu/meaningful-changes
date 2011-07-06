/**
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    vano - initial API and implementation
 */
package org.eclipse.gmf.internal.common.codegen;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.codegen.jet.JETCompiler;
import org.eclipse.emf.codegen.jet.JETException;

// XXX actually, this is "CopyEmitter" or "AnyFileEmitter" rather than GIFEmitter 
public class GIFEmitter implements BinaryEmitter {
	
	private String myLocation;

	public GIFEmitter(String location) {
		myLocation = location;
	}
	
	public byte[] generate(IProgressMonitor monitor, Object[] args) throws InterruptedException, InvocationTargetException {
		if (monitor != null && monitor.isCanceled()) {
			throw new InterruptedException();
		}
		if (monitor != null) {
			monitor.beginTask(null, 1);
		}
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		try {
			InputStream is = new BufferedInputStream(JETCompiler.openStream(myLocation));
			for (int next = is.read(); next != -1; next = is.read()) {
				outputStream.write(next);
			}
			is.close();
		} catch (IOException e) {
			throw new InvocationTargetException(e);
		} catch (JETException e) {
			throw new InvocationTargetException(e);
		} finally {
			if (monitor != null) {
				monitor.done();
			}
		}
		return outputStream.toByteArray();
	}

}
