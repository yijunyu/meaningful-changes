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
import org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parent Assigned Viewmap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ParentAssignedViewmapImpl#getGetterName <em>Getter Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ParentAssignedViewmapImpl#getSetterName <em>Setter Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ParentAssignedViewmapImpl#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParentAssignedViewmapImpl extends ViewmapImpl implements ParentAssignedViewmap {
	/**
	 * The default value of the '{@link #getGetterName() <em>Getter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterName()
	 * @generated
	 * @ordered
	 */
	protected static final String GETTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGetterName() <em>Getter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterName()
	 * @generated
	 * @ordered
	 */
	protected String getterName = GETTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetterName() <em>Setter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetterName()
	 * @generated
	 * @ordered
	 */
	protected static final String SETTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetterName() <em>Setter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetterName()
	 * @generated
	 * @ordered
	 */
	protected String setterName = SETTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFigureQualifiedClassName() <em>Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigureQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFigureQualifiedClassName() <em>Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigureQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected String figureQualifiedClassName = FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParentAssignedViewmapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getParentAssignedViewmap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGetterName() {
		return getterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetterName(String newGetterName) {
		String oldGetterName = getterName;
		getterName = newGetterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__GETTER_NAME, oldGetterName, getterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetterName() {
		return setterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetterName(String newSetterName) {
		String oldSetterName = setterName;
		setterName = newSetterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__SETTER_NAME, oldSetterName, setterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFigureQualifiedClassName() {
		return figureQualifiedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigureQualifiedClassName(String newFigureQualifiedClassName) {
		String oldFigureQualifiedClassName = figureQualifiedClassName;
		figureQualifiedClassName = newFigureQualifiedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME, oldFigureQualifiedClassName, figureQualifiedClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__GETTER_NAME:
				return getGetterName();
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__SETTER_NAME:
				return getSetterName();
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME:
				return getFigureQualifiedClassName();
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
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__GETTER_NAME:
				setGetterName((String)newValue);
				return;
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__SETTER_NAME:
				setSetterName((String)newValue);
				return;
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME:
				setFigureQualifiedClassName((String)newValue);
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
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__GETTER_NAME:
				setGetterName(GETTER_NAME_EDEFAULT);
				return;
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__SETTER_NAME:
				setSetterName(SETTER_NAME_EDEFAULT);
				return;
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME:
				setFigureQualifiedClassName(FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__GETTER_NAME:
				return GETTER_NAME_EDEFAULT == null ? getterName != null : !GETTER_NAME_EDEFAULT.equals(getterName);
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__SETTER_NAME:
				return SETTER_NAME_EDEFAULT == null ? setterName != null : !SETTER_NAME_EDEFAULT.equals(setterName);
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME:
				return FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT == null ? figureQualifiedClassName != null : !FIGURE_QUALIFIED_CLASS_NAME_EDEFAULT.equals(figureQualifiedClassName);
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
		result.append(" (getterName: ");
		result.append(getterName);
		result.append(", setterName: ");
		result.append(setterName);
		result.append(", figureQualifiedClassName: ");
		result.append(figureQualifiedClassName);
		result.append(')');
		return result.toString();
	}

} //ParentAssignedViewmapImpl