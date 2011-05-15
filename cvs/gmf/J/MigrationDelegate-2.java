/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Borland - initial API and implementation
 */
package org.eclipse.gmf.internal.map.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.internal.common.migrate.MigrationHelper;
import org.eclipse.gmf.mappings.FeatureLabelMapping;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.MappingEntry;

class MigrationDelegate extends MigrationHelper.MigrationHelperDelegateImpl {
	private Collection<FeatureLabelMapping> myFeatureLabelMappings;
	
	MigrationDelegate() {
	}

	void init() {
		registerNarrowReferenceType(GMFMapPackage.eINSTANCE.getFeatureSeqInitializer_Initializers(), GMFMapPackage.eINSTANCE.getFeatureValueSpec());
		registerNarrowReferenceType(GMFMapPackage.eINSTANCE.getMappingEntry_LabelMappings(), GMFMapPackage.eINSTANCE.getFeatureLabelMapping());
	}

	@Override
	public void postProcess() {
		for (FeatureLabelMapping mapping : getSavedFeatureLabelMappings()) {
			if (mapping.getFeatures().isEmpty()) {
				MappingEntry entry = mapping.getMapEntry();
				entry.getLabelMappings().remove(mapping);
				LabelMapping newMapping = GMFMapPackage.eINSTANCE.getGMFMapFactory().createLabelMapping();
				newMapping.setDiagramLabel(mapping.getDiagramLabel());
				if (mapping.isReadOnly()) {
					newMapping.setReadOnly(true);
				}
				entry.getLabelMappings().add(newMapping);
			}
		}
	}

	@Override
	public void processObject(EObject result) {
		if (result instanceof FeatureLabelMapping) {
			getSavedFeatureLabelMappings().add((FeatureLabelMapping) result);
		}
	}
	
	private Collection<FeatureLabelMapping> getSavedFeatureLabelMappings() {
		if (myFeatureLabelMappings == null) {
			myFeatureLabelMappings = new ArrayList<FeatureLabelMapping>();
		}
		return myFeatureLabelMappings;
	}
}