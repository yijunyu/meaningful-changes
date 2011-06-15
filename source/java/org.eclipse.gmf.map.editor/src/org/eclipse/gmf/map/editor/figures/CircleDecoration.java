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
package org.eclipse.gmf.map.editor.figures;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;

/**
 * @author dstadnik
 */
public class CircleDecoration extends Ellipse implements RotatableDecoration {

	public void setLocation(Point p) {
		Dimension delta = getPreferredSize().getScaled(0.5).getNegated();
		super.setLocation(p.getTranslated(delta));
	}

	public void setReferencePoint(Point p) {
	}
}
