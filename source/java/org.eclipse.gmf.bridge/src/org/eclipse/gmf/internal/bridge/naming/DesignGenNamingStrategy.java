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

import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap;
import org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;
import org.eclipse.gmf.internal.common.NamesDispenser;

/**
 * Uses names from graphical definition elements if available.
 * 
 * @author dstadnik
 */
public class DesignGenNamingStrategy extends AbstractGenNamingStrategy {

	public DesignGenNamingStrategy(String suffix, NamesDispenser namesDispenser, GenNamingStrategy chainedNamingStrategy, GenNamingStrategy prefixNamingStrategy) {
		super(suffix, namesDispenser, chainedNamingStrategy, prefixNamingStrategy);
	}

	public String get(GenDiagram element) {
		String name = getDesignName(element.getViewmap());
		if (name != null) {
			return createClassName(name);
		}
		return super.get(element);
	}

	public String get(GenNode element) {
		String name = getDesignName(element.getViewmap());
		if (name != null) {
			return createClassName(name);
		}
		return super.get(element);
	}

	public String get(GenCompartment element) {
		String name = getDesignName(element.getViewmap());
		if (name != null) {
			return createClassName(getCompartmentHostPrefix(element) + name);
		}
		return super.get(element);
	}

	public String get(GenLink element) {
		String name = getDesignName(element.getViewmap());
		if (name != null) {
			return createClassName(name);
		}
		return super.get(element);
	}

	public String get(GenLabel element) {
		String name = getDesignName(element.getViewmap());
		if (name != null) {
			return createClassName(name);
		}
		return super.get(element);
	}

	/**
	 * Try to infer name from associated figure.
	 */
	protected String getDesignName(Viewmap viewmap) {
		if (viewmap == null) {
			return null;
		}
		String name = null;
		if (viewmap instanceof FigureViewmap) {
			name = ((FigureViewmap) viewmap).getFigureQualifiedClassName();
		} else if (viewmap instanceof InnerClassViewmap) {
			name = ((InnerClassViewmap) viewmap).getClassName();
		} else if (viewmap instanceof ParentAssignedViewmap) {
			name = ((ParentAssignedViewmap) viewmap).getFigureQualifiedClassName();
		}
		if (name == null || name.length() == 0) {
			return null;
		}
		name = name.substring(name.lastIndexOf('.') + 1);
		if (name.endsWith("Figure") && name.length() > "Figure".length()) { //$NON-NLS-1$ //$NON-NLS-2$
			name = name.substring(0, name.length() - "Figure".length()); //$NON-NLS-1$
		}
		if (name.length() == 0) {
			return null;
		}
		if (name.length() < 2) {
			return name.toUpperCase();
		}
		return Character.toUpperCase(name.charAt(0)) + name.substring(1);
	}
}
