/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList.UnmodifiableEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenNavigator;
import org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference;
import org.eclipse.gmf.codegen.gmfgen.GenNavigatorPath;
import org.eclipse.gmf.codegen.gmfgen.GenNavigatorPathSegment;
import org.eclipse.gmf.codegen.gmfgen.GenNavigatorReferenceType;
import org.eclipse.gmf.internal.codegen.util.GenModelGraphAnalyzer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Navigator Child Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getNavigator <em>Navigator</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getGroupIcon <em>Group Icon</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#isHideIfEmpty <em>Hide If Empty</em>}</li>
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
	protected GenCommonBase parent;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected GenCommonBase child;

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
	 * The default value of the '{@link #isHideIfEmpty() <em>Hide If Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideIfEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_IF_EMPTY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHideIfEmpty() <em>Hide If Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideIfEmpty()
	 * @generated
	 * @ordered
	 */
	protected boolean hideIfEmpty = HIDE_IF_EMPTY_EDEFAULT;

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
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenNavigatorChildReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNavigator getNavigator() {
		if (eContainerFeatureID != GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__NAVIGATOR) return null;
		return (GenNavigator)eContainer();
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
	public void setGroupNameGen(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_NAME, oldGroupName, groupName));
	}

	public void setGroupName(String newGroupName) {
		if (newGroupName != null) {
			newGroupName = newGroupName.trim();
		}
		setGroupNameGen(newGroupName);
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
	public void setGroupIconGen(String newGroupIcon) {
		String oldGroupIcon = groupIcon;
		groupIcon = newGroupIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_ICON, oldGroupIcon, groupIcon));
	}

	public void setGroupIcon(String newGroupIcon) {
		if (newGroupIcon != null) {
			newGroupIcon = newGroupIcon.trim();
		}
		setGroupIconGen(newGroupIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideIfEmpty() {
		return hideIfEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideIfEmpty(boolean newHideIfEmpty) {
		boolean oldHideIfEmpty = hideIfEmpty;
		hideIfEmpty = newHideIfEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__HIDE_IF_EMPTY, oldHideIfEmpty, hideIfEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInsideGroup() {
		return getGroupName() != null && getGroupName().length() > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<GenNavigatorPath> findConnectionPaths() {
		Collection<GenNavigatorPath> result = new ArrayList<GenNavigatorPath>();
		for (List<GenCommonBase> nextPath : GenModelGraphAnalyzer.getConnectionPaths(this)) {
			GenNavigatorPath navigatorPath = GMFGenFactory.eINSTANCE.createGenNavigatorPath();
			for (int i = 0; i < nextPath.size() - 1; ) {
				GenNavigatorPathSegment nextSegment = GMFGenFactory.eINSTANCE.createGenNavigatorPathSegment();
				nextSegment.setFrom(nextPath.get(i));
				nextSegment.setTo(nextPath.get(++i));
				navigatorPath.getSegments().add(nextSegment);
			}
			result.add(navigatorPath);
		}
		return new UnmodifiableEList<GenNavigatorPath>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__NAVIGATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__NAVIGATOR, msgs);
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
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__NAVIGATOR:
				return eBasicSetContainer(null, GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__NAVIGATOR, msgs);
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
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__NAVIGATOR:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_NAVIGATOR__CHILD_REFERENCES, GenNavigator.class, msgs);
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
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__NAVIGATOR:
				return getNavigator();
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__CHILD:
				if (resolve) return getChild();
				return basicGetChild();
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__REFERENCE_TYPE:
				return getReferenceType();
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_NAME:
				return getGroupName();
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_ICON:
				return getGroupIcon();
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__HIDE_IF_EMPTY:
				return isHideIfEmpty() ? Boolean.TRUE : Boolean.FALSE;
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
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__PARENT:
				setParent((GenCommonBase)newValue);
				return;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__CHILD:
				setChild((GenCommonBase)newValue);
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
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__HIDE_IF_EMPTY:
				setHideIfEmpty(((Boolean)newValue).booleanValue());
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
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__PARENT:
				setParent((GenCommonBase)null);
				return;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__CHILD:
				setChild((GenCommonBase)null);
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
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__HIDE_IF_EMPTY:
				setHideIfEmpty(HIDE_IF_EMPTY_EDEFAULT);
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
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__NAVIGATOR:
				return getNavigator() != null;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__PARENT:
				return parent != null;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__CHILD:
				return child != null;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__REFERENCE_TYPE:
				return referenceType != REFERENCE_TYPE_EDEFAULT;
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_ICON:
				return GROUP_ICON_EDEFAULT == null ? groupIcon != null : !GROUP_ICON_EDEFAULT.equals(groupIcon);
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE__HIDE_IF_EMPTY:
				return hideIfEmpty != HIDE_IF_EMPTY_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (referenceType: ");
		result.append(referenceType);
		result.append(", groupName: ");
		result.append(groupName);
		result.append(", groupIcon: ");
		result.append(groupIcon);
		result.append(", hideIfEmpty: ");
		result.append(hideIfEmpty);
		result.append(')');
		return result.toString();
	}

} //GenNavigatorChildReferenceImpl