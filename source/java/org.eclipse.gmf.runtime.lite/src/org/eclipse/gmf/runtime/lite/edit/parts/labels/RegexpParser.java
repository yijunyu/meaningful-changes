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

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Write-only label text displayer. Does not display any values, but is able to parse a given string.
 */
public class RegexpParser extends AbstractFeatureBasedLabelTextDisplayer {
	private final String myEditPattern;

	public RegexpParser(String editPattern, EStructuralFeature... features) {
		super(features);
		myEditPattern = adjustPattern(editPattern);
	}

	@Override
	protected String buildDisplayText(Object[] featureValues) {
		return null;
	}
	@Override
	protected String buildEditText(Object[] featureValues) {
		return null;
	}
	@Override
	protected Object[] parseEditedValues(String newString) throws IllegalArgumentException {
		if (newString == null) {
			return null;
		}
		return newString.split(myEditPattern);
	}

	protected String adjustPattern(String pattern) {
		if (pattern == null || pattern.length() == 0) {
			return " ";	//$NON-NLS-1$
		}
		return pattern;
	}
}
