/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audited Metric Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Target metric which can be evaluated by audit rule. The target context here is the metric rule resulting type classifier
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.AuditedMetricTarget#getMetric <em>Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditedMetricTarget()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ocl='\'ecore::EDoubleObject\''"
 * @generated
 */
public interface AuditedMetricTarget extends Auditable {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metric which can be checked by audit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(MetricRule)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditedMetricTarget_Metric()
	 * @model required="true"
	 * @generated
	 */
	MetricRule getMetric();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.AuditedMetricTarget#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(MetricRule value);

} // AuditedMetricTarget
