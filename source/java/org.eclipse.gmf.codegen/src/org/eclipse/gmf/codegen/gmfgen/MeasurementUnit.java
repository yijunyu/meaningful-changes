/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.MeasurementUnit#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getMeasurementUnit()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MeasurementUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * The default value is <code>"Pixel"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getMeasurementUnit_Units()
	 * @model default="Pixel"
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.MeasurementUnit#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

} // MeasurementUnit
