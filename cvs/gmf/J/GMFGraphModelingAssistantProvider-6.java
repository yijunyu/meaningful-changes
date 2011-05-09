/*
 * Copyright (c) 2006, 2007 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
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
import org.eclipse.gmf.graphdef.editor.edit.parts.Ellipse2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.EllipseEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryFiguresEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Rectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RectangleEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangleEditPart;

import org.eclipse.gmf.graphdef.editor.part.GMFGraphDiagramEditorPlugin;

/**
 * @generated
 */
public class GMFGraphModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof RectangleEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3002);
			types.add(GMFGraphElementTypes.Ellipse_3003);
			types.add(GMFGraphElementTypes.RoundedRectangle_3004);
			types.add(GMFGraphElementTypes.Polyline_3005);
			return types;
		}
		if (editPart instanceof Rectangle2EditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3002);
			types.add(GMFGraphElementTypes.Ellipse_3003);
			types.add(GMFGraphElementTypes.RoundedRectangle_3004);
			types.add(GMFGraphElementTypes.Polyline_3005);
			return types;
		}
		if (editPart instanceof EllipseEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3002);
			types.add(GMFGraphElementTypes.Ellipse_3003);
			types.add(GMFGraphElementTypes.RoundedRectangle_3004);
			types.add(GMFGraphElementTypes.Polyline_3005);
			return types;
		}
		if (editPart instanceof RoundedRectangleEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3002);
			types.add(GMFGraphElementTypes.Ellipse_3003);
			types.add(GMFGraphElementTypes.RoundedRectangle_3004);
			types.add(GMFGraphElementTypes.Polyline_3005);
			return types;
		}
		if (editPart instanceof Ellipse2EditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3002);
			types.add(GMFGraphElementTypes.Ellipse_3003);
			types.add(GMFGraphElementTypes.RoundedRectangle_3004);
			types.add(GMFGraphElementTypes.Polyline_3005);
			return types;
		}
		if (editPart instanceof RoundedRectangle2EditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3002);
			types.add(GMFGraphElementTypes.Ellipse_3003);
			types.add(GMFGraphElementTypes.RoundedRectangle_3004);
			types.add(GMFGraphElementTypes.Polyline_3005);
			return types;
		}
		if (editPart instanceof FigureGalleryFiguresEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Rectangle_3001);
			types.add(GMFGraphElementTypes.Ellipse_3006);
			types.add(GMFGraphElementTypes.RoundedRectangle_3007);
			types.add(GMFGraphElementTypes.Polyline_3008);
			return types;
		}
		if (editPart instanceof CanvasEditPart) {
			List types = new ArrayList();
			types.add(GMFGraphElementTypes.Compartment_2001);
			types.add(GMFGraphElementTypes.Node_2002);
			types.add(GMFGraphElementTypes.Connection_2003);
			types.add(GMFGraphElementTypes.FigureGallery_2004);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
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
		dialog.setMessage("Available domain model elements:");
		dialog.setTitle("Select domain model element");
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
