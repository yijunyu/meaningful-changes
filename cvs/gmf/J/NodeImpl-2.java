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
import org.eclipse.gmf.gmfgraph.Direction;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.NodeImpl#getResizeConstraint <em>Resize Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends DiagramElementImpl implements Node {
	/**
	 * The default value of the '{@link #getResizeConstraint() <em>Resize Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final Direction RESIZE_CONSTRAINT_EDEFAULT = Direction.NORTH_LITERAL;

	/**
	 * The cached value of the '{@link #getResizeConstraint() <em>Resize Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeConstraint()
	 * @generated
	 * @ordered
	 */
	protected Direction resizeConstraint = RESIZE_CONSTRAINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getResizeConstraint() {
		return resizeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResizeConstraint(Direction newResizeConstraint) {
		Direction oldResizeConstraint = resizeConstraint;
		resizeConstraint = newResizeConstraint == null ? RESIZE_CONSTRAINT_EDEFAULT : newResizeConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.NODE__RESIZE_CONSTRAINT, oldResizeConstraint, resizeConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGraphPackage.NODE__FACETS:
					return ((InternalEList)getFacets()).basicRemove(otherEnd, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGraphPackage.NODE__NAME:
				return getName();
			case GMFGraphPackage.NODE__FIGURE:
				if (resolve) return getFigure();
				return basicGetFigure();
			case GMFGraphPackage.NODE__FACETS:
				return getFacets();
			case GMFGraphPackage.NODE__RESIZE_CONSTRAINT:
				return getResizeConstraint();
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
			case GMFGraphPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case GMFGraphPackage.NODE__FIGURE:
				setFigure((Figure)newValue);
				return;
			case GMFGraphPackage.NODE__FACETS:
				getFacets().clear();
				getFacets().addAll((Collection)newValue);
				return;
			case GMFGraphPackage.NODE__RESIZE_CONSTRAINT:
				setResizeConstraint((Direction)newValue);
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
			case GMFGraphPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GMFGraphPackage.NODE__FIGURE:
				setFigure((Figure)null);
				return;
			case GMFGraphPackage.NODE__FACETS:
				getFacets().clear();
				return;
			case GMFGraphPackage.NODE__RESIZE_CONSTRAINT:
				setResizeConstraint(RESIZE_CONSTRAINT_EDEFAULT);
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
			case GMFGraphPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GMFGraphPackage.NODE__FIGURE:
				return figure != null;
			case GMFGraphPackage.NODE__FACETS:
				return facets != null && !facets.isEmpty();
			case GMFGraphPackage.NODE__RESIZE_CONSTRAINT:
				return resizeConstraint != RESIZE_CONSTRAINT_EDEFAULT;
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
		result.append(" (resizeConstraint: ");
		result.append(resizeConstraint);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
