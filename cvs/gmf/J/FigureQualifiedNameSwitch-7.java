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
package org.eclipse.gmf.gmfgraph.util;

import org.eclipse.emf.ecore.EObject;

/**
 * FigureQualifiedNameSwitch serves to substitute base implementation class names for 
 * figures defined in GMFGraph. Namely, we use this switch to provide different
 * implementation for some classes available in gmf-runtime (e.g. {@link RuntimeFQNSwitch})
 * This is (almost) marker for GMFGraphSwitch that imposes additional obligations:
 * <ul>
 * <li> doSwitch(FigureGallery) provides String[] of additional plug-ins figure classes depend on
 * (XXX) decide whether org.eclipse.draw2d should be included there.
 * <li> doSwitch(any other GMFGraph object) returns fully-qualified class name, if known.
 * (XXX) tell about behavior with wrong arguments
 * </ul>
 * @author artem
 */
public interface FigureQualifiedNameSwitch {

	Object doSwitch(EObject theEObject);
}
