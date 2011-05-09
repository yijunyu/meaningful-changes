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

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.gmf.common.IncrementalNamesDispenser;
import org.eclipse.gmf.common.NamesDispenser;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * Uses names from graphical definition elements if available.
 * 
 * @author dstadnik
 */
public class DesignNamingStrategy extends AbstractNamingStrategy {

	private final String suffix;

	public DesignNamingStrategy(String suffix) {
		this(suffix, null, new IncrementalNamesDispenser());
	}

	public DesignNamingStrategy(String suffix, NamingStrategy chained, NamesDispenser dispenser) {
		super(chained);
		assert suffix != null;
		this.suffix = suffix;
		setNamesDispenser(dispenser);
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

	public String get(LabelMapping mapping) {
		if (mapping.getDiagramLabel() != null) {
			String name = mapping.getDiagramLabel().getName();
			if (!isEmpty(name)) {
				return createClassName(name);
			}
		}
		return super.get(mapping);
	}

	protected String createClassName(String name) {
		assert !isEmpty(name);
		name = CodeGenUtil.validJavaIdentifier(name);
		name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
		return getNamesDispenser() == null ? name + suffix : getNamesDispenser().get(name, suffix);
	}
}
