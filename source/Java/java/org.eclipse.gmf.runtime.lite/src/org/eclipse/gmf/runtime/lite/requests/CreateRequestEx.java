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

import org.eclipse.gef.requests.CreateRequest;

/**
 * A Request to create a new object of one of the specified types (Visual IDs). 
 */
public class CreateRequestEx extends CreateRequest {
	private final int[] visualIds;
	private final String modelID;

	/**
	 * Creates a new request to create an object of the given object types.
	 */
	public CreateRequestEx(int[] visualIds) {
		this(null, visualIds);
	}

	public CreateRequestEx(String modelID, int[] visualIds) {
		this.visualIds = visualIds;
		this.modelID = modelID;
	}

	/**
	 * Returns the types (Visual IDs) of objects whose creation is requested.
	 */
	public int[] getVisualIds() {
		return visualIds;
	}

	public void setCreatedObject(Object createdObject) {
		((ModelCreationFactory)getFactory()).setCreatedObject(createdObject);
	}

	public String getModelID() {
		return modelID;
	}
}
