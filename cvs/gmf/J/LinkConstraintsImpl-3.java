/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.mappings.Constraint;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LinkConstraints;
import org.eclipse.gmf.mappings.LinkMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkConstraintsImpl#getLinkMapping <em>Link Mapping</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkConstraintsImpl#getSourceEnd <em>Source End</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkConstraintsImpl#getTargetEnd <em>Target End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkConstraintsImpl extends EObjectImpl implements LinkConstraints {
	/**
	 * The cached value of the '{@link #getSourceEnd() <em>Source End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEnd()
	 * @generated
	 * @ordered
	 */
	protected Constraint sourceEnd = null;

	/**
	 * The cached value of the '{@link #getTargetEnd() <em>Target End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEnd()
	 * @generated
	 * @ordered
	 */
	protected Constraint targetEnd = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getLinkConstraints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkMapping getLinkMapping() {
		if (eContainerFeatureID != GMFMapPackage.LINK_CONSTRAINTS__LINK_MAPPING) return null;
		return (LinkMapping)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getSourceEnd() {
		return sourceEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceEnd(Constraint newSourceEnd, NotificationChain msgs) {
		Constraint oldSourceEnd = sourceEnd;
		sourceEnd = newSourceEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_CONSTRAINTS__SOURCE_END, oldSourceEnd, newSourceEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceEnd(Constraint newSourceEnd) {
		if (newSourceEnd != sourceEnd) {
			NotificationChain msgs = null;
			if (sourceEnd != null)
				msgs = ((InternalEObject)sourceEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.LINK_CONSTRAINTS__SOURCE_END, null, msgs);
			if (newSourceEnd != null)
				msgs = ((InternalEObject)newSourceEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.LINK_CONSTRAINTS__SOURCE_END, null, msgs);
			msgs = basicSetSourceEnd(newSourceEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_CONSTRAINTS__SOURCE_END, newSourceEnd, newSourceEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getTargetEnd() {
		return targetEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetEnd(Constraint newTargetEnd, NotificationChain msgs) {
		Constraint oldTargetEnd = targetEnd;
		targetEnd = newTargetEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_CONSTRAINTS__TARGET_END, oldTargetEnd, newTargetEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEnd(Constraint newTargetEnd) {
		if (newTargetEnd != targetEnd) {
			NotificationChain msgs = null;
			if (targetEnd != null)
				msgs = ((InternalEObject)targetEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.LINK_CONSTRAINTS__TARGET_END, null, msgs);
			if (newTargetEnd != null)
				msgs = ((InternalEObject)newTargetEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.LINK_CONSTRAINTS__TARGET_END, null, msgs);
			msgs = basicSetTargetEnd(newTargetEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_CONSTRAINTS__TARGET_END, newTargetEnd, newTargetEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFMapPackage.LINK_CONSTRAINTS__LINK_MAPPING:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFMapPackage.LINK_CONSTRAINTS__LINK_MAPPING, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFMapPackage.LINK_CONSTRAINTS__LINK_MAPPING:
					return eBasicSetContainer(null, GMFMapPackage.LINK_CONSTRAINTS__LINK_MAPPING, msgs);
				case GMFMapPackage.LINK_CONSTRAINTS__SOURCE_END:
					return basicSetSourceEnd(null, msgs);
				case GMFMapPackage.LINK_CONSTRAINTS__TARGET_END:
					return basicSetTargetEnd(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case GMFMapPackage.LINK_CONSTRAINTS__LINK_MAPPING:
					return eContainer.eInverseRemove(this, GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS, LinkMapping.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFMapPackage.LINK_CONSTRAINTS__LINK_MAPPING:
				return getLinkMapping();
			case GMFMapPackage.LINK_CONSTRAINTS__SOURCE_END:
				return getSourceEnd();
			case GMFMapPackage.LINK_CONSTRAINTS__TARGET_END:
				return getTargetEnd();
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
			case GMFMapPackage.LINK_CONSTRAINTS__SOURCE_END:
				setSourceEnd((Constraint)newValue);
				return;
			case GMFMapPackage.LINK_CONSTRAINTS__TARGET_END:
				setTargetEnd((Constraint)newValue);
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
			case GMFMapPackage.LINK_CONSTRAINTS__SOURCE_END:
				setSourceEnd((Constraint)null);
				return;
			case GMFMapPackage.LINK_CONSTRAINTS__TARGET_END:
				setTargetEnd((Constraint)null);
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
			case GMFMapPackage.LINK_CONSTRAINTS__LINK_MAPPING:
				return getLinkMapping() != null;
			case GMFMapPackage.LINK_CONSTRAINTS__SOURCE_END:
				return sourceEnd != null;
			case GMFMapPackage.LINK_CONSTRAINTS__TARGET_END:
				return targetEnd != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //LinkConstraintsImpl
