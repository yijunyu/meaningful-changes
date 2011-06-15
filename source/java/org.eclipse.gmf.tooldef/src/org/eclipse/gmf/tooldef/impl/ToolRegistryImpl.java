/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.tooldef.GMFToolPackage;
import org.eclipse.gmf.tooldef.Menu;
import org.eclipse.gmf.tooldef.MenuAction;
import org.eclipse.gmf.tooldef.Palette;
import org.eclipse.gmf.tooldef.ToolRegistry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.tooldef.impl.ToolRegistryImpl#getSharedActions <em>Shared Actions</em>}</li>
 *   <li>{@link org.eclipse.gmf.tooldef.impl.ToolRegistryImpl#getAllMenus <em>All Menus</em>}</li>
 *   <li>{@link org.eclipse.gmf.tooldef.impl.ToolRegistryImpl#getPalette <em>Palette</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolRegistryImpl extends EObjectImpl implements ToolRegistry {
	/**
	 * The cached value of the '{@link #getSharedActions() <em>Shared Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<MenuAction> sharedActions = null;

	/**
	 * The cached value of the '{@link #getAllMenus() <em>All Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> allMenus = null;

	/**
	 * The cached value of the '{@link #getPalette() <em>Palette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalette()
	 * @generated
	 * @ordered
	 */
	protected Palette palette = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFToolPackage.eINSTANCE.getToolRegistry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MenuAction> getSharedActions() {
		if (sharedActions == null) {
			sharedActions = new EObjectContainmentEList<MenuAction>(MenuAction.class, this, GMFToolPackage.TOOL_REGISTRY__SHARED_ACTIONS);
		}
		return sharedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getAllMenus() {
		if (allMenus == null) {
			allMenus = new EObjectContainmentEList<Menu>(Menu.class, this, GMFToolPackage.TOOL_REGISTRY__ALL_MENUS);
		}
		return allMenus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette getPalette() {
		return palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPalette(Palette newPalette, NotificationChain msgs) {
		Palette oldPalette = palette;
		palette = newPalette;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFToolPackage.TOOL_REGISTRY__PALETTE, oldPalette, newPalette);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalette(Palette newPalette) {
		if (newPalette != palette) {
			NotificationChain msgs = null;
			if (palette != null)
				msgs = ((InternalEObject) palette).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFToolPackage.TOOL_REGISTRY__PALETTE, null, msgs);
			if (newPalette != null)
				msgs = ((InternalEObject) newPalette).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFToolPackage.TOOL_REGISTRY__PALETTE, null, msgs);
			msgs = basicSetPalette(newPalette, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFToolPackage.TOOL_REGISTRY__PALETTE, newPalette, newPalette));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GMFToolPackage.TOOL_REGISTRY__SHARED_ACTIONS:
			return ((InternalEList<?>) getSharedActions()).basicRemove(otherEnd, msgs);
		case GMFToolPackage.TOOL_REGISTRY__ALL_MENUS:
			return ((InternalEList<?>) getAllMenus()).basicRemove(otherEnd, msgs);
		case GMFToolPackage.TOOL_REGISTRY__PALETTE:
			return basicSetPalette(null, msgs);
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
		case GMFToolPackage.TOOL_REGISTRY__SHARED_ACTIONS:
			return getSharedActions();
		case GMFToolPackage.TOOL_REGISTRY__ALL_MENUS:
			return getAllMenus();
		case GMFToolPackage.TOOL_REGISTRY__PALETTE:
			return getPalette();
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
		case GMFToolPackage.TOOL_REGISTRY__SHARED_ACTIONS:
			getSharedActions().clear();
			getSharedActions().addAll((Collection<? extends MenuAction>) newValue);
			return;
		case GMFToolPackage.TOOL_REGISTRY__ALL_MENUS:
			getAllMenus().clear();
			getAllMenus().addAll((Collection<? extends Menu>) newValue);
			return;
		case GMFToolPackage.TOOL_REGISTRY__PALETTE:
			setPalette((Palette) newValue);
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
		case GMFToolPackage.TOOL_REGISTRY__SHARED_ACTIONS:
			getSharedActions().clear();
			return;
		case GMFToolPackage.TOOL_REGISTRY__ALL_MENUS:
			getAllMenus().clear();
			return;
		case GMFToolPackage.TOOL_REGISTRY__PALETTE:
			setPalette((Palette) null);
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
		case GMFToolPackage.TOOL_REGISTRY__SHARED_ACTIONS:
			return sharedActions != null && !sharedActions.isEmpty();
		case GMFToolPackage.TOOL_REGISTRY__ALL_MENUS:
			return allMenus != null && !allMenus.isEmpty();
		case GMFToolPackage.TOOL_REGISTRY__PALETTE:
			return palette != null;
		}
		return super.eIsSet(featureID);
	}

} //ToolRegistryImpl
