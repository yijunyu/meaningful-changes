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
	 * The cached value of the '{@link #getSourceDecoration() <em>Source Decoration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDecoration()
	 * @generated
	 * @ordered
	 */
	protected DecorationFigure sourceDecoration = null;

	/**
	 * The cached value of the '{@link #getTargetDecoration() <em>Target Decoration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDecoration()
	 * @generated
	 * @ordered
	 */
	protected DecorationFigure targetDecoration = null;

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
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getPolylineConnection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecorationFigure getSourceDecoration() {
		return sourceDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceDecoration(DecorationFigure newSourceDecoration, NotificationChain msgs) {
		DecorationFigure oldSourceDecoration = sourceDecoration;
		sourceDecoration = newSourceDecoration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION, oldSourceDecoration, newSourceDecoration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDecoration(DecorationFigure newSourceDecoration) {
		if (newSourceDecoration != sourceDecoration) {
			NotificationChain msgs = null;
			if (sourceDecoration != null)
				msgs = ((InternalEObject)sourceDecoration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION, null, msgs);
			if (newSourceDecoration != null)
				msgs = ((InternalEObject)newSourceDecoration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION, null, msgs);
			msgs = basicSetSourceDecoration(newSourceDecoration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION, newSourceDecoration, newSourceDecoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecorationFigure getTargetDecoration() {
		return targetDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetDecoration(DecorationFigure newTargetDecoration, NotificationChain msgs) {
		DecorationFigure oldTargetDecoration = targetDecoration;
		targetDecoration = newTargetDecoration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION, oldTargetDecoration, newTargetDecoration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDecoration(DecorationFigure newTargetDecoration) {
		if (newTargetDecoration != targetDecoration) {
			NotificationChain msgs = null;
			if (targetDecoration != null)
				msgs = ((InternalEObject)targetDecoration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION, null, msgs);
			if (newTargetDecoration != null)
				msgs = ((InternalEObject)newTargetDecoration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION, null, msgs);
			msgs = basicSetTargetDecoration(newTargetDecoration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION, newTargetDecoration, newTargetDecoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION:
				return basicSetSourceDecoration(null, msgs);
			case GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION:
				return basicSetTargetDecoration(null, msgs);
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
			case GMFGraphPackage.POLYLINE_CONNECTION__SOURCE_DECORATION:
				return getSourceDecoration();
			case GMFGraphPackage.POLYLINE_CONNECTION__TARGET_DECORATION:
				return getTargetDecoration();
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
