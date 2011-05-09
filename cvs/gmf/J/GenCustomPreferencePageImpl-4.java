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
import org.eclipse.gmf.codegen.gmfgen.GenCustomPreferencePage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Custom Preference Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCustomPreferencePageImpl#getQualifiedClassName <em>Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCustomPreferencePageImpl#isGenerateBoilerplate <em>Generate Boilerplate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCustomPreferencePageImpl extends GenPreferencePageImpl implements GenCustomPreferencePage {
	/**
	 * The default value of the '{@link #getQualifiedClassName() <em>Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedClassName() <em>Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedClassName = QUALIFIED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateBoilerplate() <em>Generate Boilerplate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateBoilerplate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_BOILERPLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateBoilerplate() <em>Generate Boilerplate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateBoilerplate()
	 * @generated
	 * @ordered
	 */
	protected boolean generateBoilerplate = GENERATE_BOILERPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCustomPreferencePageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenCustomPreferencePage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedClassName() {
		return qualifiedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedClassName(String newQualifiedClassName) {
		String oldQualifiedClassName = qualifiedClassName;
		qualifiedClassName = newQualifiedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CUSTOM_PREFERENCE_PAGE__QUALIFIED_CLASS_NAME, oldQualifiedClassName, qualifiedClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateBoilerplate() {
		return generateBoilerplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateBoilerplate(boolean newGenerateBoilerplate) {
		boolean oldGenerateBoilerplate = generateBoilerplate;
		generateBoilerplate = newGenerateBoilerplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CUSTOM_PREFERENCE_PAGE__GENERATE_BOILERPLATE, oldGenerateBoilerplate, generateBoilerplate));
	}

	@Override
	public String getClassName() {
		if (GenCommonBaseImpl.isEmpty(getQualifiedClassName()) || getQualifiedClassName().indexOf('.') == -1) {
			return getQualifiedClassName();
		}
		return getQualifiedClassName().substring(getQualifiedClassName().lastIndexOf('.') + 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_CUSTOM_PREFERENCE_PAGE__QUALIFIED_CLASS_NAME:
				return getQualifiedClassName();
			case GMFGenPackage.GEN_CUSTOM_PREFERENCE_PAGE__GENERATE_BOILERPLATE:
				return isGenerateBoilerplate() ? Boolean.TRUE : Boolean.FALSE;
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
			case GMFGenPackage.GEN_CUSTOM_PREFERENCE_PAGE__QUALIFIED_CLASS_NAME:
				setQualifiedClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_CUSTOM_PREFERENCE_PAGE__GENERATE_BOILERPLATE:
				setGenerateBoilerplate(((Boolean)newValue).booleanValue());
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
			case GMFGenPackage.GEN_CUSTOM_PREFERENCE_PAGE__QUALIFIED_CLASS_NAME:
				setQualifiedClassName(QUALIFIED_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CUSTOM_PREFERENCE_PAGE__GENERATE_BOILERPLATE:
				setGenerateBoilerplate(GENERATE_BOILERPLATE_EDEFAULT);
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
			case GMFGenPackage.GEN_CUSTOM_PREFERENCE_PAGE__QUALIFIED_CLASS_NAME:
				return QUALIFIED_CLASS_NAME_EDEFAULT == null ? qualifiedClassName != null : !QUALIFIED_CLASS_NAME_EDEFAULT.equals(qualifiedClassName);
			case GMFGenPackage.GEN_CUSTOM_PREFERENCE_PAGE__GENERATE_BOILERPLATE:
				return generateBoilerplate != GENERATE_BOILERPLATE_EDEFAULT;
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
		result.append(" (qualifiedClassName: ");
		result.append(qualifiedClassName);
		result.append(", generateBoilerplate: ");
		result.append(generateBoilerplate);
		result.append(')');
		return result.toString();
	}

} //GenCustomPreferencePageImpl
