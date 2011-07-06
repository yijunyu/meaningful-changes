/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package org.eclipse.gmf.internal.common.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * @author dstadnik
 */
public abstract class ComboElementSelectorExtension extends ElementSelectorExtension {

	protected Combo combo;

	public void createControl(Composite parent) {
		Composite plate = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			plate.setLayout(layout);

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			plate.setLayoutData(data);
		}
		Label label = new Label(plate, SWT.NONE);
		label.setText(getModelElementName());
		{
			GridData data = new GridData();
			label.setLayoutData(data);
		}
		combo = new Combo(plate, SWT.DROP_DOWN | SWT.READ_ONLY);
		combo.setEnabled(false);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			combo.setLayoutData(data);
		}

		// logic

		combo.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				selectedModelElement = modelElements.get(combo.getSelectionIndex());
				fireModelElementChanged();
			}
		});
	}

	public void setResource(Resource resource) {
		selectedModelElement = null;
		modelElements.clear();
		combo.removeAll();
		if (resource == null) {
			combo.setEnabled(false);
		} else {
			combo.setEnabled(true);
			modelElements = getModelElements(resource);
			for (EObject next : modelElements) {
				combo.add(getModelElementLabel(next));
			}
			if (!modelElements.isEmpty()) {
				selectedModelElement = modelElements.get(0);
				combo.select(0);
			}
		}
		fireModelElementChanged();
	}
}
