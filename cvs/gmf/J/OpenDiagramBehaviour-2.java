/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Diagram Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.OpenDiagramBehaviour#getEditPolicyClassName <em>Edit Policy Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getOpenDiagramBehaviour()
 * @model
 * @generated
 */
public interface OpenDiagramBehaviour extends Behaviour {
	/**
	 * Returns the value of the '<em><b>Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Policy Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Policy Class Name</em>' attribute.
	 * @see #setEditPolicyClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getOpenDiagramBehaviour_EditPolicyClassName()
	 * @model required="true"
	 * @generated
	 */
	String getEditPolicyClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.OpenDiagramBehaviour#getEditPolicyClassName <em>Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Policy Class Name</em>' attribute.
	 * @see #getEditPolicyClassName()
	 * @generated
	 */
	void setEditPolicyClassName(String value);

} // OpenDiagramBehaviour