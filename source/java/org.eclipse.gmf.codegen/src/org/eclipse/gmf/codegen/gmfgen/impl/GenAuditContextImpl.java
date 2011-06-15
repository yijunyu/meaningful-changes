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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenAuditContext;
import org.eclipse.gmf.codegen.gmfgen.GenAuditRoot;
import org.eclipse.gmf.codegen.gmfgen.GenAuditable;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Audit Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContextImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContextImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContextImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContextImpl#getRuleTargets <em>Rule Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenAuditContextImpl extends EObjectImpl implements GenAuditContext {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "DefaultCtx";

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
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRuleTargets() <em>Rule Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<GenAuditable> ruleTargets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenAuditContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenAuditContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditRoot getRoot() {
		if (eContainerFeatureID != GMFGenPackage.GEN_AUDIT_CONTEXT__ROOT) return null;
		return (GenAuditRoot)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(GenAuditRoot newRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoot, GMFGenPackage.GEN_AUDIT_CONTEXT__ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(GenAuditRoot newRoot) {
		if (newRoot != eInternalContainer() || (eContainerFeatureID != GMFGenPackage.GEN_AUDIT_CONTEXT__ROOT && newRoot != null)) {
			if (EcoreUtil.isAncestor(this, newRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, GMFGenPackage.GEN_AUDIT_ROOT__CLIENT_CONTEXTS, GenAuditRoot.class, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_CONTEXT__ROOT, newRoot, newRoot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_CONTEXT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassNameGen() {
		return className;
	}

	/**
	 * @generated NOT
	 */
	public String getClassName() {
		if (!GenCommonBaseImpl.isEmpty(getClassNameGen())) {
			return getClassNameGen();
		}
		return getId(); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDIT_CONTEXT__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenAuditable> getRuleTargets() {
		if (ruleTargets == null) {
			ruleTargets = new EObjectWithInverseResolvingEList<GenAuditable>(GenAuditable.class, this, GMFGenPackage.GEN_AUDIT_CONTEXT__RULE_TARGETS, GMFGenPackage.GEN_AUDITABLE__CONTEXT_SELECTOR);
		}
		return ruleTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getQualifiedClassName() {
		if (getDiagram() == null) {
			return getClassName();
		}
		return getDiagram().getValidationProviderQualifiedClassName() + '$' + getClassName();
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
			case GMFGenPackage.GEN_AUDIT_CONTEXT__ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoot((GenAuditRoot)otherEnd, msgs);
			case GMFGenPackage.GEN_AUDIT_CONTEXT__RULE_TARGETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRuleTargets()).basicAdd(otherEnd, msgs);
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
			case GMFGenPackage.GEN_AUDIT_CONTEXT__ROOT:
				return basicSetRoot(null, msgs);
			case GMFGenPackage.GEN_AUDIT_CONTEXT__RULE_TARGETS:
				return ((InternalEList<?>)getRuleTargets()).basicRemove(otherEnd, msgs);
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
			case GMFGenPackage.GEN_AUDIT_CONTEXT__ROOT:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_AUDIT_ROOT__CLIENT_CONTEXTS, GenAuditRoot.class, msgs);
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
			case GMFGenPackage.GEN_AUDIT_CONTEXT__ROOT:
				return getRoot();
			case GMFGenPackage.GEN_AUDIT_CONTEXT__ID:
				return getId();
			case GMFGenPackage.GEN_AUDIT_CONTEXT__CLASS_NAME:
				return getClassName();
			case GMFGenPackage.GEN_AUDIT_CONTEXT__RULE_TARGETS:
				return getRuleTargets();
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
			case GMFGenPackage.GEN_AUDIT_CONTEXT__ROOT:
				setRoot((GenAuditRoot)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTEXT__ID:
				setId((String)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTEXT__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTEXT__RULE_TARGETS:
				getRuleTargets().clear();
				getRuleTargets().addAll((Collection<? extends GenAuditable>)newValue);
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
			case GMFGenPackage.GEN_AUDIT_CONTEXT__ROOT:
				setRoot((GenAuditRoot)null);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTEXT__ID:
				setId(ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTEXT__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_AUDIT_CONTEXT__RULE_TARGETS:
				getRuleTargets().clear();
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
			case GMFGenPackage.GEN_AUDIT_CONTEXT__ROOT:
				return getRoot() != null;
			case GMFGenPackage.GEN_AUDIT_CONTEXT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GMFGenPackage.GEN_AUDIT_CONTEXT__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case GMFGenPackage.GEN_AUDIT_CONTEXT__RULE_TARGETS:
				return ruleTargets != null && !ruleTargets.isEmpty();
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
		result.append(", className: ");
		result.append(className);
		result.append(')');
		return result.toString();
	}

	private GenDiagram getDiagram() {
		if(getRoot() != null) {
			return getRoot().getEditorGen().getDiagram();
		}
		return null;
	}
} //GenAuditContextImpl
