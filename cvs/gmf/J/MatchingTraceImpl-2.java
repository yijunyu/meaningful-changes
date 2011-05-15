/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.internal.bridge.trace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ocl.query.Query;
import org.eclipse.gmf.internal.bridge.trace.MatchingTrace;
import org.eclipse.gmf.internal.bridge.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matching Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.MatchingTraceImpl#getQueryText <em>Query Text</em>}</li>
 *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.MatchingTraceImpl#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MatchingTraceImpl extends AbstractTraceImpl implements MatchingTrace {
	/**
	 * The default value of the '{@link #getQueryText() <em>Query Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryText()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryText() <em>Query Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryText()
	 * @generated
	 * @ordered
	 */
	protected String queryText = QUERY_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected Query query = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchingTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TracePackage.Literals.MATCHING_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryText() {
		return queryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryText(String newQueryText) {
		String oldQueryText = queryText;
		queryText = newQueryText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.MATCHING_TRACE__QUERY_TEXT, oldQueryText, queryText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Query getQuery() {
		if (query == null) {
			query = createQuery();
		}
		return query;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(Query newQuery, NotificationChain msgs) {
		Query oldQuery = query;
		query = newQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracePackage.MATCHING_TRACE__QUERY, oldQuery, newQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract Query createQuery();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEClassComparision(String varName, EClass eClass) {
		StringBuffer result = new StringBuffer();
		result.append(varName);
		result.append(".ePackage.nsURI = '");
		result.append(eClass.getEPackage().getNsURI());
		result.append("' and ");
		result.append(varName);
		result.append(".name = '");
		result.append(eClass.getName());
		result.append("'");
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEStructuralFeatureComparison(String varName, EStructuralFeature feature) {
		StringBuffer result = new StringBuffer();
		result.append("(let _eClass_:ecore::EClass = ");
		result.append(varName);
		result.append(".eContainingClass in ");
		result.append(getEClassComparision("_eClass_", feature.getEContainingClass()));
		result.append(") and ");
		result.append(varName);
		result.append(".name = '");
		result.append(feature.getName());
		result.append("'");
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracePackage.MATCHING_TRACE__QUERY:
				return basicSetQuery(null, msgs);
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
			case TracePackage.MATCHING_TRACE__QUERY_TEXT:
				return getQueryText();
			case TracePackage.MATCHING_TRACE__QUERY:
				return getQuery();
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
			case TracePackage.MATCHING_TRACE__QUERY_TEXT:
				setQueryText((String)newValue);
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
			case TracePackage.MATCHING_TRACE__QUERY_TEXT:
				setQueryText(QUERY_TEXT_EDEFAULT);
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
			case TracePackage.MATCHING_TRACE__QUERY_TEXT:
				return QUERY_TEXT_EDEFAULT == null ? queryText != null : !QUERY_TEXT_EDEFAULT.equals(queryText);
			case TracePackage.MATCHING_TRACE__QUERY:
				return query != null;
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
		result.append(" (queryText: ");
		result.append(queryText);
		result.append(')');
		return result.toString();
	}

} //MatchingTraceImpl