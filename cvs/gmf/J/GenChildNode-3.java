/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Child Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getChildMetaFeature <em>Child Meta Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildNode()
 * @model
 * @generated
 */
public interface GenChildNode extends GenNode{
	/**
	 * Returns the value of the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * could be null if you don't use childContainers
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group ID</em>' attribute.
	 * @see #setGroupID(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildNode_GroupID()
	 * @model
	 * @generated
	 */
	String getGroupID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getGroupID <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group ID</em>' attribute.
	 * @see #getGroupID()
	 * @generated
	 */
	void setGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Parent Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildNode_ParentNode()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode#getChildNodes
	 * @model opposite="childNodes" required="true" changeable="false"
	 * @generated
	 */
	GenNode getParentNode();

	/**
	 * Returns the value of the '<em><b>Child Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Meta Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Meta Feature</em>' reference.
	 * @see #setChildMetaFeature(GenFeature)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenChildNode_ChildMetaFeature()
	 * @model required="true"
	 * @generated
	 */
	GenFeature getChildMetaFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getChildMetaFeature <em>Child Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Meta Feature</em>' reference.
	 * @see #getChildMetaFeature()
	 * @generated
	 */
	void setChildMetaFeature(GenFeature value);

} // GenChildNode
