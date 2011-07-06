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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.gmf.gmfgraph.Identity;
import org.eclipse.gmf.mappings.AuditContainer;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.MetricContainer;
import org.eclipse.gmf.mappings.TopNodeReference;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * Creates bare extended version of basic Diagram Run-Time model from gmfmap. 
 * This extended version is expected to be modified by toolsmith to capture additional
 * attributes/features of diagram.
 * @author artem
 */
public class DiagramRunTimeModelTransformer extends MappingTransformer {
	private final EPackage myPackage;

	public DiagramRunTimeModelTransformer(String modelName, String modelNsURI) {
		myPackage = EcoreFactory.eINSTANCE.createEPackage();
		myPackage.setName(modelName);
		myPackage.setNsPrefix(modelName+"-drt");
		myPackage.setNsURI(modelNsURI);
	}

	public EPackage getResult() {
		return myPackage;
	}

	protected void process(CanvasMapping cme) {
		addEClass(cme.getDiagramCanvas(), NotationPackage.eINSTANCE.getDiagram());
	}

	protected void process(TopNodeReference topNode) {
		addEClass(topNode.getChild().getDiagramNode(), NotationPackage.eINSTANCE.getNode());
	}

	protected void process(LinkMapping lme) {
		addEClass(lme.getDiagramLink(), NotationPackage.eINSTANCE.getEdge());
	}

	private void addEClass(Identity diaDefElement, EClass superClass) {
		EClass c = createEClass(diaDefElement.getName(), superClass);
		myPackage.getEClassifiers().add(c);
//		for (Iterator it = diaDefElement.getProperties().iterator(); it.hasNext();) {
//			RunTimeProperty p = (RunTimeProperty) it.next();
//			EAttribute a = EcoreFactory.eINSTANCE.createEAttribute();
//			a.setName(p.getName());
//			a.setEType(EcorePackage.eINSTANCE.getEString());
//			c.getEStructuralFeatures().add(a);
//		}
	}

	private EClass createEClass(String name, EClass superClass) {
		EClass c = EcoreFactory.eINSTANCE.createEClass();
		c.setName(name);
		c.getESuperTypes().add(superClass);
		return c;
	}

	protected void process(AuditContainer audits) {
	}

	protected void process(MetricContainer metrics) {
	}
}
