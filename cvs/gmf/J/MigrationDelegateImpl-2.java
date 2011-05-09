/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common.migrate;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

public class MigrationDelegateImpl implements MigrationDelegate {
	private final EStructuralFeature myDeletedAttribute = EcoreFactory.eINSTANCE.createEAttribute();
	private boolean isMigrationApplied;

	public MigrationDelegateImpl() {
		super();
		myDeletedAttribute.setName("attributeIsDeleted"); //$NON-NLS-1$
		myDeletedAttribute.setEType(EcorePackage.eINSTANCE.getEString());
		isMigrationApplied = false;
	}

	private Map<EClassifier, Collection<String>> myDeletedAttributes = new HashMap<EClassifier, Collection<String>>();
	private Map<String, EClass> myNarrowedTypes = new HashMap<String, EClass>();
	private Map<EClass, Map<String, EStructuralFeature>> myRenamedAttributes = new HashMap<EClass, Map<String, EStructuralFeature>>();
	private Map<String, EClassifier> myRenamedTypes = new HashMap<String, EClassifier>();
	
	public void registerDeletedAttributes(EClassifier classifier, String... deletedAttrNames) {
		assert !myDeletedAttributes.containsKey(classifier);
		myDeletedAttributes.put(classifier, Arrays.asList(deletedAttrNames));
	}
	
	public void registerRenamedAttributes(EClass eClass, Map<String, EStructuralFeature> renamedAttributes) {
		myRenamedAttributes.put(eClass, renamedAttributes);
	}
	
	public void registerNarrowedAbstractType(String abstractTypeName, EClass narrowedType) {
		myNarrowedTypes.put(abstractTypeName, narrowedType);
	}
	
	public void registerRenamedType(String oldTypeName, EClassifier newType) {
		myRenamedTypes.put(oldTypeName, newType);
	}
	
	public void registerRenamedAttribute(EClass eClass, String oldName, EStructuralFeature newStructuralFeature) {
		Map<String, EStructuralFeature> renamedAttributes = myRenamedAttributes.get(eClass);
		if (renamedAttributes == null) {
			renamedAttributes = new HashMap<String, EStructuralFeature>();
		}
		renamedAttributes.put(oldName, newStructuralFeature);
		registerRenamedAttributes(eClass, renamedAttributes);
	}
	
	public boolean isAttributeDeleted(EClass clazz, String name) {
		Collection<String> deletedAttributes = myDeletedAttributes.get(clazz);
		boolean result = deletedAttributes != null && deletedAttributes.contains(name);
		for (Iterator<EClass> it=clazz.getEAllSuperTypes().iterator(); !result && it.hasNext();) {
			EClass nextParent = it.next();
			result = isAttributeDeleted(nextParent, name);
		}
		return result;
	}
	
	public EClass getNarrowReferenceType(String abstractTypeName) {
		return myNarrowedTypes.get(abstractTypeName);
	}

	public EStructuralFeature getRenamedFeatureFor(EClass clazz, String name) {
	    Map<String, EStructuralFeature> renamings = myRenamedAttributes.get(clazz);
		return renamings != null ? renamings.get(name) : null;
	}

	public EClassifier getRenamedType(String typeName) {
		return myRenamedTypes.get(typeName);
	}

	public boolean setValue(EObject object, EStructuralFeature feature, Object value, int position) {
		return myDeletedAttribute.equals(feature);
	}

	public EStructuralFeature getFeature(EClass eClass, String namespaceURI, String name, boolean isElement) {
		EStructuralFeature result = null;
		EStructuralFeature rename = null;
		if ((rename = getRenamedFeatureFor(eClass, name)) != null) {
			result = rename;
			fireMigrationApplied(true);
		} else if (isAttributeDeleted(eClass, name)) {
			result = myDeletedAttribute;
			fireMigrationApplied(true);
		}
		return result;
	}

	public EClassifier getType(EFactory factory, String typeName) {
		EClassifier renamedType = getRenamedType(typeName);
		if (renamedType != null) {
			fireMigrationApplied(true);
			return renamedType;
		}
		EClassifier narrowedType = getNarrowReferenceType(typeName);
		if (narrowedType != null) {
			fireMigrationApplied(true);
			return narrowedType;
		}
		return null;
	}

	public EObject createObject(EFactory factory, EClassifier type) {
		return null;
	}
	
	public void postProcess() {
	}

	public void processObject(EObject result) {
	}

	public boolean isMigrationApplied() {
		return isMigrationApplied;
	}
	
	protected void fireMigrationApplied(boolean applied) {
		isMigrationApplied = applied;
	}
	
	protected static EReference createNewReference(String name, EClass eType, boolean isContainment) {
		EReference ref = EcoreFactory.eINSTANCE.createEReference();
		ref.setName(name);
		ref.setEType(eType);
		ref.setContainment(isContainment);
		ref.setLowerBound(0);
		ref.setUpperBound(-1);
		return ref;
	}
}