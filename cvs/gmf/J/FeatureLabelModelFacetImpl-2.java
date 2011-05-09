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

import org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Label Model Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureLabelModelFacetImpl#getViewPattern <em>View Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureLabelModelFacetImpl#getEditPattern <em>Edit Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureLabelModelFacetImpl extends FeatureModelFacetImpl implements FeatureLabelModelFacet {
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
	protected FeatureLabelModelFacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getFeatureLabelModelFacet();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN, oldViewPattern, viewPattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN, oldEditPattern, editPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN:
				return getViewPattern();
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN:
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
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN:
				setViewPattern((String)newValue);
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN:
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
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN:
				setViewPattern(VIEW_PATTERN_EDEFAULT);
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN:
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
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN:
				return VIEW_PATTERN_EDEFAULT == null ? viewPattern != null : !VIEW_PATTERN_EDEFAULT.equals(viewPattern);
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN:
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
		result.append(" (viewPattern: ");
		result.append(viewPattern);
		result.append(", editPattern: ");
		result.append(editPattern);
		result.append(')');
		return result.toString();
	}

} //FeatureLabelModelFacetImpl
