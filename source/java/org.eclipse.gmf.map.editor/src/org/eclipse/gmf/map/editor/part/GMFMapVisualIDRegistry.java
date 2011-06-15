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
package org.eclipse.gmf.map.editor.part;

import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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

import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.DesignLabelMapping;
import org.eclipse.gmf.mappings.FeatureLabelMapping;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.TopNodeReference;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented 
 * by a domain model object.
 *
 * @generated
 */
public class GMFMapVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = GMFMapDiagramEditorPlugin.getInstance().getBundle().getSymbolicName() + "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MappingEditPart.MODEL_ID.equals(view.getType())) {
				return MappingEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				GMFMapDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getDiagramVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	private static int getDiagramVisualID(EObject domainElement, EClass domainElementMetaclass) {
		if (GMFMapPackage.eINSTANCE.getMapping().isSuperTypeOf(domainElementMetaclass) && isDiagramMapping_1000((Mapping) domainElement)) {
			return MappingEditPart.VISUAL_ID;
		}
		return getUnrecognizedDiagramID(domainElement);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getNodeVisualID(containerView, domainElement, domainElementMetaclass, null);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement, EClass domainElementMetaclass, String semanticHint) {
		String containerModelID = getModelID(containerView);
		if (!MappingEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (MappingEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MappingEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		int nodeVisualID = semanticHint != null ? getVisualID(semanticHint) : -1;
		switch (containerVisualID) {
		case CanvasMappingEditPart.VISUAL_ID:
			if (CanvasMappingInfoEditPart.VISUAL_ID == nodeVisualID) {
				return CanvasMappingInfoEditPart.VISUAL_ID;
			}
			if (CanvasMappingContentsEditPart.VISUAL_ID == nodeVisualID) {
				return CanvasMappingContentsEditPart.VISUAL_ID;
			}
			return getUnrecognizedCanvasMapping_2001ChildNodeID(domainElement, semanticHint);
		case NodeMappingEditPart.VISUAL_ID:
			if (NodeMappingInfoEditPart.VISUAL_ID == nodeVisualID) {
				return NodeMappingInfoEditPart.VISUAL_ID;
			}
			if (NodeMappingLabelsEditPart.VISUAL_ID == nodeVisualID) {
				return NodeMappingLabelsEditPart.VISUAL_ID;
			}
			if (NodeMappingContentsEditPart.VISUAL_ID == nodeVisualID) {
				return NodeMappingContentsEditPart.VISUAL_ID;
			}
			return getUnrecognizedNodeMapping_2003ChildNodeID(domainElement, semanticHint);
		case LinkMappingEditPart.VISUAL_ID:
			if (LinkMappingInfoEditPart.VISUAL_ID == nodeVisualID) {
				return LinkMappingInfoEditPart.VISUAL_ID;
			}
			if (LinkMappingLabelsEditPart.VISUAL_ID == nodeVisualID) {
				return LinkMappingLabelsEditPart.VISUAL_ID;
			}
			return getUnrecognizedLinkMapping_2002ChildNodeID(domainElement, semanticHint);
		case TopNodeReferenceEditPart.VISUAL_ID:
			if (ReferenceInfoEditPart.VISUAL_ID == nodeVisualID) {
				return ReferenceInfoEditPart.VISUAL_ID;
			}
			return getUnrecognizedTopNodeReference_3001ChildNodeID(domainElement, semanticHint);
		case FeatureLabelMappingEditPart.VISUAL_ID:
			return getUnrecognizedFeatureLabelMapping_3006ChildNodeID(domainElement, semanticHint);
		case DesignLabelMappingEditPart.VISUAL_ID:
			return getUnrecognizedDesignLabelMapping_3007ChildNodeID(domainElement, semanticHint);
		case LabelMappingEditPart.VISUAL_ID:
			return getUnrecognizedLabelMapping_3002ChildNodeID(domainElement, semanticHint);
		case ChildReferenceEditPart.VISUAL_ID:
			if (ReferenceInfo2EditPart.VISUAL_ID == nodeVisualID) {
				return ReferenceInfo2EditPart.VISUAL_ID;
			}
			return getUnrecognizedChildReference_3004ChildNodeID(domainElement, semanticHint);
		case CompartmentMappingEditPart.VISUAL_ID:
			if (CompartmentMappingInfoEditPart.VISUAL_ID == nodeVisualID) {
				return CompartmentMappingInfoEditPart.VISUAL_ID;
			}
			return getUnrecognizedCompartmentMapping_3005ChildNodeID(domainElement, semanticHint);
		case FeatureLabelMapping2EditPart.VISUAL_ID:
			return getUnrecognizedFeatureLabelMapping_3008ChildNodeID(domainElement, semanticHint);
		case DesignLabelMapping2EditPart.VISUAL_ID:
			return getUnrecognizedDesignLabelMapping_3009ChildNodeID(domainElement, semanticHint);
		case LabelMapping2EditPart.VISUAL_ID:
			return getUnrecognizedLabelMapping_3003ChildNodeID(domainElement, semanticHint);
		case CanvasMappingContentsEditPart.VISUAL_ID:
			if ((semanticHint == null || TopNodeReferenceEditPart.VISUAL_ID == nodeVisualID) && GMFMapPackage.eINSTANCE.getTopNodeReference().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeTopNodeReference_3001((TopNodeReference) domainElement))) {
				return TopNodeReferenceEditPart.VISUAL_ID;
			}
			return getUnrecognizedCanvasMappingContents_7001ChildNodeID(domainElement, semanticHint);
		case NodeMappingLabelsEditPart.VISUAL_ID:
			if ((semanticHint == null || FeatureLabelMappingEditPart.VISUAL_ID == nodeVisualID) && GMFMapPackage.eINSTANCE.getFeatureLabelMapping().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeFeatureLabelMapping_3006((FeatureLabelMapping) domainElement))) {
				return FeatureLabelMappingEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DesignLabelMappingEditPart.VISUAL_ID == nodeVisualID) && GMFMapPackage.eINSTANCE.getDesignLabelMapping().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeDesignLabelMapping_3007((DesignLabelMapping) domainElement))) {
				return DesignLabelMappingEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || LabelMappingEditPart.VISUAL_ID == nodeVisualID) && GMFMapPackage.eINSTANCE.getLabelMapping().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeLabelMapping_3002((LabelMapping) domainElement))) {
				return LabelMappingEditPart.VISUAL_ID;
			}
			return getUnrecognizedNodeMappingLabels_7003ChildNodeID(domainElement, semanticHint);
		case NodeMappingContentsEditPart.VISUAL_ID:
			if ((semanticHint == null || ChildReferenceEditPart.VISUAL_ID == nodeVisualID) && GMFMapPackage.eINSTANCE.getChildReference().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeChildReference_3004((ChildReference) domainElement))) {
				return ChildReferenceEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || CompartmentMappingEditPart.VISUAL_ID == nodeVisualID) && GMFMapPackage.eINSTANCE.getCompartmentMapping().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCompartmentMapping_3005((CompartmentMapping) domainElement))) {
				return CompartmentMappingEditPart.VISUAL_ID;
			}
			return getUnrecognizedNodeMappingContents_7004ChildNodeID(domainElement, semanticHint);
		case LinkMappingLabelsEditPart.VISUAL_ID:
			if ((semanticHint == null || FeatureLabelMapping2EditPart.VISUAL_ID == nodeVisualID) && GMFMapPackage.eINSTANCE.getFeatureLabelMapping().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeFeatureLabelMapping_3008((FeatureLabelMapping) domainElement))) {
				return FeatureLabelMapping2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DesignLabelMapping2EditPart.VISUAL_ID == nodeVisualID) && GMFMapPackage.eINSTANCE.getDesignLabelMapping().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeDesignLabelMapping_3009((DesignLabelMapping) domainElement))) {
				return DesignLabelMapping2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || LabelMapping2EditPart.VISUAL_ID == nodeVisualID) && GMFMapPackage.eINSTANCE.getLabelMapping().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeLabelMapping_3003((LabelMapping) domainElement))) {
				return LabelMapping2EditPart.VISUAL_ID;
			}
			return getUnrecognizedLinkMappingLabels_7002ChildNodeID(domainElement, semanticHint);
		case MappingEditPart.VISUAL_ID:
			if ((semanticHint == null || CanvasMappingEditPart.VISUAL_ID == nodeVisualID) && GMFMapPackage.eINSTANCE.getCanvasMapping().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCanvasMapping_2001((CanvasMapping) domainElement))) {
				return CanvasMappingEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || NodeMappingEditPart.VISUAL_ID == nodeVisualID) && GMFMapPackage.eINSTANCE.getNodeMapping().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeNodeMapping_2003((NodeMapping) domainElement))) {
				return NodeMappingEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || LinkMappingEditPart.VISUAL_ID == nodeVisualID) && GMFMapPackage.eINSTANCE.getLinkMapping().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeLinkMapping_2002((LinkMapping) domainElement))) {
				return LinkMappingEditPart.VISUAL_ID;
			}
			return getUnrecognizedMapping_1000ChildNodeID(domainElement, semanticHint);
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getLinkWithClassVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement, EClass domainElementMetaclass) {
		{
			return getUnrecognizedLinkWithClassID(domainElement);
		}
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isDiagramMapping_1000(Mapping element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDiagramID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeCanvasMapping_2001(CanvasMapping element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeNodeMapping_2003(NodeMapping element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeLinkMapping_2002(LinkMapping element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeTopNodeReference_3001(TopNodeReference element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeFeatureLabelMapping_3006(FeatureLabelMapping element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeDesignLabelMapping_3007(DesignLabelMapping element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeLabelMapping_3002(LabelMapping element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeChildReference_3004(ChildReference element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeCompartmentMapping_3005(CompartmentMapping element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeFeatureLabelMapping_3008(FeatureLabelMapping element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeDesignLabelMapping_3009(DesignLabelMapping element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeLabelMapping_3003(LabelMapping element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedCanvasMapping_2001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedNodeMapping_2003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedLinkMapping_2002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedTopNodeReference_3001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedFeatureLabelMapping_3006ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDesignLabelMapping_3007ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedLabelMapping_3002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedChildReference_3004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedCompartmentMapping_3005ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedFeatureLabelMapping_3008ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDesignLabelMapping_3009ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedLabelMapping_3003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedCanvasMappingContents_7001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedNodeMappingLabels_7003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedNodeMappingContents_7004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedLinkMappingLabels_7002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedMapping_1000ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedLinkWithClassID(EObject domainElement) {
		return -1;
	}
}
