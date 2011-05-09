/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#isStack <em>Stack</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#isCollapse <em>Collapse</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#isToolsOnly <em>Tools Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolGroup()
 * @model
 * @generated
 */
public interface ToolGroup extends EntryBase, ToolGroupItem {
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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolGroup_Stack()
	 * @model
	 * @generated
	 */
	boolean isStack();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#isStack <em>Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack</em>' attribute.
	 * @see #isStack()
	 * @generated
	 */
	void setStack(boolean value);

	/**
	 * Returns the value of the '<em><b>Collapse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collapse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapse</em>' attribute.
	 * @see #setCollapse(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolGroup_Collapse()
	 * @model
	 * @generated
	 */
	boolean isCollapse();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#isCollapse <em>Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapse</em>' attribute.
	 * @see #isCollapse()
	 * @generated
	 */
	void setCollapse(boolean value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.ToolGroupItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolGroup_Entries()
	 * @model type="org.eclipse.gmf.codegen.gmfgen.ToolGroupItem" containment="true" required="true"
	 * @generated
	 */
	EList getEntries();

	/**
	 * Returns the value of the '<em><b>Tools Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tools Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools Only</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolGroup_ToolsOnly()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isToolsOnly();

} // ToolGroup
