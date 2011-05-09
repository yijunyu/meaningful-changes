/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.codegen.gmfgen.CompartmentLayoutKind;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Child Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl#getTitleKey <em>Title Key</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl#isCanCollapse <em>Can Collapse</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl#isHideIfEmpty <em>Hide If Empty</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl#isNeedsTitle <em>Needs Title</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl#getLayoutKind <em>Layout Kind</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl#getParentNode <em>Parent Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenChildContainerImpl extends GenCommonBaseImpl implements GenChildContainer {
	/**
	 * The default value of the '{@link #getGroupID() <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupID()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupID() <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupID()
	 * @generated
	 * @ordered
	 */
	protected String groupID = GROUP_ID_EDEFAULT;

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
	 * The default value of the '{@link #isCanCollapse() <em>Can Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanCollapse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_COLLAPSE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCanCollapse() <em>Can Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanCollapse()
	 * @generated
	 * @ordered
	 */
	protected boolean canCollapse = CAN_COLLAPSE_EDEFAULT;

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
	 * The default value of the '{@link #isNeedsTitle() <em>Needs Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_TITLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNeedsTitle() <em>Needs Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean needsTitle = NEEDS_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayoutKind() <em>Layout Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutKind()
	 * @generated
	 * @ordered
	 */
	protected static final CompartmentLayoutKind LAYOUT_KIND_EDEFAULT = CompartmentLayoutKind.BORDER_LITERAL;

	/**
	 * The cached value of the '{@link #getLayoutKind() <em>Layout Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutKind()
	 * @generated
	 * @ordered
	 */
	protected CompartmentLayoutKind layoutKind = LAYOUT_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenChildContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenChildContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupID() {
		return groupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupID(String newGroupID) {
		String oldGroupID = groupID;
		groupID = newGroupID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CHILD_CONTAINER__GROUP_ID, oldGroupID, groupID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CHILD_CONTAINER__TITLE_KEY, oldTitleKey, titleKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanCollapse() {
		return canCollapse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanCollapse(boolean newCanCollapse) {
		boolean oldCanCollapse = canCollapse;
		canCollapse = newCanCollapse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CHILD_CONTAINER__CAN_COLLAPSE, oldCanCollapse, canCollapse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CHILD_CONTAINER__HIDE_IF_EMPTY, oldHideIfEmpty, hideIfEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsTitle() {
		return needsTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsTitle(boolean newNeedsTitle) {
		boolean oldNeedsTitle = needsTitle;
		needsTitle = newNeedsTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CHILD_CONTAINER__NEEDS_TITLE, oldNeedsTitle, needsTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentLayoutKind getLayoutKind() {
		return layoutKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutKind(CompartmentLayoutKind newLayoutKind) {
		CompartmentLayoutKind oldLayoutKind = layoutKind;
		layoutKind = newLayoutKind == null ? LAYOUT_KIND_EDEFAULT : newLayoutKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CHILD_CONTAINER__LAYOUT_KIND, oldLayoutKind, layoutKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNode getParentNode() {
		if (eContainerFeatureID != GMFGenPackage.GEN_CHILD_CONTAINER__PARENT_NODE) return null;
		return (GenNode)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_CHILD_CONTAINER__PARENT_NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_CHILD_CONTAINER__PARENT_NODE, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_CHILD_CONTAINER__PARENT_NODE:
					return eBasicSetContainer(null, GMFGenPackage.GEN_CHILD_CONTAINER__PARENT_NODE, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case GMFGenPackage.GEN_CHILD_CONTAINER__PARENT_NODE:
					return eContainer.eInverseRemove(this, GMFGenPackage.GEN_NODE__CHILD_CONTAINERS, GenNode.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_CHILD_CONTAINER__DIAGRAM_RUN_TIME_CLASS:
				if (resolve) return getDiagramRunTimeClass();
				return basicGetDiagramRunTimeClass();
			case GMFGenPackage.GEN_CHILD_CONTAINER__VISUAL_ID:
				return new Integer(getVisualID());
			case GMFGenPackage.GEN_CHILD_CONTAINER__EDIT_PART_CLASS_NAME:
				return getEditPartClassName();
			case GMFGenPackage.GEN_CHILD_CONTAINER__GROUP_ID:
				return getGroupID();
			case GMFGenPackage.GEN_CHILD_CONTAINER__TITLE_KEY:
				return getTitleKey();
			case GMFGenPackage.GEN_CHILD_CONTAINER__CAN_COLLAPSE:
				return isCanCollapse() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_CHILD_CONTAINER__HIDE_IF_EMPTY:
				return isHideIfEmpty() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_CHILD_CONTAINER__NEEDS_TITLE:
				return isNeedsTitle() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_CHILD_CONTAINER__LAYOUT_KIND:
				return getLayoutKind();
			case GMFGenPackage.GEN_CHILD_CONTAINER__PARENT_NODE:
				return getParentNode();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_CHILD_CONTAINER__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__VISUAL_ID:
				setVisualID(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__EDIT_PART_CLASS_NAME:
				setEditPartClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__GROUP_ID:
				setGroupID((String)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__TITLE_KEY:
				setTitleKey((String)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__CAN_COLLAPSE:
				setCanCollapse(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__HIDE_IF_EMPTY:
				setHideIfEmpty(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__NEEDS_TITLE:
				setNeedsTitle(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__LAYOUT_KIND:
				setLayoutKind((CompartmentLayoutKind)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_CHILD_CONTAINER__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)null);
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__VISUAL_ID:
				setVisualID(VISUAL_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__EDIT_PART_CLASS_NAME:
				setEditPartClassName(EDIT_PART_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__GROUP_ID:
				setGroupID(GROUP_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__TITLE_KEY:
				setTitleKey(TITLE_KEY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__CAN_COLLAPSE:
				setCanCollapse(CAN_COLLAPSE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__HIDE_IF_EMPTY:
				setHideIfEmpty(HIDE_IF_EMPTY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__NEEDS_TITLE:
				setNeedsTitle(NEEDS_TITLE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_CONTAINER__LAYOUT_KIND:
				setLayoutKind(LAYOUT_KIND_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_CHILD_CONTAINER__DIAGRAM_RUN_TIME_CLASS:
				return diagramRunTimeClass != null;
			case GMFGenPackage.GEN_CHILD_CONTAINER__VISUAL_ID:
				return visualID != VISUAL_ID_EDEFAULT;
			case GMFGenPackage.GEN_CHILD_CONTAINER__EDIT_PART_CLASS_NAME:
				return EDIT_PART_CLASS_NAME_EDEFAULT == null ? editPartClassName != null : !EDIT_PART_CLASS_NAME_EDEFAULT.equals(editPartClassName);
			case GMFGenPackage.GEN_CHILD_CONTAINER__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupID != null : !GROUP_ID_EDEFAULT.equals(groupID);
			case GMFGenPackage.GEN_CHILD_CONTAINER__TITLE_KEY:
				return TITLE_KEY_EDEFAULT == null ? titleKey != null : !TITLE_KEY_EDEFAULT.equals(titleKey);
			case GMFGenPackage.GEN_CHILD_CONTAINER__CAN_COLLAPSE:
				return canCollapse != CAN_COLLAPSE_EDEFAULT;
			case GMFGenPackage.GEN_CHILD_CONTAINER__HIDE_IF_EMPTY:
				return hideIfEmpty != HIDE_IF_EMPTY_EDEFAULT;
			case GMFGenPackage.GEN_CHILD_CONTAINER__NEEDS_TITLE:
				return needsTitle != NEEDS_TITLE_EDEFAULT;
			case GMFGenPackage.GEN_CHILD_CONTAINER__LAYOUT_KIND:
				return layoutKind != LAYOUT_KIND_EDEFAULT;
			case GMFGenPackage.GEN_CHILD_CONTAINER__PARENT_NODE:
				return getParentNode() != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (groupID: ");
		result.append(groupID);
		result.append(", titleKey: ");
		result.append(titleKey);
		result.append(", canCollapse: ");
		result.append(canCollapse);
		result.append(", hideIfEmpty: ");
		result.append(hideIfEmpty);
		result.append(", needsTitle: ");
		result.append(needsTitle);
		result.append(", layoutKind: ");
		result.append(layoutKind);
		result.append(')');
		return result.toString();
	}

	public String getClassNamePrefix() {
		return getGroupID() == null ? "GenContainer$" + hashCode() : getGroupID();
	}

	public String getClassNameSuffux() {
		return "Container";
	}

	public GenDiagram getDiagram() {
		GenNode parentNode = getParentNode();
		if (parentNode == null) {
			return null;
		}
		return parentNode.getDiagram();
	}

} //GenChildContainerImpl
