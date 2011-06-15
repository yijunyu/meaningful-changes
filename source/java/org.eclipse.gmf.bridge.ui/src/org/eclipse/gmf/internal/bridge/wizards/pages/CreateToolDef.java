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

import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.tooldef.AbstractTool;
import org.eclipse.gmf.tooldef.CreationTool;
import org.eclipse.gmf.tooldef.GMFToolFactory;
import org.eclipse.gmf.tooldef.Palette;
import org.eclipse.gmf.tooldef.ToolGroup;
import org.eclipse.gmf.tooldef.ToolRegistry;

/**
 * Naive, creates new tool each time, don't care about duplicated mappings.
 * @author artem
 */
@SuppressWarnings("unchecked")
public class CreateToolDef implements ToolDefSupplier {
	private final Palette myPalette;
	private final ToolGroup myNodesGroup;
	private final ToolGroup myLinksGroup;

	public CreateToolDef(ToolRegistry registry) {
		assert registry != null;
		if (registry.getPalette() == null) {
			myPalette = GMFToolFactory.eINSTANCE.createPalette();
			myPalette.setTitle("Generated");
			myPalette.setDescription("Generated");
			registry.setPalette(myPalette);
		} else {
			myPalette = registry.getPalette();
		}
		myNodesGroup = GMFToolFactory.eINSTANCE.createToolGroup();
		myNodesGroup.setDescription("Generated node creation tools");
		myNodesGroup.setTitle("Nodes");
		myLinksGroup = GMFToolFactory.eINSTANCE.createToolGroup();
		myLinksGroup.setDescription("Generated link creation tools");
		myLinksGroup.setTitle("Links");

		myPalette.getTools().add(myNodesGroup);
		myPalette.getTools().add(myLinksGroup);
	}

	public AbstractTool findTool(NodeMapping nm) {
		CreationTool t = GMFToolFactory.eINSTANCE.createCreationTool();
		t.setTitle("Create Node " + String.valueOf(1 + myNodesGroup.getTools().size()));
		t.setSmallIcon(GMFToolFactory.eINSTANCE.createDefaultImage());
		myNodesGroup.getTools().add(t);
		return t;
	}

	public AbstractTool findTool(LinkMapping lm) {
		CreationTool t = GMFToolFactory.eINSTANCE.createCreationTool();
		t.setTitle("Create Link " + String.valueOf(1 + myLinksGroup.getTools().size()));
		t.setSmallIcon(GMFToolFactory.eINSTANCE.createDefaultImage());
		myLinksGroup.getTools().add(t);
		return t;
	}
}
