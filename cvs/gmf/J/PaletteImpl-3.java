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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ToolGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Palette</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.PaletteImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.PaletteImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.PaletteImpl#isFlyout <em>Flyout</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.PaletteImpl#isNeedZoomTools <em>Need Zoom Tools</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.PaletteImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.PaletteImpl#getFactoryClassName <em>Factory Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaletteImpl extends EObjectImpl implements Palette {
	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList groups = null;

	/**
	 * The default value of the '{@link #isFlyout() <em>Flyout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlyout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLYOUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFlyout() <em>Flyout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlyout()
	 * @generated
	 * @ordered
	 */
	protected boolean flyout = FLYOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedZoomTools() <em>Need Zoom Tools</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedZoomTools()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEED_ZOOM_TOOLS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedZoomTools() <em>Need Zoom Tools</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedZoomTools()
	 * @generated
	 * @ordered
	 */
	protected boolean needZoomTools = NEED_ZOOM_TOOLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactoryClassName() <em>Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactoryClassName() <em>Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected String factoryClassName = FACTORY_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaletteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getPalette();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDiagram getDiagram() {
		if (eContainerFeatureID != GMFGenPackage.PALETTE__DIAGRAM) return null;
		return (GenDiagram)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentWithInverseEList(ToolGroup.class, this, GMFGenPackage.PALETTE__GROUPS, GMFGenPackage.TOOL_GROUP__PALETTE);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFlyout() {
		return flyout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlyout(boolean newFlyout) {
		boolean oldFlyout = flyout;
		flyout = newFlyout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.PALETTE__FLYOUT, oldFlyout, flyout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedZoomTools() {
		return needZoomTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedZoomTools(boolean newNeedZoomTools) {
		boolean oldNeedZoomTools = needZoomTools;
		needZoomTools = newNeedZoomTools;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.PALETTE__NEED_ZOOM_TOOLS, oldNeedZoomTools, needZoomTools));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageNameGen() {
		return packageName;
	}

	public String getPackageName() {
		String value = getPackageNameGen();
		if (value == null || value.length() == 0) {
			return getDiagram().getEditorPackageName();
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.PALETTE__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactoryClassNameGen() {
		return factoryClassName;
	}

	public String getFactoryClassName() {
		String name = getFactoryClassNameGen();
		if (name == null) {
			return ((GenDiagramImpl) getDiagram()).getDomainPackageCapName() + "PaletteFactory"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryClassName(String newFactoryClassName) {
		String oldFactoryClassName = factoryClassName;
		factoryClassName = newFactoryClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.PALETTE__FACTORY_CLASS_NAME, oldFactoryClassName, factoryClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFactoryQualifiedClassName() {
		return getPackageName() + '.' + getFactoryClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.PALETTE__DIAGRAM:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGenPackage.PALETTE__DIAGRAM, msgs);
				case GMFGenPackage.PALETTE__GROUPS:
					return ((InternalEList)getGroups()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.PALETTE__DIAGRAM:
					return eBasicSetContainer(null, GMFGenPackage.PALETTE__DIAGRAM, msgs);
				case GMFGenPackage.PALETTE__GROUPS:
					return ((InternalEList)getGroups()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case GMFGenPackage.PALETTE__DIAGRAM:
					return eContainer.eInverseRemove(this, GMFGenPackage.GEN_DIAGRAM__PALETTE, GenDiagram.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.PALETTE__DIAGRAM:
				return getDiagram();
			case GMFGenPackage.PALETTE__GROUPS:
				return getGroups();
			case GMFGenPackage.PALETTE__FLYOUT:
				return isFlyout() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.PALETTE__NEED_ZOOM_TOOLS:
				return isNeedZoomTools() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.PALETTE__PACKAGE_NAME:
				return getPackageName();
			case GMFGenPackage.PALETTE__FACTORY_CLASS_NAME:
				return getFactoryClassName();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.PALETTE__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection)newValue);
				return;
			case GMFGenPackage.PALETTE__FLYOUT:
				setFlyout(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.PALETTE__NEED_ZOOM_TOOLS:
				setNeedZoomTools(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.PALETTE__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case GMFGenPackage.PALETTE__FACTORY_CLASS_NAME:
				setFactoryClassName((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.PALETTE__GROUPS:
				getGroups().clear();
				return;
			case GMFGenPackage.PALETTE__FLYOUT:
				setFlyout(FLYOUT_EDEFAULT);
				return;
			case GMFGenPackage.PALETTE__NEED_ZOOM_TOOLS:
				setNeedZoomTools(NEED_ZOOM_TOOLS_EDEFAULT);
				return;
			case GMFGenPackage.PALETTE__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.PALETTE__FACTORY_CLASS_NAME:
				setFactoryClassName(FACTORY_CLASS_NAME_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.PALETTE__DIAGRAM:
				return getDiagram() != null;
			case GMFGenPackage.PALETTE__GROUPS:
				return groups != null && !groups.isEmpty();
			case GMFGenPackage.PALETTE__FLYOUT:
				return flyout != FLYOUT_EDEFAULT;
			case GMFGenPackage.PALETTE__NEED_ZOOM_TOOLS:
				return needZoomTools != NEED_ZOOM_TOOLS_EDEFAULT;
			case GMFGenPackage.PALETTE__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case GMFGenPackage.PALETTE__FACTORY_CLASS_NAME:
				return FACTORY_CLASS_NAME_EDEFAULT == null ? factoryClassName != null : !FACTORY_CLASS_NAME_EDEFAULT.equals(factoryClassName);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (flyout: ");
		result.append(flyout);
		result.append(", needZoomTools: ");
		result.append(needZoomTools);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(", factoryClassName: ");
		result.append(factoryClassName);
		result.append(')');
		return result.toString();
	}

} //PaletteImpl
