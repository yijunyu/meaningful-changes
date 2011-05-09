/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.internal.common.reconcile.Matcher;

/**
 * @author dstadnik
 */
public class VisualIDMatcher implements Matcher {

	public boolean match(EObject current, EObject old) {
		if (current instanceof GenCommonBase && old instanceof GenCommonBase) {
			int oldID = ((GenCommonBase) old).getVisualID();
			int newID = ((GenCommonBase) current).getVisualID();
			return oldID == newID;
		}
		return false;
	}
}
