/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.diadef.Connection;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LinkMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getDiagramLink <em>Diagram Link</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getDomainMetaElement <em>Domain Meta Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getContainmentFeature <em>Containment Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getLabelEditFeature <em>Label Edit Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getLabelDisplayFeature <em>Label Display Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getLinkMetaFeature <em>Link Meta Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkMappingImpl extends MappingEntryImpl implements LinkMapping {
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
	 * The cached value of the '{@link #getDomainMetaElement() <em>Domain Meta Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainMetaElement()
	 * @generated
	 * @ordered
	 */
	protected EClass domainMetaElement = null;

	/**
	 * The cached value of the '{@link #getContainmentFeature() <em>Containment Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentFeature()
	 * @generated
	 * @ordered
	 */
	protected EReference containmentFeature = null;

	/**
	 * The cached value of the '{@link #getLabelEditFeature() <em>Label Edit Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelEditFeature()
	 * @generated
	 * @ordered
	 */
	protected EAttribute labelEditFeature = null;

	/**
	 * The cached value of the '{@link #getLabelDisplayFeature() <em>Label Display Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelDisplayFeature()
	 * @generated
	 * @ordered
	 */
	protected EAttribute labelDisplayFeature = null;

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
	public Connection getDiagramLink() {
		if (diagramLink != null && diagramLink.eIsProxy()) {
			Connection oldDiagramLink = diagramLink;
			diagramLink = (Connection)eResolveProxy((InternalEObject)diagramLink);
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
	public EClass getDomainMetaElement() {
		if (domainMetaElement != null && domainMetaElement.eIsProxy()) {
			EClass oldDomainMetaElement = domainMetaElement;
			domainMetaElement = (EClass)eResolveProxy((InternalEObject)domainMetaElement);
			if (domainMetaElement != oldDomainMetaElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.LINK_MAPPING__DOMAIN_META_ELEMENT, oldDomainMetaElement, domainMetaElement));
			}
		}
		return domainMetaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetDomainMetaElement() {
		return domainMetaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainMetaElement(EClass newDomainMetaElement) {
		EClass oldDomainMetaElement = domainMetaElement;
		domainMetaElement = newDomainMetaElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__DOMAIN_META_ELEMENT, oldDomainMetaElement, domainMetaElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentFeature() {
		if (containmentFeature != null && containmentFeature.eIsProxy()) {
			EReference oldContainmentFeature = containmentFeature;
			containmentFeature = (EReference)eResolveProxy((InternalEObject)containmentFeature);
			if (containmentFeature != oldContainmentFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.LINK_MAPPING__CONTAINMENT_FEATURE, oldContainmentFeature, containmentFeature));
			}
		}
		return containmentFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetContainmentFeature() {
		return containmentFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainmentFeature(EReference newContainmentFeature) {
		EReference oldContainmentFeature = containmentFeature;
		containmentFeature = newContainmentFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__CONTAINMENT_FEATURE, oldContainmentFeature, containmentFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelEditFeature() {
		if (labelEditFeature != null && labelEditFeature.eIsProxy()) {
			EAttribute oldLabelEditFeature = labelEditFeature;
			labelEditFeature = (EAttribute)eResolveProxy((InternalEObject)labelEditFeature);
			if (labelEditFeature != oldLabelEditFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.LINK_MAPPING__LABEL_EDIT_FEATURE, oldLabelEditFeature, labelEditFeature));
			}
		}
		return labelEditFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetLabelEditFeature() {
		return labelEditFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelEditFeature(EAttribute newLabelEditFeature) {
		EAttribute oldLabelEditFeature = labelEditFeature;
		labelEditFeature = newLabelEditFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__LABEL_EDIT_FEATURE, oldLabelEditFeature, labelEditFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelDisplayFeatureGen() {
		if (labelDisplayFeature != null && labelDisplayFeature.eIsProxy()) {
			EAttribute oldLabelDisplayFeature = labelDisplayFeature;
			labelDisplayFeature = (EAttribute)eResolveProxy((InternalEObject)labelDisplayFeature);
			if (labelDisplayFeature != oldLabelDisplayFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.LINK_MAPPING__LABEL_DISPLAY_FEATURE, oldLabelDisplayFeature, labelDisplayFeature));
			}
		}
		return labelDisplayFeature;
	}

	public EAttribute getLabelDisplayFeature() {
		EAttribute rv = getLabelDisplayFeatureGen();
		if (rv != null) {
			return rv;
		}
		return getLabelEditFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetLabelDisplayFeature() {
		return labelDisplayFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelDisplayFeature(EAttribute newLabelDisplayFeature) {
		EAttribute oldLabelDisplayFeature = labelDisplayFeature;
		labelDisplayFeature = newLabelDisplayFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__LABEL_DISPLAY_FEATURE, oldLabelDisplayFeature, labelDisplayFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getLinkMetaFeature() {
		if (linkMetaFeature != null && linkMetaFeature.eIsProxy()) {
			EStructuralFeature oldLinkMetaFeature = linkMetaFeature;
			linkMetaFeature = (EStructuralFeature)eResolveProxy((InternalEObject)linkMetaFeature);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK:
				if (resolve) return getDiagramLink();
				return basicGetDiagramLink();
			case GMFMapPackage.LINK_MAPPING__DOMAIN_META_ELEMENT:
				if (resolve) return getDomainMetaElement();
				return basicGetDomainMetaElement();
			case GMFMapPackage.LINK_MAPPING__CONTAINMENT_FEATURE:
				if (resolve) return getContainmentFeature();
				return basicGetContainmentFeature();
			case GMFMapPackage.LINK_MAPPING__LABEL_EDIT_FEATURE:
				if (resolve) return getLabelEditFeature();
				return basicGetLabelEditFeature();
			case GMFMapPackage.LINK_MAPPING__LABEL_DISPLAY_FEATURE:
				if (resolve) return getLabelDisplayFeature();
				return basicGetLabelDisplayFeature();
			case GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE:
				if (resolve) return getLinkMetaFeature();
				return basicGetLinkMetaFeature();
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
			case GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK:
				setDiagramLink((Connection)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__DOMAIN_META_ELEMENT:
				setDomainMetaElement((EClass)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__CONTAINMENT_FEATURE:
				setContainmentFeature((EReference)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__LABEL_EDIT_FEATURE:
				setLabelEditFeature((EAttribute)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__LABEL_DISPLAY_FEATURE:
				setLabelDisplayFeature((EAttribute)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE:
				setLinkMetaFeature((EStructuralFeature)newValue);
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
			case GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK:
				setDiagramLink((Connection)null);
				return;
			case GMFMapPackage.LINK_MAPPING__DOMAIN_META_ELEMENT:
				setDomainMetaElement((EClass)null);
				return;
			case GMFMapPackage.LINK_MAPPING__CONTAINMENT_FEATURE:
				setContainmentFeature((EReference)null);
				return;
			case GMFMapPackage.LINK_MAPPING__LABEL_EDIT_FEATURE:
				setLabelEditFeature((EAttribute)null);
				return;
			case GMFMapPackage.LINK_MAPPING__LABEL_DISPLAY_FEATURE:
				setLabelDisplayFeature((EAttribute)null);
				return;
			case GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE:
				setLinkMetaFeature((EStructuralFeature)null);
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
			case GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK:
				return diagramLink != null;
			case GMFMapPackage.LINK_MAPPING__DOMAIN_META_ELEMENT:
				return domainMetaElement != null;
			case GMFMapPackage.LINK_MAPPING__CONTAINMENT_FEATURE:
				return containmentFeature != null;
			case GMFMapPackage.LINK_MAPPING__LABEL_EDIT_FEATURE:
				return labelEditFeature != null;
			case GMFMapPackage.LINK_MAPPING__LABEL_DISPLAY_FEATURE:
				return labelDisplayFeature != null;
			case GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE:
				return linkMetaFeature != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //LinkMappingImpl
