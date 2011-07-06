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
package org.eclipse.gmf.internal.bridge.tooldef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmf.codegen.gmfgen.AbstractToolEntry;
import org.eclipse.gmf.codegen.gmfgen.EntryBase;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.Separator;
import org.eclipse.gmf.codegen.gmfgen.StandardEntry;
import org.eclipse.gmf.codegen.gmfgen.StandardEntryKind;
import org.eclipse.gmf.codegen.gmfgen.ToolEntry;
import org.eclipse.gmf.codegen.gmfgen.ToolGroup;
import org.eclipse.gmf.codegen.gmfgen.ToolGroupItem;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.tooldef.AbstractTool;
import org.eclipse.gmf.tooldef.BundleImage;
import org.eclipse.gmf.tooldef.CreationTool;
import org.eclipse.gmf.tooldef.GenericTool;
import org.eclipse.gmf.tooldef.PaletteSeparator;
import org.eclipse.gmf.tooldef.StandardTool;
import org.eclipse.gmf.tooldef.StandardToolKind;
import org.eclipse.gmf.tooldef.ToolContainer;
import org.eclipse.gmf.tooldef.util.GMFToolSwitch;
import org.osgi.framework.Bundle;

/**
 * Invoke {@link #initialize(Palette)} prior to use. Not intented to be reused, although may work.
 * Unless initialized, <code>process()</code> methods has no effect.
 * Mapping entries that reference tools from palette other than specified in the Mapping element,
 * will get into predefined group under genPalette. 
 * @author artem
 */
public class PaletteHandler {
	private final HashMap<AbstractTool, ToolGroupItem> myToolHistory; // keeps track of tooldef-to-gmfgen tool transformations. Container maps to group as well
	private Palette myGenPalette;
	private ToolGroup myMisreferencedTools;

	public PaletteHandler() {
		myToolHistory = new HashMap<AbstractTool, ToolGroupItem>();
	}

	public void initialize(Palette genPalette) {
		assert genPalette != null; // TODO remove after debug
		myGenPalette = genPalette;
		myToolHistory.clear();
	}

	protected final Palette getGenPalette() {
		assert isInitialized(); // TODO remove after debug
		return myGenPalette;
	}

	/**
	 * There's nothing to do if handler was not initialized, 
	 * @return
	 */
	protected final boolean isInitialized() {
		return myGenPalette != null;
	}	

	public void process(org.eclipse.gmf.tooldef.Palette palette) {
		if (!isInitialized()) {
			return;
		}
		// perhaps, moving this code to ToolSwitch and just doSwitch(palette) would be better?
		ArrayList<ToolGroup> groups = new ArrayList<ToolGroup>(palette.getTools().size());
		ArrayList<ToolGroupItem> topLevelTools = new ArrayList<ToolGroupItem>(palette.getTools().size());
		for (ToolGroupItem next : new ToolSwitch(myToolHistory).toGroupItems(palette.getTools())) {
			if (next instanceof ToolGroup) {
				groups.add((ToolGroup) next);
			} else {
				topLevelTools.add(next);
			}
		}
		if (!topLevelTools.isEmpty()) {
			ToolGroup defaultGroup = GMFGenFactory.eINSTANCE.createToolGroup();
			defaultGroup.setTitle("Default");
			defaultGroup.setDescription("Holds top-level non-container tools");
			defaultGroup.setCollapse(false);
			defaultGroup.getEntries().addAll(topLevelTools);
			getGenPalette().getGroups().add(defaultGroup);
		}
		getGenPalette().getGroups().addAll(groups);
		if (palette.getDefault() != null) {
			assert false == myToolHistory.get(palette.getDefault()) instanceof Separator;
			EntryBase eb = (EntryBase) myToolHistory.get(palette.getDefault());
			if (false == eb instanceof ToolEntry) {
				logWarning("There's default tool specified for palette, but can't find gmfgen counterpart");
			} else {
				((ToolEntry) eb).setDefault(true);
			}
		}
		getGenPalette().setFlyout(true); // FIXME option
	}

	public void process(NodeMapping nme, GenNode genNode) {
		if (!isInitialized() || nme.getTool() == null) {
			return;
		}
		ToolEntry te = toToolEntry(nme.getTool());
		if (te != null) {
			te.getGenNodes().add(genNode);
		}
	}

	public void process(LinkMapping lme, GenLink genLink) {
		if (!isInitialized() || lme.getTool() == null) {
			return;
		}
		ToolEntry te = toToolEntry(lme.getTool());
		if (te != null) {
			te.getGenLinks().add(genLink);
		}
	}

	/**
	 * Finds existing entry for tool or creates special 'missing' one if none found. 
	 */
	private ToolEntry toToolEntry(AbstractTool tool) {
		if (checkIsContainer(tool)) {
			return null;
		}
		ToolEntry te = findToolEntry(tool);
		if (te == null) {
			te = createMissingToolEntry(tool);
		}
		return te;
	}

	private static boolean checkIsContainer(AbstractTool tool) {
		if (tool instanceof ToolContainer) {
			logWarning("Can't use container here");
			return true;
		}
		return false;
	}

	private ToolEntry findToolEntry(AbstractTool tool) {
		assert !checkIsContainer(tool);
		return (ToolEntry) myToolHistory.get(tool);
	}

	private ToolEntry createMissingToolEntry(AbstractTool tool) {
		assert tool != null;
		if (myMisreferencedTools == null) {
			myMisreferencedTools = GMFGenFactory.eINSTANCE.createToolGroup();
			myMisreferencedTools.setCollapse(false);
			myMisreferencedTools.setStack(false);
			myMisreferencedTools.setTitle("-- Mis-referenced tools --");
			myMisreferencedTools.setDescription("Mapping element referenced tools from palette other than one specified in Mapping instance");
			getGenPalette().getGroups().add(myMisreferencedTools);
		}
		ToolEntry t = (ToolEntry) new ToolSwitch(myToolHistory).doSwitch(tool);
		if (t != null) {
			myToolHistory.put(tool, t);
			myMisreferencedTools.getEntries().add(t);
		}
		return t;
	}

	private static String constructIconPath(BundleImage icon) {
		assert icon != null;
		if (icon.getPath() == null || icon.getPath().trim().length() == 0) {
			// no idea why to go on
			return null;
		}
		if (icon.getBundle() == null || icon.getBundle().trim().length() == 0) {
			// Plugin.javajet#findImageDescriptor treats relative paths as bundle-local
			return new Path(icon.getPath()).makeRelative().toString();
		} else {
			// makeAbsolute on bundle segment only to avoid unwinding of ".." 
			return new Path(icon.getBundle()).makeAbsolute().append(icon.getPath()).toString();
		}
	}

	private static void logWarning(String message) {
		final Bundle b = Platform.getBundle("org.eclipse.gmf.bridge");
		Platform.getLog(b).log(new Status(IStatus.WARNING, b.getSymbolicName(), 0, message, null));
	}


	// XXX handle other tool types (action, whatever)
	private static class ToolSwitch extends GMFToolSwitch<ToolGroupItem> {
		private final Map<AbstractTool, ToolGroupItem> toolHistory;

		private ToolSwitch(Map<AbstractTool, ToolGroupItem> toolMap) {
			assert toolMap != null;
			toolHistory = toolMap;
		}

		public List<ToolGroupItem> toGroupItems(List<AbstractTool> toolDefinitions) {
			assert toolDefinitions != null;
			List<ToolGroupItem> rv = new LinkedList<ToolGroupItem>();
			for (AbstractTool next : toolDefinitions) {
				ToolGroupItem value = doSwitch(next);
				if (value == null) {
					logWarning("Can't transform '" + next + " to ToolGroupItem");
				} else {
					toolHistory.put(next, value);
					rv.add(value);
				}
			}
			return rv;
		}

		public ToolGroupItem casePaletteSeparator(PaletteSeparator object) {
			return GMFGenFactory.eINSTANCE.createSeparator();
		}
		
		public ToolGroupItem caseCreationTool(CreationTool tool) {
			ToolEntry ne = GMFGenFactory.eINSTANCE.createToolEntry();
			setupCommonToolEntry(ne, tool);
			return ne;
		}

		public ToolGroupItem caseStandardTool(StandardTool standardTool) {
			StandardEntry entry = GMFGenFactory.eINSTANCE.createStandardEntry();
			switch (standardTool.getToolKind().getValue()) {
				case StandardToolKind.SELECT : {
					entry.setKind(StandardEntryKind.SELECT_LITERAL);
					break;
				}
				case StandardToolKind.MARQUEE : {
					entry.setKind(StandardEntryKind.MARQUEE_LITERAL);
					break;
				}
				case StandardToolKind.ZOOM_PAN : {
					entry.setKind(StandardEntryKind.ZOOM_LITERAL);
					break;
				}
			}
			setupCommonToolEntry(entry, standardTool);
			return entry;
		}

		public ToolGroupItem caseGenericTool(GenericTool tool) {
			if (tool.getToolClass() == null) {
				logWarning("GenericTool element without a class, no palette entry createed");
				return null;
			}
			ToolEntry ne = GMFGenFactory.eINSTANCE.createToolEntry();
			ne.setQualifiedToolName(tool.getToolClass());
			setupCommonToolEntry(ne, tool);
			return ne;
		}

		public ToolGroupItem caseToolGroup(org.eclipse.gmf.tooldef.ToolGroup toolGroup) {
			ToolGroup tg = GMFGenFactory.eINSTANCE.createToolGroup();
			tg.setCollapse(toolGroup.isCollapsible());
			tg.setStack(toolGroup.isStack());
			setupCommonToolEntry(tg, toolGroup);
			tg.getEntries().addAll(toGroupItems(toolGroup.getTools()));
			if (toolGroup.getActive() != null) {
				assert false == toolHistory.get(toolGroup.getActive()) instanceof Separator;
				EntryBase eb = (EntryBase) toolHistory.get(toolGroup.getActive());
				if (eb == null || false == eb instanceof AbstractToolEntry) {
					logWarning("Can't find entry to became default in the group:" + toolGroup);
				} else {
					((AbstractToolEntry) eb).setDefault(true);
				}
			}
			return tg;
		}

		private static void setupCommonToolEntry(EntryBase te, AbstractTool tool) {
			te.setTitle(tool.getTitle() == null ? "" : tool.getTitle()); // same at (*1*)
			te.setDescription(tool.getDescription());
			// FIXME need to change this once better tooling definition is in place.
			// FIXME update gmfgen model to explicitly understand images from different bundles
			if (tool.getLargeIcon() instanceof BundleImage) {
				te.setLargeIconPath(constructIconPath((BundleImage) tool.getLargeIcon()));
			}
			if (tool.getSmallIcon() instanceof BundleImage) {
				te.setSmallIconPath(constructIconPath((BundleImage) tool.getSmallIcon()));
			}
		}
	}
}
