/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenParsers;
import org.eclipse.gmf.codegen.gmfgen.LabelTextAccessMethod;
import org.eclipse.gmf.codegen.gmfgen.PredefinedParser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predefined Parser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.PredefinedParserImpl#getHolder <em>Holder</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.PredefinedParserImpl#getViewMethod <em>View Method</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.PredefinedParserImpl#getEditMethod <em>Edit Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PredefinedParserImpl extends EObjectImpl implements PredefinedParser {
	/**
	 * The default value of the '{@link #getViewMethod() <em>View Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewMethod()
	 * @generated
	 * @ordered
	 */
	protected static final LabelTextAccessMethod VIEW_METHOD_EDEFAULT = LabelTextAccessMethod.MESSAGE_FORMAT;

	/**
	 * The cached value of the '{@link #getViewMethod() <em>View Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewMethod()
	 * @generated
	 * @ordered
	 */
	protected LabelTextAccessMethod viewMethod = VIEW_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditMethod() <em>Edit Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditMethod()
	 * @generated
	 * @ordered
	 */
	protected static final LabelTextAccessMethod EDIT_METHOD_EDEFAULT = LabelTextAccessMethod.MESSAGE_FORMAT;

	/**
	 * The cached value of the '{@link #getEditMethod() <em>Edit Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditMethod()
	 * @generated
	 * @ordered
	 */
	protected LabelTextAccessMethod editMethod = EDIT_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredefinedParserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getPredefinedParser();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenParsers getHolder() {
		if (eContainerFeatureID != GMFGenPackage.PREDEFINED_PARSER__HOLDER) return null;
		return (GenParsers)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelTextAccessMethod getViewMethod() {
		return viewMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewMethod(LabelTextAccessMethod newViewMethod) {
		LabelTextAccessMethod oldViewMethod = viewMethod;
		viewMethod = newViewMethod == null ? VIEW_METHOD_EDEFAULT : newViewMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.PREDEFINED_PARSER__VIEW_METHOD, oldViewMethod, viewMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelTextAccessMethod getEditMethod() {
		return editMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditMethod(LabelTextAccessMethod newEditMethod) {
		LabelTextAccessMethod oldEditMethod = editMethod;
		editMethod = newEditMethod == null ? EDIT_METHOD_EDEFAULT : newEditMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.PREDEFINED_PARSER__EDIT_METHOD, oldEditMethod, editMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.PREDEFINED_PARSER__HOLDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.PREDEFINED_PARSER__HOLDER, msgs);
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
			case GMFGenPackage.PREDEFINED_PARSER__HOLDER:
				return eBasicSetContainer(null, GMFGenPackage.PREDEFINED_PARSER__HOLDER, msgs);
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
			case GMFGenPackage.PREDEFINED_PARSER__HOLDER:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_PARSERS__IMPLEMENTATIONS, GenParsers.class, msgs);
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
			case GMFGenPackage.PREDEFINED_PARSER__HOLDER:
				return getHolder();
			case GMFGenPackage.PREDEFINED_PARSER__VIEW_METHOD:
				return getViewMethod();
			case GMFGenPackage.PREDEFINED_PARSER__EDIT_METHOD:
				return getEditMethod();
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
			case GMFGenPackage.PREDEFINED_PARSER__VIEW_METHOD:
				setViewMethod((LabelTextAccessMethod)newValue);
				return;
			case GMFGenPackage.PREDEFINED_PARSER__EDIT_METHOD:
				setEditMethod((LabelTextAccessMethod)newValue);
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
			case GMFGenPackage.PREDEFINED_PARSER__VIEW_METHOD:
				setViewMethod(VIEW_METHOD_EDEFAULT);
				return;
			case GMFGenPackage.PREDEFINED_PARSER__EDIT_METHOD:
				setEditMethod(EDIT_METHOD_EDEFAULT);
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
			case GMFGenPackage.PREDEFINED_PARSER__HOLDER:
				return getHolder() != null;
			case GMFGenPackage.PREDEFINED_PARSER__VIEW_METHOD:
				return viewMethod != VIEW_METHOD_EDEFAULT;
			case GMFGenPackage.PREDEFINED_PARSER__EDIT_METHOD:
				return editMethod != EDIT_METHOD_EDEFAULT;
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
		result.append(" (viewMethod: ");
		result.append(viewMethod);
		result.append(", editMethod: ");
		result.append(editMethod);
		result.append(')');
		return result.toString();
	}

} //PredefinedParserImpl
