/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LabelMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LabelMappingImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LabelMappingImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LabelMappingImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LabelMappingImpl#getDefaultText <em>Default Text</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LabelMappingImpl#getViewPattern <em>View Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LabelMappingImpl#getEditPattern <em>Edit Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LabelMappingImpl extends EObjectImpl implements LabelMapping {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList features = null;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultText() <em>Default Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultText()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultText() <em>Default Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultText()
	 * @generated
	 * @ordered
	 */
	protected String defaultText = DEFAULT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewPattern() <em>View Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewPattern() <em>View Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPattern()
	 * @generated
	 * @ordered
	 */
	protected String viewPattern = VIEW_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditPattern() <em>Edit Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditPattern() <em>Edit Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPattern()
	 * @generated
	 * @ordered
	 */
	protected String editPattern = EDIT_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getLabelMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList(EAttribute.class, this, GMFMapPackage.LABEL_MAPPING__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LABEL_MAPPING__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LABEL_MAPPING__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultText() {
		return defaultText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultText(String newDefaultText) {
		String oldDefaultText = defaultText;
		defaultText = newDefaultText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LABEL_MAPPING__DEFAULT_TEXT, oldDefaultText, defaultText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewPattern() {
		return viewPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewPattern(String newViewPattern) {
		String oldViewPattern = viewPattern;
		viewPattern = newViewPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LABEL_MAPPING__VIEW_PATTERN, oldViewPattern, viewPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditPattern() {
		return editPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditPattern(String newEditPattern) {
		String oldEditPattern = editPattern;
		editPattern = newEditPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LABEL_MAPPING__EDIT_PATTERN, oldEditPattern, editPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFMapPackage.LABEL_MAPPING__FEATURES:
				return getFeatures();
			case GMFMapPackage.LABEL_MAPPING__TEXT:
				return getText();
			case GMFMapPackage.LABEL_MAPPING__READ_ONLY:
				return isReadOnly() ? Boolean.TRUE : Boolean.FALSE;
			case GMFMapPackage.LABEL_MAPPING__DEFAULT_TEXT:
				return getDefaultText();
			case GMFMapPackage.LABEL_MAPPING__VIEW_PATTERN:
				return getViewPattern();
			case GMFMapPackage.LABEL_MAPPING__EDIT_PATTERN:
				return getEditPattern();
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
			case GMFMapPackage.LABEL_MAPPING__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection)newValue);
				return;
			case GMFMapPackage.LABEL_MAPPING__TEXT:
				setText((String)newValue);
				return;
			case GMFMapPackage.LABEL_MAPPING__READ_ONLY:
				setReadOnly(((Boolean)newValue).booleanValue());
				return;
			case GMFMapPackage.LABEL_MAPPING__DEFAULT_TEXT:
				setDefaultText((String)newValue);
				return;
			case GMFMapPackage.LABEL_MAPPING__VIEW_PATTERN:
				setViewPattern((String)newValue);
				return;
			case GMFMapPackage.LABEL_MAPPING__EDIT_PATTERN:
				setEditPattern((String)newValue);
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
			case GMFMapPackage.LABEL_MAPPING__FEATURES:
				getFeatures().clear();
				return;
			case GMFMapPackage.LABEL_MAPPING__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case GMFMapPackage.LABEL_MAPPING__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case GMFMapPackage.LABEL_MAPPING__DEFAULT_TEXT:
				setDefaultText(DEFAULT_TEXT_EDEFAULT);
				return;
			case GMFMapPackage.LABEL_MAPPING__VIEW_PATTERN:
				setViewPattern(VIEW_PATTERN_EDEFAULT);
				return;
			case GMFMapPackage.LABEL_MAPPING__EDIT_PATTERN:
				setEditPattern(EDIT_PATTERN_EDEFAULT);
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
			case GMFMapPackage.LABEL_MAPPING__FEATURES:
				return features != null && !features.isEmpty();
			case GMFMapPackage.LABEL_MAPPING__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case GMFMapPackage.LABEL_MAPPING__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case GMFMapPackage.LABEL_MAPPING__DEFAULT_TEXT:
				return DEFAULT_TEXT_EDEFAULT == null ? defaultText != null : !DEFAULT_TEXT_EDEFAULT.equals(defaultText);
			case GMFMapPackage.LABEL_MAPPING__VIEW_PATTERN:
				return VIEW_PATTERN_EDEFAULT == null ? viewPattern != null : !VIEW_PATTERN_EDEFAULT.equals(viewPattern);
			case GMFMapPackage.LABEL_MAPPING__EDIT_PATTERN:
				return EDIT_PATTERN_EDEFAULT == null ? editPattern != null : !EDIT_PATTERN_EDEFAULT.equals(editPattern);
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
		result.append(" (text: ");
		result.append(text);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", defaultText: ");
		result.append(defaultText);
		result.append(", viewPattern: ");
		result.append(viewPattern);
		result.append(", editPattern: ");
		result.append(editPattern);
		result.append(')');
		return result.toString();
	}

} //LabelMappingImpl
