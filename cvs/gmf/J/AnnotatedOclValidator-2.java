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

import java.text.MessageFormat;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.gmf.internal.validate.expressions.ExpressionProviderRegistry;
import org.eclipse.gmf.internal.validate.expressions.IModelExpression;

/**
 * This validator extends the checker for basic EObject constraints
 * with validation of OCL constrain annotation. 
 * 
 * @author dvorak
 */
public class AnnotatedOclValidator extends AbstractValidator implements EValidator {	
	
	/**
	 * Handles elements related to OCL annotations 
	 */
	private static ConstraintHandler oclHandler = new ConstraintHandler();
		
	/**
	 * Constructs validator
	 */
	public AnnotatedOclValidator() {
	}
			
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.EValidator#validate(org.eclipse.emf.ecore.EDataType, java.lang.Object, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */
	public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.EValidator#validate(org.eclipse.emf.ecore.EObject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map context) {
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}
	
	/**
	 * @see EObjectValidator#validate(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EObject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map context) {
		return validateOCL(eObject, diagnostics, context);
	}

	/**
	 * Performs <code>OCL annotation checks on the given object</code>
	 * </p>
	 * @param eObject the subject for validation 
	 * @param diagnostics diagnostics object to collect the results 
	 * @param context the context of validation activity
	 * @return <code>true</code>if object is valid; <code>false</code> otherwise
	 */
	protected boolean validateOCL(EObject eObject, final DiagnosticChain diagnostics, Map context) {		
		if(eObject instanceof EAnnotation) {
			return oclHandler.handleEAnnotation((EAnnotation)eObject, diagnostics, context);
		}
		else if(eObject.eClass().getEPackage() != EcorePackage.eINSTANCE) {
			return oclHandler.handleMetaModel(eObject.eClass(), eObject, diagnostics, context);
		} 		
		
		return true;
	}	
		
	private static class ConstraintHandler {
		public ConstraintHandler() {}
		
		protected EClass getContextType(EModelElement constrainedElement) {
			if(constrainedElement instanceof EClass) {
				return (EClass)constrainedElement;
			} 
			else if(constrainedElement instanceof EStructuralFeature) {
				return ((EStructuralFeature)constrainedElement).getEContainingClass();
			}			
			return null;
		}
		
		protected boolean handleEAnnotation(EAnnotation annotation, DiagnosticChain diagnostics, Map context) {
			return handleEAnnotation(annotation, null /* no instance to evaluate against */, diagnostics, context);
		}
		
		protected boolean handleEAnnotation(EAnnotation annotation, EObject contextInstance, DiagnosticChain diagnostics, Map context) {
			if(!Annotations.CONSTRAINTS_URI.equals(annotation.getSource())) {
				return true;
			}

			boolean isValid = true;
			for(Iterator it = annotation.getDetails().iterator(); it.hasNext();) {
				Map.Entry nextDetail = (Map.Entry)it.next();
				String key = String.valueOf(nextDetail.getKey());
				if(ExpressionProviderRegistry.getInstance().getLanguages().contains(key)) {
					String body = readBodyDetail(nextDetail, diagnostics);
					if(body != null) {
						EModelElement constrainedElement = annotation.getEModelElement();
						EClass contextClass = getContextType(constrainedElement);
						if(contextClass != null) {
							IModelExpression expression = getExpression(key, body, contextClass, context);
							assert expression != null;
							
							ConstraintAdapter constraint = new ConstraintAdapter(expression);																				
							if(contextInstance != null) {
								isValid &= handleConstraintDefition(constraint, contextInstance, diagnostics);								
								isValid &= handleConstrainedElement(constraint, contextInstance, 
												getDescriptionDetail(annotation), diagnostics);
							} else {
								isValid &= handleConstraintDefition(constraint, nextDetail, diagnostics);								
							}
						} else {
							diagnostics.add(new BasicDiagnostic(
								Diagnostic.WARNING, DIAGNOSTIC_SOURCE, StatusCodes.INVALID_CONSTRAINT_CONTEXT, 
								MessageFormat.format(Messages.validation_ConstraintInInvalidContext,  
									new Object[] { LabelProvider.INSTANCE.getObjectLabel(constrainedElement) }),
									new Object[] { nextDetail }));					
						}
					} // end of body processing
				}
			}
			return isValid;
		}
		

		private static String getDescriptionDetail(EAnnotation annotation) {
			Object val = annotation.getDetails().get(Annotations.DESCRIPTION);
			return val != null ? String.valueOf(val) : null; 		
		}
		
		private static String readBodyDetail(Map.Entry bodyEntry, DiagnosticChain diagnostics) {
			String body = (String)bodyEntry.getValue();
			if(body != null && body.trim().length() > 0) {
				return body;
			}
			diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING, 
					DIAGNOSTIC_SOURCE, StatusCodes.EMPTY_CONSTRAINT_BODY, 
					Messages.validation_EmptyExpressionBody,  
					new Object[] { bodyEntry }));
			return null;
		}
		
		protected boolean handleMetaModel(EClass eClass, EObject modelElement, DiagnosticChain diagnostics, Map context) {
			boolean isValid = true;
			
			for (Iterator it = eClass.getEAnnotations().iterator(); it.hasNext();) {
				EAnnotation nextAnnocation = (EAnnotation) it.next();
				if(Annotations.CONSTRAINTS_URI.equals(nextAnnocation.getSource())) {
					handleEAnnotation(nextAnnocation, modelElement, diagnostics, context);					
				}
			}
			
			for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();) {
				EOperation nextOperation = (EOperation) it.next();
				EAnnotation annotation = nextOperation.getEAnnotation(Annotations.CONSTRAINTS_URI);
				if(annotation != null) {
					isValid &= handleEAnnotation(annotation, modelElement, diagnostics, context);
				}
			}
			for (Iterator it = eClass.getEStructuralFeatures().iterator(); it.hasNext();) {
				EStructuralFeature nextFeature = (EStructuralFeature) it.next();
				EAnnotation annotation = nextFeature.getEAnnotation(Annotations.CONSTRAINTS_URI);
				if(annotation != null) {
					isValid &= handleEAnnotation(annotation, modelElement, diagnostics, context);
				}
			}			
			
			EList superTypes = eClass.getESuperTypes();
			for (Iterator it = superTypes.iterator(); it.hasNext();) {
				EClass nextSuperType = (EClass) it.next();
				isValid &= handleMetaModel(nextSuperType, modelElement, diagnostics, context); 
			}			
			
			return isValid;
		}
		


		protected boolean handleConstraintDefition(ConstraintAdapter constraintProxy, Object target, DiagnosticChain diagnostics) {			
			IStatus constraintStatus = constraintProxy.getStatus();

			if(Trace.shouldTrace(DebugOptions.META_DEFINITIONS)) {
				String msgPtn = "[metamodel-constraint] context={0} body={1}"; //$NON-NLS-1$
				Trace.trace(MessageFormat.format(msgPtn, new Object[] { 
					LabelProvider.INSTANCE.getObjectLabel(constraintProxy.getContext()), 
					constraintProxy.getBody() 
				}));
			}
			
			
			if(!constraintStatus.isOK()) {
				String message = MessageFormat.format(Messages.invalidExpressionBody, 
						new Object[] { constraintProxy.getBody(), 
						constraintStatus.getMessage() });
				diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, DIAGNOSTIC_SOURCE, constraintStatus.getCode(), 
						message, new Object[] { target }));
				return false;			
			} 
			
			return true;			
		}
		
		protected boolean handleConstrainedElement(ConstraintAdapter constraint, EObject constrainedElement, String description, DiagnosticChain diagnostics) {
			if(!constraint.isSatisfied(constrainedElement)) {
				String message = null;
				if(description == null) {
					message = MessageFormat.format(Messages.validation_ConstraintViolation, new Object[] { 
							constraint.getBody(), 
							LabelProvider.INSTANCE.getObjectLabel(constrainedElement) });
				} else {
					// TODO - user constraint ID as a key, support localication for messages
					message = description; 
				}
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 
						StatusCodes.CONSTRAINT_VIOLATION, message, new Object[] { constrainedElement }));				
				return false;
			} 
			
			return true;
		}
	}
}