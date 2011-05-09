/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.codegen.gmfgen.CompartmentLayoutKind;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl#isCanCollapse <em>Can Collapse</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl#isHideIfEmpty <em>Hide If Empty</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl#isNeedsTitle <em>Needs Title</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl#getLayoutKind <em>Layout Kind</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCompartmentImpl extends GenChildContainerImpl implements GenCompartment {
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
	protected GenCompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenCompartment();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMPARTMENT__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMPARTMENT__CAN_COLLAPSE, oldCanCollapse, canCollapse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMPARTMENT__HIDE_IF_EMPTY, oldHideIfEmpty, hideIfEmpty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMPARTMENT__NEEDS_TITLE, oldNeedsTitle, needsTitle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMPARTMENT__LAYOUT_KIND, oldLayoutKind, layoutKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNode getNode() {
		if (eContainerFeatureID != GMFGenPackage.GEN_COMPARTMENT__NODE) return null;
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
				case GMFGenPackage.GEN_COMPARTMENT__CHILD_NODES:
					return ((InternalEList)getChildNodes()).basicAdd(otherEnd, msgs);
				case GMFGenPackage.GEN_COMPARTMENT__NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_COMPARTMENT__NODE, msgs);
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
				case GMFGenPackage.GEN_COMPARTMENT__VIEWMAP:
					return basicSetViewmap(null, msgs);
				case GMFGenPackage.GEN_COMPARTMENT__CHILD_NODES:
					return ((InternalEList)getChildNodes()).basicRemove(otherEnd, msgs);
				case GMFGenPackage.GEN_COMPARTMENT__NODE:
					return eBasicSetContainer(null, GMFGenPackage.GEN_COMPARTMENT__NODE, msgs);
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
				case GMFGenPackage.GEN_COMPARTMENT__NODE:
					return eContainer.eInverseRemove(this, GMFGenPackage.GEN_NODE__COMPARTMENTS, GenNode.class, msgs);
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
			case GMFGenPackage.GEN_COMPARTMENT__DIAGRAM_RUN_TIME_CLASS:
				if (resolve) return getDiagramRunTimeClass();
				return basicGetDiagramRunTimeClass();
			case GMFGenPackage.GEN_COMPARTMENT__VISUAL_ID:
				return new Integer(getVisualID());
			case GMFGenPackage.GEN_COMPARTMENT__EDIT_PART_CLASS_NAME:
				return getEditPartClassName();
			case GMFGenPackage.GEN_COMPARTMENT__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return getItemSemanticEditPolicyClassName();
			case GMFGenPackage.GEN_COMPARTMENT__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return getNotationViewFactoryClassName();
			case GMFGenPackage.GEN_COMPARTMENT__VIEWMAP:
				return getViewmap();
			case GMFGenPackage.GEN_COMPARTMENT__CHILD_NODES:
				return getChildNodes();
			case GMFGenPackage.GEN_COMPARTMENT__TITLE:
				return getTitle();
			case GMFGenPackage.GEN_COMPARTMENT__CAN_COLLAPSE:
				return isCanCollapse() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_COMPARTMENT__HIDE_IF_EMPTY:
				return isHideIfEmpty() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_COMPARTMENT__NEEDS_TITLE:
				return isNeedsTitle() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_COMPARTMENT__LAYOUT_KIND:
				return getLayoutKind();
			case GMFGenPackage.GEN_COMPARTMENT__NODE:
				return getNode();
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
			case GMFGenPackage.GEN_COMPARTMENT__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__VISUAL_ID:
				setVisualID(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.GEN_COMPARTMENT__EDIT_PART_CLASS_NAME:
				setEditPartClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setItemSemanticEditPolicyClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__VIEWMAP:
				setViewmap((Viewmap)newValue);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__CHILD_NODES:
				getChildNodes().clear();
				getChildNodes().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__TITLE:
				setTitle((String)newValue);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__CAN_COLLAPSE:
				setCanCollapse(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_COMPARTMENT__HIDE_IF_EMPTY:
				setHideIfEmpty(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_COMPARTMENT__NEEDS_TITLE:
				setNeedsTitle(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_COMPARTMENT__LAYOUT_KIND:
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
			case GMFGenPackage.GEN_COMPARTMENT__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)null);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__VISUAL_ID:
				setVisualID(VISUAL_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__EDIT_PART_CLASS_NAME:
				setEditPartClassName(EDIT_PART_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setItemSemanticEditPolicyClassName(ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName(NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__VIEWMAP:
				setViewmap((Viewmap)null);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__CHILD_NODES:
				getChildNodes().clear();
				return;
			case GMFGenPackage.GEN_COMPARTMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__CAN_COLLAPSE:
				setCanCollapse(CAN_COLLAPSE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__HIDE_IF_EMPTY:
				setHideIfEmpty(HIDE_IF_EMPTY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__NEEDS_TITLE:
				setNeedsTitle(NEEDS_TITLE_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMPARTMENT__LAYOUT_KIND:
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
			case GMFGenPackage.GEN_COMPARTMENT__DIAGRAM_RUN_TIME_CLASS:
				return diagramRunTimeClass != null;
			case GMFGenPackage.GEN_COMPARTMENT__VISUAL_ID:
				return visualID != VISUAL_ID_EDEFAULT;
			case GMFGenPackage.GEN_COMPARTMENT__EDIT_PART_CLASS_NAME:
				return EDIT_PART_CLASS_NAME_EDEFAULT == null ? editPartClassName != null : !EDIT_PART_CLASS_NAME_EDEFAULT.equals(editPartClassName);
			case GMFGenPackage.GEN_COMPARTMENT__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? itemSemanticEditPolicyClassName != null : !ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(itemSemanticEditPolicyClassName);
			case GMFGenPackage.GEN_COMPARTMENT__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT == null ? notationViewFactoryClassName != null : !NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT.equals(notationViewFactoryClassName);
			case GMFGenPackage.GEN_COMPARTMENT__VIEWMAP:
				return viewmap != null;
			case GMFGenPackage.GEN_COMPARTMENT__CHILD_NODES:
				return childNodes != null && !childNodes.isEmpty();
			case GMFGenPackage.GEN_COMPARTMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GMFGenPackage.GEN_COMPARTMENT__CAN_COLLAPSE:
				return canCollapse != CAN_COLLAPSE_EDEFAULT;
			case GMFGenPackage.GEN_COMPARTMENT__HIDE_IF_EMPTY:
				return hideIfEmpty != HIDE_IF_EMPTY_EDEFAULT;
			case GMFGenPackage.GEN_COMPARTMENT__NEEDS_TITLE:
				return needsTitle != NEEDS_TITLE_EDEFAULT;
			case GMFGenPackage.GEN_COMPARTMENT__LAYOUT_KIND:
				return layoutKind != LAYOUT_KIND_EDEFAULT;
			case GMFGenPackage.GEN_COMPARTMENT__NODE:
				return getNode() != null;
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
		result.append(" (title: ");
		result.append(title);
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
		if (getTitle() == null) {
			return "GenContainer$" + hashCode();
		}
		char[] chars = getTitle().toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (i == 0) {
				if (!Character.isJavaIdentifierStart(chars[i])) {
					chars[i] = '_';
				}
			} else {
				if (!Character.isJavaIdentifierPart(chars[i])) {
					chars[i] = '_';
				}
			}
		}
		return new String(chars);
	}

	public String getClassNameSuffux() {
		return "Container";
	}

	public GenDiagram getDiagram() {
		return getNode().getDiagram();
	}

	public String getUniqueIdentifier() {
		return getClassNamePrefix() + "_" + getVisualID();
	}

	public String getItemSemanticEditPolicyClassName() {
		String value = getItemSemanticEditPolicyClassNameGen();
		if (value == null || value.length() == 0) {
			return "Compartment_" + getClassNamePrefix() + getClassNameSuffux() + "ItemSemanticEditPolicy";
		}
		return value;
	}

} //GenCompartmentImpl
