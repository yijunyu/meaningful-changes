/**
 * Copyright (c) 2007 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.util;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClassifier;

public class GenModelUtils {
	
	public static final String getGetAccessor(GenFeature feature) {
		return feature.getGetAccessor();
	}
	
	public static final GenClassifier findGenClassifier(GenModel genModel, EClassifier eClassifier) {
		return genModel.findGenClassifier(eClassifier);
	}

	public static GenClass getDocumentRoot(GenPackage genPackage) {
		return genPackage.hasDocumentRoot() ? genPackage.getDocumentRoot() : null;
	}

	public static boolean isListType(GenFeature genFeature) {
		// can't implement in .ext because 
		// XMLTypePackage.eNS_URI.equals(getExtendedMetaData().getNamespace((EStructuralFeature)eTypedElement));
		// part of the check seems to be essential
		return genFeature.isListType();
	}

	public static boolean isDerived(GenFeature genFeature) {
		return genFeature.isDerived();
	}

	public static GenClass getTypeGenClass(GenFeature genFeature) {
		return genFeature.getTypeGenClass();
	}
}
