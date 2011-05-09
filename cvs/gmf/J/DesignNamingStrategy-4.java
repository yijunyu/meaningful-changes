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

import org.eclipse.gmf.common.NamesDispenser;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * Uses names from graphical definition elements if available.
 * 
 * @author dstadnik
 */
public class DesignNamingStrategy extends AbstractNamingStrategy {

	public DesignNamingStrategy(String suffix, NamesDispenser namesDispenser, NamingStrategy chainedNamingStrategy, NamingStrategy prefixNamingStrategy) {
		super(suffix, namesDispenser, chainedNamingStrategy, prefixNamingStrategy);
	}

	public String get(CanvasMapping mapping) {
		if (mapping.getDiagramCanvas() != null) {
			String name = mapping.getDiagramCanvas().getName();
			if (!isEmpty(name)) {
				return createClassName(name);
			}
		}
		return super.get(mapping);
	}

	public String get(NodeMapping mapping) {
		if (mapping.getDiagramNode() != null) {
			String name = mapping.getDiagramNode().getName();
			if (!isEmpty(name)) {
				return createClassName(name);
			}
		}
		return super.get(mapping);
	}

	public String get(LinkMapping mapping) {
		if (mapping.getDiagramLink() != null) {
			String name = mapping.getDiagramLink().getName();
			if (!isEmpty(name)) {
				return createClassName(name);
			}
		}
		return super.get(mapping);
	}

	public String get(CompartmentMapping mapping) {
		if (mapping.getCompartment() != null) {
			String name = mapping.getCompartment().getName();
			if (!isEmpty(name)) {
				name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
				name = getCompartmentHostPrefix(mapping) + name;
				return createClassName(name);
			}
		}
		return super.get(mapping);
	}

	public String get(LabelMapping mapping) {
		if (mapping.getDiagramLabel() != null) {
			String name = mapping.getDiagramLabel().getName();
			if (!isEmpty(name)) {
				name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
				// Since names should be unique in gmfgraph model names of
				// labels most likely will contain their host names appended
				// as prefixes so we do not add them to make names smaller.
				//name = getLabelHostPrefix(mapping) + name;
				return createClassName(name);
			}
		}
		return super.get(mapping);
	}
}
