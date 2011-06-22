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


import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * Makes use of basic/standard classes for runtime presentation of diagram 
 * @author artem
 */
public class BasicDiagramRunTimeModelHelper implements DiagramRunTimeModelHelper {
	private GenClass myNode;
	private GenClass myLink;
	private GenClass myCanvas;
	private boolean myIsLoaded = false;

	public BasicDiagramRunTimeModelHelper() {
	}

	public GenClass get(NodeMapping nodeMapping) {
		loadGenModel();
		return myNode;
	}

	public GenClass get(LinkMapping linkMapping) {
		loadGenModel();
		return myLink;
	}

	public GenClass get(CanvasMapping canvasMapping) {
		loadGenModel();
		return myCanvas;
	}

	public GenClass getChildContainerDefault() {
		loadGenModel();
		return myNode;
	}

	public GenClass get(LabelMapping labelMapping) {
		loadGenModel();
		return myNode;
	}

	private void loadGenModel() {
		if (myIsLoaded ) {
			return;
		}
		myIsLoaded = true;
		RuntimeGenModelAccess runtimeAccess = new RuntimeGenModelAccess();
		runtimeAccess.ensure(); 
		GenPackage gp = runtimeAccess.genPackage();
		for (GenClass next  : gp.getGenClasses()) {
			if (NotationPackage.eINSTANCE.getNode().getName().equals(next.getName())) {
				myNode = next;
			} else if (NotationPackage.eINSTANCE.getEdge().getName().equals(next.getName())) {
				myLink = next;
			} else if (NotationPackage.eINSTANCE.getDiagram().getName().equals(next.getName())) {
				myCanvas = next;
			}
		}
		// my... become proxies on unload
		//runtimeAccess.unload();
		assert myNode != null && myLink != null && myCanvas != null;
	}
}
