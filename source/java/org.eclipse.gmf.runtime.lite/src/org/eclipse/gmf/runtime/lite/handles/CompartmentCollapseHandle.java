/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.handles;

import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.internal.runtime.lite.PluginImages;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Image;

public class CompartmentCollapseHandle extends CompartmentNameHandle {
	private ResourceSetListener myResourceSetListener;
	private TransactionalEditingDomain myDomain;

	public CompartmentCollapseHandle(GraphicalEditPart owner, String title) {
		super(owner, title);	//XXX: temporary
		View ownerView = getOwnerView();
		NotificationFilter filter = NotificationFilter.createNotifierFilter(ownerView).and(NotificationFilter.createFeatureFilter(NotationPackage.eINSTANCE.getView_Styles()));
		NotificationFilter childrenFilter = NotificationFilter.createNotifierFilter(ownerView).and(
			NotificationFilter.createFeatureFilter(NotationPackage.eINSTANCE.getView_PersistedChildren()).or(
				NotificationFilter.createFeatureFilter(NotationPackage.eINSTANCE.getView_TransientChildren())));
		filter = filter.or(childrenFilter);
		DrawerStyle drawerStyle = (DrawerStyle) ownerView.getStyle(NotationPackage.eINSTANCE.getDrawerStyle());
		if (drawerStyle != null) {
			NotificationFilter styleFilter = NotificationFilter.createNotifierFilter(drawerStyle).and(NotificationFilter.createFeatureFilter(NotationPackage.eINSTANCE.getDrawerStyle_Collapsed()));
			filter = filter.or(styleFilter);
		}
		myResourceSetListener = new ResourceSetListenerImpl(filter) {
			@Override
			public boolean isAggregatePrecommitListener() {
				return true;
			}
			@Override
			public void resourceSetChanged(ResourceSetChangeEvent event) {
				updateIcon();
			}
		};
		updateIcon();
	}

	private void updateIcon() {
		getLabel().setIcon(getCollapseIcon());
	}

	private Image getCollapseIcon() {
		if (isEmptyContents()) {
			return null;
		}
		if (isCollapsed()) {
			return PluginImages.get(PluginImages.IMG_HANDLE_COLLAPSE);
		} else {
			return PluginImages.get(PluginImages.IMG_HANDLE_EXPAND);
		}
	}

	private boolean isCollapsed() {
		View ownerView = getOwnerView();
		if (ownerView == null) {
			return false;
		}
		DrawerStyle drawerStyle = (DrawerStyle) ownerView.getStyle(NotationPackage.eINSTANCE.getDrawerStyle());
		return drawerStyle != null && drawerStyle.isCollapsed();
	}

	private View getOwnerView() {
		return getOwner().getModel() instanceof View ? (View) getOwner().getModel() : null;
	}

	@Override
	public void addNotify() {
		super.addNotify();
		View ownerView = getOwnerView();
		myDomain = TransactionUtil.getEditingDomain(ownerView);
		if (myDomain != null) {
			myDomain.addResourceSetListener(myResourceSetListener);
		}
	}

	@Override
	public void removeNotify() {
		if (myDomain != null) {
			myDomain.removeResourceSetListener(myResourceSetListener);
			myDomain = null;
		}
		super.removeNotify();
	}

	@Override
	public DragTracker getDragTracker() {
		if (getOwnerView() != null && !isEmptyContents()) {
			return new CompartmentCollapseTracker(getOwner());
		}
		return null;
	}

	/**
	 * See https://bugs.eclipse.org/bugs/show_bug.cgi?id=170341
	 */
	protected boolean isEmptyContents() {
		if (isCollapsed()) {
			return getOwnerView() == null || getOwnerView().getVisibleChildren().isEmpty();
		} else {
			return getOwner().getChildren().isEmpty();
		}
	}
}
