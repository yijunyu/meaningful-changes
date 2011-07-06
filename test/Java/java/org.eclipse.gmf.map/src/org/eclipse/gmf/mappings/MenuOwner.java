/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.tooldef.ContextMenu;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.MenuOwner#getContextMenu <em>Context Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMenuOwner()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MenuOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Menu</em>' reference.
	 * @see #setContextMenu(ContextMenu)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMenuOwner_ContextMenu()
	 * @model
	 * @generated
	 */
	ContextMenu getContextMenu();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.MenuOwner#getContextMenu <em>Context Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Menu</em>' reference.
	 * @see #getContextMenu()
	 * @generated
	 */
	void setContextMenu(ContextMenu value);

} // MenuOwner
