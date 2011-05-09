/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenContributionItem;
import org.eclipse.gmf.codegen.gmfgen.GenSharedContributionItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Shared Contribution Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenSharedContributionItemImpl#getActualItem <em>Actual Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenSharedContributionItemImpl extends GenContributionItemImpl implements GenSharedContributionItem {
	/**
	 * The cached value of the '{@link #getActualItem() <em>Actual Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualItem()
	 * @generated
	 * @ordered
	 */
	protected GenContributionItem actualItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSharedContributionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenSharedContributionItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenContributionItem getActualItem() {
		if (actualItem != null && actualItem.eIsProxy()) {
			InternalEObject oldActualItem = (InternalEObject)actualItem;
			actualItem = (GenContributionItem)eResolveProxy(oldActualItem);
			if (actualItem != oldActualItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_SHARED_CONTRIBUTION_ITEM__ACTUAL_ITEM, oldActualItem, actualItem));
			}
		}
		return actualItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenContributionItem basicGetActualItem() {
		return actualItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualItem(GenContributionItem newActualItem) {
		GenContributionItem oldActualItem = actualItem;
		actualItem = newActualItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_SHARED_CONTRIBUTION_ITEM__ACTUAL_ITEM, oldActualItem, actualItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_SHARED_CONTRIBUTION_ITEM__ACTUAL_ITEM:
				if (resolve) return getActualItem();
				return basicGetActualItem();
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
			case GMFGenPackage.GEN_SHARED_CONTRIBUTION_ITEM__ACTUAL_ITEM:
				setActualItem((GenContributionItem)newValue);
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
			case GMFGenPackage.GEN_SHARED_CONTRIBUTION_ITEM__ACTUAL_ITEM:
				setActualItem((GenContributionItem)null);
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
			case GMFGenPackage.GEN_SHARED_CONTRIBUTION_ITEM__ACTUAL_ITEM:
				return actualItem != null;
		}
		return super.eIsSet(featureID);
	}

} //GenSharedContributionItemImpl
