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
import org.eclipse.gmf.gmfgraph.Ellipse;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FontStyle;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.LineKind;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.SizeStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EllipseImpl extends ShapeImpl implements Ellipse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EllipseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getEllipse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGraphPackage.ELLIPSE__PARENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGraphPackage.ELLIPSE__PARENT, msgs);
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
				case GMFGraphPackage.ELLIPSE__CHILDREN:
					return ((InternalEList)getChildren()).basicRemove(otherEnd, msgs);
				case GMFGraphPackage.ELLIPSE__PARENT:
					return eBasicSetContainer(null, GMFGraphPackage.ELLIPSE__PARENT, msgs);
				case GMFGraphPackage.ELLIPSE__COLOR_STYLE:
					return basicSetColorStyle(null, msgs);
				case GMFGraphPackage.ELLIPSE__SIZE_STYLE:
					return basicSetSizeStyle(null, msgs);
				case GMFGraphPackage.ELLIPSE__FONT_STYLE:
					return basicSetFontStyle(null, msgs);
				case GMFGraphPackage.ELLIPSE__LOCATION:
					return basicSetLocation(null, msgs);
				case GMFGraphPackage.ELLIPSE__SIZE:
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
				case GMFGraphPackage.ELLIPSE__PARENT:
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
			case GMFGraphPackage.ELLIPSE__NAME:
				return getName();
			case GMFGraphPackage.ELLIPSE__CHILDREN:
				return getChildren();
			case GMFGraphPackage.ELLIPSE__PARENT:
				return getParent();
			case GMFGraphPackage.ELLIPSE__COLOR_STYLE:
				return getColorStyle();
			case GMFGraphPackage.ELLIPSE__SIZE_STYLE:
				return getSizeStyle();
			case GMFGraphPackage.ELLIPSE__FONT_STYLE:
				return getFontStyle();
			case GMFGraphPackage.ELLIPSE__LOCATION:
				return getLocation();
			case GMFGraphPackage.ELLIPSE__SIZE:
				return getSize();
			case GMFGraphPackage.ELLIPSE__LAYOUT_MANAGER:
				return getLayoutManager();
			case GMFGraphPackage.ELLIPSE__OUTLINE:
				return isOutline() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.ELLIPSE__FILL:
				return isFill() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.ELLIPSE__LINE_WIDTH:
				return new Integer(getLineWidth());
			case GMFGraphPackage.ELLIPSE__LINE_KIND:
				return getLineKind();
			case GMFGraphPackage.ELLIPSE__XOR_FILL:
				return isXorFill() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.ELLIPSE__XOR_OUTLINE:
				return isXorOutline() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.ELLIPSE__RESOLVED_CHILDREN:
				return getResolvedChildren();
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
			case GMFGraphPackage.ELLIPSE__NAME:
				setName((String)newValue);
				return;
			case GMFGraphPackage.ELLIPSE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection)newValue);
				return;
			case GMFGraphPackage.ELLIPSE__COLOR_STYLE:
				setColorStyle((ColorStyle)newValue);
				return;
			case GMFGraphPackage.ELLIPSE__SIZE_STYLE:
				setSizeStyle((SizeStyle)newValue);
				return;
			case GMFGraphPackage.ELLIPSE__FONT_STYLE:
				setFontStyle((FontStyle)newValue);
				return;
			case GMFGraphPackage.ELLIPSE__LOCATION:
				setLocation((Point)newValue);
				return;
			case GMFGraphPackage.ELLIPSE__SIZE:
				setSize((Point)newValue);
				return;
			case GMFGraphPackage.ELLIPSE__LAYOUT_MANAGER:
				setLayoutManager((String)newValue);
				return;
			case GMFGraphPackage.ELLIPSE__OUTLINE:
				setOutline(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.ELLIPSE__FILL:
				setFill(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.ELLIPSE__LINE_WIDTH:
				setLineWidth(((Integer)newValue).intValue());
				return;
			case GMFGraphPackage.ELLIPSE__LINE_KIND:
				setLineKind((LineKind)newValue);
				return;
			case GMFGraphPackage.ELLIPSE__XOR_FILL:
				setXorFill(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.ELLIPSE__XOR_OUTLINE:
				setXorOutline(((Boolean)newValue).booleanValue());
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
			case GMFGraphPackage.ELLIPSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGraphPackage.ELLIPSE__CHILDREN:
				getChildren().clear();
				return;
			case GMFGraphPackage.ELLIPSE__COLOR_STYLE:
				setColorStyle((ColorStyle)null);
				return;
			case GMFGraphPackage.ELLIPSE__SIZE_STYLE:
				setSizeStyle((SizeStyle)null);
				return;
			case GMFGraphPackage.ELLIPSE__FONT_STYLE:
				setFontStyle((FontStyle)null);
				return;
			case GMFGraphPackage.ELLIPSE__LOCATION:
				setLocation((Point)null);
				return;
			case GMFGraphPackage.ELLIPSE__SIZE:
				setSize((Point)null);
				return;
			case GMFGraphPackage.ELLIPSE__LAYOUT_MANAGER:
				setLayoutManager(LAYOUT_MANAGER_EDEFAULT);
				return;
			case GMFGraphPackage.ELLIPSE__OUTLINE:
				setOutline(OUTLINE_EDEFAULT);
				return;
			case GMFGraphPackage.ELLIPSE__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case GMFGraphPackage.ELLIPSE__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case GMFGraphPackage.ELLIPSE__LINE_KIND:
				setLineKind(LINE_KIND_EDEFAULT);
				return;
			case GMFGraphPackage.ELLIPSE__XOR_FILL:
				setXorFill(XOR_FILL_EDEFAULT);
				return;
			case GMFGraphPackage.ELLIPSE__XOR_OUTLINE:
				setXorOutline(XOR_OUTLINE_EDEFAULT);
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
			case GMFGraphPackage.ELLIPSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGraphPackage.ELLIPSE__CHILDREN:
				return children != null && !children.isEmpty();
			case GMFGraphPackage.ELLIPSE__PARENT:
				return getParent() != null;
			case GMFGraphPackage.ELLIPSE__COLOR_STYLE:
				return colorStyle != null;
			case GMFGraphPackage.ELLIPSE__SIZE_STYLE:
				return sizeStyle != null;
			case GMFGraphPackage.ELLIPSE__FONT_STYLE:
				return fontStyle != null;
			case GMFGraphPackage.ELLIPSE__LOCATION:
				return location != null;
			case GMFGraphPackage.ELLIPSE__SIZE:
				return size != null;
			case GMFGraphPackage.ELLIPSE__LAYOUT_MANAGER:
				return LAYOUT_MANAGER_EDEFAULT == null ? layoutManager != null : !LAYOUT_MANAGER_EDEFAULT.equals(layoutManager);
			case GMFGraphPackage.ELLIPSE__OUTLINE:
				return outline != OUTLINE_EDEFAULT;
			case GMFGraphPackage.ELLIPSE__FILL:
				return fill != FILL_EDEFAULT;
			case GMFGraphPackage.ELLIPSE__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case GMFGraphPackage.ELLIPSE__LINE_KIND:
				return lineKind != LINE_KIND_EDEFAULT;
			case GMFGraphPackage.ELLIPSE__XOR_FILL:
				return xorFill != XOR_FILL_EDEFAULT;
			case GMFGraphPackage.ELLIPSE__XOR_OUTLINE:
				return xorOutline != XOR_OUTLINE_EDEFAULT;
			case GMFGraphPackage.ELLIPSE__RESOLVED_CHILDREN:
				return !getResolvedChildren().isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //EllipseImpl
