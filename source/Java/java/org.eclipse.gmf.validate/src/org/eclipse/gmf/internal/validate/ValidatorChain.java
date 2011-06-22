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
package org.eclipse.gmf.internal.validate;

import java.text.MessageFormat;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.gmf.validate.ValidationOptions;

public class ValidatorChain implements EValidator {
	private static final String DIAGNOSTIC_SOURCE = "org.eclipse.gmf.validation.failure"; //$NON-NLS-1$
	
	private EValidator[] validatorList;
	private ValidationOptions options;
	
	public ValidatorChain(EValidator[] validators) {
		this(validators, null);
	}
	
	/**
	 * 
	 * @param validators
	 * @param options validation optiond or <code>null</code> if default should be used
	 */
	public ValidatorChain(EValidator[] validators, ValidationOptions options) {
		if(validators == null || validators.length == 0) {
			throw new IllegalArgumentException("No validators specified"); //$NON-NLS-1$
		}
		
		this.validatorList = new EValidator[validators.length];
		
		for (int i = 0; i < validators.length; i++) {
			EValidator nextValidator = validators[i];
			if(nextValidator == null) {
				throw new IllegalArgumentException("null validator passed"); //$NON-NLS-1$
			}
			validatorList[i] = nextValidator;
		}		
		
		this.options = options;
	}
	
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(options != null && context != null) {
			AbstractValidator.setOptions(options, context);
		}
		
		boolean result = true;
		for (int i = 0; i < validatorList.length; i++) {
			EValidator nextValidator = validatorList[i];
			try {
				result &= nextValidator.validate(eClass, eObject, diagnostics, context);
			} catch (Exception e) {
				reportValidationFailure(eObject, diagnostics, e);
			}
		}
		return result;
	}

	public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(options != null && context != null) {
			AbstractValidator.setOptions(options, context);
		}
		
		boolean result = true;
		for (int i = 0; i < validatorList.length; i++) {
			EValidator nextValidator = validatorList[i];
			try {
				result &= nextValidator.validate(eDataType, value, diagnostics, context);
			} catch (Exception e) {
				reportValidationFailure(value, diagnostics, e);
			}			
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.EValidator#validate(org.eclipse.emf.ecore.EObject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(options != null && context != null) {
			AbstractValidator.setOptions(options, context);
		}

		boolean result = true;
		for (int i = 0; i < validatorList.length; i++) {
			EValidator nextValidator = validatorList[i];
			try {
				result &= nextValidator.validate(eObject, diagnostics, context);
			} catch (Exception e) {
				reportValidationFailure(eObject, diagnostics, e);
			}			
		}
		return result;
	}
	
	private static void reportValidationFailure(Object objFailedToValidate, DiagnosticChain diagnostics, Exception failure) {
		String messagePtn = Messages.unexpectedValidationError;		
		String objLabel = null;
		try {
			// safe check because of ItemProviders possibly throwing exceptions 
			objLabel = LabelProvider.getTextLabel(objFailedToValidate);
		} catch(RuntimeException e) {
			objLabel = String.valueOf(objFailedToValidate);
			Trace.catching(DebugOptions.EXCEPTIONS_CATCHING, e);			
		}

		IStatus status = GMFValidationPlugin.createStatus(
				IStatus.ERROR, StatusCodes.UNEXPECTED_VALIDATION_ERROR, 
				MessageFormat.format(messagePtn, new Object[] { objLabel }), failure);

		diagnostics.add(DefUtils.statusToDiagnostic(status, DIAGNOSTIC_SOURCE, objFailedToValidate));
		GMFValidationPlugin.log(status);
		Trace.catching(DebugOptions.EXCEPTIONS_CATCHING, failure);
	}
}
