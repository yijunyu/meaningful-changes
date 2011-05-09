/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.codegen.gmfgen.EntryBase;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.EntryBaseImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.EntryBaseImpl#getTitleKey <em>Title Key</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.EntryBaseImpl#getDescriptionKey <em>Description Key</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.EntryBaseImpl#getLargeIconPath <em>Large Icon Path</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.EntryBaseImpl#getSmallIconPath <em>Small Icon Path</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.EntryBaseImpl#getCreateMethodName <em>Create Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EntryBaseImpl extends EObjectImpl implements EntryBase {
	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleKey() <em>Title Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleKey()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleKey() <em>Title Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleKey()
	 * @generated
	 * @ordered
	 */
	protected String titleKey = TITLE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionKey() <em>Description Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionKey()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionKey() <em>Description Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionKey()
	 * @generated
	 * @ordered
	 */
	protected String descriptionKey = DESCRIPTION_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeIconPath() <em>Large Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeIconPath()
	 * @generated
	 * @ordered
	 */
	protected static final String LARGE_ICON_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLargeIconPath() <em>Large Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeIconPath()
	 * @generated
	 * @ordered
	 */
	protected String largeIconPath = LARGE_ICON_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmallIconPath() <em>Small Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallIconPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SMALL_ICON_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmallIconPath() <em>Small Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallIconPath()
	 * @generated
	 * @ordered
	 */
	protected String smallIconPath = SMALL_ICON_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreateMethodName() <em>Create Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateMethodName() <em>Create Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateMethodName()
	 * @generated
	 * @ordered
	 */
	protected String createMethodName = CREATE_METHOD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getEntryBase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.ENTRY_BASE__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitleKey() {
		return titleKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleKey(String newTitleKey) {
		String oldTitleKey = titleKey;
		titleKey = newTitleKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.ENTRY_BASE__TITLE_KEY, oldTitleKey, titleKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionKey() {
		return descriptionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionKey(String newDescriptionKey) {
		String oldDescriptionKey = descriptionKey;
		descriptionKey = newDescriptionKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.ENTRY_BASE__DESCRIPTION_KEY, oldDescriptionKey, descriptionKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLargeIconPath() {
		return largeIconPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeIconPath(String newLargeIconPath) {
		String oldLargeIconPath = largeIconPath;
		largeIconPath = newLargeIconPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.ENTRY_BASE__LARGE_ICON_PATH, oldLargeIconPath, largeIconPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSmallIconPath() {
		return smallIconPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallIconPath(String newSmallIconPath) {
		String oldSmallIconPath = smallIconPath;
		smallIconPath = newSmallIconPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.ENTRY_BASE__SMALL_ICON_PATH, oldSmallIconPath, smallIconPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateMethodName() {
		return createMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateMethodName(String newCreateMethodName) {
		String oldCreateMethodName = createMethodName;
		createMethodName = newCreateMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.ENTRY_BASE__CREATE_METHOD_NAME, oldCreateMethodName, createMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.ENTRY_BASE__ORDER:
				return new Integer(getOrder());
			case GMFGenPackage.ENTRY_BASE__TITLE_KEY:
				return getTitleKey();
			case GMFGenPackage.ENTRY_BASE__DESCRIPTION_KEY:
				return getDescriptionKey();
			case GMFGenPackage.ENTRY_BASE__LARGE_ICON_PATH:
				return getLargeIconPath();
			case GMFGenPackage.ENTRY_BASE__SMALL_ICON_PATH:
				return getSmallIconPath();
			case GMFGenPackage.ENTRY_BASE__CREATE_METHOD_NAME:
				return getCreateMethodName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.ENTRY_BASE__ORDER:
				setOrder(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.ENTRY_BASE__TITLE_KEY:
				setTitleKey((String)newValue);
				return;
			case GMFGenPackage.ENTRY_BASE__DESCRIPTION_KEY:
				setDescriptionKey((String)newValue);
				return;
			case GMFGenPackage.ENTRY_BASE__LARGE_ICON_PATH:
				setLargeIconPath((String)newValue);
				return;
			case GMFGenPackage.ENTRY_BASE__SMALL_ICON_PATH:
				setSmallIconPath((String)newValue);
				return;
			case GMFGenPackage.ENTRY_BASE__CREATE_METHOD_NAME:
				setCreateMethodName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFGenPackage.ENTRY_BASE__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case GMFGenPackage.ENTRY_BASE__TITLE_KEY:
				setTitleKey(TITLE_KEY_EDEFAULT);
				return;
			case GMFGenPackage.ENTRY_BASE__DESCRIPTION_KEY:
				setDescriptionKey(DESCRIPTION_KEY_EDEFAULT);
				return;
			case GMFGenPackage.ENTRY_BASE__LARGE_ICON_PATH:
				setLargeIconPath(LARGE_ICON_PATH_EDEFAULT);
				return;
			case GMFGenPackage.ENTRY_BASE__SMALL_ICON_PATH:
				setSmallIconPath(SMALL_ICON_PATH_EDEFAULT);
				return;
			case GMFGenPackage.ENTRY_BASE__CREATE_METHOD_NAME:
				setCreateMethodName(CREATE_METHOD_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFGenPackage.ENTRY_BASE__ORDER:
				return order != ORDER_EDEFAULT;
			case GMFGenPackage.ENTRY_BASE__TITLE_KEY:
				return TITLE_KEY_EDEFAULT == null ? titleKey != null : !TITLE_KEY_EDEFAULT.equals(titleKey);
			case GMFGenPackage.ENTRY_BASE__DESCRIPTION_KEY:
				return DESCRIPTION_KEY_EDEFAULT == null ? descriptionKey != null : !DESCRIPTION_KEY_EDEFAULT.equals(descriptionKey);
			case GMFGenPackage.ENTRY_BASE__LARGE_ICON_PATH:
				return LARGE_ICON_PATH_EDEFAULT == null ? largeIconPath != null : !LARGE_ICON_PATH_EDEFAULT.equals(largeIconPath);
			case GMFGenPackage.ENTRY_BASE__SMALL_ICON_PATH:
				return SMALL_ICON_PATH_EDEFAULT == null ? smallIconPath != null : !SMALL_ICON_PATH_EDEFAULT.equals(smallIconPath);
			case GMFGenPackage.ENTRY_BASE__CREATE_METHOD_NAME:
				return CREATE_METHOD_NAME_EDEFAULT == null ? createMethodName != null : !CREATE_METHOD_NAME_EDEFAULT.equals(createMethodName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (order: ");
		result.append(order);
		result.append(", titleKey: ");
		result.append(titleKey);
		result.append(", descriptionKey: ");
		result.append(descriptionKey);
		result.append(", largeIconPath: ");
		result.append(largeIconPath);
		result.append(", smallIconPath: ");
		result.append(smallIconPath);
		result.append(", createMethodName: ");
		result.append(createMethodName);
		result.append(')');
		return result.toString();
	}

} //EntryBaseImpl
