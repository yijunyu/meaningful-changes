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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ocl.parser.EcoreEnvironment;
import org.eclipse.gmf.internal.validate.IDefElementProvider.ContextProvider;
import org.eclipse.gmf.internal.validate.IDefElementProvider.StringValProvider;
import org.eclipse.gmf.internal.validate.IDefElementProvider.TypeProvider;
import org.eclipse.gmf.internal.validate.expressions.IModelExpression;
import org.eclipse.gmf.internal.validate.expressions.IModelExpressionProvider;
import org.eclipse.osgi.util.NLS;

public class DefUtils {
	
	/**
	 * Prevent from instantation 
	 */
	private DefUtils() {		
	}
	
	public static class FeatureValProvider extends AbstractProvider implements StringValProvider {
		private EStructuralFeature feature;
		
		public FeatureValProvider(EStructuralFeature feature) {
			if(feature == null) {
				throw new IllegalArgumentException("null feature passed"); //$NON-NLS-1$
			}
			this.feature = feature;
			setStatus(validateFeature(feature));			
		}
		
		public String getValue(EObject contextInstance) {
			if(!feature.getEContainingClass().isSuperTypeOf(contextInstance.eClass())) {
				throw new IllegalArgumentException("Invalid context instance"); //$NON-NLS-1$
			}
			if(!getStatus().isOK()) {
				return null;
			}
			Object value = contextInstance.eGet(feature);
			assert value == null || value instanceof String;
			return (String)contextInstance.eGet(feature);
		}
		
		public String toString() {
			StringBuffer buf = new StringBuffer();
			buf.append("lang: ") //$NON-NLS-1$
				.append(feature.getEContainingClass().getName()) 
				.append("::").append(feature.getName()); //$NON-NLS-1$			
			return buf.toString();
		}
		
		private static IStatus validateFeature(EStructuralFeature feature) {
			if(feature.getEType() == EcorePackage.eINSTANCE.getEString()) {
				return Status.OK_STATUS;
			}
			String requiredType = LabelProvider.INSTANCE.getObjectLabel(
					EcorePackage.eINSTANCE.getEString());
			String foundType = LabelProvider.INSTANCE.getObjectLabel(feature.getEType());
			String message = MessageFormat.format(
					Messages.incompatibleTypes, 
					new Object[] { requiredType, foundType });
			return GMFValidationPlugin.createStatus(IStatus.ERROR, 
					StatusCodes.INVALID_EXPRESSION_TYPE, message, null);
		}		
	}
	
	
	private abstract static class AbstractProvider implements IDefElementProvider {
		private IStatus status = Status.OK_STATUS;
		
		AbstractProvider() {}
		
		protected void setStatus(IStatus status) {
			if(status == null) {
				throw new IllegalArgumentException("Null status"); //$NON-NLS-1$
			}
			this.status = status;
		}
		public IStatus getStatus() {
			return status;
		}
	}
	

	private static class ExpressionBasedProvider extends AbstractProvider implements IDefElementProvider {
		private IModelExpression expression;
		private EClassifier requiredType;
	
		protected ExpressionBasedProvider(IModelExpression expression, EClassifier requiredType) {
			this.expression = expression;
			this.requiredType = requiredType;
			if(!expression.getStatus().isOK()) {
				setStatus(expression.getStatus());				
			} else {
				EClassifier queryResultType = expression.getResultType();
				assert queryResultType != null : "Expression must have type"; //$NON-NLS-1$
				assert requiredType != null : "Required type must be defined"; //$NON-NLS-1$
				if(!checkTypeAssignmentCompatibility(requiredType, queryResultType)) {
					setStatus(getIncompatibleTypesStatus(requiredType, queryResultType));
				}
			}
		}
		
		protected IModelExpression getExpression() {
			return expression;
		}
		
		protected EClassifier getRequiredType() {
			return requiredType;
		}
		
		public Object evaluate(EObject resolutionContext) {
			return expression.evaluate(resolutionContext);
		}
		
		public String toString() {
			return expression.toString();
		}
	}

	public static class LookupByNameContextProvider extends ExpressionBasedProvider implements ContextProvider {
		private Map contextCache = new HashMap(5);
		private EPackage.Registry registry;		
		
		public LookupByNameContextProvider(IModelExpression expression, EPackage.Registry registry) {
			super(expression, EcorePackage.eINSTANCE.getEString());
			this.registry = (registry != null) ? registry : EPackage.Registry.INSTANCE; 
		}
		
		public EClassifier getContextClassifier(EObject resolutionContext) {
			if(getStatus().isOK()) {
				Object typeNameObj = evaluate(resolutionContext);
				if(typeNameObj instanceof String) {
					if(contextCache.containsKey(typeNameObj)) {
						return (EClassifier)contextCache.get(typeNameObj);
					}
					String[] typeName = ((String)typeNameObj).split("::"); //$NON-NLS-1$
					List nameSeq = new ArrayList(Arrays.asList(typeName));
					if(typeName.length > 1) {
						nameSeq.remove(typeName.length - 1);
						EPackage ePackage = EcoreEnvironment.findPackage(nameSeq, registry);
						if(ePackage != null) {
							EClassifier contextClassifier = ePackage.getEClassifier(typeName[typeName.length - 1]);
							contextCache.put(typeNameObj, contextClassifier);
							return contextClassifier;
						}
					}
				}
			}
			return null;
		}
	}
	
	
	
	public static class GenClassifierContextAdapter extends ExpressionBasedProvider implements ContextProvider {

		public static boolean isGenClassifier(EClassifier eClassifier) {
			if(eClassifier.getEPackage() == null ||
				!GenModelPackage.eNS_URI.equals(eClassifier.getEPackage().getNsURI())) {				
				return false;
			}
			return GenModelPackage.eINSTANCE.getGenClass().getName().equals(eClassifier.getName()) ||
					GenModelPackage.eINSTANCE.getGenClassifier().getName().equals(eClassifier.getName());			
		}
		
		public GenClassifierContextAdapter(IModelExpression expression) {
			super(expression, expression.getResultType());
			if(!isGenClassifier(expression.getResultType())) {
				getIncompatibleTypesStatus(GenModelPackage.eINSTANCE
						.getGenClassifier(), expression.getResultType());			
			}
		}
		
		public EClassifier getContextClassifier(EObject resolutionContext) {	
			if(!getStatus().isOK()) {
				return null;
			}
			GenClassifier genClassifier = (GenClassifier)super.evaluate(resolutionContext);
			return genClassifier != null ? genClassifier.getEcoreClassifier() : null;
		}		
	}	

	
	public static class ExpressionContextProvider extends ExpressionBasedProvider implements ContextProvider {

		public ExpressionContextProvider(IModelExpression expression) {
			super(expression, EcorePackage.eINSTANCE.getEClassifier());			
		}
		
		public EClassifier getContextClassifier(EObject resolutionContext) {			
			return getStatus().isOK() ? (EClassifier)super.evaluate(resolutionContext) : null;
		}		
	}
	
		
	public static class ReferencedContextProvider extends AbstractProvider implements ContextProvider {
		private EReference contextRef;
		private Map/*<EClass, ContextProvider>*/ referencedContexts = Collections.EMPTY_MAP;		
		
		public ReferencedContextProvider(EClass context, String referenceName, IModelExpressionProvider oclExprProvider, EPackage.Registry registry) {
			if(context == null) {
				throw new IllegalArgumentException("null context EClass"); //$NON-NLS-1$
			}
			if(referenceName != null) {
				EStructuralFeature eFeature = context.getEStructuralFeature(referenceName);   
				if(eFeature instanceof EReference) {
					this.contextRef = (EReference) eFeature;					
				} else {
					String message = NLS.bind(Messages.def_NoEReferenceFoundByName, 
							referenceName, LabelProvider.INSTANCE.getObjectLabel(context));
					setStatus(GMFValidationPlugin.createStatus(IStatus.ERROR, -1, message, null));
				}
			} else {
				String message = Messages.def_NoEReferenceInCtxBinding;
				setStatus(GMFValidationPlugin.createStatus(IStatus.ERROR, -1, message, null));				
			}
			
			if(contextRef != null) {
				EClass referencedClass = contextRef.getEReferenceType();
				List subTypes  = getSubTypes(getRootEPackage(referencedClass.getEPackage()), referencedClass, new ArrayList());
				
				referencedContexts = new HashMap(5);				
				for (Iterator it = subTypes.iterator(); it.hasNext();) {
					EClass nextClass = (EClass) it.next();
					ContextProvider referencedContext = DefUtils.getContextClass(nextClass, oclExprProvider, null, registry);
					if(referencedContext != null) {
						referencedContexts.put(nextClass, referencedContext);
						it.remove();
					}
				}
				// perform coverage check
				List statuses = Collections.EMPTY_LIST;
				for (Iterator it = subTypes.iterator(); it.hasNext();) {
					EClass nextClass = (EClass) it.next();
					
					if(getProvider(nextClass) == null && !(nextClass.isInterface() || nextClass.isAbstract())) {
						String message = NLS.bind(Messages.def_NoCtxInProviderForCtxBinding, 
								LabelProvider.INSTANCE.getObjectLabel(nextClass),
								LabelProvider.INSTANCE.getFeatureLabel(contextRef));
						if(statuses.isEmpty()) {
							statuses = new ArrayList();
						}
						statuses.add(GMFValidationPlugin.createStatus(IStatus.ERROR, -1, message, null));
					}
				}
				if(statuses.size() == 1) {
					setStatus((IStatus)statuses.get(0));					
				} else {
					setStatus(new MultiStatus(GMFValidationPlugin.getPluginId(), -1,
							(IStatus[])statuses.toArray(new IStatus[statuses.size()]),
							Messages.def_MissingCtxDefInReferencedCtxProviders, null));
				}
			}
		}
				
		public EClassifier getContextClassifier(EObject resolutionContext) {
			if(getStatus().isOK()) {
				if(!contextRef.getEContainingClass().isSuperTypeOf(resolutionContext.eClass())) {
					throw new IllegalArgumentException("Requires instance of :" + contextRef.getEContainingClass()); //$NON-NLS-1$
				}
				assert resolutionContext.eClass().getEStructuralFeature(contextRef.getName()) != null;
				
				Object referencedEntity = resolutionContext.eGet(contextRef);
				if(referencedEntity instanceof EObject) {
					EObject eObject = (EObject)referencedEntity;	
					ContextProvider provider = getProvider(eObject.eClass());
					return (provider != null && provider.getStatus().isOK()) ? 
							provider.getContextClassifier(eObject) : null;
				}				
			}
			return null;
		}		
		
		private ContextProvider getProvider(EClass contextProviderEClass) {
			ContextProvider provider = (ContextProvider)referencedContexts.get(contextProviderEClass);
			if(provider == null) {
				for(Iterator it = contextProviderEClass.getESuperTypes().iterator(); it.hasNext();) {
					ContextProvider nextProvider = (ContextProvider)referencedContexts.get(it.next());
					if(nextProvider != null) {
						return nextProvider;
					}
				}
			}
			return provider;
		}
	}	

	public static class ExpresssionTypeProvider extends ExpressionBasedProvider implements TypeProvider {
		
		public ExpresssionTypeProvider(IModelExpression expression) {
			super(expression, getRequiredResultType(expression));
		}
		
		public boolean hasTypedElement() {
			if(getStatus().isOK()) {
				EClassifier requiredType = getCanonicalEClassifier(getRequiredType());			
				return requiredType instanceof EClass && 
					EcorePackage.eINSTANCE.getETypedElement().isSuperTypeOf((EClass)requiredType);
			}
			return false;
		}
		
		public EClassifier getType(EObject context) {
			if(!getStatus().isOK()) {
				return null;
			}			
			Object val = evaluate(context);
			if(val instanceof ETypedElement) {
				return ((ETypedElement)val).getEType();
			} else if(val instanceof EClassifier) {
				return (EClassifier)val;
			}
			assert false;
			return null;
		}
		
		public ETypedElement getTypedElement(EObject context) {
			if(!getStatus().isOK()) {
				return null;
			}			
			Object val = evaluate(context);
			if(val instanceof ETypedElement) {
				return (ETypedElement)val;
			} 
			return null;
		}

		private static EClassifier getRequiredResultType(IModelExpression expression) {
			EClassifier type = expression.getResultType();
			if(type instanceof EClass) {
				if(DefUtils.isEcorePackageClassifier(type)) {
					EClassifier canonicalClassifier = DefUtils.getCanonicalEcorePackageClassifier(type);
					assert canonicalClassifier instanceof EClass;
					EClass canonicalClass = (EClass)canonicalClassifier;
					if(EcorePackage.eINSTANCE.getETypedElement().isSuperTypeOf(canonicalClass) ||
						EcorePackage.eINSTANCE.getEClassifier().isSuperTypeOf(canonicalClass)) {
						return type;					
					}
				}
			}
			return EcorePackage.eINSTANCE.getEClassifier();
		}
	}
	
	public static class TypedElementProvider extends AbstractProvider implements TypeProvider {
		private EStructuralFeature feature;
		
		public TypedElementProvider(EStructuralFeature feature) {
			this.feature = feature;
		}
		
		public boolean hasTypedElement() {
			return true;			
		}
		
		public EClassifier getType(EObject context) {
			return getTypedElement(context).getEType();
		}
		
		public ETypedElement getTypedElement(EObject context) {
			return (ETypedElement)context.eGet(feature);
		}
	}
	
	public static class ContextTypeAdapter extends AbstractProvider implements TypeProvider {
		private ContextProvider ctxProvider;
		
		public ContextTypeAdapter(ContextProvider contextProvider) {
			if(contextProvider == null) {
				throw new IllegalArgumentException("null contextProvider"); //$NON-NLS-1$
			}
			this.ctxProvider = contextProvider;
		}
		
		public EClassifier getType(EObject resolutionContext) {		
			return ctxProvider.getContextClassifier(resolutionContext);
		}
		
		public boolean hasTypedElement() {		
			return false;
		}
		
		public ETypedElement getTypedElement(EObject context) {
			return null;
		}
	}		
	
	public static Diagnostic statusToDiagnostic(IStatus status, String diagSource, Object destObj) {
		return statusToDiagnostic(status, diagSource, destObj, null);
	}
	
	public static DiagnosticChain mergeAndFlatten(Diagnostic diagnostic, DiagnosticChain diagnosticChain) {
		List children = diagnostic.getChildren();
		if(children == null || children.isEmpty()) {
			diagnosticChain.add(diagnostic);
		} else {
			for (Iterator it = children.iterator(); it.hasNext();) {
				mergeAndFlatten((Diagnostic) it.next(), diagnosticChain);
			}
		}
		return diagnosticChain;
	}
	
	public static DiagnosticChain mergeAndFlatten(IStatus status, String diagSource, Object destObj, DiagnosticChain diagnosticChain) {
		Diagnostic diagnostic = statusToDiagnostic(status, diagSource, destObj);
		return mergeAndFlatten(diagnostic, diagnosticChain);
	}
	
	
	public static Diagnostic statusToDiagnostic(IStatus status, String diagSource, Object destObj, String prefixMessage) {
		int severity = IStatus.INFO;
		switch (status.getSeverity()) {
		case IStatus.ERROR:
			severity = Diagnostic.ERROR;
			break;
		case IStatus.WARNING:
			severity = Diagnostic.WARNING;
			break;
		case IStatus.INFO:
			severity = Diagnostic.INFO;
			break;					
		case IStatus.OK:
			severity = Diagnostic.OK;
			break;			
		case IStatus.CANCEL:
			severity = Diagnostic.CANCEL;
			break;
		}
		Object[] data = (destObj != null) ? new Object[] { destObj } : new Object[0];
		String message = (prefixMessage != null) ? prefixMessage + status.getMessage() : status.getMessage();

		BasicDiagnostic diagnostic = new BasicDiagnostic(severity, diagSource, status.getCode(), message, data);
		if(status.isMultiStatus()) {
			IStatus[] children = status.getChildren(); 
			for (int i = 0; i < children.length; i++) {
				diagnostic.add(statusToDiagnostic(children[i], diagSource, destObj, prefixMessage));
			}
		}
		return diagnostic;
	}

	
	public static boolean checkTypeAssignmentCompatibility(EClassifier leftClassifier, EClassifier rightClassifier) {
		EClassifier left = getCanonicalEClassifier(leftClassifier);		
		EClassifier right = getCanonicalEClassifier(rightClassifier);		
		if(left == right) {
			return true;
		}
		
		if(left instanceof EClass) { 
			if(right instanceof EClass &&
				((EClass)left).isSuperTypeOf(((EClass)right))) {
				return true;
			}
		} else {
			Class rightClass = right.getInstanceClass();
			Class leftClass = left.getInstanceClass();			
			if(leftClass != null && rightClass != null && leftClass.isAssignableFrom(rightClass)) {
				return true;
			} 
		}
		return false;
	}
	
	public static IStatus getIncompatibleTypesStatus(EClassifier leftClassifier, EClassifier rightClassifier) {
		String message = MessageFormat.format(
				Messages.incompatibleTypes, 
				new Object[] { 
					LabelProvider.INSTANCE.getObjectLabel(leftClassifier), 
					LabelProvider.INSTANCE.getObjectLabel(rightClassifier) } );
		
		return GMFValidationPlugin.createStatus(IStatus.ERROR, 
				StatusCodes.INVALID_EXPRESSION_TYPE, message, null);		
	}

	public static EClassifier emfToOclType(EClassifier type) {
		return EcoreEnvironment.getOCLType(type);
	}
	
	public static EAnnotation getAnnotationWithKey(EModelElement eModelElement, String sourceURI, String key) {
		for (Iterator it = eModelElement.getEAnnotations().iterator(); it.hasNext();) {
			EAnnotation nextAnnotation = (EAnnotation) it.next();
			if(sourceURI.equals(nextAnnotation.getSource()) && nextAnnotation.getDetails().containsKey(key)) {
				return nextAnnotation;
			}
		}
		return null;
	}
	
	public static Map.Entry findAnnotationDetailEntry(EModelElement eModelElement, String sourceURI, String key, String val) {
		for (Iterator it = eModelElement.getEAnnotations().iterator(); it.hasNext();) {
			EAnnotation nextAnnotation = (EAnnotation) it.next();
			if(sourceURI.equals(nextAnnotation.getSource()) && nextAnnotation.getDetails().containsKey(key)) {
				for (Iterator entryIt = nextAnnotation.getDetails().iterator(); entryIt.hasNext();) {
					Map.Entry nextEntry = (Map.Entry)entryIt.next();
					if(nextEntry.getValue() == val || nextEntry.getKey().equals(key)) {
						return nextEntry;
					}
				}
			}
		}
		return null;
	}
	
	
	public static Map.Entry getKeyPreffixAnnotation(EAnnotation annotation, String keyPrefix) {
		for (Iterator it = annotation.getDetails().entrySet().iterator(); it.hasNext();) {
			Map.Entry nextEntry = (Map.Entry)it.next();
			if(((String)nextEntry.getKey()).startsWith(keyPrefix)) {
				return nextEntry;
			}
		}
		return null;
	}	
	
	public static List getAnnotationsWithKeyAndValue(EModelElement eModelElement, String sourceURI, String key, String value) {
		List annotations = null;
		for (Iterator it = eModelElement.getEAnnotations().iterator(); it.hasNext();) {
			EAnnotation nextAnnotation = (EAnnotation) it.next();
			if(sourceURI.equals(nextAnnotation.getSource())) {
				Object detailVal = nextAnnotation.getDetails().get(key);
				if((value != null && value.equals(detailVal)) || value == detailVal) {
					if(annotations == null) {
						annotations = new ArrayList(eModelElement.getEAnnotations().size());
					}
					annotations.add(nextAnnotation);					
				}
			}
		}
		return annotations != null ? annotations : Collections.EMPTY_LIST;
	}	
	
	public static List getAnnotationValues(EModelElement eModelElement, String sourceURI, String key) {
		List annotations = null;
		for (Iterator it = eModelElement.getEAnnotations().iterator(); it.hasNext();) {
			EAnnotation nextAnnotation = (EAnnotation) it.next();
			if(sourceURI.equals(nextAnnotation.getSource())) {
				Object detailVal = nextAnnotation.getDetails().get(key);
				if((detailVal != null)) {
					if(annotations == null) {
						annotations = new ArrayList(eModelElement.getEAnnotations().size());
					}
					annotations.add(detailVal);					
				}
			}
		}
		return annotations != null ? annotations : Collections.EMPTY_LIST;
	}	

	public static boolean isEcorePackageClassifier(EClassifier classifier) {
		EPackage classifierPackage = classifier.getEPackage();
		return EcorePackage.eINSTANCE == classifierPackage || 
			(classifierPackage != null && EcorePackage.eINSTANCE.getNsURI().equals(classifierPackage.getNsURI()));
	}
	
	public static EClassifier getCanonicalEcorePackageClassifier(EClassifier classifier) {
		if(!isEcorePackageClassifier(classifier)) {
			return null;
		}
		return EcorePackage.eINSTANCE.getEClassifier(classifier.getName());
	}
	
	static EClassifier getCanonicalEClassifier(EClassifier classifier) {
		EClassifier eCoreCanonical = getCanonicalEcorePackageClassifier(classifier);		
		return (eCoreCanonical == null) ? classifier : eCoreCanonical;
	}
	
	/**
	 * @return String value associated with the given key in given detail map or
	 * <code>null</code> if not key is present in the value
	 */
	public static String getAnnotationDetailValue(EMap detail, String key) {
		if(detail == null || key == null) {
			throw new IllegalArgumentException("null detail map or key"); //$NON-NLS-1$
		}
		Object val = detail.get(key);
		return val instanceof String ? (String) val : null;
	}
	
	
	public static ContextProvider getContextClass(EClass resolutionContext, IModelExpressionProvider oclExprProvider, EStructuralFeature bindFeature, EPackage.Registry registry) {
		assert bindFeature == null || bindFeature.getEContainingClass().isSuperTypeOf(resolutionContext);

		EModelElement annotationTarget = (bindFeature != null) ? (EModelElement) bindFeature : resolutionContext;
		EAnnotation ctxAnnotation = annotationTarget.getEAnnotation(Annotations.CONSTRAINTS_META_URI);

		if (ctxAnnotation != null && Annotations.Meta.CONTEXT.equals(ctxAnnotation.getDetails().get(Annotations.Meta.DEF_KEY))) {
			for (Iterator it = ctxAnnotation.getDetails().entrySet().iterator(); it.hasNext();) {
				Map.Entry nextDetail = (Map.Entry) it.next();
				Object key = nextDetail.getKey();
				String value = nextDetail.getValue() instanceof String ? (String) nextDetail.getValue() : ""; //$NON-NLS-1$

				if (Annotations.Meta.OCL_KEY.equals(key)) {
					if (value != null) {
						IModelExpression contextEpression = oclExprProvider.createExpression(value, resolutionContext);
						EClassifier resultType = contextEpression.getResultType();
						if (String.class.equals(resultType.getInstanceClass())) {
							return new LookupByNameContextProvider(contextEpression, registry);
						} 
						else if(GenClassifierContextAdapter.isGenClassifier(resultType)) {							
							return new GenClassifierContextAdapter(contextEpression);
						}					
						
						// TODO - support in general EClassifier, GenClassifier, or String typeName
						// report problem for expressions with any other result type
						return new ExpressionContextProvider(contextEpression);
					}
				} else if (Annotations.Meta.REF.equals(key)) {
					return new ReferencedContextProvider(resolutionContext, value, oclExprProvider, registry);
				}
			}
		}

		// no context found
		return null;
	}
		
	/**
	 * @param ePackage
	 *            scope for searching the sub-types, including sub-packages
	 * @param superType
	 *            the type of which the sub-types are to be found
	 * @param foundSubTypes
	 *            placeholder for the collected sub-types
	 * @return passed <code>foundSubTypes</code> list for convenience
	 */
	static List getSubTypes(EPackage ePackage, EClass superType, List foundSubTypes) {
		for (Iterator it = ePackage.getEClassifiers().iterator(); it.hasNext();) {
			EClassifier classifier = (EClassifier) it.next();
			if(classifier instanceof EClass && (superType).isSuperTypeOf((EClass)classifier)) {
				foundSubTypes.add(classifier);
			}
		}
		for (Iterator it = ePackage.getESubpackages().iterator(); it.hasNext();) {
			getSubTypes((EPackage) it.next(), superType, foundSubTypes);			
		}
		return foundSubTypes;
	}
	
	static EPackage getRootEPackage(EPackage ePackage) {		
		EPackage root = ePackage;
		for (EPackage parent = ePackage; parent != null; parent = parent.getESuperPackage()) {
			root = parent;
		}
		return root;
	}
}