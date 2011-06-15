/*
 * Copyright (c) 2005, 2006 Borland Software Corporation
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

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.validate.expressions.IModelExpression;
import org.eclipse.gmf.internal.validate.expressions.IModelExpressionProvider;
import org.eclipse.gmf.internal.validate.expressions.IParseEnvironment;

public class RegularExpressionProvider implements IModelExpressionProvider {

	public RegularExpressionProvider() {	
	}

	public IModelExpression createExpression(String body, EClassifier context) {
		return createExpression(body, context, null);		
	}
	
	public IModelExpression createExpression(String body, EClassifier context, IParseEnvironment extEnv) {
		return new RegularExpressionAdapter(body, context, extEnv, false);
	}
	
	public static class Negated extends RegularExpressionProvider {
		public IModelExpression createExpression(String body, EClassifier context, IParseEnvironment extEnv) {
			return new RegularExpressionAdapter(body, context, extEnv, true);
		}		
	}
}
