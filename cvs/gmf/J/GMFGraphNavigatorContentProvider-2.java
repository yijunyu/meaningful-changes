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
package org.eclipse.gmf.graphdef.editor.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.gmf.graphdef.editor.edit.parts.CanvasEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.CompartmentEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.ConnectionEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.DiagramElementFigureEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Ellipse2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.EllipseEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryFiguresEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.NodeEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Polyline2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.PolylineEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.Rectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RectangleEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangle2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.RoundedRectangleEditPart;
import org.eclipse.gmf.graphdef.editor.part.GMFGraphVisualIDRegistry;
import org.eclipse.gmf.graphdef.editor.part.Messages;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class GMFGraphNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	public void dispose() {
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) GMFEditingDomainFactory.INSTANCE.createEditingDomain();
			editingDomain.setResourceToReadOnlyMap(new HashMap() {

				public Object get(Object key) {
					if (!containsKey(key)) {
						put(key, Boolean.TRUE);
					}
					return super.get(key);
				}
			});
			ResourceSet resourceSet = editingDomain.getResourceSet();

			org.eclipse.emf.common.util.URI fileURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = resourceSet.getResource(fileURI, true);
			Collection result = new ArrayList();
			result.addAll(createNavigatorItems(selectViewsByType(resource.getContents(), CanvasEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof GMFGraphNavigatorGroup) {
			GMFGraphNavigatorGroup group = (GMFGraphNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof GMFGraphNavigatorItem) {
			GMFGraphNavigatorItem navigatorItem = (GMFGraphNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (GMFGraphVisualIDRegistry.getVisualID(view)) {

		case CanvasEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			GMFGraphNavigatorGroup links = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_Canvas_1000_links, "icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections.singleton(view), CompartmentEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), NodeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), ConnectionEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), FigureGalleryEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view), DiagramElementFigureEditPart.VISUAL_ID);
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case CompartmentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GMFGraphNavigatorGroup outgoinglinks = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_Compartment_2001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), DiagramElementFigureEditPart.VISUAL_ID);
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NodeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GMFGraphNavigatorGroup outgoinglinks = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_Node_2002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), DiagramElementFigureEditPart.VISUAL_ID);
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConnectionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GMFGraphNavigatorGroup outgoinglinks = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_Connection_2003_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), DiagramElementFigureEditPart.VISUAL_ID);
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FigureGalleryEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections.singleton(view), FigureGalleryFiguresEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), FigureGalleryFiguresEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Ellipse2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), FigureGalleryFiguresEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), FigureGalleryFiguresEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Polyline2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case RectangleEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GMFGraphNavigatorGroup incominglinks = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_Rectangle_3001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(view), DiagramElementFigureEditPart.VISUAL_ID);
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Rectangle2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GMFGraphNavigatorGroup incominglinks = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_Rectangle_3002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(view), DiagramElementFigureEditPart.VISUAL_ID);
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EllipseEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GMFGraphNavigatorGroup incominglinks = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_Ellipse_3003_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(view), DiagramElementFigureEditPart.VISUAL_ID);
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case RoundedRectangleEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GMFGraphNavigatorGroup incominglinks = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_RoundedRectangle_3004_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(view), DiagramElementFigureEditPart.VISUAL_ID);
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case PolylineEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GMFGraphNavigatorGroup incominglinks = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_Polyline_3005_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), DiagramElementFigureEditPart.VISUAL_ID);
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Ellipse2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GMFGraphNavigatorGroup incominglinks = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_Ellipse_3006_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(view), DiagramElementFigureEditPart.VISUAL_ID);
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case RoundedRectangle2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GMFGraphNavigatorGroup incominglinks = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_RoundedRectangle_3007_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, Rectangle2EditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, EllipseEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews, PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), PolylineEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(view), DiagramElementFigureEditPart.VISUAL_ID);
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Polyline2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GMFGraphNavigatorGroup incominglinks = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_Polyline_3008_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), DiagramElementFigureEditPart.VISUAL_ID);
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DiagramElementFigureEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GMFGraphNavigatorGroup source = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_DiagramElementFigure_4001_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GMFGraphNavigatorGroup target = new GMFGraphNavigatorGroup(Messages.NavigatorGroupName_DiagramElementFigure_4001_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections.singleton(view), RectangleEditPart.VISUAL_ID);
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), Rectangle2EditPart.VISUAL_ID);
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), EllipseEditPart.VISUAL_ID);
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), RoundedRectangleEditPart.VISUAL_ID);
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), PolylineEditPart.VISUAL_ID);
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), Ellipse2EditPart.VISUAL_ID);
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), RoundedRectangle2EditPart.VISUAL_ID);
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), Polyline2EditPart.VISUAL_ID);
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), CompartmentEditPart.VISUAL_ID);
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), NodeEditPart.VISUAL_ID);
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), ConnectionEditPart.VISUAL_ID);
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection getLinksSourceByType(Collection edges, int visualID) {
		Collection result = new ArrayList();
		String type = GMFGraphVisualIDRegistry.getType(visualID);
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getLinksTargetByType(Collection edges, int visualID) {
		Collection result = new ArrayList();
		String type = GMFGraphVisualIDRegistry.getType(visualID);
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getOutgoingLinksByType(Collection nodes, int visualID) {
		Collection result = new ArrayList();
		String type = GMFGraphVisualIDRegistry.getType(visualID);
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getIncomingLinksByType(Collection nodes, int visualID) {
		Collection result = new ArrayList();
		String type = GMFGraphVisualIDRegistry.getType(visualID);
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildrenByType(Collection nodes, int visualID) {
		Collection result = new ArrayList();
		String type = GMFGraphVisualIDRegistry.getType(visualID);
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getDiagramLinksByType(Collection diagrams, int visualID) {
		Collection result = new ArrayList();
		String type = GMFGraphVisualIDRegistry.getType(visualID);
		for (Iterator it = diagrams.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram) it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection selectViewsByType(Collection views, String type) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CanvasEditPart.MODEL_ID.equals(GMFGraphVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent, boolean isLeafs) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			result.add(new GMFGraphNavigatorItem((View) it.next(), parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getForeignShortcuts(Diagram diagram, Object parent) {
		Collection result = new ArrayList();
		for (Iterator it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof GMFGraphAbstractNavigatorItem) {
			GMFGraphAbstractNavigatorItem abstractNavigatorItem = (GMFGraphAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}