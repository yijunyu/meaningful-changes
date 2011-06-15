/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.NodeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.NodeReferenceImpl#getContainmentFeature <em>Containment Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.NodeReferenceImpl#getChildrenFeature <em>Children Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.NodeReferenceImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodeReferenceImpl extends EObjectImpl implements NodeReference {
	/**
	 * The cached value of the '{@link #getContainmentFeature() <em>Containment Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentFeature()
	 * @generated
	 * @ordered
	 */
	protected EReference containmentFeature;

	/**
	 * The cached value of the '{@link #getChildrenFeature() <em>Children Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenFeature()
	 * @generated
	 * @ordered
	 */
	protected EReference childrenFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getNodeReference();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.NODE_REFERENCE__CONTAINMENT_FEATURE, oldContainmentFeature, containmentFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.NODE_REFERENCE__CONTAINMENT_FEATURE, oldContainmentFeature, containmentFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildrenFeature() {
		if (childrenFeature != null && childrenFeature.eIsProxy()) {
			InternalEObject oldChildrenFeature = (InternalEObject)childrenFeature;
			childrenFeature = (EReference)eResolveProxy(oldChildrenFeature);
			if (childrenFeature != oldChildrenFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.NODE_REFERENCE__CHILDREN_FEATURE, oldChildrenFeature, childrenFeature));
			}
		}
		return childrenFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetChildrenFeature() {
		return childrenFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildrenFeature(EReference newChildrenFeature) {
		EReference oldChildrenFeature = childrenFeature;
		childrenFeature = newChildrenFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.NODE_REFERENCE__CHILDREN_FEATURE, oldChildrenFeature, childrenFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract NodeMapping getChild();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract boolean isSetChild();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFMapPackage.NODE_REFERENCE__CONTAINMENT_FEATURE:
				if (resolve) return getContainmentFeature();
				return basicGetContainmentFeature();
			case GMFMapPackage.NODE_REFERENCE__CHILDREN_FEATURE:
				if (resolve) return getChildrenFeature();
				return basicGetChildrenFeature();
			case GMFMapPackage.NODE_REFERENCE__CHILD:
				return getChild();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFMapPackage.NODE_REFERENCE__CONTAINMENT_FEATURE:
				setContainmentFeature((EReference)newValue);
				return;
			case GMFMapPackage.NODE_REFERENCE__CHILDREN_FEATURE:
				setChildrenFeature((EReference)newValue);
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
			case GMFMapPackage.NODE_REFERENCE__CONTAINMENT_FEATURE:
				setContainmentFeature((EReference)null);
				return;
			case GMFMapPackage.NODE_REFERENCE__CHILDREN_FEATURE:
				setChildrenFeature((EReference)null);
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
			case GMFMapPackage.NODE_REFERENCE__CONTAINMENT_FEATURE:
				return containmentFeature != null;
			case GMFMapPackage.NODE_REFERENCE__CHILDREN_FEATURE:
				return childrenFeature != null;
			case GMFMapPackage.NODE_REFERENCE__CHILD:
				return isSetChild();
		}
		return super.eIsSet(featureID);
	}

} //NodeReferenceImpl
