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
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Insets;
import org.eclipse.gmf.gmfgraph.MarginBorder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Margin Border</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.MarginBorderImpl#getInsets <em>Insets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarginBorderImpl extends EObjectImpl implements MarginBorder {
	/**
	 * The cached value of the '{@link #getInsets() <em>Insets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsets()
	 * @generated
	 * @ordered
	 */
	protected Insets insets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarginBorderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getMarginBorder();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Insets getInsets() {
		return insets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsets(Insets newInsets, NotificationChain msgs) {
		Insets oldInsets = insets;
		insets = newInsets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.MARGIN_BORDER__INSETS, oldInsets, newInsets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsets(Insets newInsets) {
		if (newInsets != insets) {
			NotificationChain msgs = null;
			if (insets != null)
				msgs = ((InternalEObject)insets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.MARGIN_BORDER__INSETS, null, msgs);
			if (newInsets != null)
				msgs = ((InternalEObject)newInsets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.MARGIN_BORDER__INSETS, null, msgs);
			msgs = basicSetInsets(newInsets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.MARGIN_BORDER__INSETS, newInsets, newInsets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.MARGIN_BORDER__INSETS:
				return basicSetInsets(null, msgs);
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
			case GMFGraphPackage.MARGIN_BORDER__INSETS:
				return getInsets();
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
			case GMFGraphPackage.MARGIN_BORDER__INSETS:
				setInsets((Insets)newValue);
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
			case GMFGraphPackage.MARGIN_BORDER__INSETS:
				setInsets((Insets)null);
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
			case GMFGraphPackage.MARGIN_BORDER__INSETS:
				return insets != null;
		}
		return super.eIsSet(featureID);
	}

} //MarginBorderImpl
