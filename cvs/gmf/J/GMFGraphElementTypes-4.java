/*
 * Copyright (c) 2006 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

import org.eclipse.gmf.graphdef.editor.part.GMFGraphDiagramEditorPlugin;

/**
 * @generated
 */
public class GMFGraphElementTypes {

	/**
	 * @generated
	 */
	private GMFGraphElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			element = ((EStructuralFeature) element).getEContainingClass();
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return GMFGraphDiagramEditorPlugin.getInstance().getItemImageDescriptor(eClass.getEPackage().getEFactoryInstance().create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();
			elements.put(Canvas_1000, GMFGraphPackage.eINSTANCE.getCanvas());
			elements.put(Rectangle_3001, GMFGraphPackage.eINSTANCE.getRectangle());
			elements.put(Rectangle_3002, GMFGraphPackage.eINSTANCE.getRectangle());
			elements.put(Ellipse_3003, GMFGraphPackage.eINSTANCE.getEllipse());
			elements.put(RoundedRectangle_3004, GMFGraphPackage.eINSTANCE.getRoundedRectangle());
			elements.put(Polyline_3005, GMFGraphPackage.eINSTANCE.getPolyline());
			elements.put(Ellipse_3006, GMFGraphPackage.eINSTANCE.getEllipse());
			elements.put(RoundedRectangle_3007, GMFGraphPackage.eINSTANCE.getRoundedRectangle());
			elements.put(Polyline_3008, GMFGraphPackage.eINSTANCE.getPolyline());
			elements.put(Compartment_2001, GMFGraphPackage.eINSTANCE.getCompartment());
			elements.put(Node_2002, GMFGraphPackage.eINSTANCE.getNode());
			elements.put(Connection_2003, GMFGraphPackage.eINSTANCE.getConnection());
			elements.put(FigureGallery_2004, GMFGraphPackage.eINSTANCE.getFigureGallery());
			elements.put(DiagramElementFigure_4001, GMFGraphPackage.eINSTANCE.getDiagramElement_Figure());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static final IElementType Canvas_1000 = getElementType("org.eclipse.gmf.graphdef.editor.Canvas_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Rectangle_3001 = getElementType("org.eclipse.gmf.graphdef.editor.Rectangle_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Rectangle_3002 = getElementType("org.eclipse.gmf.graphdef.editor.Rectangle_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Ellipse_3003 = getElementType("org.eclipse.gmf.graphdef.editor.Ellipse_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RoundedRectangle_3004 = getElementType("org.eclipse.gmf.graphdef.editor.RoundedRectangle_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Polyline_3005 = getElementType("org.eclipse.gmf.graphdef.editor.Polyline_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Ellipse_3006 = getElementType("org.eclipse.gmf.graphdef.editor.Ellipse_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RoundedRectangle_3007 = getElementType("org.eclipse.gmf.graphdef.editor.RoundedRectangle_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Polyline_3008 = getElementType("org.eclipse.gmf.graphdef.editor.Polyline_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Compartment_2001 = getElementType("org.eclipse.gmf.graphdef.editor.Compartment_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Node_2002 = getElementType("org.eclipse.gmf.graphdef.editor.Node_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Connection_2003 = getElementType("org.eclipse.gmf.graphdef.editor.Connection_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FigureGallery_2004 = getElementType("org.eclipse.gmf.graphdef.editor.FigureGallery_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DiagramElementFigure_4001 = getElementType("org.eclipse.gmf.graphdef.editor.DiagramElementFigure_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Canvas_1000);
			KNOWN_ELEMENT_TYPES.add(Rectangle_3001);
			KNOWN_ELEMENT_TYPES.add(Rectangle_3002);
			KNOWN_ELEMENT_TYPES.add(Ellipse_3003);
			KNOWN_ELEMENT_TYPES.add(RoundedRectangle_3004);
			KNOWN_ELEMENT_TYPES.add(Polyline_3005);
			KNOWN_ELEMENT_TYPES.add(Ellipse_3006);
			KNOWN_ELEMENT_TYPES.add(RoundedRectangle_3007);
			KNOWN_ELEMENT_TYPES.add(Polyline_3008);
			KNOWN_ELEMENT_TYPES.add(Compartment_2001);
			KNOWN_ELEMENT_TYPES.add(Node_2002);
			KNOWN_ELEMENT_TYPES.add(Connection_2003);
			KNOWN_ELEMENT_TYPES.add(FigureGallery_2004);
			KNOWN_ELEMENT_TYPES.add(DiagramElementFigure_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}
}
