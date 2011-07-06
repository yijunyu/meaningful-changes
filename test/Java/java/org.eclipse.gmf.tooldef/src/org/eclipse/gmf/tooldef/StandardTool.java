/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * predefined, like zoom or marquee
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.tooldef.StandardTool#getToolKind <em>Tool Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getStandardTool()
 * @model
 * @generated
 */
public interface StandardTool extends AbstractTool {
	/**
	 * Returns the value of the '<em><b>Tool Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.tooldef.StandardToolKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Kind</em>' attribute.
	 * @see org.eclipse.gmf.tooldef.StandardToolKind
	 * @see #setToolKind(StandardToolKind)
	 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getStandardTool_ToolKind()
	 * @model
	 * @generated
	 */
	StandardToolKind getToolKind();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.tooldef.StandardTool#getToolKind <em>Tool Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Kind</em>' attribute.
	 * @see org.eclipse.gmf.tooldef.StandardToolKind
	 * @see #getToolKind()
	 * @generated
	 */
	void setToolKind(StandardToolKind value);

} // StandardTool
