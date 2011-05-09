/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.map.editor.navigator;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.gmf.map.editor.edit.parts.CanvasMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.CanvasMappingInfoEditPart;
import org.eclipse.gmf.map.editor.edit.parts.ChildReferenceEditPart;
import org.eclipse.gmf.map.editor.edit.parts.ChildReferenceOwnedChildEditPart;
import org.eclipse.gmf.map.editor.edit.parts.ChildReferenceReferencedChildEditPart;
import org.eclipse.gmf.map.editor.edit.parts.CompartmentMappingChildrenEditPart;
import org.eclipse.gmf.map.editor.edit.parts.CompartmentMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.CompartmentMappingInfoEditPart;
import org.eclipse.gmf.map.editor.edit.parts.DesignLabelMapping2EditPart;
import org.eclipse.gmf.map.editor.edit.parts.DesignLabelMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.FeatureLabelMapping2EditPart;
import org.eclipse.gmf.map.editor.edit.parts.FeatureLabelMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.LabelMapping2EditPart;
import org.eclipse.gmf.map.editor.edit.parts.LabelMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.LinkMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.LinkMappingInfoEditPart;
import org.eclipse.gmf.map.editor.edit.parts.MappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.NodeMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.NodeMappingInfoEditPart;
import org.eclipse.gmf.map.editor.edit.parts.ReferenceInfo2EditPart;
import org.eclipse.gmf.map.editor.edit.parts.ReferenceInfoEditPart;
import org.eclipse.gmf.map.editor.edit.parts.TopNodeReferenceEditPart;
import org.eclipse.gmf.map.editor.edit.parts.TopNodeReferenceOwnedChildEditPart;

import org.eclipse.gmf.map.editor.part.GMFMapDiagramEditorPlugin;
import org.eclipse.gmf.map.editor.part.GMFMapVisualIDRegistry;

import org.eclipse.gmf.map.editor.providers.GMFMapElementTypes;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;

import org.eclipse.jface.viewers.LabelProvider;

import org.eclipse.swt.graphics.Image;

import org.eclipse.ui.IMemento;

import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class GMFMapNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider {

	/**
	 * @generated
	 */
	static {
		GMFMapDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?InvalidElement", ImageDescriptor.getMissingImageDescriptor());
		GMFMapDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor());
		GMFMapDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (false == element instanceof GMFMapAbstractNavigatorItem) {
			return super.getImage(element);
		}

		GMFMapAbstractNavigatorItem abstractNavigatorItem = (GMFMapAbstractNavigatorItem) element;
		if (!MappingEditPart.MODEL_ID.equals(abstractNavigatorItem.getModelID())) {
			return super.getImage(element);
		}

		if (abstractNavigatorItem instanceof GMFMapNavigatorItem) {
			GMFMapNavigatorItem navigatorItem = (GMFMapNavigatorItem) abstractNavigatorItem;
			switch (navigatorItem.getVisualID()) {
			case CanvasMappingEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/gmf/2005/mappings/2.0?CanvasMapping", GMFMapElementTypes.CanvasMapping_2001);
			case NodeMappingEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/gmf/2005/mappings/2.0?NodeMapping", GMFMapElementTypes.NodeMapping_2003);
			case LinkMappingEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/gmf/2005/mappings/2.0?LinkMapping", GMFMapElementTypes.LinkMapping_2002);
			case TopNodeReferenceEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/mappings/2.0?TopNodeReference", GMFMapElementTypes.TopNodeReference_3001);
			case FeatureLabelMappingEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/mappings/2.0?FeatureLabelMapping", GMFMapElementTypes.FeatureLabelMapping_3006);
			case DesignLabelMappingEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/mappings/2.0?DesignLabelMapping", GMFMapElementTypes.DesignLabelMapping_3007);
			case LabelMappingEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/mappings/2.0?LabelMapping", GMFMapElementTypes.LabelMapping_3002);
			case ChildReferenceEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/mappings/2.0?ChildReference", GMFMapElementTypes.ChildReference_3004);
			case CompartmentMappingEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/mappings/2.0?CompartmentMapping", GMFMapElementTypes.CompartmentMapping_3005);
			case FeatureLabelMapping2EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/mappings/2.0?FeatureLabelMapping", GMFMapElementTypes.FeatureLabelMapping_3008);
			case DesignLabelMapping2EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/mappings/2.0?DesignLabelMapping", GMFMapElementTypes.DesignLabelMapping_3009);
			case LabelMapping2EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/mappings/2.0?LabelMapping", GMFMapElementTypes.LabelMapping_3003);
			case MappingEditPart.VISUAL_ID:
				return getImage("Navigator?Diagram?http://www.eclipse.org/gmf/2005/mappings/2.0?Mapping", GMFMapElementTypes.Mapping_1000);
			case TopNodeReferenceOwnedChildEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/gmf/2005/mappings/2.0?TopNodeReference?ownedChild", GMFMapElementTypes.TopNodeReferenceOwnedChild_4001);
			case ChildReferenceOwnedChildEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/gmf/2005/mappings/2.0?ChildReference?ownedChild", GMFMapElementTypes.ChildReferenceOwnedChild_4004);
			case ChildReferenceReferencedChildEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/gmf/2005/mappings/2.0?ChildReference?referencedChild", GMFMapElementTypes.ChildReferenceReferencedChild_4002);
			case CompartmentMappingChildrenEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/gmf/2005/mappings/2.0?CompartmentMapping?children", GMFMapElementTypes.CompartmentMappingChildren_4003);
			default:
				return getImage("Navigator?UnknownElement", null);
			}
		} else if (abstractNavigatorItem instanceof GMFMapNavigatorGroup) {
			GMFMapNavigatorGroup group = (GMFMapNavigatorGroup) element;
			return GMFMapDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}
		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GMFMapDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && GMFMapElementTypes.isKnownElementType(elementType)) {
			image = GMFMapElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound");
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (false == element instanceof GMFMapAbstractNavigatorItem) {
			return super.getText(element);
		}

		GMFMapAbstractNavigatorItem abstractNavigatorItem = (GMFMapAbstractNavigatorItem) element;
		if (!MappingEditPart.MODEL_ID.equals(abstractNavigatorItem.getModelID())) {
			return super.getText(element);
		}

		if (abstractNavigatorItem instanceof GMFMapNavigatorItem) {
			GMFMapNavigatorItem navigatorItem = (GMFMapNavigatorItem) abstractNavigatorItem;
			switch (navigatorItem.getVisualID()) {
			case CanvasMappingEditPart.VISUAL_ID:
				return getCanvasMapping_2001Text(navigatorItem.getView());
			case NodeMappingEditPart.VISUAL_ID:
				return getNodeMapping_2003Text(navigatorItem.getView());
			case LinkMappingEditPart.VISUAL_ID:
				return getLinkMapping_2002Text(navigatorItem.getView());
			case TopNodeReferenceEditPart.VISUAL_ID:
				return getTopNodeReference_3001Text(navigatorItem.getView());
			case FeatureLabelMappingEditPart.VISUAL_ID:
				return getFeatureLabelMapping_3006Text(navigatorItem.getView());
			case DesignLabelMappingEditPart.VISUAL_ID:
				return getDesignLabelMapping_3007Text(navigatorItem.getView());
			case LabelMappingEditPart.VISUAL_ID:
				return getLabelMapping_3002Text(navigatorItem.getView());
			case ChildReferenceEditPart.VISUAL_ID:
				return getChildReference_3004Text(navigatorItem.getView());
			case CompartmentMappingEditPart.VISUAL_ID:
				return getCompartmentMapping_3005Text(navigatorItem.getView());
			case FeatureLabelMapping2EditPart.VISUAL_ID:
				return getFeatureLabelMapping_3008Text(navigatorItem.getView());
			case DesignLabelMapping2EditPart.VISUAL_ID:
				return getDesignLabelMapping_3009Text(navigatorItem.getView());
			case LabelMapping2EditPart.VISUAL_ID:
				return getLabelMapping_3003Text(navigatorItem.getView());
			case MappingEditPart.VISUAL_ID:
				return getMapping_1000Text(navigatorItem.getView());
			case TopNodeReferenceOwnedChildEditPart.VISUAL_ID:
				return getTopNodeReferenceOwnedChild_4001Text(navigatorItem.getView());
			case ChildReferenceOwnedChildEditPart.VISUAL_ID:
				return getChildReferenceOwnedChild_4004Text(navigatorItem.getView());
			case ChildReferenceReferencedChildEditPart.VISUAL_ID:
				return getChildReferenceReferencedChild_4002Text(navigatorItem.getView());
			case CompartmentMappingChildrenEditPart.VISUAL_ID:
				return getCompartmentMappingChildren_4003Text(navigatorItem.getView());
			default:
				return getUnknownElementText(navigatorItem.getView());
			}
		} else if (abstractNavigatorItem instanceof GMFMapNavigatorGroup) {
			GMFMapNavigatorGroup group = (GMFMapNavigatorGroup) element;
			return group.getGroupName();
		}
		return super.getText(element);
	}

	/**
	 * @generated
	 */
	private String getCanvasMapping_2001Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFMapVisualIDRegistry.getType(CanvasMappingInfoEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFMapElementTypes.CanvasMapping_2001;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFMapDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getNodeMapping_2003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFMapVisualIDRegistry.getType(NodeMappingInfoEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFMapElementTypes.NodeMapping_2003;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFMapDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getLinkMapping_2002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFMapVisualIDRegistry.getType(LinkMappingInfoEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFMapElementTypes.LinkMapping_2002;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFMapDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getTopNodeReference_3001Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFMapVisualIDRegistry.getType(ReferenceInfoEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFMapElementTypes.TopNodeReference_3001;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFMapDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getFeatureLabelMapping_3006Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFMapVisualIDRegistry.getType(FeatureLabelMappingEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFMapElementTypes.FeatureLabelMapping_3006;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFMapDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3006);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getDesignLabelMapping_3007Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFMapVisualIDRegistry.getType(DesignLabelMappingEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFMapElementTypes.DesignLabelMapping_3007;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFMapDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3007);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getLabelMapping_3002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFMapVisualIDRegistry.getType(LabelMappingEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFMapElementTypes.LabelMapping_3002;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFMapDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getChildReference_3004Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFMapVisualIDRegistry.getType(ReferenceInfo2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFMapElementTypes.ChildReference_3004;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFMapDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getCompartmentMapping_3005Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFMapVisualIDRegistry.getType(CompartmentMappingInfoEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFMapElementTypes.CompartmentMapping_3005;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFMapDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getFeatureLabelMapping_3008Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFMapVisualIDRegistry.getType(FeatureLabelMapping2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFMapElementTypes.FeatureLabelMapping_3008;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFMapDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3008);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getDesignLabelMapping_3009Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFMapVisualIDRegistry.getType(DesignLabelMapping2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFMapElementTypes.DesignLabelMapping_3009;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFMapDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3009);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getLabelMapping_3003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFMapVisualIDRegistry.getType(LabelMapping2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFMapElementTypes.LabelMapping_3003;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFMapDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getMapping_1000Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getTopNodeReferenceOwnedChild_4001Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getChildReferenceOwnedChild_4004Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getChildReferenceReferencedChild_4002Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getCompartmentMappingChildren_4003Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">";
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

}
