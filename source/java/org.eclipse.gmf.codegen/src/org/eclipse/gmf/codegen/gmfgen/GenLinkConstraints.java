/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Link Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Groups constraints on the link source and target end
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getLink <em>Link</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getSourceEnd <em>Source End</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getTargetEnd <em>Target End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLinkConstraints()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not sourceEnd.oclIsUndefined() or not targetEnd.oclIsUndefined()' description='Either \'sourceEnd\' or \'targetEnd\' constraint must be specified'"
 * @generated
 */
public interface GenLinkConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getCreationConstraints <em>Creation Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the owning link of this constraints
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' container reference.
	 * @see #setLink(GenLink)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLinkConstraints_Link()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLink#getCreationConstraints
	 * @model opposite="creationConstraints" required="true" transient="false"
	 * @generated
	 */
	GenLink getLink();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getLink <em>Link</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' container reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(GenLink value);

	/**
	 * Returns the value of the '<em><b>Source End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restriction enforced by the the source end, may reference variables 'oppositeEnd' pointing to targetEnd and 'link' denoting the link domainmetaElement instance if available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source End</em>' reference.
	 * @see #setSourceEnd(GenConstraint)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLinkConstraints_SourceEnd()
	 * @model annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ocl='getSourceEndContextClass().ecoreClass'"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='variable' name='oppositeEnd' type.ocl='getTargetEndContextClass().ecoreClass'"
	 * @generated
	 */
	GenConstraint getSourceEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getSourceEnd <em>Source End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source End</em>' reference.
	 * @see #getSourceEnd()
	 * @generated
	 */
	void setSourceEnd(GenConstraint value);

	/**
	 * Returns the value of the '<em><b>Target End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restriction enforced by the the target end, may reference variables 'oppositeEnd' pointing to sourceEnd and 'link' denoting the link domainmetaElement instance if available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target End</em>' reference.
	 * @see #setTargetEnd(GenConstraint)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLinkConstraints_TargetEnd()
	 * @model annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ocl='getTargetEndContextClass().ecoreClass'"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='variable' name='oppositeEnd' type.ocl='getSourceEndContextClass().ecoreClass'"
	 * @generated
	 */
	GenConstraint getTargetEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getTargetEnd <em>Target End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target End</em>' reference.
	 * @see #getTargetEnd()
	 * @generated
	 */
	void setTargetEnd(GenConstraint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The domain meta element class of the link restricted by this constraints
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	GenClass getLinkClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context class for the source end constraint evaluation
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	GenClass getSourceEndContextClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context class for the target end constraint evaluation
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	GenClass getTargetEndContextClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the name of the field holding Link Constraints instance
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getConstraintsInstanceFieldName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isValid();

} // GenLinkConstraints
