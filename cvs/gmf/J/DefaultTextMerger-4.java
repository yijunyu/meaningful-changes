/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common.codegen;

import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.properties.PropertyMerger;

/**
 * @author artem
 */
public class DefaultTextMerger extends TextMerger {
	protected static final String TAG = "gmf generator persistent region"; //$NON-NLS-1$

	protected static final String BEGIN_TAG = TAG + " begin"; //$NON-NLS-1$

	protected static final String END_TAG = TAG + " end"; //$NON-NLS-1$

	private final JControlModel myControlModel;

	private final TaggedTextMerger myXmlMerger;

	private final PluginXMLTextMerger myPluginXmlMerger;

	public DefaultTextMerger(JControlModel jModel) {
		assert jModel != null;
		myControlModel = jModel;
		myXmlMerger = new TaggedTextMerger("<!-- " + BEGIN_TAG + " -->", "<!-- " + END_TAG + " -->");
		myPluginXmlMerger = new PluginXMLTextMerger("gmfgen", "generated", "true");
	}

	@Override
	public String mergeJava(String oldText, String newText) {
		if (getJControlModel() == null || !getJControlModel().canMerge()) {
			return super.mergeJava(oldText, newText);
		}
		JMerger jMerge = new JMerger(getJControlModel());
		jMerge.setSourceCompilationUnit(jMerge.createCompilationUnitForContents(newText));
		jMerge.setTargetCompilationUnit(jMerge.createCompilationUnitForContents(oldText));
		jMerge.merge();
		return jMerge.getTargetCompilationUnitContents();
	}

	@Override
	public String mergeProperties(String oldText, String newText) {
        PropertyMerger propertyMerger = new PropertyMerger();
        propertyMerger.setSourceProperties(newText);
        propertyMerger.setTargetProperties(oldText);
        propertyMerger.merge();
        return propertyMerger.getTargetProperties();
	}

	@Override
	public String mergeXML(String oldText, String newText) {
		if (myPluginXmlMerger.isRecognizedDocument(oldText)) {
			return myPluginXmlMerger.process(oldText, newText);
		}
		return myXmlMerger.process(oldText, newText);
	}

	private JControlModel getJControlModel() {
		return myControlModel;
	}
}
