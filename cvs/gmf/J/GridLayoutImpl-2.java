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
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.GridLayout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutImpl#getNumColumns <em>Num Columns</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutImpl#isEqualWidth <em>Equal Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutImpl#getMargins <em>Margins</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutImpl#getSpacing <em>Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridLayoutImpl extends EObjectImpl implements GridLayout {
	/**
	 * The default value of the '{@link #getNumColumns() <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_COLUMNS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumColumns() <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumColumns()
	 * @generated
	 * @ordered
	 */
	protected int numColumns = NUM_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEqualWidth() <em>Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEqualWidth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EQUAL_WIDTH_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEqualWidth() <em>Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEqualWidth()
	 * @generated
	 * @ordered
	 */
	protected boolean equalWidth = EQUAL_WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMargins() <em>Margins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargins()
	 * @generated
	 * @ordered
	 */
	protected Dimension margins = null;

	/**
	 * The cached value of the '{@link #getSpacing() <em>Spacing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected Dimension spacing = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getGridLayout();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumColumns() {
		return numColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumColumns(int newNumColumns) {
		int oldNumColumns = numColumns;
		numColumns = newNumColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT__NUM_COLUMNS, oldNumColumns, numColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEqualWidth() {
		return equalWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEqualWidth(boolean newEqualWidth) {
		boolean oldEqualWidth = equalWidth;
		equalWidth = newEqualWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT__EQUAL_WIDTH, oldEqualWidth, equalWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getMargins() {
		return margins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMargins(Dimension newMargins, NotificationChain msgs) {
		Dimension oldMargins = margins;
		margins = newMargins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT__MARGINS, oldMargins, newMargins);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargins(Dimension newMargins) {
		if (newMargins != margins) {
			NotificationChain msgs = null;
			if (margins != null)
				msgs = ((InternalEObject)margins).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.GRID_LAYOUT__MARGINS, null, msgs);
			if (newMargins != null)
				msgs = ((InternalEObject)newMargins).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.GRID_LAYOUT__MARGINS, null, msgs);
			msgs = basicSetMargins(newMargins, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT__MARGINS, newMargins, newMargins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getSpacing() {
		return spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpacing(Dimension newSpacing, NotificationChain msgs) {
		Dimension oldSpacing = spacing;
		spacing = newSpacing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT__SPACING, oldSpacing, newSpacing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacing(Dimension newSpacing) {
		if (newSpacing != spacing) {
			NotificationChain msgs = null;
			if (spacing != null)
				msgs = ((InternalEObject)spacing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.GRID_LAYOUT__SPACING, null, msgs);
			if (newSpacing != null)
				msgs = ((InternalEObject)newSpacing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.GRID_LAYOUT__SPACING, null, msgs);
			msgs = basicSetSpacing(newSpacing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.GRID_LAYOUT__SPACING, newSpacing, newSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.GRID_LAYOUT__MARGINS:
				return basicSetMargins(null, msgs);
			case GMFGraphPackage.GRID_LAYOUT__SPACING:
				return basicSetSpacing(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGraphPackage.GRID_LAYOUT__NUM_COLUMNS:
				return new Integer(getNumColumns());
			case GMFGraphPackage.GRID_LAYOUT__EQUAL_WIDTH:
				return isEqualWidth() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.GRID_LAYOUT__MARGINS:
				return getMargins();
			case GMFGraphPackage.GRID_LAYOUT__SPACING:
				return getSpacing();
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
			case GMFGraphPackage.GRID_LAYOUT__NUM_COLUMNS:
				setNumColumns(((Integer)newValue).intValue());
				return;
			case GMFGraphPackage.GRID_LAYOUT__EQUAL_WIDTH:
				setEqualWidth(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.GRID_LAYOUT__MARGINS:
				setMargins((Dimension)newValue);
				return;
			case GMFGraphPackage.GRID_LAYOUT__SPACING:
				setSpacing((Dimension)newValue);
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
			case GMFGraphPackage.GRID_LAYOUT__NUM_COLUMNS:
				setNumColumns(NUM_COLUMNS_EDEFAULT);
				return;
			case GMFGraphPackage.GRID_LAYOUT__EQUAL_WIDTH:
				setEqualWidth(EQUAL_WIDTH_EDEFAULT);
				return;
			case GMFGraphPackage.GRID_LAYOUT__MARGINS:
				setMargins((Dimension)null);
				return;
			case GMFGraphPackage.GRID_LAYOUT__SPACING:
				setSpacing((Dimension)null);
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
			case GMFGraphPackage.GRID_LAYOUT__NUM_COLUMNS:
				return numColumns != NUM_COLUMNS_EDEFAULT;
			case GMFGraphPackage.GRID_LAYOUT__EQUAL_WIDTH:
				return equalWidth != EQUAL_WIDTH_EDEFAULT;
			case GMFGraphPackage.GRID_LAYOUT__MARGINS:
				return margins != null;
			case GMFGraphPackage.GRID_LAYOUT__SPACING:
				return spacing != null;
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
		result.append(" (numColumns: ");
		result.append(numColumns);
		result.append(", equalWidth: ");
		result.append(equalWidth);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	public String getQualifiedClassName() {
		return "org.eclipse.gmf.internal.codegen.draw2d.GridLayout";
	}

	/**
	 * @generated NOT
	 */
	public void setQualifiedClassName(String newQualifiedClassName) {
		//throw new UnsupportedOperationException("You can not change predefined name of implementation class");
	}

} //GridLayoutImpl
