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
package org.eclipse.gmf.internal.bridge.wizards.pages;

import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * @author dstadnik
 */
public class ShowDashboardPage extends WizardPage {

	private boolean showDashboard;

	private Button showDashboardCheckbox;

	public ShowDashboardPage(String pageId, boolean showDashboard) {
		super(pageId);
		this.showDashboard = showDashboard;
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.verticalSpacing = 12;
		composite.setLayout(layout);
		composite.setLayoutData(createFillData());

		showDashboardCheckbox = new Button(composite, SWT.CHECK);
		showDashboardCheckbox.setText(Plugin.getBundleString("showDashboardPage.text")); //$NON-NLS-1$
		showDashboardCheckbox.setLayoutData(createHrzData());
		showDashboardCheckbox.setSelection(showDashboard);
		showDashboardCheckbox.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				showDashboard = showDashboardCheckbox.getSelection();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		Composite filler = new Composite(composite, SWT.NONE);
		filler.setLayoutData(createFillData());
		setControl(showDashboardCheckbox);
	}

	protected GridData createHrzData() {
		GridData data = new GridData();
		data.horizontalAlignment = SWT.FILL;
		data.grabExcessHorizontalSpace = true;
		return data;
	}

	protected GridData createFillData() {
		GridData data = new GridData();
		data.horizontalAlignment = SWT.FILL;
		data.grabExcessHorizontalSpace = true;
		data.verticalAlignment = SWT.FILL;
		data.grabExcessVerticalSpace = true;
		return data;
	}

	public boolean isShowDashboard() {
		return showDashboard;
	}

	public void setShowDashboard(boolean showDashboard) {
		this.showDashboard = showDashboard;
		if (showDashboardCheckbox != null && !showDashboardCheckbox.isDisposed()) {
			showDashboardCheckbox.setSelection(showDashboard);
		}
	}
}
