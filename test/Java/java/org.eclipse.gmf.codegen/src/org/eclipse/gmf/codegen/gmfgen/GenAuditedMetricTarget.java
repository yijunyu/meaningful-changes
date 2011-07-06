/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Audited Metric Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Target metric which can be evaluated by audit rule. The target context here is the metric rule resulting type classifier
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditedMetricTarget#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditedMetricTarget#getMetricValueContext <em>Metric Value Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditedMetricTarget()
 * @model
 * @generated
 */
public interface GenAuditedMetricTarget extends GenAuditable {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metric wich can be involved in audit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(GenMetricRule)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditedMetricTarget_Metric()
	 * @model required="true"
	 * @generated
	 */
	GenMetricRule getMetric();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditedMetricTarget#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(GenMetricRule value);

	/**
	 * Returns the value of the '<em><b>Metric Value Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Value Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Value Context</em>' reference.
	 * @see #setMetricValueContext(GenDataType)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditedMetricTarget_MetricValueContext()
	 * @model required="true"
	 * @generated
	 */
	GenDataType getMetricValueContext();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditedMetricTarget#getMetricValueContext <em>Metric Value Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Value Context</em>' reference.
	 * @see #getMetricValueContext()
	 * @generated
	 */
	void setMetricValueContext(GenDataType value);

} // GenAuditedMetricTarget
