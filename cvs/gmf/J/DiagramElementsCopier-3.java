/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.graphdef.codegen;

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.gmfgraph.ConnectionFigure;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.DecorationFigure;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;

class DiagramElementsCopier extends EcoreUtil.Copier {
	private final HashSet<Figure> myOriginalFigures = new HashSet<Figure>();
	
	public void registerSubstitution(Figure original, CustomFigure substituted){
		put(original, substituted);
		myOriginalFigures.add(original);
	}

	public boolean isSubstituted(Figure original) {
		return containsKey(original);
	}

	protected void copyReference(EReference eReference, EObject eObject, EObject copyEObject) {
		if (EcoreUtil.isAncestor(myOriginalFigures, eObject)){
			//no such features in the CustomFigure's
			return;
		}
		super.copyReference(eReference, eObject, copyEObject);
	}

	/**
	 * 	FIXME this method has nothing to do with DiagramElementsCopier 
	 */
	static CustomFigure createCustomFigure(Figure original){
		GMFGraphFactory factory = GMFGraphFactory.eINSTANCE;
		if (original instanceof DecorationFigure){
			return factory.createCustomDecoration();
		} 
		if (original instanceof ConnectionFigure){
			return factory.createCustomConnection();
		}
		return factory.createCustomFigure();
	}

}