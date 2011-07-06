/**
 * Copyright (c) 2006, 2007 Borland Software Corporation
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

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.editparts.AbstractTreeEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.lite.edit.parts.labels.AbstractLabelTextDisplayer;
import org.eclipse.gmf.runtime.lite.edit.parts.labels.ILabelController;
import org.eclipse.gmf.runtime.lite.edit.parts.labels.ILabelTextDisplayer;
import org.eclipse.gmf.runtime.lite.edit.parts.labels.ItemProviderLabelTextDisplayer;
import org.eclipse.gmf.runtime.lite.edit.parts.update.IExternallyUpdatableEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.update.IUpdatableEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.update.RefreshAdapter;
import org.eclipse.gmf.runtime.lite.edit.parts.update.TransactionalUpdateManager;
import org.eclipse.gmf.runtime.lite.services.TreeDirectEditManager;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.TreeItem;

/**
 * Base implementation for {@link org.eclipse.gef.TreeEditPart} used by the generated editors. 
 */
public class BaseTreeEditPart extends AbstractTreeEditPart implements IUpdatableEditPart, IExternallyUpdatableEditPart, ILabelController {
	private Image myImage;
	private ImageDescriptor myImageDescriptor;

	private AdapterFactory myAdapterFactory;
	private ILabelTextDisplayer myLabelTextDisplayer;

	private RefreshAdapter myDomainModelRefresher = new RefreshAdapter(this);

	private TreeDirectEditManager directEditManager;

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

	@Override
	public void activate() {
		super.activate();
		if (getElement() != null) {
			TransactionalUpdateManager updateManager = getTransactionalUpdateManager();
			if (updateManager == null) {
					getElement().eAdapters().add(myDomainModelRefresher);
			} else {
				updateManager.addUpdatableEditPart(getElement(), this);
			}
		}
	}

	@Override
	public void deactivate() {
		TransactionalUpdateManager updateManager = getTransactionalUpdateManager();
		if (getElement() != null) {
			if (updateManager == null) {
				getElement().eAdapters().remove(myDomainModelRefresher);
			} else {
				updateManager.removeUpdatableEditPart(getElement(), this);
			}
		}
		super.deactivate();
	}

	protected TransactionalUpdateManager getTransactionalUpdateManager() {
		if (getParent() instanceof BaseTreeEditPart) {
			return ((BaseTreeEditPart) getParent()).getTransactionalUpdateManager();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	protected List getModelChildren() {
		return getNotationView().getVisibleChildren();
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

	public final ILabelTextDisplayer getLabelTextDisplayer() {
		if (myLabelTextDisplayer == null) {
			myLabelTextDisplayer = createLabelTextDisplayer();
			if (myLabelTextDisplayer == null) {
				myLabelTextDisplayer = new NullLabelTextDisplayer();
			}
		}
		return myLabelTextDisplayer;
	}

	protected ILabelTextDisplayer createLabelTextDisplayer() {
		return new ItemProviderLabelTextDisplayer(myAdapterFactory);
	}

	public void setLabelText(String text) {
		if (text == null || text.length() == 0) {
			text = getDefaultLabelText();
		}
		setWidgetText(text);
	}

	/**
	 * @return The text to use if an empty string would be displayed otherwise
	 */
	protected String getDefaultLabelText() {
		return "";	//$NON-NLS-1$
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
		String result = getLabelTextDisplayer().getDisplayText(getElement());
		if (result == null || result.length() == 0) {
			return getDefaultLabelText();
		}
		return result;
	}

	private HashMap<EStructuralFeature, Refresher> structuralFeatures2Refresher;

	public Refresher getRefresher(EStructuralFeature feature, Notification msg) {
		if (structuralFeatures2Refresher == null) {
			createRefreshers();
		}
		return (Refresher) structuralFeatures2Refresher.get(feature);
	}

	protected void createRefreshers() {
		structuralFeatures2Refresher = new HashMap<EStructuralFeature, Refresher>();
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

	private Collection<ExternalRefresher> myExternalRefreshers;

	public Collection<ExternalRefresher> getExternalRefreshers() {
		if (myExternalRefreshers == null) {
			myExternalRefreshers = createExternalRefreshers();
		}
		return myExternalRefreshers;
	}

	protected Collection<ExternalRefresher> createExternalRefreshers() {
		return Collections.<ExternalRefresher>singleton(new ILabelController.ExternalRefresherAdapter(this, getElement()));
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

	public void performRequest(org.eclipse.gef.Request req) {
		if (org.eclipse.gef.RequestConstants.REQ_DIRECT_EDIT == req.getType() && understandsRequest(req)) {
			performDirectEdit();
		} else {
			super.performRequest(req);
		}
	}

	protected TreeDirectEditManager getDirectEditManager() {
		if (directEditManager == null) {
			directEditManager = new TreeDirectEditManager(this, getCellEditorClass(), new CellEditorLocator() {
				public void relocate(CellEditor celleditor) {
					if (checkTreeItem()) {
						celleditor.getControl().setFont(((TreeItem) getWidget()).getFont());
						celleditor.getControl().setBounds(((TreeItem) getWidget()).getBounds());
					}
				}
			}) {
				protected void initCellEditor() {
					getCellEditor().setValue(getLabelTextDisplayer().getEditText(getElement()));
				}
			};
		}
		return directEditManager;
	}

	protected Class<? extends CellEditor> getCellEditorClass() {
		return TextCellEditor.class;
	}

	protected void performDirectEdit() {
		if (isReadOnly()) {
			return;
		}
		getDirectEditManager().show();
	}

	/**
	 * Returns whether the element is read only. This is used to determine if direct edit should be invoked or not.
	 */
	protected boolean isReadOnly() {
		if (getElement() == null) {
			return true;
		}
		Resource notationResource = getNotationView().eResource();
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(notationResource);
		if (editingDomain == null) {
			return false;
		}
		if (editingDomain.isReadOnly(notationResource)) {
			return true;
		}
		Resource domainResource = getElement().eResource();
		if (domainResource == null) {
			return false;
		}
		return editingDomain.isReadOnly(domainResource);
	}

	private class NullLabelTextDisplayer extends AbstractLabelTextDisplayer {
		private NullLabelTextDisplayer() {}

		public String getDisplayText(EObject source) {
			return getDefaultLabelText();
		}

		public boolean isAffectingEvent(Notification notification) {
			return false;
		}
	}
}
