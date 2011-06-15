/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.tooldef.AbstractTool;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.ToolOwner#getTool <em>Tool</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getToolOwner()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ToolOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Way to create this element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tool</em>' reference.
	 * @see #setTool(AbstractTool)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getToolOwner_Tool()
	 * @model
	 * @generated
	 */
	AbstractTool getTool();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.ToolOwner#getTool <em>Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' reference.
	 * @see #getTool()
	 * @generated
	 */
	void setTool(AbstractTool value);

} // ToolOwner
