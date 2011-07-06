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
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author artem
 */
public class GenModelMatcher {
	private final GenModel myEMFGenModel;

	public GenModelMatcher(GenModel genModel) {
		assert genModel != null;
		myEMFGenModel = genModel;
	}

	/**
	 * Rather use some subtype of {@link GenModelAccess} to 
	 * get {@link GenModel} and {@link #GenModelMatcher(GenModel)}.
	 * @param domainModel
	 * @throws IllegalStateException if genmodel could not be found
	 */
	public GenModelMatcher(EPackage domainModel) {
		BasicGenModelAccess gma = new BasicGenModelAccess(domainModel);
		gma.initDefault();
		if (gma.load().isOK()) {
			myEMFGenModel = gma.model();
		} else {
			throw new IllegalStateException("Can't find genModel for domain model with nsURI=" + domainModel.getNsURI());
		}
	}

	public GenModel getGenModel() {
		return myEMFGenModel;
	}

	/**
	 * @param domainPackage
	 * @return <code>null</code> in case <code>domainPackage</code> is <code>null</code> or no matching package found.
	 */
	public GenPackage findGenPackage(EPackage domainPackage) {
		return domainPackage == null ? null : getGenModel().findGenPackage(domainPackage);
	}

	/**
	 * @param domainMetaClass
	 * @return respective <code>GenClass</code>, or <code>null</code> if <code>domainMetaClass</code> is <code>null</code>.
	 * @throws IllegalStateException if no matching <code>GenClass</code> found.
	 */
	public GenClass findGenClass(EClass domainMetaClass) {
		if (domainMetaClass == null) {
			return null;
		}
		GenPackage gp = findGenPackage(domainMetaClass.getEPackage());
		if (gp == null) {
			throw new IllegalStateException("Can't find genPackage for " + domainMetaClass.getEPackage());
		}
		for (GenClass genClass : gp.getGenClasses()) {
			if (genClass.getEcoreClass().equals(domainMetaClass)) {
				return genClass;
			}
		}
		throw new IllegalStateException("Can't find genClass for class '" + domainMetaClass.getName() + "' in package " + gp.getPackageName());
	}

	/**
	 * 
	 * @param domainMetaFeature
	 * @return respective <code>GenFeature</code>, or <code>null</code> if <code>domainMetaFeature</code> is <code>null</code>.
	 * @throws IllegalStateException if no matching <code>GenFeature</code> found.
	 */
	public GenFeature findGenFeature(EStructuralFeature domainMetaFeature) {
		if (domainMetaFeature == null) {
			return null;
		}
		GenClass genClass = findGenClass(domainMetaFeature.getEContainingClass());
		for (GenFeature next : genClass.getGenFeatures()) {
			if (next.getEcoreFeature().equals(domainMetaFeature)) {
				return next;
			}
		}
		throw new IllegalStateException("Can't find genFeature for feature '" + domainMetaFeature.getName() + "' in class " + genClass.getName());
	}
}
