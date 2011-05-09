/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.gmfgraph.Node;

import org.eclipse.gmf.mappings.AppearanceSteward;
import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.MenuOwner;
import org.eclipse.gmf.mappings.NodeMapping;

import org.eclipse.gmf.mappings.ToolOwner;

import org.eclipse.gmf.tooldef.AbstractTool;
import org.eclipse.gmf.tooldef.ContextMenu;
import org.eclipse.gmf.tooldef.StyleSelector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.NodeMappingImpl#getContextMenu <em>Context Menu</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.NodeMappingImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.NodeMappingImpl#getAppearanceStyle <em>Appearance Style</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.NodeMappingImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.NodeMappingImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.NodeMappingImpl#getDiagramNode <em>Diagram Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeMappingImpl extends MappingEntryImpl implements NodeMapping {
	/**
	 * The cached value of the '{@link #getContextMenu() <em>Context Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextMenu()
	 * @generated
	 * @ordered
	 */
	protected ContextMenu contextMenu = null;

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected AbstractTool tool = null;

	/**
	 * The cached value of the '{@link #getAppearanceStyle() <em>Appearance Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearanceStyle()
	 * @generated
	 * @ordered
	 */
	protected StyleSelector appearanceStyle = null;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList children = null;

	/**
	 * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList compartments = null;

	/**
	 * The cached value of the '{@link #getDiagramNode() <em>Diagram Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramNode()
	 * @generated
	 * @ordered
	 */
	protected Node diagramNode = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getNodeMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextMenu getContextMenu() {
		if (contextMenu != null && contextMenu.eIsProxy()) {
			InternalEObject oldContextMenu = (InternalEObject)contextMenu;
			contextMenu = (ContextMenu)eResolveProxy(oldContextMenu);
			if (contextMenu != oldContextMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.NODE_MAPPING__CONTEXT_MENU, oldContextMenu, contextMenu));
			}
		}
		return contextMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextMenu basicGetContextMenu() {
		return contextMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextMenu(ContextMenu newContextMenu) {
		ContextMenu oldContextMenu = contextMenu;
		contextMenu = newContextMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.NODE_MAPPING__CONTEXT_MENU, oldContextMenu, contextMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTool getTool() {
		if (tool != null && tool.eIsProxy()) {
			InternalEObject oldTool = (InternalEObject)tool;
			tool = (AbstractTool)eResolveProxy(oldTool);
			if (tool != oldTool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.NODE_MAPPING__TOOL, oldTool, tool));
			}
		}
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTool basicGetTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(AbstractTool newTool) {
		AbstractTool oldTool = tool;
		tool = newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.NODE_MAPPING__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSelector getAppearanceStyle() {
		if (appearanceStyle != null && appearanceStyle.eIsProxy()) {
			InternalEObject oldAppearanceStyle = (InternalEObject)appearanceStyle;
			appearanceStyle = (StyleSelector)eResolveProxy(oldAppearanceStyle);
			if (appearanceStyle != oldAppearanceStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.NODE_MAPPING__APPEARANCE_STYLE, oldAppearanceStyle, appearanceStyle));
			}
		}
		return appearanceStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSelector basicGetAppearanceStyle() {
		return appearanceStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearanceStyle(StyleSelector newAppearanceStyle) {
		StyleSelector oldAppearanceStyle = appearanceStyle;
		appearanceStyle = newAppearanceStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.NODE_MAPPING__APPEARANCE_STYLE, oldAppearanceStyle, appearanceStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList(ChildReference.class, this, GMFMapPackage.NODE_MAPPING__CHILDREN, GMFMapPackage.CHILD_REFERENCE__PARENT_NODE);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCompartments() {
		if (compartments == null) {
			compartments = new EObjectContainmentWithInverseEList(CompartmentMapping.class, this, GMFMapPackage.NODE_MAPPING__COMPARTMENTS, GMFMapPackage.COMPARTMENT_MAPPING__PARENT_NODE);
		}
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getDiagramNode() {
		if (diagramNode != null && diagramNode.eIsProxy()) {
			InternalEObject oldDiagramNode = (InternalEObject)diagramNode;
			diagramNode = (Node)eResolveProxy(oldDiagramNode);
			if (diagramNode != oldDiagramNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.NODE_MAPPING__DIAGRAM_NODE, oldDiagramNode, diagramNode));
			}
		}
		return diagramNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetDiagramNode() {
		return diagramNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramNode(Node newDiagramNode) {
		Node oldDiagramNode = diagramNode;
		diagramNode = newDiagramNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.NODE_MAPPING__DIAGRAM_NODE, oldDiagramNode, diagramNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.NODE_MAPPING__CHILDREN:
				return ((InternalEList)getChildren()).basicAdd(otherEnd, msgs);
			case GMFMapPackage.NODE_MAPPING__COMPARTMENTS:
				return ((InternalEList)getCompartments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.NODE_MAPPING__CHILDREN:
				return ((InternalEList)getChildren()).basicRemove(otherEnd, msgs);
			case GMFMapPackage.NODE_MAPPING__COMPARTMENTS:
				return ((InternalEList)getCompartments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFMapPackage.NODE_MAPPING__CONTEXT_MENU:
				if (resolve) return getContextMenu();
				return basicGetContextMenu();
			case GMFMapPackage.NODE_MAPPING__TOOL:
				if (resolve) return getTool();
				return basicGetTool();
			case GMFMapPackage.NODE_MAPPING__APPEARANCE_STYLE:
				if (resolve) return getAppearanceStyle();
				return basicGetAppearanceStyle();
			case GMFMapPackage.NODE_MAPPING__CHILDREN:
				return getChildren();
			case GMFMapPackage.NODE_MAPPING__COMPARTMENTS:
				return getCompartments();
			case GMFMapPackage.NODE_MAPPING__DIAGRAM_NODE:
				if (resolve) return getDiagramNode();
				return basicGetDiagramNode();
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
			case GMFMapPackage.NODE_MAPPING__CONTEXT_MENU:
				setContextMenu((ContextMenu)newValue);
				return;
			case GMFMapPackage.NODE_MAPPING__TOOL:
				setTool((AbstractTool)newValue);
				return;
			case GMFMapPackage.NODE_MAPPING__APPEARANCE_STYLE:
				setAppearanceStyle((StyleSelector)newValue);
				return;
			case GMFMapPackage.NODE_MAPPING__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection)newValue);
				return;
			case GMFMapPackage.NODE_MAPPING__COMPARTMENTS:
				getCompartments().clear();
				getCompartments().addAll((Collection)newValue);
				return;
			case GMFMapPackage.NODE_MAPPING__DIAGRAM_NODE:
				setDiagramNode((Node)newValue);
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
			case GMFMapPackage.NODE_MAPPING__CONTEXT_MENU:
				setContextMenu((ContextMenu)null);
				return;
			case GMFMapPackage.NODE_MAPPING__TOOL:
				setTool((AbstractTool)null);
				return;
			case GMFMapPackage.NODE_MAPPING__APPEARANCE_STYLE:
				setAppearanceStyle((StyleSelector)null);
				return;
			case GMFMapPackage.NODE_MAPPING__CHILDREN:
				getChildren().clear();
				return;
			case GMFMapPackage.NODE_MAPPING__COMPARTMENTS:
				getCompartments().clear();
				return;
			case GMFMapPackage.NODE_MAPPING__DIAGRAM_NODE:
				setDiagramNode((Node)null);
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
			case GMFMapPackage.NODE_MAPPING__CONTEXT_MENU:
				return contextMenu != null;
			case GMFMapPackage.NODE_MAPPING__TOOL:
				return tool != null;
			case GMFMapPackage.NODE_MAPPING__APPEARANCE_STYLE:
				return appearanceStyle != null;
			case GMFMapPackage.NODE_MAPPING__CHILDREN:
				return children != null && !children.isEmpty();
			case GMFMapPackage.NODE_MAPPING__COMPARTMENTS:
				return compartments != null && !compartments.isEmpty();
			case GMFMapPackage.NODE_MAPPING__DIAGRAM_NODE:
				return diagramNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == MenuOwner.class) {
			switch (derivedFeatureID) {
				case GMFMapPackage.NODE_MAPPING__CONTEXT_MENU: return GMFMapPackage.MENU_OWNER__CONTEXT_MENU;
				default: return -1;
			}
		}
		if (baseClass == ToolOwner.class) {
			switch (derivedFeatureID) {
				case GMFMapPackage.NODE_MAPPING__TOOL: return GMFMapPackage.TOOL_OWNER__TOOL;
				default: return -1;
			}
		}
		if (baseClass == AppearanceSteward.class) {
			switch (derivedFeatureID) {
				case GMFMapPackage.NODE_MAPPING__APPEARANCE_STYLE: return GMFMapPackage.APPEARANCE_STEWARD__APPEARANCE_STYLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == MenuOwner.class) {
			switch (baseFeatureID) {
				case GMFMapPackage.MENU_OWNER__CONTEXT_MENU: return GMFMapPackage.NODE_MAPPING__CONTEXT_MENU;
				default: return -1;
			}
		}
		if (baseClass == ToolOwner.class) {
			switch (baseFeatureID) {
				case GMFMapPackage.TOOL_OWNER__TOOL: return GMFMapPackage.NODE_MAPPING__TOOL;
				default: return -1;
			}
		}
		if (baseClass == AppearanceSteward.class) {
			switch (baseFeatureID) {
				case GMFMapPackage.APPEARANCE_STEWARD__APPEARANCE_STYLE: return GMFMapPackage.NODE_MAPPING__APPEARANCE_STYLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return getDomainMetaElement()
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EClass getDomainContext() {
		return getDomainMetaElement();
	}
} //NodeMappingImpl
