/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Constant Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenConstantColor#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenConstantColor()
 * @model
 * @generated
 */
public interface GenConstantColor extends GenColor {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.DiagramColors}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.DiagramColors
	 * @see #setName(DiagramColors)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenConstantColor_Name()
	 * @model
	 * @generated
	 */
	DiagramColors getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenConstantColor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.DiagramColors
	 * @see #getName()
	 * @generated
	 */
	void setName(DiagramColors value);

} // GenConstantColor
