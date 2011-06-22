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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.mappings.AuditContainer;
import org.eclipse.gmf.mappings.AuditRule;
import org.eclipse.gmf.mappings.GMFMapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.AuditContainerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.AuditContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.AuditContainerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.AuditContainerImpl#getParentContainer <em>Parent Container</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.AuditContainerImpl#getAudits <em>Audits</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.AuditContainerImpl#getChildContainers <em>Child Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuditContainerImpl extends EObjectImpl implements AuditContainer {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAudits() <em>Audits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudits()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditRule> audits;

	/**
	 * The cached value of the '{@link #getChildContainers() <em>Child Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditContainer> childContainers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getAuditContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.AUDIT_CONTAINER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.AUDIT_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.AUDIT_CONTAINER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditContainer getParentContainer() {
		if (eContainerFeatureID != GMFMapPackage.AUDIT_CONTAINER__PARENT_CONTAINER) return null;
		return (AuditContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentContainer(AuditContainer newParentContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentContainer, GMFMapPackage.AUDIT_CONTAINER__PARENT_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentContainer(AuditContainer newParentContainer) {
		if (newParentContainer != eInternalContainer() || (eContainerFeatureID != GMFMapPackage.AUDIT_CONTAINER__PARENT_CONTAINER && newParentContainer != null)) {
			if (EcoreUtil.isAncestor(this, newParentContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentContainer != null)
				msgs = ((InternalEObject)newParentContainer).eInverseAdd(this, GMFMapPackage.AUDIT_CONTAINER__CHILD_CONTAINERS, AuditContainer.class, msgs);
			msgs = basicSetParentContainer(newParentContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.AUDIT_CONTAINER__PARENT_CONTAINER, newParentContainer, newParentContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditRule> getAudits() {
		if (audits == null) {
			audits = new EObjectContainmentWithInverseEList<AuditRule>(AuditRule.class, this, GMFMapPackage.AUDIT_CONTAINER__AUDITS, GMFMapPackage.AUDIT_RULE__CONTAINER);
		}
		return audits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditContainer> getChildContainers() {
		if (childContainers == null) {
			childContainers = new EObjectContainmentWithInverseEList<AuditContainer>(AuditContainer.class, this, GMFMapPackage.AUDIT_CONTAINER__CHILD_CONTAINERS, GMFMapPackage.AUDIT_CONTAINER__PARENT_CONTAINER);
		}
		return childContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.AUDIT_CONTAINER__PARENT_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentContainer((AuditContainer)otherEnd, msgs);
			case GMFMapPackage.AUDIT_CONTAINER__AUDITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAudits()).basicAdd(otherEnd, msgs);
			case GMFMapPackage.AUDIT_CONTAINER__CHILD_CONTAINERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildContainers()).basicAdd(otherEnd, msgs);
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
			case GMFMapPackage.AUDIT_CONTAINER__PARENT_CONTAINER:
				return basicSetParentContainer(null, msgs);
			case GMFMapPackage.AUDIT_CONTAINER__AUDITS:
				return ((InternalEList<?>)getAudits()).basicRemove(otherEnd, msgs);
			case GMFMapPackage.AUDIT_CONTAINER__CHILD_CONTAINERS:
				return ((InternalEList<?>)getChildContainers()).basicRemove(otherEnd, msgs);
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
			case GMFMapPackage.AUDIT_CONTAINER__PARENT_CONTAINER:
				return eInternalContainer().eInverseRemove(this, GMFMapPackage.AUDIT_CONTAINER__CHILD_CONTAINERS, AuditContainer.class, msgs);
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
			case GMFMapPackage.AUDIT_CONTAINER__ID:
				return getId();
			case GMFMapPackage.AUDIT_CONTAINER__NAME:
				return getName();
			case GMFMapPackage.AUDIT_CONTAINER__DESCRIPTION:
				return getDescription();
			case GMFMapPackage.AUDIT_CONTAINER__PARENT_CONTAINER:
				return getParentContainer();
			case GMFMapPackage.AUDIT_CONTAINER__AUDITS:
				return getAudits();
			case GMFMapPackage.AUDIT_CONTAINER__CHILD_CONTAINERS:
				return getChildContainers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFMapPackage.AUDIT_CONTAINER__ID:
				setId((String)newValue);
				return;
			case GMFMapPackage.AUDIT_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case GMFMapPackage.AUDIT_CONTAINER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GMFMapPackage.AUDIT_CONTAINER__PARENT_CONTAINER:
				setParentContainer((AuditContainer)newValue);
				return;
			case GMFMapPackage.AUDIT_CONTAINER__AUDITS:
				getAudits().clear();
				getAudits().addAll((Collection<? extends AuditRule>)newValue);
				return;
			case GMFMapPackage.AUDIT_CONTAINER__CHILD_CONTAINERS:
				getChildContainers().clear();
				getChildContainers().addAll((Collection<? extends AuditContainer>)newValue);
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
			case GMFMapPackage.AUDIT_CONTAINER__ID:
				setId(ID_EDEFAULT);
				return;
			case GMFMapPackage.AUDIT_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFMapPackage.AUDIT_CONTAINER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GMFMapPackage.AUDIT_CONTAINER__PARENT_CONTAINER:
				setParentContainer((AuditContainer)null);
				return;
			case GMFMapPackage.AUDIT_CONTAINER__AUDITS:
				getAudits().clear();
				return;
			case GMFMapPackage.AUDIT_CONTAINER__CHILD_CONTAINERS:
				getChildContainers().clear();
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
			case GMFMapPackage.AUDIT_CONTAINER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GMFMapPackage.AUDIT_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFMapPackage.AUDIT_CONTAINER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GMFMapPackage.AUDIT_CONTAINER__PARENT_CONTAINER:
				return getParentContainer() != null;
			case GMFMapPackage.AUDIT_CONTAINER__AUDITS:
				return audits != null && !audits.isEmpty();
			case GMFMapPackage.AUDIT_CONTAINER__CHILD_CONTAINERS:
				return childContainers != null && !childContainers.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AuditContainerImpl
