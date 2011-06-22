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
package org.eclipse.gmf.internal.bridge.wizards.strategy;

import org.eclipse.swt.widgets.Control;

/**
 * @author artem
 */
public interface StrategyDescriptor {

	String getTitle();
	String getDescription();
	Strategy createStrategy();

	boolean supportsAttributes();
	void configure(Control parent);
}
