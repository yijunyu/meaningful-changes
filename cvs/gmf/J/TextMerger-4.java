/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitri Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common.codegen;

/**
 * @author dstadnik
 */
public class TextMerger {
	public String mergeJava(String oldText, String newText) {
		return newText;
	}

	public String mergeProperties(String oldText, String newText) {
		return newText;
	}

	public String mergeXML(String oldText, String newText) {
		return newText;
	}

	public String process(String fileNameExt, String oldText, String newText) {
		if ("java".equals(fileNameExt)) {
			return mergeJava(oldText, newText);
		} else if ("xml".equals(fileNameExt)) {
			return mergeXML(oldText, newText);
		} else if ("properties".equals(fileNameExt)) {
			return mergeProperties(oldText, newText);
		}
		return newText;
	}
}
