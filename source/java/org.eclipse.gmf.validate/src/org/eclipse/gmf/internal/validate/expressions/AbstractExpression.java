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
package org.eclipse.gmf.internal.validate.expressions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.validate.DebugOptions;
import org.eclipse.gmf.internal.validate.GMFValidationPlugin;
import org.eclipse.gmf.internal.validate.LabelProvider;
import org.eclipse.gmf.internal.validate.Messages;
import org.eclipse.gmf.internal.validate.StatusCodes;
import org.eclipse.gmf.internal.validate.Trace;

/**
 * This class represents the base for expression. Clients providing new types 
 * of expression should sublass this class. 
 */
public abstract class AbstractExpression implements IModelExpression  {
	private IStatus status;
	private String body;
	private EClassifier contextClassifier; 
	private Map<String, EClassifier> extEnv;
			
	/**
	 * Constructs expression from its body, with specified context.
	 * 
	 * @param body
	 *            specifies the evaluation logic in the language recognized by
	 *            this expression.
	 * @param context
	 *            the class in which context the expression is to be parsed
	 * @param extendedEnv
	 *            additional parsing context information, can be
	 *            <code>null</code>
	 * @throws IllegalArgumentException
	 *             if any of the passed <code>body</code>,
	 *             <code>contextClassifier</code> is <code>null</code>
	 */
	protected AbstractExpression(String body, EClassifier context, IParseEnvironment extendedEnv) {
		if(body == null || context == null) {
			throw new IllegalArgumentException("null body or context-class"); //$NON-NLS-1$
		}
		this.body = body;			
		this.contextClassifier = context;
		this.status = Status.OK_STATUS;
		if(extendedEnv != null) {
			this.extEnv = new HashMap<String, EClassifier>(5);			
			for (String nextVar : extendedEnv.getVariableNames()) {
				extEnv.put(nextVar, extendedEnv.getTypeOf(nextVar));
			}
		} else {
			this.extEnv = Collections.emptyMap();
		}
	}
	
	protected Map<String, EClassifier> getExtEnvironment() {
		return extEnv;
	}
	
	public boolean isLooselyTyped() {
		return true;
	}
	
	protected void setStatus(IStatus status) {
		this.status = status;
	}
	
	/**
	 * Performs evaluation of this expression in the context.
	 * <p>
	 * This method gets called by {@link #evaluate(Object) } only if this
	 * expression has <code>OK</code> status and the passed context is valid
	 * 
	 * @param context
	 *            the context instance for evaluation.
	 * 
	 * @return result of this expression evalutation. In case this expression
	 *         status is not <code>OK</code> status, <code>null</code> is
	 *         returned.
	 */
	protected abstract Object doEvaluate(Object context);
	
	/**
	 * Performs evaluation of this expression in the extended context.
	 * <p>
	 * This method gets called by {@link #evaluate(Object) } only if this
	 * expression has <code>OK</code> status and the passed context is valid
	 * 
	 * @param context
	 *            the context instance for evaluation.
	 * @param extendedEnv
	 *            the environment with custom variables intialized for
	 *            evaluation
	 * 
	 * @return result of this expression evalutation. In case this expression
	 *         status is not <code>OK</code> status, <code>null</code> is
	 *         returned.
	 */	
	protected abstract Object doEvaluate(Object context, IEvaluationEnvironment extendedEnv);	
		
	public EClassifier getResultType() {
		return EcorePackage.eINSTANCE.getEJavaObject();
	}
	
	public abstract boolean isAssignableTo(EClassifier ecoreType);

	public abstract boolean isAssignableToElement(ETypedElement typedElement);
	
	public abstract String getLanguage();	
	
	public final Object evaluate(Object context) {
		return evaluate(context, null);
	}

	public final Object evaluate(Object contextInstance, IEvaluationEnvironment extendedEnv) {
		if(contextInstance == null || !hasCompatibleContext(contextInstance)) {
			throw new IllegalArgumentException("Invalid evaluation context:" + contextInstance); //$NON-NLS-1$
		}
		if(getStatus().isOK()) {
			try {
				if(extendedEnv != null) {
					return doEvaluate(contextInstance, extendedEnv);
				}
				return doEvaluate(contextInstance);				
			} catch (RuntimeException e) {
				IStatus status = GMFValidationPlugin.createStatus(
						IStatus.ERROR, StatusCodes.UNEXPECTED_EVALUATION_ERROR,
						Messages.unexpectedExprEvalError, e); 
				GMFValidationPlugin.log(status);
				Trace.catching(DebugOptions.EXCEPTIONS_CATCHING, e);
			}
		}
		return null;
	}
	
	public IStatus getStatus() {
		return status;
	}

	public String getBody() {
		return body;
	}
	
	public EClassifier getContext() {
		return contextClassifier; 
	}
	
	public String toString() {
		return body + "context:[" + LabelProvider.INSTANCE.getObjectLabel(contextClassifier) + "] "; //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	private boolean hasCompatibleContext(Object ctxInstance) {
		if(contextClassifier instanceof EClass) {
			EClass contextClass = (EClass)contextClassifier;
			return (ctxInstance instanceof EObject) ? 
					contextClass.isSuperTypeOf(((EObject)ctxInstance).eClass()) : false;
		} 
		
		return contextClassifier.isInstance(ctxInstance);
	}	
}
