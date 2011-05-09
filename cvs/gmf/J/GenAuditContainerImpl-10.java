/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenAuditContainer;
import org.eclipse.gmf.codegen.gmfgen.GenAuditRoot;

import org.eclipse.gmf.codegen.gmfgen.GenAuditRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Audit Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl#getAudits <em>Audits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenAuditContainerImpl extends EObjectImpl implements GenAuditContainer {
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
	 * The cached value of the '{@link #getPath() <em>Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EList path = null;

	/**
	 * The cached value of the '{@link #getAudits() <em>Audits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudits()
	 * @generated
	 * @ordered
	 */
	protected EList audits = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenAuditContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenAuditContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditRoot getRoot() {
		if (eContainerFeatureID != GMFGenPackage.GEN_AUDIT_CONTAINER__ROOT) return null;
		return (GenAuditRoot)eContainer();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_CONTAINER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_CONTAINER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_CONTAINER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPath() {
		if (path == null) {
			path = new EObjectResolvingEList(GenAuditContainer.class, this, GMFGenPackage.GEN_AUDIT_CONTAINER__PATH);
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAudits() {
		if (audits == null) {
			audits = new EObjectWithInverseResolvingEList(GenAuditRule.class, this, GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS, GMFGenPackage.GEN_AUDIT_RULE__CATEGORY);
		}
		return audits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_AUDIT_CONTAINER__ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_AUDIT_CONTAINER__ROOT, msgs);
			case GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS:
				return ((InternalEList)getAudits()).basicAdd(otherEnd, msgs);
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
			case GMFGenPackage.GEN_AUDIT_CONTAINER__ROOT:
				return eBasicSetContainer(null, GMFGenPackage.GEN_AUDIT_CONTAINER__ROOT, msgs);
			case GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS:
				return ((InternalEList)getAudits()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GMFGenPackage.GEN_AUDIT_CONTAINER__ROOT:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_AUDIT_ROOT__CATEGORIES, GenAuditRoot.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_AUDIT_CONTAINER__ROOT:
				return getRoot();
			case GMFGenPackage.GEN_AUDIT_CONTAINER__ID:
				return getId();
			case GMFGenPackage.GEN_AUDIT_CONTAINER__NAME:
				return getName();
			case GMFGenPackage.GEN_AUDIT_CONTAINER__DESCRIPTION:
				return getDescription();
			case GMFGenPackage.GEN_AUDIT_CONTAINER__PATH:
				return getPath();
			case GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS:
				return getAudits();
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
			case GMFGenPackage.GEN_AUDIT_CONTAINER__ID:
				setId((String)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__PATH:
				getPath().clear();
				getPath().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS:
				getAudits().clear();
				getAudits().addAll((Collection)newValue);
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
			case GMFGenPackage.GEN_AUDIT_CONTAINER__ID:
				setId(ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__PATH:
				getPath().clear();
				return;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS:
				getAudits().clear();
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
			case GMFGenPackage.GEN_AUDIT_CONTAINER__ROOT:
				return getRoot() != null;
			case GMFGenPackage.GEN_AUDIT_CONTAINER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GMFGenPackage.GEN_AUDIT_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGenPackage.GEN_AUDIT_CONTAINER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GMFGenPackage.GEN_AUDIT_CONTAINER__PATH:
				return path != null && !path.isEmpty();
			case GMFGenPackage.GEN_AUDIT_CONTAINER__AUDITS:
				return audits != null && !audits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //GenAuditContainerImpl
