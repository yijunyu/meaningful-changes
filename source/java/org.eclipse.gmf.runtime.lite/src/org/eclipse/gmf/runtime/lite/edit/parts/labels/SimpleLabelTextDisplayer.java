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

import java.text.MessageFormat;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * An implementation of {@link ILabelTextDisplayer} that is based on a {@link MessageFormat format} and 
 * a number of {@link EStructuralFeature structural features} of the source object.
 * @deprecated Use {@link MessageFormatLabelTextDisplayer} instead.
 */
public class SimpleLabelTextDisplayer extends MessageFormatLabelTextDisplayer {
	/**
	 * Creates a text displayer which uses the given view pattern and will operate on the given features.
	 * The label is not editable.
	 */
	public SimpleLabelTextDisplayer(String viewPattern, EStructuralFeature... features) {
		this(viewPattern, null, features);
	}

	/**
	 * Creates a text displayer which uses the given view and edit patterns and will operate on the given features.
	 * If the edit pattern is <code>null</code>, the label will not be editable.
	 */
	public SimpleLabelTextDisplayer(String viewPattern, String editPattern, EStructuralFeature... features) {
		super(viewPattern, editPattern, editPattern, features);
	}
}
