/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.gmfgraph.util;

import org.eclipse.gmf.gmfgraph.BorderLayout;
import org.eclipse.gmf.gmfgraph.CustomClass;
import org.eclipse.gmf.gmfgraph.Ellipse;
import org.eclipse.gmf.gmfgraph.FlowLayout;
import org.eclipse.gmf.gmfgraph.GridLayout;
import org.eclipse.gmf.gmfgraph.GridLayoutData;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.LabeledContainer;
import org.eclipse.gmf.gmfgraph.Polygon;
import org.eclipse.gmf.gmfgraph.PolygonDecoration;
import org.eclipse.gmf.gmfgraph.Polyline;
import org.eclipse.gmf.gmfgraph.PolylineConnection;
import org.eclipse.gmf.gmfgraph.PolylineDecoration;
import org.eclipse.gmf.gmfgraph.Rectangle;
import org.eclipse.gmf.gmfgraph.RoundedRectangle;
import org.eclipse.gmf.gmfgraph.StackLayout;
import org.eclipse.gmf.gmfgraph.XYLayout;
import org.eclipse.gmf.gmfgraph.XYLayoutData;

/**
 * @author artem
 *
 */
public class FigureQualifiedNameSwitch extends GMFGraphSwitch {

	public Object caseCustomClass(CustomClass object) {
		return object.getQualifiedClassName();
	}

	public Object caseGridLayout(GridLayout object) {
		return "org.eclipse.gmf.internal.codegen.draw2d.GridLayout";
	}

	public Object caseGridLayoutData(GridLayoutData object) {
		return "org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData";
	}
	
	public Object caseFlowLayout(FlowLayout object) {
		return object.isForceSingleLine() ? "org.eclipse.draw2d.ToolbarLayout" : "org.eclipse.draw2d.FlowLayout";
	}
	
	public Object caseXYLayout(XYLayout object) {
		return "org.eclipse.draw2d.XYLayout";
	}
	
	public Object caseXYLayoutData(XYLayoutData object) {
		return "org.eclipse.draw2d.geometry.Rectangle";
	}
	
	public Object caseStackLayout(StackLayout object) {
		return "org.eclipse.draw2d.StackLayout";
	}

	public Object caseBorderLayout(BorderLayout object) {
		return "org.eclipse.draw2d.BorderLayout";
	}

	public Object caseLabel(Label object) {
		return "org.eclipse.draw2d.Label"; //$NON-NLS-1$
	}

	public Object caseLabeledContainer(LabeledContainer object) {
		return "org.eclipse.draw2d.LabeledContainer"; //$NON-NLS-1$
	}

	public Object caseRectangle(Rectangle object) {
		return "org.eclipse.draw2d.RectangleFigure"; //$NON-NLS-1$
	}

	public Object caseRoundedRectangle(RoundedRectangle object) {
		return "org.eclipse.draw2d.RoundedRectangle"; //$NON-NLS-1$
	}

	public Object caseEllipse(Ellipse object) {
		return "org.eclipse.draw2d.Ellipse"; //$NON-NLS-1$
	}

	public Object casePolygon(Polygon object) {
		return "org.eclipse.draw2d.Polygon"; //$NON-NLS-1$
	}

	public Object casePolygonDecoration(PolygonDecoration object) {
		return "org.eclipse.draw2d.PolygonDecoration"; //$NON-NLS-1$
	}

	public Object casePolyline(Polyline object) {
		return "org.eclipse.draw2d.Polyline"; //$NON-NLS-1$
	}

	public Object casePolylineDecoration(PolylineDecoration object) {
		return "org.eclipse.draw2d.PolylineDecoration"; //$NON-NLS-1$
	}

	public Object casePolylineConnection(PolylineConnection object) {
		return "org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx"; //$NON-NLS-1$
	}
}
