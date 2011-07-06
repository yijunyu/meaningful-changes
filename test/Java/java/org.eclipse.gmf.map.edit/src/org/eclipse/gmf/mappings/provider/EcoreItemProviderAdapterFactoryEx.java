/*
 * Copyright (c) 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.mappings.provider;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.provider.EAttributeItemProvider;
import org.eclipse.emf.ecore.provider.EReferenceItemProvider;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;

/**
 * @author artem
 */
public class EcoreItemProviderAdapterFactoryEx extends EcoreItemProviderAdapterFactory {
	
	public EcoreItemProviderAdapterFactoryEx() {
		eAttributeItemProvider = new EAttributeItemProvider(this) {
			@Override
			public String getText(Object obj) {
				if (GMFMapEditPlugin.isQualifiedFeatureLabels()) {
					return GMFMapEditPlugin.getFeatureLabel((EStructuralFeature) obj);
				}
				return super.getText(obj);
			}
		};
		eReferenceItemProvider = new EReferenceItemProvider(this) {
			@Override
			public String getText(Object obj) {
				if (GMFMapEditPlugin.isQualifiedFeatureLabels()) {
					return GMFMapEditPlugin.getFeatureLabel((EStructuralFeature) obj);
				}
				return super.getText(obj);
			}
		};
	}

}
