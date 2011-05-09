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
 * A representation of the model object '<em><b>Gen Child Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for all ChildNode containers
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getChildNodes <em>Child Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getCanonicalEditPolicyClassName <em>Canonical Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isListLayout <em>List Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildContainer()
 * @model abstract="true"
 * @generated
 */
public interface GenChildContainer extends GenContainerEditPart {
	/**
	 * Returns the value of the '<em><b>Child Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenChildNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Nodes</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildContainer_ChildNodes()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildNode#getContainers
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenChildNode" opposite="containers"
	 * @generated
	 */
	EList getChildNodes();

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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildContainer_CanonicalEditPolicyClassName()
	 * @model
	 * @generated
	 */
	String getCanonicalEditPolicyClassName();

	public static final String CANONICAL_EDIT_POLICY_SUFFIX = "CanonicalEditPolicy";

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getCanonicalEditPolicyClassName <em>Canonical Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonical Edit Policy Class Name</em>' attribute.
	 * @see #getCanonicalEditPolicyClassName()
	 * @generated
	 */
	void setCanonicalEditPolicyClassName(String value);

	/**
	 * Returns the value of the '<em><b>List Layout</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Layout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Layout</em>' attribute.
	 * @see #setListLayout(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildContainer_ListLayout()
	 * @model default="true"
	 * @generated
	 */
	boolean isListLayout();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isListLayout <em>List Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Layout</em>' attribute.
	 * @see #isListLayout()
	 * @generated
	 */
	void setListLayout(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCanonicalEditPolicyQualifiedClassName();

} // GenChildContainer
