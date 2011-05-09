/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.mappings.AppearanceSteward;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LinkConstraints;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.MenuOwner;
import org.eclipse.gmf.mappings.ToolOwner;
import org.eclipse.gmf.tooldef.AbstractTool;
import org.eclipse.gmf.tooldef.ContextMenu;
import org.eclipse.gmf.tooldef.StyleSelector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getContextMenu <em>Context Menu</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getAppearanceStyle <em>Appearance Style</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getDiagramLink <em>Diagram Link</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getSourceMetaFeature <em>Source Meta Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getLinkMetaFeature <em>Link Meta Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getCreationConstraints <em>Creation Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkMappingImpl extends MappingEntryImpl implements LinkMapping {
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
	 * The cached value of the '{@link #getDiagramLink() <em>Diagram Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramLink()
	 * @generated
	 * @ordered
	 */
	protected Connection diagramLink = null;

	/**
	 * The cached value of the '{@link #getSourceMetaFeature() <em>Source Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMetaFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature sourceMetaFeature = null;

	/**
	 * The cached value of the '{@link #getLinkMetaFeature() <em>Link Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkMetaFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature linkMetaFeature = null;

	/**
	 * The cached value of the '{@link #getCreationConstraints() <em>Creation Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationConstraints()
	 * @generated
	 * @ordered
	 */
	protected LinkConstraints creationConstraints = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getLinkMapping();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.LINK_MAPPING__CONTEXT_MENU, oldContextMenu, contextMenu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__CONTEXT_MENU, oldContextMenu, contextMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getDiagramLink() {
		if (diagramLink != null && diagramLink.eIsProxy()) {
			InternalEObject oldDiagramLink = (InternalEObject)diagramLink;
			diagramLink = (Connection)eResolveProxy(oldDiagramLink);
			if (diagramLink != oldDiagramLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK, oldDiagramLink, diagramLink));
			}
		}
		return diagramLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetDiagramLink() {
		return diagramLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramLink(Connection newDiagramLink) {
		Connection oldDiagramLink = diagramLink;
		diagramLink = newDiagramLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK, oldDiagramLink, diagramLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getSourceMetaFeature() {
		if (sourceMetaFeature != null && sourceMetaFeature.eIsProxy()) {
			InternalEObject oldSourceMetaFeature = (InternalEObject)sourceMetaFeature;
			sourceMetaFeature = (EStructuralFeature)eResolveProxy(oldSourceMetaFeature);
			if (sourceMetaFeature != oldSourceMetaFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.LINK_MAPPING__SOURCE_META_FEATURE, oldSourceMetaFeature, sourceMetaFeature));
			}
		}
		return sourceMetaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetSourceMetaFeature() {
		return sourceMetaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMetaFeature(EStructuralFeature newSourceMetaFeature) {
		EStructuralFeature oldSourceMetaFeature = sourceMetaFeature;
		sourceMetaFeature = newSourceMetaFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__SOURCE_META_FEATURE, oldSourceMetaFeature, sourceMetaFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getLinkMetaFeature() {
		if (linkMetaFeature != null && linkMetaFeature.eIsProxy()) {
			InternalEObject oldLinkMetaFeature = (InternalEObject)linkMetaFeature;
			linkMetaFeature = (EStructuralFeature)eResolveProxy(oldLinkMetaFeature);
			if (linkMetaFeature != oldLinkMetaFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE, oldLinkMetaFeature, linkMetaFeature));
			}
		}
		return linkMetaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetLinkMetaFeature() {
		return linkMetaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkMetaFeature(EStructuralFeature newLinkMetaFeature) {
		EStructuralFeature oldLinkMetaFeature = linkMetaFeature;
		linkMetaFeature = newLinkMetaFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE, oldLinkMetaFeature, linkMetaFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkConstraints getCreationConstraints() {
		return creationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationConstraints(LinkConstraints newCreationConstraints, NotificationChain msgs) {
		LinkConstraints oldCreationConstraints = creationConstraints;
		creationConstraints = newCreationConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS, oldCreationConstraints, newCreationConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationConstraints(LinkConstraints newCreationConstraints) {
		if (newCreationConstraints != creationConstraints) {
			NotificationChain msgs = null;
			if (creationConstraints != null)
				msgs = ((InternalEObject)creationConstraints).eInverseRemove(this, GMFMapPackage.LINK_CONSTRAINTS__LINK_MAPPING, LinkConstraints.class, msgs);
			if (newCreationConstraints != null)
				msgs = ((InternalEObject)newCreationConstraints).eInverseAdd(this, GMFMapPackage.LINK_CONSTRAINTS__LINK_MAPPING, LinkConstraints.class, msgs);
			msgs = basicSetCreationConstraints(newCreationConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS, newCreationConstraints, newCreationConstraints));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.LINK_MAPPING__TOOL, oldTool, tool));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__TOOL, oldTool, tool));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.LINK_MAPPING__APPEARANCE_STYLE, oldAppearanceStyle, appearanceStyle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__APPEARANCE_STYLE, oldAppearanceStyle, appearanceStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * This method was created to simplify transtofmation code.
	 * @return getDomainMetaElement() if specified, and getLinkMetaFeature().getEContainingClass()  
	 * if link meta feature was specified. <code>null</code> otherwise.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EClass getDomainContext() {
		if (getDomainMetaElement() != null) {
			return getDomainMetaElement();
		}
		if (getLinkMetaFeature() != null) {
			return getLinkMetaFeature().getEContainingClass();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS:
				if (creationConstraints != null)
					msgs = ((InternalEObject)creationConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS, null, msgs);
				return basicSetCreationConstraints((LinkConstraints)otherEnd, msgs);
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
			case GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS:
				return basicSetCreationConstraints(null, msgs);
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
			case GMFMapPackage.LINK_MAPPING__CONTEXT_MENU:
				if (resolve) return getContextMenu();
				return basicGetContextMenu();
			case GMFMapPackage.LINK_MAPPING__TOOL:
				if (resolve) return getTool();
				return basicGetTool();
			case GMFMapPackage.LINK_MAPPING__APPEARANCE_STYLE:
				if (resolve) return getAppearanceStyle();
				return basicGetAppearanceStyle();
			case GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK:
				if (resolve) return getDiagramLink();
				return basicGetDiagramLink();
			case GMFMapPackage.LINK_MAPPING__SOURCE_META_FEATURE:
				if (resolve) return getSourceMetaFeature();
				return basicGetSourceMetaFeature();
			case GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE:
				if (resolve) return getLinkMetaFeature();
				return basicGetLinkMetaFeature();
			case GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS:
				return getCreationConstraints();
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
			case GMFMapPackage.LINK_MAPPING__CONTEXT_MENU:
				setContextMenu((ContextMenu)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__TOOL:
				setTool((AbstractTool)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__APPEARANCE_STYLE:
				setAppearanceStyle((StyleSelector)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK:
				setDiagramLink((Connection)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__SOURCE_META_FEATURE:
				setSourceMetaFeature((EStructuralFeature)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE:
				setLinkMetaFeature((EStructuralFeature)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS:
				setCreationConstraints((LinkConstraints)newValue);
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
			case GMFMapPackage.LINK_MAPPING__CONTEXT_MENU:
				setContextMenu((ContextMenu)null);
				return;
			case GMFMapPackage.LINK_MAPPING__TOOL:
				setTool((AbstractTool)null);
				return;
			case GMFMapPackage.LINK_MAPPING__APPEARANCE_STYLE:
				setAppearanceStyle((StyleSelector)null);
				return;
			case GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK:
				setDiagramLink((Connection)null);
				return;
			case GMFMapPackage.LINK_MAPPING__SOURCE_META_FEATURE:
				setSourceMetaFeature((EStructuralFeature)null);
				return;
			case GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE:
				setLinkMetaFeature((EStructuralFeature)null);
				return;
			case GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS:
				setCreationConstraints((LinkConstraints)null);
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
			case GMFMapPackage.LINK_MAPPING__CONTEXT_MENU:
				return contextMenu != null;
			case GMFMapPackage.LINK_MAPPING__TOOL:
				return tool != null;
			case GMFMapPackage.LINK_MAPPING__APPEARANCE_STYLE:
				return appearanceStyle != null;
			case GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK:
				return diagramLink != null;
			case GMFMapPackage.LINK_MAPPING__SOURCE_META_FEATURE:
				return sourceMetaFeature != null;
			case GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE:
				return linkMetaFeature != null;
			case GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS:
				return creationConstraints != null;
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
				case GMFMapPackage.LINK_MAPPING__CONTEXT_MENU: return GMFMapPackage.MENU_OWNER__CONTEXT_MENU;
				default: return -1;
			}
		}
		if (baseClass == ToolOwner.class) {
			switch (derivedFeatureID) {
				case GMFMapPackage.LINK_MAPPING__TOOL: return GMFMapPackage.TOOL_OWNER__TOOL;
				default: return -1;
			}
		}
		if (baseClass == AppearanceSteward.class) {
			switch (derivedFeatureID) {
				case GMFMapPackage.LINK_MAPPING__APPEARANCE_STYLE: return GMFMapPackage.APPEARANCE_STEWARD__APPEARANCE_STYLE;
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
				case GMFMapPackage.MENU_OWNER__CONTEXT_MENU: return GMFMapPackage.LINK_MAPPING__CONTEXT_MENU;
				default: return -1;
			}
		}
		if (baseClass == ToolOwner.class) {
			switch (baseFeatureID) {
				case GMFMapPackage.TOOL_OWNER__TOOL: return GMFMapPackage.LINK_MAPPING__TOOL;
				default: return -1;
			}
		}
		if (baseClass == AppearanceSteward.class) {
			switch (baseFeatureID) {
				case GMFMapPackage.APPEARANCE_STEWARD__APPEARANCE_STYLE: return GMFMapPackage.LINK_MAPPING__APPEARANCE_STYLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LinkMappingImpl
