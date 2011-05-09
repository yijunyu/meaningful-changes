/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Layoutable;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.XYLayoutData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XY Layout Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.XYLayoutDataImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.XYLayoutDataImpl#getTopLeft <em>Top Left</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.XYLayoutDataImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XYLayoutDataImpl extends EObjectImpl implements XYLayoutData {
	/**
	 * The cached value of the '{@link #getTopLeft() <em>Top Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLeft()
	 * @generated
	 * @ordered
	 */
	protected Point topLeft = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension size = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XYLayoutDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getXYLayoutData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layoutable getOwner() {
		if (eContainerFeatureID != GMFGraphPackage.XY_LAYOUT_DATA__OWNER) return null;
		return (Layoutable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Layoutable newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, GMFGraphPackage.XY_LAYOUT_DATA__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Layoutable newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID != GMFGraphPackage.XY_LAYOUT_DATA__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, GMFGraphPackage.LAYOUTABLE__LAYOUT_DATA, Layoutable.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.XY_LAYOUT_DATA__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getTopLeft() {
		return topLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopLeft(Point newTopLeft, NotificationChain msgs) {
		Point oldTopLeft = topLeft;
		topLeft = newTopLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.XY_LAYOUT_DATA__TOP_LEFT, oldTopLeft, newTopLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopLeft(Point newTopLeft) {
		if (newTopLeft != topLeft) {
			NotificationChain msgs = null;
			if (topLeft != null)
				msgs = ((InternalEObject)topLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.XY_LAYOUT_DATA__TOP_LEFT, null, msgs);
			if (newTopLeft != null)
				msgs = ((InternalEObject)newTopLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.XY_LAYOUT_DATA__TOP_LEFT, null, msgs);
			msgs = basicSetTopLeft(newTopLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.XY_LAYOUT_DATA__TOP_LEFT, newTopLeft, newTopLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Dimension newSize, NotificationChain msgs) {
		Dimension oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.XY_LAYOUT_DATA__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Dimension newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.XY_LAYOUT_DATA__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.XY_LAYOUT_DATA__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.XY_LAYOUT_DATA__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.XY_LAYOUT_DATA__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Layoutable)otherEnd, msgs);
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
			case GMFGraphPackage.XY_LAYOUT_DATA__OWNER:
				return basicSetOwner(null, msgs);
			case GMFGraphPackage.XY_LAYOUT_DATA__TOP_LEFT:
				return basicSetTopLeft(null, msgs);
			case GMFGraphPackage.XY_LAYOUT_DATA__SIZE:
				return basicSetSize(null, msgs);
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
			case GMFGraphPackage.XY_LAYOUT_DATA__OWNER:
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
			case GMFGraphPackage.XY_LAYOUT_DATA__OWNER:
				return getOwner();
			case GMFGraphPackage.XY_LAYOUT_DATA__TOP_LEFT:
				return getTopLeft();
			case GMFGraphPackage.XY_LAYOUT_DATA__SIZE:
				return getSize();
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
			case GMFGraphPackage.XY_LAYOUT_DATA__OWNER:
				setOwner((Layoutable)newValue);
				return;
			case GMFGraphPackage.XY_LAYOUT_DATA__TOP_LEFT:
				setTopLeft((Point)newValue);
				return;
			case GMFGraphPackage.XY_LAYOUT_DATA__SIZE:
				setSize((Dimension)newValue);
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
			case GMFGraphPackage.XY_LAYOUT_DATA__OWNER:
				setOwner((Layoutable)null);
				return;
			case GMFGraphPackage.XY_LAYOUT_DATA__TOP_LEFT:
				setTopLeft((Point)null);
				return;
			case GMFGraphPackage.XY_LAYOUT_DATA__SIZE:
				setSize((Dimension)null);
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
			case GMFGraphPackage.XY_LAYOUT_DATA__OWNER:
				return getOwner() != null;
			case GMFGraphPackage.XY_LAYOUT_DATA__TOP_LEFT:
				return topLeft != null;
			case GMFGraphPackage.XY_LAYOUT_DATA__SIZE:
				return size != null;
		}
		return super.eIsSet(featureID);
	}

} //XYLayoutDataImpl
