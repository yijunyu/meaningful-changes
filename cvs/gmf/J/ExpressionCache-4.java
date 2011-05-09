/*
 * Copyright (c) 2005 Borland Software Corporation
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

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.validate.expressions.AbstractExpression;
import org.eclipse.gmf.internal.validate.expressions.IModelExpression;
import org.eclipse.gmf.internal.validate.expressions.IParseEnvironment;

/**
 * Cache for parsed OCL expressions, to be reused in evaluation for different
 * context instances.
 * 
 * @author dvorak
 */
public abstract class ExpressionCache {
	private Map<String, Object> body2Entries = new HashMap<String, Object>();

	protected ExpressionCache() {
	}

	protected abstract IModelExpression createExpressionEntry(String body, EClassifier context, IParseEnvironment extEnv);

	/**
	 * Gets expression object for the given context type and expression body.
	 * </p>
	 * 
	 * @param body
	 *            the expression body
	 * @param context
	 *            the context type required for evaluation.
	 * 
	 * @return the constraint proxy encapsulating the parsed constraint
	 *         expression
	 */
	public IModelExpression getExpression(String body, EClassifier context) {
		return getExpression(body, context, null);
	}

	/**
	 * Gets expression object for the given context type and expression
	 * body.
	 * </p>
	 * 
	 * @param body
	 *            the expression body
	 * @param context
	 *            the context type required for evaluation.
	 * @param env
	 *            parsing environment providing custom variable definitions.
	 * 
	 * @return the constraint proxy encapsulating the parsed constraint
	 *         expression
	 */
	@SuppressWarnings("unchecked")
	public IModelExpression getExpression(String body, EClassifier context, IParseEnvironment env) {
		if (body == null || context == null) {
			throw new IllegalArgumentException("Null expression body or context"); //$NON-NLS-1$
		}

		IModelExpression resultEntry = null;

		if (body2Entries.containsKey(body)) {
			Object prev = body2Entries.get(body);
			if (prev instanceof AbstractExpression) {
				IModelExpression prevEntry = (AbstractExpression) prev;
				if (prevEntry.getContext() == context) {
					return prevEntry;
				}
			}
			List cachedEntries = (prev instanceof List) ? (List) prev : new LinkedList();
			if (cachedEntries.isEmpty()) {
				// only one previous with not matching context class
				// -> add previous and register the new one
				cachedEntries.add(prev);
				body2Entries.put(body, cachedEntries);
			} else {
				// try to find entry with appropriate context
				for (Iterator it = cachedEntries.iterator(); it.hasNext();) {
					AbstractExpression nextConstraint = (AbstractExpression) it.next();
					if (nextConstraint.getContext() == context) {
						return nextConstraint;
					}
				}
			}
			resultEntry = createExpressionEntry(body, context, env);
			cachedEntries.add(resultEntry);
			assert resultEntry != null;
			return resultEntry;
		}

		resultEntry = createExpressionEntry(body, context, env);
		body2Entries.put(body, resultEntry);
		return resultEntry;
	}
}