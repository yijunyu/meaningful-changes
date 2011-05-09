/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Feature Seq Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureSeqInitializerImpl#getInitializers <em>Initializers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenFeatureSeqInitializerImpl extends GenElementInitializerImpl implements GenFeatureSeqInitializer {
	/**
	 * The cached value of the '{@link #getInitializers() <em>Initializers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializers()
	 * @generated
	 * @ordered
	 */
	protected EList initializers = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenFeatureSeqInitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenFeatureSeqInitializer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInitializers() {
		if (initializers == null) {
			initializers = new EObjectContainmentEList(GenFeatureValueSpec.class, this, GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS);
		}
		return initializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String[] getRequiredPluginIDs() {
		HashSet ids = new HashSet();
		for (Iterator it = getInitializers().iterator(); it.hasNext();) {
			GenFeatureValueSpec valueSpec = (GenFeatureValueSpec) it.next();
			// For now hardcode only the default support for OCL
			// TODO - to be refactored to plugg-in other languages
			if("ocl".equals(valueSpec.getLanguage())) { //$NON-NLS-1$
				ids.add("org.eclipse.emf.query.ocl"); //$NON-NLS-1$
			}
		}
		return (String[]) ids.toArray(new String[ids.size()]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getElementClassAccessorName() {
		GenClass genClass = getElementClass();
		return (genClass != null) ? genClass.getClassifierAccessorName() : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getElementQualifiedPackageInterfaceName() {
		GenClass genClass = getElementClass();
		return (genClass != null) ? genClass.getGenPackage().getQualifiedPackageInterfaceName() : null;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__TYPE_MODEL_FACET:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__TYPE_MODEL_FACET, msgs);
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
				case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__TYPE_MODEL_FACET:
					return eBasicSetContainer(null, GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__TYPE_MODEL_FACET, msgs);
				case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS:
					return ((InternalEList)getInitializers()).basicRemove(otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__TYPE_MODEL_FACET:
					return eContainer.eInverseRemove(this, GMFGenPackage.TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER, TypeModelFacet.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__TYPE_MODEL_FACET:
				return getTypeModelFacet();
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return getInitializers();
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
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				getInitializers().clear();
				getInitializers().addAll((Collection)newValue);
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
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				getInitializers().clear();
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
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__TYPE_MODEL_FACET:
				return getTypeModelFacet() != null;
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return initializers != null && !initializers.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	private GenClass getElementClass() {
		TypeModelFacet typeModelFacet = getTypeModelFacet();
		if(typeModelFacet == null) {
			return null;
		}
		return typeModelFacet.getMetaClass();
	}

} //GenFeatureSeqInitializerImpl
