/**
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.genmodel.navigator;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNavigator;
import org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference;
import org.eclipse.gmf.codegen.gmfgen.GenNavigatorReferenceType;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;

public class NavigatorHandler {

	private GenDiagram myDiagram;

	private GenNavigator myNavigator;

	private boolean myShowLinkTargets;

	private boolean myShowOutgoingLinks;

	private boolean myShowLinkSources;

	private boolean myShowIncomingLinks;
	
	public NavigatorHandler() {
		myShowIncomingLinks = true;
		myShowOutgoingLinks = true;
		myShowLinkSources = true;
		myShowLinkTargets = true;
	}

	public void initialize(GenDiagram genDiagram, GenNavigator genNavigator) {
		myDiagram = genDiagram;
		myNavigator = genNavigator;
		process(myDiagram);
	}

	public void process(GenDiagram diagram) {
		createChildReference(diagram, null, GenNavigatorReferenceType.CHILDREN_LITERAL);
	}

	public void process(GenTopLevelNode topLevelNode) {
		createChildNodeReference(topLevelNode, myDiagram);
	}

	public void process(GenChildNode childNode, GenChildContainer container) {
		GenNode parent = null;
		if (container instanceof GenCompartment) {
			parent = ((GenCompartment) container).getNode();
		} else if (container instanceof GenNode) {
			parent = (GenNode) container;
		}
		assert parent != null;
		createChildNodeReference(childNode, parent);
	}

	public void process(GenLink link) {
		GenNavigatorChildReference childReference = createChildReference(link, myDiagram, GenNavigatorReferenceType.CHILDREN_LITERAL);
		childReference.setGroupName("links");
		childReference.setGroupIcon("icons/linksNavigatorGroup.gif");


		Collection<GenNode> targetNodes = getTargetGenNodes(link);
		for (GenNode node : targetNodes) {
			if (myShowLinkTargets) {
				GenNavigatorChildReference reference = createChildReference(node, link, GenNavigatorReferenceType.OUT_TAGET_LITERAL);
				reference.setGroupName("target");
				reference.setGroupIcon("icons/linkTargetNavigatorGroup.gif");
			}
			
			if (myShowIncomingLinks) {
				GenNavigatorChildReference reference = createChildReference(link, node, GenNavigatorReferenceType.IN_SOURCE_LITERAL);
				reference.setGroupName("incoming links");
				reference.setGroupIcon("icons/incomingLinksNavigatorGroup.gif");
			}
		}

		Collection<GenNode> sourceNodes = getSourceGenNodes(link);
		for (GenNode node : sourceNodes) {
			if (myShowLinkSources) {
				GenNavigatorChildReference reference = createChildReference(node, link, GenNavigatorReferenceType.IN_SOURCE_LITERAL);
				reference.setGroupName("source");
				reference.setGroupIcon("icons/linkSourceNavigatorGroup.gif");
			}
			
			if (myShowOutgoingLinks) {
				GenNavigatorChildReference reference = createChildReference(link, node, GenNavigatorReferenceType.OUT_TAGET_LITERAL);
				reference.setGroupName("outgoing links");
				reference.setGroupIcon("icons/outgoingLinksNavigatorGroup.gif");
			}
		}
	}

	private Collection<GenNode> getTargetGenNodes(GenLink link) {
		if (link.getModelFacet() == null) {
			return myDiagram.getAllNodes();
		}
		return getAssignableGenNodes(link.getModelFacet().getTargetType());
	}

	private Collection<GenNode> getSourceGenNodes(GenLink link) {
		if (link.getModelFacet() == null) {
			return myDiagram.getAllNodes();
		}
		return getAssignableGenNodes(link.getModelFacet().getSourceType());
	}

	private Collection<GenNode> getAssignableGenNodes(GenClass genClass) {
		Collection<GenNode> result = new LinkedHashSet<GenNode>();
		for (Iterator genNodes = myDiagram.getAllNodes().iterator(); genClass != null && genNodes.hasNext();) {
			GenNode nextNode = (GenNode) genNodes.next();
			if (genClass.getEcoreClass().isSuperTypeOf(nextNode.getDomainMetaClass().getEcoreClass())) {
				result.add(nextNode);
			}
		}
		return result;
	}

	private void createChildNodeReference(GenNode childNode, GenCommonBase parent) {
		createChildReference(childNode, parent, GenNavigatorReferenceType.CHILDREN_LITERAL);
	}

	private GenNavigatorChildReference createChildReference(GenCommonBase child, GenCommonBase parent, GenNavigatorReferenceType referenceType) {
		GenNavigatorChildReference childReference = GMFGenFactory.eINSTANCE.createGenNavigatorChildReference();
		if (parent != null) {
			childReference.setParent(parent);
		}
		childReference.setChild(child);
		childReference.setReferenceType(referenceType);
		myNavigator.getChildReferences().add(childReference);
		return childReference;
	}

}