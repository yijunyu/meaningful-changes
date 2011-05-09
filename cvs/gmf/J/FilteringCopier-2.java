/*
 * Copyright (c) 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common.migrate;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

/**
 * Copies object tree, replacing elements with new instances from another metamodel, 
 * with option to ignore certain features.
 * Ignored features and their owners are recorded for later processing (usually,
 * model version migration)   
 * @author artem
 */
public class FilteringCopier extends EcoreUtil.Copier {
	private final HashMap<EStructuralFeature, List<EObject>> myIgnoredFeatures;

	private final EPackage ePack;

	private final EFactory eFact;

	/**
	 * @param metaPackage target metamodel, the one copies would get created with. 
	 */
	public FilteringCopier(EPackage metaPackage) {
		super(false);
		ePack = metaPackage;
		eFact = ePack.getEFactoryInstance();
		myIgnoredFeatures = new HashMap<EStructuralFeature, List<EObject>>();
	}

	/**
	 * @param eFeature property from <em>old/original</em> metamodel
	 */
	public void ignore(EStructuralFeature eFeature) {
		assert eFeature != null;
		assert !myIgnoredFeatures.containsKey(eFeature);
		myIgnoredFeatures.put(eFeature, new LinkedList<EObject>());
	}

	/**
	 * Handy alternative to copy()/copyReferences() sequence, similar to 
	 * {@link EcoreUtil#copy(EObject)}
	 */
	public EObject go(EObject original) {
		EObject result = copy(original);
		copyReferences();
		return result;
	}

	/**
	 * Access to collected objects that were found holding/referencing
	 * values of the feature passed.
	 * 
	 * @param eFeature one of the properties registered with 
	 * {@link #ignore(EStructuralFeature)} prior to {@link #go(EObject)}.
	 * @return unmodifiable collection of objects.
	 */
	public List<EObject> getIgnoredOwners(EStructuralFeature eFeature) {
		return Collections.unmodifiableList(myIgnoredFeatures.get(eFeature));
	}

	/**
	 * Copy-of method from superclass, with injected support for feature filtering
	 */
	@Override
	public EObject copy(EObject eObject) {
		EObject copyEObject = createCopy(eObject);
		put(eObject, copyEObject);
		EClass eClass = eObject.eClass();
		for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
			EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
			// [artem] >>>
			if (isIgnored(eStructuralFeature, eObject)) {
				handleIgnored(eStructuralFeature, eObject);
				continue;
			}
			// [artem] <<<
			if (eStructuralFeature.isChangeable() && !eStructuralFeature.isDerived()) {
				if (eStructuralFeature instanceof EAttribute) {
					copyAttribute((EAttribute) eStructuralFeature, eObject, copyEObject);
				} else {
					EReference eReference = (EReference) eStructuralFeature;
					if (eReference.isContainment()) {
						copyContainment(eReference, eObject, copyEObject);
					}
				}
			}
		}

		copyProxyURI(eObject, copyEObject);

		return copyEObject;
	}
	
	/**
	 * Copy-of method from superclass, with injected support to transform 
	 * attribute values (mostly enumerations)
	 */
	@Override
	protected void copyAttribute(EAttribute eAttribute, EObject eObject, EObject copyEObject) {
		if (eObject.eIsSet(eAttribute)) {
			if (FeatureMapUtil.isFeatureMap(eAttribute)) {
				FeatureMap featureMap = (FeatureMap) eObject.eGet(eAttribute);
				for (int i = 0, size = featureMap.size(); i < size; ++i) {
					EStructuralFeature feature = featureMap.getEStructuralFeature(i);
					if (feature instanceof EReference && ((EReference) feature).isContainment()) {
						Object value = featureMap.getValue(i);
						if (value != null) {
							copy((EObject) value);
						}
					}
				}
			} else if (eAttribute.isMany()) {
				List<?> source = (List<?>) eObject.eGet(eAttribute);
				@SuppressWarnings("unchecked")
				List<Object> target = (List<Object>) copyEObject.eGet(getTarget(eAttribute));
				if (source.isEmpty()) {
					target.clear();
				} else {
					// [artem] >>>
					if (needsTransform(eAttribute, eObject)) {
						for (Object o : source) {
							target.add(transformValue(eAttribute, o));
						}
					} else {
						// [artem] <<<
						target.addAll(source);
					}
				}
			} else {
				// [artem] >>>
				if (needsTransform(eAttribute, eObject)) {
					copyEObject.eSet(getTarget(eAttribute), transformValue(eAttribute, eObject.eGet(eAttribute)));
				} else {
					// [artem] <<<
					copyEObject.eSet(getTarget(eAttribute), eObject.eGet(eAttribute));
				}
			}
		}
	}

	/*
	 * Try to get similar class from supplied metamodel, to create
	 * a new instance of copied object from another metamodel. 
	 */
	@Override
	protected EClass getTarget(EClass eClass) {
		EClassifier c = ePack.getEClassifier(eClass.getName());
		if (c instanceof EClass) {
			return (EClass) c;
		}
		return super.getTarget(eClass);
	}

	@Override
	protected EStructuralFeature getTarget(EStructuralFeature structuralFeature) {
		EStructuralFeature sf = getTarget(structuralFeature.getEContainingClass()).getEStructuralFeature(structuralFeature.getName());
		if (sf != null) {
			return sf;
		}
		return super.getTarget(structuralFeature);
	}

	//
	// Custom additions
	// 

	/**
	 * Both references and attributes get here, former regardless of their 
	 * isContainment state, effectively allowing to perform custom handling
	 * of any subset of element data. Features that are ignored are instantly 
	 * handed to {@link #handleIgnored(EStructuralFeature, EObject)} and no 
	 * further processing is done for them by copier.
	 * 
	 * @return true to indicate feature should not be processed for copy. 
	 */
	protected boolean isIgnored(EStructuralFeature eFeature, EObject original) {
		return myIgnoredFeatures.containsKey(eFeature);
	}

	protected void handleIgnored(EStructuralFeature eFeature, EObject original) {
		myIgnoredFeatures.get(eFeature).add(original);
	}

	/**
	 * @return true to indicate attribute values need special care
	 */
	protected boolean needsTransform(EAttribute eAttr, EObject original) {
		return eAttr.getEType() instanceof EEnum;
	}

	/**
	 * Produces attribute value that complies with new model. Mostly needed
	 * for data types and enumerations. For attributes with 
	 * <code>isMany == true</code> each single value (element of original collection)
	 * is passed one by one.
	 * 
	 * Though inherently protected, the method is visible to everyone to allow
	 * post-processing/migration code to utilize it for further model tweaking.
	 */
	public Object transformValue(EAttribute eAttr, Object value) {
		if (eAttr.getEType() instanceof EEnum) {
			EFactory f = eAttr.getEContainingClass().getEPackage().getEFactoryInstance();
			String s = f.convertToString(eAttr.getEAttributeType(), value);
			EClassifier newModelEnum = ePack.getEClassifier(eAttr.getEType().getName());
			Object r = eFact.createFromString((EDataType) newModelEnum, s);
			return r;
		}
		return value;
	}
}
