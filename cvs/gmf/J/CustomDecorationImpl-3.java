/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.gmfgraph.ColorStyle;
import org.eclipse.gmf.gmfgraph.CustomDecoration;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FontStyle;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.SizeStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CustomDecorationImpl extends CustomFigureImpl implements CustomDecoration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomDecorationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getCustomDecoration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGraphPackage.CUSTOM_DECORATION__PARENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGraphPackage.CUSTOM_DECORATION__PARENT, msgs);
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
				case GMFGraphPackage.CUSTOM_DECORATION__CHILDREN:
					return ((InternalEList)getChildren()).basicRemove(otherEnd, msgs);
				case GMFGraphPackage.CUSTOM_DECORATION__PARENT:
					return eBasicSetContainer(null, GMFGraphPackage.CUSTOM_DECORATION__PARENT, msgs);
				case GMFGraphPackage.CUSTOM_DECORATION__COLOR_STYLE:
					return basicSetColorStyle(null, msgs);
				case GMFGraphPackage.CUSTOM_DECORATION__SIZE_STYLE:
					return basicSetSizeStyle(null, msgs);
				case GMFGraphPackage.CUSTOM_DECORATION__FONT_STYLE:
					return basicSetFontStyle(null, msgs);
				case GMFGraphPackage.CUSTOM_DECORATION__LOCATION:
					return basicSetLocation(null, msgs);
				case GMFGraphPackage.CUSTOM_DECORATION__SIZE:
					return basicSetSize(null, msgs);
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
				case GMFGraphPackage.CUSTOM_DECORATION__PARENT:
					return eContainer.eInverseRemove(this, GMFGraphPackage.FIGURE__CHILDREN, Figure.class, msgs);
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
			case GMFGraphPackage.CUSTOM_DECORATION__NAME:
				return getName();
			case GMFGraphPackage.CUSTOM_DECORATION__CHILDREN:
				return getChildren();
			case GMFGraphPackage.CUSTOM_DECORATION__PARENT:
				return getParent();
			case GMFGraphPackage.CUSTOM_DECORATION__COLOR_STYLE:
				return getColorStyle();
			case GMFGraphPackage.CUSTOM_DECORATION__SIZE_STYLE:
				return getSizeStyle();
			case GMFGraphPackage.CUSTOM_DECORATION__FONT_STYLE:
				return getFontStyle();
			case GMFGraphPackage.CUSTOM_DECORATION__LOCATION:
				return getLocation();
			case GMFGraphPackage.CUSTOM_DECORATION__SIZE:
				return getSize();
			case GMFGraphPackage.CUSTOM_DECORATION__LAYOUT_MANAGER:
				return getLayoutManager();
			case GMFGraphPackage.CUSTOM_DECORATION__RESOLVED_CHILDREN:
				return getResolvedChildren();
			case GMFGraphPackage.CUSTOM_DECORATION__QUALIFIED_CLASS_NAME:
				return getQualifiedClassName();
			case GMFGraphPackage.CUSTOM_DECORATION__BUNDLE_NAME:
				return getBundleName();
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
			case GMFGraphPackage.CUSTOM_DECORATION__NAME:
				setName((String)newValue);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection)newValue);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__COLOR_STYLE:
				setColorStyle((ColorStyle)newValue);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__SIZE_STYLE:
				setSizeStyle((SizeStyle)newValue);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__FONT_STYLE:
				setFontStyle((FontStyle)newValue);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__LOCATION:
				setLocation((Point)newValue);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__SIZE:
				setSize((Point)newValue);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__LAYOUT_MANAGER:
				setLayoutManager((String)newValue);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__QUALIFIED_CLASS_NAME:
				setQualifiedClassName((String)newValue);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__BUNDLE_NAME:
				setBundleName((String)newValue);
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
			case GMFGraphPackage.CUSTOM_DECORATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__CHILDREN:
				getChildren().clear();
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__COLOR_STYLE:
				setColorStyle((ColorStyle)null);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__SIZE_STYLE:
				setSizeStyle((SizeStyle)null);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__FONT_STYLE:
				setFontStyle((FontStyle)null);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__LOCATION:
				setLocation((Point)null);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__SIZE:
				setSize((Point)null);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__LAYOUT_MANAGER:
				setLayoutManager(LAYOUT_MANAGER_EDEFAULT);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__QUALIFIED_CLASS_NAME:
				setQualifiedClassName(QUALIFIED_CLASS_NAME_EDEFAULT);
				return;
			case GMFGraphPackage.CUSTOM_DECORATION__BUNDLE_NAME:
				setBundleName(BUNDLE_NAME_EDEFAULT);
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
			case GMFGraphPackage.CUSTOM_DECORATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGraphPackage.CUSTOM_DECORATION__CHILDREN:
				return children != null && !children.isEmpty();
			case GMFGraphPackage.CUSTOM_DECORATION__PARENT:
				return getParent() != null;
			case GMFGraphPackage.CUSTOM_DECORATION__COLOR_STYLE:
				return colorStyle != null;
			case GMFGraphPackage.CUSTOM_DECORATION__SIZE_STYLE:
				return sizeStyle != null;
			case GMFGraphPackage.CUSTOM_DECORATION__FONT_STYLE:
				return fontStyle != null;
			case GMFGraphPackage.CUSTOM_DECORATION__LOCATION:
				return location != null;
			case GMFGraphPackage.CUSTOM_DECORATION__SIZE:
				return size != null;
			case GMFGraphPackage.CUSTOM_DECORATION__LAYOUT_MANAGER:
				return LAYOUT_MANAGER_EDEFAULT == null ? layoutManager != null : !LAYOUT_MANAGER_EDEFAULT.equals(layoutManager);
			case GMFGraphPackage.CUSTOM_DECORATION__RESOLVED_CHILDREN:
				return !getResolvedChildren().isEmpty();
			case GMFGraphPackage.CUSTOM_DECORATION__QUALIFIED_CLASS_NAME:
				return QUALIFIED_CLASS_NAME_EDEFAULT == null ? qualifiedClassName != null : !QUALIFIED_CLASS_NAME_EDEFAULT.equals(qualifiedClassName);
			case GMFGraphPackage.CUSTOM_DECORATION__BUNDLE_NAME:
				return BUNDLE_NAME_EDEFAULT == null ? bundleName != null : !BUNDLE_NAME_EDEFAULT.equals(bundleName);
		}
		return eDynamicIsSet(eFeature);
	}

} //CustomDecorationImpl
