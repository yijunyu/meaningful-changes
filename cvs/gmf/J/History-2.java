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
import java.util.Map;

import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * We don't suppose to reuse GenTopLevelNodes, thus API references GenChildNodes
 * @author artem
 */
public class History {
	private final Map/*<NodeMapping, GenChildNode>*/ myNodeMap;
	private final Map/*<LinkMapping, GenLink>*/ myLinkMap;

	public History() {
		myNodeMap = new HashMap();
		myLinkMap = new HashMap();
	}

	public void log(NodeMapping nodeMap, GenChildNode genNode) {
		assert nodeMap != null && genNode != null && !myNodeMap.containsKey(nodeMap);
		// TODO leave only asserts
		if (nodeMap == null || genNode == null) {
			throw new NullPointerException();
		}
		if (myNodeMap.containsKey(nodeMap)) {
			throw new IllegalArgumentException(nodeMap.toString());
		}
		myNodeMap.put(nodeMap, genNode);
	}

	public void log(LinkMapping linkMap, GenLink genLink) {
		assert linkMap != null && genLink != null && !myLinkMap.containsKey(linkMap);
		myLinkMap.put(linkMap, genLink);
	}

	public boolean isKnown(NodeMapping nodeMap) {
		assert nodeMap != null;
		return myNodeMap.containsKey(nodeMap);
	}

	public boolean isKnown(LinkMapping linkMap) {
		assert linkMap != null;
		return myLinkMap.containsKey(linkMap);
	}

	public GenChildNode find(NodeMapping nodeMap) {
		assert nodeMap != null;
		return (GenChildNode) myNodeMap.get(nodeMap);
	}

	public GenLink find(LinkMapping linkMap) {
		assert linkMap != null;
		return (GenLink) myLinkMap.get(linkMap);
	}

	public void purge() {
		myNodeMap.clear();
		myLinkMap.clear();
	}
}
