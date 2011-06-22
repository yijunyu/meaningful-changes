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
 * A representation of the model object '<em><b>Gen Container Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenContainerBase#getContainedNodes <em>Contained Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenContainerBase#getCanonicalEditPolicyClassName <em>Canonical Edit Policy Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenContainerBase()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GenContainerBase extends GenCommonBase {
	/**
	 * Returns the value of the '<em><b>Contained Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Nodes</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenContainerBase_ContainedNodes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<GenNode> getContainedNodes();

	/**
	 * Returns the value of the '<em><b>Canonical Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canonical Edit Policy Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canonical Edit Policy Class Name</em>' attribute.
	 * @see #setCanonicalEditPolicyClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenContainerBase_CanonicalEditPolicyClassName()
	 * @model
	 * @generated
	 */
	String getCanonicalEditPolicyClassName();

	String CANONICAL_EDIT_POLICY_SUFFIX = "CanonicalEditPolicy"; //$NON-NLS-1$

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenContainerBase#getCanonicalEditPolicyClassName <em>Canonical Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonical Edit Policy Class Name</em>' attribute.
	 * @see #getCanonicalEditPolicyClassName()
	 * @generated
	 */
	void setCanonicalEditPolicyClassName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns child nodes that may be created in this container
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<GenNode> getAssistantNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean needsCanonicalEditPolicy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCanonicalEditPolicyQualifiedClassName();

} // GenContainerBase
