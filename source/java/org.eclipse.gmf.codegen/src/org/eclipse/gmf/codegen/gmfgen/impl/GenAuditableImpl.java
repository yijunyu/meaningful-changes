/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.LinkedList;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenAuditContext;
import org.eclipse.gmf.codegen.gmfgen.GenAuditable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Auditable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditableImpl#getContextSelector <em>Context Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenAuditableImpl extends EObjectImpl implements GenAuditable {
	/**
	 * The cached value of the '{@link #getContextSelector() <em>Context Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextSelector()
	 * @generated
	 * @ordered
	 */
	protected GenAuditContext contextSelector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenAuditableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenAuditable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditContext getContextSelector() {
		if (contextSelector != null && contextSelector.eIsProxy()) {
			InternalEObject oldContextSelector = (InternalEObject)contextSelector;
			contextSelector = (GenAuditContext)eResolveProxy(oldContextSelector);
			if (contextSelector != oldContextSelector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_AUDITABLE__CONTEXT_SELECTOR, oldContextSelector, contextSelector));
			}
		}
		return contextSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditContext basicGetContextSelector() {
		return contextSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextSelector(GenAuditContext newContextSelector, NotificationChain msgs) {
		GenAuditContext oldContextSelector = contextSelector;
		contextSelector = newContextSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDITABLE__CONTEXT_SELECTOR, oldContextSelector, newContextSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextSelector(GenAuditContext newContextSelector) {
		if (newContextSelector != contextSelector) {
			NotificationChain msgs = null;
			if (contextSelector != null)
				msgs = ((InternalEObject)contextSelector).eInverseRemove(this, GMFGenPackage.GEN_AUDIT_CONTEXT__RULE_TARGETS, GenAuditContext.class, msgs);
			if (newContextSelector != null)
				msgs = ((InternalEObject)newContextSelector).eInverseAdd(this, GMFGenPackage.GEN_AUDIT_CONTEXT__RULE_TARGETS, GenAuditContext.class, msgs);
			msgs = basicSetContextSelector(newContextSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_AUDITABLE__CONTEXT_SELECTOR, newContextSelector, newContextSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract GenClassifier getContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_AUDITABLE__CONTEXT_SELECTOR:
				if (contextSelector != null)
					msgs = ((InternalEObject)contextSelector).eInverseRemove(this, GMFGenPackage.GEN_AUDIT_CONTEXT__RULE_TARGETS, GenAuditContext.class, msgs);
				return basicSetContextSelector((GenAuditContext)otherEnd, msgs);
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
			case GMFGenPackage.GEN_AUDITABLE__CONTEXT_SELECTOR:
				return basicSetContextSelector(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_AUDITABLE__CONTEXT_SELECTOR:
				if (resolve) return getContextSelector();
				return basicGetContextSelector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.GEN_AUDITABLE__CONTEXT_SELECTOR:
				setContextSelector((GenAuditContext)newValue);
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
			case GMFGenPackage.GEN_AUDITABLE__CONTEXT_SELECTOR:
				setContextSelector((GenAuditContext)null);
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
			case GMFGenPackage.GEN_AUDITABLE__CONTEXT_SELECTOR:
				return contextSelector != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public GenClass getTargetClass() {
		if(getContext() instanceof GenClass) {
			return (GenClass)getContext(); 
		}
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public String getTargetClassModelQualifiedName() {
		if(getTargetClass() == null || getTargetClass().getGenPackage() == null) {
			return null;
		}
		LinkedList<String> packageNames = new LinkedList<String>();
		for(GenPackage genPackage = getTargetClass().getGenPackage(); genPackage != null;) {
			packageNames.addFirst(genPackage.getPackageName());			
			genPackage = genPackage.getSuperGenPackage(); 
		}
		StringBuilder buf = new StringBuilder(getTargetClass().getQualifiedInterfaceName().length());
		for (String next : packageNames) {
			buf.append(next).append('.');			
		}		
		return buf.append(getTargetClass().getName()).toString();
	}
	
} //GenAuditableImpl
