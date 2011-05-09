/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Feature Value Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureValueSpecImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenFeatureValueSpecImpl extends ValueExpressionImpl implements GenFeatureValueSpec {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected GenFeature feature = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenFeatureValueSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenFeatureValueSpec();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			GenFeature oldFeature = feature;
			feature = (GenFeature)eResolveProxy((InternalEObject)feature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_FEATURE_VALUE_SPEC__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(GenFeature newFeature) {
		GenFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_FEATURE_VALUE_SPEC__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC__BODY:
				return getBody();
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC__LANGUAGE:
				return getLanguage();
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC__BODY:
				setBody((String)newValue);
				return;
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC__FEATURE:
				setFeature((GenFeature)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC__FEATURE:
				setFeature((GenFeature)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC__FEATURE:
				return feature != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //GenFeatureValueSpecImpl
