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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenConstraint;
import org.eclipse.gmf.codegen.gmfgen.GenElementInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
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
	protected GenConstraint modelElementSelector = null;

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
	@Override
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
			InternalEObject oldMetaClass = (InternalEObject)metaClass;
			metaClass = (GenClass)eResolveProxy(oldMetaClass);
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
			InternalEObject oldContainmentMetaFeature = (InternalEObject)containmentMetaFeature;
			containmentMetaFeature = (GenFeature)eResolveProxy(oldContainmentMetaFeature);
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
			InternalEObject oldChildMetaFeature = (InternalEObject)childMetaFeature;
			childMetaFeature = (GenFeature)eResolveProxy(oldChildMetaFeature);
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
	public GenConstraint getModelElementSelector() {
		return modelElementSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelElementSelector(GenConstraint newModelElementSelector, NotificationChain msgs) {
		GenConstraint oldModelElementSelector = modelElementSelector;
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
	public void setModelElementSelector(GenConstraint newModelElementSelector) {
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
				msgs = ((InternalEObject)modelElementInitializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER, null, msgs);
			if (newModelElementInitializer != null)
				msgs = ((InternalEObject)newModelElementInitializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER, null, msgs);
			msgs = basicSetModelElementInitializer(newModelElementInitializer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER, newModelElementInitializer, newModelElementInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isPhantomElement() {
		return eContainer() instanceof GenTopLevelNode && getContainmentMetaFeature() == null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR:
				return basicSetModelElementSelector(null, msgs);
			case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
				return basicSetModelElementInitializer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
				setModelElementSelector((GenConstraint)newValue);
				return;
			case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
				setModelElementInitializer((GenElementInitializer)newValue);
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
				setModelElementSelector((GenConstraint)null);
				return;
			case GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER:
				setModelElementInitializer((GenElementInitializer)null);
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
		return super.eIsSet(featureID);
	}

} //TypeModelFacetImpl
