/**
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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.graphdef.editor.edit.parts.CanvasEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.CompartmentEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Compartment_VisualFacetsEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Compartment_nameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.ConnectionEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Connection_VisualFacetsEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Connection_nameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Ellipse2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.EllipseEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGallery_FiguresEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGallery_nameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.NodeEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Node_VisualFacetsEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Node_nameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Polyline2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.PolylineEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Rectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RectangleEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangleEditPart;

import org.eclipse.gmf.graphdef.editor.part.GMFGraphVisualIDRegistry;

import org.eclipse.gmf.graphdef.editor.view.factories.CanvasViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.CompartmentViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Compartment_VisualFacetsViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Compartment_nameViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.ConnectionViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Connection_VisualFacetsViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Connection_nameViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Ellipse2ViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.EllipseViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.FigureGalleryViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.FigureGallery_FiguresViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.FigureGallery_nameViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.FigureViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.NodeViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Node_VisualFacetsViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Node_nameViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Polyline2ViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.PolylineViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Rectangle2ViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.RectangleViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.RoundedRectangle2ViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.RoundedRectangleViewFactory;

/**
 * @generated
 */
public class GMFGraphViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (CanvasEditPart.MODEL_ID.equals(diagramKind) && GMFGraphVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return CanvasViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (elementType != null && !GMFGraphElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int nodeVID = GMFGraphVisualIDRegistry.getNodeVisualID(containerView, semanticElement, semanticType, semanticHint);
		switch (nodeVID) {
		case CompartmentEditPart.VISUAL_ID:
			return CompartmentViewFactory.class;
		case Compartment_nameEditPart.VISUAL_ID:
			return Compartment_nameViewFactory.class;
		case NodeEditPart.VISUAL_ID:
			return NodeViewFactory.class;
		case Node_nameEditPart.VISUAL_ID:
			return Node_nameViewFactory.class;
		case ConnectionEditPart.VISUAL_ID:
			return ConnectionViewFactory.class;
		case Connection_nameEditPart.VISUAL_ID:
			return Connection_nameViewFactory.class;
		case FigureGalleryEditPart.VISUAL_ID:
			return FigureGalleryViewFactory.class;
		case FigureGallery_nameEditPart.VISUAL_ID:
			return FigureGallery_nameViewFactory.class;
		case RectangleEditPart.VISUAL_ID:
			return RectangleViewFactory.class;
		case Rectangle2EditPart.VISUAL_ID:
			return Rectangle2ViewFactory.class;
		case EllipseEditPart.VISUAL_ID:
			return EllipseViewFactory.class;
		case RoundedRectangleEditPart.VISUAL_ID:
			return RoundedRectangleViewFactory.class;
		case PolylineEditPart.VISUAL_ID:
			return PolylineViewFactory.class;
		case Ellipse2EditPart.VISUAL_ID:
			return Ellipse2ViewFactory.class;
		case RoundedRectangle2EditPart.VISUAL_ID:
			return RoundedRectangle2ViewFactory.class;
		case Polyline2EditPart.VISUAL_ID:
			return Polyline2ViewFactory.class;
		case Compartment_VisualFacetsEditPart.VISUAL_ID:
			return Compartment_VisualFacetsViewFactory.class;
		case Node_VisualFacetsEditPart.VISUAL_ID:
			return Node_VisualFacetsViewFactory.class;
		case Connection_VisualFacetsEditPart.VISUAL_ID:
			return Connection_VisualFacetsViewFactory.class;
		case FigureGallery_FiguresEditPart.VISUAL_ID:
			return FigureGallery_FiguresViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (elementType != null && !GMFGraphElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		if (GMFGraphElementTypes.DiagramElementFigure_4001.equals(elementType)) {
			return FigureViewFactory.class;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		if (semanticType == null) {
			return null;
		}
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int linkVID = GMFGraphVisualIDRegistry.getLinkWithClassVisualID(semanticElement, semanticType);
		switch (linkVID) {
		}
		return getUnrecognizedConnectorViewClass(semanticAdapter, containerView, semanticHint);
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}

	/**
	 * @generated
	 */
	private Class getUnrecognizedConnectorViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		// Handle unrecognized child node classes here
		return null;
	}

}
