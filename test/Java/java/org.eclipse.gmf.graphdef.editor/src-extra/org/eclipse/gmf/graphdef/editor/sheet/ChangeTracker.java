/*
 * Copyright (c) 2008 Borland Software Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.sheet;

import org.eclipse.emf.common.notify.Notification;

/**
 * Basically, extraction of the {@link org.eclipse.emf.common.notify.Adapter#notifyChanged(Notification)}
 * into separate interface to ease implementation of the handling logic externally to adapter (i.e. in 
 * heck a lot of cases adapter can't do anything about recognized event but to delegate to surrounding code)
 * 
 * @author artem
 */
public interface ChangeTracker {
	void modelChanged(Notification msg);
}
