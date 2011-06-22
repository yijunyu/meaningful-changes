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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.map.editor.edit.parts.CanvasMappingContentsEditPart;
import org.eclipse.gmf.map.editor.edit.parts.CanvasMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.CanvasMappingInfoEditPart;
import org.eclipse.gmf.map.editor.edit.parts.ChildReferenceEditPart;
import org.eclipse.gmf.map.editor.edit.parts.CompartmentMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.CompartmentMappingInfoEditPart;
import org.eclipse.gmf.map.editor.edit.parts.DesignLabelMapping2EditPart;
import org.eclipse.gmf.map.editor.edit.parts.DesignLabelMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.FeatureLabelMapping2EditPart;
import org.eclipse.gmf.map.editor.edit.parts.FeatureLabelMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.LabelMapping2EditPart;
import org.eclipse.gmf.map.editor.edit.parts.LabelMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.LinkMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.LinkMappingInfoEditPart;
import org.eclipse.gmf.map.editor.edit.parts.LinkMappingLabelsEditPart;
import org.eclipse.gmf.map.editor.edit.parts.MappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.NodeMappingContentsEditPart;
import org.eclipse.gmf.map.editor.edit.parts.NodeMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.NodeMappingInfoEditPart;
import org.eclipse.gmf.map.editor.edit.parts.NodeMappingLabelsEditPart;
import org.eclipse.gmf.map.editor.edit.parts.ReferenceInfo2EditPart;
import org.eclipse.gmf.map.editor.edit.parts.ReferenceInfoEditPart;
import org.eclipse.gmf.map.editor.edit.parts.TopNodeReferenceEditPart;

import org.eclipse.gmf.map.editor.part.GMFMapVisualIDRegistry;

import org.eclipse.gmf.map.editor.view.factories.CanvasMappingContentsViewFactory;
import org.eclipse.gmf.map.editor.view.factories.CanvasMappingInfoViewFactory;
import org.eclipse.gmf.map.editor.view.factories.CanvasMappingViewFactory;
import org.eclipse.gmf.map.editor.view.factories.ChildReferenceOwnedChildViewFactory;
import org.eclipse.gmf.map.editor.view.factories.ChildReferenceReferencedChildViewFactory;
import org.eclipse.gmf.map.editor.view.factories.ChildReferenceViewFactory;
import org.eclipse.gmf.map.editor.view.factories.CompartmentMappingChildrenViewFactory;
import org.eclipse.gmf.map.editor.view.factories.CompartmentMappingInfoViewFactory;
import org.eclipse.gmf.map.editor.view.factories.CompartmentMappingViewFactory;
import org.eclipse.gmf.map.editor.view.factories.DesignLabelMapping2ViewFactory;
import org.eclipse.gmf.map.editor.view.factories.DesignLabelMappingViewFactory;
import org.eclipse.gmf.map.editor.view.factories.FeatureLabelMapping2ViewFactory;
import org.eclipse.gmf.map.editor.view.factories.FeatureLabelMappingViewFactory;
import org.eclipse.gmf.map.editor.view.factories.LabelMapping2ViewFactory;
import org.eclipse.gmf.map.editor.view.factories.LabelMappingViewFactory;
import org.eclipse.gmf.map.editor.view.factories.LinkMappingInfoViewFactory;
import org.eclipse.gmf.map.editor.view.factories.LinkMappingLabelsViewFactory;
import org.eclipse.gmf.map.editor.view.factories.LinkMappingViewFactory;
import org.eclipse.gmf.map.editor.view.factories.MappingViewFactory;
import org.eclipse.gmf.map.editor.view.factories.NodeMappingContentsViewFactory;
import org.eclipse.gmf.map.editor.view.factories.NodeMappingInfoViewFactory;
import org.eclipse.gmf.map.editor.view.factories.NodeMappingLabelsViewFactory;
import org.eclipse.gmf.map.editor.view.factories.NodeMappingViewFactory;
import org.eclipse.gmf.map.editor.view.factories.ReferenceInfo2ViewFactory;
import org.eclipse.gmf.map.editor.view.factories.ReferenceInfoViewFactory;
import org.eclipse.gmf.map.editor.view.factories.TopNodeReferenceOwnedChildViewFactory;
import org.eclipse.gmf.map.editor.view.factories.TopNodeReferenceViewFactory;

/**
 * @generated
 */
public class GMFMapViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (MappingEditPart.MODEL_ID.equals(diagramKind) && GMFMapVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return MappingViewFactory.class;
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
		if (elementType != null && !GMFMapElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int nodeVID = GMFMapVisualIDRegistry.getNodeVisualID(containerView, semanticElement, semanticType, semanticHint);
		switch (nodeVID) {
		case CanvasMappingEditPart.VISUAL_ID:
			return CanvasMappingViewFactory.class;
		case CanvasMappingInfoEditPart.VISUAL_ID:
			return CanvasMappingInfoViewFactory.class;
		case NodeMappingEditPart.VISUAL_ID:
			return NodeMappingViewFactory.class;
		case NodeMappingInfoEditPart.VISUAL_ID:
			return NodeMappingInfoViewFactory.class;
		case LinkMappingEditPart.VISUAL_ID:
			return LinkMappingViewFactory.class;
		case LinkMappingInfoEditPart.VISUAL_ID:
			return LinkMappingInfoViewFactory.class;
		case TopNodeReferenceEditPart.VISUAL_ID:
			return TopNodeReferenceViewFactory.class;
		case ReferenceInfoEditPart.VISUAL_ID:
			return ReferenceInfoViewFactory.class;
		case FeatureLabelMappingEditPart.VISUAL_ID:
			return FeatureLabelMappingViewFactory.class;
		case DesignLabelMappingEditPart.VISUAL_ID:
			return DesignLabelMappingViewFactory.class;
		case LabelMappingEditPart.VISUAL_ID:
			return LabelMappingViewFactory.class;
		case ChildReferenceEditPart.VISUAL_ID:
			return ChildReferenceViewFactory.class;
		case ReferenceInfo2EditPart.VISUAL_ID:
			return ReferenceInfo2ViewFactory.class;
		case CompartmentMappingEditPart.VISUAL_ID:
			return CompartmentMappingViewFactory.class;
		case CompartmentMappingInfoEditPart.VISUAL_ID:
			return CompartmentMappingInfoViewFactory.class;
		case FeatureLabelMapping2EditPart.VISUAL_ID:
			return FeatureLabelMapping2ViewFactory.class;
		case DesignLabelMapping2EditPart.VISUAL_ID:
			return DesignLabelMapping2ViewFactory.class;
		case LabelMapping2EditPart.VISUAL_ID:
			return LabelMapping2ViewFactory.class;
		case CanvasMappingContentsEditPart.VISUAL_ID:
			return CanvasMappingContentsViewFactory.class;
		case NodeMappingLabelsEditPart.VISUAL_ID:
			return NodeMappingLabelsViewFactory.class;
		case NodeMappingContentsEditPart.VISUAL_ID:
			return NodeMappingContentsViewFactory.class;
		case LinkMappingLabelsEditPart.VISUAL_ID:
			return LinkMappingLabelsViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (elementType != null && !GMFMapElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		if (GMFMapElementTypes.TopNodeReferenceOwnedChild_4001.equals(elementType)) {
			return TopNodeReferenceOwnedChildViewFactory.class;
		}
		if (GMFMapElementTypes.ChildReferenceOwnedChild_4004.equals(elementType)) {
			return ChildReferenceOwnedChildViewFactory.class;
		}
		if (GMFMapElementTypes.ChildReferenceReferencedChild_4002.equals(elementType)) {
			return ChildReferenceReferencedChildViewFactory.class;
		}
		if (GMFMapElementTypes.CompartmentMappingChildren_4003.equals(elementType)) {
			return CompartmentMappingChildrenViewFactory.class;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		if (semanticType == null) {
			return null;
		}
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int linkVID = GMFMapVisualIDRegistry.getLinkWithClassVisualID(semanticElement, semanticType);
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
