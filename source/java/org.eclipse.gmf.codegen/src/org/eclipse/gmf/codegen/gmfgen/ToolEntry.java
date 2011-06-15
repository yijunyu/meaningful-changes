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
 * A representation of the model object '<em><b>Tool Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getGenNodes <em>Gen Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getGenLinks <em>Gen Links</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolEntry()
 * @model
 * @generated
 */
public interface ToolEntry extends AbstractToolEntry {
	/**
	 * Returns the value of the '<em><b>Gen Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Nodes</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolEntry_GenNodes()
	 * @model
	 * @generated
	 */
	EList<GenNode> getGenNodes();

	/**
	 * Returns the value of the '<em><b>Gen Links</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Links</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolEntry_GenLinks()
	 * @model
	 * @generated
	 */
	EList<GenLink> getGenLinks();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enforces 'tool for either node or link' - if there are values in genNodes list, returns it (no respect to values in genLinks); returns value of genLinks otherwise
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolEntry_Elements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<GenCommonBase> getElements();

} // ToolEntry
