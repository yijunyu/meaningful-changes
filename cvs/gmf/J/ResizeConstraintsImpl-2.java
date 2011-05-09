/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.ResizeConstraints;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resize Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ResizeConstraintsImpl#getResizeHandles <em>Resize Handles</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ResizeConstraintsImpl#getNonResizeHandles <em>Non Resize Handles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResizeConstraintsImpl extends EObjectImpl implements ResizeConstraints {
	/**
	 * The default value of the '{@link #getResizeHandles() <em>Resize Handles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeHandles()
	 * @generated
	 * @ordered
	 */
	protected static final int RESIZE_HANDLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResizeHandles() <em>Resize Handles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeHandles()
	 * @generated
	 * @ordered
	 */
	protected int resizeHandles = RESIZE_HANDLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNonResizeHandles() <em>Non Resize Handles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonResizeHandles()
	 * @generated
	 * @ordered
	 */
	protected static final int NON_RESIZE_HANDLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNonResizeHandles() <em>Non Resize Handles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonResizeHandles()
	 * @generated
	 * @ordered
	 */
	protected int nonResizeHandles = NON_RESIZE_HANDLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResizeConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getResizeConstraints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResizeHandles() {
		return resizeHandles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResizeHandles(int newResizeHandles) {
		int oldResizeHandles = resizeHandles;
		resizeHandles = newResizeHandles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.RESIZE_CONSTRAINTS__RESIZE_HANDLES, oldResizeHandles, resizeHandles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNonResizeHandles() {
		return nonResizeHandles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonResizeHandles(int newNonResizeHandles) {
		int oldNonResizeHandles = nonResizeHandles;
		nonResizeHandles = newNonResizeHandles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.RESIZE_CONSTRAINTS__NON_RESIZE_HANDLES, oldNonResizeHandles, nonResizeHandles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getResizeHandleNames() {
		return getPositionConstantNames(getResizeHandles());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getNonResizeHandleNames() {
		return getPositionConstantNames(getNonResizeHandles());
	}

	private EList getPositionConstantNames(int value) {
		EList rv = new BasicEList();
		addConstantIfFlagSet(value, PositionConstants.NORTH, "NORTH", rv);
		addConstantIfFlagSet(value, PositionConstants.SOUTH, "SOUTH", rv);
		addConstantIfFlagSet(value, PositionConstants.WEST, "WEST", rv);
		addConstantIfFlagSet(value, PositionConstants.EAST, "EAST", rv);
		addConstantIfFlagSet(value, PositionConstants.NORTH_EAST, "NORTH_EAST", rv);
		addConstantIfFlagSet(value, PositionConstants.NORTH_WEST, "NORTH_WEST", rv);
		addConstantIfFlagSet(value, PositionConstants.SOUTH_EAST, "SOUTH_EAST", rv);
		addConstantIfFlagSet(value, PositionConstants.SOUTH_WEST, "SOUTH_WEST", rv);
		return rv;
	}

	private static void addConstantIfFlagSet(int value, int flag, String constantName, EList list) {
		if ((value & flag) == flag) {
			list.add(constantName);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.RESIZE_CONSTRAINTS__RESIZE_HANDLES:
				return new Integer(getResizeHandles());
			case GMFGenPackage.RESIZE_CONSTRAINTS__NON_RESIZE_HANDLES:
				return new Integer(getNonResizeHandles());
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
			case GMFGenPackage.RESIZE_CONSTRAINTS__RESIZE_HANDLES:
				setResizeHandles(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.RESIZE_CONSTRAINTS__NON_RESIZE_HANDLES:
				setNonResizeHandles(((Integer)newValue).intValue());
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
			case GMFGenPackage.RESIZE_CONSTRAINTS__RESIZE_HANDLES:
				setResizeHandles(RESIZE_HANDLES_EDEFAULT);
				return;
			case GMFGenPackage.RESIZE_CONSTRAINTS__NON_RESIZE_HANDLES:
				setNonResizeHandles(NON_RESIZE_HANDLES_EDEFAULT);
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
			case GMFGenPackage.RESIZE_CONSTRAINTS__RESIZE_HANDLES:
				return resizeHandles != RESIZE_HANDLES_EDEFAULT;
			case GMFGenPackage.RESIZE_CONSTRAINTS__NON_RESIZE_HANDLES:
				return nonResizeHandles != NON_RESIZE_HANDLES_EDEFAULT;
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
		result.append(" (resizeHandles: ");
		result.append(resizeHandles);
		result.append(", nonResizeHandles: ");
		result.append(nonResizeHandles);
		result.append(')');
		return result.toString();
	}

} //ResizeConstraintsImpl
