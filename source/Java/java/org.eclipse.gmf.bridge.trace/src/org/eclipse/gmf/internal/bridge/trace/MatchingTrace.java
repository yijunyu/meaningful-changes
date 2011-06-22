/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.internal.bridge.trace;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL.Query;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matching Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.internal.bridge.trace.MatchingTrace#getQueryText <em>Query Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.internal.bridge.trace.TracePackage#getMatchingTrace()
 * @model abstract="true"
 * @generated
 */
public interface MatchingTrace extends AbstractTrace {
	/**
	 * Returns the value of the '<em><b>Query Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Text</em>' attribute.
	 * @see #setQueryText(String)
	 * @see org.eclipse.gmf.internal.bridge.trace.TracePackage#getMatchingTrace_QueryText()
	 * @model derived="true"
	 * @generated
	 */
	String getQueryText();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.internal.bridge.trace.MatchingTrace#getQueryText <em>Query Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Text</em>' attribute.
	 * @see #getQueryText()
	 * @generated
	 */
	void setQueryText(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EClass getQueryContext();

	Query getQuery() throws ParserException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getEClassComparision(String varName, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getEStructuralFeatureComparison(String varName, EStructuralFeature feature);

} // MatchingTrace