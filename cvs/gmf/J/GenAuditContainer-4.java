/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Audit Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for audit rules representing a hierarchical organization of audits in the constraint category hierarchy of emft.validation framework
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getParentContainer <em>Parent Container</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getAudits <em>Audits</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getChildContainers <em>Child Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditContainer()
 * @model
 * @generated
 */
public interface GenAuditContainer extends GenRuleContainerBase {
	/**
	 * Returns the value of the '<em><b>Audits</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audits</em>' container reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The audit rules organized in this container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audits</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditContainer_Audits()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getContainer
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenAuditRule" opposite="container" containment="true"
	 * @generated
	 */
	EList getAudits();

	/**
	 * Returns the value of the '<em><b>Child Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getParentContainer <em>Parent Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Containers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Containers</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditContainer_ChildContainers()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getParentContainer
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenAuditContainer" opposite="parentContainer" containment="true"
	 * @generated
	 */
	EList getChildContainers();

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
	 * Returns the value of the '<em><b>Parent Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getChildContainers <em>Child Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Container</em>' container reference.
	 * @see #setParentContainer(GenAuditContainer)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenAuditContainer_ParentContainer()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getChildContainers
	 * @model opposite="childContainers"
	 * @generated
	 */
	GenAuditContainer getParentContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getParentContainer <em>Parent Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Container</em>' container reference.
	 * @see #getParentContainer()
	 * @generated
	 */
	void setParentContainer(GenAuditContainer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets all audit rules from this audit container hierarchy recursively
	 * <!-- end-model-doc -->
	 * @model kind="operation" type="org.eclipse.gmf.codegen.gmfgen.GenAuditRule"
	 * @generated
	 */
	EList getAllAuditRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets all audit containers from this audit container hierarchy recursively
	 * <!-- end-model-doc -->
	 * @model kind="operation" type="org.eclipse.gmf.codegen.gmfgen.GenAuditContainer"
	 * @generated
	 */
	EList getAllAuditContainers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets hierarchical path of this audit container as ordered list of containers beginning with the root and ended with this container
	 * <!-- end-model-doc -->
	 * @model kind="operation" type="org.eclipse.gmf.codegen.gmfgen.GenAuditContainer" required="true"
	 * @generated
	 */
	EList getPath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maps all rules in the container hierarchy to client context IDs of their target contexts. key: (context ID of rule target) value: (EList<GenAuditRule>)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Map getAllRulesToTargetContextMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets all model packages to which rules in this container hierarchy are targeted. Checks rules recursively.
	 * <!-- end-model-doc -->
	 * @model kind="operation" type="org.eclipse.emf.codegen.ecore.genmodel.GenPackage"
	 * @generated
	 */
	EList getAllTargetedModelPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this container hierarchy contains at least 1 rule targeted on notation elements. Checks recursively.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean hasDiagramElementRule();

} // GenAuditContainer
