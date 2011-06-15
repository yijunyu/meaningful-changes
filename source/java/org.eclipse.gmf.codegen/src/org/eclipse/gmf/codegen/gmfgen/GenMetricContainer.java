/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import java.util.Set;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Metric Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenMetricContainer#getEditorGen <em>Editor Gen</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenMetricContainer#getMetrics <em>Metrics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenMetricContainer()
 * @model
 * @generated
 */
public interface GenMetricContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Editor Gen</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Gen</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Gen</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenMetricContainer_EditorGen()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getMetrics
	 * @model opposite="metrics" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	GenEditorGenerator getEditorGen();

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenMetricRule}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenMetricContainer_Metrics()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getContainer
	 * @model opposite="container" containment="true" required="true"
	 * @generated
	 */
	EList<GenMetricRule> getMetrics();

	Set<GenPackage> getAllTargetedModelPackages();	
} // GenMetricContainer
