/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferenceNewElementSpecImpl.java,v 1.2 2007/03/14 13:00:04 atikhomirov Exp $
 */
package org.eclipse.gmf.mappings.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.mappings.FeatureSeqInitializer;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.ReferenceNewElementSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference New Element Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.ReferenceNewElementSpecImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.ReferenceNewElementSpecImpl#getFeatureSeqInitializer <em>Feature Seq Initializer</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.ReferenceNewElementSpecImpl#getNewElementInitializers <em>New Element Initializers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceNewElementSpecImpl extends EObjectImpl implements ReferenceNewElementSpec {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature = null;

	/**
	 * The cached value of the '{@link #getNewElementInitializers() <em>New Element Initializers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewElementInitializers()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureSeqInitializer> newElementInitializers = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceNewElementSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getReferenceNewElementSpec();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (EStructuralFeature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(EStructuralFeature newFeature) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSeqInitializer getFeatureSeqInitializer() {
		if (eContainerFeatureID != GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE_SEQ_INITIALIZER) return null;
		return (FeatureSeqInitializer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureSeqInitializer> getNewElementInitializers() {
		if (newElementInitializers == null) {
			newElementInitializers = new EObjectContainmentWithInverseEList<FeatureSeqInitializer>(FeatureSeqInitializer.class, this, GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__NEW_ELEMENT_INITIALIZERS, GMFMapPackage.FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER);
		}
		return newElementInitializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE_SEQ_INITIALIZER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE_SEQ_INITIALIZER, msgs);
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__NEW_ELEMENT_INITIALIZERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNewElementInitializers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE_SEQ_INITIALIZER:
				return eBasicSetContainer(null, GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE_SEQ_INITIALIZER, msgs);
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__NEW_ELEMENT_INITIALIZERS:
				return ((InternalEList<?>)getNewElementInitializers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE_SEQ_INITIALIZER:
				return eInternalContainer().eInverseRemove(this, GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS, FeatureSeqInitializer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE_SEQ_INITIALIZER:
				return getFeatureSeqInitializer();
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__NEW_ELEMENT_INITIALIZERS:
				return getNewElementInitializers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE:
				setFeature((EStructuralFeature)newValue);
				return;
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__NEW_ELEMENT_INITIALIZERS:
				getNewElementInitializers().clear();
				getNewElementInitializers().addAll((Collection<? extends FeatureSeqInitializer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE:
				setFeature((EStructuralFeature)null);
				return;
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__NEW_ELEMENT_INITIALIZERS:
				getNewElementInitializers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE:
				return feature != null;
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__FEATURE_SEQ_INITIALIZER:
				return getFeatureSeqInitializer() != null;
			case GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__NEW_ELEMENT_INITIALIZERS:
				return newElementInitializers != null && !newElementInitializers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferenceNewElementSpecImpl