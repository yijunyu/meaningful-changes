/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Border Layout Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.BorderLayoutData#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.BorderLayoutData#isVertical <em>Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getBorderLayoutData()
 * @model
 * @generated
 */
public interface BorderLayoutData extends LayoutData {
	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"CENTER"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.gmfgraph.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see #setAlignment(Alignment)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getBorderLayoutData_Alignment()
	 * @model default="CENTER" required="true"
	 * @generated
	 */
	Alignment getAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.BorderLayoutData#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(Alignment value);

	/**
	 * Returns the value of the '<em><b>Vertical</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical</em>' attribute.
	 * @see #setVertical(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getBorderLayoutData_Vertical()
	 * @model default="false"
	 * @generated
	 */
	boolean isVertical();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.BorderLayoutData#isVertical <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical</em>' attribute.
	 * @see #isVertical()
	 * @generated
	 */
	void setVertical(boolean value);

} // BorderLayoutData
