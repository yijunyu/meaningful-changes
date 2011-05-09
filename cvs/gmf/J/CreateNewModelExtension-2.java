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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * @author dstadnik
 */
public class CreateNewModelExtension implements ModelSelectionPageExtension {

	private final ModelSelectionPage page;

	private Button btn;

	private boolean createNewModel;

	public CreateNewModelExtension(ModelSelectionPage page) {
		this.page = page;
	}

	public final boolean shouldCreateNewModel() {
		return createNewModel;
	}

	protected void setCreateNewModel(boolean value) {
		if (createNewModel == value) {
			return;
		}
		this.createNewModel = value;
		if (btn != null) {
			btn.setSelection(value);
		}
		page.setReadOnly(value);
	}

	protected String getLabelText() {
		return Messages.CreateNewModelExtensionCreateNewModel;
	}

	public void createControl(Composite parent) {
		btn = new Button(parent, SWT.CHECK);
		btn.setText(getLabelText());
		btn.setSelection(createNewModel);
		btn.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				setCreateNewModel(btn.getSelection());
			}
		});
	}

	public void setResource(Resource resource) {
	}
}
