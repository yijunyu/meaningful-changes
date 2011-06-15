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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.gmfgraph.Alignment;
import org.eclipse.gmf.gmfgraph.FlowLayout;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FlowLayoutImpl#isVertical <em>Vertical</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FlowLayoutImpl#isMatchMinorSize <em>Match Minor Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FlowLayoutImpl#isForceSingleLine <em>Force Single Line</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FlowLayoutImpl#getMajorAlignment <em>Major Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FlowLayoutImpl#getMinorAlignment <em>Minor Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FlowLayoutImpl#getMajorSpacing <em>Major Spacing</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FlowLayoutImpl#getMinorSpacing <em>Minor Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowLayoutImpl extends EObjectImpl implements FlowLayout {
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
	 * The default value of the '{@link #isMatchMinorSize() <em>Match Minor Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatchMinorSize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MATCH_MINOR_SIZE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMatchMinorSize() <em>Match Minor Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatchMinorSize()
	 * @generated
	 * @ordered
	 */
	protected boolean matchMinorSize = MATCH_MINOR_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isForceSingleLine() <em>Force Single Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForceSingleLine()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORCE_SINGLE_LINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForceSingleLine() <em>Force Single Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForceSingleLine()
	 * @generated
	 * @ordered
	 */
	protected boolean forceSingleLine = FORCE_SINGLE_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMajorAlignment() <em>Major Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment MAJOR_ALIGNMENT_EDEFAULT = Alignment.BEGINNING_LITERAL;

	/**
	 * The cached value of the '{@link #getMajorAlignment() <em>Major Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment majorAlignment = MAJOR_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinorAlignment() <em>Minor Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment MINOR_ALIGNMENT_EDEFAULT = Alignment.BEGINNING_LITERAL;

	/**
	 * The cached value of the '{@link #getMinorAlignment() <em>Minor Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment minorAlignment = MINOR_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMajorSpacing() <em>Major Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final int MAJOR_SPACING_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getMajorSpacing() <em>Major Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorSpacing()
	 * @generated
	 * @ordered
	 */
	protected int majorSpacing = MAJOR_SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinorSpacing() <em>Minor Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final int MINOR_SPACING_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getMinorSpacing() <em>Minor Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorSpacing()
	 * @generated
	 * @ordered
	 */
	protected int minorSpacing = MINOR_SPACING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getFlowLayout();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FLOW_LAYOUT__VERTICAL, oldVertical, vertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMatchMinorSize() {
		return matchMinorSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchMinorSize(boolean newMatchMinorSize) {
		boolean oldMatchMinorSize = matchMinorSize;
		matchMinorSize = newMatchMinorSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FLOW_LAYOUT__MATCH_MINOR_SIZE, oldMatchMinorSize, matchMinorSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForceSingleLine() {
		return forceSingleLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceSingleLine(boolean newForceSingleLine) {
		boolean oldForceSingleLine = forceSingleLine;
		forceSingleLine = newForceSingleLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FLOW_LAYOUT__FORCE_SINGLE_LINE, oldForceSingleLine, forceSingleLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getMajorAlignment() {
		return majorAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajorAlignment(Alignment newMajorAlignment) {
		Alignment oldMajorAlignment = majorAlignment;
		majorAlignment = newMajorAlignment == null ? MAJOR_ALIGNMENT_EDEFAULT : newMajorAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FLOW_LAYOUT__MAJOR_ALIGNMENT, oldMajorAlignment, majorAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getMinorAlignment() {
		return minorAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinorAlignment(Alignment newMinorAlignment) {
		Alignment oldMinorAlignment = minorAlignment;
		minorAlignment = newMinorAlignment == null ? MINOR_ALIGNMENT_EDEFAULT : newMinorAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FLOW_LAYOUT__MINOR_ALIGNMENT, oldMinorAlignment, minorAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMajorSpacing() {
		return majorSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajorSpacing(int newMajorSpacing) {
		int oldMajorSpacing = majorSpacing;
		majorSpacing = newMajorSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FLOW_LAYOUT__MAJOR_SPACING, oldMajorSpacing, majorSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinorSpacing() {
		return minorSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinorSpacing(int newMinorSpacing) {
		int oldMinorSpacing = minorSpacing;
		minorSpacing = newMinorSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FLOW_LAYOUT__MINOR_SPACING, oldMinorSpacing, minorSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGraphPackage.FLOW_LAYOUT__VERTICAL:
				return isVertical() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.FLOW_LAYOUT__MATCH_MINOR_SIZE:
				return isMatchMinorSize() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.FLOW_LAYOUT__FORCE_SINGLE_LINE:
				return isForceSingleLine() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.FLOW_LAYOUT__MAJOR_ALIGNMENT:
				return getMajorAlignment();
			case GMFGraphPackage.FLOW_LAYOUT__MINOR_ALIGNMENT:
				return getMinorAlignment();
			case GMFGraphPackage.FLOW_LAYOUT__MAJOR_SPACING:
				return new Integer(getMajorSpacing());
			case GMFGraphPackage.FLOW_LAYOUT__MINOR_SPACING:
				return new Integer(getMinorSpacing());
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
			case GMFGraphPackage.FLOW_LAYOUT__VERTICAL:
				setVertical(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.FLOW_LAYOUT__MATCH_MINOR_SIZE:
				setMatchMinorSize(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.FLOW_LAYOUT__FORCE_SINGLE_LINE:
				setForceSingleLine(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.FLOW_LAYOUT__MAJOR_ALIGNMENT:
				setMajorAlignment((Alignment)newValue);
				return;
			case GMFGraphPackage.FLOW_LAYOUT__MINOR_ALIGNMENT:
				setMinorAlignment((Alignment)newValue);
				return;
			case GMFGraphPackage.FLOW_LAYOUT__MAJOR_SPACING:
				setMajorSpacing(((Integer)newValue).intValue());
				return;
			case GMFGraphPackage.FLOW_LAYOUT__MINOR_SPACING:
				setMinorSpacing(((Integer)newValue).intValue());
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
			case GMFGraphPackage.FLOW_LAYOUT__VERTICAL:
				setVertical(VERTICAL_EDEFAULT);
				return;
			case GMFGraphPackage.FLOW_LAYOUT__MATCH_MINOR_SIZE:
				setMatchMinorSize(MATCH_MINOR_SIZE_EDEFAULT);
				return;
			case GMFGraphPackage.FLOW_LAYOUT__FORCE_SINGLE_LINE:
				setForceSingleLine(FORCE_SINGLE_LINE_EDEFAULT);
				return;
			case GMFGraphPackage.FLOW_LAYOUT__MAJOR_ALIGNMENT:
				setMajorAlignment(MAJOR_ALIGNMENT_EDEFAULT);
				return;
			case GMFGraphPackage.FLOW_LAYOUT__MINOR_ALIGNMENT:
				setMinorAlignment(MINOR_ALIGNMENT_EDEFAULT);
				return;
			case GMFGraphPackage.FLOW_LAYOUT__MAJOR_SPACING:
				setMajorSpacing(MAJOR_SPACING_EDEFAULT);
				return;
			case GMFGraphPackage.FLOW_LAYOUT__MINOR_SPACING:
				setMinorSpacing(MINOR_SPACING_EDEFAULT);
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
			case GMFGraphPackage.FLOW_LAYOUT__VERTICAL:
				return vertical != VERTICAL_EDEFAULT;
			case GMFGraphPackage.FLOW_LAYOUT__MATCH_MINOR_SIZE:
				return matchMinorSize != MATCH_MINOR_SIZE_EDEFAULT;
			case GMFGraphPackage.FLOW_LAYOUT__FORCE_SINGLE_LINE:
				return forceSingleLine != FORCE_SINGLE_LINE_EDEFAULT;
			case GMFGraphPackage.FLOW_LAYOUT__MAJOR_ALIGNMENT:
				return majorAlignment != MAJOR_ALIGNMENT_EDEFAULT;
			case GMFGraphPackage.FLOW_LAYOUT__MINOR_ALIGNMENT:
				return minorAlignment != MINOR_ALIGNMENT_EDEFAULT;
			case GMFGraphPackage.FLOW_LAYOUT__MAJOR_SPACING:
				return majorSpacing != MAJOR_SPACING_EDEFAULT;
			case GMFGraphPackage.FLOW_LAYOUT__MINOR_SPACING:
				return minorSpacing != MINOR_SPACING_EDEFAULT;
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
		result.append(" (vertical: ");
		result.append(vertical);
		result.append(", matchMinorSize: ");
		result.append(matchMinorSize);
		result.append(", forceSingleLine: ");
		result.append(forceSingleLine);
		result.append(", majorAlignment: ");
		result.append(majorAlignment);
		result.append(", minorAlignment: ");
		result.append(minorAlignment);
		result.append(", majorSpacing: ");
		result.append(majorSpacing);
		result.append(", minorSpacing: ");
		result.append(minorSpacing);
		result.append(')');
		return result.toString();
	}

} //FlowLayoutImpl
