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
package org.eclipse.gmf.runtime.lite.edit.parts.labels;

import java.util.Arrays;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * An implementation of {@link ILabelTextDisplayer} that uses native EMF mechanisms to convert a value of a datatype to 
 * its string representation and create an instance of the datatype from the literal value.
 * @see EcoreUtil#convertToString(org.eclipse.emf.ecore.EDataType, Object)
 * @see EcoreUtil#createFromString(org.eclipse.emf.ecore.EDataType, String)
 */
public class NativeLabelTextDisplayer extends AbstractFeatureBasedLabelTextDisplayer {
	public NativeLabelTextDisplayer(EAttribute feature) {
		super(feature);
	}

	public NativeLabelTextDisplayer(EAttribute[] features) {
		super(features);
		if (features.length != 1) {
			throw new IllegalArgumentException(Arrays.toString(features));
		}
	}

	protected EAttribute getAttribute() {
		return (EAttribute) getFeatures()[0];
	}

	@Override
	protected String buildDisplayText(Object[] featureValues) {
		if (featureValues == null || featureValues.length != 1) {
			return null;
		}
		return EcoreUtil.convertToString(getAttribute().getEAttributeType(), featureValues[0]);
	}

	@Override
	protected String buildEditText(Object[] featureValues) {
		return buildDisplayText(featureValues);
	}

	@Override
	protected Object[] parseEditedValues(String newString) throws IllegalArgumentException {
		if (newString == null || (newString.length() == 0 && shouldReplaceEmptyStringsWithNulls(getAttribute()))) {
			return new Object[] {null};
		}
		Object result = EcoreUtil.createFromString(getAttribute().getEAttributeType(), newString);
		return result == null ? null : new Object[] {result};
	}

}
