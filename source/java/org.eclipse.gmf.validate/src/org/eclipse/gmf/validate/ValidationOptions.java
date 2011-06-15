/*
 * Copyright (c) 2005, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *    Radek Dvorak (Borland) - initial API and implementation
 */
package org.eclipse.gmf.validate;

/**
 * Holds GMF specific options to be used in validation
 */
public class ValidationOptions {
	private boolean reportSuccess;
	private boolean useGmfLabelSubtitution;	
	
	public static ValidationOptions getDefault() {
		ValidationOptions options = new ValidationOptions();
		options.setReportSuccess(false);		
		return options;
	}

	public boolean isReportSuccess() {
		return reportSuccess;
	}

	public void setReportSuccess(boolean reportSuccess) {
		this.reportSuccess = reportSuccess;
	}

	public boolean isUseGmfLabelSubtitution() {
		return useGmfLabelSubtitution;
	}

	public void setUseGmfLabelSubtitution(boolean useGmfLabelSubtituion) {
		this.useGmfLabelSubtitution = useGmfLabelSubtituion;
	}
}
