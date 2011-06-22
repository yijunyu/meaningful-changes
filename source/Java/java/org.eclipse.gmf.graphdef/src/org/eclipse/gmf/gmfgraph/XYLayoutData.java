/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XY Layout Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.XYLayoutData#getTopLeft <em>Top Left</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.XYLayoutData#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getXYLayoutData()
 * @model
 * @generated
 */
public interface XYLayoutData extends LayoutData {
	/**
	 * Returns the value of the '<em><b>Top Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Left</em>' containment reference.
	 * @see #setTopLeft(Point)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getXYLayoutData_TopLeft()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getTopLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.XYLayoutData#getTopLeft <em>Top Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Left</em>' containment reference.
	 * @see #getTopLeft()
	 * @generated
	 */
	void setTopLeft(Point value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Dimension)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getXYLayoutData_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dimension getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.XYLayoutData#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Dimension value);

} // XYLayoutData
