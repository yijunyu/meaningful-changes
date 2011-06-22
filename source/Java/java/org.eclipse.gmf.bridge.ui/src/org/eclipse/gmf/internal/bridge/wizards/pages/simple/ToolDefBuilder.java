/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.wizards.pages.simple;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.internal.bridge.wizards.WizardUtil;
import org.eclipse.gmf.internal.bridge.wizards.pages.simple.ResolvedItem.Resolution;
import org.eclipse.gmf.internal.common.IncrementalNamesDispenser;
import org.eclipse.gmf.internal.common.NamesDispenser;
import org.eclipse.gmf.tooldef.AbstractTool;
import org.eclipse.gmf.tooldef.CreationTool;
import org.eclipse.gmf.tooldef.GMFToolFactory;
import org.eclipse.gmf.tooldef.GMFToolPackage;
import org.eclipse.gmf.tooldef.Palette;
import org.eclipse.gmf.tooldef.ToolGroup;
import org.eclipse.gmf.tooldef.ToolRegistry;

/**
 * @author dstadnik
 */
public class ToolDefBuilder {

	protected final ToolRegistry existingToolRegistry;

	protected GMFToolFactory gmfToolFactory = GMFToolPackage.eINSTANCE.getGMFToolFactory();

	protected NamesDispenser namesDispenser = new IncrementalNamesDispenser();

	protected ToolRegistry toolRegistry;

	protected ToolGroup group;

	public ToolDefBuilder(ToolRegistry existingToolRegistry) {
		this.existingToolRegistry = existingToolRegistry;
	}

	public static CreationTool getCreationTool(Iterator<EObject> source, EObject domainElement) {
		String name = WizardUtil.getCapName(domainElement);
		if (name == null) {
			return null;
		}
		return getCreationTool(source, name);
	}

	public static CreationTool getCreationTool(Iterator<EObject> source, String domainObjectName) {
		while (source.hasNext()) {
			Object next = source.next();
			if (next instanceof CreationTool && domainObjectName.equals(((CreationTool) next).getTitle())) {
				return (CreationTool) next;
			}
		}
		return null;
	}

	protected String getUniqueName(String semanticPart) {
		return namesDispenser.get(semanticPart);
	}

	protected String getUniqueName(String semanticPart, String suffixPart) {
		return namesDispenser.get(semanticPart, suffixPart);
	}

	protected void addExistingName(String name) {
		if (name != null) {
			namesDispenser.add(name);
		}
	}

	protected void addExistingNames(ToolRegistry toolRegistry) {
		for (Iterator<EObject> it = toolRegistry.eAllContents(); it.hasNext();) {
			EObject next = it.next();
			if (next instanceof AbstractTool) {
				addExistingName(((AbstractTool) next).getTitle());
			}
		}
	}

	@SuppressWarnings("unchecked")
	public ToolRegistry process(ResolvedItem item) {
		if (existingToolRegistry == null) {
			toolRegistry = gmfToolFactory.createToolRegistry();
		} else {
			toolRegistry = existingToolRegistry;
			addExistingNames(existingToolRegistry);
		}
		if (item != null) {
			EPackage ePackage = (EPackage) item.getDomainRef();
			Palette palette = toolRegistry.getPalette();
			if (palette == null) {
				palette = gmfToolFactory.createPalette();
				palette.setTitle(getUniqueName(ePackage.getName(), Messages.ToolDefBuilder1));
				toolRegistry.setPalette(palette);
			}
			group = null;
			for (Object tool : palette.getTools()) {
				if (tool instanceof ToolGroup) {
					group = (ToolGroup) tool;
					break;
				}
			}
			if (group == null) {
				group = gmfToolFactory.createToolGroup();
				group.setTitle(getUniqueName(ePackage.getName()));
				palette.getTools().add(group);
			}
			for (ResolvedItem child : item.getChildren()) {
				processContents(child);
			}
		}
		return toolRegistry;
	}

	protected void processContents(ResolvedItem item) {
		if (!item.isDisabled() && (item.getResolution() == Resolution.NODE || item.getResolution() == Resolution.LINK)) {
			String baseName = null;
			if (item.getDomainRef() instanceof EClass) {
				baseName = WizardUtil.getCapName((EClass) item.getDomainRef());
			} else if (item.getDomainRef() instanceof EReference) {
				baseName = WizardUtil.getCapName((EReference) item.getDomainRef());
			}
			if (baseName != null && baseName.length() > 0) {
				addCreationTool(baseName);
			}
		}
		for (ResolvedItem child : item.getChildren()) {
			processContents(child);
		}
	}

	@SuppressWarnings("unchecked")
	protected CreationTool addCreationTool(String baseName) {
		CreationTool tool = gmfToolFactory.createCreationTool();
		tool.setTitle(getUniqueName(baseName));
		tool.setDescription(Messages.bind(Messages.ToolDefBuilder0, baseName));
		tool.setSmallIcon(gmfToolFactory.createDefaultImage());
		tool.setLargeIcon(gmfToolFactory.createDefaultImage());
		group.getTools().add(tool);
		return tool;
	}
}
