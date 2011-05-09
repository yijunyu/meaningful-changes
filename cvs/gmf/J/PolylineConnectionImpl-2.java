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
import org.eclipse.gmf.gmfgraph.DecorationFigure;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FontStyle;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.LineKind;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.PolylineConnection;
import org.eclipse.gmf.gmfgraph.SizeStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polyline Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.PolylineConnectionImpl#getSourceDecoration <em>Source Decoration</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.PolylineConnectionImpl#getTargetDecoration <em>Target Decoration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolylineConnectionImpl extends PolylineImpl implements PolylineConnection {
	/**
	 * The cached value of the '{@link #getSourceDecoration() <em>Source Decoration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDecoration()
	 * @generated
	 * @ordered
	 */
	protected DecorationFigure sourceDecoration = null;

	/**
	 * The cached value of the '{@link #getTargetDecoration() <em>Target Decoration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDecoration()
	 * @generated
	 * @ordered
	 */
	protected DecorationFigure targetDecoration = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolylineConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getPolylineConnection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecorationFigure getSourceDecoration() {
		return sourceDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceDecoration(DecorationFigure newSourceDecoration, NotificationChain msgs) {
		DecorationFigure oldSourceDecoration = sourceDecoration;
		sourceDecoration = newSourceDecoration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION, oldSourceDecoration, newSourceDecoration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDecoration(DecorationFigure newSourceDecoration) {
		if (newSourceDecoration != sourceDecoration) {
			NotificationChain msgs = null;
			if (sourceDecoration != null)
				msgs = ((InternalEObject)sourceDecoration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION, null, msgs);
			if (newSourceDecoration != null)
				msgs = ((InternalEObject)newSourceDecoration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION, null, msgs);
			msgs = basicSetSourceDecoration(newSourceDecoration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION, newSourceDecoration, newSourceDecoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecorationFigure getTargetDecoration() {
		return targetDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetDecoration(DecorationFigure newTargetDecoration, NotificationChain msgs) {
		DecorationFigure oldTargetDecoration = targetDecoration;
		targetDecoration = newTargetDecoration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION, oldTargetDecoration, newTargetDecoration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDecoration(DecorationFigure newTargetDecoration) {
		if (newTargetDecoration != targetDecoration) {
			NotificationChain msgs = null;
			if (targetDecoration != null)
				msgs = ((InternalEObject)targetDecoration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION, null, msgs);
			if (newTargetDecoration != null)
				msgs = ((InternalEObject)newTargetDecoration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION, null, msgs);
			msgs = basicSetTargetDecoration(newTargetDecoration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION, newTargetDecoration, newTargetDecoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGraphPackage.POLYLINE_CONNECTION__PARENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGraphPackage.POLYLINE_CONNECTION__PARENT, msgs);
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
				case GMFGraphPackage.POLYLINE_CONNECTION__CHILDREN:
					return ((InternalEList)getChildren()).basicRemove(otherEnd, msgs);
				case GMFGraphPackage.POLYLINE_CONNECTION__PARENT:
					return eBasicSetContainer(null, GMFGraphPackage.POLYLINE_CONNECTION__PARENT, msgs);
				case GMFGraphPackage.POLYLINE_CONNECTION__COLOR_STYLE:
					return basicSetColorStyle(null, msgs);
				case GMFGraphPackage.POLYLINE_CONNECTION__SIZE_STYLE:
					return basicSetSizeStyle(null, msgs);
				case GMFGraphPackage.POLYLINE_CONNECTION__FONT_STYLE:
					return basicSetFontStyle(null, msgs);
				case GMFGraphPackage.POLYLINE_CONNECTION__LOCATION:
					return basicSetLocation(null, msgs);
				case GMFGraphPackage.POLYLINE_CONNECTION__SIZE:
					return basicSetSize(null, msgs);
				case GMFGraphPackage.POLYLINE_CONNECTION__TEMPLATE:
					return ((InternalEList)getTemplate()).basicRemove(otherEnd, msgs);
				case GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION:
					return basicSetSourceDecoration(null, msgs);
				case GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION:
					return basicSetTargetDecoration(null, msgs);
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
				case GMFGraphPackage.POLYLINE_CONNECTION__PARENT:
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
			case GMFGraphPackage.POLYLINE_CONNECTION__NAME:
				return getName();
			case GMFGraphPackage.POLYLINE_CONNECTION__CHILDREN:
				return getChildren();
			case GMFGraphPackage.POLYLINE_CONNECTION__PARENT:
				return getParent();
			case GMFGraphPackage.POLYLINE_CONNECTION__COLOR_STYLE:
				return getColorStyle();
			case GMFGraphPackage.POLYLINE_CONNECTION__SIZE_STYLE:
				return getSizeStyle();
			case GMFGraphPackage.POLYLINE_CONNECTION__FONT_STYLE:
				return getFontStyle();
			case GMFGraphPackage.POLYLINE_CONNECTION__LOCATION:
				return getLocation();
			case GMFGraphPackage.POLYLINE_CONNECTION__SIZE:
				return getSize();
			case GMFGraphPackage.POLYLINE_CONNECTION__LAYOUT_MANAGER:
				return getLayoutManager();
			case GMFGraphPackage.POLYLINE_CONNECTION__OUTLINE:
				return isOutline() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.POLYLINE_CONNECTION__FILL:
				return isFill() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.POLYLINE_CONNECTION__LINE_WIDTH:
				return new Integer(getLineWidth());
			case GMFGraphPackage.POLYLINE_CONNECTION__LINE_KIND:
				return getLineKind();
			case GMFGraphPackage.POLYLINE_CONNECTION__TEMPLATE:
				return getTemplate();
			case GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION:
				return getSourceDecoration();
			case GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION:
				return getTargetDecoration();
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
			case GMFGraphPackage.POLYLINE_CONNECTION__NAME:
				setName((String)newValue);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection)newValue);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__COLOR_STYLE:
				setColorStyle((ColorStyle)newValue);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__SIZE_STYLE:
				setSizeStyle((SizeStyle)newValue);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__FONT_STYLE:
				setFontStyle((FontStyle)newValue);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__LOCATION:
				setLocation((Point)newValue);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__SIZE:
				setSize((Point)newValue);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__LAYOUT_MANAGER:
				setLayoutManager((String)newValue);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__OUTLINE:
				setOutline(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__FILL:
				setFill(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__LINE_WIDTH:
				setLineWidth(((Integer)newValue).intValue());
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__LINE_KIND:
				setLineKind((LineKind)newValue);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__TEMPLATE:
				getTemplate().clear();
				getTemplate().addAll((Collection)newValue);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION:
				setSourceDecoration((DecorationFigure)newValue);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION:
				setTargetDecoration((DecorationFigure)newValue);
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
			case GMFGraphPackage.POLYLINE_CONNECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__CHILDREN:
				getChildren().clear();
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__COLOR_STYLE:
				setColorStyle((ColorStyle)null);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__SIZE_STYLE:
				setSizeStyle((SizeStyle)null);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__FONT_STYLE:
				setFontStyle((FontStyle)null);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__LOCATION:
				setLocation((Point)null);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__SIZE:
				setSize((Point)null);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__LAYOUT_MANAGER:
				setLayoutManager(LAYOUT_MANAGER_EDEFAULT);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__OUTLINE:
				setOutline(OUTLINE_EDEFAULT);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__LINE_KIND:
				setLineKind(LINE_KIND_EDEFAULT);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__TEMPLATE:
				getTemplate().clear();
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION:
				setSourceDecoration((DecorationFigure)null);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION:
				setTargetDecoration((DecorationFigure)null);
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
			case GMFGraphPackage.POLYLINE_CONNECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGraphPackage.POLYLINE_CONNECTION__CHILDREN:
				return children != null && !children.isEmpty();
			case GMFGraphPackage.POLYLINE_CONNECTION__PARENT:
				return getParent() != null;
			case GMFGraphPackage.POLYLINE_CONNECTION__COLOR_STYLE:
				return colorStyle != null;
			case GMFGraphPackage.POLYLINE_CONNECTION__SIZE_STYLE:
				return sizeStyle != null;
			case GMFGraphPackage.POLYLINE_CONNECTION__FONT_STYLE:
				return fontStyle != null;
			case GMFGraphPackage.POLYLINE_CONNECTION__LOCATION:
				return location != null;
			case GMFGraphPackage.POLYLINE_CONNECTION__SIZE:
				return size != null;
			case GMFGraphPackage.POLYLINE_CONNECTION__LAYOUT_MANAGER:
				return LAYOUT_MANAGER_EDEFAULT == null ? layoutManager != null : !LAYOUT_MANAGER_EDEFAULT.equals(layoutManager);
			case GMFGraphPackage.POLYLINE_CONNECTION__OUTLINE:
				return outline != OUTLINE_EDEFAULT;
			case GMFGraphPackage.POLYLINE_CONNECTION__FILL:
				return fill != FILL_EDEFAULT;
			case GMFGraphPackage.POLYLINE_CONNECTION__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case GMFGraphPackage.POLYLINE_CONNECTION__LINE_KIND:
				return lineKind != LINE_KIND_EDEFAULT;
			case GMFGraphPackage.POLYLINE_CONNECTION__TEMPLATE:
				return template != null && !template.isEmpty();
			case GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION:
				return sourceDecoration != null;
			case GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION:
				return targetDecoration != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //PolylineConnectionImpl
