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
import org.eclipse.gmf.codegen.gmfgen.GenStandardPreferencePage;
import org.eclipse.gmf.codegen.gmfgen.StandardPreferencePages;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Standard Preference Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenStandardPreferencePageImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenStandardPreferencePageImpl#getClassName <em>Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenStandardPreferencePageImpl extends GenPreferencePageImpl implements GenStandardPreferencePage {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final StandardPreferencePages KIND_EDEFAULT = StandardPreferencePages.GENERAL_LITERAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected StandardPreferencePages kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenStandardPreferencePageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenStandardPreferencePage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardPreferencePages getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(StandardPreferencePages newKind) {
		StandardPreferencePages oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_STANDARD_PREFERENCE_PAGE__KIND, oldKind, kind));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenPreferencePageImpl#getQualifiedClassName()
	 */
	@Override
	public String getQualifiedClassName() {
		if (getDiagram() == null || GenCommonBaseImpl.isEmpty(getDiagram().getPreferencesPackageName())) {
			return getClassName();
		}
		// no custom page for Pathmaps at the moment
		if (getKind() == StandardPreferencePages.PATHMAPS_LITERAL) {
			return "org.eclipse.gmf.runtime.emf.ui.preferences.PathmapsPreferencePage";
		}
		return getDiagram().getPreferencesPackageName() + '.' + getClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassNameGen() {
		return className;
	}

	public String getClassName() {
		if (!GenCommonBaseImpl.isEmpty(getClassNameGen())) {
			return getClassNameGen();
		}
		switch (getKind()) {
		case GENERAL_LITERAL : return "DiagramGeneralPreferencePage"; //$NON-NLS-1$
		case APPEARANCE_LITERAL : return "DiagramAppearancePreferencePage"; //$NON-NLS-1$
		case CONNECTIONS_LITERAL : return "DiagramConnectionsPreferencePage"; //$NON-NLS-1$
		case PRINTING_LITERAL : return "DiagramPrintingPreferencePage"; //$NON-NLS-1$
		case RULERS_AND_GRID_LITERAL : return "DiagramRulersAndGridPreferencePage"; //$NON-NLS-1$
		case PATHMAPS_LITERAL : return "PathmapsPreferencePage"; //$NON-NLS-1$
		}
		throw new IllegalStateException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_STANDARD_PREFERENCE_PAGE__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_STANDARD_PREFERENCE_PAGE__KIND:
				return getKind();
			case GMFGenPackage.GEN_STANDARD_PREFERENCE_PAGE__CLASS_NAME:
				return getClassName();
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
			case GMFGenPackage.GEN_STANDARD_PREFERENCE_PAGE__KIND:
				setKind((StandardPreferencePages)newValue);
				return;
			case GMFGenPackage.GEN_STANDARD_PREFERENCE_PAGE__CLASS_NAME:
				setClassName((String)newValue);
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
			case GMFGenPackage.GEN_STANDARD_PREFERENCE_PAGE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case GMFGenPackage.GEN_STANDARD_PREFERENCE_PAGE__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_STANDARD_PREFERENCE_PAGE__KIND:
				return kind != KIND_EDEFAULT;
			case GMFGenPackage.GEN_STANDARD_PREFERENCE_PAGE__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", className: ");
		result.append(className);
		result.append(')');
		return result.toString();
	}

} //GenStandardPreferencePageImpl
