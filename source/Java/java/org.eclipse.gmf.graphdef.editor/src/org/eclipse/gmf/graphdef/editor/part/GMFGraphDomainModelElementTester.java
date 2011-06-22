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
package org.eclipse.gmf.graphdef.editor.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * @generated
 */
public class GMFGraphDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args, Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == GMFGraphPackage.eINSTANCE.getCanvas()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getFigureGallery()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getIdentity()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getDiagramElement()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getAbstractNode()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getNode()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getConnection()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getCompartment()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getDiagramLabel()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getVisualFacet()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getGeneralFacet()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getAlignmentFacet()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getGradientFacet()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getLabelOffsetFacet()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getDefaultSizeFacet()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getFigure()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getAbstractFigure()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getFigureDescriptor()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getChildAccess()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getRealFigure()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getFigureRef()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getConnectionFigure()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getDecorationFigure()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getShape()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getLabel()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getLabeledContainer()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getRectangle()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getRoundedRectangle()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getEllipse()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getPolyline()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getPolygon()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getScalablePolygon()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getPolylineConnection()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getPolylineDecoration()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getPolygonDecoration()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getCustomClass()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getCustomAttribute()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getFigureAccessor()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getCustomFigure()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getCustomDecoration()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getCustomConnection()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getColor()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getRGBColor()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getConstantColor()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getFont()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getBasicFont()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getPoint()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getDimension()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getInsets()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getBorder()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getBorderRef()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getLineBorder()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getMarginBorder()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getCompoundBorder()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getCustomBorder()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getLayoutData()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getCustomLayoutData()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getGridLayoutData()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getBorderLayoutData()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getLayoutable()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getLayout()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getLayoutRef()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getCustomLayout()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getGridLayout()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getBorderLayout()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getFlowLayout()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getXYLayout()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getXYLayoutData()) {
			return true;
		}
		if (eClass == GMFGraphPackage.eINSTANCE.getStackLayout()) {
			return true;
		}
		return false;
	}

}
