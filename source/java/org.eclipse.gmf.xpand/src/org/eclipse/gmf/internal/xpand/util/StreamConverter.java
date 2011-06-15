/*******************************************************************************
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.util;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.gmf.internal.xpand.Activator;

/**
 * @author artem
 */
public class StreamConverter {

	/**
	 * If this method completes successfully, whole input will be consumed, however, it won't be
	 * 'closed', so it's up to invoker to close the input
	 * @throws IOException
	 */
	public char[] toCharArray(Reader input) throws IOException {
		return toCharWriter(input).toCharArray();
	}

	/**
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public char[] toCharArray(IFile file) throws CoreException, UnsupportedEncodingException, IOException {
		Reader r = null;
		try {
			r = toContentsReader(file);
			return toCharArray(r);
		} finally {
			if (r != null) {
				try {
					r.close();
				} catch (IOException ex) {
					Activator.logError(ex);
				}
			}
		}
	}

	/**
	 * It's caller's responsibility to close reader once it's no longer needed
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	public Reader toContentsReader(IFile file) throws CoreException, UnsupportedEncodingException {
		InputStream is = file.getContents();
		return new InputStreamReader(is, Charset.forName(file.getCharset(true)));
	}

	/**
	 * @param input it's invoker's responsibility to close input
	 * @return writer full of data taken from input
	 * @throws IOException
	 */
	public CharArrayWriter toCharWriter(Reader input) throws IOException {
		CharArrayWriter buffer = new CharArrayWriter(4096);
		int r;
		char[] cbuf = new char[4096];
		while ((r = input.read(cbuf)) != -1) {
			buffer.write(cbuf, 0, r);
		}
		return buffer;
	}
}
