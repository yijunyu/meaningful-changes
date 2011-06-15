/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.gmfgraph.util;

import org.eclipse.emf.common.util.URI;

/**
 * Utility methods to deal with sample/shared/well-known models that are part of this plug-in.  
 * @author artem
 */
public class Assistant {
	private static URI basicGraphDef;

	public static URI getBasicGraphDef() {
		if (basicGraphDef == null) {
			basicGraphDef = URI.createURI("platform:/plugin/org.eclipse.gmf.graphdef/models/basic.gmfgraph");
		}
		return basicGraphDef;
	}
}
