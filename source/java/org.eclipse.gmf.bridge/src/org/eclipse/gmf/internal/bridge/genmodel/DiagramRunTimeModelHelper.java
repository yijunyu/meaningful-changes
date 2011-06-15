/*
 * Copyright (c) 2005, 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.genmodel;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * Bridges diagram definition elements with classes that represent diagram at runtime.
 * @author artem
 */
public interface DiagramRunTimeModelHelper {

	public GenClass get(NodeMapping nodeMapping);

	public GenClass get(LinkMapping linkMapping);

	public GenClass get(CanvasMapping canvasMapping);

	public GenClass getChildContainerDefault();

	public GenClass get(LabelMapping mapping);
}
