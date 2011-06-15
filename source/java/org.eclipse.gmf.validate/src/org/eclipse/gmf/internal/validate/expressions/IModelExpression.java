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
package org.eclipse.gmf.internal.validate.expressions;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ETypedElement;

/**
 * This interface replesents a general expression resulting in a value when it
 * gets evaluated.
 * <p>
 * The evaluation logic is expressed by the body defined in the language
 * recognized by this expression. The expression is parased in the context of
 * specified EClass. The way how the context instance is references is
 * expression provider specific and should be described by the provider.
 */
public interface IModelExpression {

	/**
	 * Gets the body representing the evaluation logic of this expression.
	 * 
	 * @return the body text, never <code>null</code>
	 */
	public String getBody();

	/**
	 * Gets the context class which was used for parsing of this expression.
	 * 
	 * @return the context class, never <code>null</code>
	 */
	public EClassifier getContext();

	/**
	 * Gets the status of this expression.
	 * 
	 * @return The status with severity of <code>IStatus.OK</code> if this
	 *         expression has been succesfully parsed and is ready for
	 *         evaluation. Other severity levels indicate problems and this
	 *         expression is not evaluated.
	 */
	public IStatus getStatus();

	/**
	 * Evaluates this expression in the given context.
	 * 
	 * @param context
	 *            The contextual instance for evaluation. It must be the same or
	 *            sub-class of the context class used for parsing of this
	 *            expression
	 * @result the object resulting from evaluation
	 * @throws IllegalArgumentException
	 *             if the context object is invalid for this expression
	 * @throws IllegalArgumentException
	 *             if either the context object or the extended environment is
	 *             invalid for this expression
	 * @see #getContext()
	 * @see #evaluate(Object, IEvaluationEnvironment)
	 */
	public Object evaluate(Object context);

	/**
	 * Evaluates this expression in extended context.
	 * 
	 * @param context
	 *            The contextual instance for evaluation. It must be the same or
	 *            sub-class of the context class used for parsing of this
	 *            expression
	 * @param extendedEnv
	 *            environment with custom variables
	 * @result the object resulting from evaluation or <code>null</code> in
	 *         case this expression is not in <code>OK</code> status.
	 * @throws IllegalArgumentException
	 *             if either the context object or the extended environment is
	 *             invalid for this expression
	 * @see #evaluate(Object)
	 */
	public Object evaluate(Object context, IEvaluationEnvironment extendedEnv);

	/**
	 * Gets the type of the object which would be the result of this expression
	 * evaluation
	 * 
	 * @return the type classifier
	 */
	public EClassifier getResultType();

	/**
	 * Indicates whether this expression is loosely typed. Loosely typed means
	 * the parsed expression result type <code>java.lang.Object</code>. More
	 * concrete types can only be detected from the evaluation result.
	 * 
	 * @return <code>true</code> in case is loosely typed; otherwise
	 *         <code>false</code>
	 */
	public boolean isLooselyTyped();

	/**
	 * Checks whether the given ecore type is compatible for the asssignment 
	 * to the given type.
	 * @param ecoreType ecore type
	 */
	public boolean isAssignableTo(EClassifier ecoreType);

	/**
	 * Checks whether the given ecore type is compatible for the asssignment 
	 * to the given typed element.<p>
	 * This type check takes into account multiplicities. 
	 * 
	 * @param ecoreType ecore type
	 * @return <code>true</code> if any result of this expression evaluation can 
	 * be assigned to feature represented by the given element type.    
	 */
	public boolean isAssignableToElement(ETypedElement typedElement);

	/**
	 * Gets the identifier of the language in which this expression is defined.
	 * 
	 * @return string representing the language identifier.
	 * 
	 * @see ExpressionProviderRegistry#getProvider(String)
	 */
	public String getLanguage();
}
