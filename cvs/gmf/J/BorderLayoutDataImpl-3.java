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
import org.eclipse.gmf.gmfgraph.Alignment;
import org.eclipse.gmf.gmfgraph.BorderLayoutData;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Layoutable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Border Layout Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.BorderLayoutDataImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.BorderLayoutDataImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.BorderLayoutDataImpl#isVertical <em>Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BorderLayoutDataImpl extends EObjectImpl implements BorderLayoutData {
	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment ALIGNMENT_EDEFAULT = Alignment.CENTER_LITERAL;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVertical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERTICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVertical()
	 * @generated
	 * @ordered
	 */
	protected boolean vertical = VERTICAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BorderLayoutDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getBorderLayoutData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layoutable getOwner() {
		if (eContainerFeatureID != GMFGraphPackage.BORDER_LAYOUT_DATA__OWNER) return null;
		return (Layoutable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Layoutable newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID != GMFGraphPackage.BORDER_LAYOUT_DATA__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, GMFGraphPackage.LAYOUTABLE__LAYOUT_DATA, Layoutable.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newOwner, GMFGraphPackage.BORDER_LAYOUT_DATA__OWNER, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.BORDER_LAYOUT_DATA__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(Alignment newAlignment) {
		Alignment oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.BORDER_LAYOUT_DATA__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVertical() {
		return vertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertical(boolean newVertical) {
		boolean oldVertical = vertical;
		vertical = newVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.BORDER_LAYOUT_DATA__VERTICAL, oldVertical, vertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.BORDER_LAYOUT_DATA__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGraphPackage.BORDER_LAYOUT_DATA__OWNER, msgs);
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
			case GMFGraphPackage.BORDER_LAYOUT_DATA__OWNER:
				return eBasicSetContainer(null, GMFGraphPackage.BORDER_LAYOUT_DATA__OWNER, msgs);
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
			case GMFGraphPackage.BORDER_LAYOUT_DATA__OWNER:
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
			case GMFGraphPackage.BORDER_LAYOUT_DATA__OWNER:
				return getOwner();
			case GMFGraphPackage.BORDER_LAYOUT_DATA__ALIGNMENT:
				return getAlignment();
			case GMFGraphPackage.BORDER_LAYOUT_DATA__VERTICAL:
				return isVertical() ? Boolean.TRUE : Boolean.FALSE;
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
			case GMFGraphPackage.BORDER_LAYOUT_DATA__OWNER:
				setOwner((Layoutable)newValue);
				return;
			case GMFGraphPackage.BORDER_LAYOUT_DATA__ALIGNMENT:
				setAlignment((Alignment)newValue);
				return;
			case GMFGraphPackage.BORDER_LAYOUT_DATA__VERTICAL:
				setVertical(((Boolean)newValue).booleanValue());
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
			case GMFGraphPackage.BORDER_LAYOUT_DATA__OWNER:
				setOwner((Layoutable)null);
				return;
			case GMFGraphPackage.BORDER_LAYOUT_DATA__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case GMFGraphPackage.BORDER_LAYOUT_DATA__VERTICAL:
				setVertical(VERTICAL_EDEFAULT);
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
			case GMFGraphPackage.BORDER_LAYOUT_DATA__OWNER:
				return getOwner() != null;
			case GMFGraphPackage.BORDER_LAYOUT_DATA__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case GMFGraphPackage.BORDER_LAYOUT_DATA__VERTICAL:
				return vertical != VERTICAL_EDEFAULT;
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
		result.append(" (alignment: ");
		result.append(alignment);
		result.append(", vertical: ");
		result.append(vertical);
		result.append(')');
		return result.toString();
	}

} //BorderLayoutDataImpl
