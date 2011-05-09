/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.Attributes;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewmap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ViewmapImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ViewmapImpl#getRequiredPluginIDs <em>Required Plugin IDs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ViewmapImpl extends EObjectImpl implements Viewmap {
	/**
	 * The cached value of the '{@link #getRequiredPluginIDs() <em>Required Plugin IDs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPluginIDs()
	 * @generated
	 * @ordered
	 */
	protected EList requiredPluginIDs = null;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList attributes = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewmapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getViewmap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRequiredPluginIDs() {
		if (requiredPluginIDs == null) {
			requiredPluginIDs = new EDataTypeUniqueEList(String.class, this, GMFGenPackage.VIEWMAP__REQUIRED_PLUGIN_IDS);
		}
		return requiredPluginIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList(Attributes.class, this, GMFGenPackage.VIEWMAP__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Attributes find(Class attributesClass) {
		for (Iterator it = getAttributes().iterator(); it.hasNext(); ) {
			Attributes next = (Attributes) it.next();
			if (attributesClass.isInstance(next)) {
				return next;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.VIEWMAP__ATTRIBUTES:
				return ((InternalEList)getAttributes()).basicRemove(otherEnd, msgs);
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
			case GMFGenPackage.VIEWMAP__ATTRIBUTES:
				return getAttributes();
			case GMFGenPackage.VIEWMAP__REQUIRED_PLUGIN_IDS:
				return getRequiredPluginIDs();
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
			case GMFGenPackage.VIEWMAP__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection)newValue);
				return;
			case GMFGenPackage.VIEWMAP__REQUIRED_PLUGIN_IDS:
				getRequiredPluginIDs().clear();
				getRequiredPluginIDs().addAll((Collection)newValue);
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
			case GMFGenPackage.VIEWMAP__ATTRIBUTES:
				getAttributes().clear();
				return;
			case GMFGenPackage.VIEWMAP__REQUIRED_PLUGIN_IDS:
				getRequiredPluginIDs().clear();
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
			case GMFGenPackage.VIEWMAP__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case GMFGenPackage.VIEWMAP__REQUIRED_PLUGIN_IDS:
				return requiredPluginIDs != null && !requiredPluginIDs.isEmpty();
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
		result.append(" (requiredPluginIDs: ");
		result.append(requiredPluginIDs);
		result.append(')');
		return result.toString();
	}

} //ViewmapImpl
