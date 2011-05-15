/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Borland - initial API and implementation
 */
package org.eclipse.gmf.internal.common.migrate;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;

public class MigrationHelper extends XMIHelperImpl {
	private final MigrationHelperDelegate myDelegate;
	private EStructuralFeature mySavedFeature;
	private EReferenceImpl myFakeFeatureWithNarrowType;
	private boolean myIsDelegateDisabled = true;

	public MigrationHelper(XMLResource resource, MigrationHelperDelegate delegate) {
		super(resource);
		assert delegate != null;
		myDelegate = delegate;
	}

	void enableDelegate(boolean enabled) {
		myIsDelegateDisabled = !enabled;
	}

	@Override
	public EObject createObject(EFactory factory, EClassifier type) {
		if (myIsDelegateDisabled) {
			return super.createObject(factory, type);
		}
		EObject result = myDelegate.createObject(factory, type);
		if (result == null) {
			result = super.createObject(factory, type);
		}
		myDelegate.processObject(result);
		return result;
	}

	@Override
	public void setValue(EObject object, EStructuralFeature feature, Object value, int position) {
		if (myIsDelegateDisabled) {
			super.setValue(object, feature, value, position);
			return; 
		}
		if (feature != null && feature.equals(myFakeFeatureWithNarrowType)) {
			feature = mySavedFeature;
		}
		if (!myDelegate.setValue(object, feature, value, position)) {
			super.setValue(object, feature, value, position);
		}
	}

	@Override
	public EStructuralFeature getFeature(EClass eClass, String namespaceURI, String name, boolean isElement) {
		if (myIsDelegateDisabled) {
			return super.getFeature(eClass, namespaceURI, name, isElement);
		}
		EStructuralFeature result = myDelegate.getFeature(eClass, namespaceURI, name, isElement);
		if (result == null) {
			result = super.getFeature(eClass, namespaceURI, name, isElement);
		}
		EClass narrow = myDelegate.getStructuralFeatureType(result);
		if (narrow != null) {
			mySavedFeature = result;
			myFakeFeatureWithNarrowType = new EReferenceImpl() {};
			myFakeFeatureWithNarrowType.setName(result.getName());
			myFakeFeatureWithNarrowType.setEType(narrow);
			return myFakeFeatureWithNarrowType;
		}
		return result;
	}
	
	@Override
	public EClassifier getType(EFactory factory, String typeName) {
		if (myIsDelegateDisabled) {
			return super.getType(factory, typeName);
		}
		EClassifier result = myDelegate.getType(factory, typeName);
		if (result == null) {
			result = super.getType(factory, typeName);
		}
		return result;
	}

	@Override
	public void popContext() {
		super.popContext();
		if (myIsDelegateDisabled) {
			return;
		}
		myDelegate.postProcess();
	}
}