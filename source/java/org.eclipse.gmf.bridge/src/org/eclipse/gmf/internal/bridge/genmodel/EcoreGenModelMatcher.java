/*
 * Copyright (c) 2005, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Radek Dvorak (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.genmodel;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenBaseImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * Provides access to Ecore genmodel elements.
 * <p>
 * The purpose of this matcher is to return referenceable genmodel elements for 
 * ecore generated elements. The standard matcher returns fake singleton elements 
 * without eResource set for EcorePackage.eINSTANCE.XXX input.
 * <p>
 * (This mechanism is hardcoded in ecore.genmodel).
 * 
 * @see GenBaseImpl#findGenPackage(EPackage)
 */
public class EcoreGenModelMatcher extends GenModelMatcher {

	public EcoreGenModelMatcher() {
		super(getEcoreModel());		
	}
		
	/**
	 * @param domainPackage
	 * @return <code>null</code> in case <code>domainPackage</code> is <code>null</code> or no matching package found.
	 */
	public GenPackage findGenPackage(EPackage domainPackage) {
		if(domainPackage == EcorePackage.eINSTANCE) {
			for (GenPackage genPackage : getGenModel().getGenPackages()) {
				if(genPackage.getEcorePackage() != null && safeEquals(domainPackage.getNsURI(), genPackage.getEcorePackage().getNsURI())) {
					return genPackage;
				}
			}
		}
		return domainPackage == null ? null : getGenModel().findGenPackage(domainPackage);
	}
	
	/**
	 * @param domainMetaClass
	 * @return respective <code>GenClass</code>, or <code>null</code> if <code>domainMetaClass</code> is <code>null</code>.
	 * @throws IllegalStateException if no matching <code>GenClass</code> found.
	 */
	public GenClass findGenClass(EClass domainMetaClass) {
		GenClassifier genClassifier = findGenClassifier(domainMetaClass);
		if(genClassifier instanceof GenClass) {
			return (GenClass)genClassifier;
		}
		throw new IllegalStateException("Can't find genClass for class '" + domainMetaClass.getName());
	}
	
	/**
	 * @param domainMetaClassifier
	 * @return respective <code>GenClassifier</code>, or <code>null</code> if <code>domainMetaClassifier</code> is <code>null</code>.
	 * @throws IllegalStateException if no matching <code>GenClass</code> found.
	 */
	public GenClassifier findGenClassifier(EClassifier domainMetaClassifier) {
		if (domainMetaClassifier == null) {
			return null;
		}
		GenPackage gp = findGenPackage(domainMetaClassifier.getEPackage());
		if (gp == null) {
			throw new IllegalStateException("Can't find genPackage for " + domainMetaClassifier.getEPackage());
		}
		for (GenClassifier genClassifier : gp.getGenClassifiers()) {
			if (genClassifier.getEcoreClassifier() != null && safeEquals(genClassifier.getEcoreClassifier().getName(), domainMetaClassifier.getName())) {
				return genClassifier;
			}
		}
		throw new IllegalStateException("Can't find genClassifier for classifier '" + domainMetaClassifier.getName() + "' in package " + gp.getPackageName());
	}
	
	private static GenModel getEcoreModel() {
		URI genModelUri = URI.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.genmodel"); //$NON-NLS-1$		
		FileGenModelAccess access = new FileGenModelAccess(genModelUri);
		access.load();
		return access.model();
	}
	
	private static boolean safeEquals(String s1, String s2) {
		return (s1 != null) ? s1.equals(s2) : (s2 == s1 || s2.equals(s1));
	}
}
