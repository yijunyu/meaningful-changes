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
package org.eclipse.gmf.internal.bridge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenMetricRule;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.MetricRule;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * Keep track of gmfmap-to-gmfgen transformation elements.
 * @author artem
 */
public class History {
	private final Map<NodeMapping, GenTopLevelNode> myTopNodeMap;	
	private final Map<NodeMapping, Set<GenChildNode>> myNodeMap;
	private final Map<LinkMapping, GenLink> myLinkMap;
	private final Map<MetricRule, GenMetricRule> myMetricMap;

	public History() {
		myTopNodeMap = new HashMap<NodeMapping, GenTopLevelNode>();		
		myNodeMap = new HashMap<NodeMapping, Set<GenChildNode>>();
		myLinkMap = new HashMap<LinkMapping, GenLink>();
		myMetricMap = new HashMap<MetricRule, GenMetricRule>();
	}

	/**
	 * No more then 1 GenTopLevelNode may be logged for node mapping 
	 */
	public void log(NodeMapping nodeMap, GenTopLevelNode genNode) {
		assert nodeMap != null && genNode != null && !myTopNodeMap.containsKey(nodeMap);
		myTopNodeMap.put(nodeMap, genNode);
	}	

	/**
	 * More than 1 GenChildNode may be logged for node mapping  
	 * (to handle children taken from different containment/children features)
	 */
	public void log(NodeMapping nodeMap, GenChildNode genNode) {
		assert nodeMap != null && genNode != null;
		Set<GenChildNode> genNodes = myNodeMap.get(nodeMap);
		if (genNodes == null) {
			genNodes = new HashSet<GenChildNode>();
			myNodeMap.put(nodeMap, genNodes);
		}
		genNodes.add(genNode);
	}

	/**
	 * No more than 1 GenLink is allowed for link mapping.
	 */
	public void log(LinkMapping linkMap, GenLink genLink) {
		assert linkMap != null && genLink != null && !myLinkMap.containsKey(linkMap);
		myLinkMap.put(linkMap, genLink);
	}
	
	public void log(MetricRule metric, GenMetricRule genMetric) {
		assert metric != null && genMetric != null;
		myMetricMap.put(metric, genMetric);
	}
	
	public GenMetricRule find(MetricRule metric) {
		assert metric != null;
		return myMetricMap.get(metric);
	}	
	

	public boolean isKnown(NodeMapping nodeMap) {
		return isKnownTopNode(nodeMap) || isKnownChildNode(nodeMap);
	}	
		
	public boolean isKnownTopNode(NodeMapping nodeMap) {
		assert nodeMap != null;
		return myTopNodeMap.containsKey(nodeMap);
	}	
	
	public boolean isKnownChildNode(NodeMapping nodeMap) {
		assert nodeMap != null;
		// We don't check stored collections as there's no means to remove element from this history,
		// thus, no way to get empty collection
		return myNodeMap.containsKey(nodeMap);
	}

	public boolean isKnown(LinkMapping linkMap) {
		assert linkMap != null;
		return myLinkMap.containsKey(linkMap);
	}

	/**
	 * @return never <code>null</code>>
	 */
	public GenChildNode[] findChildNodes(NodeMapping nodeMap) {
		assert nodeMap != null;
		Set<GenChildNode> genNodes = myNodeMap.get(nodeMap);
		if (genNodes == null) {
			return new GenChildNode[0];
		}
		return genNodes.toArray(new GenChildNode[genNodes.size()]);
	}
	
	public GenTopLevelNode findTopNode(NodeMapping nodeMap) {
		assert nodeMap != null;
		return myTopNodeMap.get(nodeMap);
	}
	
	public GenNode[] find(NodeMapping nodeMap) {
		assert nodeMap != null;
		GenNode genNode = findTopNode(nodeMap);
		return genNode != null ? new GenNode[] {genNode} : findChildNodes(nodeMap);
	}

	public GenLink find(LinkMapping linkMap) {
		assert linkMap != null;
		return myLinkMap.get(linkMap);
	}

	public void purge() {
		myTopNodeMap.clear();
		myNodeMap.clear();
		myLinkMap.clear();
		myMetricMap.clear();
	}
}
