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
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;

public class MigrationHelper extends XMIHelperImpl {
	private final MigrationDelegate myDelegate;

	public MigrationHelper(XMLResource resource, MigrationDelegate delegate) {
		super(resource);
		assert delegate != null;
		myDelegate = delegate;
		myDelegate.setResource(resource);
	}

	boolean isMigrationApplied() {
		return myDelegate.isMigrationApplied();
	}
	
	@Override
	public EObject createObject(EFactory factory, EClassifier type) {
		EObject result = myDelegate.createObject(factory, type);
		if (result == null) {
			result = super.createObject(factory, type);
		}
		myDelegate.processObject(result);
		return result;
	}

	@Override
	public String getID(EObject obj) {
		String result = myDelegate.getID(obj);
		if (result == null) {
			result = super.getID(obj);
		}
		return result;
	}

	public void setXMLMap(XMLResource.XMLMap map) {
		//map.setIDAttributeName("");
	}

	@Override
	public void setValue(EObject object, EStructuralFeature feature, Object value, int position) {
		if (!myDelegate.setValue(object, feature, value, position)) {
			super.setValue(object, feature, value, position);
		}
	}

	@Override
	public EStructuralFeature getFeature(EClass eClass, String namespaceURI, String name, boolean isElement) {
		EStructuralFeature result = myDelegate.getFeature(eClass, namespaceURI, name, isElement);
		if (result == null) {
			result = super.getFeature(eClass, namespaceURI, name, isElement);
		}
		return result;
	}
	
	@Override
	public EClassifier getType(EFactory factory, String typeName) {
		EClassifier result = myDelegate.getType(factory, typeName);
		if (result == null) {
			result = super.getType(factory, typeName);
		}
		return result;
	}

	@Override
	public void popContext() {
		super.popContext();
		myDelegate.postProcess();
	}

}
