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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.graphdef.editor.edit.parts.CanvasEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.ChildAccessEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.CompartmentAccessorEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.CompartmentEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.CompartmentNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.CompartmentVisualFacetsEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.ConnectionEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.ConnectionNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.ConnectionVisualFacetsEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.DiagramElementFigureEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.DiagramLabelAccessorEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Ellipse2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Ellipse3EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.EllipseEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureDescriptorEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureDescriptorNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryFiguresEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.NodeEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.NodeNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.NodeVisualFacetsEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Polyline2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Polyline3EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.PolylineEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Rectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Rectangle3EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RectangleEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangle3EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangleEditPart;
import org.eclipse.gmf.graphdef.editor.part.GMFGraphVisualIDRegistry;
import org.eclipse.gmf.graphdef.editor.view.factories.CanvasViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.ChildAccessViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.CompartmentAccessorViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.CompartmentNameViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.CompartmentViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.CompartmentVisualFacetsViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.ConnectionNameViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.ConnectionViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.ConnectionVisualFacetsViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.DiagramElementFigureViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.DiagramLabelAccessorViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Ellipse2ViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Ellipse3ViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.EllipseViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.FigureDescriptorNameViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.FigureDescriptorViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.FigureGalleryFiguresViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.FigureGalleryNameViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.FigureGalleryViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.NodeNameViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.NodeViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.NodeVisualFacetsViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Polyline2ViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Polyline3ViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.PolylineViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Rectangle2ViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.Rectangle3ViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.RectangleViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.RoundedRectangle2ViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.RoundedRectangle3ViewFactory;
import org.eclipse.gmf.graphdef.editor.view.factories.RoundedRectangleViewFactory;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

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
		EObject domainElement = getSemanticElement(semanticAdapter);

		int visualID;
		if (semanticHint == null) {
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = GMFGraphVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = GMFGraphVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				if (!GMFGraphElementTypes.isKnownElementType(elementType) || false == elementType instanceof IHintedType) {
					return null;
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null;
				}
				if (domainElement != null && visualID != GMFGraphVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
					return null;
				}
			} else {
				switch (visualID) {
				case CanvasEditPart.VISUAL_ID:
				case CompartmentEditPart.VISUAL_ID:
				case NodeEditPart.VISUAL_ID:
				case ConnectionEditPart.VISUAL_ID:
				case FigureGalleryEditPart.VISUAL_ID:
				case FigureDescriptorEditPart.VISUAL_ID:
				case RectangleEditPart.VISUAL_ID:
				case Rectangle2EditPart.VISUAL_ID:
				case EllipseEditPart.VISUAL_ID:
				case RoundedRectangleEditPart.VISUAL_ID:
				case PolylineEditPart.VISUAL_ID:
				case Ellipse2EditPart.VISUAL_ID:
				case RoundedRectangle2EditPart.VISUAL_ID:
				case Polyline2EditPart.VISUAL_ID:
				case Rectangle3EditPart.VISUAL_ID:
				case Ellipse3EditPart.VISUAL_ID:
				case RoundedRectangle3EditPart.VISUAL_ID:
				case Polyline3EditPart.VISUAL_ID:
				case ChildAccessEditPart.VISUAL_ID:
				case CompartmentAccessorEditPart.VISUAL_ID:
				case DiagramLabelAccessorEditPart.VISUAL_ID:
				case DiagramElementFigureEditPart.VISUAL_ID:
					return null;
				}
			}
		}
		if (!GMFGraphVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case CompartmentEditPart.VISUAL_ID:
			return CompartmentViewFactory.class;
		case CompartmentNameEditPart.VISUAL_ID:
			return CompartmentNameViewFactory.class;
		case NodeEditPart.VISUAL_ID:
			return NodeViewFactory.class;
		case NodeNameEditPart.VISUAL_ID:
			return NodeNameViewFactory.class;
		case ConnectionEditPart.VISUAL_ID:
			return ConnectionViewFactory.class;
		case ConnectionNameEditPart.VISUAL_ID:
			return ConnectionNameViewFactory.class;
		case FigureGalleryEditPart.VISUAL_ID:
			return FigureGalleryViewFactory.class;
		case FigureGalleryNameEditPart.VISUAL_ID:
			return FigureGalleryNameViewFactory.class;
		case FigureDescriptorEditPart.VISUAL_ID:
			return FigureDescriptorViewFactory.class;
		case FigureDescriptorNameEditPart.VISUAL_ID:
			return FigureDescriptorNameViewFactory.class;
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
		case Rectangle3EditPart.VISUAL_ID:
			return Rectangle3ViewFactory.class;
		case Ellipse3EditPart.VISUAL_ID:
			return Ellipse3ViewFactory.class;
		case RoundedRectangle3EditPart.VISUAL_ID:
			return RoundedRectangle3ViewFactory.class;
		case Polyline3EditPart.VISUAL_ID:
			return Polyline3ViewFactory.class;
		case CompartmentVisualFacetsEditPart.VISUAL_ID:
			return CompartmentVisualFacetsViewFactory.class;
		case NodeVisualFacetsEditPart.VISUAL_ID:
			return NodeVisualFacetsViewFactory.class;
		case ConnectionVisualFacetsEditPart.VISUAL_ID:
			return ConnectionVisualFacetsViewFactory.class;
		case FigureGalleryFiguresEditPart.VISUAL_ID:
			return FigureGalleryFiguresViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (elementType == null) {
			return null;
		}
		if (!GMFGraphElementTypes.isKnownElementType(elementType) || false == elementType instanceof IHintedType) {
			return null;
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null;
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null;
		}
		int visualID = GMFGraphVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null && visualID != GMFGraphVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return null;
		}
		switch (visualID) {
		case ChildAccessEditPart.VISUAL_ID:
			return ChildAccessViewFactory.class;
		case CompartmentAccessorEditPart.VISUAL_ID:
			return CompartmentAccessorViewFactory.class;
		case DiagramLabelAccessorEditPart.VISUAL_ID:
			return DiagramLabelAccessorViewFactory.class;
		case DiagramElementFigureEditPart.VISUAL_ID:
			return DiagramElementFigureViewFactory.class;
		}
		return null;
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

}
