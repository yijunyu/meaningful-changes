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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.graphdef.editor.edit.parts.CanvasEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.CompartmentEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Ellipse2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Ellipse3EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.EllipseEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureDescriptorEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryFiguresEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.NodeEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Polygon2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Polygon3EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.PolygonEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Polyline2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Polyline3EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.PolylineEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Rectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Rectangle3EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RectangleEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangle3EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangleEditPart;

import org.eclipse.gmf.graphdef.editor.part.GMFGraphDiagramEditorPlugin;
import org.eclipse.gmf.graphdef.editor.part.Messages;

/**
 * @generated
 */
public class GMFGraphModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof FigureDescriptorEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3010);
			types.add(GMFGraphElementTypes.Ellipse_3015);
			types.add(GMFGraphElementTypes.RoundedRectangle_3016);
			types.add(GMFGraphElementTypes.Polyline_3017);
			types.add(GMFGraphElementTypes.Polygon_3024);
			return types;
		}
		if (editPart instanceof RectangleEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3011);
			types.add(GMFGraphElementTypes.Ellipse_3012);
			types.add(GMFGraphElementTypes.RoundedRectangle_3013);
			types.add(GMFGraphElementTypes.Polyline_3014);
			types.add(GMFGraphElementTypes.Polygon_3023);
			return types;
		}
		if (editPart instanceof Rectangle2EditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3011);
			types.add(GMFGraphElementTypes.Ellipse_3012);
			types.add(GMFGraphElementTypes.RoundedRectangle_3013);
			types.add(GMFGraphElementTypes.Polyline_3014);
			types.add(GMFGraphElementTypes.Polygon_3023);
			return types;
		}
		if (editPart instanceof EllipseEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3011);
			types.add(GMFGraphElementTypes.Ellipse_3012);
			types.add(GMFGraphElementTypes.RoundedRectangle_3013);
			types.add(GMFGraphElementTypes.Polyline_3014);
			types.add(GMFGraphElementTypes.Polygon_3023);
			return types;
		}
		if (editPart instanceof RoundedRectangleEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3011);
			types.add(GMFGraphElementTypes.Ellipse_3012);
			types.add(GMFGraphElementTypes.RoundedRectangle_3013);
			types.add(GMFGraphElementTypes.Polyline_3014);
			types.add(GMFGraphElementTypes.Polygon_3023);
			return types;
		}
		if (editPart instanceof PolylineEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Point_3022);
			return types;
		}
		if (editPart instanceof PolygonEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Point_3022);
			return types;
		}
		if (editPart instanceof Ellipse2EditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3011);
			types.add(GMFGraphElementTypes.Ellipse_3012);
			types.add(GMFGraphElementTypes.RoundedRectangle_3013);
			types.add(GMFGraphElementTypes.Polyline_3014);
			types.add(GMFGraphElementTypes.Polygon_3023);
			return types;
		}
		if (editPart instanceof RoundedRectangle2EditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3011);
			types.add(GMFGraphElementTypes.Ellipse_3012);
			types.add(GMFGraphElementTypes.RoundedRectangle_3013);
			types.add(GMFGraphElementTypes.Polyline_3014);
			types.add(GMFGraphElementTypes.Polygon_3023);
			return types;
		}
		if (editPart instanceof Polyline2EditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Point_3022);
			return types;
		}
		if (editPart instanceof Polygon2EditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Point_3022);
			return types;
		}
		if (editPart instanceof Rectangle3EditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3011);
			types.add(GMFGraphElementTypes.Ellipse_3012);
			types.add(GMFGraphElementTypes.RoundedRectangle_3013);
			types.add(GMFGraphElementTypes.Polyline_3014);
			types.add(GMFGraphElementTypes.Polygon_3023);
			return types;
		}
		if (editPart instanceof Ellipse3EditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3011);
			types.add(GMFGraphElementTypes.Ellipse_3012);
			types.add(GMFGraphElementTypes.RoundedRectangle_3013);
			types.add(GMFGraphElementTypes.Polyline_3014);
			types.add(GMFGraphElementTypes.Polygon_3023);
			return types;
		}
		if (editPart instanceof RoundedRectangle3EditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3011);
			types.add(GMFGraphElementTypes.Ellipse_3012);
			types.add(GMFGraphElementTypes.RoundedRectangle_3013);
			types.add(GMFGraphElementTypes.Polyline_3014);
			types.add(GMFGraphElementTypes.Polygon_3023);
			return types;
		}
		if (editPart instanceof Polyline3EditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Point_3022);
			return types;
		}
		if (editPart instanceof Polygon3EditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Point_3022);
			return types;
		}
		if (editPart instanceof FigureGalleryFiguresEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.FigureDescriptor_3009);
			types.add(GMFGraphElementTypes.Rectangle_3018);
			types.add(GMFGraphElementTypes.Ellipse_3019);
			types.add(GMFGraphElementTypes.RoundedRectangle_3020);
			types.add(GMFGraphElementTypes.Polyline_3021);
			types.add(GMFGraphElementTypes.Polygon_3025);
			return types;
		}
		if (editPart instanceof CanvasEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Compartment_2005);
			types.add(GMFGraphElementTypes.Node_2006);
			types.add(GMFGraphElementTypes.Connection_2007);
			types.add(GMFGraphElementTypes.FigureGallery_2008);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CompartmentEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.CompartmentAccessor_4003);
			return types;
		}
		if (sourceEditPart instanceof NodeEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.NodeContentPane_4006);
			return types;
		}
		if (sourceEditPart instanceof FigureDescriptorEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.ChildAccess_4002);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof FigureDescriptorEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.DiagramElementFigure_4005);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CompartmentEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof NodeEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof FigureDescriptorEditPart) {
			List types = new ArrayList();
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof FigureDescriptorEditPart) {
			List types = new ArrayList();
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CompartmentEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof NodeEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof FigureDescriptorEditPart) {
			List types = new ArrayList();
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(GMFGraphDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setMessage(Messages.GMFGraphModelingAssistantProviderMessage);
		dialog.setTitle(Messages.GMFGraphModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
