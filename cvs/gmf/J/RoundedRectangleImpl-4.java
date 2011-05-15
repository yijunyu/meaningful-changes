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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.gmfgraph.ColorStyle;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FontStyle;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.LineKind;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.RoundedRectangle;
import org.eclipse.gmf.gmfgraph.SizeStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rounded Rectangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.RoundedRectangleImpl#getCornerWidth <em>Corner Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.RoundedRectangleImpl#getCornerHeight <em>Corner Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoundedRectangleImpl extends ShapeImpl implements RoundedRectangle {
	/**
	 * The default value of the '{@link #getCornerWidth() <em>Corner Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int CORNER_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCornerWidth() <em>Corner Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerWidth()
	 * @generated
	 * @ordered
	 */
	protected int cornerWidth = CORNER_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCornerHeight() <em>Corner Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int CORNER_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCornerHeight() <em>Corner Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerHeight()
	 * @generated
	 * @ordered
	 */
	protected int cornerHeight = CORNER_HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoundedRectangleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getRoundedRectangle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCornerWidth() {
		return cornerWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCornerWidth(int newCornerWidth) {
		int oldCornerWidth = cornerWidth;
		cornerWidth = newCornerWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_WIDTH, oldCornerWidth, cornerWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCornerHeight() {
		return cornerHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCornerHeight(int newCornerHeight) {
		int oldCornerHeight = cornerHeight;
		cornerHeight = newCornerHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_HEIGHT, oldCornerHeight, cornerHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGraphPackage.ROUNDED_RECTANGLE__PARENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGraphPackage.ROUNDED_RECTANGLE__PARENT, msgs);
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
				case GMFGraphPackage.ROUNDED_RECTANGLE__CHILDREN:
					return ((InternalEList)getChildren()).basicRemove(otherEnd, msgs);
				case GMFGraphPackage.ROUNDED_RECTANGLE__PARENT:
					return eBasicSetContainer(null, GMFGraphPackage.ROUNDED_RECTANGLE__PARENT, msgs);
				case GMFGraphPackage.ROUNDED_RECTANGLE__COLOR_STYLE:
					return basicSetColorStyle(null, msgs);
				case GMFGraphPackage.ROUNDED_RECTANGLE__SIZE_STYLE:
					return basicSetSizeStyle(null, msgs);
				case GMFGraphPackage.ROUNDED_RECTANGLE__FONT_STYLE:
					return basicSetFontStyle(null, msgs);
				case GMFGraphPackage.ROUNDED_RECTANGLE__LOCATION:
					return basicSetLocation(null, msgs);
				case GMFGraphPackage.ROUNDED_RECTANGLE__SIZE:
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
				case GMFGraphPackage.ROUNDED_RECTANGLE__PARENT:
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
			case GMFGraphPackage.ROUNDED_RECTANGLE__NAME:
				return getName();
			case GMFGraphPackage.ROUNDED_RECTANGLE__CHILDREN:
				return getChildren();
			case GMFGraphPackage.ROUNDED_RECTANGLE__PARENT:
				return getParent();
			case GMFGraphPackage.ROUNDED_RECTANGLE__COLOR_STYLE:
				return getColorStyle();
			case GMFGraphPackage.ROUNDED_RECTANGLE__SIZE_STYLE:
				return getSizeStyle();
			case GMFGraphPackage.ROUNDED_RECTANGLE__FONT_STYLE:
				return getFontStyle();
			case GMFGraphPackage.ROUNDED_RECTANGLE__LOCATION:
				return getLocation();
			case GMFGraphPackage.ROUNDED_RECTANGLE__SIZE:
				return getSize();
			case GMFGraphPackage.ROUNDED_RECTANGLE__LAYOUT_MANAGER:
				return getLayoutManager();
			case GMFGraphPackage.ROUNDED_RECTANGLE__OUTLINE:
				return isOutline() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.ROUNDED_RECTANGLE__FILL:
				return isFill() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.ROUNDED_RECTANGLE__LINE_WIDTH:
				return new Integer(getLineWidth());
			case GMFGraphPackage.ROUNDED_RECTANGLE__LINE_KIND:
				return getLineKind();
			case GMFGraphPackage.ROUNDED_RECTANGLE__XOR_FILL:
				return isXorFill() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.ROUNDED_RECTANGLE__XOR_OUTLINE:
				return isXorOutline() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.ROUNDED_RECTANGLE__RESOLVED_CHILDREN:
				return getResolvedChildren();
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_WIDTH:
				return new Integer(getCornerWidth());
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_HEIGHT:
				return new Integer(getCornerHeight());
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
			case GMFGraphPackage.ROUNDED_RECTANGLE__NAME:
				setName((String)newValue);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection)newValue);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__COLOR_STYLE:
				setColorStyle((ColorStyle)newValue);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__SIZE_STYLE:
				setSizeStyle((SizeStyle)newValue);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__FONT_STYLE:
				setFontStyle((FontStyle)newValue);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__LOCATION:
				setLocation((Point)newValue);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__SIZE:
				setSize((Point)newValue);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__LAYOUT_MANAGER:
				setLayoutManager((String)newValue);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__OUTLINE:
				setOutline(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__FILL:
				setFill(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__LINE_WIDTH:
				setLineWidth(((Integer)newValue).intValue());
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__LINE_KIND:
				setLineKind((LineKind)newValue);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__XOR_FILL:
				setXorFill(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__XOR_OUTLINE:
				setXorOutline(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_WIDTH:
				setCornerWidth(((Integer)newValue).intValue());
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_HEIGHT:
				setCornerHeight(((Integer)newValue).intValue());
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
			case GMFGraphPackage.ROUNDED_RECTANGLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__CHILDREN:
				getChildren().clear();
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__COLOR_STYLE:
				setColorStyle((ColorStyle)null);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__SIZE_STYLE:
				setSizeStyle((SizeStyle)null);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__FONT_STYLE:
				setFontStyle((FontStyle)null);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__LOCATION:
				setLocation((Point)null);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__SIZE:
				setSize((Point)null);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__LAYOUT_MANAGER:
				setLayoutManager(LAYOUT_MANAGER_EDEFAULT);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__OUTLINE:
				setOutline(OUTLINE_EDEFAULT);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__LINE_KIND:
				setLineKind(LINE_KIND_EDEFAULT);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__XOR_FILL:
				setXorFill(XOR_FILL_EDEFAULT);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__XOR_OUTLINE:
				setXorOutline(XOR_OUTLINE_EDEFAULT);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_WIDTH:
				setCornerWidth(CORNER_WIDTH_EDEFAULT);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_HEIGHT:
				setCornerHeight(CORNER_HEIGHT_EDEFAULT);
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
			case GMFGraphPackage.ROUNDED_RECTANGLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGraphPackage.ROUNDED_RECTANGLE__CHILDREN:
				return children != null && !children.isEmpty();
			case GMFGraphPackage.ROUNDED_RECTANGLE__PARENT:
				return getParent() != null;
			case GMFGraphPackage.ROUNDED_RECTANGLE__COLOR_STYLE:
				return colorStyle != null;
			case GMFGraphPackage.ROUNDED_RECTANGLE__SIZE_STYLE:
				return sizeStyle != null;
			case GMFGraphPackage.ROUNDED_RECTANGLE__FONT_STYLE:
				return fontStyle != null;
			case GMFGraphPackage.ROUNDED_RECTANGLE__LOCATION:
				return location != null;
			case GMFGraphPackage.ROUNDED_RECTANGLE__SIZE:
				return size != null;
			case GMFGraphPackage.ROUNDED_RECTANGLE__LAYOUT_MANAGER:
				return LAYOUT_MANAGER_EDEFAULT == null ? layoutManager != null : !LAYOUT_MANAGER_EDEFAULT.equals(layoutManager);
			case GMFGraphPackage.ROUNDED_RECTANGLE__OUTLINE:
				return outline != OUTLINE_EDEFAULT;
			case GMFGraphPackage.ROUNDED_RECTANGLE__FILL:
				return fill != FILL_EDEFAULT;
			case GMFGraphPackage.ROUNDED_RECTANGLE__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case GMFGraphPackage.ROUNDED_RECTANGLE__LINE_KIND:
				return lineKind != LINE_KIND_EDEFAULT;
			case GMFGraphPackage.ROUNDED_RECTANGLE__XOR_FILL:
				return xorFill != XOR_FILL_EDEFAULT;
			case GMFGraphPackage.ROUNDED_RECTANGLE__XOR_OUTLINE:
				return xorOutline != XOR_OUTLINE_EDEFAULT;
			case GMFGraphPackage.ROUNDED_RECTANGLE__RESOLVED_CHILDREN:
				return !getResolvedChildren().isEmpty();
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_WIDTH:
				return cornerWidth != CORNER_WIDTH_EDEFAULT;
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_HEIGHT:
				return cornerHeight != CORNER_HEIGHT_EDEFAULT;
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
		result.append(" (cornerWidth: ");
		result.append(cornerWidth);
		result.append(", cornerHeight: ");
		result.append(cornerHeight);
		result.append(')');
		return result.toString();
	}

} //RoundedRectangleImpl