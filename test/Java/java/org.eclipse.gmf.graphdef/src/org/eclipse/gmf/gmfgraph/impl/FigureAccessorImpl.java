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
import org.eclipse.gmf.gmfgraph.FigureAccessor;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.RealFigure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure Accessor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureAccessorImpl#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.FigureAccessorImpl#getTypedFigure <em>Typed Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FigureAccessorImpl extends EObjectImpl implements FigureAccessor {
	/**
	 * The default value of the '{@link #getAccessor() <em>Accessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessor()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessor() <em>Accessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessor()
	 * @generated
	 * @ordered
	 */
	protected String accessor = ACCESSOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypedFigure() <em>Typed Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedFigure()
	 * @generated
	 * @ordered
	 */
	protected RealFigure typedFigure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigureAccessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getFigureAccessor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessor() {
		return accessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessor(String newAccessor) {
		String oldAccessor = accessor;
		accessor = newAccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_ACCESSOR__ACCESSOR, oldAccessor, accessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealFigure getTypedFigure() {
		return typedFigure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypedFigure(RealFigure newTypedFigure, NotificationChain msgs) {
		RealFigure oldTypedFigure = typedFigure;
		typedFigure = newTypedFigure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE, oldTypedFigure, newTypedFigure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedFigure(RealFigure newTypedFigure) {
		if (newTypedFigure != typedFigure) {
			NotificationChain msgs = null;
			if (typedFigure != null)
				msgs = ((InternalEObject)typedFigure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE, null, msgs);
			if (newTypedFigure != null)
				msgs = ((InternalEObject)newTypedFigure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE, null, msgs);
			msgs = basicSetTypedFigure(newTypedFigure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE, newTypedFigure, newTypedFigure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE:
				return basicSetTypedFigure(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGraphPackage.FIGURE_ACCESSOR__ACCESSOR:
				return getAccessor();
			case GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE:
				return getTypedFigure();
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
			case GMFGraphPackage.FIGURE_ACCESSOR__ACCESSOR:
				setAccessor((String)newValue);
				return;
			case GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE:
				setTypedFigure((RealFigure)newValue);
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
			case GMFGraphPackage.FIGURE_ACCESSOR__ACCESSOR:
				setAccessor(ACCESSOR_EDEFAULT);
				return;
			case GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE:
				setTypedFigure((RealFigure)null);
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
			case GMFGraphPackage.FIGURE_ACCESSOR__ACCESSOR:
				return ACCESSOR_EDEFAULT == null ? accessor != null : !ACCESSOR_EDEFAULT.equals(accessor);
			case GMFGraphPackage.FIGURE_ACCESSOR__TYPED_FIGURE:
				return typedFigure != null;
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
		result.append(" (accessor: ");
		result.append(accessor);
		result.append(')');
		return result.toString();
	}

} //FigureAccessorImpl