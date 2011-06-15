/**
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.services;

import org.eclipse.gmf.runtime.notation.View;

/**
 * Implementors of this interface are responsible for decorating instances of View
 */
public interface IViewDecorator {
	public void decorateView(View view);
}
