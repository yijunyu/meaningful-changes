/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.mappings.FeatureInitializer;
import org.eclipse.gmf.mappings.FeatureSeqInitializer;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.MappingEntry;
import org.eclipse.gmf.mappings.ReferenceNewElementSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Seq Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl#getMappingEntry <em>Mapping Entry</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl#getElementClass <em>Element Class</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl#getCreatingInitializer <em>Creating Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureSeqInitializerImpl extends EObjectImpl implements FeatureSeqInitializer {
	/**
	 * The cached value of the '{@link #getInitializers() <em>Initializers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializers()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureInitializer> initializers;

	/**
	 * The cached value of the '{@link #getElementClass() <em>Element Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementClass()
	 * @generated
	 * @ordered
	 */
	protected EClass elementClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureSeqInitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getFeatureSeqInitializer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingEntry getMappingEntry() {
		MappingEntry mappingEntry = basicGetMappingEntry();
		return mappingEntry != null && mappingEntry.eIsProxy() ? (MappingEntry)eResolveProxy((InternalEObject)mappingEntry) : mappingEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MappingEntry basicGetMappingEntry() {
		EObject container = eContainer();
		while(container != null && !(container instanceof MappingEntry)) {
			container = container.eContainer();
		}
		return (container != null) ? (MappingEntry)container : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureInitializer> getInitializers() {
		if (initializers == null) {
			initializers = new EObjectContainmentWithInverseEList<FeatureInitializer>(FeatureInitializer.class, this, GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS, GMFMapPackage.FEATURE_INITIALIZER__FEATURE_SEQ_INITIALIZER);
		}
		return initializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EClass getElementClass() {
		if(getCreatingInitializer() == null) {
			return (getMappingEntry() != null) ? getMappingEntry().getDomainContext() : null;
		}
		EClass eClass = getElementClassGen();
		if(eClass != null) {
			return eClass;
		}
		EClassifier eClassifier = null;
		if(getCreatingInitializer().getFeature() != null) {
			eClassifier = getCreatingInitializer().getFeature().getEType();			
		}
		return (eClassifier instanceof EClass) ? (EClass)eClassifier : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementClassGen() {
		if (elementClass != null && elementClass.eIsProxy()) {
			InternalEObject oldElementClass = (InternalEObject)elementClass;
			elementClass = (EClass)eResolveProxy(oldElementClass);
			if (elementClass != oldElementClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS, oldElementClass, elementClass));
			}
		}
		return elementClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetElementClass() {
		return elementClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setElementClass(EClass newElementClass) {
		if(getCreatingInitializer() == null && eContainer() != null) {
			return;
		}
		setElementClassGen(newElementClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementClassGen(EClass newElementClass) {
		EClass oldElementClass = elementClass;
		elementClass = newElementClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS, oldElementClass, elementClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceNewElementSpec getCreatingInitializer() {
		if (eContainerFeatureID != GMFMapPackage.FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER) return null;
		return (ReferenceNewElementSpec)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatingInitializer(ReferenceNewElementSpec newCreatingInitializer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCreatingInitializer, GMFMapPackage.FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatingInitializer(ReferenceNewElementSpec newCreatingInitializer) {
		if (newCreatingInitializer != eInternalContainer() || (eContainerFeatureID != GMFMapPackage.FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER && newCreatingInitializer != null)) {
			if (EcoreUtil.isAncestor(this, newCreatingInitializer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCreatingInitializer != null)
				msgs = ((InternalEObject)newCreatingInitializer).eInverseAdd(this, GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__NEW_ELEMENT_INITIALIZERS, ReferenceNewElementSpec.class, msgs);
			msgs = basicSetCreatingInitializer(newCreatingInitializer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER, newCreatingInitializer, newCreatingInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInitializers()).basicAdd(otherEnd, msgs);
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCreatingInitializer((ReferenceNewElementSpec)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return ((InternalEList<?>)getInitializers()).basicRemove(otherEnd, msgs);
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER:
				return basicSetCreatingInitializer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER:
				return eInternalContainer().eInverseRemove(this, GMFMapPackage.REFERENCE_NEW_ELEMENT_SPEC__NEW_ELEMENT_INITIALIZERS, ReferenceNewElementSpec.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY:
				if (resolve) return getMappingEntry();
				return basicGetMappingEntry();
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return getInitializers();
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS:
				if (resolve) return getElementClass();
				return basicGetElementClass();
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER:
				return getCreatingInitializer();
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
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				getInitializers().clear();
				getInitializers().addAll((Collection<? extends FeatureInitializer>)newValue);
				return;
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS:
				setElementClass((EClass)newValue);
				return;
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER:
				setCreatingInitializer((ReferenceNewElementSpec)newValue);
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
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				getInitializers().clear();
				return;
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS:
				setElementClass((EClass)null);
				return;
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER:
				setCreatingInitializer((ReferenceNewElementSpec)null);
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
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY:
				return basicGetMappingEntry() != null;
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__INITIALIZERS:
				return initializers != null && !initializers.isEmpty();
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS:
				return elementClass != null;
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER:
				return getCreatingInitializer() != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureSeqInitializerImpl
