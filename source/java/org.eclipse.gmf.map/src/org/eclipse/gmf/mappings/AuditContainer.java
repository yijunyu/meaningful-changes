/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for audit rules representing a hierarchical organization of audits in the constraint category hierarchy of emft.validation framework
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.AuditContainer#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.AuditContainer#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.AuditContainer#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.AuditContainer#getParentContainer <em>Parent Container</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.AuditContainer#getAudits <em>Audits</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.AuditContainer#getChildContainers <em>Child Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditContainer()
 * @model
 * @generated
 */
public interface AuditContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier which is unique within the scope of its parent container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditContainer_Id()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not parentContainer.oclIsUndefined() implies parentContainer.childContainers->one(i | i.id = self.id)' description='Audit container with the same ID already exists'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.AuditContainer#getId <em>Id</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable name for the category of audits organized in this container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.AuditContainer#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditContainer_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.AuditContainer#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.AuditContainer#getChildContainers <em>Child Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Container</em>' container reference.
	 * @see #setParentContainer(AuditContainer)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditContainer_ParentContainer()
	 * @see org.eclipse.gmf.mappings.AuditContainer#getChildContainers
	 * @model opposite="childContainers" transient="false"
	 * @generated
	 */
	AuditContainer getParentContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.AuditContainer#getParentContainer <em>Parent Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Container</em>' container reference.
	 * @see #getParentContainer()
	 * @generated
	 */
	void setParentContainer(AuditContainer value);

	/**
	 * Returns the value of the '<em><b>Audits</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.AuditRule}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.AuditRule#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The audit rules organized in this container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audits</em>' containment reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditContainer_Audits()
	 * @see org.eclipse.gmf.mappings.AuditRule#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<AuditRule> getAudits();

	/**
	 * Returns the value of the '<em><b>Child Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.AuditContainer}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.AuditContainer#getParentContainer <em>Parent Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Containers</em>' containment reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getAuditContainer_ChildContainers()
	 * @see org.eclipse.gmf.mappings.AuditContainer#getParentContainer
	 * @model opposite="parentContainer" containment="true"
	 * @generated
	 */
	EList<AuditContainer> getChildContainers();

} // AuditContainer
