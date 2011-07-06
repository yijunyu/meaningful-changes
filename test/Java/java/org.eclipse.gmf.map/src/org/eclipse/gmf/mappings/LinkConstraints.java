/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Groups constraints on the link source and target end
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.LinkConstraints#getLinkMapping <em>Link Mapping</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LinkConstraints#getSourceEnd <em>Source End</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LinkConstraints#getTargetEnd <em>Target End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkConstraints()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not (sourceEnd.oclIsUndefined() and targetEnd.oclIsUndefined())' description='Either \'sourceEnd\' or \'targetEnd\' constraint must be specified'"
 * @generated
 */
public interface LinkConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Link Mapping</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.LinkMapping#getCreationConstraints <em>Creation Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the link mapping restricted by these constraints
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Mapping</em>' container reference.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkConstraints_LinkMapping()
	 * @see org.eclipse.gmf.mappings.LinkMapping#getCreationConstraints
	 * @model opposite="creationConstraints" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	LinkMapping getLinkMapping();

	/**
	 * Returns the value of the '<em><b>Source End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restriction enforced by the the source end, may reference variable 'oppositeEnd' pointing to targetEnd domainMetaElement instance if available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source End</em>' containment reference.
	 * @see #setSourceEnd(Constraint)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkConstraints_SourceEnd()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ocl='let lm:LinkMapping=linkMapping in if lm.sourceMetaFeature.oclIsUndefined() then (if lm.containmentFeature.oclIsUndefined() then lm.linkMetaFeature.eContainingClass else lm.containmentFeature.eContainingClass endif) else lm.sourceMetaFeature.oclAsType(ecore::EReference).eReferenceType endif'"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='variable' name='oppositeEnd' type.ocl='linkMapping.linkMetaFeature.eType'"
	 * @generated
	 */
	Constraint getSourceEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LinkConstraints#getSourceEnd <em>Source End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source End</em>' containment reference.
	 * @see #getSourceEnd()
	 * @generated
	 */
	void setSourceEnd(Constraint value);

	/**
	 * Returns the value of the '<em><b>Target End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restriction enforced by the the target end, may reference variable 'oppositeEnd' pointing to sourceEnd domainMetaElement instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target End</em>' containment reference.
	 * @see #setTargetEnd(Constraint)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkConstraints_TargetEnd()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ocl='linkMapping.linkMetaFeature.eType.oclAsType(ecore::EClass)'"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='variable' name='oppositeEnd' type.ocl='let lm:LinkMapping=linkMapping in if lm.sourceMetaFeature.oclIsUndefined() then (if lm.containmentFeature.oclIsUndefined() then lm.linkMetaFeature.eContainingClass else lm.containmentFeature.eContainingClass endif) else lm.sourceMetaFeature.oclAsType(ecore::EReference).eReferenceType endif'"
	 * @generated
	 */
	Constraint getTargetEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LinkConstraints#getTargetEnd <em>Target End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target End</em>' containment reference.
	 * @see #getTargetEnd()
	 * @generated
	 */
	void setTargetEnd(Constraint value);

} // LinkConstraints
