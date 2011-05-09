/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.ToolEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolEntryImpl#isDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ToolEntryImpl extends EntryBaseImpl implements ToolEntry {
	/**
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean default_ = DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getToolEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		boolean oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.TOOL_ENTRY__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.TOOL_ENTRY__ORDER:
				return new Integer(getOrder());
			case GMFGenPackage.TOOL_ENTRY__TITLE_KEY:
				return getTitleKey();
			case GMFGenPackage.TOOL_ENTRY__DESCRIPTION_KEY:
				return getDescriptionKey();
			case GMFGenPackage.TOOL_ENTRY__LARGE_ICON_PATH:
				return getLargeIconPath();
			case GMFGenPackage.TOOL_ENTRY__SMALL_ICON_PATH:
				return getSmallIconPath();
			case GMFGenPackage.TOOL_ENTRY__CREATE_METHOD_NAME:
				return getCreateMethodName();
			case GMFGenPackage.TOOL_ENTRY__DEFAULT:
				return isDefault() ? Boolean.TRUE : Boolean.FALSE;
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
			case GMFGenPackage.TOOL_ENTRY__ORDER:
				setOrder(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.TOOL_ENTRY__TITLE_KEY:
				setTitleKey((String)newValue);
				return;
			case GMFGenPackage.TOOL_ENTRY__DESCRIPTION_KEY:
				setDescriptionKey((String)newValue);
				return;
			case GMFGenPackage.TOOL_ENTRY__LARGE_ICON_PATH:
				setLargeIconPath((String)newValue);
				return;
			case GMFGenPackage.TOOL_ENTRY__SMALL_ICON_PATH:
				setSmallIconPath((String)newValue);
				return;
			case GMFGenPackage.TOOL_ENTRY__CREATE_METHOD_NAME:
				setCreateMethodName((String)newValue);
				return;
			case GMFGenPackage.TOOL_ENTRY__DEFAULT:
				setDefault(((Boolean)newValue).booleanValue());
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
			case GMFGenPackage.TOOL_ENTRY__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case GMFGenPackage.TOOL_ENTRY__TITLE_KEY:
				setTitleKey(TITLE_KEY_EDEFAULT);
				return;
			case GMFGenPackage.TOOL_ENTRY__DESCRIPTION_KEY:
				setDescriptionKey(DESCRIPTION_KEY_EDEFAULT);
				return;
			case GMFGenPackage.TOOL_ENTRY__LARGE_ICON_PATH:
				setLargeIconPath(LARGE_ICON_PATH_EDEFAULT);
				return;
			case GMFGenPackage.TOOL_ENTRY__SMALL_ICON_PATH:
				setSmallIconPath(SMALL_ICON_PATH_EDEFAULT);
				return;
			case GMFGenPackage.TOOL_ENTRY__CREATE_METHOD_NAME:
				setCreateMethodName(CREATE_METHOD_NAME_EDEFAULT);
				return;
			case GMFGenPackage.TOOL_ENTRY__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
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
			case GMFGenPackage.TOOL_ENTRY__ORDER:
				return order != ORDER_EDEFAULT;
			case GMFGenPackage.TOOL_ENTRY__TITLE_KEY:
				return TITLE_KEY_EDEFAULT == null ? titleKey != null : !TITLE_KEY_EDEFAULT.equals(titleKey);
			case GMFGenPackage.TOOL_ENTRY__DESCRIPTION_KEY:
				return DESCRIPTION_KEY_EDEFAULT == null ? descriptionKey != null : !DESCRIPTION_KEY_EDEFAULT.equals(descriptionKey);
			case GMFGenPackage.TOOL_ENTRY__LARGE_ICON_PATH:
				return LARGE_ICON_PATH_EDEFAULT == null ? largeIconPath != null : !LARGE_ICON_PATH_EDEFAULT.equals(largeIconPath);
			case GMFGenPackage.TOOL_ENTRY__SMALL_ICON_PATH:
				return SMALL_ICON_PATH_EDEFAULT == null ? smallIconPath != null : !SMALL_ICON_PATH_EDEFAULT.equals(smallIconPath);
			case GMFGenPackage.TOOL_ENTRY__CREATE_METHOD_NAME:
				return CREATE_METHOD_NAME_EDEFAULT == null ? createMethodName != null : !CREATE_METHOD_NAME_EDEFAULT.equals(createMethodName);
			case GMFGenPackage.TOOL_ENTRY__DEFAULT:
				return default_ != DEFAULT_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //ToolEntryImpl
