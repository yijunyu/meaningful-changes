/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.ConstantColor#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getConstantColor()
 * @model
 * @generated
 */
public interface ConstantColor extends Color {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.gmfgraph.ColorConstants}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.ColorConstants
	 * @see #setValue(ColorConstants)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getConstantColor_Value()
	 * @model required="true"
	 * @generated
	 */
	ColorConstants getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.ConstantColor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.ColorConstants
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ColorConstants value);

} // ConstantColor
