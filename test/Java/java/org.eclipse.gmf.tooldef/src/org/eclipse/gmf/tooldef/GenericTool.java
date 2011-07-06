/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.tooldef.GenericTool#getToolClass <em>Tool Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getGenericTool()
 * @model
 * @generated
 */
public interface GenericTool extends AbstractTool {
	/**
	 * Returns the value of the '<em><b>Tool Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Class</em>' attribute.
	 * @see #setToolClass(String)
	 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getGenericTool_ToolClass()
	 * @model required="true"
	 * @generated
	 */
	String getToolClass();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.tooldef.GenericTool#getToolClass <em>Tool Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Class</em>' attribute.
	 * @see #getToolClass()
	 * @generated
	 */
	void setToolClass(String value);

} // GenericTool
