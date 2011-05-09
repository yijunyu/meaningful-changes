/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.gmfgraph.CustomAttribute;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomAttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomAttributeImpl#isDirectAccess <em>Direct Access</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomAttributeImpl#isMultiStatementValue <em>Multi Statement Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomAttributeImpl extends EObjectImpl implements CustomAttribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = "null";

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDirectAccess() <em>Direct Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirectAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECT_ACCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirectAccess() <em>Direct Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirectAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean directAccess = DIRECT_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiStatementValue() <em>Multi Statement Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiStatementValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_STATEMENT_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiStatementValue() <em>Multi Statement Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiStatementValue()
	 * @generated
	 * @ordered
	 */
	protected boolean multiStatementValue = MULTI_STATEMENT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getCustomAttribute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_ATTRIBUTE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirectAccess() {
		return directAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectAccess(boolean newDirectAccess) {
		boolean oldDirectAccess = directAccess;
		directAccess = newDirectAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_ATTRIBUTE__DIRECT_ACCESS, oldDirectAccess, directAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiStatementValue() {
		return multiStatementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiStatementValue(boolean newMultiStatementValue) {
		boolean oldMultiStatementValue = multiStatementValue;
		multiStatementValue = newMultiStatementValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_ATTRIBUTE__MULTI_STATEMENT_VALUE, oldMultiStatementValue, multiStatementValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__NAME:
				return getName();
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__VALUE:
				return getValue();
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__DIRECT_ACCESS:
				return isDirectAccess() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__MULTI_STATEMENT_VALUE:
				return isMultiStatementValue() ? Boolean.TRUE : Boolean.FALSE;
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
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__VALUE:
				setValue((String)newValue);
				return;
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__DIRECT_ACCESS:
				setDirectAccess(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__MULTI_STATEMENT_VALUE:
				setMultiStatementValue(((Boolean)newValue).booleanValue());
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
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__DIRECT_ACCESS:
				setDirectAccess(DIRECT_ACCESS_EDEFAULT);
				return;
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__MULTI_STATEMENT_VALUE:
				setMultiStatementValue(MULTI_STATEMENT_VALUE_EDEFAULT);
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
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__DIRECT_ACCESS:
				return directAccess != DIRECT_ACCESS_EDEFAULT;
			case GMFGraphPackage.CUSTOM_ATTRIBUTE__MULTI_STATEMENT_VALUE:
				return multiStatementValue != MULTI_STATEMENT_VALUE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(", directAccess: ");
		result.append(directAccess);
		result.append(", multiStatementValue: ");
		result.append(multiStatementValue);
		result.append(')');
		return result.toString();
	}

} //CustomAttributeImpl
