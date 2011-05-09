/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
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

	public char[] toCharArray(Reader input) throws IOException {
		return toCharWriter(input).toCharArray();
	}

	public char[] toCharArray(IFile file) throws CoreException, UnsupportedEncodingException, IOException {
		InputStream is = null;
		try {
			is = file.getContents();
			return toCharArray(is, Charset.forName(file.getCharset(true)));
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException ex) {
					Activator.logError(ex);
				}
			}
		}
	}

	public char[] toCharArray(InputStream is, Charset charSet) throws IOException {
		return toCharWriter(new InputStreamReader(is, charSet)).toCharArray();
	}

	/**
	 * @param input it's invoker's responsibility to close input
	 * @return writer full of data taken from input
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
