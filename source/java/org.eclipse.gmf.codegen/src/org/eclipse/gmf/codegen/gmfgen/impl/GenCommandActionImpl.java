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
import org.eclipse.gmf.codegen.gmfgen.GenCommandAction;
import org.eclipse.gmf.codegen.gmfgen.GenContributionManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Command Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommandActionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommandActionImpl#getCommandIdentifier <em>Command Identifier</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommandActionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCommandActionImpl extends EObjectImpl implements GenCommandAction {
	/**
	 * The default value of the '{@link #getCommandIdentifier() <em>Command Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandIdentifier() <em>Command Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String commandIdentifier = COMMAND_IDENTIFIER_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCommandActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenCommandAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenContributionManager getOwner() {
		if (eContainerFeatureID != GMFGenPackage.GEN_COMMAND_ACTION__OWNER) return null;
		return (GenContributionManager)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommandIdentifier() {
		return commandIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandIdentifier(String newCommandIdentifier) {
		String oldCommandIdentifier = commandIdentifier;
		commandIdentifier = newCommandIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMAND_ACTION__COMMAND_IDENTIFIER, oldCommandIdentifier, commandIdentifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_COMMAND_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_COMMAND_ACTION__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_COMMAND_ACTION__OWNER, msgs);
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
			case GMFGenPackage.GEN_COMMAND_ACTION__OWNER:
				return eBasicSetContainer(null, GMFGenPackage.GEN_COMMAND_ACTION__OWNER, msgs);
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
			case GMFGenPackage.GEN_COMMAND_ACTION__OWNER:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_CONTRIBUTION_MANAGER__ITEMS, GenContributionManager.class, msgs);
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
			case GMFGenPackage.GEN_COMMAND_ACTION__OWNER:
				return getOwner();
			case GMFGenPackage.GEN_COMMAND_ACTION__COMMAND_IDENTIFIER:
				return getCommandIdentifier();
			case GMFGenPackage.GEN_COMMAND_ACTION__NAME:
				return getName();
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
			case GMFGenPackage.GEN_COMMAND_ACTION__COMMAND_IDENTIFIER:
				setCommandIdentifier((String)newValue);
				return;
			case GMFGenPackage.GEN_COMMAND_ACTION__NAME:
				setName((String)newValue);
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
			case GMFGenPackage.GEN_COMMAND_ACTION__COMMAND_IDENTIFIER:
				setCommandIdentifier(COMMAND_IDENTIFIER_EDEFAULT);
				return;
			case GMFGenPackage.GEN_COMMAND_ACTION__NAME:
				setName(NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_COMMAND_ACTION__OWNER:
				return getOwner() != null;
			case GMFGenPackage.GEN_COMMAND_ACTION__COMMAND_IDENTIFIER:
				return COMMAND_IDENTIFIER_EDEFAULT == null ? commandIdentifier != null : !COMMAND_IDENTIFIER_EDEFAULT.equals(commandIdentifier);
			case GMFGenPackage.GEN_COMMAND_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (commandIdentifier: ");
		result.append(commandIdentifier);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GenCommandActionImpl
