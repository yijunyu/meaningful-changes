/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rounded Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * org.eclipse.draw2d.RoundedRectangle
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.RoundedRectangle#getCornerWidth <em>Corner Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.RoundedRectangle#getCornerHeight <em>Corner Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getRoundedRectangle()
 * @model
 * @generated
 */
public interface RoundedRectangle extends Shape {
	/**
	 * Returns the value of the '<em><b>Corner Width</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corner Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner Width</em>' attribute.
	 * @see #setCornerWidth(int)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getRoundedRectangle_CornerWidth()
	 * @model default="8"
	 * @generated
	 */
	int getCornerWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.RoundedRectangle#getCornerWidth <em>Corner Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corner Width</em>' attribute.
	 * @see #getCornerWidth()
	 * @generated
	 */
	void setCornerWidth(int value);

	/**
	 * Returns the value of the '<em><b>Corner Height</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corner Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner Height</em>' attribute.
	 * @see #setCornerHeight(int)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getRoundedRectangle_CornerHeight()
	 * @model default="8"
	 * @generated
	 */
	int getCornerHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.RoundedRectangle#getCornerHeight <em>Corner Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corner Height</em>' attribute.
	 * @see #getCornerHeight()
	 * @generated
	 */
	void setCornerHeight(int value);

} // RoundedRectangle
