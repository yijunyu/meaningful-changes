/*
 * Copyright (c) 2006 Borland Software Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.common;

/**
 * Checked flavor of {@link java.lang.IllegalStateException}.
 * @author artem
 */
public class UnexpectedBehaviourException extends Exception {
	private static final long serialVersionUID = 3762812684185579574L;

	public UnexpectedBehaviourException(String message) {
		super(message);
	}

	public UnexpectedBehaviourException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnexpectedBehaviourException(Throwable cause) {
		super(cause);
	}
}
