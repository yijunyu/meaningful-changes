/*
 * Copyright (c) 2006, 2007 Borland Software Corp.
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;

/**
 * @author dstadnik
 */
public abstract class ListElementSelectorExtension extends ElementSelectorExtension {

	protected List list;

	public void createControl(Composite parent) {
		Composite plate = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			plate.setLayout(layout);

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			data.verticalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			plate.setLayoutData(data);
		}
		Label label = new Label(plate, SWT.NONE);
		label.setText(getModelElementName());
		{
			GridData data = new GridData();
			label.setLayoutData(data);
		}
		list = new List(plate, SWT.SINGLE | SWT.V_SCROLL | SWT.BORDER);
		list.setEnabled(false);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			data.verticalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			list.setLayoutData(data);
		}

		// logic

		list.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				selectedModelElement = modelElements.get(list.getSelectionIndex());
				fireModelElementChanged();
			}
		});
	}

	public void setResource(Resource resource) {
		selectedModelElement = null;
		modelElements.clear();
		list.removeAll();
		if (resource == null) {
			list.setEnabled(false);
		} else {
			list.setEnabled(true);
			modelElements = getModelElements(resource);
			for (EObject next : modelElements) {
				list.add(getModelElementLabel(next));
			}
			if (!modelElements.isEmpty()) {
				selectedModelElement = modelElements.get(0);
				list.select(0);
			}
		}
		fireModelElementChanged();
	}
}
