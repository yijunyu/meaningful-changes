/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.parts.update.canonical;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Instances of this interface update notation model based on changes in the underlying domain model.
 */
public interface INotationModelRefresher extends ResourceSetListener {
	public View getView();
	public Command buildRefreshNotationModelCommand();
}
