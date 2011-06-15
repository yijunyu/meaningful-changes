/**
 * Copyright (c) 2007 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 * Represents the severity of a problem.
 * @author bblajer
 */
public enum Severity {
	INFO,
	WARNING,
	ERROR;

	public Image getImage() {
		String key = null;
		switch (this) {
		case INFO:
			key = ISharedImages.IMG_OBJS_INFO_TSK;
			break;
		case WARNING:
			key = ISharedImages.IMG_OBJS_WARN_TSK;
			break;
		case ERROR:
			key = ISharedImages.IMG_OBJS_ERROR_TSK;
			break;
		}
		return PlatformUI.getWorkbench().getSharedImages().getImage(key);
	}

	/**
	 * Converts the severity into one of severity constants defined in {@link IStatus}.
	 */
	public int toStatusSeverity() {
		switch (this) {
		case INFO:
			return IStatus.INFO;
		case WARNING:
			return IStatus.WARNING;
		case ERROR:
			return IStatus.ERROR;
		default:
			return IStatus.CANCEL;
		}
	}
}
