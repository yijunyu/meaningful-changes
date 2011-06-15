/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge;

import org.eclipse.emf.common.util.URI;

/**
 * XXX [artem] perhaps, passing ResourceSet to loadState would make sense provided 
 * implementations that keep links to the map/gen elements are possible? 
 */
public interface StatefulVisualIdentifierDispencer extends VisualIdentifierDispenser {

	/**
	 * Loading internal state model connected with the specified map model URI
	 */
	void loadState(URI genModelFileURI);

	/**
	 * Saving internal state for future loadin by <code>loadState(..)</code>
	 * method
	 */
	void saveState();

}
