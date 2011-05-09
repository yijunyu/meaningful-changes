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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference;
import org.eclipse.gmf.codegen.gmfgen.GenNavigatorReferenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Navigator Child Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getGroupIcon <em>Group Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenNavigatorChildReferenceImpl extends EObjectImpl implements GenNavigatorChildReference {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected GenCommonBase parent = null;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected GenCommonBase child = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected GenLabel label = null;

	/**
	 * The default value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected static final GenNavigatorReferenceType REFERENCE_TYPE_EDEFAULT = GenNavigatorReferenceType.CHILDREN_LITERAL;

	/**
	 * The cached value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected GenNavigatorReferenceType referenceType = REFERENCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupIcon() <em>Group Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupIcon() <em>Group Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIcon()
	 * @generated
	 * @ordered
	 */
	protected String groupIcon = GROUP_ICON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenNavigatorChildReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenNavigatorChildReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCommonBase getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (GenCommonBase)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCommonBase basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(GenCommonBase newParent) {
		GenCommonBase oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCommonBase getChild() {
		if (child != null && child.eIsProxy()) {
			InternalEObject oldChild = (InternalEObject)child;
			child = (GenCommonBase)eResolveProxy(oldChild);
			if (child != oldChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__CHILD, oldChild, child));
			}
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCommonBase basicGetChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(GenCommonBase newChild) {
		GenCommonBase oldChild = child;
		child = newChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__CHILD, oldChild, child));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLabel getLabel() {
		if (label != null && label.eIsProxy()) {
			InternalEObject oldLabel = (InternalEObject)label;
			label = (GenLabel)eResolveProxy(oldLabel);
			if (label != oldLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__LABEL, oldLabel, label));
			}
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLabel basicGetLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(GenLabel newLabel) {
		GenLabel oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNavigatorReferenceType getReferenceType() {
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceType(GenNavigatorReferenceType newReferenceType) {
		GenNavigatorReferenceType oldReferenceType = referenceType;
		referenceType = newReferenceType == null ? REFERENCE_TYPE_EDEFAULT : newReferenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__REFERENCE_TYPE, oldReferenceType, referenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupIcon() {
		return groupIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupIcon(String newGroupIcon) {
		String oldGroupIcon = groupIcon;
		groupIcon = newGroupIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_ICON, oldGroupIcon, groupIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInsideGroup() {
		return getGroupName() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__CHILD:
				if (resolve) return getChild();
				return basicGetChild();
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__LABEL:
				if (resolve) return getLabel();
				return basicGetLabel();
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__REFERENCE_TYPE:
				return getReferenceType();
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_NAME:
				return getGroupName();
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_ICON:
				return getGroupIcon();
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
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__PARENT:
				setParent((GenCommonBase)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__CHILD:
				setChild((GenCommonBase)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__LABEL:
				setLabel((GenLabel)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__REFERENCE_TYPE:
				setReferenceType((GenNavigatorReferenceType)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_ICON:
				setGroupIcon((String)newValue);
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
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__PARENT:
				setParent((GenCommonBase)null);
				return;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__CHILD:
				setChild((GenCommonBase)null);
				return;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__LABEL:
				setLabel((GenLabel)null);
				return;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__REFERENCE_TYPE:
				setReferenceType(REFERENCE_TYPE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_ICON:
				setGroupIcon(GROUP_ICON_EDEFAULT);
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
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__PARENT:
				return parent != null;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__CHILD:
				return child != null;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__LABEL:
				return label != null;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__REFERENCE_TYPE:
				return referenceType != REFERENCE_TYPE_EDEFAULT;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_ICON:
				return GROUP_ICON_EDEFAULT == null ? groupIcon != null : !GROUP_ICON_EDEFAULT.equals(groupIcon);
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
		result.append(" (referenceType: ");
		result.append(referenceType);
		result.append(", groupName: ");
		result.append(groupName);
		result.append(", groupIcon: ");
		result.append(groupIcon);
		result.append(')');
		return result.toString();
	}

} //GenNavigatorChildReferenceImpl