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
package org.eclipse.gmf.internal.bridge.naming;

import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.internal.common.NamesDispenser;

/**
 * Provides default names that do not reflect element semantic.
 * 
 * @author dstadnik
 */
public class DefaultGenNamingStrategy extends AbstractGenNamingStrategy {

	public DefaultGenNamingStrategy(String suffix, NamesDispenser namesDispenser, GenNamingStrategy chainedNamingStrategy, GenNamingStrategy prefixNamingStrategy) {
		super(suffix, namesDispenser, chainedNamingStrategy, prefixNamingStrategy);
	}

	public String get(GenDiagram element) {
		return createClassName(GenDiagram.CLASS_NAME_PREFIX);
	}

	public String get(GenNode element) {
		return createClassName(GenNode.CLASS_NAME_PREFIX);
	}

	public String get(GenCompartment element) {
		return createClassName(getCompartmentHostPrefix(element) + GenCompartment.CLASS_NAME_PREFIX);
	}

	public String get(GenLink element) {
		return createClassName(GenLink.CLASS_NAME_PREFIX);
	}

	public String get(GenLabel element) {
		return createClassName(getLabelHostPrefix(element) + GenLabel.CLASS_NAME_PREFIX);
	}
}
