/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.LabelTextAccessMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Label Model Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureLabelModelFacetImpl#getMetaFeatures <em>Meta Features</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureLabelModelFacetImpl#getEditableMetaFeatures <em>Editable Meta Features</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureLabelModelFacetImpl#getViewPattern <em>View Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureLabelModelFacetImpl#getEditorPattern <em>Editor Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureLabelModelFacetImpl#getEditPattern <em>Edit Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureLabelModelFacetImpl#getViewMethod <em>View Method</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureLabelModelFacetImpl#getEditMethod <em>Edit Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureLabelModelFacetImpl extends LabelModelFacetImpl implements FeatureLabelModelFacet {
	/**
	 * The cached value of the '{@link #getMetaFeatures() <em>Meta Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<GenFeature> metaFeatures;

	/**
	 * The cached value of the '{@link #getEditableMetaFeatures() <em>Editable Meta Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditableMetaFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<GenFeature> editableMetaFeatures;

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
	protected FeatureLabelModelFacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getFeatureLabelModelFacet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenFeature> getMetaFeatures() {
		if (metaFeatures == null) {
			metaFeatures = new EObjectResolvingEList<GenFeature>(GenFeature.class, this, GMFGenPackage.FEATURE_LABEL_MODEL_FACET__META_FEATURES);
		}
		return metaFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenFeature> getEditableMetaFeatures() {
		if (editableMetaFeatures == null) {
			editableMetaFeatures = new EObjectResolvingEList<GenFeature>(GenFeature.class, this, GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDITABLE_META_FEATURES);
		}
		return editableMetaFeatures;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDITOR_PATTERN, oldEditorPattern, editorPattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_METHOD, oldViewMethod, viewMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_METHOD, oldEditMethod, editMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__META_FEATURES:
				return getMetaFeatures();
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDITABLE_META_FEATURES:
				return getEditableMetaFeatures();
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN:
				return getViewPattern();
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDITOR_PATTERN:
				return getEditorPattern();
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN:
				return getEditPattern();
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_METHOD:
				return getViewMethod();
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_METHOD:
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
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__META_FEATURES:
				getMetaFeatures().clear();
				getMetaFeatures().addAll((Collection<? extends GenFeature>)newValue);
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDITABLE_META_FEATURES:
				getEditableMetaFeatures().clear();
				getEditableMetaFeatures().addAll((Collection<? extends GenFeature>)newValue);
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN:
				setViewPattern((String)newValue);
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDITOR_PATTERN:
				setEditorPattern((String)newValue);
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN:
				setEditPattern((String)newValue);
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_METHOD:
				setViewMethod((LabelTextAccessMethod)newValue);
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_METHOD:
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
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__META_FEATURES:
				getMetaFeatures().clear();
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDITABLE_META_FEATURES:
				getEditableMetaFeatures().clear();
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN:
				setViewPattern(VIEW_PATTERN_EDEFAULT);
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDITOR_PATTERN:
				setEditorPattern(EDITOR_PATTERN_EDEFAULT);
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN:
				setEditPattern(EDIT_PATTERN_EDEFAULT);
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_METHOD:
				setViewMethod(VIEW_METHOD_EDEFAULT);
				return;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_METHOD:
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
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__META_FEATURES:
				return metaFeatures != null && !metaFeatures.isEmpty();
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDITABLE_META_FEATURES:
				return editableMetaFeatures != null && !editableMetaFeatures.isEmpty();
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN:
				return VIEW_PATTERN_EDEFAULT == null ? viewPattern != null : !VIEW_PATTERN_EDEFAULT.equals(viewPattern);
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDITOR_PATTERN:
				return EDITOR_PATTERN_EDEFAULT == null ? editorPattern != null : !EDITOR_PATTERN_EDEFAULT.equals(editorPattern);
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN:
				return EDIT_PATTERN_EDEFAULT == null ? editPattern != null : !EDIT_PATTERN_EDEFAULT.equals(editPattern);
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__VIEW_METHOD:
				return viewMethod != VIEW_METHOD_EDEFAULT;
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET__EDIT_METHOD:
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

} //FeatureLabelModelFacetImpl
