/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.mappings.Constraint;
import org.eclipse.gmf.mappings.ElementInitializer;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LinkConstraints;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Tool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getDiagramLink <em>Diagram Link</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getDomainMetaElement <em>Domain Meta Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getDomainSpecialization <em>Domain Specialization</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getDomainInitializer <em>Domain Initializer</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getContainmentFeature <em>Containment Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getLabelEditFeature <em>Label Edit Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getLabelDisplayFeature <em>Label Display Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getSourceMetaFeature <em>Source Meta Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getLinkMetaFeature <em>Link Meta Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getCreationConstraints <em>Creation Constraints</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl#getTool <em>Tool</em>}</li>
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
	 * The cached value of the '{@link #getDomainSpecialization() <em>Domain Specialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Constraint domainSpecialization = null;

	/**
	 * The cached value of the '{@link #getDomainInitializer() <em>Domain Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainInitializer()
	 * @generated
	 * @ordered
	 */
	protected ElementInitializer domainInitializer = null;

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
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected Tool tool = null;

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
	public EClass getDomainMetaElement() {
		if (domainMetaElement != null && domainMetaElement.eIsProxy()) {
			InternalEObject oldDomainMetaElement = (InternalEObject)domainMetaElement;
			domainMetaElement = (EClass)eResolveProxy(oldDomainMetaElement);
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
	public Constraint getDomainSpecialization() {
		return domainSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainSpecialization(Constraint newDomainSpecialization, NotificationChain msgs) {
		Constraint oldDomainSpecialization = domainSpecialization;
		domainSpecialization = newDomainSpecialization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__DOMAIN_SPECIALIZATION, oldDomainSpecialization, newDomainSpecialization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainSpecialization(Constraint newDomainSpecialization) {
		if (newDomainSpecialization != domainSpecialization) {
			NotificationChain msgs = null;
			if (domainSpecialization != null)
				msgs = ((InternalEObject)domainSpecialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.LINK_MAPPING__DOMAIN_SPECIALIZATION, null, msgs);
			if (newDomainSpecialization != null)
				msgs = ((InternalEObject)newDomainSpecialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.LINK_MAPPING__DOMAIN_SPECIALIZATION, null, msgs);
			msgs = basicSetDomainSpecialization(newDomainSpecialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__DOMAIN_SPECIALIZATION, newDomainSpecialization, newDomainSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementInitializer getDomainInitializer() {
		return domainInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainInitializer(ElementInitializer newDomainInitializer, NotificationChain msgs) {
		ElementInitializer oldDomainInitializer = domainInitializer;
		domainInitializer = newDomainInitializer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__DOMAIN_INITIALIZER, oldDomainInitializer, newDomainInitializer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainInitializer(ElementInitializer newDomainInitializer) {
		if (newDomainInitializer != domainInitializer) {
			NotificationChain msgs = null;
			if (domainInitializer != null)
				msgs = ((InternalEObject)domainInitializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.LINK_MAPPING__DOMAIN_INITIALIZER, null, msgs);
			if (newDomainInitializer != null)
				msgs = ((InternalEObject)newDomainInitializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.LINK_MAPPING__DOMAIN_INITIALIZER, null, msgs);
			msgs = basicSetDomainInitializer(newDomainInitializer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__DOMAIN_INITIALIZER, newDomainInitializer, newDomainInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentFeature() {
		if (containmentFeature != null && containmentFeature.eIsProxy()) {
			InternalEObject oldContainmentFeature = (InternalEObject)containmentFeature;
			containmentFeature = (EReference)eResolveProxy(oldContainmentFeature);
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
			InternalEObject oldLabelEditFeature = (InternalEObject)labelEditFeature;
			labelEditFeature = (EAttribute)eResolveProxy(oldLabelEditFeature);
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
			InternalEObject oldLabelDisplayFeature = (InternalEObject)labelDisplayFeature;
			labelDisplayFeature = (EAttribute)eResolveProxy(oldLabelDisplayFeature);
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
	public Tool getTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTool(Tool newTool, NotificationChain msgs) {
		Tool oldTool = tool;
		tool = newTool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__TOOL, oldTool, newTool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(Tool newTool) {
		if (newTool != tool) {
			NotificationChain msgs = null;
			if (tool != null)
				msgs = ((InternalEObject)tool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.LINK_MAPPING__TOOL, null, msgs);
			if (newTool != null)
				msgs = ((InternalEObject)newTool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.LINK_MAPPING__TOOL, null, msgs);
			msgs = basicSetTool(newTool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.LINK_MAPPING__TOOL, newTool, newTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * This method was created to simplify transtofmation code.
	 * @return getDomainMetaElement() if specified, and getLinkMetaFeature().getEType()  
	 * if link meta feature was specified. <code>null</code> otherwise.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EClass getDomainMetaClass() {
		if (getDomainMetaElement() != null) {
			return getDomainMetaElement();
		}
		if (getLinkMetaFeature() != null) {
			return (EClass) getLinkMetaFeature().getEType();
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
			case GMFMapPackage.LINK_MAPPING__DOMAIN_SPECIALIZATION:
				return basicSetDomainSpecialization(null, msgs);
			case GMFMapPackage.LINK_MAPPING__DOMAIN_INITIALIZER:
				return basicSetDomainInitializer(null, msgs);
			case GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS:
				return basicSetCreationConstraints(null, msgs);
			case GMFMapPackage.LINK_MAPPING__TOOL:
				return basicSetTool(null, msgs);
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
			case GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK:
				if (resolve) return getDiagramLink();
				return basicGetDiagramLink();
			case GMFMapPackage.LINK_MAPPING__DOMAIN_META_ELEMENT:
				if (resolve) return getDomainMetaElement();
				return basicGetDomainMetaElement();
			case GMFMapPackage.LINK_MAPPING__DOMAIN_SPECIALIZATION:
				return getDomainSpecialization();
			case GMFMapPackage.LINK_MAPPING__DOMAIN_INITIALIZER:
				return getDomainInitializer();
			case GMFMapPackage.LINK_MAPPING__CONTAINMENT_FEATURE:
				if (resolve) return getContainmentFeature();
				return basicGetContainmentFeature();
			case GMFMapPackage.LINK_MAPPING__LABEL_EDIT_FEATURE:
				if (resolve) return getLabelEditFeature();
				return basicGetLabelEditFeature();
			case GMFMapPackage.LINK_MAPPING__LABEL_DISPLAY_FEATURE:
				if (resolve) return getLabelDisplayFeature();
				return basicGetLabelDisplayFeature();
			case GMFMapPackage.LINK_MAPPING__SOURCE_META_FEATURE:
				if (resolve) return getSourceMetaFeature();
				return basicGetSourceMetaFeature();
			case GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE:
				if (resolve) return getLinkMetaFeature();
				return basicGetLinkMetaFeature();
			case GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS:
				return getCreationConstraints();
			case GMFMapPackage.LINK_MAPPING__TOOL:
				return getTool();
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
			case GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK:
				setDiagramLink((Connection)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__DOMAIN_META_ELEMENT:
				setDomainMetaElement((EClass)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__DOMAIN_SPECIALIZATION:
				setDomainSpecialization((Constraint)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__DOMAIN_INITIALIZER:
				setDomainInitializer((ElementInitializer)newValue);
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
			case GMFMapPackage.LINK_MAPPING__SOURCE_META_FEATURE:
				setSourceMetaFeature((EStructuralFeature)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE:
				setLinkMetaFeature((EStructuralFeature)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS:
				setCreationConstraints((LinkConstraints)newValue);
				return;
			case GMFMapPackage.LINK_MAPPING__TOOL:
				setTool((Tool)newValue);
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
			case GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK:
				setDiagramLink((Connection)null);
				return;
			case GMFMapPackage.LINK_MAPPING__DOMAIN_META_ELEMENT:
				setDomainMetaElement((EClass)null);
				return;
			case GMFMapPackage.LINK_MAPPING__DOMAIN_SPECIALIZATION:
				setDomainSpecialization((Constraint)null);
				return;
			case GMFMapPackage.LINK_MAPPING__DOMAIN_INITIALIZER:
				setDomainInitializer((ElementInitializer)null);
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
			case GMFMapPackage.LINK_MAPPING__SOURCE_META_FEATURE:
				setSourceMetaFeature((EStructuralFeature)null);
				return;
			case GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE:
				setLinkMetaFeature((EStructuralFeature)null);
				return;
			case GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS:
				setCreationConstraints((LinkConstraints)null);
				return;
			case GMFMapPackage.LINK_MAPPING__TOOL:
				setTool((Tool)null);
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
			case GMFMapPackage.LINK_MAPPING__DIAGRAM_LINK:
				return diagramLink != null;
			case GMFMapPackage.LINK_MAPPING__DOMAIN_META_ELEMENT:
				return domainMetaElement != null;
			case GMFMapPackage.LINK_MAPPING__DOMAIN_SPECIALIZATION:
				return domainSpecialization != null;
			case GMFMapPackage.LINK_MAPPING__DOMAIN_INITIALIZER:
				return domainInitializer != null;
			case GMFMapPackage.LINK_MAPPING__CONTAINMENT_FEATURE:
				return containmentFeature != null;
			case GMFMapPackage.LINK_MAPPING__LABEL_EDIT_FEATURE:
				return labelEditFeature != null;
			case GMFMapPackage.LINK_MAPPING__LABEL_DISPLAY_FEATURE:
				return labelDisplayFeature != null;
			case GMFMapPackage.LINK_MAPPING__SOURCE_META_FEATURE:
				return sourceMetaFeature != null;
			case GMFMapPackage.LINK_MAPPING__LINK_META_FEATURE:
				return linkMetaFeature != null;
			case GMFMapPackage.LINK_MAPPING__CREATION_CONSTRAINTS:
				return creationConstraints != null;
			case GMFMapPackage.LINK_MAPPING__TOOL:
				return tool != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkMappingImpl
