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

import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureAccessor;
import org.eclipse.gmf.gmfgraph.FigureHandle;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * Handcoded decisions
 * @author artem
 */
public class Knowledge {

	public static boolean isExternal(DiagramLabel diagramLabel) {
		FigureHandle figure = diagramLabel.getFigure();
		if (figure == null){
			throw new NullPointerException("FigureHandler is null for: " + diagramLabel);
		}
		
		if (figure instanceof Figure) {
			return ((Figure) figure).getParent() == null;
		} else if (figure instanceof FigureAccessor) {
			return false;
		}
		throw new IllegalStateException("No more known subclasses of FigureHandle: " + figure);
	}

	/**
	 * @return whether nodeMapping has single label, no children and node's diagram 
	 * element is DiagramLabel equivalent that of it's label
	 */
	public static boolean isPureLabelNode(NodeMapping childNodeMapping) {
		if (childNodeMapping.getLabelMappings().size() == 1 && childNodeMapping.getChildren().isEmpty()) {
			LabelMapping soleLabel = childNodeMapping.getLabelMappings().get(0);
			return childNodeMapping.getDiagramNode() == soleLabel.getDiagramLabel(); 
		}
		return false;
	}

}
