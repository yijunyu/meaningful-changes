/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.internal.bridge.trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmf.codegen.gmfgen.GenNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Node Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.internal.bridge.trace.GenNodeTrace#getNodeLabelTraces <em>Node Label Traces</em>}</li>
 *   <li>{@link org.eclipse.gmf.internal.bridge.trace.GenNodeTrace#getCompartmentTraces <em>Compartment Traces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.internal.bridge.trace.TracePackage#getGenNodeTrace()
 * @model
 * @generated
 */
public interface GenNodeTrace extends MatchingTrace {
	/**
	 * Returns the value of the '<em><b>Node Label Traces</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.internal.bridge.trace.GenNodeLabelTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Label Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Label Traces</em>' containment reference list.
	 * @see org.eclipse.gmf.internal.bridge.trace.TracePackage#getGenNodeTrace_NodeLabelTraces()
	 * @model type="org.eclipse.gmf.internal.bridge.trace.GenNodeLabelTrace" containment="true"
	 * @generated
	 */
	EList<GenNodeLabelTrace> getNodeLabelTraces();

	/**
	 * Returns the value of the '<em><b>Compartment Traces</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.internal.bridge.trace.GenCompartmentTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment Traces</em>' containment reference list.
	 * @see org.eclipse.gmf.internal.bridge.trace.TracePackage#getGenNodeTrace_CompartmentTraces()
	 * @model type="org.eclipse.gmf.internal.bridge.trace.GenCompartmentTrace" containment="true"
	 * @generated
	 */
	EList<GenCompartmentTrace> getCompartmentTraces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setContext(GenNode genNode);

} // GenNodeTrace