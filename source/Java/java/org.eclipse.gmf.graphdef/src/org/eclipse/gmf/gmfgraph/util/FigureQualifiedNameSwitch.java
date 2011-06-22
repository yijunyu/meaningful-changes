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
import org.eclipse.gmf.common.codegen.ImportAssistant;
import org.eclipse.gmf.gmfgraph.FigureGallery;

/**
 * FigureQualifiedNameSwitch serves to substitute base implementation class names for 
 * figures defined in GMFGraph. Namely, we use this switch to provide different
 * implementation for some classes available in gmf-runtime (e.g. {@link RuntimeFQNSwitch})
 * @author artem
 * @deprecated this switch is no longer necessary, the only method being used now, 
 * 	           {@link #getDependencies(FigureGallery)}, should move elsewhere 
 */
@Deprecated
public interface FigureQualifiedNameSwitch {


	/**
	 * (XXX) tell about/change behavior with wrong arguments - exception?
	 * @return fully-qualified class name corresponding to object, or <code>null</code> if it's not suitable graphical object 
	 */
	String get(EObject gmfgraphObject);

	/**
	 * Handy addition to {@link #get(EObject)}, with return value passed through {@link ImportAssistant#getImportedName(String)} 
	 * @return qualified or imported class name
	 */
	String get(EObject gmfgraphObject, ImportAssistant importManager);

	/**
	 * (XXX) decide whether org.eclipse.draw2d should be included there.
	 * @return symbolic names of plug-ins. Figures of the gallery may need these in classpath. 
	 */
	String[] getDependencies(FigureGallery gallery);
}
