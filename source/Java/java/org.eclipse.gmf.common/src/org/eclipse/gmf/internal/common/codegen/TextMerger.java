/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
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

	public String mergePluginXML(String oldText, String newText) {
		return newText;
	}

	public String mergeManifestMF(String oldText, String newText) {
		return newText;
	}

	public String process(String fileName, String oldText, String newText) {
		if (fileName == null) {
			return newText;
		}
		if (fileName.endsWith(".java")) {
			return mergeJava(oldText, newText);
		} else if (fileName.endsWith(".xml")) {
			if (fileName.equals("plugin.xml")) {
				return mergePluginXML(oldText, newText);
			}
			return mergeXML(oldText, newText);
		} else if (fileName.endsWith(".properties")) {
			return mergeProperties(oldText, newText);
		} else if (fileName.equals("MANIFEST.MF")) {
			return mergeManifestMF(oldText, newText);
		}
		return newText;
	}
}
