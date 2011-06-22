/**
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.properties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;


public class PropertySourceProvider implements IPropertySourceProvider {
	private AdapterFactoryContentProvider adapterFactoryContentProvider;

	public PropertySourceProvider(AdapterFactory domainAdapterFactory) {
		adapterFactoryContentProvider = new AdapterFactoryContentProvider(domainAdapterFactory);
	}

	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		View view = getNotationElement(object);
		if (view == null) {
			return adapterFactoryContentProvider.getPropertySource(object);
		}
		//XXX: compose with view properties
		EObject domainElement = view.getElement();
		if (domainElement == null && view instanceof Edge) {
			Edge edge = (Edge) view;
			domainElement = edge.getTarget().getElement();
		}
		return adapterFactoryContentProvider.getPropertySource(domainElement);
	}

	private View getNotationElement(Object object) {
		View view = null;
		if (object instanceof View) {
			view = (View) object;
		} else if (object instanceof EditPart) {
			EditPart editPart = (EditPart) object;
			if (editPart.getModel() instanceof View) {
				view = (View) editPart.getModel();
			}
		}
		if (view != null) {
			return view;
		}
		return null;
	}
}
