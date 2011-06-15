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

import java.util.Observable;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * @author dstadnik
 */
public class CreateNewModelExtension extends Observable implements ModelSelectionPageExtension {

	private final ModelSelectionPage page;

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
		page.setReadOnly(value);
		page.validatePage();
		setChanged();
		notifyObservers(Boolean.valueOf(createNewModel));
	}

	protected String getLabelText() {
		return Messages.CreateNewModelExtensionCreateNewModel;
	}

	public void createControl(Composite parent) {
		final Button btn = new Button(parent, SWT.CHECK);
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

	public void validatePage() {
		if (!page.isModelRequired()) {
			return;
		}
		if (createNewModel) {
			page.setPageComplete(true);
		} else {
			page.setPageComplete(page.getResource() != null);
		}
	}
}
