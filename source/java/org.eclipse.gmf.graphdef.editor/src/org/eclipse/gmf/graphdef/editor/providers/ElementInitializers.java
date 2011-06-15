/*
 *  Copyright (c) 2006, 2007 Borland Software Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.providers;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.Polygon;
import org.eclipse.gmf.gmfgraph.Polyline;
import org.eclipse.gmf.graphdef.editor.expressions.GMFGraphAbstractExpression;
import org.eclipse.gmf.graphdef.editor.expressions.GMFGraphOCLFactory;
import org.eclipse.gmf.graphdef.editor.part.GMFGraphDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	/**
	 * @generated
	 */
	public static void init_Polyline_3014(Polyline instance) {
		try {
			Point newInstance_0_0 = GMFGraphFactory.eINSTANCE.createPoint();

			instance.getTemplate().add(newInstance_0_0);
			Object value_0_0_0 = GMFGraphOCLFactory.getExpression("10", GMFGraphPackage.eINSTANCE.getPoint()).evaluate(newInstance_0_0);

			value_0_0_0 = GMFGraphAbstractExpression.performCast(value_0_0_0, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_0.setX(((Integer) value_0_0_0).intValue());
			Object value_0_0_1 = GMFGraphOCLFactory.getExpression("10", GMFGraphPackage.eINSTANCE.getPoint()).evaluate(newInstance_0_0);

			value_0_0_1 = GMFGraphAbstractExpression.performCast(value_0_0_1, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_0.setY(((Integer) value_0_0_1).intValue());

			Point newInstance_0_1 = GMFGraphFactory.eINSTANCE.createPoint();

			instance.getTemplate().add(newInstance_0_1);
			Object value_0_1_0 = GMFGraphOCLFactory.getExpression("30", GMFGraphPackage.eINSTANCE.getPoint()).evaluate(newInstance_0_1);

			value_0_1_0 = GMFGraphAbstractExpression.performCast(value_0_1_0, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_1.setX(((Integer) value_0_1_0).intValue());
			Object value_0_1_1 = GMFGraphOCLFactory.getExpression("30", GMFGraphPackage.eINSTANCE.getPoint()).evaluate(newInstance_0_1);

			value_0_1_1 = GMFGraphAbstractExpression.performCast(value_0_1_1, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_1.setY(((Integer) value_0_1_1).intValue());

		} catch (RuntimeException e) {
			GMFGraphDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Polygon_3023(Polygon instance) {
		try {
			Point newInstance_0_0 = GMFGraphFactory.eINSTANCE.createPoint();

			instance.getTemplate().add(newInstance_0_0);
			Object value_0_0_0 = GMFGraphOCLFactory.getExpression("10", GMFGraphPackage.eINSTANCE.getPoint()).evaluate(newInstance_0_0);

			value_0_0_0 = GMFGraphAbstractExpression.performCast(value_0_0_0, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_0.setX(((Integer) value_0_0_0).intValue());
			Object value_0_0_1 = GMFGraphOCLFactory.getExpression("10", GMFGraphPackage.eINSTANCE.getPoint()).evaluate(newInstance_0_0);

			value_0_0_1 = GMFGraphAbstractExpression.performCast(value_0_0_1, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_0.setY(((Integer) value_0_0_1).intValue());

			Point newInstance_0_1 = GMFGraphFactory.eINSTANCE.createPoint();

			instance.getTemplate().add(newInstance_0_1);
			Object value_0_1_0 = GMFGraphOCLFactory.getExpression("30", GMFGraphPackage.eINSTANCE.getPoint()).evaluate(newInstance_0_1);

			value_0_1_0 = GMFGraphAbstractExpression.performCast(value_0_1_0, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_1.setX(((Integer) value_0_1_0).intValue());
			Object value_0_1_1 = GMFGraphOCLFactory.getExpression("30", GMFGraphPackage.eINSTANCE.getPoint()).evaluate(newInstance_0_1);

			value_0_1_1 = GMFGraphAbstractExpression.performCast(value_0_1_1, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_1.setY(((Integer) value_0_1_1).intValue());

			Point newInstance_0_2 = GMFGraphFactory.eINSTANCE.createPoint();

			instance.getTemplate().add(newInstance_0_2);
			Object value_0_2_0 = GMFGraphOCLFactory.getExpression("10", GMFGraphPackage.eINSTANCE.getPoint()).evaluate(newInstance_0_2);

			value_0_2_0 = GMFGraphAbstractExpression.performCast(value_0_2_0, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_2.setX(((Integer) value_0_2_0).intValue());
			Object value_0_2_1 = GMFGraphOCLFactory.getExpression("60", GMFGraphPackage.eINSTANCE.getPoint()).evaluate(newInstance_0_2);

			value_0_2_1 = GMFGraphAbstractExpression.performCast(value_0_2_1, EcorePackage.eINSTANCE.getEInt());
			newInstance_0_2.setY(((Integer) value_0_2_1).intValue());

		} catch (RuntimeException e) {
			GMFGraphDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}
}
