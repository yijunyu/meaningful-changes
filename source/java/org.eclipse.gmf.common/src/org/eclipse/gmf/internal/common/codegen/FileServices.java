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

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;

/**
 * @author artem
 */
class FileServices {

	public static String getFileContents(IFile file) {
		StringBuffer contents = new StringBuffer();
		char[] buffer = new char[1024];
		int count;
		try {
			Reader in = new InputStreamReader(file.getContents(true), file.getCharset());
			try {
				while ((count = in.read(buffer)) > 0) {
					contents.append(buffer, 0, count);
				}
			} finally {
				in.close();
			}
		} catch (CoreException ce) {
			ce.printStackTrace();
			return null;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
		return contents.toString();
	}

	/**
	 * @return <code>true</code> if the file contains the input stream contents
	 */
//	public static boolean contains(IFile f, InputStream is) {
//		int fc = 0;
//		int ic = 0;
//		InputStream fs = null;
//		try {
//			fs = f.getContents(true);
//			while ((fc = fs.read()) == (ic = is.read()) && fc >= 0);
//		} catch (CoreException ce) {
//		} catch (IOException ioe) {
//		} finally {
//			if (fs != null) {
//				try {
//					fs.close();
//				} catch (IOException ioe) {
//				}
//			}
//		}
//		return fc <0 && ic < 0;
//	}

}
