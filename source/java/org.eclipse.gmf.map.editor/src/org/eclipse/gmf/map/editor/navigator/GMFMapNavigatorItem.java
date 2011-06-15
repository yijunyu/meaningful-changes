/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.map.editor.navigator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.map.editor.part.GMFMapVisualIDRegistry;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GMFMapNavigatorItem extends GMFMapAbstractNavigatorItem {

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	public GMFMapNavigatorItem(View view, Object parent) {
		super(parent);
		myView = view;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public String getModelID() {
		return GMFMapVisualIDRegistry.getModelID(myView);
	}

	/**
	 * @generated
	 */
	public int getVisualID() {
		return GMFMapVisualIDRegistry.getVisualID(myView);
	}

	/**
	 * @generated
	 */
	public Object getAdapter(Class adapter) {
		if (View.class.isAssignableFrom(adapter) || EObject.class.isAssignableFrom(adapter)) {
			return myView;
		}
		return super.getAdapter(adapter);
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof GMFMapNavigatorItem) {
			EObject eObject = getView().getElement();
			EObject anotherEObject = ((GMFMapNavigatorItem) obj).getView().getElement();
			if (eObject == null) {
				return anotherEObject == null;
			} else if (anotherEObject == null) {
				return false;
			}
			return eObject.eResource().getURIFragment(eObject).equals(anotherEObject.eResource().getURIFragment(anotherEObject));
		}
		return super.equals(obj);
	}

}
