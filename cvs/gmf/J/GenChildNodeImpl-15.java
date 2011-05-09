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
import org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenElementInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.ModelElementSelector;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Child Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildNodeImpl#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildNodeImpl#getParentNode <em>Parent Node</em>}</li>
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_CHILD_NODE__MODEL_ELEMENT_INITIALIZER:
					if (modelElementInitializer != null)
						msgs = ((InternalEObject)modelElementInitializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_CHILD_NODE__MODEL_ELEMENT_INITIALIZER, null, msgs);
					return basicSetModelElementInitializer((GenElementInitializer)otherEnd, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__DIAGRAM:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_CHILD_NODE__DIAGRAM, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__LABELS:
					return ((InternalEList)getLabels()).basicAdd(otherEnd, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__CHILD_CONTAINERS:
					return ((InternalEList)getChildContainers()).basicAdd(otherEnd, msgs);
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
				case GMFGenPackage.GEN_CHILD_NODE__VIEWMAP:
					return basicSetViewmap(null, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__MODEL_ELEMENT_SELECTOR:
					return basicSetModelElementSelector(null, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__MODEL_ELEMENT_INITIALIZER:
					return basicSetModelElementInitializer(null, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__DIAGRAM:
					return eBasicSetContainer(null, GMFGenPackage.GEN_CHILD_NODE__DIAGRAM, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__MODEL_FACET:
					return basicSetModelFacet(null, msgs);
				case GMFGenPackage.GEN_CHILD_NODE__LABELS:
					return ((InternalEList)getLabels()).basicRemove(otherEnd, msgs);
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
			case GMFGenPackage.GEN_CHILD_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return getNotationViewFactoryClassName();
			case GMFGenPackage.GEN_CHILD_NODE__VIEWMAP:
				return getViewmap();
			case GMFGenPackage.GEN_CHILD_NODE__MODEL_ELEMENT_SELECTOR:
				return getModelElementSelector();
			case GMFGenPackage.GEN_CHILD_NODE__MODEL_ELEMENT_INITIALIZER:
				return getModelElementInitializer();
			case GMFGenPackage.GEN_CHILD_NODE__DIAGRAM:
				return getDiagram();
			case GMFGenPackage.GEN_CHILD_NODE__MODEL_FACET:
				return getModelFacet();
			case GMFGenPackage.GEN_CHILD_NODE__LABELS:
				return getLabels();
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
			case GMFGenPackage.GEN_CHILD_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__VIEWMAP:
				setViewmap((Viewmap)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__MODEL_ELEMENT_SELECTOR:
				setModelElementSelector((ModelElementSelector)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__MODEL_ELEMENT_INITIALIZER:
				setModelElementInitializer((GenElementInitializer)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__MODEL_FACET:
				setModelFacet((TypeModelFacet)newValue);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection)newValue);
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
			case GMFGenPackage.GEN_CHILD_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName(NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__VIEWMAP:
				setViewmap((Viewmap)null);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__MODEL_ELEMENT_SELECTOR:
				setModelElementSelector((ModelElementSelector)null);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__MODEL_ELEMENT_INITIALIZER:
				setModelElementInitializer((GenElementInitializer)null);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__MODEL_FACET:
				setModelFacet((TypeModelFacet)null);
				return;
			case GMFGenPackage.GEN_CHILD_NODE__LABELS:
				getLabels().clear();
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
			case GMFGenPackage.GEN_CHILD_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT == null ? notationViewFactoryClassName != null : !NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT.equals(notationViewFactoryClassName);
			case GMFGenPackage.GEN_CHILD_NODE__VIEWMAP:
				return viewmap != null;
			case GMFGenPackage.GEN_CHILD_NODE__MODEL_ELEMENT_SELECTOR:
				return modelElementSelector != null;
			case GMFGenPackage.GEN_CHILD_NODE__MODEL_ELEMENT_INITIALIZER:
				return modelElementInitializer != null;
			case GMFGenPackage.GEN_CHILD_NODE__DIAGRAM:
				return getDiagram() != null;
			case GMFGenPackage.GEN_CHILD_NODE__MODEL_FACET:
				return modelFacet != null;
			case GMFGenPackage.GEN_CHILD_NODE__LABELS:
				return labels != null && !labels.isEmpty();
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
