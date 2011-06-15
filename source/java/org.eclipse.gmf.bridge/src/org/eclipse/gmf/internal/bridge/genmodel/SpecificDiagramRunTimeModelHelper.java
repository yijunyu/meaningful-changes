/*
 * Copyright (c) 2005, 2007 Borland Software Corporation
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

import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * Provides user-tuned runtime diagram presentation.
 * @author artem
 */
public class SpecificDiagramRunTimeModelHelper extends BasicDiagramRunTimeModelHelper {
	private final Map<String, GenClass> myName2GenClassMap;

	/**
	 * @param drtGenModel user-defined diagram run-time model (still, should extend basic RT model)
	 */
	public SpecificDiagramRunTimeModelHelper(GenModel drtGenModel) {
		assert !drtGenModel.getGenPackages().isEmpty();
		myName2GenClassMap = collectGenClasses(drtGenModel);
	}
	
	public GenClass get(NodeMapping nodeMapping) {
		GenClass gc = getGenClass(nodeMapping.getDiagramNode().getName());
		if (gc != null) {
			return gc;
		}
		return super.get(nodeMapping);
	}

	public GenClass get(LinkMapping linkMapping) {
		GenClass gc = getGenClass(linkMapping.getDiagramLink().getName());
		if (gc != null) {
			return gc;
		}
		return super.get(linkMapping);
	}

	public GenClass get(CanvasMapping canvasMapping) {
		GenClass gc = getGenClass(canvasMapping.getDiagramCanvas().getName());
		if (gc != null) {
			return gc;
		}
		return super.get(canvasMapping);
	}

	public GenClass get(LabelMapping labelMapping) {
		GenClass gc = getGenClass(labelMapping.getDiagramLabel().getName());
		if (gc != null) {
			return gc;
		}
		return super.get(labelMapping);
	}

	private Map<String, GenClass> collectGenClasses(GenModel drtGenModel) {
		TreeMap<String, GenClass> rv = new TreeMap<String, GenClass>();
		GenPackage genPack = drtGenModel.getGenPackages().get(0);
		for (GenClass next : genPack.getGenClasses()) {
			rv.put(next.getName(), next);
		}
		return rv;
	}

	private GenClass getGenClass(String name) {
		return myName2GenClassMap.get(name);
	}
}
