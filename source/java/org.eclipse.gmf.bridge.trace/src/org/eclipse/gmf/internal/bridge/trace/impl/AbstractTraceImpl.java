/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.internal.bridge.trace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.internal.bridge.trace.AbstractTrace;
import org.eclipse.gmf.internal.bridge.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.AbstractTraceImpl#getVisualID <em>Visual ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.AbstractTraceImpl#isProcessed <em>Processed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractTraceImpl extends EObjectImpl implements AbstractTrace {
	/**
	 * The default value of the '{@link #getVisualID() <em>Visual ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualID()
	 * @generated
	 * @ordered
	 */
	protected static final int VISUAL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVisualID() <em>Visual ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualID()
	 * @generated
	 * @ordered
	 */
	protected int visualID = VISUAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isProcessed() <em>Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROCESSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProcessed() <em>Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessed()
	 * @generated
	 * @ordered
	 */
	protected boolean processed = PROCESSED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.ABSTRACT_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVisualID() {
		return visualID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualID(int newVisualID) {
		int oldVisualID = visualID;
		visualID = newVisualID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.ABSTRACT_TRACE__VISUAL_ID, oldVisualID, visualID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProcessed() {
		return processed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessed(boolean newProcessed) {
		boolean oldProcessed = processed;
		processed = newProcessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.ABSTRACT_TRACE__PROCESSED, oldProcessed, processed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.ABSTRACT_TRACE__VISUAL_ID:
				return new Integer(getVisualID());
			case TracePackage.ABSTRACT_TRACE__PROCESSED:
				return isProcessed() ? Boolean.TRUE : Boolean.FALSE;
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
			case TracePackage.ABSTRACT_TRACE__VISUAL_ID:
				setVisualID(((Integer)newValue).intValue());
				return;
			case TracePackage.ABSTRACT_TRACE__PROCESSED:
				setProcessed(((Boolean)newValue).booleanValue());
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
			case TracePackage.ABSTRACT_TRACE__VISUAL_ID:
				setVisualID(VISUAL_ID_EDEFAULT);
				return;
			case TracePackage.ABSTRACT_TRACE__PROCESSED:
				setProcessed(PROCESSED_EDEFAULT);
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
			case TracePackage.ABSTRACT_TRACE__VISUAL_ID:
				return visualID != VISUAL_ID_EDEFAULT;
			case TracePackage.ABSTRACT_TRACE__PROCESSED:
				return processed != PROCESSED_EDEFAULT;
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
		result.append(" (visualID: ");
		result.append(visualID);
		result.append(", processed: ");
		result.append(processed);
		result.append(')');
		return result.toString();
	}

} //AbstractTraceImpl