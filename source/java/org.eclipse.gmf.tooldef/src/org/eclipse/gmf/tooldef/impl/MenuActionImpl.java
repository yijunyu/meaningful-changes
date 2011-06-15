/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.tooldef.ActionKind;
import org.eclipse.gmf.tooldef.GMFToolPackage;
import org.eclipse.gmf.tooldef.Image;
import org.eclipse.gmf.tooldef.MenuAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.tooldef.impl.MenuActionImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.gmf.tooldef.impl.MenuActionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.gmf.tooldef.impl.MenuActionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.gmf.tooldef.impl.MenuActionImpl#getHotKey <em>Hot Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuActionImpl extends EObjectImpl implements MenuAction {
	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected Image icon = null;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ActionKind KIND_EDEFAULT = ActionKind.CREATE_LITERAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ActionKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getHotKey() <em>Hot Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotKey()
	 * @generated
	 * @ordered
	 */
	protected static final String HOT_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHotKey() <em>Hot Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotKey()
	 * @generated
	 * @ordered
	 */
	protected String hotKey = HOT_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFToolPackage.eINSTANCE.getMenuAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(Image newIcon, NotificationChain msgs) {
		Image oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFToolPackage.MENU_ACTION__ICON, oldIcon, newIcon);
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
	public void setIcon(Image newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject) icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFToolPackage.MENU_ACTION__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject) newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFToolPackage.MENU_ACTION__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFToolPackage.MENU_ACTION__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFToolPackage.MENU_ACTION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ActionKind newKind) {
		ActionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFToolPackage.MENU_ACTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHotKey() {
		return hotKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotKey(String newHotKey) {
		String oldHotKey = hotKey;
		hotKey = newHotKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFToolPackage.MENU_ACTION__HOT_KEY, oldHotKey, hotKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GMFToolPackage.MENU_ACTION__ICON:
			return basicSetIcon(null, msgs);
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
		case GMFToolPackage.MENU_ACTION__ICON:
			return getIcon();
		case GMFToolPackage.MENU_ACTION__TITLE:
			return getTitle();
		case GMFToolPackage.MENU_ACTION__KIND:
			return getKind();
		case GMFToolPackage.MENU_ACTION__HOT_KEY:
			return getHotKey();
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
		case GMFToolPackage.MENU_ACTION__ICON:
			setIcon((Image) newValue);
			return;
		case GMFToolPackage.MENU_ACTION__TITLE:
			setTitle((String) newValue);
			return;
		case GMFToolPackage.MENU_ACTION__KIND:
			setKind((ActionKind) newValue);
			return;
		case GMFToolPackage.MENU_ACTION__HOT_KEY:
			setHotKey((String) newValue);
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
		case GMFToolPackage.MENU_ACTION__ICON:
			setIcon((Image) null);
			return;
		case GMFToolPackage.MENU_ACTION__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case GMFToolPackage.MENU_ACTION__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case GMFToolPackage.MENU_ACTION__HOT_KEY:
			setHotKey(HOT_KEY_EDEFAULT);
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
		case GMFToolPackage.MENU_ACTION__ICON:
			return icon != null;
		case GMFToolPackage.MENU_ACTION__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case GMFToolPackage.MENU_ACTION__KIND:
			return kind != KIND_EDEFAULT;
		case GMFToolPackage.MENU_ACTION__HOT_KEY:
			return HOT_KEY_EDEFAULT == null ? hotKey != null : !HOT_KEY_EDEFAULT.equals(hotKey);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", kind: ");
		result.append(kind);
		result.append(", hotKey: ");
		result.append(hotKey);
		result.append(')');
		return result.toString();
	}

} //MenuActionImpl
