/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.gmfgraph.CustomAttribute;
import org.eclipse.gmf.gmfgraph.CustomClass;
import org.eclipse.gmf.gmfgraph.CustomLayoutData;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Layoutable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Layout Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomLayoutDataImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomLayoutDataImpl#getQualifiedClassName <em>Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomLayoutDataImpl#getBundleName <em>Bundle Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CustomLayoutDataImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomLayoutDataImpl extends EObjectImpl implements CustomLayoutData {
	/**
	 * The default value of the '{@link #getQualifiedClassName() <em>Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedClassName() <em>Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedClassName = QUALIFIED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBundleName() <em>Bundle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundleName() <em>Bundle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleName()
	 * @generated
	 * @ordered
	 */
	protected String bundleName = BUNDLE_NAME_EDEFAULT;

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
	protected CustomLayoutDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getCustomLayoutData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layoutable getOwner() {
		if (eContainerFeatureID != GMFGraphPackage.CUSTOM_LAYOUT_DATA__OWNER) return null;
		return (Layoutable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Layoutable newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID != GMFGraphPackage.CUSTOM_LAYOUT_DATA__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, GMFGraphPackage.LAYOUTABLE__LAYOUT_DATA, Layoutable.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newOwner, GMFGraphPackage.CUSTOM_LAYOUT_DATA__OWNER, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_LAYOUT_DATA__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedClassName() {
		return qualifiedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedClassName(String newQualifiedClassName) {
		String oldQualifiedClassName = qualifiedClassName;
		qualifiedClassName = newQualifiedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_LAYOUT_DATA__QUALIFIED_CLASS_NAME, oldQualifiedClassName, qualifiedClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBundleName() {
		return bundleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundleName(String newBundleName) {
		String oldBundleName = bundleName;
		bundleName = newBundleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.CUSTOM_LAYOUT_DATA__BUNDLE_NAME, oldBundleName, bundleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList(CustomAttribute.class, this, GMFGraphPackage.CUSTOM_LAYOUT_DATA__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGraphPackage.CUSTOM_LAYOUT_DATA__OWNER, msgs);
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
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__OWNER:
				return eBasicSetContainer(null, GMFGraphPackage.CUSTOM_LAYOUT_DATA__OWNER, msgs);
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__ATTRIBUTES:
				return ((InternalEList)getAttributes()).basicRemove(otherEnd, msgs);
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
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__OWNER:
				return eInternalContainer().eInverseRemove(this, GMFGraphPackage.LAYOUTABLE__LAYOUT_DATA, Layoutable.class, msgs);
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
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__OWNER:
				return getOwner();
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__QUALIFIED_CLASS_NAME:
				return getQualifiedClassName();
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__BUNDLE_NAME:
				return getBundleName();
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__ATTRIBUTES:
				return getAttributes();
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
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__OWNER:
				setOwner((Layoutable)newValue);
				return;
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__QUALIFIED_CLASS_NAME:
				setQualifiedClassName((String)newValue);
				return;
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__BUNDLE_NAME:
				setBundleName((String)newValue);
				return;
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection)newValue);
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
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__OWNER:
				setOwner((Layoutable)null);
				return;
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__QUALIFIED_CLASS_NAME:
				setQualifiedClassName(QUALIFIED_CLASS_NAME_EDEFAULT);
				return;
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__BUNDLE_NAME:
				setBundleName(BUNDLE_NAME_EDEFAULT);
				return;
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__ATTRIBUTES:
				getAttributes().clear();
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
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__OWNER:
				return getOwner() != null;
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__QUALIFIED_CLASS_NAME:
				return QUALIFIED_CLASS_NAME_EDEFAULT == null ? qualifiedClassName != null : !QUALIFIED_CLASS_NAME_EDEFAULT.equals(qualifiedClassName);
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__BUNDLE_NAME:
				return BUNDLE_NAME_EDEFAULT == null ? bundleName != null : !BUNDLE_NAME_EDEFAULT.equals(bundleName);
			case GMFGraphPackage.CUSTOM_LAYOUT_DATA__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == CustomClass.class) {
			switch (derivedFeatureID) {
				case GMFGraphPackage.CUSTOM_LAYOUT_DATA__QUALIFIED_CLASS_NAME: return GMFGraphPackage.CUSTOM_CLASS__QUALIFIED_CLASS_NAME;
				case GMFGraphPackage.CUSTOM_LAYOUT_DATA__BUNDLE_NAME: return GMFGraphPackage.CUSTOM_CLASS__BUNDLE_NAME;
				case GMFGraphPackage.CUSTOM_LAYOUT_DATA__ATTRIBUTES: return GMFGraphPackage.CUSTOM_CLASS__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == CustomClass.class) {
			switch (baseFeatureID) {
				case GMFGraphPackage.CUSTOM_CLASS__QUALIFIED_CLASS_NAME: return GMFGraphPackage.CUSTOM_LAYOUT_DATA__QUALIFIED_CLASS_NAME;
				case GMFGraphPackage.CUSTOM_CLASS__BUNDLE_NAME: return GMFGraphPackage.CUSTOM_LAYOUT_DATA__BUNDLE_NAME;
				case GMFGraphPackage.CUSTOM_CLASS__ATTRIBUTES: return GMFGraphPackage.CUSTOM_LAYOUT_DATA__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (qualifiedClassName: ");
		result.append(qualifiedClassName);
		result.append(", bundleName: ");
		result.append(bundleName);
		result.append(')');
		return result.toString();
	}

} //CustomLayoutDataImpl
