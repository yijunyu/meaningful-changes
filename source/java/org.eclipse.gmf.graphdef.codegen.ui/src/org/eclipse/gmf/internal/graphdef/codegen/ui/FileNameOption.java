/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */

package org.eclipse.gmf.internal.graphdef.codegen.ui;

import org.eclipse.pde.ui.templates.BaseOptionTemplateSection;
import org.eclipse.pde.ui.templates.TemplateOption;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @see org.eclipse.pde.ui.templates.StringOption
 */
public class FileNameOption extends TemplateOption {
	private final String[] myExtensions;
	private Text myText;
	private Label myLabelControl;
	private Button myBrowseButton;
	private boolean myIgnoreListener;
	private boolean mySaveNotLoad;
	
	/**
	 * @param section
	 *            the parent section
	 * @param name
	 *            the unique option name
	 * @param label
	 *            the translatable label of the option
	 */
	public FileNameOption(BaseOptionTemplateSection section, String name, String label, String[] extensions) {
		super(section, name, label);
		setRequired(true);
		myExtensions = extensions;
	}
	
	public void setSaveNotLoad(boolean saveNotLoad){
		mySaveNotLoad = saveNotLoad;
	}
	
	/**
	 * A utility version of the <samp>getValue() </samp> method that converts
	 * the current value into the String object.
	 * 
	 * @return the string version of the current value.
	 */
	public String getText() {
		if (getValue() != null)
			return getValue().toString();
		return null;
	}

	/**
	 * A utility version of the <samp>setValue </samp> method that accepts
	 * String objects.
	 * 
	 * @param newText
	 *            the new text value of the option
	 * @see #setValue(Object)
	 */
	public void setText(String newText) {
		setValue(newText);
	}
	
	/**
	 * Implements the superclass method by passing the string value of the new
	 * value to the widget
	 * 
	 * @param value
	 *            the new option value
	 */
	public void setValue(Object value) {
		super.setValue(value);
		if (myText != null) {
			myIgnoreListener = true;
			String textValue = getText();
			myText.setText(textValue != null ? textValue : ""); //$NON-NLS-1$
			myIgnoreListener = false;
		}
	}
	
	/**
	 * Creates the string option control.
	 * 
	 * @param parent
	 *            parent composite of the string option widget
	 * @param span
	 *            the number of columns that the widget should span
	 */
	public void createControl(Composite parent, int span) {
		myLabelControl = createLabel(parent, 1);
		myLabelControl.setEnabled(isEnabled());
		
		Composite textAndButtonGroup = new Composite(parent, SWT.NULL);
		GridLayout groupLayout = new GridLayout(2, false);
		groupLayout.marginWidth = 0;
		groupLayout.marginHeight = 0;
		groupLayout.verticalSpacing = 0;
		groupLayout.horizontalSpacing = 5;
		textAndButtonGroup.setLayout(groupLayout);

		GridData groupLayoutData = new GridData(GridData.FILL_HORIZONTAL);
		groupLayoutData.horizontalSpan = span - 1;
		textAndButtonGroup.setLayoutData(groupLayoutData);
		
		myText = new Text(textAndButtonGroup, SWT.SINGLE | SWT.BORDER);
		GridData textGD = new GridData(GridData.FILL_HORIZONTAL);
		myText.setLayoutData(textGD);
		
		myBrowseButton = new Button(textAndButtonGroup, SWT.NULL);
		GridData buttonGD = new GridData(GridData.HORIZONTAL_ALIGN_CENTER);
		myBrowseButton.setLayoutData(buttonGD);
		
		if (getValue() != null){
			myText.setText(getValue().toString());
		}
		myText.setEnabled(isEnabled());
		myText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if (myIgnoreListener)
					return;
				FileNameOption.super.setValue(myText.getText());
				getSection().validateOptions(FileNameOption.this);
			}
		});
		
		myBrowseButton.setText("Browse...");
		myBrowseButton.setEnabled(isEnabled());
		myBrowseButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		
			public void widgetSelected(SelectionEvent e) {
				FileDialog fileDialog = new FileDialog(e.display.getActiveShell(), getSaveNotLoadDialogStyle() | SWT.PRIMARY_MODAL);
				fileDialog.setFilterExtensions(myExtensions);
				setText(fileDialog.open());
				getSection().validateOptions(FileNameOption.this);
			}
			
			private int getSaveNotLoadDialogStyle(){
				return FileNameOption.this.isSaveNotLoad() ? SWT.SAVE : SWT.OPEN;
			}
		});
	}

	/**
	 * A string option is empty if its text field contains no text.
	 * 
	 * @return true if there is no text in the text field.
	 */
	public boolean isEmpty() {
		return getValue() == null || getValue().toString().trim().length() == 0;
	}
	
	/**
	 * Implements the superclass method by passing the enabled state to the
	 * option's widget.
	 * 
	 * @param enabled
	 */
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		if (myLabelControl != null) {
			myLabelControl.setEnabled(enabled);
			myText.setEnabled(enabled);
			myBrowseButton.setEnabled(enabled);
		}
	}
	
	private boolean isSaveNotLoad(){
		return mySaveNotLoad;
	}
}
