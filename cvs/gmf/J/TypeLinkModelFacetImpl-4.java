/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenElementInitializer;
import org.eclipse.gmf.codegen.gmfgen.ModelElementSelector;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Link Model Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeLinkModelFacetImpl#getSourceMetaFeature <em>Source Meta Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeLinkModelFacetImpl#getTargetMetaFeature <em>Target Meta Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLinkModelFacetImpl extends TypeModelFacetImpl implements TypeLinkModelFacet {
	/**
	 * The cached value of the '{@link #getSourceMetaFeature() <em>Source Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMetaFeature()
	 * @generated
	 * @ordered
	 */
	protected GenFeature sourceMetaFeature = null;

	/**
	 * The cached value of the '{@link #getTargetMetaFeature() <em>Target Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMetaFeature()
	 * @generated
	 * @ordered
	 */
	protected GenFeature targetMetaFeature = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLinkModelFacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getTypeLinkModelFacet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature getSourceMetaFeature() {
		if (sourceMetaFeature != null && sourceMetaFeature.eIsProxy()) {
			GenFeature oldSourceMetaFeature = sourceMetaFeature;
			sourceMetaFeature = (GenFeature)eResolveProxy((InternalEObject)sourceMetaFeature);
			if (sourceMetaFeature != oldSourceMetaFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.TYPE_LINK_MODEL_FACET__SOURCE_META_FEATURE, oldSourceMetaFeature, sourceMetaFeature));
			}
		}
		return sourceMetaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature basicGetSourceMetaFeature() {
		return sourceMetaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMetaFeature(GenFeature newSourceMetaFeature) {
		GenFeature oldSourceMetaFeature = sourceMetaFeature;
		sourceMetaFeature = newSourceMetaFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.TYPE_LINK_MODEL_FACET__SOURCE_META_FEATURE, oldSourceMetaFeature, sourceMetaFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature getTargetMetaFeature() {
		if (targetMetaFeature != null && targetMetaFeature.eIsProxy()) {
			GenFeature oldTargetMetaFeature = targetMetaFeature;
			targetMetaFeature = (GenFeature)eResolveProxy((InternalEObject)targetMetaFeature);
			if (targetMetaFeature != oldTargetMetaFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.TYPE_LINK_MODEL_FACET__TARGET_META_FEATURE, oldTargetMetaFeature, targetMetaFeature));
			}
		}
		return targetMetaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature basicGetTargetMetaFeature() {
		return targetMetaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMetaFeature(GenFeature newTargetMetaFeature) {
		GenFeature oldTargetMetaFeature = targetMetaFeature;
		targetMetaFeature = newTargetMetaFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.TYPE_LINK_MODEL_FACET__TARGET_META_FEATURE, oldTargetMetaFeature, targetMetaFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
					if (modelElementInitializer != null)
						msgs = ((InternalEObject)modelElementInitializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_INITIALIZER, null, msgs);
					return basicSetModelElementInitializer((GenElementInitializer)otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_SELECTOR:
					return basicSetModelElementSelector(null, msgs);
				case GMFGenPackage.TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
					return basicSetModelElementInitializer(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__META_CLASS:
				if (resolve) return getMetaClass();
				return basicGetMetaClass();
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__CONTAINMENT_META_FEATURE:
				if (resolve) return getContainmentMetaFeature();
				return basicGetContainmentMetaFeature();
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__CHILD_META_FEATURE:
				if (resolve) return getChildMetaFeature();
				return basicGetChildMetaFeature();
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_SELECTOR:
				return getModelElementSelector();
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
				return getModelElementInitializer();
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__SOURCE_META_FEATURE:
				if (resolve) return getSourceMetaFeature();
				return basicGetSourceMetaFeature();
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__TARGET_META_FEATURE:
				if (resolve) return getTargetMetaFeature();
				return basicGetTargetMetaFeature();
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
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__META_CLASS:
				setMetaClass((GenClass)newValue);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__CONTAINMENT_META_FEATURE:
				setContainmentMetaFeature((GenFeature)newValue);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__CHILD_META_FEATURE:
				setChildMetaFeature((GenFeature)newValue);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_SELECTOR:
				setModelElementSelector((ModelElementSelector)newValue);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
				setModelElementInitializer((GenElementInitializer)newValue);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__SOURCE_META_FEATURE:
				setSourceMetaFeature((GenFeature)newValue);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__TARGET_META_FEATURE:
				setTargetMetaFeature((GenFeature)newValue);
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
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__META_CLASS:
				setMetaClass((GenClass)null);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__CONTAINMENT_META_FEATURE:
				setContainmentMetaFeature((GenFeature)null);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__CHILD_META_FEATURE:
				setChildMetaFeature((GenFeature)null);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_SELECTOR:
				setModelElementSelector((ModelElementSelector)null);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
				setModelElementInitializer((GenElementInitializer)null);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__SOURCE_META_FEATURE:
				setSourceMetaFeature((GenFeature)null);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__TARGET_META_FEATURE:
				setTargetMetaFeature((GenFeature)null);
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
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__META_CLASS:
				return metaClass != null;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__CONTAINMENT_META_FEATURE:
				return containmentMetaFeature != null;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__CHILD_META_FEATURE:
				return childMetaFeature != null;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_SELECTOR:
				return modelElementSelector != null;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
				return modelElementInitializer != null;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__SOURCE_META_FEATURE:
				return sourceMetaFeature != null;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__TARGET_META_FEATURE:
				return targetMetaFeature != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //TypeLinkModelFacetImpl