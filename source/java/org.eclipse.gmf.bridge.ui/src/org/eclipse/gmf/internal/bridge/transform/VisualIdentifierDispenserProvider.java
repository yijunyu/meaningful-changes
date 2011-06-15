/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.transform;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.internal.bridge.NaiveIdentifierDispenser;
import org.eclipse.gmf.internal.bridge.StatefulVisualIdentifierDispencer;
import org.eclipse.gmf.internal.bridge.VisualIdentifierDispenser;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.osgi.framework.Bundle;

/**
 * holds additional logic to pre/post process dispensers
 * FIXME this class public only for use in codegen.ui for old transform action
 * TODO package-local as soon as old transform action is removed
 */
public class VisualIdentifierDispenserProvider {
	private VisualIdentifierDispenser dispenser;
	private final URI myStateBaseURI;

	// FIXME see class comment why public
	public VisualIdentifierDispenserProvider(URI stateBaseURI) {
		myStateBaseURI = stateBaseURI;
	}

	private VisualIdentifierDispenser initialize() {
		Bundle tracePluginBundle = Platform.getBundle("org.eclipse.gmf.bridge.trace"); //$NON-NLS-1$
		if (tracePluginBundle != null) {
			try {
				Class<?> despenserClass = tracePluginBundle.loadClass("org.eclipse.gmf.internal.bridge.trace.MergingIdentifierDispenser"); //$NON-NLS-1$
				return (VisualIdentifierDispenser) despenserClass.newInstance();
			} catch (ClassNotFoundException e) {
				Plugin.log(Plugin.createError("MergingIdentifierDispenser was not found in org.eclipse.gmf.bridge.trace bundle", e)); //$NON-NLS-1$
			} catch (InstantiationException e) {
				Plugin.log(Plugin.createError("MergingIdentifierDispenser was not instantiated", e)); //$NON-NLS-1$
			} catch (IllegalAccessException e) {
				Plugin.log(Plugin.createError("IllegalAccessException while instantiating MergingIdentifierDispenser", e)); //$NON-NLS-1$
			} catch (ClassCastException ex) {
				Plugin.log(Plugin.createError("MergingIdentifierDispenser was not instantiated", ex)); //$NON-NLS-1$
			}
		}
		return new NaiveIdentifierDispenser();
	}

	public VisualIdentifierDispenser get() {
		assert dispenser != null;
		return dispenser;
	}

	public void acquire() {
		assert dispenser == null;
		dispenser = initialize();
		if (dispenser instanceof StatefulVisualIdentifierDispencer) {
			StatefulVisualIdentifierDispencer statefulDispencer = (StatefulVisualIdentifierDispencer) dispenser;
			statefulDispencer.loadState(myStateBaseURI);
		}
	}

	public void release() {
		if (dispenser instanceof StatefulVisualIdentifierDispencer) {
			((StatefulVisualIdentifierDispencer) dispenser).saveState();
		}
		dispenser = null;
	}
}
