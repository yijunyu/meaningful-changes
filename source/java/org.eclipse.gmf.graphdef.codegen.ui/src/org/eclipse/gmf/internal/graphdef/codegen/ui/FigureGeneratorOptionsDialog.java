/*
 * Copyright (c) 2005, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Boris Blajer (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.graphdef.codegen.ui;

import org.eclipse.gmf.graphdef.codegen.MapModeCodeGenStrategy;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class FigureGeneratorOptionsDialog extends TitleAreaDialog {
    private Button useMapModeButton;
    private Button useRuntimeFiguresButton;
	private boolean useMapMode;
	private boolean useRuntimeFigures;
	private String title;

	public FigureGeneratorOptionsDialog(Shell parentShell, String dialogTitle, boolean initialUseRuntimeFigures, boolean initialUseMapMode) {
		super(parentShell);
		title = dialogTitle;
		useMapMode = initialUseMapMode;
		useRuntimeFigures = initialUseRuntimeFigures;
	}

	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		if (title != null) {
			newShell.setText(title);
		}
	}

	protected Control createDialogArea(Composite parent) {
		Composite result = (Composite) super.createDialogArea(parent);
		GridLayout layout = new GridLayout();
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
		layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		result.setLayout(layout);
		createControls(result);
		setTitle("Generator Model Options");
        warnLiteVerstionDoesNotSupportMapMode();
        Dialog.applyDialogFont(result);
		return result;
	}

	protected void createControls(Composite result) {
        useMapModeButton = new Button(result, SWT.CHECK);
        useMapModeButton.setText("Use &IMapMode");
        useMapModeButton.setSelection(useMapMode);
        useMapModeButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_CENTER));
        useRuntimeFiguresButton = new Button(result, SWT.CHECK);
        useRuntimeFiguresButton.setText("&Utilize enhanced features of GMF runtime");
        useRuntimeFiguresButton.setSelection(useRuntimeFigures);
        useRuntimeFiguresButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_CENTER));
        SelectionListener selectionListener = new SelectionListener() {
        	public void widgetDefaultSelected(SelectionEvent e) {
        		warnLiteVerstionDoesNotSupportMapMode();
        	}
        	public void widgetSelected(SelectionEvent e) {
        		warnLiteVerstionDoesNotSupportMapMode();
        	}
		};
        useMapModeButton.addSelectionListener(selectionListener);
        useRuntimeFiguresButton.addSelectionListener(selectionListener);
        useMapModeButton.setSelection(useMapMode);
        useRuntimeFiguresButton.setSelection(useRuntimeFigures);
	}

    protected void warnLiteVerstionDoesNotSupportMapMode() {
    	if (!useRuntimeFiguresButton.getSelection() && useMapModeButton.getSelection()) {
    		setMessage("It is not recommended to use IMapMode for pure-GEF diagram editors", IMessageProvider.INFORMATION);
    	} else {
    		setMessage(null);
    	}
    }

    protected void okPressed() {
    	useRuntimeFigures = useRuntimeFiguresButton.getSelection();
    	useMapMode = useMapModeButton.getSelection();
    	super.okPressed();
    }

    public String getRuntimeToken() {
    	return useRuntimeFigures ? null : "lite";
    }

    public MapModeCodeGenStrategy getMapModeCodeGenStrategy() {
    	return useMapMode ? MapModeCodeGenStrategy.DYNAMIC : MapModeCodeGenStrategy.STATIC;
    }

    public boolean isHelpAvailable() {
    	return false;
    }
}
