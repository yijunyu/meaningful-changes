/**
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.requests;

import org.eclipse.gef.requests.CreationFactory;


public class ModelCreationFactory implements CreationFactory {
	private Object createdObject;
	private final Class createdObjectType;

	public ModelCreationFactory(Class objectType) {
		createdObjectType = objectType;
	}

	public Object getNewObject() {
		return createdObject;
	}

	public Object getObjectType() {
		return createdObjectType;
	}

	public void setCreatedObject(Object createdObject) {
		this.createdObject = createdObject;
	}
}
