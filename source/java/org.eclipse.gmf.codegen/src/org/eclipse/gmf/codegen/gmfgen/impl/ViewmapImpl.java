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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.Attributes;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;

import org.eclipse.gmf.codegen.gmfgen.ViewmapLayoutType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewmap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ViewmapImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ViewmapImpl#getRequiredPluginIDs <em>Required Plugin IDs</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ViewmapImpl#getLayoutType <em>Layout Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ViewmapImpl extends EObjectImpl implements Viewmap {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attributes> attributes;

	/**
	 * The cached value of the '{@link #getRequiredPluginIDs() <em>Required Plugin IDs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPluginIDs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requiredPluginIDs;

	/**
	 * The default value of the '{@link #getLayoutType() <em>Layout Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutType()
	 * @generated
	 * @ordered
	 */
	protected static final ViewmapLayoutType LAYOUT_TYPE_EDEFAULT = ViewmapLayoutType.UNKNOWN_LITERAL;

	/**
	 * The cached value of the '{@link #getLayoutType() <em>Layout Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutType()
	 * @generated
	 * @ordered
	 */
	protected ViewmapLayoutType layoutType = LAYOUT_TYPE_EDEFAULT;

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
	@Override
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getViewmap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRequiredPluginIDs() {
		if (requiredPluginIDs == null) {
			requiredPluginIDs = new EDataTypeUniqueEList<String>(String.class, this, GMFGenPackage.VIEWMAP__REQUIRED_PLUGIN_IDS);
		}
		return requiredPluginIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewmapLayoutType getLayoutType() {
		return layoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutType(ViewmapLayoutType newLayoutType) {
		ViewmapLayoutType oldLayoutType = layoutType;
		layoutType = newLayoutType == null ? LAYOUT_TYPE_EDEFAULT : newLayoutType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.VIEWMAP__LAYOUT_TYPE, oldLayoutType, layoutType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attributes> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attributes>(Attributes.class, this, GMFGenPackage.VIEWMAP__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Attributes find(Class attributesClass) {
		for (Attributes next : getAttributes()) {
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.VIEWMAP__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case GMFGenPackage.VIEWMAP__ATTRIBUTES:
				return getAttributes();
			case GMFGenPackage.VIEWMAP__REQUIRED_PLUGIN_IDS:
				return getRequiredPluginIDs();
			case GMFGenPackage.VIEWMAP__LAYOUT_TYPE:
				return getLayoutType();
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
			case GMFGenPackage.VIEWMAP__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attributes>)newValue);
				return;
			case GMFGenPackage.VIEWMAP__REQUIRED_PLUGIN_IDS:
				getRequiredPluginIDs().clear();
				getRequiredPluginIDs().addAll((Collection<? extends String>)newValue);
				return;
			case GMFGenPackage.VIEWMAP__LAYOUT_TYPE:
				setLayoutType((ViewmapLayoutType)newValue);
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
			case GMFGenPackage.VIEWMAP__ATTRIBUTES:
				getAttributes().clear();
				return;
			case GMFGenPackage.VIEWMAP__REQUIRED_PLUGIN_IDS:
				getRequiredPluginIDs().clear();
				return;
			case GMFGenPackage.VIEWMAP__LAYOUT_TYPE:
				setLayoutType(LAYOUT_TYPE_EDEFAULT);
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
			case GMFGenPackage.VIEWMAP__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case GMFGenPackage.VIEWMAP__REQUIRED_PLUGIN_IDS:
				return requiredPluginIDs != null && !requiredPluginIDs.isEmpty();
			case GMFGenPackage.VIEWMAP__LAYOUT_TYPE:
				return layoutType != LAYOUT_TYPE_EDEFAULT;
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
		result.append(" (requiredPluginIDs: ");
		result.append(requiredPluginIDs);
		result.append(", layoutType: ");
		result.append(layoutType);
		result.append(')');
		return result.toString();
	}

} //ViewmapImpl
