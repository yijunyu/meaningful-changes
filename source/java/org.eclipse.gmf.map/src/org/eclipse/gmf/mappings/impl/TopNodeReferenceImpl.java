/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.TopNodeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Node Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.TopNodeReferenceImpl#getOwnedChild <em>Owned Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopNodeReferenceImpl extends NodeReferenceImpl implements TopNodeReference {
	/**
	 * The cached value of the '{@link #getOwnedChild() <em>Owned Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedChild()
	 * @generated
	 * @ordered
	 */
	protected NodeMapping ownedChild;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopNodeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getTopNodeReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMapping getOwnedChild() {
		return ownedChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedChild(NodeMapping newOwnedChild, NotificationChain msgs) {
		NodeMapping oldOwnedChild = ownedChild;
		ownedChild = newOwnedChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.TOP_NODE_REFERENCE__OWNED_CHILD, oldOwnedChild, newOwnedChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedChild(NodeMapping newOwnedChild) {
		if (newOwnedChild != ownedChild) {
			NotificationChain msgs = null;
			if (ownedChild != null)
				msgs = ((InternalEObject)ownedChild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.TOP_NODE_REFERENCE__OWNED_CHILD, null, msgs);
			if (newOwnedChild != null)
				msgs = ((InternalEObject)newOwnedChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.TOP_NODE_REFERENCE__OWNED_CHILD, null, msgs);
			msgs = basicSetOwnedChild(newOwnedChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.TOP_NODE_REFERENCE__OWNED_CHILD, newOwnedChild, newOwnedChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.TOP_NODE_REFERENCE__OWNED_CHILD:
				return basicSetOwnedChild(null, msgs);
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
			case GMFMapPackage.TOP_NODE_REFERENCE__OWNED_CHILD:
				return getOwnedChild();
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
			case GMFMapPackage.TOP_NODE_REFERENCE__OWNED_CHILD:
				setOwnedChild((NodeMapping)newValue);
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
			case GMFMapPackage.TOP_NODE_REFERENCE__OWNED_CHILD:
				setOwnedChild((NodeMapping)null);
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
			case GMFMapPackage.TOP_NODE_REFERENCE__OWNED_CHILD:
				return ownedChild != null;
		}
		return super.eIsSet(featureID);
	}

	public NodeMapping getChild() {
		assert getOwnedChild() != null;
		return getOwnedChild();
	}

	public boolean isSetChild() {
		return getOwnedChild() != null;
	}
} //TopNodeReferenceImpl
