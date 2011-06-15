/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildSideAffixedNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Child Side Affixed Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildSideAffixedNodeImpl#getPreferredSideName <em>Preferred Side Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenChildSideAffixedNodeImpl extends GenChildNodeImpl implements GenChildSideAffixedNode {
	/**
	 * The default value of the '{@link #getPreferredSideName() <em>Preferred Side Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredSideName()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFERRED_SIDE_NAME_EDEFAULT = "NONE";

	/**
	 * The cached value of the '{@link #getPreferredSideName() <em>Preferred Side Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredSideName()
	 * @generated
	 * @ordered
	 */
	protected String preferredSideName = PREFERRED_SIDE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenChildSideAffixedNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenChildSideAffixedNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreferredSideName() {
		return preferredSideName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredSideName(String newPreferredSideName) {
		String oldPreferredSideName = preferredSideName;
		preferredSideName = newPreferredSideName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CHILD_SIDE_AFFIXED_NODE__PREFERRED_SIDE_NAME, oldPreferredSideName, preferredSideName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_CHILD_SIDE_AFFIXED_NODE__PREFERRED_SIDE_NAME:
				return getPreferredSideName();
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
			case GMFGenPackage.GEN_CHILD_SIDE_AFFIXED_NODE__PREFERRED_SIDE_NAME:
				setPreferredSideName((String)newValue);
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
			case GMFGenPackage.GEN_CHILD_SIDE_AFFIXED_NODE__PREFERRED_SIDE_NAME:
				setPreferredSideName(PREFERRED_SIDE_NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_CHILD_SIDE_AFFIXED_NODE__PREFERRED_SIDE_NAME:
				return PREFERRED_SIDE_NAME_EDEFAULT == null ? preferredSideName != null : !PREFERRED_SIDE_NAME_EDEFAULT.equals(preferredSideName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (preferredSideName: ");
		result.append(preferredSideName);
		result.append(')');
		return result.toString();
	}

} //GenChildSideAffixedNodeImpl
