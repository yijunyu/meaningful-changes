/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.internal.bridge.trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.internal.bridge.trace.AbstractTrace#getVisualID <em>Visual ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.internal.bridge.trace.AbstractTrace#isProcessed <em>Processed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.internal.bridge.trace.TracePackage#getAbstractTrace()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual ID</em>' attribute.
	 * @see #setVisualID(int)
	 * @see org.eclipse.gmf.internal.bridge.trace.TracePackage#getAbstractTrace_VisualID()
	 * @model id="true"
	 * @generated
	 */
	int getVisualID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.internal.bridge.trace.AbstractTrace#getVisualID <em>Visual ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual ID</em>' attribute.
	 * @see #getVisualID()
	 * @generated
	 */
	void setVisualID(int value);

	/**
	 * Returns the value of the '<em><b>Processed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processed</em>' attribute.
	 * @see #setProcessed(boolean)
	 * @see org.eclipse.gmf.internal.bridge.trace.TracePackage#getAbstractTrace_Processed()
	 * @model default="false" transient="true"
	 * @generated
	 */
	boolean isProcessed();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.internal.bridge.trace.AbstractTrace#isProcessed <em>Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processed</em>' attribute.
	 * @see #isProcessed()
	 * @generated
	 */
	void setProcessed(boolean value);

} // AbstractTrace