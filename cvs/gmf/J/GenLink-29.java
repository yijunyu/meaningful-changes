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
 * A representation of the model object '<em><b>Gen Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getModelFacet <em>Model Facet</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#isOutgoingCreationAllowed <em>Outgoing Creation Allowed</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#isIncomingCreationAllowed <em>Incoming Creation Allowed</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#isViewDirectionAlignedWithModel <em>View Direction Aligned With Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getCreationConstraints <em>Creation Constraints</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getCreateCommandClassName <em>Create Command Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getReorientCommandClassName <em>Reorient Command Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='diagramRunTimeClass.ecoreClass.eAllSuperTypes->including(diagramRunTimeClass.ecoreClass)->one(ePackage.name = \'notation\' and name = \'Edge\')' description='Link \'Diagram Runtime Class\' must be a notation::Edge or sub-class'"
 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='outgoingCreationAllowed or incomingCreationAllowed' description='Either outgoingCreationAllowed or incomingCreationAllowed property should be true'"
 * @generated
 */
public interface GenLink extends GenCommonBase {

	public static final String CLASS_NAME_PREFIX = "Link"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_Diagram()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getLinks
	 * @model opposite="links" required="true" transient="false" changeable="false"
	 * @generated
	 */
	GenDiagram getDiagram();

	/**
	 * Returns the value of the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Facet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Facet</em>' containment reference.
	 * @see #setModelFacet(LinkModelFacet)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_ModelFacet()
	 * @model containment="true"
	 * @generated
	 */
	LinkModelFacet getModelFacet();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getModelFacet <em>Model Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Facet</em>' containment reference.
	 * @see #getModelFacet()
	 * @generated
	 */
	void setModelFacet(LinkModelFacet value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenLinkLabel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkLabel#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_Labels()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLinkLabel#getLink
	 * @model opposite="link" containment="true"
	 * @generated
	 */
	EList<GenLinkLabel> getLabels();

	/**
	 * Returns the value of the '<em><b>Outgoing Creation Allowed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Support link creation from source to target
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Creation Allowed</em>' attribute.
	 * @see #setOutgoingCreationAllowed(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_OutgoingCreationAllowed()
	 * @model default="true"
	 * @generated
	 */
	boolean isOutgoingCreationAllowed();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#isOutgoingCreationAllowed <em>Outgoing Creation Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Creation Allowed</em>' attribute.
	 * @see #isOutgoingCreationAllowed()
	 * @generated
	 */
	void setOutgoingCreationAllowed(boolean value);

	/**
	 * Returns the value of the '<em><b>Incoming Creation Allowed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Support link creation from target to source
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Creation Allowed</em>' attribute.
	 * @see #setIncomingCreationAllowed(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_IncomingCreationAllowed()
	 * @model default="false"
	 * @generated
	 */
	boolean isIncomingCreationAllowed();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#isIncomingCreationAllowed <em>Incoming Creation Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Creation Allowed</em>' attribute.
	 * @see #isIncomingCreationAllowed()
	 * @generated
	 */
	void setIncomingCreationAllowed(boolean value);

	/**
	 * Returns the value of the '<em><b>View Direction Aligned With Model</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * View (Edge) will always be directed from model source to model target
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Direction Aligned With Model</em>' attribute.
	 * @see #setViewDirectionAlignedWithModel(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_ViewDirectionAlignedWithModel()
	 * @model default="true"
	 * @generated
	 */
	boolean isViewDirectionAlignedWithModel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#isViewDirectionAlignedWithModel <em>View Direction Aligned With Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Direction Aligned With Model</em>' attribute.
	 * @see #isViewDirectionAlignedWithModel()
	 * @generated
	 */
	void setViewDirectionAlignedWithModel(boolean value);

	/**
	 * Returns the value of the '<em><b>Creation Constraints</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies additional restrictions on link creation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Constraints</em>' containment reference.
	 * @see #setCreationConstraints(GenLinkConstraints)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_CreationConstraints()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getLink
	 * @model opposite="link" containment="true"
	 * @generated
	 */
	GenLinkConstraints getCreationConstraints();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getCreationConstraints <em>Creation Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Constraints</em>' containment reference.
	 * @see #getCreationConstraints()
	 * @generated
	 */
	void setCreationConstraints(GenLinkConstraints value);

	/**
	 * Returns the value of the '<em><b>Create Command Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Command Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Command Class Name</em>' attribute.
	 * @see #setCreateCommandClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_CreateCommandClassName()
	 * @model
	 * @generated
	 */
	String getCreateCommandClassName();

	public static final String CREATE_COMMAND_SUFFIX = "CreateCommand"; //$NON-NLS-1$

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getCreateCommandClassName <em>Create Command Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Command Class Name</em>' attribute.
	 * @see #getCreateCommandClassName()
	 * @generated
	 */
	void setCreateCommandClassName(String value);

	/**
	 * Returns the value of the '<em><b>Reorient Command Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reorient Command Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reorient Command Class Name</em>' attribute.
	 * @see #setReorientCommandClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_ReorientCommandClassName()
	 * @model
	 * @generated
	 */
	String getReorientCommandClassName();

	public static final String REORIENT_COMMAND_SUFFIX = "ReorientCommand"; //$NON-NLS-1$

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getReorientCommandClassName <em>Reorient Command Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reorient Command Class Name</em>' attribute.
	 * @see #getReorientCommandClassName()
	 * @generated
	 */
	void setReorientCommandClassName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns link sources in this genmodel
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<GenCommonBase> getAssistantSources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns link targets in this genmodel
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<GenCommonBase> getAssistantTargets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCreateCommandQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getReorientCommandQualifiedClassName();

} // GenLink
