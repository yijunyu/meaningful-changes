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
package org.eclipse.gmf.internal.bridge.naming;

import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * @author artem
 */
public abstract class AbstractNamingStrategy implements NamingStrategy {

	private final NamingStrategy myDelegate;

	public AbstractNamingStrategy() {
		this(null);
	}

	public AbstractNamingStrategy(NamingStrategy chained) {
		myDelegate = chained;
	}

	public String get(CanvasMapping cme) {
		if (myDelegate != null) {
			return myDelegate.get(cme);
		}
		return null;
	}

	public String get(NodeMapping nme) {
		if (myDelegate != null) {
			return myDelegate.get(nme);
		}
		return null;
	}

	public String get(LinkMapping lme) {
		if (myDelegate != null) {
			return myDelegate.get(lme);
		}
		return null;
	}

	public String get(CompartmentMapping cm) {
		if (myDelegate != null) {
			return myDelegate.get(cm);
		}
		return null;
	}

	public String get(LabelMapping labelMapping) {
		if (myDelegate != null) {
			return myDelegate.get(labelMapping);
		}
		return null;
	}

	protected final NamingStrategy getDelegate() {
		return myDelegate;
	}

	protected static boolean isEmpty(String s) {
		return s == null || s.length() == 0;
	}
}
