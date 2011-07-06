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
package org.eclipse.gmf.internal.codegen.dispatch;

/**
 * @author artem
 */
public class NoSuchTemplateException extends Exception {

	private static final long serialVersionUID = -1892646974029705702L;

	/**
	 * @param templateName
	 */
	public NoSuchTemplateException(String templateName) {
		super(templateName);
	}

	/**
	 * @param templateName
	 * @param cause
	 */
	public NoSuchTemplateException(String templateName, Throwable cause) {
		super(templateName, cause);
	}

}
