/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Border</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.CompoundBorder#getOuter <em>Outer</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.CompoundBorder#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCompoundBorder()
 * @model
 * @generated
 */
public interface CompoundBorder extends Border {
	/**
	 * Returns the value of the '<em><b>Outer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer</em>' containment reference.
	 * @see #setOuter(Border)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCompoundBorder_Outer()
	 * @model containment="true"
	 * @generated
	 */
	Border getOuter();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.CompoundBorder#getOuter <em>Outer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer</em>' containment reference.
	 * @see #getOuter()
	 * @generated
	 */
	void setOuter(Border value);

	/**
	 * Returns the value of the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner</em>' containment reference.
	 * @see #setInner(Border)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCompoundBorder_Inner()
	 * @model containment="true"
	 * @generated
	 */
	Border getInner();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.CompoundBorder#getInner <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner</em>' containment reference.
	 * @see #getInner()
	 * @generated
	 */
	void setInner(Border value);

} // CompoundBorder
