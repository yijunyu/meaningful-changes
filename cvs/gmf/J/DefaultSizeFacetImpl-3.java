/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.gmfgraph.DefaultSizeFacet;
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Size Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.DefaultSizeFacetImpl#getDefaultSize <em>Default Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultSizeFacetImpl extends EObjectImpl implements DefaultSizeFacet {
	/**
	 * The cached value of the '{@link #getDefaultSize() <em>Default Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension defaultSize = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultSizeFacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getDefaultSizeFacet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getDefaultSize() {
		return defaultSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultSize(Dimension newDefaultSize, NotificationChain msgs) {
		Dimension oldDefaultSize = defaultSize;
		defaultSize = newDefaultSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.DEFAULT_SIZE_FACET__DEFAULT_SIZE, oldDefaultSize, newDefaultSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultSize(Dimension newDefaultSize) {
		if (newDefaultSize != defaultSize) {
			NotificationChain msgs = null;
			if (defaultSize != null)
				msgs = ((InternalEObject)defaultSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.DEFAULT_SIZE_FACET__DEFAULT_SIZE, null, msgs);
			if (newDefaultSize != null)
				msgs = ((InternalEObject)newDefaultSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.DEFAULT_SIZE_FACET__DEFAULT_SIZE, null, msgs);
			msgs = basicSetDefaultSize(newDefaultSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.DEFAULT_SIZE_FACET__DEFAULT_SIZE, newDefaultSize, newDefaultSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.DEFAULT_SIZE_FACET__DEFAULT_SIZE:
				return basicSetDefaultSize(null, msgs);
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
			case GMFGraphPackage.DEFAULT_SIZE_FACET__DEFAULT_SIZE:
				return getDefaultSize();
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
			case GMFGraphPackage.DEFAULT_SIZE_FACET__DEFAULT_SIZE:
				setDefaultSize((Dimension)newValue);
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
			case GMFGraphPackage.DEFAULT_SIZE_FACET__DEFAULT_SIZE:
				setDefaultSize((Dimension)null);
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
			case GMFGraphPackage.DEFAULT_SIZE_FACET__DEFAULT_SIZE:
				return defaultSize != null;
		}
		return super.eIsSet(featureID);
	}

} //DefaultSizeFacetImpl
