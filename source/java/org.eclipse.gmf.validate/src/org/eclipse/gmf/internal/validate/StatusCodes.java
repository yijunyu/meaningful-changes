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

public final class StatusCodes {
  
	public static int INVALID_CONSTRAINT_EXPRESSION = 200;
	
	/**
	 * Status code indicates the error status expression which failed to parse.
	 */
	public static int INVALID_VALUE_EXPRESSION = 201;	
	
	/**
	 * Status code which indicates the error status for constraint having the expression type different from Boolean.
	 */
	public static int INVALID_EXPRESSION_TYPE = 202;	
	
	public static int MISSING_VALUESPEC_BODY_ANNOTATION = 205;	

	public static int INVALID_VALUESPEC_DEF = 206;	
	
	public static int NO_VALUESPEC_CONTEXT_AVAILABLE = 207;	
	
	public static int NO_VALUESPEC_BODY_AVAILABLE = 208;	
	
	public static int INVALID_CONSTRAINT_CONTEXT = 209;

	public static int INVALID_CONSTRAINT_SEVERITY = 210;	
	
	public static int EMPTY_CONSTRAINT_BODY = 212;

	public static int UNEXPECTED_PARSE_ERROR = 215;
	
	public static int UNEXPECTED_EVALUATION_ERROR = 220;
	
	public static int INVALID_VALUESPEC_TYPE = 222;	
	
	public static int VALUESPEC_TYPE_NOT_AVAILABLE = 223;	
	
	/**
	 * The diagnostic code for constraint violations.
	 */
	public static final int CONSTRAINT_VIOLATION = 225;
	
	public static final int CONSTRAINT_SATISFIED = 226;	
		
	public static final int UNEXPECTED_VALIDATION_ERROR = 300;

	public static final int INVALID_MODEL_IMPORT_URI = 305;
	
	public static final int EXPRESSION_PROVIDER_NOT_AVAILABLE = 310;
	
	private StatusCodes() {
	}
}
