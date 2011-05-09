/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.bridge.wizards.strategy.AccessibleClassNodeStrategy;
import org.eclipse.gmf.internal.bridge.wizards.strategy.CompositeStrategy;
import org.eclipse.gmf.internal.bridge.wizards.strategy.Hierarchy;
import org.eclipse.gmf.internal.bridge.wizards.strategy.LeafNodeStrategy;
import org.eclipse.gmf.internal.bridge.wizards.strategy.Strategy;
import org.eclipse.gmf.mappings.FeatureLabelMapping;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.MappingEntry;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.NodeReference;
import org.eclipse.gmf.mappings.TopNodeReference;

/**
 * @author artem
 */
public class MapDefFeeder {

	private final GraphDefLookup myGraphDefLookup;
	private final ToolDefSupplier myToolDefLookup;

	private Hierarchy myHierarchy;
	private final WizardInput myInputHolder;
	private List<EClass> myNodeCandidates;
	private List<EObject> myLinkCandidates;

	public MapDefFeeder(WizardInput holder, ToolDefSupplier toolDefSupplier) {
		assert holder != null;
		myInputHolder = holder;
		myGraphDefLookup = new GraphDefLookup(holder.getCanvasDef());
		myToolDefLookup = toolDefSupplier;
	}

	protected final Mapping getMapping() {
		return myInputHolder.getMapping();
	}

	@SuppressWarnings("unchecked")
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
		return new CompositeStrategy(new AccessibleClassNodeStrategy(), new LeafNodeStrategy());
	}

	private Strategy createLinkFilter() {
		//MergingStrategy?
		// default: Accessible, Leaf
		return new Strategy() {
			public String getID() {
				throw new UnsupportedOperationException("QuickHack");
			}
			public void filter(Collection<EObject> soFar, Hierarchy hierarchy) {
				Set<EClass> linkCandidates = new HashSet<EClass>(hierarchy.getAccessibleLinkClasses());
				for (Iterator<EClass> iter = linkCandidates.iterator(); iter.hasNext();) {
					EClass element = iter.next();
					if (!hierarchy.isLeaf(element)) {
						iter.remove();
					}
				}
				soFar.clear();
				soFar.addAll(linkCandidates);
			}
		};
	}

	private List<TopNodeReference> nodesFrom(List<EClass> candidates) {
		ArrayList<TopNodeReference> rv = new ArrayList<TopNodeReference>(candidates.size());
		for (EClass eClass : candidates) {
			NodeMapping nm = GMFMapFactory.eINSTANCE.createNodeMapping();
			nm.setDomainMetaElement(eClass); 
			nm.setDiagramNode(myGraphDefLookup.findSuitableNode(nm));
			addEditFeature(nm, eClass);
			nm.setTool(myToolDefLookup.findTool(nm));
			TopNodeReference tnr = GMFMapFactory.eINSTANCE.createTopNodeReference();
			tnr.setContainmentFeature(getHierarchy().nodeBackRef(eClass)); // FIXME [containment] !!!
			tnr.setOwnedChild(nm);
			rv.add(tnr);
		}
		return rv;
	}

	private List<LinkMapping> linksFrom(List<EObject> candidates) {
		ArrayList<LinkMapping> rv = new ArrayList<LinkMapping>(candidates.size());
		for (EObject next : candidates) {
			LinkMapping lm = GMFMapFactory.eINSTANCE.createLinkMapping();
			if (next instanceof EClass) {
				EClass eClass = (EClass) next;
				lm.setDomainMetaElement(eClass);
				lm.setContainmentFeature(getHierarchy().linkBackRef(eClass));
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

	@SuppressWarnings("unchecked")
	private void addEditFeature(MappingEntry me, EClass class1) {
		for (Iterator it = class1.getEAllAttributes().iterator(); it.hasNext();) {
			EAttribute n = (EAttribute) it.next();
			// EDataType at = n.getEAttributeType();
			// at != null && at.getEPackage() != null && at.getEPackage().getNsURI().equals(EcorePackage.eNS_URI) && at.getName().equals(EcorePackage.eINSTANCE.getEString().getName())
			if (EcorePackage.eINSTANCE.getEString().equals(n.getEType())) {
				FeatureLabelMapping lm = GMFMapFactory.eINSTANCE.createFeatureLabelMapping();
				lm.getFeatures().add(n);
				me.getLabelMappings().add(lm);
				return;
			}
		}
	}

	public NodeReference[] getInitialNodes() {
		return nodesFrom(myNodeCandidates).toArray(new NodeReference[0]);
	}

	public LinkMapping[] getInitialLinks() {
		return linksFrom(myLinkCandidates).toArray(new LinkMapping[0]);
	}
}
