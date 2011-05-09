/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Fedorov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.transform;

import org.eclipse.emf.common.ui.DiagnosticComposite;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;


class MapModelDiagnosticPage extends WizardPage {
	
	private DiagnosticComposite myDiagnosticComposite;
	private Button myIgnoreButton;


	MapModelDiagnosticPage(String pageName) {
		super(pageName);
	}

	public void createControl(Composite parent) {
		Composite plate = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			plate.setLayout(layout);

			GridData data = new GridData();
			data.verticalAlignment = GridData.FILL;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			plate.setLayoutData(data);
		}
		createDiagnosticComposite(plate);
		createIgnoreButton(plate);
		setControl(plate);

	}

	private void createDiagnosticComposite(Composite parent) {
		myDiagnosticComposite = new DiagnosticComposite(parent, SWT.NONE);
		myDiagnosticComposite.initialize(null);
		myDiagnosticComposite.setShowRootDiagnostic(true);
		myDiagnosticComposite.setSeverityMask(Diagnostic.ERROR);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		myDiagnosticComposite.setLayoutData(data);
	}
	
	private void createIgnoreButton(Composite parent) {
		myIgnoreButton = new Button(parent, SWT.CHECK);
		myIgnoreButton.setText(Messages.MapModelDiagnosticPage_btn_ignore_text);
		setButtonLayoutData(myIgnoreButton);
		myIgnoreButton.addSelectionListener(new SelectionAdapter(){
			
			@Override
			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				applyValidation();
			}
			
		});
	}

	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			initControls();
		}
		super.setVisible(visible);
	}
	
	private void initControls() {
		TransformToGenModelOperation o = getOperation();
		Diagnostic diagnostic = o.getMapmodelValidationResult();
		myDiagnosticComposite.setDiagnostic(diagnostic);
		boolean ignore = o.getOptions().getIgnoreMapModelValidation();
		myIgnoreButton.setSelection(ignore);
		setPageComplete(ignore);
	}

	TransformToGenModelOperation getOperation() {
		TransformToGenModelWizard wizard = (TransformToGenModelWizard) getWizard();
		return wizard.getTransformOperation();
	}
	
	void applyValidation() {
		boolean ignore = myIgnoreButton.getSelection();
		getOperation().getOptions().setIgnoreMapModelValidation(ignore);
		setPageComplete(ignore);
	}
}
