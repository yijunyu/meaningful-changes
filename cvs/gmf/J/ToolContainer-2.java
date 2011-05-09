/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.tooldef.ToolContainer#getTools <em>Tools</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getToolContainer()
 * @model abstract="true"
 * @generated
 */
public interface ToolContainer extends AbstractTool {
	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.tooldef.AbstractTool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference list.
	 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getToolContainer_Tools()
	 * @model type="org.eclipse.gmf.tooldef.AbstractTool" containment="true"
	 * @generated
	 */
	EList getTools();

} // ToolContainer
