/*
 *  Copyright (c) 2006, 2007 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.graphdef.editor.providers.GMFGraphElementTypes;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class GMFGraphPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDiagramElements1Group());
		paletteRoot.add(createFigures2Group());
	}

	/**
	 * Creates "Diagram Elements" palette tool group
	 * @generated
	 */
	private PaletteContainer createDiagramElements1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.DiagramElements1Group_title);
		paletteContainer.setDescription(Messages.DiagramElements1Group_desc);
		paletteContainer.add(createNode1CreationTool());
		paletteContainer.add(createChildNode2CreationTool());
		paletteContainer.add(createCompartment3CreationTool());
		paletteContainer.add(createConnection4CreationTool());
		paletteContainer.add(createFigureLink5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Figures" palette tool group
	 * @generated
	 */
	private PaletteContainer createFigures2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Figures2Group_title);
		paletteContainer.setDescription(Messages.Figures2Group_desc);
		paletteContainer.add(createFigureGallery1CreationTool());
		paletteContainer.add(createRectangle2CreationTool());
		paletteContainer.add(createEllipse3CreationTool());
		paletteContainer.add(createRoundedRectangle4CreationTool());
		paletteContainer.add(createPolyline5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GMFGraphElementTypes.Node_2002);
		NodeToolEntry entry = new NodeToolEntry(Messages.Node1CreationTool_title, Messages.Node1CreationTool_desc, types);
		entry.setSmallIcon(GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.Node_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChildNode2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.ChildNode2CreationTool_title, Messages.ChildNode2CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompartment3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GMFGraphElementTypes.Compartment_2001);
		NodeToolEntry entry = new NodeToolEntry(Messages.Compartment3CreationTool_title, Messages.Compartment3CreationTool_desc, types);
		entry.setSmallIcon(GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.Compartment_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GMFGraphElementTypes.Connection_2003);
		NodeToolEntry entry = new NodeToolEntry(Messages.Connection4CreationTool_title, Messages.Connection4CreationTool_desc, types);
		entry.setSmallIcon(GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.Connection_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFigureLink5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GMFGraphElementTypes.DiagramElementFigure_4001);
		LinkToolEntry entry = new LinkToolEntry(Messages.FigureLink5CreationTool_title, Messages.FigureLink5CreationTool_desc, types);
		entry.setSmallIcon(GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.DiagramElementFigure_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFigureGallery1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GMFGraphElementTypes.FigureGallery_2004);
		NodeToolEntry entry = new NodeToolEntry(Messages.FigureGallery1CreationTool_title, Messages.FigureGallery1CreationTool_desc, types);
		entry.setSmallIcon(GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.FigureGallery_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRectangle2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(GMFGraphElementTypes.Rectangle_3001);
		types.add(GMFGraphElementTypes.Rectangle_3002);
		NodeToolEntry entry = new NodeToolEntry(Messages.Rectangle2CreationTool_title, Messages.Rectangle2CreationTool_desc, types);
		entry.setSmallIcon(GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.Rectangle_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEllipse3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(GMFGraphElementTypes.Ellipse_3003);
		types.add(GMFGraphElementTypes.Ellipse_3006);
		NodeToolEntry entry = new NodeToolEntry(Messages.Ellipse3CreationTool_title, Messages.Ellipse3CreationTool_desc, types);
		entry.setSmallIcon(GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.Ellipse_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoundedRectangle4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(GMFGraphElementTypes.RoundedRectangle_3004);
		types.add(GMFGraphElementTypes.RoundedRectangle_3007);
		NodeToolEntry entry = new NodeToolEntry(Messages.RoundedRectangle4CreationTool_title, Messages.RoundedRectangle4CreationTool_desc, types);
		entry.setSmallIcon(GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.RoundedRectangle_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPolyline5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(GMFGraphElementTypes.Polyline_3005);
		types.add(GMFGraphElementTypes.Polyline_3008);
		NodeToolEntry entry = new NodeToolEntry(Messages.Polyline5CreationTool_title, Messages.Polyline5CreationTool_desc, types);
		entry.setSmallIcon(GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.Polyline_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description, List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description, List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}