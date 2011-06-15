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
package org.eclipse.gmf.map.editor.edit.policies;

import java.util.List;
import java.util.Collection;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.emf.ecore.EObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.gef.EditPart;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.map.editor.edit.parts.CanvasMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.ChildReferenceEditPart;
import org.eclipse.gmf.map.editor.edit.parts.ChildReferenceOwnedChildEditPart;
import org.eclipse.gmf.map.editor.edit.parts.ChildReferenceReferencedChildEditPart;
import org.eclipse.gmf.map.editor.edit.parts.CompartmentMappingChildrenEditPart;
import org.eclipse.gmf.map.editor.edit.parts.CompartmentMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.DesignLabelMapping2EditPart;
import org.eclipse.gmf.map.editor.edit.parts.DesignLabelMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.FeatureLabelMapping2EditPart;
import org.eclipse.gmf.map.editor.edit.parts.FeatureLabelMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.LabelMapping2EditPart;
import org.eclipse.gmf.map.editor.edit.parts.LabelMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.LinkMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.MappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.NodeMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.TopNodeReferenceEditPart;
import org.eclipse.gmf.map.editor.edit.parts.TopNodeReferenceOwnedChildEditPart;

import org.eclipse.gmf.map.editor.part.GMFMapVisualIDRegistry;

import org.eclipse.gmf.map.editor.providers.GMFMapElementTypes;

import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.TopNodeReference;

import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;

import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;

import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalConnectionEditPolicy;

import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MappingCanonicalEditPolicy extends CanonicalConnectionEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		nextValue = ((Mapping) modelObject).getDiagram();
		nodeVID = GMFMapVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
		if (CanvasMappingEditPart.VISUAL_ID == nodeVID) {
			result.add(nextValue);
		}
		for (Iterator values = ((Mapping) modelObject).getLinks().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = GMFMapVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (LinkMappingEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return view.isSetElement() && view.getElement() != null && view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected List getSemanticConnectionsList() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	protected EObject getSourceElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected EObject getTargetElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected boolean shouldIncludeConnection(Edge connector, Collection children) {
		return false;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		List createdViews = new LinkedList();
		createdViews.addAll(refreshSemanticChildren());
		createdViews.addAll(refreshPhantoms());
		List createdConnectionViews = new LinkedList();
		createdConnectionViews.addAll(refreshSemanticConnections());
		createdConnectionViews.addAll(refreshConnections());

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);
		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Collection refreshPhantoms() {
		Collection phantomNodes = new LinkedList();
		EObject diagramModelObject = ((View) getHost().getModel()).getElement();
		Diagram diagram = getDiagram();
		Resource resource = diagramModelObject.eResource();
		for (Iterator it = resource.getContents().iterator(); it.hasNext();) {
			EObject nextResourceObject = (EObject) it.next();
			if (nextResourceObject == diagramModelObject) {
				continue;
			}
			int nodeVID = GMFMapVisualIDRegistry.getNodeVisualID(diagram, nextResourceObject);
			switch (nodeVID) {
			case NodeMappingEditPart.VISUAL_ID: {
				phantomNodes.add(nextResourceObject);
				break;
			}
			}
		}

		for (Iterator diagramNodes = getDiagram().getChildren().iterator(); diagramNodes.hasNext();) {
			View nextView = (View) diagramNodes.next();
			EObject nextViewElement = nextView.getElement();
			if (phantomNodes.contains(nextViewElement)) {
				phantomNodes.remove(nextViewElement);
			}
		}
		return createPhantomNodes(phantomNodes);
	}

	/**
	 * @generated
	 */
	private Collection createPhantomNodes(Collection nodes) {
		if (nodes.isEmpty()) {
			return Collections.EMPTY_LIST;
		}
		List descriptors = new ArrayList();
		for (Iterator elements = nodes.iterator(); elements.hasNext();) {
			EObject element = (EObject) elements.next();
			CreateViewRequest.ViewDescriptor descriptor = getViewDescriptor(element);
			descriptors.add(descriptor);
		}
		Diagram diagram = getDiagram();
		EditPart diagramEditPart = getDiagramEditPart();

		CreateViewRequest request = getCreateViewRequest(descriptors);
		Command cmd = diagramEditPart.getCommand(request);
		if (cmd == null) {
			CompositeCommand cc = new CompositeCommand(DiagramUIMessages.AddCommand_Label);
			for (Iterator descriptorsIterator = descriptors.iterator(); descriptorsIterator.hasNext();) {
				CreateViewRequest.ViewDescriptor descriptor = (CreateViewRequest.ViewDescriptor) descriptorsIterator.next();
				ICommand createCommand = new CreateCommand(((IGraphicalEditPart) getHost()).getEditingDomain(), descriptor, diagram);
				cc.compose(createCommand);
			}
			cmd = new ICommandProxy(cc);
		}

		List adapters = Collections.EMPTY_LIST;
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(((IGraphicalEditPart) diagramEditPart).getNotationView())).execute();
			executeCommand(cmd);
			adapters = (List) request.getNewObject();
		}
		diagramEditPart.refresh();
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getDiagramEditPart() {
		return (EditPart) getHost().getViewer().getEditPartRegistry().get(getDiagram());
	}

	/**
	 * @generated
	 */
	private Collection myLinkDescriptors = new LinkedList();

	/**
	 * @generated
	 */
	private Map myEObject2ViewMap = new HashMap();

	/**
	 * @generated
	 */
	private Collection refreshConnections() {
		try {
			collectAllLinks(getDiagram());
			Collection existingLinks = new LinkedList(getDiagram().getEdges());
			for (Iterator diagramLinks = existingLinks.iterator(); diagramLinks.hasNext();) {
				Edge nextDiagramLink = (Edge) diagramLinks.next();
				EObject diagramLinkObject = nextDiagramLink.getElement();
				EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
				EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
				int diagramLinkVisualID = GMFMapVisualIDRegistry.getVisualID(nextDiagramLink);
				for (Iterator modelLinkDescriptors = myLinkDescriptors.iterator(); modelLinkDescriptors.hasNext();) {
					LinkDescriptor nextLinkDescriptor = (LinkDescriptor) modelLinkDescriptors.next();
					if (diagramLinkObject == nextLinkDescriptor.getLinkElement() && diagramLinkSrc == nextLinkDescriptor.getSource() && diagramLinkDst == nextLinkDescriptor.getDestination()
							&& diagramLinkVisualID == nextLinkDescriptor.getVisualID()) {
						diagramLinks.remove();
						modelLinkDescriptors.remove();
					}
				}
			}
			deleteViews(existingLinks.iterator());
			return createConnections(myLinkDescriptors);
		} finally {
			myLinkDescriptors.clear();
			myEObject2ViewMap.clear();
		}
	}

	/**
	 * @generated
	 */
	private void collectAllLinks(View view) {
		EObject modelElement = view.getElement();
		int diagramElementVisualID = GMFMapVisualIDRegistry.getVisualID(view);
		switch (diagramElementVisualID) {
		case CanvasMappingEditPart.VISUAL_ID:
		case NodeMappingEditPart.VISUAL_ID:
		case LinkMappingEditPart.VISUAL_ID:
		case TopNodeReferenceEditPart.VISUAL_ID:
		case FeatureLabelMappingEditPart.VISUAL_ID:
		case DesignLabelMappingEditPart.VISUAL_ID:
		case LabelMappingEditPart.VISUAL_ID:
		case ChildReferenceEditPart.VISUAL_ID:
		case CompartmentMappingEditPart.VISUAL_ID:
		case FeatureLabelMapping2EditPart.VISUAL_ID:
		case DesignLabelMapping2EditPart.VISUAL_ID:
		case LabelMapping2EditPart.VISUAL_ID:
		case MappingEditPart.VISUAL_ID: {
			myEObject2ViewMap.put(modelElement, view);
			storeLinks(modelElement, getDiagram());
		}
		default: {
		}
			for (Iterator children = view.getChildren().iterator(); children.hasNext();) {
				View childView = (View) children.next();
				collectAllLinks(childView);
			}
		}
	}

	/**
	 * @generated
	 */
	private Collection createConnections(Collection linkDescriptors) {
		if (linkDescriptors.isEmpty()) {
			return Collections.EMPTY_LIST;
		}
		List adapters = new LinkedList();
		for (Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator.hasNext();) {
			final LinkDescriptor nextLinkDescriptor = (LinkDescriptor) linkDescriptorsIterator.next();
			EditPart sourceEditPart = getEditPartFor(nextLinkDescriptor.getSource());
			EditPart targetEditPart = getEditPartFor(nextLinkDescriptor.getDestination());
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(nextLinkDescriptor.getSemanticAdapter(), null, ViewUtil.APPEND,
					false, ((IGraphicalEditPart) getHost()).getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPartFor(EObject modelElement) {
		View view = (View) myEObject2ViewMap.get(modelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
		}
		return null;
	}

	/**
	 *@generated
	 */
	private void storeLinks(EObject container, Diagram diagram) {
		EClass containerMetaclass = container.eClass();
		storeFeatureModelFacetLinks(container, containerMetaclass, diagram);
		storeTypeModelFacetLinks(container, containerMetaclass);
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks(EObject container, EClass containerMetaclass) {
	}

	/**
	 *@generated
	 */
	private void storeFeatureModelFacetLinks(EObject container, EClass containerMetaclass, Diagram diagram) {
		if (GMFMapPackage.eINSTANCE.getTopNodeReference().isSuperTypeOf(containerMetaclass)) {
			EObject nextDestination = (EObject) ((TopNodeReference) container).getOwnedChild();
			if (NodeMappingEditPart.VISUAL_ID == GMFMapVisualIDRegistry.getNodeVisualID(diagram, nextDestination)) {
				myLinkDescriptors.add(new LinkDescriptor(container, nextDestination, GMFMapElementTypes.TopNodeReferenceOwnedChild_4001, TopNodeReferenceOwnedChildEditPart.VISUAL_ID));

			}
		}
		if (GMFMapPackage.eINSTANCE.getChildReference().isSuperTypeOf(containerMetaclass)) {
			EObject nextDestination = (EObject) ((ChildReference) container).getOwnedChild();
			if (NodeMappingEditPart.VISUAL_ID == GMFMapVisualIDRegistry.getNodeVisualID(diagram, nextDestination)) {
				myLinkDescriptors.add(new LinkDescriptor(container, nextDestination, GMFMapElementTypes.ChildReferenceOwnedChild_4004, ChildReferenceOwnedChildEditPart.VISUAL_ID));

			}
		}

		if (GMFMapPackage.eINSTANCE.getChildReference().isSuperTypeOf(containerMetaclass)) {
			EObject nextDestination = (EObject) ((ChildReference) container).getReferencedChild();
			myLinkDescriptors.add(new LinkDescriptor(container, nextDestination, GMFMapElementTypes.ChildReferenceReferencedChild_4002, ChildReferenceReferencedChildEditPart.VISUAL_ID));

		}
		if (GMFMapPackage.eINSTANCE.getCompartmentMapping().isSuperTypeOf(containerMetaclass)) {
			for (Iterator destinations = ((CompartmentMapping) container).getChildren().iterator(); destinations.hasNext();) {
				EObject nextDestination = (EObject) destinations.next();
				myLinkDescriptors.add(new LinkDescriptor(container, nextDestination, GMFMapElementTypes.CompartmentMappingChildren_4003, CompartmentMappingChildrenEditPart.VISUAL_ID));

			}
		}
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	private class LinkDescriptor {

		/**
		 * @generated
		 */
		private EObject mySource;

		/**
		 * @generated
		 */
		private EObject myDestination;

		/**
		 * @generated
		 */
		private EObject myLinkElement;

		/**
		 * @generated
		 */
		private int myVisualID;

		/**
		 * @generated
		 */
		private IAdaptable mySemanticAdapter;

		/**
		 * @generated
		 */
		protected LinkDescriptor(EObject source, EObject destination, EObject linkElement, int linkVID) {
			this(source, destination, linkVID);
			myLinkElement = linkElement;
			mySemanticAdapter = new EObjectAdapter(linkElement);
		}

		/**
		 * @generated
		 */
		protected LinkDescriptor(EObject source, EObject destination, IElementType elementType, int linkVID) {
			this(source, destination, linkVID);
			myLinkElement = null;
			final IElementType elementTypeCopy = elementType;
			mySemanticAdapter = new IAdaptable() {

				public Object getAdapter(Class adapter) {
					if (IElementType.class.equals(adapter)) {
						return elementTypeCopy;
					}
					return null;
				}
			};
		}

		/**
		 * @generated
		 */
		private LinkDescriptor(EObject source, EObject destination, int linkVID) {
			mySource = source;
			myDestination = destination;
			myVisualID = linkVID;
		}

		/**
		 * @generated
		 */
		protected EObject getSource() {
			return mySource;
		}

		/**
		 * @generated
		 */
		protected EObject getDestination() {
			return myDestination;
		}

		/**
		 * @generated
		 */
		protected EObject getLinkElement() {
			return myLinkElement;
		}

		/**
		 * @generated
		 */
		protected int getVisualID() {
			return myVisualID;
		}

		/**
		 * @generated
		 */
		protected IAdaptable getSemanticAdapter() {
			return mySemanticAdapter;
		}
	}

}
