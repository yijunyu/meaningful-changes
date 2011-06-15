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
 * An implementation of {@link ILabelTextDisplayer} that prints  
 * a number of {@link EStructuralFeature structural features} of the source object using {@link String#format(String, Object...) printf} notation.
 * No editing is supported.
 */
public class PrintfLabelTextDisplayer extends AbstractFeatureBasedLabelTextDisplayer {
	private final String myViewPattern;
	private final String myEditorPattern;

	public PrintfLabelTextDisplayer(String viewPattern, EStructuralFeature... features) {
		this(viewPattern, viewPattern, features);
	}

	public PrintfLabelTextDisplayer(String viewPattern, String editorPattern, EStructuralFeature... features) {
		super(features);
		myViewPattern = adjustPattern(viewPattern);
		myEditorPattern = adjustPattern(editorPattern);
	}

	@Override
	protected Object[] parseEditedValues(String newString) throws IllegalArgumentException {
		//This is a read-only formatter.
		return null;
	}

	@Override
	protected String buildDisplayText(Object[] featureValues) {
		return buildText(featureValues, myViewPattern);
	}

	@Override
	protected String buildEditText(Object[] featureValues) {
		return buildText(featureValues, myEditorPattern);
	}

	protected String adjustPattern(String pattern) {
		if (pattern == null || pattern.length() == 0) {
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < getFeatures().length; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append('%');
				sb.append(i + 1);
				sb.append('$');
				sb.append('s');
			}
			return sb.toString();
		}
		return pattern;
	}

	protected String buildText(Object[] featureValues, String pattern) {
		return String.format(pattern, featureValues);
	}
}
