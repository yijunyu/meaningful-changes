/**
 * Copyright (c) 2006 Borland Software Corp.
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

import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.Request;

public class SetAllBendpointsRequest extends Request {
	private ConnectionEditPart myConnectionEditPart;
	private PointList myPoints;

	public SetAllBendpointsRequest() {
		super(RequestConstants.REQ_SET_ALL_BENDPOINTS);
	}

	public SetAllBendpointsRequest(String type) {
		super(type);
	}

	public PointList getPoints() {
		return myPoints;
	}

	public void setPoints(PointList points) {
		myPoints = points;
	}

	public ConnectionEditPart getConnectionEditPart() {
		return myConnectionEditPart;
	}

	public void setConnectionEditPart(ConnectionEditPart connectionEditPart) {
		myConnectionEditPart = connectionEditPart;
	}
}
