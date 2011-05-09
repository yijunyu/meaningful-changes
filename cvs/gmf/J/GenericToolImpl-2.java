/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmf.tooldef.GMFToolPackage;
import org.eclipse.gmf.tooldef.GenericTool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.tooldef.impl.GenericToolImpl#getToolClass <em>Tool Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericToolImpl extends AbstractToolImpl implements GenericTool {
	/**
	 * The default value of the '{@link #getToolClass() <em>Tool Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolClass()
	 * @generated
	 * @ordered
	 */
	protected static final Class TOOL_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToolClass() <em>Tool Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolClass()
	 * @generated
	 * @ordered
	 */
	protected Class toolClass = TOOL_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFToolPackage.eINSTANCE.getGenericTool();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class getToolClass() {
		return toolClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolClass(Class newToolClass) {
		Class oldToolClass = toolClass;
		toolClass = newToolClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFToolPackage.GENERIC_TOOL__TOOL_CLASS, oldToolClass, toolClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GMFToolPackage.GENERIC_TOOL__TOOL_CLASS:
			return getToolClass();
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
		case GMFToolPackage.GENERIC_TOOL__TOOL_CLASS:
			setToolClass((Class) newValue);
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
		case GMFToolPackage.GENERIC_TOOL__TOOL_CLASS:
			setToolClass(TOOL_CLASS_EDEFAULT);
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
		case GMFToolPackage.GENERIC_TOOL__TOOL_CLASS:
			return TOOL_CLASS_EDEFAULT == null ? toolClass != null : !TOOL_CLASS_EDEFAULT.equals(toolClass);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (toolClass: ");
		result.append(toolClass);
		result.append(')');
		return result.toString();
	}

} //GenericToolImpl
