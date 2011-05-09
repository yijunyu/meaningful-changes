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
package org.eclipse.gmf.graphdef.codegen;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.DecorationFigure;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.PolylineConnection;
import org.eclipse.gmf.gmfgraph.Shape;
import org.osgi.framework.Bundle;

/**
 * @author artem
 *
 */
public class FigureGenerator {
	private final JETEmitter shapeEmitter;
	private final JETEmitter customFigureEmitter;
	private final JETEmitter decorationFigureEmitter;
	private final JETEmitter polylineConnectionEmitter;
	private final String packageName;
	private final JETEmitter labelFigureEmitter;

	public FigureGenerator() {
		this(null);
	}

	public FigureGenerator(String aPackageName) {
		packageName = aPackageName;
		final Bundle thisBundle = Platform.getBundle("org.eclipse.gmf.graphdef.codegen");
		shapeEmitter = new JETEmitter(thisBundle.getEntry("/templates/ConcreteShape.javajet").toString(), FigureGenerator.class.getClassLoader());
		initEmitter(shapeEmitter);
		customFigureEmitter = new JETEmitter(thisBundle.getEntry("/templates/CustomFigure.javajet").toString(), FigureGenerator.class.getClassLoader());
		initEmitter(customFigureEmitter);
		decorationFigureEmitter = new JETEmitter(thisBundle.getEntry("/templates/DecorationFigure.javajet").toString(), FigureGenerator.class.getClassLoader());
		initEmitter(decorationFigureEmitter);
		polylineConnectionEmitter = new JETEmitter(thisBundle.getEntry("/templates/PolylineConnection.javajet").toString(), FigureGenerator.class.getClassLoader());
		initEmitter(polylineConnectionEmitter);
		labelFigureEmitter = new JETEmitter(thisBundle.getEntry("/templates/Label.javajet").toString(), FigureGenerator.class.getClassLoader());
		initEmitter(labelFigureEmitter);
	}

	/**
	 * @return possibly <code>null</code>
	 */
	public String getPackageStatement() {
		return packageName;
	}

	private static void initEmitter(JETEmitter emitter) {
		try {
			emitter.addVariable("A", "org.eclipse.gmf.graphdef");
			emitter.addVariable("B", "org.eclipse.emf.ecore");
			emitter.addVariable("C", "org.eclipse.emf.common");
		} catch (JETException ex) {
			ex.printStackTrace();
			// ignore for now
		}
	}

	public String go(Figure fig) throws JETException {
		String res = null;
		if (fig instanceof PolylineConnection) {
			res = generate(fig, polylineConnectionEmitter);
		} else if (fig instanceof DecorationFigure) {
			res = generate(fig, decorationFigureEmitter);
		} else if (fig instanceof Shape) {
			res = generate(fig, shapeEmitter);
		} else if (fig instanceof CustomFigure) {
			res = generate(fig, customFigureEmitter);
		} else if (fig instanceof Label) {
			res = generate(fig, labelFigureEmitter);
		}
// TODO: } else if (fig instanceof LabeledContainer) {
		if (res == null) {
			throw new IllegalStateException();
		}
		return packageName == null ? res : "package " + packageName + ";\n" + res;
	}

	private String generate(Figure fig, JETEmitter emitter) throws JETException {
		return emitter.generate(new BasicMonitor.Printing(System.out), new Object[] {fig});
	}
}
