/**
 * <copyright>
 * </copyright>
 *
 * $Id: DomainAttributeTargetImpl.java,v 1.1 2006/04/25 19:15:49 radvorak Exp $
 */
package org.eclipse.gmf.mappings.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.mappings.DomainAttributeTarget;
import org.eclipse.gmf.mappings.GMFMapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Attribute Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.DomainAttributeTargetImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.DomainAttributeTargetImpl#isNullAsError <em>Null As Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainAttributeTargetImpl extends EObjectImpl implements DomainAttributeTarget {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute attribute = null;

	/**
	 * The default value of the '{@link #isNullAsError() <em>Null As Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullAsError()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULL_AS_ERROR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullAsError() <em>Null As Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullAsError()
	 * @generated
	 * @ordered
	 */
	protected boolean nullAsError = NULL_AS_ERROR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainAttributeTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getDomainAttributeTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (EAttribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(EAttribute newAttribute) {
		EAttribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullAsError() {
		return nullAsError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullAsError(boolean newNullAsError) {
		boolean oldNullAsError = nullAsError;
		nullAsError = newNullAsError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR, oldNullAsError, nullAsError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFMapPackage.DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case GMFMapPackage.DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR:
				return isNullAsError() ? Boolean.TRUE : Boolean.FALSE;
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
			case GMFMapPackage.DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE:
				setAttribute((EAttribute)newValue);
				return;
			case GMFMapPackage.DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR:
				setNullAsError(((Boolean)newValue).booleanValue());
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
			case GMFMapPackage.DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE:
				setAttribute((EAttribute)null);
				return;
			case GMFMapPackage.DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR:
				setNullAsError(NULL_AS_ERROR_EDEFAULT);
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
			case GMFMapPackage.DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE:
				return attribute != null;
			case GMFMapPackage.DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR:
				return nullAsError != NULL_AS_ERROR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nullAsError: ");
		result.append(nullAsError);
		result.append(')');
		return result.toString();
	}

} //DomainAttributeTargetImpl