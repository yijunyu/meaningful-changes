/**
 * Copyright (c) 2006 Borland Software Corporation
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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Widget;

/*
 * XXX: duplicates functionality of 
 * org.eclipse.gmf.internal.codegen.popup.actions.TransformToGenModelOptionsDialog 
 * and
 * org.eclipse.gmf.internal.graphdef.codegen.ui.FigureGeneratorOptionsDialog
 */
class ViewmapProducerWizardPage extends WizardPage {
	
    private Button generateRCPButton;
    private Button useMapModeButton;
    private Button useRuntimeFiguresButton;

	protected ViewmapProducerWizardPage(String pageName) {
		super(pageName);
	}
	
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout());
		createControls(composite);
		initControls();
		validatePage();

		setControl(composite);
		Dialog.applyDialogFont(composite);
	}

	private void createControls(Composite result) {
        useMapModeButton = new Button(result, SWT.CHECK);
        useMapModeButton.setText(Messages.ViewmapProducerWizardPage_btn_mapmode);
        useMapModeButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_CENTER));
        useRuntimeFiguresButton = new Button(result, SWT.CHECK);
        useRuntimeFiguresButton.setText(Messages.ViewmapProducerWizardPage_btn_runtime);
        useRuntimeFiguresButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_CENTER));
        generateRCPButton = new Button(result, SWT.CHECK);
        generateRCPButton.setText(Messages.ViewmapProducerWizardPage_btn_rcp);
        generateRCPButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_CENTER));
        SelectionListener selectionListener = new SelectionListener() {
        	public void widgetDefaultSelected(SelectionEvent e) {
        		handleSelection(e.widget);
        	}
        	public void widgetSelected(SelectionEvent e) {
        		handleSelection(e.widget);
        	}
		};
        useMapModeButton.addSelectionListener(selectionListener);
        useRuntimeFiguresButton.addSelectionListener(selectionListener);
        generateRCPButton.addSelectionListener(selectionListener);
	}

	void handleSelection(Widget w) {
		if (generateRCPButton.equals(w)){
			getOperation().getOptions().setGenerateRCP(generateRCPButton.getSelection());
		} else if (useMapModeButton.equals(w)) {
			getOperation().getOptions().setUseMapMode(useMapModeButton.getSelection());
		} else if (useRuntimeFiguresButton.equals(w)) {
			getOperation().getOptions().setUseRuntimeFigures(useRuntimeFiguresButton.getSelection());
		}
		validatePage();
	}
	
	private void validatePage() {
		IStatus checkOptions = checkOptions();
		if (checkOptions.isOK()) {
			setMessage(null);
			setPageComplete(true);
		} else {
    		setMessage(checkOptions.getMessage(), IMessageProvider.INFORMATION);
			setPageComplete(checkOptions.getSeverity() < IStatus.WARNING);
		}
	}
	
	private IStatus checkOptions() {
		boolean hasLite = TransformOptions.checkLiteOptionPresent();
		if (hasLite) {
			if (!useRuntimeFiguresButton.getSelection() && useMapModeButton.getSelection()) {
				return Plugin.createInfo(Messages.ViewmapProducerWizardPage_i_not_recommended);
			}
		}
		return Status.OK_STATUS;
	}

	private void initControls() {
		TransformOptions options = getOperation().getOptions();
		generateRCPButton.setSelection(options.getGenerateRCP());
		boolean hasLite = TransformOptions.checkLiteOptionPresent();
		boolean useRuntimeFigures = options.getUseRuntimeFigures();
		if (hasLite) {
			useRuntimeFiguresButton.setEnabled(true);
			useRuntimeFiguresButton.setSelection(useRuntimeFigures);
		} else {
			useRuntimeFiguresButton.setEnabled(false);
			useRuntimeFiguresButton.setSelection(true);
			options.setUseRuntimeFigures(true);
		}
		useMapModeButton.setSelection(options.getUseMapMode());
	}

	private TransformToGenModelOperation getOperation() {
		TransformToGenModelWizard wizard = (TransformToGenModelWizard) getWizard();
		return wizard.getTransformOperation();
	}
}
