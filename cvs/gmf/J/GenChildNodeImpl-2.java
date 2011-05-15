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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Child Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildNodeImpl#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildNodeImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildNodeImpl#getChildMetaFeature <em>Child Meta Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenChildNodeImpl extends GenNodeImpl implements GenChildNode {
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
	 * The cached value of the '{@link #getChildMetaFeature() <em>Child Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildMetaFeature()
	 * @generated
	 * @ordered
	 */
	protected EReference childMetaFeature = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenChildNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenChildNode();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CHILD_NODE__GROUP_ID, oldGroupID, groupID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNode getParentNode() {
		if (eContainerFeatureID != GMFGenPackage.GEN_CHILD_NODE__PARENT_NODE) return null;
		return (GenNode)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildMetaFeature() {
		if (childMetaFeature != null && childMetaFeature.eIsProxy()) {
			EReference oldChildMetaFeature = childMetaFeature;
			childMetaFeature = (EReference)eResolveProxy((InternalEObject)childMetaFeature);
			if (childMetaFeature != oldChildMetaFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_CHILD_NODE__CHILD_META_FEATURE, oldChildMetaFeature, childMetaFeature));
			}
		}
		return childMetaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetChildMetaFeature() {
		return childMetaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildMetaFeature(EReference newChildMetaFeature) {
		EReference oldChildMetaFeature = childMetaFeature;
		childMetaFeature = newChildMetaFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_CHILD_NODE__CHILD_META_FEATURE, oldChildMetaFeature, childMetaFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_CHILD_NODE__DIAGRAM:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_CHILD_NODE__DIAGRAM, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__CHILD_NODES:
					return ((InternalEList)getChildNodes()).basicAdd(otherEnd, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__PARENT_NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_CHILD_NODE__PARENT_NODE, msgs);
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
				case GMFGenPackage.GEN_CHILD_NODE__DIAGRAM:
					return eBasicSetContainer(null, GMFGenPackage.GEN_CHILD_NODE__DIAGRAM, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__CHILD_CONTAINERS:
					return ((InternalEList)getChildContainers()).basicRemove(otherEnd, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__CHILD_NODES:
					return ((InternalEList)getChildNodes()).basicRemove(otherEnd, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__PARENT_NODE:
					return eBasicSetContainer(null, GMFGenPackage.GEN_CHILD_NODE__PARENT_NODE, msgs);
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
				case GMFGenPackage.GEN_CHILD_NODE__DIAGRAM:
					return eContainer.eInverseRemove(this, GMFGenPackage.GEN_DIAGRAM__NODES, GenDiagram.class, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__PARENT_NODE:
					return eContainer.eInverseRemove(this, GMFGenPackage.GEN_NODE__CHILD_NODES, GenNode.class, msgs);
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
			case GMFGenPackage.GEN_CHILD_NODE__DIAGRAM_RUN_TIME_CLASS:
				if (resolve) return getDiagramRunTimeClass();
				return basicGetDiagramRunTimeClass();
			case GMFGenPackage.GEN_CHILD_NODE__VISUAL_ID:
				return new Integer(getVisualID());
			case GMFGenPackage.GEN_CHILD_NODE__EDIT_PART_CLASS_NAME:
				return getEditPartClassName();
			case GMFGenPackage.GEN_CHILD_NODE__META_INFO_PROVIDER_CLASS_NAME:
				return getMetaInfoProviderClassName();
			case GMFGenPackage.GEN_CHILD_NODE__DOMAIN_NAME_FEATURE:
				if (resolve) return getDomainNameFeature();
				return basicGetDomainNameFeature();
			case GMFGenPackage.GEN_CHILD_NODE__FOREGROUND_COLOR:
				return getForegroundColor();
			case GMFGenPackage.GEN_CHILD_NODE__CONTAINMENT_META_FEATURE:
				if (resolve) return getContainmentMetaFeature();
				return basicGetContainmentMetaFeature();
			case GMFGenPackage.GEN_CHILD_NODE__DIAGRAM:
				return getDiagram();
			case GMFGenPackage.GEN_CHILD_NODE__DOMAIN_META_CLASS:
				if (resolve) return getDomainMetaClass();
				return basicGetDomainMetaClass();
			case GMFGenPackage.GEN_CHILD_NODE__VIEWMAP_URI:
				return getViewmapURI();
			case GMFGenPackage.GEN_CHILD_NODE__NODE_VISUALIZATION_KIND:
				return new Integer(getNodeVisualizationKind());
			case GMFGenPackage.GEN_CHILD_NODE__VIEWMAP_CLASS:
				return getViewmapClass();
			case GMFGenPackage.GEN_CHILD_NODE__AFFIXED_STEREOTYPES:
				return getAffixedStereotypes();
			case GMFGenPackage.GEN_CHILD_NODE__BACKGROUND_COLOR:
				return getBackgroundColor();
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_CONTAINERS:
				return getChildContainers();
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_NODES:
				return getChildNodes();
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_CONTAINERS_PLACEMENT:
				return getChildContainersPlacement();
			case GMFGenPackage.GEN_CHILD_NODE__GROUP_ID:
				return getGroupID();
			case GMFGenPackage.GEN_CHILD_NODE__PARENT_NODE:
				return getParentNode();
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_META_FEATURE:
				if (resolve) return getChildMetaFeature();
				return basicGetChildMetaFeature();
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
			case GMFGenPackage.GEN_CHILD_NODE__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__VISUAL_ID:
				setVisualID(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.GEN_CHILD_NODE__EDIT_PART_CLASS_NAME:
				setEditPartClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__META_INFO_PROVIDER_CLASS_NAME:
				setMetaInfoProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__DOMAIN_NAME_FEATURE:
				setDomainNameFeature((EAttribute)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__FOREGROUND_COLOR:
				setForegroundColor((String)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__CONTAINMENT_META_FEATURE:
				setContainmentMetaFeature((EReference)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__DOMAIN_META_CLASS:
				setDomainMetaClass((EClass)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__VIEWMAP_URI:
				setViewmapURI((String)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__NODE_VISUALIZATION_KIND:
				setNodeVisualizationKind(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.GEN_CHILD_NODE__VIEWMAP_CLASS:
				setViewmapClass((String)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__AFFIXED_STEREOTYPES:
				getAffixedStereotypes().clear();
				getAffixedStereotypes().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_CONTAINERS:
				getChildContainers().clear();
				getChildContainers().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_NODES:
				getChildNodes().clear();
				getChildNodes().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_CONTAINERS_PLACEMENT:
				setChildContainersPlacement((CompartmentPlacementKind)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__GROUP_ID:
				setGroupID((String)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_META_FEATURE:
				setChildMetaFeature((EReference)newValue);
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
			case GMFGenPackage.GEN_CHILD_NODE__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)null);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__VISUAL_ID:
				setVisualID(VISUAL_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__EDIT_PART_CLASS_NAME:
				setEditPartClassName(EDIT_PART_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__META_INFO_PROVIDER_CLASS_NAME:
				setMetaInfoProviderClassName(META_INFO_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__DOMAIN_NAME_FEATURE:
				setDomainNameFeature((EAttribute)null);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__FOREGROUND_COLOR:
				setForegroundColor(FOREGROUND_COLOR_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__CONTAINMENT_META_FEATURE:
				setContainmentMetaFeature((EReference)null);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__DOMAIN_META_CLASS:
				setDomainMetaClass((EClass)null);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__VIEWMAP_URI:
				setViewmapURI(VIEWMAP_URI_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__NODE_VISUALIZATION_KIND:
				setNodeVisualizationKind(NODE_VISUALIZATION_KIND_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__VIEWMAP_CLASS:
				setViewmapClass(VIEWMAP_CLASS_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__AFFIXED_STEREOTYPES:
				getAffixedStereotypes().clear();
				return;
			case GMFGenPackage.GEN_CHILD_NODE__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_CONTAINERS:
				getChildContainers().clear();
				return;
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_NODES:
				getChildNodes().clear();
				return;
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_CONTAINERS_PLACEMENT:
				setChildContainersPlacement(CHILD_CONTAINERS_PLACEMENT_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__GROUP_ID:
				setGroupID(GROUP_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_META_FEATURE:
				setChildMetaFeature((EReference)null);
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
			case GMFGenPackage.GEN_CHILD_NODE__DIAGRAM_RUN_TIME_CLASS:
				return diagramRunTimeClass != null;
			case GMFGenPackage.GEN_CHILD_NODE__VISUAL_ID:
				return visualID != VISUAL_ID_EDEFAULT;
			case GMFGenPackage.GEN_CHILD_NODE__EDIT_PART_CLASS_NAME:
				return EDIT_PART_CLASS_NAME_EDEFAULT == null ? editPartClassName != null : !EDIT_PART_CLASS_NAME_EDEFAULT.equals(editPartClassName);
			case GMFGenPackage.GEN_CHILD_NODE__META_INFO_PROVIDER_CLASS_NAME:
				return META_INFO_PROVIDER_CLASS_NAME_EDEFAULT == null ? metaInfoProviderClassName != null : !META_INFO_PROVIDER_CLASS_NAME_EDEFAULT.equals(metaInfoProviderClassName);
			case GMFGenPackage.GEN_CHILD_NODE__DOMAIN_NAME_FEATURE:
				return domainNameFeature != null;
			case GMFGenPackage.GEN_CHILD_NODE__FOREGROUND_COLOR:
				return FOREGROUND_COLOR_EDEFAULT == null ? foregroundColor != null : !FOREGROUND_COLOR_EDEFAULT.equals(foregroundColor);
			case GMFGenPackage.GEN_CHILD_NODE__CONTAINMENT_META_FEATURE:
				return containmentMetaFeature != null;
			case GMFGenPackage.GEN_CHILD_NODE__DIAGRAM:
				return getDiagram() != null;
			case GMFGenPackage.GEN_CHILD_NODE__DOMAIN_META_CLASS:
				return domainMetaClass != null;
			case GMFGenPackage.GEN_CHILD_NODE__VIEWMAP_URI:
				return VIEWMAP_URI_EDEFAULT == null ? viewmapURI != null : !VIEWMAP_URI_EDEFAULT.equals(viewmapURI);
			case GMFGenPackage.GEN_CHILD_NODE__NODE_VISUALIZATION_KIND:
				return nodeVisualizationKind != NODE_VISUALIZATION_KIND_EDEFAULT;
			case GMFGenPackage.GEN_CHILD_NODE__VIEWMAP_CLASS:
				return VIEWMAP_CLASS_EDEFAULT == null ? viewmapClass != null : !VIEWMAP_CLASS_EDEFAULT.equals(viewmapClass);
			case GMFGenPackage.GEN_CHILD_NODE__AFFIXED_STEREOTYPES:
				return affixedStereotypes != null && !affixedStereotypes.isEmpty();
			case GMFGenPackage.GEN_CHILD_NODE__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null : !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_CONTAINERS:
				return childContainers != null && !childContainers.isEmpty();
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_NODES:
				return childNodes != null && !childNodes.isEmpty();
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_CONTAINERS_PLACEMENT:
				return childContainersPlacement != CHILD_CONTAINERS_PLACEMENT_EDEFAULT;
			case GMFGenPackage.GEN_CHILD_NODE__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupID != null : !GROUP_ID_EDEFAULT.equals(groupID);
			case GMFGenPackage.GEN_CHILD_NODE__PARENT_NODE:
				return getParentNode() != null;
			case GMFGenPackage.GEN_CHILD_NODE__CHILD_META_FEATURE:
				return childMetaFeature != null;
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
		result.append(')');
		return result.toString();
	}

	public GenDiagram getDiagram() {
		return getParentNode().getDiagram();
	}

	public String getClassNameSuffux() {
		return "ChildNode";
	}
} //GenChildNodeImpl