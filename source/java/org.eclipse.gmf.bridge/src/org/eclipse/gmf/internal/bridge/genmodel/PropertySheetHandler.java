/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.genmodel;

import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab;
import org.eclipse.gmf.codegen.gmfgen.GenPropertySheet;
import org.eclipse.gmf.codegen.gmfgen.GenPropertyTab;
import org.eclipse.gmf.codegen.gmfgen.GenStandardPropertyTab;
import org.eclipse.gmf.codegen.gmfgen.GeneratedType;
import org.eclipse.gmf.codegen.gmfgen.TypeTabFilter;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @author artem
 */
public class PropertySheetHandler {

	protected static final String APPEARANCE = "appearance";
	protected static final String DIAGRAM = "diagram";
	protected static final String ADVANCED = "advanced";
	protected static final String DOMAIN = "domain";

	private GenPropertySheet myPropertySheet;

	public void initialize(GenPropertySheet propertySheet) {
		assert propertySheet != null;
		myPropertySheet = propertySheet;
	}

	public void process(CanvasMapping canvas) {
		addStandardTabs();
		addCustomTabs(canvas);
	}

	protected void addStandardTabs() {
		GenStandardPropertyTab t1 = GMFGenFactory.eINSTANCE.createGenStandardPropertyTab();
		t1.setID(APPEARANCE);
		addTab(t1);
		t1 = GMFGenFactory.eINSTANCE.createGenStandardPropertyTab();
		t1.setID(DIAGRAM);
		addTab(t1);
	}

	protected void addCustomTabs(CanvasMapping canvas) {
		if (!hasDomainModel(canvas)) {
			return;
		}
		GenCustomPropertyTab t1 = GMFGenFactory.eINSTANCE.createGenCustomPropertyTab();
		t1.setID(DOMAIN);
		t1.setLabel("Core");
		TypeTabFilter f = GMFGenFactory.eINSTANCE.createTypeTabFilter();
		f.getTypes().add(View.class.getName());
		f.getTypes().add("org.eclipse.gef.EditPart");
		if (myPropertySheet.getEditorGen().getNavigator() != null) {
			f.getGeneratedTypes().add(GeneratedType.ABSTRACT_NAVIGATOR_ITEM_LITERAL);
		}
		t1.setFilter(f);
		addTab(t1);
	}

	private void addTab(GenPropertyTab tab) {
		myPropertySheet.getTabs().add(tab);
	}

	private static boolean hasDomainModel(CanvasMapping canvas) {
		return canvas.getDomainModel() != null;
	}
}
