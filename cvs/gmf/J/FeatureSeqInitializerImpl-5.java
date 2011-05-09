/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.mappings.FeatureSeqInitializer;
import org.eclipse.gmf.mappings.FeatureValueSpec;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.MappingEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Seq Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl#getMappingEntry <em>Mapping Entry</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl#getInitializers <em>Initializers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureSeqInitializerImpl extends EObjectImpl implements FeatureSeqInitializer {
	/**
	 * The cached value of the '{@link #getInitializers() <em>Initializers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializers()
	 * @generated
	 * @ordered
	 */
	protected EList initializers = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureSeqInitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getFeatureSeqInitializer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingEntry getMappingEntry() {
		if (eContainerFeatureID != GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY) return null;
		return (MappingEntry)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingEntry(MappingEntry newMappingEntry) {
		if (newMappingEntry != eInternalContainer() || (eContainerFeatureID != GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY && newMappingEntry != null)) {
			if (EcoreUtil.isAncestor(this, newMappingEntry))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMappingEntry != null)
				msgs = ((InternalEObject)newMappingEntry).eInverseAdd(this, GMFMapPackage.MAPPING_ENTRY__DOMAIN_INITIALIZER, MappingEntry.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newMappingEntry, GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY, newMappingEntry, newMappingEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInitializers() {
		if (initializers == null) {
			initializers = new EObjectContainmentWithInverseEList(FeatureValueSpec.class, this, GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS, GMFMapPackage.FEATURE_VALUE_SPEC__FEATURE_SEQ_INITIALIZER);
		}
		return initializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY, msgs);
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return ((InternalEList)getInitializers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY:
				return eBasicSetContainer(null, GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY, msgs);
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return ((InternalEList)getInitializers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY:
				return eInternalContainer().eInverseRemove(this, GMFMapPackage.MAPPING_ENTRY__DOMAIN_INITIALIZER, MappingEntry.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY:
				return getMappingEntry();
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return getInitializers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY:
				setMappingEntry((MappingEntry)newValue);
				return;
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				getInitializers().clear();
				getInitializers().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY:
				setMappingEntry((MappingEntry)null);
				return;
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				getInitializers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY:
				return getMappingEntry() != null;
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return initializers != null && !initializers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureSeqInitializerImpl
