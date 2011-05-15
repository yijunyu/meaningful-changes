/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.wizards.pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.bridge.wizards.strategy.AccessibleClassNodeStrategy;
import org.eclipse.gmf.internal.bridge.wizards.strategy.CompositeStrategy;
import org.eclipse.gmf.internal.bridge.wizards.strategy.Hierarchy;
import org.eclipse.gmf.internal.bridge.wizards.strategy.LeafNodeStrategy;
import org.eclipse.gmf.internal.bridge.wizards.strategy.Strategy;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.MappingEntry;
import org.eclipse.gmf.mappings.NodeReference;
import org.eclipse.gmf.mappings.ShapeNodeMapping;
import org.eclipse.gmf.mappings.TopNodeReference;

/**
 * @author artem
 */
public class MapDefFeeder {

	private final GraphDefLookup myGraphDefLookup;
	private final ToolDefSupplier myToolDefLookup;

	private Hierarchy myHierarchy;
	private final WizardInput myInputHolder;
	private List/*EClass*/ myNodeCandidates;
	private List/*EObject*/ myLinkCandidates;

	public MapDefFeeder(WizardInput holder, ToolDefSupplier toolDefSupplier) {
		assert holder != null;
		myInputHolder = holder;
		myGraphDefLookup = new GraphDefLookup(holder.getCanvasDef());
		myToolDefLookup = toolDefSupplier;
	}

	protected final Mapping getMapping() {
		return myInputHolder.getMapping();
	}

	public void feedDefaultMapping() {
		final Hierarchy hierarchy = getHierarchy();
		myNodeCandidates = new UniqueEList(hierarchy.getAllClasses());
		createNodeFilter().filter(myNodeCandidates, hierarchy);

		myLinkCandidates = new ArrayList();
		createLinkFilter().filter(myLinkCandidates, hierarchy);

		myLinkCandidates.addAll(hierarchy.getAccessibleReferences(myNodeCandidates.iterator()));

		getMapping().getNodes().clear();
		getMapping().getNodes().addAll(nodesFrom(myNodeCandidates));
		getMapping().getLinks().clear();
		getMapping().getLinks().addAll(linksFrom(myLinkCandidates));
		getMapping().getDiagram().setPalette(myInputHolder.getToolDef().getPalette());
	}

	private Hierarchy getHierarchy() {
		if (myHierarchy == null) {
			myHierarchy = new Hierarchy(getMapping().getDiagram().getDomainMetaElement());
			myHierarchy.collect();
		}
		return myHierarchy;
	}

	private Strategy createNodeFilter() {
		// TODO add UI and instantiate strategies from descriptors
		return new CompositeStrategy(new Strategy[] {
				new AccessibleClassNodeStrategy(),
				new LeafNodeStrategy(),
		});
	}

	private Strategy createLinkFilter() {
		//MergingStrategy?
		// default: Accessible, Leaf
		return new Strategy() {
			public String getID() {
				throw new UnsupportedOperationException("QuickHack");
			}
			public void filter(Collection soFar, Hierarchy hierarchy) {
				List linkCandidates = new UniqueEList(hierarchy.getAccessibleLinkClasses());
				for (Iterator iter = linkCandidates.iterator(); iter.hasNext();) {
					EClass element = (EClass) iter.next();
					if (!hierarchy.isLeaf(element)) {
						iter.remove();
					}
				}
				soFar.clear();
				soFar.addAll(linkCandidates);
			}
		};
	}

	private List/*<NodeReference>*/ nodesFrom(List candidates) {
		BasicEList rv = new BasicEList(candidates.size());
		for (Iterator iter = candidates.iterator(); iter.hasNext();) {
			EClass eClass = (EClass) iter.next();
			ShapeNodeMapping nm = GMFMapFactory.eINSTANCE.createShapeNodeMapping();
			nm.setDomainMetaElement(eClass); 
			nm.setDiagramNode(myGraphDefLookup.findSuitableNode(nm));
			addEditFeature(nm, eClass);
			nm.setTool(myToolDefLookup.findTool(nm));
			TopNodeReference tnr = GMFMapFactory.eINSTANCE.createTopNodeReference();
			tnr.setContainmentFeature(getHierarchy().backRef(eClass)); // FIXME [containment] !!!
			tnr.setOwnedChild(nm);
			rv.add(tnr);
		}
		return rv;
	}

	private List/*<LinkMapping>*/ linksFrom(List candidates) {
		BasicEList rv = new BasicEList(candidates.size());
		for (Iterator iter = candidates.iterator(); iter.hasNext();) {
			Object next = iter.next();
			LinkMapping lm = GMFMapFactory.eINSTANCE.createLinkMapping();
			if (next instanceof EClass) {
				EClass eClass = (EClass) next;
				lm.setDomainMetaElement(eClass);
				lm.setContainmentFeature(getHierarchy().backRef(eClass));
				addEditFeature(lm, eClass);
				lm.setLinkMetaFeature(getHierarchy().getLinkFeature(eClass));
			} else {
				lm.setLinkMetaFeature((EReference) next);
			}
			lm.setDiagramLink(myGraphDefLookup.findSuitableLink(lm));
			lm.setTool(myToolDefLookup.findTool(lm));
			rv.add(lm);
		}
		return rv;
	}

	private void addEditFeature(MappingEntry me, EClass class1) {
		for (Iterator it = class1.getEAllAttributes().iterator(); it.hasNext();) {
			EAttribute n = (EAttribute) it.next();
			// EDataType at = n.getEAttributeType();
			// at != null && at.getEPackage() != null && at.getEPackage().getNsURI().equals(EcorePackage.eNS_URI) && at.getName().equals(EcorePackage.eINSTANCE.getEString().getName())
			if (EcorePackage.eINSTANCE.getEString().equals(n.getEType())) {
				LabelMapping lm = GMFMapFactory.eINSTANCE.createLabelMapping();
				lm.getFeatures().add(n);
				me.getLabelMappings().add(lm);
				return;
			}
		}
	}

	public NodeReference[] getInitialNodes() {
		return (NodeReference[]) nodesFrom(myNodeCandidates).toArray(new NodeReference[0]);
	}

	public LinkMapping[] getInitialLinks() {
		return (LinkMapping[]) linksFrom(myLinkCandidates).toArray(new LinkMapping[0]);
	}
}