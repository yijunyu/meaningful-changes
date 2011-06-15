/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.gmfgraph.DecorationFigure;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.PolylineConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polyline Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.PolylineConnectionImpl#getSourceDecoration <em>Source Decoration</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.PolylineConnectionImpl#getTargetDecoration <em>Target Decoration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolylineConnectionImpl extends PolylineImpl implements PolylineConnection {
	/**
	 * The cached value of the '{@link #getSourceDecoration() <em>Source Decoration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDecoration()
	 * @generated
	 * @ordered
	 */
	protected DecorationFigure sourceDecoration;

	/**
	 * The cached value of the '{@link #getTargetDecoration() <em>Target Decoration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDecoration()
	 * @generated
	 * @ordered
	 */
	protected DecorationFigure targetDecoration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolylineConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getPolylineConnection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecorationFigure getSourceDecoration() {
		if (sourceDecoration != null && sourceDecoration.eIsProxy()) {
			InternalEObject oldSourceDecoration = (InternalEObject)sourceDecoration;
			sourceDecoration = (DecorationFigure)eResolveProxy(oldSourceDecoration);
			if (sourceDecoration != oldSourceDecoration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION, oldSourceDecoration, sourceDecoration));
			}
		}
		return sourceDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecorationFigure basicGetSourceDecoration() {
		return sourceDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDecoration(DecorationFigure newSourceDecoration) {
		DecorationFigure oldSourceDecoration = sourceDecoration;
		sourceDecoration = newSourceDecoration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION, oldSourceDecoration, sourceDecoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecorationFigure getTargetDecoration() {
		if (targetDecoration != null && targetDecoration.eIsProxy()) {
			InternalEObject oldTargetDecoration = (InternalEObject)targetDecoration;
			targetDecoration = (DecorationFigure)eResolveProxy(oldTargetDecoration);
			if (targetDecoration != oldTargetDecoration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION, oldTargetDecoration, targetDecoration));
			}
		}
		return targetDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecorationFigure basicGetTargetDecoration() {
		return targetDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDecoration(DecorationFigure newTargetDecoration) {
		DecorationFigure oldTargetDecoration = targetDecoration;
		targetDecoration = newTargetDecoration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION, oldTargetDecoration, targetDecoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION:
				if (resolve) return getSourceDecoration();
				return basicGetSourceDecoration();
			case GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION:
				if (resolve) return getTargetDecoration();
				return basicGetTargetDecoration();
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
			case GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION:
				setSourceDecoration((DecorationFigure)newValue);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION:
				setTargetDecoration((DecorationFigure)newValue);
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
			case GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION:
				setSourceDecoration((DecorationFigure)null);
				return;
			case GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION:
				setTargetDecoration((DecorationFigure)null);
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
			case GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION:
				return sourceDecoration != null;
			case GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION:
				return targetDecoration != null;
		}
		return super.eIsSet(featureID);
	}

} //PolylineConnectionImpl
