/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureRef;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.LineKind;
import org.eclipse.gmf.gmfgraph.Shape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#isOutline <em>Outline</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#isFill <em>Fill</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getLineKind <em>Line Kind</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#isXorFill <em>Xor Fill</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#isXorOutline <em>Xor Outline</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getResolvedChildren <em>Resolved Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ShapeImpl extends RealFigureImpl implements Shape {
	/**
	 * The default value of the '{@link #isOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTLINE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutline()
	 * @generated
	 * @ordered
	 */
	protected boolean outline = OUTLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected boolean fill = FILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_WIDTH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected int lineWidth = LINE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineKind() <em>Line Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineKind()
	 * @generated
	 * @ordered
	 */
	protected static final LineKind LINE_KIND_EDEFAULT = LineKind.LINE_SOLID_LITERAL;

	/**
	 * The cached value of the '{@link #getLineKind() <em>Line Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineKind()
	 * @generated
	 * @ordered
	 */
	protected LineKind lineKind = LINE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isXorFill() <em>Xor Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXorFill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean XOR_FILL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isXorFill() <em>Xor Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXorFill()
	 * @generated
	 * @ordered
	 */
	protected boolean xorFill = XOR_FILL_EDEFAULT;

	/**
	 * The default value of the '{@link #isXorOutline() <em>Xor Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXorOutline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean XOR_OUTLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isXorOutline() <em>Xor Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXorOutline()
	 * @generated
	 * @ordered
	 */
	protected boolean xorOutline = XOR_OUTLINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getShape();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Figure> getResolvedChildren() {
		ArrayList<Figure> r = new ArrayList<Figure>(getChildren().size());
		for (Figure next : getChildren()) {
			if (next instanceof FigureRef) {
				r.add(((FigureRef) next).getFigure());
			} else {
				r.add(next);
			}
		}
		return new EcoreEList.UnmodifiableEList<Figure>(this, GMFGraphPackage.eINSTANCE.getShape_ResolvedChildren(), r.size(), r.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGraphPackage.SHAPE__OUTLINE:
				return isOutline() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.SHAPE__FILL:
				return isFill() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.SHAPE__LINE_WIDTH:
				return new Integer(getLineWidth());
			case GMFGraphPackage.SHAPE__LINE_KIND:
				return getLineKind();
			case GMFGraphPackage.SHAPE__XOR_FILL:
				return isXorFill() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.SHAPE__XOR_OUTLINE:
				return isXorOutline() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGraphPackage.SHAPE__RESOLVED_CHILDREN:
				return getResolvedChildren();
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
			case GMFGraphPackage.SHAPE__OUTLINE:
				setOutline(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.SHAPE__FILL:
				setFill(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.SHAPE__LINE_WIDTH:
				setLineWidth(((Integer)newValue).intValue());
				return;
			case GMFGraphPackage.SHAPE__LINE_KIND:
				setLineKind((LineKind)newValue);
				return;
			case GMFGraphPackage.SHAPE__XOR_FILL:
				setXorFill(((Boolean)newValue).booleanValue());
				return;
			case GMFGraphPackage.SHAPE__XOR_OUTLINE:
				setXorOutline(((Boolean)newValue).booleanValue());
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
			case GMFGraphPackage.SHAPE__OUTLINE:
				setOutline(OUTLINE_EDEFAULT);
				return;
			case GMFGraphPackage.SHAPE__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case GMFGraphPackage.SHAPE__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case GMFGraphPackage.SHAPE__LINE_KIND:
				setLineKind(LINE_KIND_EDEFAULT);
				return;
			case GMFGraphPackage.SHAPE__XOR_FILL:
				setXorFill(XOR_FILL_EDEFAULT);
				return;
			case GMFGraphPackage.SHAPE__XOR_OUTLINE:
				setXorOutline(XOR_OUTLINE_EDEFAULT);
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
			case GMFGraphPackage.SHAPE__OUTLINE:
				return outline != OUTLINE_EDEFAULT;
			case GMFGraphPackage.SHAPE__FILL:
				return fill != FILL_EDEFAULT;
			case GMFGraphPackage.SHAPE__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case GMFGraphPackage.SHAPE__LINE_KIND:
				return lineKind != LINE_KIND_EDEFAULT;
			case GMFGraphPackage.SHAPE__XOR_FILL:
				return xorFill != XOR_FILL_EDEFAULT;
			case GMFGraphPackage.SHAPE__XOR_OUTLINE:
				return xorOutline != XOR_OUTLINE_EDEFAULT;
			case GMFGraphPackage.SHAPE__RESOLVED_CHILDREN:
				return !getResolvedChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutline() {
		return outline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutline(boolean newOutline) {
		boolean oldOutline = outline;
		outline = newOutline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__OUTLINE, oldOutline, outline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(boolean newFill) {
		boolean oldFill = fill;
		fill = newFill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__FILL, oldFill, fill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return lineWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		int oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__LINE_WIDTH, oldLineWidth, lineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineKind getLineKind() {
		return lineKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineKind(LineKind newLineKind) {
		LineKind oldLineKind = lineKind;
		lineKind = newLineKind == null ? LINE_KIND_EDEFAULT : newLineKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__LINE_KIND, oldLineKind, lineKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isXorFill() {
		return xorFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXorFill(boolean newXorFill) {
		boolean oldXorFill = xorFill;
		xorFill = newXorFill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__XOR_FILL, oldXorFill, xorFill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isXorOutline() {
		return xorOutline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXorOutline(boolean newXorOutline) {
		boolean oldXorOutline = xorOutline;
		xorOutline = newXorOutline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SHAPE__XOR_OUTLINE, oldXorOutline, xorOutline));
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
		result.append(" (outline: ");
		result.append(outline);
		result.append(", fill: ");
		result.append(fill);
		result.append(", lineWidth: ");
		result.append(lineWidth);
		result.append(", lineKind: ");
		result.append(lineKind);
		result.append(", xorFill: ");
		result.append(xorFill);
		result.append(", xorOutline: ");
		result.append(xorOutline);
		result.append(')');
		return result.toString();
	}

} //ShapeImpl
