/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Audit Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents constraint category of emft.validation framework
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getAudits <em>Audits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditContainer()
 * @model
 * @generated
 */
public interface GenAuditContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRoot#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditContainer_Root()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRoot#getCategories
	 * @model opposite="categories" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	GenAuditRoot getRoot();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier which is unique within the scope of its parent container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditContainer_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable name for the category of audits organized in this container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The detailed description of this audit container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditContainer_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hierarchical path of this audit container as ordered list of containers beginning with the root and ended with this container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditContainer_Path()
	 * @model required="true"
	 * @generated
	 */
	EList<GenAuditContainer> getPath();

	/**
	 * Returns the value of the '<em><b>Audits</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audits</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditContainer_Audits()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getCategory
	 * @model opposite="category"
	 * @generated
	 */
	EList<GenAuditRule> getAudits();

} // GenAuditContainer
