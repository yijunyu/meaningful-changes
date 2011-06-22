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
package org.eclipse.gmf.internal.validate.regexp;

import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.internal.validate.Annotations;
import org.eclipse.gmf.internal.validate.DebugOptions;
import org.eclipse.gmf.internal.validate.DefUtils;
import org.eclipse.gmf.internal.validate.GMFValidationPlugin;
import org.eclipse.gmf.internal.validate.Messages;
import org.eclipse.gmf.internal.validate.StatusCodes;
import org.eclipse.gmf.internal.validate.Trace;
import org.eclipse.gmf.internal.validate.expressions.AbstractExpression;
import org.eclipse.gmf.internal.validate.expressions.IEvaluationEnvironment;
import org.eclipse.gmf.internal.validate.expressions.IParseEnvironment;
import org.eclipse.osgi.util.NLS;

class RegularExpressionAdapter extends AbstractExpression {	
	private Pattern pattern;
	private boolean isNegation;
	
	public RegularExpressionAdapter(String body, EClassifier context, IParseEnvironment extEnv, boolean isNegation) {
		super(body, context, extEnv);
		
		this.isNegation = isNegation;
		try {
			this.pattern = Pattern.compile(body);
			if(!(context instanceof EDataType)) {
				setStatus(GMFValidationPlugin.createStatus(IStatus.WARNING, 0, NLS.bind(Messages.expressionRequiresEDataTypeAsContext, getLanguage()), null));				
			}
		} catch (PatternSyntaxException e) {
			setInvalidExprStatus(e);
		} catch(RuntimeException e) {
			setUnexpectedParseError(e);			
		}
	}
	
	public String getLanguage() {
		return isNegation ? Annotations.NEG_REGEXP_KEY : Annotations.REGEXP_KEY;
	}
	
	public boolean isLooselyTyped() {	
		return false;
	}
	
	public boolean isAssignableTo(EClassifier ecoreType) {
		// ask Ecore to check if the type can be assigned a boolean value
		return ecoreType.isInstance(Boolean.TRUE);			
	}
	
	public boolean isAssignableToElement(ETypedElement typedElement) {
		return typedElement.getEType() != null && isAssignableTo(typedElement.getEType());
	}
	
	public EClassifier getResultType() {
		return DefUtils.getCanonicalEcorePackageClassifier(EcorePackage.eINSTANCE.getEBooleanObject());
	}

	protected Object doEvaluate(Object context) {
		if(this.pattern == null || context == null) {
			return null;
		}
		String contextInstance = null;
		if (context instanceof EDataType) {
			contextInstance = EcoreUtil.convertToString((EDataType) context, contextInstance);
		}
		Matcher matcher = this.pattern.matcher(String.valueOf(contextInstance));
		boolean matches = matcher.matches();
		return Boolean.valueOf(isNegation ? !matches : matches);
	}
	
	protected Object doEvaluate(Object context, IEvaluationEnvironment extEnvironment) {
		return doEvaluate(context);
	}
	
	private void setInvalidExprStatus(Exception exception) {
		String message = MessageFormat.format(
				Messages.invalidExpressionBody, 
				new Object[] { getBody(), exception.getLocalizedMessage() });
		
		setStatus(GMFValidationPlugin.createStatus(
				IStatus.ERROR, StatusCodes.INVALID_VALUE_EXPRESSION, message, exception));
		Trace.catching(DebugOptions.EXCEPTIONS_CATCHING, exception);			
	}	
	
	private void setUnexpectedParseError(Exception e) {
		setStatus(GMFValidationPlugin.createStatus(
				IStatus.ERROR, StatusCodes.UNEXPECTED_PARSE_ERROR, 
				Messages.unexpectedExprParseError, e));
		GMFValidationPlugin.log(getStatus());
		Trace.catching(DebugOptions.EXCEPTIONS_CATCHING, e);			
	}	
}
