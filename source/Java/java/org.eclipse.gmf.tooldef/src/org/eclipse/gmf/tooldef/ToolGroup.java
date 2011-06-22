/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.tooldef.ToolGroup#isCollapsible <em>Collapsible</em>}</li>
 *   <li>{@link org.eclipse.gmf.tooldef.ToolGroup#isStack <em>Stack</em>}</li>
 *   <li>{@link org.eclipse.gmf.tooldef.ToolGroup#getActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getToolGroup()
 * @model
 * @generated
 */
public interface ToolGroup extends ToolContainer {

	/**
	 * Returns the value of the '<em><b>Collapsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collapsible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapsible</em>' attribute.
	 * @see #setCollapsible(boolean)
	 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getToolGroup_Collapsible()
	 * @model
	 * @generated
	 */
	boolean isCollapsible();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.tooldef.ToolGroup#isCollapsible <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsible</em>' attribute.
	 * @see #isCollapsible()
	 * @generated
	 */
	void setCollapsible(boolean value);

	/**
	 * Returns the value of the '<em><b>Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack</em>' attribute.
	 * @see #setStack(boolean)
	 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getToolGroup_Stack()
	 * @model
	 * @generated
	 */
	boolean isStack();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.tooldef.ToolGroup#isStack <em>Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack</em>' attribute.
	 * @see #isStack()
	 * @generated
	 */
	void setStack(boolean value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' reference.
	 * @see #setActive(AbstractTool)
	 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getToolGroup_Active()
	 * @model
	 * @generated
	 */
	AbstractTool getActive();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.tooldef.ToolGroup#getActive <em>Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(AbstractTool value);

} // ToolGroup
