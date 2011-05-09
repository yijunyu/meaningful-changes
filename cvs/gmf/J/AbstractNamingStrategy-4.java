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
import org.eclipse.gmf.mappings.ChildNodeMapping;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * @author artem
 */
public abstract class AbstractNamingStrategy implements NamingStrategy {

	private final NamingStrategy myDelegate;
	private UniqueValueDispenser myDispenser;

	public AbstractNamingStrategy() {
		this(null);
	}

	public AbstractNamingStrategy(NamingStrategy chained) {
		myDelegate = chained;
	}

	public void setCache(UniqueValueDispenser dispenser) {
		myDispenser = dispenser;
		if (myDelegate != null) {
			myDelegate.setCache(dispenser);
		}
	}

	public UniqueValueDispenser getCache() {
		if (myDispenser != null) {
			return myDispenser;
		}
		if (myDelegate != null) {
			return myDelegate.getCache();
		}
		return null;
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

	public String get(ChildNodeMapping nme) {
		if (myDelegate != null) {
			return myDelegate.get(nme);
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
}
