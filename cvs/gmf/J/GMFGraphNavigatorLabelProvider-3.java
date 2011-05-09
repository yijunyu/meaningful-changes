/*
 * Copyright (c) 2006, 2007 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.navigator;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.gmfgraph.Identity;

import org.eclipse.gmf.graphdef.editor.edit.parts.CanvasEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.CompartmentEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.CompartmentNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.ConnectionEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.ConnectionNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.DiagramElementFigureEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Ellipse2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.EllipseEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.NodeEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.NodeNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Polyline2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.PolylineEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Rectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RectangleEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangleEditPart;

import org.eclipse.gmf.graphdef.editor.part.GMFGraphDiagramEditorPlugin;
import org.eclipse.gmf.graphdef.editor.part.GMFGraphVisualIDRegistry;

import org.eclipse.gmf.graphdef.editor.providers.GMFGraphElementTypes;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;

import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;

import org.eclipse.swt.graphics.Image;

import org.eclipse.ui.IMemento;

import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class GMFGraphNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GMFGraphDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?InvalidElement", ImageDescriptor.getMissingImageDescriptor());
		GMFGraphDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor());
		GMFGraphDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GMFGraphNavigatorItem && !isOwnView(((GMFGraphNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GMFGraphNavigatorGroup) {
			GMFGraphNavigatorGroup group = (GMFGraphNavigatorGroup) element;
			return GMFGraphDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof GMFGraphNavigatorItem) {
			GMFGraphNavigatorItem navigatorItem = (GMFGraphNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}
		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (GMFGraphVisualIDRegistry.getVisualID(view)) {
		case CompartmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.eclipse.org/gmf/2005/GraphicalDefinition?Compartment", GMFGraphElementTypes.Compartment_2001);
		case NodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.eclipse.org/gmf/2005/GraphicalDefinition?Node", GMFGraphElementTypes.Node_2002);
		case ConnectionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.eclipse.org/gmf/2005/GraphicalDefinition?Connection", GMFGraphElementTypes.Connection_2003);
		case FigureGalleryEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.eclipse.org/gmf/2005/GraphicalDefinition?FigureGallery", GMFGraphElementTypes.FigureGallery_2004);
		case RectangleEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/GraphicalDefinition?Rectangle", GMFGraphElementTypes.Rectangle_3001);
		case Rectangle2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/GraphicalDefinition?Rectangle", GMFGraphElementTypes.Rectangle_3002);
		case EllipseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/GraphicalDefinition?Ellipse", GMFGraphElementTypes.Ellipse_3003);
		case RoundedRectangleEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/GraphicalDefinition?RoundedRectangle", GMFGraphElementTypes.RoundedRectangle_3004);
		case PolylineEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/GraphicalDefinition?Polyline", GMFGraphElementTypes.Polyline_3005);
		case Ellipse2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/GraphicalDefinition?Ellipse", GMFGraphElementTypes.Ellipse_3006);
		case RoundedRectangle2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/GraphicalDefinition?RoundedRectangle", GMFGraphElementTypes.RoundedRectangle_3007);
		case Polyline2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/gmf/2005/GraphicalDefinition?Polyline", GMFGraphElementTypes.Polyline_3008);
		case CanvasEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.eclipse.org/gmf/2005/GraphicalDefinition?Canvas", GMFGraphElementTypes.Canvas_1000);
		case DiagramElementFigureEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.eclipse.org/gmf/2005/GraphicalDefinition?DiagramElement?figure", GMFGraphElementTypes.DiagramElementFigure_4001);
		default:
			return getImage("Navigator?UnknownElement", null);
		}
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GMFGraphDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && GMFGraphElementTypes.isKnownElementType(elementType)) {
			image = GMFGraphElementTypes.getImage(elementType);
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
		if (element instanceof GMFGraphNavigatorGroup) {
			GMFGraphNavigatorGroup group = (GMFGraphNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GMFGraphNavigatorItem) {
			GMFGraphNavigatorItem navigatorItem = (GMFGraphNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}
		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GMFGraphVisualIDRegistry.getVisualID(view)) {
		case CompartmentEditPart.VISUAL_ID:
			return getCompartment_2001Text(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_2002Text(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2003Text(view);
		case FigureGalleryEditPart.VISUAL_ID:
			return getFigureGallery_2004Text(view);
		case RectangleEditPart.VISUAL_ID:
			return getRectangle_3001Text(view);
		case Rectangle2EditPart.VISUAL_ID:
			return getRectangle_3002Text(view);
		case EllipseEditPart.VISUAL_ID:
			return getEllipse_3003Text(view);
		case RoundedRectangleEditPart.VISUAL_ID:
			return getRoundedRectangle_3004Text(view);
		case PolylineEditPart.VISUAL_ID:
			return getPolyline_3005Text(view);
		case Ellipse2EditPart.VISUAL_ID:
			return getEllipse_3006Text(view);
		case RoundedRectangle2EditPart.VISUAL_ID:
			return getRoundedRectangle_3007Text(view);
		case Polyline2EditPart.VISUAL_ID:
			return getPolyline_3008Text(view);
		case CanvasEditPart.VISUAL_ID:
			return getCanvas_1000Text(view);
		case DiagramElementFigureEditPart.VISUAL_ID:
			return getDiagramElementFigure_4001Text(view);
		default:
			return getUnknownElementText(view);
		}
	}

	/**
	 * @generated
	 */
	private String getCompartment_2001Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFGraphVisualIDRegistry.getType(CompartmentNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFGraphElementTypes.Compartment_2001;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFGraphDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getNode_2002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFGraphVisualIDRegistry.getType(NodeNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFGraphElementTypes.Node_2002;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFGraphDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_2003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFGraphVisualIDRegistry.getType(ConnectionNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFGraphElementTypes.Connection_2003;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFGraphDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getFigureGallery_2004Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return GMFGraphVisualIDRegistry.getType(FigureGalleryNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return GMFGraphElementTypes.FigureGallery_2004;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			GMFGraphDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getRectangle_3001Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identity) domainModelElement).getName();
		} else {
			GMFGraphDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getRectangle_3002Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identity) domainModelElement).getName();
		} else {
			GMFGraphDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEllipse_3003Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identity) domainModelElement).getName();
		} else {
			GMFGraphDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getRoundedRectangle_3004Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identity) domainModelElement).getName();
		} else {
			GMFGraphDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3004);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPolyline_3005Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identity) domainModelElement).getName();
		} else {
			GMFGraphDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3005);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEllipse_3006Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identity) domainModelElement).getName();
		} else {
			GMFGraphDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3006);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getRoundedRectangle_3007Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identity) domainModelElement).getName();
		} else {
			GMFGraphDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3007);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPolyline_3008Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identity) domainModelElement).getName();
		} else {
			GMFGraphDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3008);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getCanvas_1000Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((Identity) domainModelElement).getName();
		} else {
			GMFGraphDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getDiagramElementFigure_4001Text(View view) {
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
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">";
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

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CanvasEditPart.MODEL_ID.equals(GMFGraphVisualIDRegistry.getModelID(view));
	}

}
