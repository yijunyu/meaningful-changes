/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.MetricContainer#getMetrics <em>Metrics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMetricContainer()
 * @model
 * @generated
 */
public interface MetricContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.MetricRule}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.MetricRule#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMetricContainer_Metrics()
	 * @see org.eclipse.gmf.mappings.MetricRule#getContainer
	 * @model opposite="container" containment="true" required="true"
	 * @generated
	 */
	EList<MetricRule> getMetrics();

} // MetricContainer
