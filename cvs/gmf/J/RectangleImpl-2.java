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
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FontStyle;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.LineKind;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.Rectangle;
import org.eclipse.gmf.gmfgraph.SizeStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RectangleImpl extends ShapeImpl implements Rectangle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getRectangle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGraphPackage.RECTANGLE__PARENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGraphPackage.RECTANGLE__PARENT, msgs);
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
				case GMFGraphPackage.RECTANGLE__CHILDREN:
					return ((InternalEList)getChildren()).basicRemove(otherEnd, msgs);
				case GMFGraphPackage.RECTANGLE__PARENT:
					return eBasicSetContainer(null, GMFGraphPackage.RECTANGLE__PARENT, msgs);
				case GMFGraphPackage.RECTANGLE__COLOR_STYLE:
					return basicSetColorStyle(null, msgs);
				case GMFGraphPackage.RECTANGLE__SIZE_STYLE:
					return basicSetSizeStyle(null, msgs);
				case GMFGraphPackage.RECTANGLE__FONT_STYLE:
					return basicSetFontStyle(null, msgs);
				case GMFGraphPackage.RECTANGLE__LOCATION:
					return basicSetLocation(null, msgs);
				case GMFGraphPackage.RECTANGLE__SIZE:
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
				case GMFGraphPackage.RECTANGLE__PARENT:
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
			case GMFGraphPackage.RECTANGLE__NAME:
				return getName();
			case GMFGraphPackage.RECTANGLE__CHILDREN:
				return getChildren();
			case GMFGraphPackage.RECTANGLE__PARENT:
				return getParent();
			case GMFGraphPackage.RECTANGLE__COLOR_STYLE:
				return getColorStyle();
			case GMFGraphPackage.RECTANGLE__SIZE_STYLE:
				return getSizeStyle();
			case GMFGraphPackage.RECTANGLE__FONT_STYLE:
				return getFontStyle();
			case GMFGraphPackage.RECTANGLE__LOCATION:
				return getLocation();
			case GMFGraphPackage.RECTANGLE__SIZE:
				return getSize();
			case GMFGraphPackage.RECTANGLE__LAYOUT_MANAGER:
				return getLayoutManager();
			case GMFGraphPackage.RECTANGLE__OUTLINE:
				return isOutline() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.RECTANGLE__FILL:
				return isFill() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.RECTANGLE__LINE_WIDTH:
				return new Integer(getLineWidth());
			case GMFGraphPackage.RECTANGLE__LINE_KIND:
				return getLineKind();
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
			case GMFGraphPackage.RECTANGLE__NAME:
				setName((String)newValue);
				return;
			case GMFGraphPackage.RECTANGLE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection)newValue);
				return;
			case GMFGraphPackage.RECTANGLE__COLOR_STYLE:
				setColorStyle((ColorStyle)newValue);
				return;
			case GMFGraphPackage.RECTANGLE__SIZE_STYLE:
				setSizeStyle((SizeStyle)newValue);
				return;
			case GMFGraphPackage.RECTANGLE__FONT_STYLE:
				setFontStyle((FontStyle)newValue);
				return;
			case GMFGraphPackage.RECTANGLE__LOCATION:
				setLocation((Point)newValue);
				return;
			case GMFGraphPackage.RECTANGLE__SIZE:
				setSize((Point)newValue);
				return;
			case GMFGraphPackage.RECTANGLE__LAYOUT_MANAGER:
				setLayoutManager((String)newValue);
				return;
			case GMFGraphPackage.RECTANGLE__OUTLINE:
				setOutline(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.RECTANGLE__FILL:
				setFill(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.RECTANGLE__LINE_WIDTH:
				setLineWidth(((Integer)newValue).intValue());
				return;
			case GMFGraphPackage.RECTANGLE__LINE_KIND:
				setLineKind((LineKind)newValue);
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
			case GMFGraphPackage.RECTANGLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGraphPackage.RECTANGLE__CHILDREN:
				getChildren().clear();
				return;
			case GMFGraphPackage.RECTANGLE__COLOR_STYLE:
				setColorStyle((ColorStyle)null);
				return;
			case GMFGraphPackage.RECTANGLE__SIZE_STYLE:
				setSizeStyle((SizeStyle)null);
				return;
			case GMFGraphPackage.RECTANGLE__FONT_STYLE:
				setFontStyle((FontStyle)null);
				return;
			case GMFGraphPackage.RECTANGLE__LOCATION:
				setLocation((Point)null);
				return;
			case GMFGraphPackage.RECTANGLE__SIZE:
				setSize((Point)null);
				return;
			case GMFGraphPackage.RECTANGLE__LAYOUT_MANAGER:
				setLayoutManager(LAYOUT_MANAGER_EDEFAULT);
				return;
			case GMFGraphPackage.RECTANGLE__OUTLINE:
				setOutline(OUTLINE_EDEFAULT);
				return;
			case GMFGraphPackage.RECTANGLE__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case GMFGraphPackage.RECTANGLE__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case GMFGraphPackage.RECTANGLE__LINE_KIND:
				setLineKind(LINE_KIND_EDEFAULT);
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
			case GMFGraphPackage.RECTANGLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGraphPackage.RECTANGLE__CHILDREN:
				return children != null && !children.isEmpty();
			case GMFGraphPackage.RECTANGLE__PARENT:
				return getParent() != null;
			case GMFGraphPackage.RECTANGLE__COLOR_STYLE:
				return colorStyle != null;
			case GMFGraphPackage.RECTANGLE__SIZE_STYLE:
				return sizeStyle != null;
			case GMFGraphPackage.RECTANGLE__FONT_STYLE:
				return fontStyle != null;
			case GMFGraphPackage.RECTANGLE__LOCATION:
				return location != null;
			case GMFGraphPackage.RECTANGLE__SIZE:
				return size != null;
			case GMFGraphPackage.RECTANGLE__LAYOUT_MANAGER:
				return LAYOUT_MANAGER_EDEFAULT == null ? layoutManager != null : !LAYOUT_MANAGER_EDEFAULT.equals(layoutManager);
			case GMFGraphPackage.RECTANGLE__OUTLINE:
				return outline != OUTLINE_EDEFAULT;
			case GMFGraphPackage.RECTANGLE__FILL:
				return fill != FILL_EDEFAULT;
			case GMFGraphPackage.RECTANGLE__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case GMFGraphPackage.RECTANGLE__LINE_KIND:
				return lineKind != LINE_KIND_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

} //RectangleImpl