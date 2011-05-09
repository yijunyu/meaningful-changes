/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.naming;

import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.common.NamesDispenser;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * Provides default names that do not reflect element semantic.
 * 
 * @author dstadnik
 */
public class DefaultNamingStrategy extends AbstractNamingStrategy {

	public DefaultNamingStrategy(String suffix, NamesDispenser namesDispenser, NamingStrategy chainedNamingStrategy, NamingStrategy prefixNamingStrategy) {
		super(suffix, namesDispenser, chainedNamingStrategy, prefixNamingStrategy);
	}

	public String get(CanvasMapping mapping) {
		return createClassName(GenDiagram.CLASS_NAME_PREFIX);
	}

	public String get(NodeMapping mapping) {
		return createClassName(GenNode.CLASS_NAME_PREFIX);
	}

	public String get(LinkMapping mapping) {
		return createClassName(GenLink.CLASS_NAME_PREFIX);
	}

	public String get(CompartmentMapping mapping) {
		return createClassName(getCompartmentHostPrefix(mapping) + GenCompartment.CLASS_NAME_PREFIX);
	}

	public String get(LabelMapping mapping) {
		return createClassName(getLabelHostPrefix(mapping) + GenLabel.CLASS_NAME_PREFIX);
	}
}
