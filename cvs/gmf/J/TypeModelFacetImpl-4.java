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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenElementInitializer;
import org.eclipse.gmf.codegen.gmfgen.ModelElementSelector;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Model Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeModelFacetImpl#getMetaClass <em>Meta Class</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeModelFacetImpl#getContainmentMetaFeature <em>Containment Meta Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeModelFacetImpl#getChildMetaFeature <em>Child Meta Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeModelFacetImpl#getModelElementSelector <em>Model Element Selector</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeModelFacetImpl#getModelElementInitializer <em>Model Element Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModelFacetImpl extends EObjectImpl implements TypeModelFacet {
	/**
	 * The cached value of the '{@link #getMetaClass() <em>Meta Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaClass()
	 * @generated
	 * @ordered
	 */
	protected GenClass metaClass = null;

	/**
	 * The cached value of the '{@link #getContainmentMetaFeature() <em>Containment Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentMetaFeature()
	 * @generated
	 * @ordered
	 */
	protected GenFeature containmentMetaFeature = null;

	/**
	 * The cached value of the '{@link #getChildMetaFeature() <em>Child Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildMetaFeature()
	 * @generated
	 * @ordered
	 */
	protected GenFeature childMetaFeature = null;

	/**
	 * The cached value of the '{@link #getModelElementSelector() <em>Model Element Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementSelector()
	 * @generated
	 * @ordered
	 */
	protected ModelElementSelector modelElementSelector = null;

	/**
	 * The cached value of the '{@link #getModelElementInitializer() <em>Model Element Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementInitializer()
	 * @generated
	 * @ordered
	 */
	protected GenElementInitializer modelElementInitializer = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModelFacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getTypeModelFacet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass getMetaClass() {
		if (metaClass != null && metaClass.eIsProxy()) {
			GenClass oldMetaClass = metaClass;
			metaClass = (GenClass)eResolveProxy((InternalEObject)metaClass);
			if (metaClass != oldMetaClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.TYPE_MODEL_FACET__META_CLASS, oldMetaClass, metaClass));
			}
		}
		return metaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass basicGetMetaClass() {
		return metaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaClass(GenClass newMetaClass) {
		GenClass oldMetaClass = metaClass;
		metaClass = newMetaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.TYPE_MODEL_FACET__META_CLASS, oldMetaClass, metaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature getContainmentMetaFeature() {
		if (containmentMetaFeature != null && containmentMetaFeature.eIsProxy()) {
			GenFeature oldContainmentMetaFeature = containmentMetaFeature;
			containmentMetaFeature = (GenFeature)eResolveProxy((InternalEObject)containmentMetaFeature);
			if (containmentMetaFeature != oldContainmentMetaFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.TYPE_MODEL_FACET__CONTAINMENT_META_FEATURE, oldContainmentMetaFeature, containmentMetaFeature));
			}
		}
		return containmentMetaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature basicGetContainmentMetaFeature() {
		return containmentMetaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainmentMetaFeature(GenFeature newContainmentMetaFeature) {
		GenFeature oldContainmentMetaFeature = containmentMetaFeature;
		containmentMetaFeature = newContainmentMetaFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.TYPE_MODEL_FACET__CONTAINMENT_META_FEATURE, oldContainmentMetaFeature, containmentMetaFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature getChildMetaFeatureGen() {
		if (childMetaFeature != null && childMetaFeature.eIsProxy()) {
			GenFeature oldChildMetaFeature = childMetaFeature;
			childMetaFeature = (GenFeature)eResolveProxy((InternalEObject)childMetaFeature);
			if (childMetaFeature != oldChildMetaFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.TYPE_MODEL_FACET__CHILD_META_FEATURE, oldChildMetaFeature, childMetaFeature));
			}
		}
		return childMetaFeature;
	}

	public GenFeature getChildMetaFeature() {
		GenFeature f = getChildMetaFeatureGen();
		if (f == null) {
			return getContainmentMetaFeature();
		}
		return f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature basicGetChildMetaFeature() {
		return childMetaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildMetaFeature(GenFeature newChildMetaFeature) {
		GenFeature oldChildMetaFeature = childMetaFeature;
		childMetaFeature = newChildMetaFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.TYPE_MODEL_FACET__CHILD_META_FEATURE, oldChildMetaFeature, childMetaFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementSelector getModelElementSelector() {
		return modelElementSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelElementSelector(ModelElementSelector newModelElementSelector, NotificationChain msgs) {
		ModelElementSelector oldModelElementSelector = modelElementSelector;
		modelElementSelector = newModelElementSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR, oldModelElementSelector, newModelElementSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElementSelector(ModelElementSelector newModelElementSelector) {
		if (newModelElementSelector != modelElementSelector) {
			NotificationChain msgs = null;
			if (modelElementSelector != null)
				msgs = ((InternalEObject)modelElementSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR, null, msgs);
			if (newModelElementSelector != null)
				msgs = ((InternalEObject)newModelElementSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR, null, msgs);
			msgs = basicSetModelElementSelector(newModelElementSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR, newModelElementSelector, newModelElementSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenElementInitializer getModelElementInitializer() {
		return modelElementInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelElementInitializer(GenElementInitializer newModelElementInitializer, NotificationChain msgs) {
		GenElementInitializer oldModelElementInitializer = modelElementInitializer;
		modelElementInitializer = newModelElementInitializer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER, oldModelElementInitializer, newModelElementInitializer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElementInitializer(GenElementInitializer newModelElementInitializer) {
		if (newModelElementInitializer != modelElementInitializer) {
			NotificationChain msgs = null;
			if (modelElementInitializer != null)
				msgs = ((InternalEObject)modelElementInitializer).eInverseRemove(this, GMFGenPackage.GEN_ELEMENT_INITIALIZER__TYPE_MODEL_FACET, GenElementInitializer.class, msgs);
			if (newModelElementInitializer != null)
				msgs = ((InternalEObject)newModelElementInitializer).eInverseAdd(this, GMFGenPackage.GEN_ELEMENT_INITIALIZER__TYPE_MODEL_FACET, GenElementInitializer.class, msgs);
			msgs = basicSetModelElementInitializer(newModelElementInitializer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER, newModelElementInitializer, newModelElementInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
					if (modelElementInitializer != null)
						msgs = ((InternalEObject)modelElementInitializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER, null, msgs);
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
				case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR:
					return basicSetModelElementSelector(null, msgs);
				case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
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
			case GMFGenPackage.TYPE_MODEL_FACET__META_CLASS:
				if (resolve) return getMetaClass();
				return basicGetMetaClass();
			case GMFGenPackage.TYPE_MODEL_FACET__CONTAINMENT_META_FEATURE:
				if (resolve) return getContainmentMetaFeature();
				return basicGetContainmentMetaFeature();
			case GMFGenPackage.TYPE_MODEL_FACET__CHILD_META_FEATURE:
				if (resolve) return getChildMetaFeature();
				return basicGetChildMetaFeature();
			case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR:
				return getModelElementSelector();
			case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
				return getModelElementInitializer();
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
			case GMFGenPackage.TYPE_MODEL_FACET__META_CLASS:
				setMetaClass((GenClass)newValue);
				return;
			case GMFGenPackage.TYPE_MODEL_FACET__CONTAINMENT_META_FEATURE:
				setContainmentMetaFeature((GenFeature)newValue);
				return;
			case GMFGenPackage.TYPE_MODEL_FACET__CHILD_META_FEATURE:
				setChildMetaFeature((GenFeature)newValue);
				return;
			case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR:
				setModelElementSelector((ModelElementSelector)newValue);
				return;
			case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
				setModelElementInitializer((GenElementInitializer)newValue);
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
			case GMFGenPackage.TYPE_MODEL_FACET__META_CLASS:
				setMetaClass((GenClass)null);
				return;
			case GMFGenPackage.TYPE_MODEL_FACET__CONTAINMENT_META_FEATURE:
				setContainmentMetaFeature((GenFeature)null);
				return;
			case GMFGenPackage.TYPE_MODEL_FACET__CHILD_META_FEATURE:
				setChildMetaFeature((GenFeature)null);
				return;
			case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR:
				setModelElementSelector((ModelElementSelector)null);
				return;
			case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
				setModelElementInitializer((GenElementInitializer)null);
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
			case GMFGenPackage.TYPE_MODEL_FACET__META_CLASS:
				return metaClass != null;
			case GMFGenPackage.TYPE_MODEL_FACET__CONTAINMENT_META_FEATURE:
				return containmentMetaFeature != null;
			case GMFGenPackage.TYPE_MODEL_FACET__CHILD_META_FEATURE:
				return childMetaFeature != null;
			case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR:
				return modelElementSelector != null;
			case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
				return modelElementInitializer != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //TypeModelFacetImpl
