package org.eclipse.gmf.graphdef.editor.providers;

import java.util.IdentityHashMap;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

import org.eclipse.gmf.graphdef.editor.part.GMFGraphDiagramEditorPlugin;

import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;

import org.eclipse.swt.graphics.Image;

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
			elements.put(Canvas_79, GMFGraphPackage.eINSTANCE.getCanvas());
			elements.put(Rectangle_2001, GMFGraphPackage.eINSTANCE.getRectangle());
			elements.put(Rectangle_2002, GMFGraphPackage.eINSTANCE.getRectangle());
			elements.put(Ellipse_2003, GMFGraphPackage.eINSTANCE.getEllipse());
			elements.put(RoundedRectangle_2004, GMFGraphPackage.eINSTANCE.getRoundedRectangle());
			elements.put(Polyline_2005, GMFGraphPackage.eINSTANCE.getPolyline());
			elements.put(Ellipse_2006, GMFGraphPackage.eINSTANCE.getEllipse());
			elements.put(RoundedRectangle_2007, GMFGraphPackage.eINSTANCE.getRoundedRectangle());
			elements.put(Polyline_2008, GMFGraphPackage.eINSTANCE.getPolyline());
			elements.put(Compartment_1001, GMFGraphPackage.eINSTANCE.getCompartment());
			elements.put(Node_1002, GMFGraphPackage.eINSTANCE.getNode());
			elements.put(Connection_1003, GMFGraphPackage.eINSTANCE.getConnection());
			elements.put(FigureGallery_1004, GMFGraphPackage.eINSTANCE.getFigureGallery());
			elements.put(DiagramElementFigure_3001, GMFGraphPackage.eINSTANCE.getDiagramElement_Figure());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static final IElementType Canvas_79 = getElementType("org.eclipse.gmf.graphdef.editor.Canvas_79");

	/**
	 * @generated
	 */
	public static final IElementType Rectangle_2001 = getElementType("org.eclipse.gmf.graphdef.editor.Rectangle_2001");

	/**
	 * @generated
	 */
	public static final IElementType Rectangle_2002 = getElementType("org.eclipse.gmf.graphdef.editor.Rectangle_2002");

	/**
	 * @generated
	 */
	public static final IElementType Ellipse_2003 = getElementType("org.eclipse.gmf.graphdef.editor.Ellipse_2003");

	/**
	 * @generated
	 */
	public static final IElementType RoundedRectangle_2004 = getElementType("org.eclipse.gmf.graphdef.editor.RoundedRectangle_2004");

	/**
	 * @generated
	 */
	public static final IElementType Polyline_2005 = getElementType("org.eclipse.gmf.graphdef.editor.Polyline_2005");

	/**
	 * @generated
	 */
	public static final IElementType Ellipse_2006 = getElementType("org.eclipse.gmf.graphdef.editor.Ellipse_2006");

	/**
	 * @generated
	 */
	public static final IElementType RoundedRectangle_2007 = getElementType("org.eclipse.gmf.graphdef.editor.RoundedRectangle_2007");

	/**
	 * @generated
	 */
	public static final IElementType Polyline_2008 = getElementType("org.eclipse.gmf.graphdef.editor.Polyline_2008");

	/**
	 * @generated
	 */
	public static final IElementType Compartment_1001 = getElementType("org.eclipse.gmf.graphdef.editor.Compartment_1001");

	/**
	 * @generated
	 */
	public static final IElementType Node_1002 = getElementType("org.eclipse.gmf.graphdef.editor.Node_1002");

	/**
	 * @generated
	 */
	public static final IElementType Connection_1003 = getElementType("org.eclipse.gmf.graphdef.editor.Connection_1003");

	/**
	 * @generated
	 */
	public static final IElementType FigureGallery_1004 = getElementType("org.eclipse.gmf.graphdef.editor.FigureGallery_1004");

	/**
	 * @generated
	 */
	public static final IElementType DiagramElementFigure_3001 = getElementType("org.eclipse.gmf.graphdef.editor.DiagramElementFigure_3001");

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}
}
