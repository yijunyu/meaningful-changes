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

import java.util.List;

import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.DiagramElement;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * @author artem
 */
public class GraphDefLookup {

	private final Canvas myCanvas;

	public GraphDefLookup(Canvas canvas) {
		myCanvas = canvas;
	}

	public Node findSuitableNode(NodeMapping nm) {
		String name = nm.getDomainMetaElement() == null ? null : nm.getDomainMetaElement().getName();
		return (Node) doSearch(myCanvas.getNodes(), name);
	}

	public Connection findSuitableLink(LinkMapping lm) {
		String name = null;
		if (lm.getDomainMetaElement() != null) {
			name = lm.getDomainMetaElement().getName();
		} else if (lm.getLinkMetaFeature() != null) {
			name = lm.getLinkMetaFeature().getEContainingClass().getName();
		}
		return (Connection) doSearch(myCanvas.getConnections(), name);
	}

	private DiagramElement doSearch(List<? extends DiagramElement> elements, String namePart) {
		if (elements.isEmpty()) {
			return null;
		}
		if (namePart != null) {
			DiagramElement c = matchName(elements, namePart);
			if (c != null) {
				return c;
			}
		}
		return elements.get(0);
	}

	private DiagramElement matchName(List<? extends DiagramElement> elements, String namePart) {
		for (DiagramElement next : elements) {
			if (next.getName() != null && next.getName().indexOf(namePart) >= 0) {
				return next;
			}
		}
		return null;
	}
}
