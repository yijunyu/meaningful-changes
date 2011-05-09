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
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.GridLayoutData;
import org.eclipse.gmf.gmfgraph.Layoutable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Layout Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutDataImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutDataImpl#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutDataImpl#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutDataImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutDataImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutDataImpl#getVerticalSpan <em>Vertical Span</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutDataImpl#getHorizontalSpan <em>Horizontal Span</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutDataImpl#getHorizontalIndent <em>Horizontal Indent</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutDataImpl#getSizeHint <em>Size Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridLayoutDataImpl extends EObjectImpl implements GridLayoutData {
	/**
	 * The default value of the '{@link #isGrabExcessHorizontalSpace() <em>Grab Excess Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabExcessHorizontalSpace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrabExcessHorizontalSpace() <em>Grab Excess Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabExcessHorizontalSpace()
	 * @generated
	 * @ordered
	 */
	protected boolean grabExcessHorizontalSpace = GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGrabExcessVerticalSpace() <em>Grab Excess Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabExcessVerticalSpace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrabExcessVerticalSpace() <em>Grab Excess Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabExcessVerticalSpace()
	 * @generated
	 * @ordered
	 */
	protected boolean grabExcessVerticalSpace = GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment VERTICAL_ALIGNMENT_EDEFAULT = Alignment.CENTER_LITERAL;

	/**
	 * The cached value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment HORIZONTAL_ALIGNMENT_EDEFAULT = Alignment.CENTER_LITERAL;

	/**
	 * The cached value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalSpan() <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTICAL_SPAN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getVerticalSpan() <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpan()
	 * @generated
	 * @ordered
	 */
	protected int verticalSpan = VERTICAL_SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalSpan() <em>Horizontal Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int HORIZONTAL_SPAN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getHorizontalSpan() <em>Horizontal Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpan()
	 * @generated
	 * @ordered
	 */
	protected int horizontalSpan = HORIZONTAL_SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalIndent() <em>Horizontal Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalIndent()
	 * @generated
	 * @ordered
	 */
	protected static final int HORIZONTAL_INDENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHorizontalIndent() <em>Horizontal Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalIndent()
	 * @generated
	 * @ordered
	 */
	protected int horizontalIndent = HORIZONTAL_INDENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSizeHint() <em>Size Hint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeHint()
	 * @generated
	 * @ordered
	 */
	protected Dimension sizeHint = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridLayoutDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getGridLayoutData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrabExcessHorizontalSpace() {
		return grabExcessHorizontalSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabExcessHorizontalSpace(boolean newGrabExcessHorizontalSpace) {
		boolean oldGrabExcessHorizontalSpace = grabExcessHorizontalSpace;
		grabExcessHorizontalSpace = newGrabExcessHorizontalSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE, oldGrabExcessHorizontalSpace, grabExcessHorizontalSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrabExcessVerticalSpace() {
		return grabExcessVerticalSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabExcessVerticalSpace(boolean newGrabExcessVerticalSpace) {
		boolean oldGrabExcessVerticalSpace = grabExcessVerticalSpace;
		grabExcessVerticalSpace = newGrabExcessVerticalSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE, oldGrabExcessVerticalSpace, grabExcessVerticalSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getVerticalAlignment() {
		return verticalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalAlignment(Alignment newVerticalAlignment) {
		Alignment oldVerticalAlignment = verticalAlignment;
		verticalAlignment = newVerticalAlignment == null ? VERTICAL_ALIGNMENT_EDEFAULT : newVerticalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT_DATA__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getHorizontalAlignment() {
		return horizontalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalAlignment(Alignment newHorizontalAlignment) {
		Alignment oldHorizontalAlignment = horizontalAlignment;
		horizontalAlignment = newHorizontalAlignment == null ? HORIZONTAL_ALIGNMENT_EDEFAULT : newHorizontalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVerticalSpan() {
		return verticalSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalSpan(int newVerticalSpan) {
		int oldVerticalSpan = verticalSpan;
		verticalSpan = newVerticalSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT_DATA__VERTICAL_SPAN, oldVerticalSpan, verticalSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHorizontalSpan() {
		return horizontalSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalSpan(int newHorizontalSpan) {
		int oldHorizontalSpan = horizontalSpan;
		horizontalSpan = newHorizontalSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_SPAN, oldHorizontalSpan, horizontalSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHorizontalIndent() {
		return horizontalIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalIndent(int newHorizontalIndent) {
		int oldHorizontalIndent = horizontalIndent;
		horizontalIndent = newHorizontalIndent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_INDENT, oldHorizontalIndent, horizontalIndent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getSizeHint() {
		return sizeHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizeHint(Dimension newSizeHint, NotificationChain msgs) {
		Dimension oldSizeHint = sizeHint;
		sizeHint = newSizeHint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT_DATA__SIZE_HINT, oldSizeHint, newSizeHint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeHint(Dimension newSizeHint) {
		if (newSizeHint != sizeHint) {
			NotificationChain msgs = null;
			if (sizeHint != null)
				msgs = ((InternalEObject)sizeHint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.GRID_LAYOUT_DATA__SIZE_HINT, null, msgs);
			if (newSizeHint != null)
				msgs = ((InternalEObject)newSizeHint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.GRID_LAYOUT_DATA__SIZE_HINT, null, msgs);
			msgs = basicSetSizeHint(newSizeHint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT_DATA__SIZE_HINT, newSizeHint, newSizeHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.GRID_LAYOUT_DATA__OWNER:
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.GRID_LAYOUT_DATA__OWNER:
				return basicSetOwner(null, msgs);
			case GMFGraphPackage.GRID_LAYOUT_DATA__SIZE_HINT:
				return basicSetSizeHint(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GMFGraphPackage.GRID_LAYOUT_DATA__OWNER:
				return eInternalContainer().eInverseRemove(this, GMFGraphPackage.LAYOUTABLE__LAYOUT_DATA, Layoutable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGraphPackage.GRID_LAYOUT_DATA__OWNER:
				return getOwner();
			case GMFGraphPackage.GRID_LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
				return isGrabExcessHorizontalSpace() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.GRID_LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE:
				return isGrabExcessVerticalSpace() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.GRID_LAYOUT_DATA__VERTICAL_ALIGNMENT:
				return getVerticalAlignment();
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_ALIGNMENT:
				return getHorizontalAlignment();
			case GMFGraphPackage.GRID_LAYOUT_DATA__VERTICAL_SPAN:
				return new Integer(getVerticalSpan());
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_SPAN:
				return new Integer(getHorizontalSpan());
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_INDENT:
				return new Integer(getHorizontalIndent());
			case GMFGraphPackage.GRID_LAYOUT_DATA__SIZE_HINT:
				return getSizeHint();
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
			case GMFGraphPackage.GRID_LAYOUT_DATA__OWNER:
				setOwner((Layoutable)newValue);
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
				setGrabExcessHorizontalSpace(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE:
				setGrabExcessVerticalSpace(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__VERTICAL_ALIGNMENT:
				setVerticalAlignment((Alignment)newValue);
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment((Alignment)newValue);
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__VERTICAL_SPAN:
				setVerticalSpan(((Integer)newValue).intValue());
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_SPAN:
				setHorizontalSpan(((Integer)newValue).intValue());
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_INDENT:
				setHorizontalIndent(((Integer)newValue).intValue());
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__SIZE_HINT:
				setSizeHint((Dimension)newValue);
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
			case GMFGraphPackage.GRID_LAYOUT_DATA__OWNER:
				setOwner((Layoutable)null);
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
				setGrabExcessHorizontalSpace(GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT);
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE:
				setGrabExcessVerticalSpace(GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT);
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__VERTICAL_ALIGNMENT:
				setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__VERTICAL_SPAN:
				setVerticalSpan(VERTICAL_SPAN_EDEFAULT);
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_SPAN:
				setHorizontalSpan(HORIZONTAL_SPAN_EDEFAULT);
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_INDENT:
				setHorizontalIndent(HORIZONTAL_INDENT_EDEFAULT);
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__SIZE_HINT:
				setSizeHint((Dimension)null);
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
			case GMFGraphPackage.GRID_LAYOUT_DATA__OWNER:
				return getOwner() != null;
			case GMFGraphPackage.GRID_LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
				return grabExcessHorizontalSpace != GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT;
			case GMFGraphPackage.GRID_LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE:
				return grabExcessVerticalSpace != GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT;
			case GMFGraphPackage.GRID_LAYOUT_DATA__VERTICAL_ALIGNMENT:
				return verticalAlignment != VERTICAL_ALIGNMENT_EDEFAULT;
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_ALIGNMENT:
				return horizontalAlignment != HORIZONTAL_ALIGNMENT_EDEFAULT;
			case GMFGraphPackage.GRID_LAYOUT_DATA__VERTICAL_SPAN:
				return verticalSpan != VERTICAL_SPAN_EDEFAULT;
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_SPAN:
				return horizontalSpan != HORIZONTAL_SPAN_EDEFAULT;
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_INDENT:
				return horizontalIndent != HORIZONTAL_INDENT_EDEFAULT;
			case GMFGraphPackage.GRID_LAYOUT_DATA__SIZE_HINT:
				return sizeHint != null;
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
		result.append(" (grabExcessHorizontalSpace: ");
		result.append(grabExcessHorizontalSpace);
		result.append(", grabExcessVerticalSpace: ");
		result.append(grabExcessVerticalSpace);
		result.append(", verticalAlignment: ");
		result.append(verticalAlignment);
		result.append(", horizontalAlignment: ");
		result.append(horizontalAlignment);
		result.append(", verticalSpan: ");
		result.append(verticalSpan);
		result.append(", horizontalSpan: ");
		result.append(horizontalSpan);
		result.append(", horizontalIndent: ");
		result.append(horizontalIndent);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layoutable getOwner() {
		if (eContainerFeatureID != GMFGraphPackage.GRID_LAYOUT_DATA__OWNER) return null;
		return (Layoutable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Layoutable newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, GMFGraphPackage.GRID_LAYOUT_DATA__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Layoutable newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID != GMFGraphPackage.GRID_LAYOUT_DATA__OWNER && newOwner != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT_DATA__OWNER, newOwner, newOwner));
	}

} //GridLayoutDataImpl
