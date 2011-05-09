/**
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.parts.tree;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.gef.editparts.AbstractTreeEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.update.IUpdatableEditPart;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * Base implementation for {@link org.eclipse.gef.TreeEditPart} used by the generated editors. 
 */
public class BaseTreeEditPart extends AbstractTreeEditPart implements IUpdatableEditPart {
	private Image myImage;
	private ImageDescriptor myImageDescriptor;

	private AdapterFactory myAdapterFactory;

	public BaseTreeEditPart(View view, AdapterFactory adapterFactory) {
		setModel(view);
		myAdapterFactory = adapterFactory;
	}

	public View getNotationView() {
		return (View) getModel();
	}

	public EObject getElement() {
		return getNotationView().getElement();
	}

	protected List getModelChildren() {
		return getNotationView().getChildren();
	}

	protected Image getImage() {
		ImageDescriptor descriptor = getImageDescriptor();
		if (descriptor == null) {
			disposeImage();
			myImageDescriptor = null;
			return null;
		}
		if (myImageDescriptor != descriptor) {
			disposeImage();
			myImageDescriptor = descriptor;
			return createImage();
		}
		if (myImage == null || myImage.isDisposed()) {
			return createImage();
		}
		return myImage;
	}

	private Image createImage() {
		disposeImage();
		myImage = myImageDescriptor.createImage();
		return myImage;
	}

	private void disposeImage() {
		if (myImage != null && !myImage.isDisposed()) {
			myImage.dispose();
		}
		myImage = null;
	}

	/**
	 * Returns the image descriptor provided by the given adapter factory.
	 * Subclasses may override.
	 */
	protected ImageDescriptor getImageDescriptor() {
		if (getElement() == null) {
			return null;
		}
		IItemLabelProvider labelProvider = (IItemLabelProvider) myAdapterFactory.adapt(getElement(), IItemLabelProvider.class);
		if (labelProvider != null) {
			return ExtendedImageRegistry.getInstance().getImageDescriptor(labelProvider.getImage(getElement()));
		}
		return null;
	}

	/**
	 * Returns the text provided by the given adapter factory.
	 * Subclasses may override.
	 */
	protected String getText() {
		if (getElement() == null) {
			return "";
		}
		IItemLabelProvider labelProvider = (IItemLabelProvider) myAdapterFactory.adapt(getElement(), IItemLabelProvider.class);
		if (labelProvider != null) {
			return labelProvider.getText(getElement());
		}
		return "";
	}

	private HashMap structuralFeatures2Refresher;

	public Refresher getRefresher(EStructuralFeature feature, Notification msg) {
		if (structuralFeatures2Refresher == null) {
			createRefreshers();
		}
		return (Refresher) structuralFeatures2Refresher.get(feature);
	}

	protected void createRefreshers() {
		structuralFeatures2Refresher = new HashMap();
		Refresher childrenRefresher = new Refresher() {
			public void refresh() {
				refreshChildren();
			}
		};
		registerRefresher(NotationPackage.eINSTANCE.getView_PersistedChildren(), childrenRefresher);
		registerRefresher(NotationPackage.eINSTANCE.getView_TransientChildren(), childrenRefresher);
		registerRefresher(NotationPackage.eINSTANCE.getView_Visible(), childrenRefresher);
		registerRefresher(NotationPackage.eINSTANCE.getView_Styles(), childrenRefresher);
		registerRefresher(NotationPackage.eINSTANCE.getDrawerStyle_Collapsed(), childrenRefresher);
		//Source edges are shown as children
		registerRefresher(NotationPackage.eINSTANCE.getView_SourceEdges(), childrenRefresher);
	}

	protected final void registerRefresher(EStructuralFeature feature, Refresher refresher) {
		Refresher oldRefresher = (Refresher) structuralFeatures2Refresher.get(feature);
		if (oldRefresher == null) {
			structuralFeatures2Refresher.put(feature, refresher);
		} else {
			CompositeRefresher compositeRefresher = new CompositeRefresher();
			compositeRefresher.addRefresher(oldRefresher);
			compositeRefresher.addRefresher(refresher);
			structuralFeatures2Refresher.put(feature, compositeRefresher);
		}
	}
}
