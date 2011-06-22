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
package org.eclipse.gmf.map.editor.providers;

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
import org.eclipse.gmf.map.editor.part.GMFMapDiagramEditorPlugin;

import org.eclipse.gmf.mappings.GMFMapPackage;

/**
 * @generated
 */
public class GMFMapElementTypes {

	/**
	 * @generated
	 */
	private GMFMapElementTypes() {
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
				return GMFMapDiagramEditorPlugin.getInstance().getItemImageDescriptor(eClass.getEPackage().getEFactoryInstance().create(eClass));
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
			elements.put(Mapping_1000, GMFMapPackage.eINSTANCE.getMapping());
			elements.put(TopNodeReference_3001, GMFMapPackage.eINSTANCE.getTopNodeReference());
			elements.put(FeatureLabelMapping_3006, GMFMapPackage.eINSTANCE.getFeatureLabelMapping());
			elements.put(DesignLabelMapping_3007, GMFMapPackage.eINSTANCE.getDesignLabelMapping());
			elements.put(LabelMapping_3002, GMFMapPackage.eINSTANCE.getLabelMapping());
			elements.put(ChildReference_3004, GMFMapPackage.eINSTANCE.getChildReference());
			elements.put(CompartmentMapping_3005, GMFMapPackage.eINSTANCE.getCompartmentMapping());
			elements.put(FeatureLabelMapping_3008, GMFMapPackage.eINSTANCE.getFeatureLabelMapping());
			elements.put(DesignLabelMapping_3009, GMFMapPackage.eINSTANCE.getDesignLabelMapping());
			elements.put(LabelMapping_3003, GMFMapPackage.eINSTANCE.getLabelMapping());
			elements.put(CanvasMapping_2001, GMFMapPackage.eINSTANCE.getCanvasMapping());
			elements.put(NodeMapping_2003, GMFMapPackage.eINSTANCE.getNodeMapping());
			elements.put(LinkMapping_2002, GMFMapPackage.eINSTANCE.getLinkMapping());
			elements.put(TopNodeReferenceOwnedChild_4001, GMFMapPackage.eINSTANCE.getTopNodeReference_OwnedChild());
			elements.put(ChildReferenceOwnedChild_4004, GMFMapPackage.eINSTANCE.getChildReference_OwnedChild());
			elements.put(ChildReferenceReferencedChild_4002, GMFMapPackage.eINSTANCE.getChildReference_ReferencedChild());
			elements.put(CompartmentMappingChildren_4003, GMFMapPackage.eINSTANCE.getCompartmentMapping_Children());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static final IElementType Mapping_1000 = getElementType("org.eclipse.gmf.map.editor.Mapping_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TopNodeReference_3001 = getElementType("org.eclipse.gmf.map.editor.TopNodeReference_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FeatureLabelMapping_3006 = getElementType("org.eclipse.gmf.map.editor.FeatureLabelMapping_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DesignLabelMapping_3007 = getElementType("org.eclipse.gmf.map.editor.DesignLabelMapping_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LabelMapping_3002 = getElementType("org.eclipse.gmf.map.editor.LabelMapping_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ChildReference_3004 = getElementType("org.eclipse.gmf.map.editor.ChildReference_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompartmentMapping_3005 = getElementType("org.eclipse.gmf.map.editor.CompartmentMapping_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FeatureLabelMapping_3008 = getElementType("org.eclipse.gmf.map.editor.FeatureLabelMapping_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DesignLabelMapping_3009 = getElementType("org.eclipse.gmf.map.editor.DesignLabelMapping_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LabelMapping_3003 = getElementType("org.eclipse.gmf.map.editor.LabelMapping_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CanvasMapping_2001 = getElementType("org.eclipse.gmf.map.editor.CanvasMapping_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NodeMapping_2003 = getElementType("org.eclipse.gmf.map.editor.NodeMapping_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LinkMapping_2002 = getElementType("org.eclipse.gmf.map.editor.LinkMapping_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TopNodeReferenceOwnedChild_4001 = getElementType("org.eclipse.gmf.map.editor.TopNodeReferenceOwnedChild_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ChildReferenceOwnedChild_4004 = getElementType("org.eclipse.gmf.map.editor.ChildReferenceOwnedChild_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ChildReferenceReferencedChild_4002 = getElementType("org.eclipse.gmf.map.editor.ChildReferenceReferencedChild_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompartmentMappingChildren_4003 = getElementType("org.eclipse.gmf.map.editor.CompartmentMappingChildren_4003"); //$NON-NLS-1$

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
			KNOWN_ELEMENT_TYPES.add(Mapping_1000);
			KNOWN_ELEMENT_TYPES.add(TopNodeReference_3001);
			KNOWN_ELEMENT_TYPES.add(FeatureLabelMapping_3006);
			KNOWN_ELEMENT_TYPES.add(DesignLabelMapping_3007);
			KNOWN_ELEMENT_TYPES.add(LabelMapping_3002);
			KNOWN_ELEMENT_TYPES.add(ChildReference_3004);
			KNOWN_ELEMENT_TYPES.add(CompartmentMapping_3005);
			KNOWN_ELEMENT_TYPES.add(FeatureLabelMapping_3008);
			KNOWN_ELEMENT_TYPES.add(DesignLabelMapping_3009);
			KNOWN_ELEMENT_TYPES.add(LabelMapping_3003);
			KNOWN_ELEMENT_TYPES.add(CanvasMapping_2001);
			KNOWN_ELEMENT_TYPES.add(NodeMapping_2003);
			KNOWN_ELEMENT_TYPES.add(LinkMapping_2002);
			KNOWN_ELEMENT_TYPES.add(TopNodeReferenceOwnedChild_4001);
			KNOWN_ELEMENT_TYPES.add(ChildReferenceOwnedChild_4004);
			KNOWN_ELEMENT_TYPES.add(ChildReferenceReferencedChild_4002);
			KNOWN_ELEMENT_TYPES.add(CompartmentMappingChildren_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}
}
