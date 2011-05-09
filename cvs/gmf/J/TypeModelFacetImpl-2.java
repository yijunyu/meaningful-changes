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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.TYPE_MODEL_FACET__META_CLASS:
				if (resolve) return getMetaClass();
				return basicGetMetaClass();
			case GMFGenPackage.TYPE_MODEL_FACET__CONTAINMENT_META_FEATURE:
				if (resolve) return getContainmentMetaFeature();
				return basicGetContainmentMetaFeature();
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
		}
		return eDynamicIsSet(eFeature);
	}

} //TypeModelFacetImpl
