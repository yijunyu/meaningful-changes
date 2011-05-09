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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.gmf.internal.validate.Annotations.Meta;
import org.eclipse.gmf.internal.validate.DefUtils.ContextTypeAdapter;
import org.eclipse.gmf.internal.validate.DefUtils.ExpressionContextProvider;
import org.eclipse.gmf.internal.validate.DefUtils.ExpresssionTypeProvider;
import org.eclipse.gmf.internal.validate.DefUtils.LookupByNameContextProvider;
import org.eclipse.gmf.internal.validate.DefUtils.TypedElementProvider;
import org.eclipse.gmf.internal.validate.IDefElementProvider.ContextProvider;
import org.eclipse.gmf.internal.validate.IDefElementProvider.StringValProvider;
import org.eclipse.gmf.internal.validate.IDefElementProvider.TypeProvider;
import org.eclipse.gmf.internal.validate.expressions.EnvironmentProvider;
import org.eclipse.gmf.internal.validate.expressions.IModelExpression;
import org.eclipse.gmf.internal.validate.expressions.IModelExpressionProvider;
import org.eclipse.gmf.internal.validate.expressions.IParseEnvironment;
import org.eclipse.osgi.util.NLS;


public class AnnotatedDefinitionValidator extends AbstractValidator implements EValidator {
	
	public AnnotatedDefinitionValidator() {		
	}
	
	public ValueSpecDef getDefinition(EObject eObject, DiagnosticChain diagnostics, Map context) {
		EClass eClass = (eObject instanceof EClass) ? (EClass) eObject : eObject.eClass();
		return getDefinition(eClass, eObject, diagnostics, null, context);
	}
	
	public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics, Map context) {
		return true;
	}
	
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map context) {
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	/**
	 * @see EObjectValidator#validate(org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.EObject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */	
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map context) {
		if(eObject.eClass().getEPackage() == EcorePackage.eINSTANCE) {
			if(eObject instanceof EModelElement) {
				return validateMetaModel((EModelElement)eObject, diagnostics, context);
			}
		} else {
			return validateModel(eObject, diagnostics, context);
		}
		return true;
	}
	
	
	protected boolean validateModel(EObject eObject, DiagnosticChain diagnostics, Map context) {
			
		ValueSpecDef def = getDefinition(eObject, diagnostics, context);
		if(def == null) {
			return true;
		} else if(!def.isOK()) {
			return false;
		}

		String lang = def.createLanguage(eObject);
		if(!Annotations.Meta.OCL_KEY.equals(lang)) {
			// add support for other languages here
			return true;
		}
		
		EObject[] contexEClassEvalCtx = new EObject[1];
		ContextData contextData = getContextBinding(eObject, contexEClassEvalCtx, context);
		if(contextData == null) {
			diagnostics.add(new BasicDiagnostic(
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 
				StatusCodes.NO_VALUESPEC_CONTEXT_AVAILABLE, 
				NLS.bind(Messages.def_NoContextAvailable, getLabelProvider(context).getObjectLabel(eObject)),
				new Object[] { eObject }));			
			return false;			
		}
		
		EClassifier contextClass = contextData.contextClass.getContextClassifier(contexEClassEvalCtx[0]);
		if(contextClass == null) {
			String noCtxMessage = contextData.contextClass.getStatus().isOK() ?
				NLS.bind(Messages.def_NoContextAvailable, getLabelProvider(context).getObjectLabel(eObject))
				: contextData.contextClass.getStatus().getMessage();
			
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 
				StatusCodes.NO_VALUESPEC_CONTEXT_AVAILABLE,
				noCtxMessage, new Object[] { eObject } ));
		}

		String body = def.createBody(eObject);
		if(body != null && contextClass != null) {
			// get real environment
			IParseEnvironment env = null;
			if(contextData.environment != null) {
				env = EnvironmentProvider.createParseEnv();
				env.setImportRegistry(ExternModelImport.getPackageRegistry(context));
				for (Iterator it = contextData.environment.keySet().iterator(); it.hasNext();) {
					String varName = (String) it.next();
					TypeProvider typeProvider = (TypeProvider)contextData.environment.get(varName);
					EClassifier type = typeProvider.getType(contexEClassEvalCtx[0]);
					if(type != null) {
						// TODO - produce error status as no variable type is available
						env.setVariable(varName, type);
					}
				}
			}
			
			IModelExpression expression = getExpression(Meta.OCL_KEY, body, contextClass, env, context);
			if(!expression.getStatus().isOK()) {
				String message = MessageFormat.format(
						Messages.invalidExpressionBody, 
						new Object[] { expression.getBody(), 
						expression.getStatus().getMessage() });				
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 
					StatusCodes.INVALID_CONSTRAINT_EXPRESSION, 
					message, new Object[] { eObject }));				
				return false;
			}
			
			EObject typeResolutionContext = eObject;
			// check type restriction on the given expression
			TypeProvider typeProvider = def.getTypeRestriction();
			if(typeProvider == null && eObject.eContainingFeature() != null) {
				EStructuralFeature containingFeature = eObject.eContainingFeature();
				typeProvider = getTypeInfo(containingFeature, eObject.eContainer().eClass(), diagnostics, context);
				typeResolutionContext = eObject.eContainer();
			}
			if(typeProvider != null && typeProvider.getStatus().isOK() && expression.getResultType() != null) {
				IStatus typeConformanceStatus = getTypeConformancyStatus(typeResolutionContext, typeProvider, expression);				
				if(!typeConformanceStatus.isOK()) {
					diagnostics.add(DefUtils.statusToDiagnostic(typeConformanceStatus, DIAGNOSTIC_SOURCE, eObject));
					return false;
				}
			}
		}
		
		return true;
	}
	
	public ContextData getContextBinding(EObject eObject, EObject[] contextHolder, Map context) {
		EStructuralFeature feature = eObject.eContainingFeature();
		if(feature != null) {
			EObject container = eObject.eContainer();
			ContextData contextData = getCachedCtxBinding(feature, context);
			if(contextData != null) {
				contextHolder[0] = container;
				return contextData;
			}
			
			ContextProvider contextProvider = getContextClass(feature, context);
			if(contextProvider != null) {
				ContextData newContextData = new ContextData(contextProvider, getEnvProvider(feature, context));
				registerCtxBinding(feature, newContextData, context);				
				contextHolder[0] = container;

				if(Trace.shouldTrace(DebugOptions.META_DEFINITIONS)) {
					String msgPtn = "[context-def] {0} binding: {1}::{2}"; //$NON-NLS-1$
					Trace.trace(MessageFormat.format(msgPtn, 
						new Object[] { 
							newContextData.contextClass.toString(), 
							LabelProvider.INSTANCE.getObjectLabel(container.eClass()),
							LabelProvider.INSTANCE.getObjectLabel(feature)
						}));
				}
				
				return newContextData;
			} 
			else if(eObject.eContainer() != null) {
				return getContextBinding(eObject.eContainer(), contextHolder, context);
			}
		}
		contextHolder[0] = null;
		return null;
	}
		
	protected boolean validateMetaModel(EModelElement modelElement, DiagnosticChain diagnostics, Map context) {
		EAnnotation annotation = (modelElement instanceof EAnnotation) ? (EAnnotation)modelElement : null;		
		if(annotation != null) {
			if(!Annotations.CONSTRAINTS_META_URI.equals(annotation.getSource())) {
				return true;
			} 
			modelElement = annotation.getEModelElement();
			if(modelElement == null) {
				return true;
			}
		}
		
		if(modelElement instanceof EStructuralFeature && annotation != null && 
				Meta.CONTEXT.equals(annotation.getDetails().get(Meta.DEF_KEY))) {			
			EStructuralFeature sfeature = (EStructuralFeature)modelElement;
			
			ContextProvider contextProvider = getContextClass(sfeature, context);
			if(contextProvider != null) {
				// check extended context environment
				getEnvProvider(sfeature, context);
				if(!contextProvider.getStatus().isOK()) {
					DefUtils.mergeAndFlatten(contextProvider.getStatus(),
							DIAGNOSTIC_SOURCE, annotation, diagnostics);
					return false;
				}
			}
		} else if(modelElement instanceof EClass) {
			getDefinition((EClass)modelElement, modelElement, diagnostics, null, context);
		}
		
		return true;
	}	
	
	public static ContextProvider getContextClass(EStructuralFeature bindFeature, final Map validationContext) {
		IModelExpressionProvider oclExprProvider = new IModelExpressionProvider() {
			public IModelExpression createExpression(String body, EClassifier contextClassifier) {
				return getExpression(Annotations.Meta.OCL_KEY, body, contextClassifier, validationContext);
			}
			public IModelExpression createExpression(String body, EClassifier context, IParseEnvironment extEnv) {
				// no custom env supported here, use ordinary createExpression
				return createExpression(body, context);				
			}
		};
		EClass resolutionContext = bindFeature.getEContainingClass();
		return DefUtils.getContextClass(resolutionContext, oclExprProvider, bindFeature, 
					ExternModelImport.getPackageRegistry(validationContext));
	}
	
	private ContextProvider createContextProvider(String ctxExpression, EClass contextClass, Map context) {
		return new ExpressionContextProvider(getExpression(Meta.OCL_KEY, ctxExpression, contextClass, context));
	}
	
	public ValueSpecDef getDefinition(EClass metaClass, EObject modelElement, DiagnosticChain diagnostics, DefData data, Map context) {
		ValueSpecDef definition = findDefinition(metaClass, context);
		if(definition != null) {
			return definition;
		}

		if(data == null) {		
			for (Iterator it = metaClass.getEAnnotations().iterator(); it.hasNext();) {
				EAnnotation nextAnnotation = (EAnnotation) it.next();
				if(Annotations.CONSTRAINTS_META_URI.equals(nextAnnotation.getSource())) {
					String val = (String)nextAnnotation.getDetails().get(Meta.DEF_KEY);
					if(val != null && (val.equals(Meta.VALUESPEC) || 
							val.equals(Meta.CONSTRAINT))) {
						data = new DefData();
						data.metaKey = val;	
						data.defClass = metaClass;
						break;						
					}
				} 
			}
		}				
		
		EList superTypes = metaClass.getESuperTypes();		
		if(data == null && superTypes.isEmpty()) {
			return null;
		}
		
		if(data != null) {
			for (Iterator it = metaClass.getEStructuralFeatures().iterator(); it.hasNext();) {
				EStructuralFeature nextAttr = (EStructuralFeature) it.next();

				for (Iterator annotationIt = nextAttr.getEAnnotations().iterator(); annotationIt.hasNext();) {
					EAnnotation annotation = (EAnnotation)annotationIt.next();
					if(!Annotations.CONSTRAINTS_META_URI.equals(annotation.getSource())) {
						continue;
					}
					String metaValue = (String)annotation.getDetails().get(Meta.DEF_KEY);				
					if(data.body == null) {				
						if(Meta.BODY.equals(metaValue)) {						
							data.body = new DefUtils.FeatureValProvider(nextAttr);
							checkAndReportProblems(data.body, annotation, diagnostics);
						}
					}
					
					if(data.lang == null) {				
						if(Meta.LANG.equals(metaValue)) {
							data.lang = new DefUtils.FeatureValProvider(nextAttr);
							checkAndReportProblems(data.lang, annotation, diagnostics);			
						}
					}
					
					if(data.context == null) {
						if(Meta.CONTEXT.equals(metaValue)) {
							String ctxExpression = (String)annotation.getDetails().get(Meta.OCL_KEY);
							if(ctxExpression != null) {
								data.context = createContextProvider(ctxExpression, metaClass, null);
							}
							checkAndReportProblems(data.context, annotation, diagnostics);
						}
					}
					
					if(data.type == null) {
						if(Meta.TYPE.equals(metaValue)) {
							String typeExpr = (String)annotation.getDetails().get(Meta.OCL_KEY);  						
							if(typeExpr != null) {
								data.type = new ExpresssionTypeProvider(getExpression(Meta.OCL_KEY, typeExpr, metaClass, context));					
							} else {
								data.type = new TypedElementProvider(nextAttr);
							}
							checkAndReportProblems(data.type, annotation, diagnostics);
						}
					}
				} // end of EAttribute annotations iteration
			}
		
			if(data.type == null) {
				data.type = getTypeInfo(metaClass, metaClass, diagnostics, context);
/*				EAnnotation typeAnnotation = DefUtils.getAnnotationWithKey(metaClass, Annotations.CONSTRAINTS_META_URI, Annotations.Meta.OCL_KEY);				
				if(typeAnnotation != null && Meta.TYPE.equals(typeAnnotation.getDetails().get(Meta.DEF_KEY))) {
					String typeExpr = (String)typeAnnotation.getDetails().get(Meta.OCL_KEY);
					if(typeExpr != null) {
						data.type = new ExpresssionTypeProvider(getExpression(Meta.OCL_KEY, typeExpr, metaClass, context));
						checkAndReportProblems(data.type, typeAnnotation, diagnostics);
					}
				}*/
			}
	
			if(data.body != null) {
				definition = createDefinition(data);
				assert data.defClass != null;						
				registerDefinition(data.defClass, definition, context);
				return definition;
			}
		}
				
		for (Iterator it = superTypes.iterator(); it.hasNext();) {
			EClass superClass = (EClass) it.next();
			ValueSpecDef inheritedDef = getDefinition(superClass, modelElement, diagnostics, data, context);
			if(inheritedDef != null) {
				if(data == null) {
					data = new DefData();
				}
				inheritDefinition(data, metaClass, inheritedDef);				
				registerDefinition(data.defClass, createDefinition(data), context);				
				return inheritedDef;
			}
		}
		
		if(data != null) {
			if(data.body == null) {
				data.body = createMissingBodyProvider(LabelProvider.INSTANCE.getObjectLabel(modelElement));
				// report missing body
				checkAndReportProblems(data.body, modelElement, diagnostics);
				return createDefinition(data);
			}
		}
		return null;
	}
	
	private static TypeProvider getTypeInfo(EModelElement typeAnnotationSource, EClass resolutionContext, DiagnosticChain diagnostics, Map validationContext) {
		TypeProvider typeProvider = null;		
		List annotations = DefUtils.getAnnotationsWithKeyAndValue(typeAnnotationSource, Annotations.CONSTRAINTS_META_URI, Annotations.Meta.DEF_KEY, Annotations.Meta.TYPE);
		
		EAnnotation typeAnnotation = annotations.isEmpty() ? null : (EAnnotation)annotations.get(0);		
		
		if(typeAnnotation != null && Meta.TYPE.equals(typeAnnotation.getDetails().get(Meta.DEF_KEY))) {
			String typeExprBody = (String)typeAnnotation.getDetails().get(Meta.OCL_KEY);
			if(typeExprBody != null) {
				IModelExpression typeExpr = getExpression(Meta.OCL_KEY, typeExprBody, resolutionContext, validationContext);					
				boolean usesTypeName = typeExpr.getStatus().isOK() && String.class.equals(typeExpr.getResultType().getInstanceClass());
				typeProvider = (usesTypeName) ? (TypeProvider) 
						new ContextTypeAdapter(new LookupByNameContextProvider(
								typeExpr, ExternModelImport.getPackageRegistry(validationContext))) : 
						new ExpresssionTypeProvider(typeExpr);
				checkAndReportProblems(typeProvider, typeAnnotation, diagnostics);
			}
		}
		return typeProvider;
	}
	
	private static void inheritDefinition(DefData data, EClass valueSpecEClass, ValueSpecDef superDef) {
		data.defClass = valueSpecEClass;
		if(data.body == null) {
			data.body = superDef.getBody();
		}
		if(data.lang == null) {
			data.lang = superDef.getLang();
		}
		if(data.type == null) {
			data.type = superDef.getTypeRestriction();
		}		
	}
	
	private ValueSpecDef createDefinition(DefData data) {
		assert data != null;
		assert data.body != null;
		ValueSpecDef valueSpecDef = Meta.CONSTRAINT.equals(data.metaKey) ? 
			new ConstraintDef(data.body, data.lang) :
			new ValueSpecDef(data.body, data.lang, data.type);

		if(Trace.shouldTrace(DebugOptions.META_DEFINITIONS)) {
			String msgPtn = "[{0}] {1} type: {2}"; //$NON-NLS-1$
			Trace.trace( MessageFormat.format(msgPtn, new Object[] { data.metaKey, data.defClass.getName(), data.type }));
		}
		return valueSpecDef;
	}
	
	private static boolean checkAndReportProblems(IDefElementProvider defElementProvider, EObject destination, DiagnosticChain diagnostics) {
		if(!defElementProvider.getStatus().isOK()) {
			diagnostics.add(DefUtils.statusToDiagnostic(defElementProvider.getStatus(), DIAGNOSTIC_SOURCE, destination));
			return false;
		}
		return true;
	}

	private static ValueSpecDef findDefinition(EClass eClass, Map context) {
		if(context != null) {
			Map defMap = (Map)context.get(ValueSpecDef.class);
			return (defMap != null) ? (ValueSpecDef)defMap.get(eClass) : null;
		}
		return null;
	}	
	
	private static ContextData getCachedCtxBinding(EModelElement modelElement, Map context) {
		if(context != null) {
			Map bindMap = (Map)context.get(ContextProvider.class);
			if(bindMap != null) {
				return (ContextData)bindMap.get(modelElement);				
			}
		}
		if(Trace.shouldTrace(DebugOptions.DEBUG)) {
			Trace.trace("Performance warning: Validation should run in a context for caching"); //$NON-NLS-1$
		}		
		return null;
	}
	
	private static Map getEnvProvider(EStructuralFeature contextBindFeature, Map context) {
		List varDefs = DefUtils.getAnnotationsWithKeyAndValue( 
				contextBindFeature, Annotations.CONSTRAINTS_META_URI, 
				Annotations.Meta.DEF_KEY, Annotations.Meta.VARIABLE);
		if(varDefs.isEmpty()) {
			return null;
		}
		
		Map env = null;
		for (Iterator it = varDefs.iterator(); it.hasNext();) {
			EAnnotation nextVarAnnotation = (EAnnotation) it.next();
			
			TypeProvider type = null;
			String typePrefix = Annotations.Meta.TYPE + "."; //$NON-NLS-1$
			Map.Entry typeExpression = DefUtils.getKeyPreffixAnnotation(nextVarAnnotation, typePrefix);
			if(typeExpression != null) {
				String body = (String)typeExpression.getValue();
				if(body == null) {
					// TODO - report missing var type status
				} else {
					IModelExpression expression = getExpression(Meta.OCL_KEY, body, contextBindFeature.getEContainingClass(), context);
					type = new DefUtils.ExpresssionTypeProvider(expression);
				}						
			} else {
				// TODO - report missing var type status
			}
			
			String name = (String)nextVarAnnotation.getDetails().get(Annotations.Meta.NAME);
			if(name == null) {
				//TODO - report missing var name status
				continue;
			}
			if(env == null) {
				env = new HashMap();
			}
			env.put(name, type);
		}
		return env;
	}
	
	private static void registerCtxBinding(EStructuralFeature contextDefOwner, ContextData contextData, Map context) {
		if(context != null) {			
			Map bindMap = (Map)context.get(ContextProvider.class);
			if(bindMap == null) {
				bindMap = new HashMap();
				context.put(ContextProvider.class, bindMap);
			}
			bindMap.put(contextDefOwner, contextData);
		}
	}		
	
	private static void registerDefinition(EClass eClass, ValueSpecDef definition, Map context) {
		assert definition != null;
		assert eClass != null;
		
		if(context != null) {
			Map defMap = (Map)context.get(ValueSpecDef.class);
			if(defMap == null) {
				defMap = new HashMap();
				context.put(ValueSpecDef.class, defMap);
			}
			defMap.put(eClass, definition);
		}
	}
	
	private static class DefData {
		String metaKey;
		EClass defClass;
		StringValProvider body;
		StringValProvider lang;
		TypeProvider type;
		ContextProvider context;
		public DefData() {}		
	}
	
	private static class ContextData {		
		final ContextProvider contextClass;
		final Map environment;
		public ContextData(ContextProvider contextProvider, Map environment) {	
			this.contextClass = contextProvider;
			this.environment = environment;
		}				
	}
		
	private static StringValProvider createMissingBodyProvider(final String elementLabel) {
		return new StringValProvider() {
			public IStatus getStatus() {
				String message = MessageFormat.format(
						Messages.def_MissingBodyAnnotation, 
						new Object[] { elementLabel }); 
				return GMFValidationPlugin.createStatus(IStatus.ERROR, 
						StatusCodes.MISSING_VALUESPEC_BODY_ANNOTATION, message, null);
			}
			public String getValue(EObject contextInstance) {			
				return null;
			}
		};
	}
		
	private static IStatus getTypeConformancyStatus(EObject typeProviderContext, TypeProvider leftType, IModelExpression expression) {
		assert leftType != null && leftType.getStatus().isOK();
		if(leftType.hasTypedElement()) {
			ETypedElement typedElement = leftType.getTypedElement(typeProviderContext);
			if(typedElement == null) {
				return GMFValidationPlugin.createStatus(IStatus.WARNING, 
						StatusCodes.VALUESPEC_TYPE_NOT_AVAILABLE, 
						Messages.def_NoTypeAvailable, null);				 
			}
			if(!expression.isAssignableToElement(typedElement)) {				
				return DefUtils.getIncompatibleTypesStatus(typedElement.getEType(), expression.getResultType());
			}
		} else {
			EClassifier type = leftType.getType(typeProviderContext);
			if(type == null) {
				return GMFValidationPlugin.createStatus(IStatus.WARNING, 
						StatusCodes.VALUESPEC_TYPE_NOT_AVAILABLE,
						Messages.def_NoTypeAvailable, null); 
			} 

			if(!expression.isAssignableTo(type)) {
				return DefUtils.getIncompatibleTypesStatus(type, expression.getResultType());			
			}
		}
		return Status.OK_STATUS;		
	}	
}