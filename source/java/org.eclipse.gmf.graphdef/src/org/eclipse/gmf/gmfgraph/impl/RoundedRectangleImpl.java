/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.RoundedRectangle;

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
	protected static final int CORNER_WIDTH_EDEFAULT = 8;

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
	protected static final int CORNER_HEIGHT_EDEFAULT = 8;

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
	@Override
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_WIDTH:
				return new Integer(getCornerWidth());
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_HEIGHT:
				return new Integer(getCornerHeight());
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
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_WIDTH:
				setCornerWidth(((Integer)newValue).intValue());
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_HEIGHT:
				setCornerHeight(((Integer)newValue).intValue());
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
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_WIDTH:
				setCornerWidth(CORNER_WIDTH_EDEFAULT);
				return;
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_HEIGHT:
				setCornerHeight(CORNER_HEIGHT_EDEFAULT);
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
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_WIDTH:
				return cornerWidth != CORNER_WIDTH_EDEFAULT;
			case GMFGraphPackage.ROUNDED_RECTANGLE__CORNER_HEIGHT:
				return cornerHeight != CORNER_HEIGHT_EDEFAULT;
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
		result.append(" (cornerWidth: ");
		result.append(cornerWidth);
		result.append(", cornerHeight: ");
		result.append(cornerHeight);
		result.append(')');
		return result.toString();
	}

} //RoundedRectangleImpl
