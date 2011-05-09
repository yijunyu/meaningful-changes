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
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = GMFGraphVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = GMFGraphVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!GMFGraphElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null && visualID != GMFGraphVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!CanvasEditPart.MODEL_ID.equals(GMFGraphVisualIDRegistry.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case CompartmentEditPart.VISUAL_ID:
				case NodeEditPart.VISUAL_ID:
				case ConnectionEditPart.VISUAL_ID:
				case FigureGalleryEditPart.VISUAL_ID:
				case FigureDescriptorEditPart.VISUAL_ID:
				case RectangleEditPart.VISUAL_ID:
				case EllipseEditPart.VISUAL_ID:
				case RoundedRectangleEditPart.VISUAL_ID:
				case PolylineEditPart.VISUAL_ID:
				case Rectangle2EditPart.VISUAL_ID:
				case Ellipse2EditPart.VISUAL_ID:
				case RoundedRectangle2EditPart.VISUAL_ID:
				case Polyline2EditPart.VISUAL_ID:
				case Rectangle3EditPart.VISUAL_ID:
				case Ellipse3EditPart.VISUAL_ID:
				case RoundedRectangle3EditPart.VISUAL_ID:
				case Polyline3EditPart.VISUAL_ID:
					if (domainElement == null || visualID != GMFGraphVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case CompartmentNameEditPart.VISUAL_ID:
				case CompartmentVisualFacetsEditPart.VISUAL_ID:
					if (CompartmentEditPart.VISUAL_ID != GMFGraphVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NodeNameEditPart.VISUAL_ID:
				case NodeVisualFacetsEditPart.VISUAL_ID:
					if (NodeEditPart.VISUAL_ID != GMFGraphVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConnectionNameEditPart.VISUAL_ID:
				case ConnectionVisualFacetsEditPart.VISUAL_ID:
					if (ConnectionEditPart.VISUAL_ID != GMFGraphVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case FigureGalleryNameEditPart.VISUAL_ID:
				case FigureGalleryFiguresEditPart.VISUAL_ID:
					if (FigureGalleryEditPart.VISUAL_ID != GMFGraphVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case FigureDescriptorNameEditPart.VISUAL_ID:
					if (FigureDescriptorEditPart.VISUAL_ID != GMFGraphVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null || !GMFGraphVisualIDRegistry.canCreateNode(containerView, visualID)) {
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
		if (!GMFGraphElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = GMFGraphVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null && visualID != GMFGraphVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
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
