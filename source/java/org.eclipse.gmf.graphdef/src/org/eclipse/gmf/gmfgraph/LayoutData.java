/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.LayoutData#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getLayoutData()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LayoutData extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.gmfgraph.Layoutable#getLayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Layoutable)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getLayoutData_Owner()
	 * @see org.eclipse.gmf.gmfgraph.Layoutable#getLayoutData
	 * @model opposite="layoutData" required="true" transient="false"
	 * @generated
	 */
	Layoutable getOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.LayoutData#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Layoutable value);

} // LayoutData
