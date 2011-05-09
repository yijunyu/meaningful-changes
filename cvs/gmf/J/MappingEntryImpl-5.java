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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.mappings.Constraint;
import org.eclipse.gmf.mappings.ElementInitializer;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.MappingEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.MappingEntryImpl#getDomainMetaElement <em>Domain Meta Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.MappingEntryImpl#getDomainSpecialization <em>Domain Specialization</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.MappingEntryImpl#getDomainInitializer <em>Domain Initializer</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.MappingEntryImpl#getContainmentFeature <em>Containment Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.MappingEntryImpl#getLabelMappings <em>Label Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MappingEntryImpl extends EObjectImpl implements MappingEntry {
	/**
	 * The cached value of the '{@link #getDomainMetaElement() <em>Domain Meta Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainMetaElement()
	 * @generated
	 * @ordered
	 */
	protected EClass domainMetaElement = null;

	/**
	 * The cached value of the '{@link #getDomainSpecialization() <em>Domain Specialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Constraint domainSpecialization = null;

	/**
	 * The cached value of the '{@link #getDomainInitializer() <em>Domain Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainInitializer()
	 * @generated
	 * @ordered
	 */
	protected ElementInitializer domainInitializer = null;

	/**
	 * The cached value of the '{@link #getContainmentFeature() <em>Containment Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentFeature()
	 * @generated
	 * @ordered
	 */
	protected EReference containmentFeature = null;

	/**
	 * The cached value of the '{@link #getLabelMappings() <em>Label Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelMappings()
	 * @generated
	 * @ordered
	 */
	protected EList labelMappings = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getMappingEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainMetaElement() {
		if (domainMetaElement != null && domainMetaElement.eIsProxy()) {
			InternalEObject oldDomainMetaElement = (InternalEObject)domainMetaElement;
			domainMetaElement = (EClass)eResolveProxy(oldDomainMetaElement);
			if (domainMetaElement != oldDomainMetaElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.MAPPING_ENTRY__DOMAIN_META_ELEMENT, oldDomainMetaElement, domainMetaElement));
			}
		}
		return domainMetaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetDomainMetaElement() {
		return domainMetaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainMetaElement(EClass newDomainMetaElement) {
		EClass oldDomainMetaElement = domainMetaElement;
		domainMetaElement = newDomainMetaElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.MAPPING_ENTRY__DOMAIN_META_ELEMENT, oldDomainMetaElement, domainMetaElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getDomainSpecialization() {
		return domainSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainSpecialization(Constraint newDomainSpecialization, NotificationChain msgs) {
		Constraint oldDomainSpecialization = domainSpecialization;
		domainSpecialization = newDomainSpecialization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.MAPPING_ENTRY__DOMAIN_SPECIALIZATION, oldDomainSpecialization, newDomainSpecialization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainSpecialization(Constraint newDomainSpecialization) {
		if (newDomainSpecialization != domainSpecialization) {
			NotificationChain msgs = null;
			if (domainSpecialization != null)
				msgs = ((InternalEObject)domainSpecialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.MAPPING_ENTRY__DOMAIN_SPECIALIZATION, null, msgs);
			if (newDomainSpecialization != null)
				msgs = ((InternalEObject)newDomainSpecialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.MAPPING_ENTRY__DOMAIN_SPECIALIZATION, null, msgs);
			msgs = basicSetDomainSpecialization(newDomainSpecialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.MAPPING_ENTRY__DOMAIN_SPECIALIZATION, newDomainSpecialization, newDomainSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementInitializer getDomainInitializer() {
		return domainInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainInitializer(ElementInitializer newDomainInitializer, NotificationChain msgs) {
		ElementInitializer oldDomainInitializer = domainInitializer;
		domainInitializer = newDomainInitializer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.MAPPING_ENTRY__DOMAIN_INITIALIZER, oldDomainInitializer, newDomainInitializer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainInitializer(ElementInitializer newDomainInitializer) {
		if (newDomainInitializer != domainInitializer) {
			NotificationChain msgs = null;
			if (domainInitializer != null)
				msgs = ((InternalEObject)domainInitializer).eInverseRemove(this, GMFMapPackage.ELEMENT_INITIALIZER__MAPPING_ENTRY, ElementInitializer.class, msgs);
			if (newDomainInitializer != null)
				msgs = ((InternalEObject)newDomainInitializer).eInverseAdd(this, GMFMapPackage.ELEMENT_INITIALIZER__MAPPING_ENTRY, ElementInitializer.class, msgs);
			msgs = basicSetDomainInitializer(newDomainInitializer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.MAPPING_ENTRY__DOMAIN_INITIALIZER, newDomainInitializer, newDomainInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentFeature() {
		if (containmentFeature != null && containmentFeature.eIsProxy()) {
			InternalEObject oldContainmentFeature = (InternalEObject)containmentFeature;
			containmentFeature = (EReference)eResolveProxy(oldContainmentFeature);
			if (containmentFeature != oldContainmentFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.MAPPING_ENTRY__CONTAINMENT_FEATURE, oldContainmentFeature, containmentFeature));
			}
		}
		return containmentFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetContainmentFeature() {
		return containmentFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainmentFeature(EReference newContainmentFeature) {
		EReference oldContainmentFeature = containmentFeature;
		containmentFeature = newContainmentFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.MAPPING_ENTRY__CONTAINMENT_FEATURE, oldContainmentFeature, containmentFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLabelMappings() {
		if (labelMappings == null) {
			labelMappings = new EObjectContainmentWithInverseEList(LabelMapping.class, this, GMFMapPackage.MAPPING_ENTRY__LABEL_MAPPINGS, GMFMapPackage.LABEL_MAPPING__MAP_ENTRY);
		}
		return labelMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EClass getDomainContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_INITIALIZER:
				if (domainInitializer != null)
					msgs = ((InternalEObject)domainInitializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.MAPPING_ENTRY__DOMAIN_INITIALIZER, null, msgs);
				return basicSetDomainInitializer((ElementInitializer)otherEnd, msgs);
			case GMFMapPackage.MAPPING_ENTRY__LABEL_MAPPINGS:
				return ((InternalEList)getLabelMappings()).basicAdd(otherEnd, msgs);
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
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_SPECIALIZATION:
				return basicSetDomainSpecialization(null, msgs);
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_INITIALIZER:
				return basicSetDomainInitializer(null, msgs);
			case GMFMapPackage.MAPPING_ENTRY__LABEL_MAPPINGS:
				return ((InternalEList)getLabelMappings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_META_ELEMENT:
				if (resolve) return getDomainMetaElement();
				return basicGetDomainMetaElement();
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_SPECIALIZATION:
				return getDomainSpecialization();
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_INITIALIZER:
				return getDomainInitializer();
			case GMFMapPackage.MAPPING_ENTRY__CONTAINMENT_FEATURE:
				if (resolve) return getContainmentFeature();
				return basicGetContainmentFeature();
			case GMFMapPackage.MAPPING_ENTRY__LABEL_MAPPINGS:
				return getLabelMappings();
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
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_META_ELEMENT:
				setDomainMetaElement((EClass)newValue);
				return;
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_SPECIALIZATION:
				setDomainSpecialization((Constraint)newValue);
				return;
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_INITIALIZER:
				setDomainInitializer((ElementInitializer)newValue);
				return;
			case GMFMapPackage.MAPPING_ENTRY__CONTAINMENT_FEATURE:
				setContainmentFeature((EReference)newValue);
				return;
			case GMFMapPackage.MAPPING_ENTRY__LABEL_MAPPINGS:
				getLabelMappings().clear();
				getLabelMappings().addAll((Collection)newValue);
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
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_META_ELEMENT:
				setDomainMetaElement((EClass)null);
				return;
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_SPECIALIZATION:
				setDomainSpecialization((Constraint)null);
				return;
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_INITIALIZER:
				setDomainInitializer((ElementInitializer)null);
				return;
			case GMFMapPackage.MAPPING_ENTRY__CONTAINMENT_FEATURE:
				setContainmentFeature((EReference)null);
				return;
			case GMFMapPackage.MAPPING_ENTRY__LABEL_MAPPINGS:
				getLabelMappings().clear();
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
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_META_ELEMENT:
				return domainMetaElement != null;
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_SPECIALIZATION:
				return domainSpecialization != null;
			case GMFMapPackage.MAPPING_ENTRY__DOMAIN_INITIALIZER:
				return domainInitializer != null;
			case GMFMapPackage.MAPPING_ENTRY__CONTAINMENT_FEATURE:
				return containmentFeature != null;
			case GMFMapPackage.MAPPING_ENTRY__LABEL_MAPPINGS:
				return labelMappings != null && !labelMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingEntryImpl
