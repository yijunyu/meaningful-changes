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
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#getNodeTools <em>Node Tools</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#getLinkTools <em>Link Tools</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#getPalette <em>Palette</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolGroup()
 * @model
 * @generated
 */
public interface ToolGroup extends EntryBase{
	/**
	 * Returns the value of the '<em><b>Node Tools</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.NodeEntry}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.NodeEntry#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Tools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Tools</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolGroup_NodeTools()
	 * @see org.eclipse.gmf.codegen.gmfgen.NodeEntry#getGroup
	 * @model type="org.eclipse.gmf.codegen.gmfgen.NodeEntry" opposite="group" containment="true"
	 * @generated
	 */
	EList getNodeTools();

	/**
	 * Returns the value of the '<em><b>Link Tools</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.LinkEntry}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.LinkEntry#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Tools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Tools</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolGroup_LinkTools()
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkEntry#getGroup
	 * @model type="org.eclipse.gmf.codegen.gmfgen.LinkEntry" opposite="group" containment="true"
	 * @generated
	 */
	EList getLinkTools();

	/**
	 * Returns the value of the '<em><b>Palette</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.Palette#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palette</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolGroup_Palette()
	 * @see org.eclipse.gmf.codegen.gmfgen.Palette#getGroups
	 * @model opposite="groups" required="true" changeable="false"
	 * @generated
	 */
	Palette getPalette();

} // ToolGroup
