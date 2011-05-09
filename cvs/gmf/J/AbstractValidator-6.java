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
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.internal.validate.expressions.AbstractExpression;
import org.eclipse.gmf.internal.validate.expressions.EnvironmentProvider;
import org.eclipse.gmf.internal.validate.expressions.ExpressionProviderRegistry;
import org.eclipse.gmf.internal.validate.expressions.IEvaluationEnvironment;
import org.eclipse.gmf.internal.validate.expressions.IModelExpression;
import org.eclipse.gmf.internal.validate.expressions.IModelExpressionProvider;
import org.eclipse.gmf.internal.validate.expressions.IParseEnvironment;
import org.eclipse.gmf.validate.ValidationOptions;
import org.eclipse.osgi.util.NLS;


public class AbstractValidator implements EValidator {
	protected static final String DIAGNOSTIC_SOURCE = "org.eclipse.gmf.validation"; //$NON-NLS-1$	
	
	private static final Object ROOT_TARGET_OBJECT_KEY = new Object(); 	

	protected AbstractValidator() {
	}
	
	protected static ExpressionCache getExpressionCache(String language, Map<Object, Object> context) {
		return getExpressionCache(context).getCache(language);
	}
	
	protected static IModelExpression getExpression(String language, String body, EClassifier contextClassifier, Map<Object, Object> context) {
		EPackage.Registry reg = ExternModelImport.getPackageRegistry(context);
		IParseEnvironment env = null;
		if(reg != null) {
			env = EnvironmentProvider.createParseEnv();
			env.setImportRegistry(reg);
		}
		return getExpression(language, body, contextClassifier, env, context);
	}
	
	protected static IModelExpression getExpression(String language, String body, 
			EClassifier contextClassifier, IParseEnvironment env, Map<Object, Object> context) {
		ExpressionCache cache = getExpressionCache(language, context);
		if(cache == null) {
			// no provider for the given language found in registry
			return new NoProviderExpression(language, body, contextClassifier);
		} 
		
		// initializer EPackages cross-referenced from the validated model 
		// to be visible in EMFT ocl environment lookup 
		if(Annotations.OCL_KEY.equals(language) && body != null && body.indexOf("::") > 0) { //$NON-NLS-1$
			EObject validationTarget = getRootTargetObject(context);
			ExternModelImport importer = ExternModelImport.getImporter(context, validationTarget);				
			importer.intializeExternPackages(validationTarget);
		}

		return cache.getExpression(body, contextClassifier, env);
	}
	
	protected static SubstitutionLabelProvider getLabelProvider(Map<Object, Object> context) {
		if(context != null && context.containsKey(SubstitutionLabelProvider.class)) {
			Object provider = context.get(SubstitutionLabelProvider.class);
			assert provider instanceof SubstitutionLabelProvider : "Invalid label provider"; //$NON-NLS-1$ 
			return (SubstitutionLabelProvider)provider;
		}
		return LabelProvider.INSTANCE;
	}

	protected static EObject getRootTargetObject(Map<Object, Object> context) {
		Object rootObj = context.get(ROOT_TARGET_OBJECT_KEY);
		assert rootObj == null || rootObj instanceof EObject;
		return (EObject)rootObj;
	}
	
	private static void ensureRootTargetInitialized(EObject target, Map<Object, Object> context) {
		if(context != null && !context.containsKey(ROOT_TARGET_OBJECT_KEY)) {
			setRootTargetObject(target, context);
		}
	}
	
	@SuppressWarnings("unchecked")
	private static void setRootTargetObject(EObject targetObject, Map context) {
		assert !context.containsKey(ROOT_TARGET_OBJECT_KEY);
		context.put(ROOT_TARGET_OBJECT_KEY, EcoreUtil.getRootContainer(targetObject, true)); 		
	}
	
	@SuppressWarnings("unchecked")
	private static MultiProviderCache getExpressionCache(Map context) {
		if(context != null) {
			MultiProviderCache cache = (MultiProviderCache)context.get(MultiProviderCache.class);
			if(cache == null) {
				cache = new MultiProviderCache();
				context.put(MultiProviderCache.class, new MultiProviderCache());
			}
			return cache;
		}
		if(Trace.shouldTrace(DebugOptions.DEBUG)) {
			Trace.trace("Performance warning: Validation should run in a context for caching"); //$NON-NLS-1$
		}
		return new MultiProviderCache();
	}	
	
	/**
	 * @return Validation options for the given context. If not options is set to context,
	 * 	the {@link ValidationOptions#getDefault()} default options } are returned.
	 */
	static ValidationOptions getOptions(Map<Object, Object> context) {
		if(context != null) {
			ValidationOptions options = (ValidationOptions)context.get(ValidationOptions.class);
			return options != null ? options : ValidationOptions.getDefault();
		}
		return ValidationOptions.getDefault();
	}
		
	/**
	 * 
	 * @param options
	 * @param context
	 * @throws IllegalArgumentException
	 */
	@SuppressWarnings("unchecked")
	static void setOptions(ValidationOptions options, Map context) {
		if(context == null) {
			throw new IllegalArgumentException("Null validation options"); //$NON-NLS-1$
		}
		if(options.isUseGmfLabelSubtitution()) {
			context.put(SubstitutionLabelProvider.class, LabelProvider.INSTANCE);
		}
		context.put(ValidationOptions.class, options);
	}	
	
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		ensureRootTargetInitialized(eObject, context);
		return true;
	}

	public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {		
		return true;
	}

	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		ensureRootTargetInitialized(eObject, context);		
		return true;
	}
	
	
	private static class ProviderCache extends ExpressionCache {
		private IModelExpressionProvider expressionProvider;

		public ProviderCache(IModelExpressionProvider expressionProvider) {
			this.expressionProvider = expressionProvider;
		}

		protected IModelExpression createExpressionEntry(String body, EClassifier context, IParseEnvironment extEnv) {
			if (expressionProvider != null) {
				return expressionProvider.createExpression(body, context, extEnv);
			}
			return new NoProviderExpression("", body, context); //$NON-NLS-1$
		}
	}	
	
	
	private static class MultiProviderCache {
		private HashMap<String, ExpressionCache> lang2ProviderMap = new HashMap<String, ExpressionCache>();
		
		public MultiProviderCache() { 			
		}
		/**
		 * Gets expression cache for the given expression language.
		 * 
		 * @param language
		 *            identifier of the language supported by the provider to be
		 *            retrieved.
		 * @return expression cache for the given provider or <code>null</code>
		 *         in case the no provider is available for the specified
		 *         language.
		 */
		public ExpressionCache getCache(String language) {
			ExpressionCache cache = lang2ProviderMap.get(language);
			if (cache == null) {
				IModelExpressionProvider provider = ExpressionProviderRegistry.getInstance().getProvider(language);
				if (provider == null) {
					return null;
				}
				cache = new ProviderCache(provider);
				lang2ProviderMap.put(language, cache);
			}
			return cache;
		}
	}
	
	private static class NoProviderExpression extends AbstractExpression {
		private String lang;
		
		public NoProviderExpression(final String language, String body, EClassifier context) {
			super(body, context, null);
			this.lang = language;
			String message = NLS.bind(Messages.noExpressionProviderAvailable, language);
			IStatus status = new Status(IStatus.ERROR, GMFValidationPlugin.getPluginId(),
					StatusCodes.EXPRESSION_PROVIDER_NOT_AVAILABLE, message, null);			
			setStatus(status);
		}

		public boolean isAssignableToElement(ETypedElement typedElement) {
			return false;
		}

		public boolean isAssignableTo(EClassifier ecoreType) {
			return false;
		}
		
		public String getLanguage() {
			return lang;
		}

		protected Object doEvaluate(Object context) {
			return null;
		}

		protected Object doEvaluate(Object context, IEvaluationEnvironment extEnvironment) {
			return null;
		}
	}	
}