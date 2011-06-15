/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Layout reuse mechanism
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.LayoutRef#getActual <em>Actual</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getLayoutRef()
 * @model
 * @generated
 */
public interface LayoutRef extends Layout {
	/**
	 * Returns the value of the '<em><b>Actual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * constraint: actual should not be another LayoutRef
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual</em>' reference.
	 * @see #setActual(Layout)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getLayoutRef_Actual()
	 * @model required="true"
	 * @generated
	 */
	Layout getActual();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.LayoutRef#getActual <em>Actual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(Layout value);

} // LayoutRef
