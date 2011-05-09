/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenDomainAttributeTargetImpl.java,v 1.2 2007/03/14 14:39:34 atikhomirov Exp $
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDomainAttributeTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Domain Attribute Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDomainAttributeTargetImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDomainAttributeTargetImpl#isNullAsError <em>Null As Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenDomainAttributeTargetImpl extends GenAuditableImpl implements GenDomainAttributeTarget {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected GenFeature attribute = null;

	/**
	 * The default value of the '{@link #isNullAsError() <em>Null As Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullAsError()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULL_AS_ERROR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullAsError() <em>Null As Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullAsError()
	 * @generated
	 * @ordered
	 */
	protected boolean nullAsError = NULL_AS_ERROR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDomainAttributeTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenDomainAttributeTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (GenFeature)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(GenFeature newAttribute) {
		GenFeature oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenClassifier getContext() {
		if(getAttribute() == null) {
			return null;
		}
		return getAttribute().getTypeGenClassifier();  
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public GenClass getTargetClass() {
		if(getAttribute() == null) {
			return null;
		}		
		return getAttribute().getGenClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullAsError() {
		return nullAsError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullAsError(boolean newNullAsError) {
		boolean oldNullAsError = nullAsError;
		nullAsError = newNullAsError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR, oldNullAsError, nullAsError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR:
				return isNullAsError() ? Boolean.TRUE : Boolean.FALSE;
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
			case GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE:
				setAttribute((GenFeature)newValue);
				return;
			case GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR:
				setNullAsError(((Boolean)newValue).booleanValue());
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
			case GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE:
				setAttribute((GenFeature)null);
				return;
			case GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR:
				setNullAsError(NULL_AS_ERROR_EDEFAULT);
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
			case GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE:
				return attribute != null;
			case GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR:
				return nullAsError != NULL_AS_ERROR_EDEFAULT;
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
		result.append(" (nullAsError: ");
		result.append(nullAsError);
		result.append(')');
		return result.toString();
	}

} //GenDomainAttributeTargetImpl