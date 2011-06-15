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
import org.eclipse.gmf.tooldef.StandardTool;
import org.eclipse.gmf.tooldef.StandardToolKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.tooldef.impl.StandardToolImpl#getToolKind <em>Tool Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardToolImpl extends AbstractToolImpl implements StandardTool {
	/**
	 * The default value of the '{@link #getToolKind() <em>Tool Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolKind()
	 * @generated
	 * @ordered
	 */
	protected static final StandardToolKind TOOL_KIND_EDEFAULT = StandardToolKind.SELECT_LITERAL;

	/**
	 * The cached value of the '{@link #getToolKind() <em>Tool Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolKind()
	 * @generated
	 * @ordered
	 */
	protected StandardToolKind toolKind = TOOL_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFToolPackage.eINSTANCE.getStandardTool();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardToolKind getToolKind() {
		return toolKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolKind(StandardToolKind newToolKind) {
		StandardToolKind oldToolKind = toolKind;
		toolKind = newToolKind == null ? TOOL_KIND_EDEFAULT : newToolKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFToolPackage.STANDARD_TOOL__TOOL_KIND, oldToolKind, toolKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GMFToolPackage.STANDARD_TOOL__TOOL_KIND:
			return getToolKind();
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
		case GMFToolPackage.STANDARD_TOOL__TOOL_KIND:
			setToolKind((StandardToolKind) newValue);
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
		case GMFToolPackage.STANDARD_TOOL__TOOL_KIND:
			setToolKind(TOOL_KIND_EDEFAULT);
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
		case GMFToolPackage.STANDARD_TOOL__TOOL_KIND:
			return toolKind != TOOL_KIND_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (toolKind: ");
		result.append(toolKind);
		result.append(')');
		return result.toString();
	}

} //StandardToolImpl
