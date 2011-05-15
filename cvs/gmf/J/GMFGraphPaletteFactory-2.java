package org.eclipse.gmf.graphdef.editor.part;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.PaletteSeparator;

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
	 * @generated
	 */
	private PaletteContainer createDiagramElements1Group() {
		PaletteContainer paletteContainer = createContainer("Diagram Elements");
		paletteContainer.add(createCompartment1001CreationTool());
		paletteContainer.add(createNode1002CreationTool());
		paletteContainer.add(createConnection1003CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createFigureLink2001CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteContainer createFigures2Group() {
		PaletteContainer paletteContainer = createContainer("Figures");
		paletteContainer.add(createFigureGallery1004CreationTool());
		paletteContainer.add(createRectangle1005CreationTool());
		paletteContainer.add(createEllipse1006CreationTool());
		paletteContainer.add(createRoundedRectangle1007CreationTool());
		paletteContainer.add(createPolyline1008CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompartment1001CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.Compartment_1001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(GMFGraphElementTypes.Compartment_1001);
		return new ToolEntry("Compartment", "Create Diagram Element representing Children Compartment", smallImage, largeImage) {

			public Tool createTool() {
				Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
				tool.setProperties(getToolProperties());
				return tool;
			}
		};
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode1002CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.Node_1002);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(GMFGraphElementTypes.Node_1002);
		return new ToolEntry("Node", "Create Diagram Element representing Top-level diagram Node", smallImage, largeImage) {

			public Tool createTool() {
				Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
				tool.setProperties(getToolProperties());
				return tool;
			}
		};
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection1003CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.Connection_1003);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(GMFGraphElementTypes.Connection_1003);
		return new ToolEntry("Connection", "Create Diagram Element representing Connection", smallImage, largeImage) {

			public Tool createTool() {
				Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
				tool.setProperties(getToolProperties());
				return tool;
			}
		};
	}

	/**
	 * @generated
	 */
	private ToolEntry createFigureLink2001CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.DiagramElementFigure_3001);

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(GMFGraphElementTypes.DiagramElementFigure_3001);
		return new ToolEntry("Figure Link", "Link from the Diagram Element to the figure", smallImage, largeImage) {

			public Tool createTool() {
				Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
				tool.setProperties(getToolProperties());
				return tool;
			}
		};
	}

	/**
	 * @generated
	 */
	private ToolEntry createFigureGallery1004CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.FigureGallery_1004);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(GMFGraphElementTypes.FigureGallery_1004);
		return new ToolEntry("FigureGallery", "Create FigureGallery - physical container for figures", smallImage, largeImage) {

			public Tool createTool() {
				Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
				tool.setProperties(getToolProperties());
				return tool;
			}
		};
	}

	/**
	 * @generated
	 */
	private ToolEntry createRectangle1005CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.Rectangle_2001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(GMFGraphElementTypes.Rectangle_2001);
		elementTypes.add(GMFGraphElementTypes.Rectangle_2002);
		return new ToolEntry("Rectangle", "Create Rectangle", smallImage, largeImage) {

			public Tool createTool() {
				Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
				tool.setProperties(getToolProperties());
				return tool;
			}
		};
	}

	/**
	 * @generated
	 */
	private ToolEntry createEllipse1006CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.Ellipse_2006);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(GMFGraphElementTypes.Ellipse_2006);
		elementTypes.add(GMFGraphElementTypes.Ellipse_2003);
		return new ToolEntry("Ellipse", "Create Ellipse", smallImage, largeImage) {

			public Tool createTool() {
				Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
				tool.setProperties(getToolProperties());
				return tool;
			}
		};
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoundedRectangle1007CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.RoundedRectangle_2007);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(GMFGraphElementTypes.RoundedRectangle_2007);
		elementTypes.add(GMFGraphElementTypes.RoundedRectangle_2004);
		return new ToolEntry("Rounded Rectangle", "Create Rounded Rectangle", smallImage, largeImage) {

			public Tool createTool() {
				Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
				tool.setProperties(getToolProperties());
				return tool;
			}
		};
	}

	/**
	 * @generated
	 */
	private ToolEntry createPolyline1008CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = GMFGraphElementTypes.getImageDescriptor(GMFGraphElementTypes.Polyline_2008);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(GMFGraphElementTypes.Polyline_2008);
		elementTypes.add(GMFGraphElementTypes.Polyline_2005);
		return new ToolEntry("Polyline", "Create new PolylineConnection", smallImage, largeImage) {

			public Tool createTool() {
				Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
				tool.setProperties(getToolProperties());
				return tool;
			}
		};
	}

	/**
	 * @generated
	 */
	private PaletteContainer createContainer(String title) {
		return new PaletteDrawer(title);
	}

}