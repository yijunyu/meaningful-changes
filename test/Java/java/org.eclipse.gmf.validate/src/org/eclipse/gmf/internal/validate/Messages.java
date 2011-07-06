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

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.gmf.internal.validate.messages";//$NON-NLS-1$

	private Messages() {
		// Do not instantiate
	}

	public static String validation_EmptyExpressionBody;
	public static String validation_ConstraintInInvalidContext;
	public static String validation_ConstraintViolation;
	public static String validation_ConstraintSatisfied;	
	public static String def_InvalidContextDefinition;
	public static String def_MissingBodyAnnotation;
	public static String def_NoContextAvailable;
	public static String def_NoTypeAvailable;
	public static String def_ValueSpecDefLabel;
	public static String def_ConstraintDefLabel;
	public static String invalidExpressionBody;	
	public static String incompatibleTypes;
	public static String unexpectedExprEvalError;
	public static String invalidConstraintExprType;
	public static String invalidConstraintSeverity;	
	public static String unexpectedValidationError;
	public static String unexpectedExprParseError;
	public static String invalidModelImportUri;	
	public static String modelImportResourceLoadingError;	
	public static String modelImportUriFallbackResolution;
	public static String def_NoEReferenceFoundByName;
	public static String def_NoEReferenceInCtxBinding;
	public static String def_NoCtxInProviderForCtxBinding;
	public static String def_MissingCtxDefInReferencedCtxProviders;	
	public static String expressionRequiresEDataTypeAsContext;	
	
	public static String noExpressionProviderAvailable;
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
