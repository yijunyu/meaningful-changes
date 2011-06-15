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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
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
	protected GenFeature sourceMetaFeature;

	/**
	 * The cached value of the '{@link #getTargetMetaFeature() <em>Target Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMetaFeature()
	 * @generated
	 * @ordered
	 */
	protected GenFeature targetMetaFeature;

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
	@Override
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
			InternalEObject oldSourceMetaFeature = (InternalEObject)sourceMetaFeature;
			sourceMetaFeature = (GenFeature)eResolveProxy(oldSourceMetaFeature);
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
			InternalEObject oldTargetMetaFeature = (InternalEObject)targetMetaFeature;
			targetMetaFeature = (GenFeature)eResolveProxy(oldTargetMetaFeature);
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
	 * @generated NOT
	 */
	public GenClass getSourceType() {
		if (getSourceMetaFeature() != null) {
			return getSourceMetaFeature().getTypeGenClass();
		} else if (getChildMetaFeature() != null) {
			return getChildMetaFeature().getGenClass();
		} // child feature defaults to be equal to containment, so if child == null, no reason to check containment
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenClass getTargetType() {
		if (getTargetMetaFeature() != null) {
			return getTargetMetaFeature().getTypeGenClass();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<GenClass> getAssistantSourceTypes() {
		// TODO: Modify this method in accordance on implementing
		// AssistantProvider.
		BasicEList<GenClass> sources = new BasicEList<GenClass>();
		GenClass sourceType = getSourceType();
		if (sourceType != null) {
			sources.add(sourceType);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<GenClass> getAssistantTargetTypes() {
		// TODO: Modify this method in accordance on implementing
		// AssistantProvider.
		BasicEList<GenClass> targets = new BasicEList<GenClass>();
		GenClass targetType = getTargetType();
		if (targetType != null) {
			targets.add(targetType);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__SOURCE_META_FEATURE:
				if (resolve) return getSourceMetaFeature();
				return basicGetSourceMetaFeature();
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__TARGET_META_FEATURE:
				if (resolve) return getTargetMetaFeature();
				return basicGetTargetMetaFeature();
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
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__SOURCE_META_FEATURE:
				setSourceMetaFeature((GenFeature)newValue);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__TARGET_META_FEATURE:
				setTargetMetaFeature((GenFeature)newValue);
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
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__SOURCE_META_FEATURE:
				setSourceMetaFeature((GenFeature)null);
				return;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__TARGET_META_FEATURE:
				setTargetMetaFeature((GenFeature)null);
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
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__SOURCE_META_FEATURE:
				return sourceMetaFeature != null;
			case GMFGenPackage.TYPE_LINK_MODEL_FACET__TARGET_META_FEATURE:
				return targetMetaFeature != null;
		}
		return super.eIsSet(featureID);
	}
	
} //TypeLinkModelFacetImpl
