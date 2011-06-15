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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.gmf.mappings.FeatureLabelMapping;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LabelTextAccessMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Label Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureLabelMappingImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureLabelMappingImpl#getEditableFeatures <em>Editable Features</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureLabelMappingImpl#getViewPattern <em>View Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureLabelMappingImpl#getEditorPattern <em>Editor Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureLabelMappingImpl#getEditPattern <em>Edit Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureLabelMappingImpl#getViewMethod <em>View Method</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureLabelMappingImpl#getEditMethod <em>Edit Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureLabelMappingImpl extends LabelMappingImpl implements FeatureLabelMapping {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> features;

	/**
	 * The cached value of the '{@link #getEditableFeatures() <em>Editable Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditableFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> editableFeatures;

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
	 * The default value of the '{@link #getEditorPattern() <em>Editor Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITOR_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditorPattern() <em>Editor Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorPattern()
	 * @generated
	 * @ordered
	 */
	protected String editorPattern = EDITOR_PATTERN_EDEFAULT;

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
	 * The default value of the '{@link #getViewMethod() <em>View Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewMethod()
	 * @generated
	 * @ordered
	 */
	protected static final LabelTextAccessMethod VIEW_METHOD_EDEFAULT = LabelTextAccessMethod.MESSAGE_FORMAT;

	/**
	 * The cached value of the '{@link #getViewMethod() <em>View Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewMethod()
	 * @generated
	 * @ordered
	 */
	protected LabelTextAccessMethod viewMethod = VIEW_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditMethod() <em>Edit Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditMethod()
	 * @generated
	 * @ordered
	 */
	protected static final LabelTextAccessMethod EDIT_METHOD_EDEFAULT = LabelTextAccessMethod.MESSAGE_FORMAT;

	/**
	 * The cached value of the '{@link #getEditMethod() <em>Edit Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditMethod()
	 * @generated
	 * @ordered
	 */
	protected LabelTextAccessMethod editMethod = EDIT_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureLabelMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getFeatureLabelMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, GMFMapPackage.FEATURE_LABEL_MAPPING__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getEditableFeatures() {
		if (editableFeatures == null) {
			editableFeatures = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, GMFMapPackage.FEATURE_LABEL_MAPPING__EDITABLE_FEATURES);
		}
		return editableFeatures;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.FEATURE_LABEL_MAPPING__VIEW_PATTERN, oldViewPattern, viewPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditorPattern() {
		return editorPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditorPattern(String newEditorPattern) {
		String oldEditorPattern = editorPattern;
		editorPattern = newEditorPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.FEATURE_LABEL_MAPPING__EDITOR_PATTERN, oldEditorPattern, editorPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelTextAccessMethod getViewMethod() {
		return viewMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewMethod(LabelTextAccessMethod newViewMethod) {
		LabelTextAccessMethod oldViewMethod = viewMethod;
		viewMethod = newViewMethod == null ? VIEW_METHOD_EDEFAULT : newViewMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.FEATURE_LABEL_MAPPING__VIEW_METHOD, oldViewMethod, viewMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.FEATURE_LABEL_MAPPING__EDIT_PATTERN, oldEditPattern, editPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelTextAccessMethod getEditMethod() {
		return editMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditMethod(LabelTextAccessMethod newEditMethod) {
		LabelTextAccessMethod oldEditMethod = editMethod;
		editMethod = newEditMethod == null ? EDIT_METHOD_EDEFAULT : newEditMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.FEATURE_LABEL_MAPPING__EDIT_METHOD, oldEditMethod, editMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFMapPackage.FEATURE_LABEL_MAPPING__FEATURES:
				return getFeatures();
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDITABLE_FEATURES:
				return getEditableFeatures();
			case GMFMapPackage.FEATURE_LABEL_MAPPING__VIEW_PATTERN:
				return getViewPattern();
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDITOR_PATTERN:
				return getEditorPattern();
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDIT_PATTERN:
				return getEditPattern();
			case GMFMapPackage.FEATURE_LABEL_MAPPING__VIEW_METHOD:
				return getViewMethod();
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDIT_METHOD:
				return getEditMethod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFMapPackage.FEATURE_LABEL_MAPPING__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDITABLE_FEATURES:
				getEditableFeatures().clear();
				getEditableFeatures().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case GMFMapPackage.FEATURE_LABEL_MAPPING__VIEW_PATTERN:
				setViewPattern((String)newValue);
				return;
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDITOR_PATTERN:
				setEditorPattern((String)newValue);
				return;
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDIT_PATTERN:
				setEditPattern((String)newValue);
				return;
			case GMFMapPackage.FEATURE_LABEL_MAPPING__VIEW_METHOD:
				setViewMethod((LabelTextAccessMethod)newValue);
				return;
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDIT_METHOD:
				setEditMethod((LabelTextAccessMethod)newValue);
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
			case GMFMapPackage.FEATURE_LABEL_MAPPING__FEATURES:
				getFeatures().clear();
				return;
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDITABLE_FEATURES:
				getEditableFeatures().clear();
				return;
			case GMFMapPackage.FEATURE_LABEL_MAPPING__VIEW_PATTERN:
				setViewPattern(VIEW_PATTERN_EDEFAULT);
				return;
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDITOR_PATTERN:
				setEditorPattern(EDITOR_PATTERN_EDEFAULT);
				return;
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDIT_PATTERN:
				setEditPattern(EDIT_PATTERN_EDEFAULT);
				return;
			case GMFMapPackage.FEATURE_LABEL_MAPPING__VIEW_METHOD:
				setViewMethod(VIEW_METHOD_EDEFAULT);
				return;
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDIT_METHOD:
				setEditMethod(EDIT_METHOD_EDEFAULT);
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
			case GMFMapPackage.FEATURE_LABEL_MAPPING__FEATURES:
				return features != null && !features.isEmpty();
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDITABLE_FEATURES:
				return editableFeatures != null && !editableFeatures.isEmpty();
			case GMFMapPackage.FEATURE_LABEL_MAPPING__VIEW_PATTERN:
				return VIEW_PATTERN_EDEFAULT == null ? viewPattern != null : !VIEW_PATTERN_EDEFAULT.equals(viewPattern);
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDITOR_PATTERN:
				return EDITOR_PATTERN_EDEFAULT == null ? editorPattern != null : !EDITOR_PATTERN_EDEFAULT.equals(editorPattern);
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDIT_PATTERN:
				return EDIT_PATTERN_EDEFAULT == null ? editPattern != null : !EDIT_PATTERN_EDEFAULT.equals(editPattern);
			case GMFMapPackage.FEATURE_LABEL_MAPPING__VIEW_METHOD:
				return viewMethod != VIEW_METHOD_EDEFAULT;
			case GMFMapPackage.FEATURE_LABEL_MAPPING__EDIT_METHOD:
				return editMethod != EDIT_METHOD_EDEFAULT;
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
		result.append(" (viewPattern: ");
		result.append(viewPattern);
		result.append(", editorPattern: ");
		result.append(editorPattern);
		result.append(", editPattern: ");
		result.append(editPattern);
		result.append(", viewMethod: ");
		result.append(viewMethod);
		result.append(", editMethod: ");
		result.append(editMethod);
		result.append(')');
		return result.toString();
	}

} //FeatureLabelMappingImpl