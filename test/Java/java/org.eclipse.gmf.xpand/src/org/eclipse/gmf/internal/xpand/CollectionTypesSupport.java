/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

public class CollectionTypesSupport {

	private final Map<EClassifier, EClass> collectionsM1 = new HashMap<EClassifier, EClass>();  
	private final Map<EClassifier, EClass> listsM1 = new HashMap<EClassifier, EClass>();  
	private final Map<EClassifier, EClass> setsM1 = new HashMap<EClassifier, EClass>();  

	// These are M2 elements, next to EClass and EReferences, extension of ECore
	// meta model
	static final EClass COLLECTION_TYPE = EcoreFactory.eINSTANCE.createEClass();
	static final EClass LIST_TYPE = EcoreFactory.eINSTANCE.createEClass();
	static final EClass SET_TYPE = EcoreFactory.eINSTANCE.createEClass();

	@SuppressWarnings("unchecked")
	void init(EPackage xecore, EClass parameterizedType) {
		COLLECTION_TYPE.setName("Collection");
		LIST_TYPE.setName("List");
		SET_TYPE.setName("Set");
		COLLECTION_TYPE.getESuperTypes().add(parameterizedType);
		LIST_TYPE.getESuperTypes().add(COLLECTION_TYPE);
		SET_TYPE.getESuperTypes().add(COLLECTION_TYPE);
		xecore.getEClassifiers().add(COLLECTION_TYPE);
		xecore.getEClassifiers().add(LIST_TYPE);
		xecore.getEClassifiers().add(SET_TYPE);

		COLLECTION_OF_OBJECT = newCollectionType(EcorePackage.eINSTANCE.getEJavaObject());
		LIST_OF_OBJECT = newListType(EcorePackage.eINSTANCE.getEJavaObject());
		SET_OF_OBJECT = newSetType(EcorePackage.eINSTANCE.getEJavaObject());
		// XXX why didn't I put LIST_OF_* into collectionsM1, listsM1 and setsM1?
		// treat collections without type, like {}, as collections of 'void' which is assignable to anything  
		collectionsM1.put(null, newCollectionType(BuiltinMetaModel.VOID));
		listsM1.put(null, newListType(BuiltinMetaModel.VOID));
		setsM1.put(null, newSetType(BuiltinMetaModel.VOID));
	}

	
	/**
	 * @param name
	 * @return true if name is one of M2 collection meta-types (either Collection, List, Set)
	 */
	public boolean isCollectionMetaType(String name) {
		return COLLECTION_TYPE.getName().equals(name) || LIST_TYPE.getName().equals(name) || SET_TYPE.getName().equals(name);
	}

	public EClass getCollectionType(String metaTypeName, EClassifier innerType) {
		assert isCollectionMetaType(metaTypeName);
		if (LIST_TYPE.getName().equals(metaTypeName)) {
			return getListType(innerType);
		}
		if (SET_TYPE.getName().equals(metaTypeName)) {
			return getSetType(innerType);
		}
		if (COLLECTION_TYPE.getName().equals(metaTypeName)) {
			return getCollectionType(innerType);
		}
		throw new IllegalStateException();
	}

	/*package*/ EClass getCollectionType(EClass metaType, EClassifier innerType) {
		if (LIST_TYPE.equals(metaType)) {
			return getListType(innerType);
		}
		if (SET_TYPE.equals(metaType)) {
			return getSetType(innerType);
		}
		if (COLLECTION_TYPE.equals(metaType)) {
			return getCollectionType(innerType);
		}
		throw new IllegalStateException();
	}


	Collection newInstance(EClassifier m1) {
		if (m1.eClass() == LIST_TYPE) {
			return new LinkedList<Object>();
		}
		if (m1.eClass() == SET_TYPE) {
			return new HashSet<Object>();
		}
		// can't create instance of Collection, right?
		return null;
	}

	public EClass getCollectionType(EClassifier innerType) {
		EClass existing = collectionsM1.get(innerType);
		if (existing == null) {
			existing = newCollectionType(innerType);
			collectionsM1.put(innerType, existing);
		}
		return existing;
	}

	public EClass getListType(EClassifier innerType) {
		EClass existing = listsM1.get(innerType);
		if (existing == null) {
			existing = newListType(innerType);
			listsM1.put(innerType, existing);
		}
		return existing;
	}

	public EClass getSetType(EClassifier innerType) {
		EClass existing = setsM1.get(innerType);
		if (existing == null) {
			existing = newSetType(innerType);
			setsM1.put(innerType, existing);
		}
		return existing;
	}

	// way to implicitly extend user's model with typed lists
	@SuppressWarnings("unchecked")
	private static EClass newCollectionType(EClassifier innerType) {
		EClass c = BuiltinMetaModel.internalNewParameterizedType(COLLECTION_TYPE, innerType);
		// @see CollectionTypeImpl.getSuperTypes
		c.getESuperTypes().add(EcorePackage.eINSTANCE.getEObject());
		return c;
	}

	@SuppressWarnings("unchecked")
	private static EClass newListType(EClassifier innerType) {
		EClass c = BuiltinMetaModel.internalNewParameterizedType(LIST_TYPE, innerType);
		// @see ListTypeImpl.getSuperTypes
		c.getESuperTypes().add(COLLECTION_OF_OBJECT); // XXX perhaps, collection(inner) may be required
		return c;
	}

	@SuppressWarnings("unchecked")
	private static EClass newSetType(EClassifier innerType) {
		EClass c = BuiltinMetaModel.internalNewParameterizedType(SET_TYPE, innerType);
		// @see SetTypeImpl.getSuperTypes
		c.getESuperTypes().add(COLLECTION_OF_OBJECT); // XXX perhaps, collection(inner) may be required
		return c;
	}

	/*
	 * 1. Actually, [List|Set]TypeImpl extend Collection(innerType), but I guess
	 * it's an overkill
	 * 
	 * 2. Instead of analyze's code (working with M1) EClassifier targetType =
	 * XEClass "OrderList"
	 * isAssignableFrom(BuiltinMetaModel.COLLECTION_OF_OBJECT, targetType) and
	 * having all these hierarchies of list|set extending collection (above)
	 * would be better to check
	 * COLLECTION_TYPE.isSuperClassOf("OrderCollection".eClass)
	 */

	// These are M1 elements, next to user's "Purchase" and "Order" classes,
	// user's model
	// during analyze, we have EClasses from same meta-level
	// and during evaluate, we work with instances of these
	static EClass COLLECTION_OF_OBJECT;
	static EClass LIST_OF_OBJECT;
	static EClass SET_OF_OBJECT;
}
