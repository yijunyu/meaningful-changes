/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.diadef.Connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.LinkMapping#getDiagramLink <em>Diagram Link</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LinkMapping#getDomainMetaElement <em>Domain Meta Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LinkMapping#getDomainSpecialization <em>Domain Specialization</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LinkMapping#getDomainInitializer <em>Domain Initializer</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LinkMapping#getContainmentFeature <em>Containment Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LinkMapping#getLabelEditFeature <em>Label Edit Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LinkMapping#getLabelDisplayFeature <em>Label Display Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LinkMapping#getLinkMetaFeature <em>Link Meta Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LinkMapping#getCreationConstraints <em>Creation Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkMapping()
 * @model
 * @generated
 */
public interface LinkMapping extends MappingEntry{
	/**
	 * Returns the value of the '<em><b>Diagram Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Link</em>' reference.
	 * @see #setDiagramLink(Connection)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkMapping_DiagramLink()
	 * @model required="true"
	 * @generated
	 */
	Connection getDiagramLink();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LinkMapping#getDiagramLink <em>Diagram Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Link</em>' reference.
	 * @see #getDiagramLink()
	 * @generated
	 */
	void setDiagramLink(Connection value);

	/**
	 * Returns the value of the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Meta Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Meta Element</em>' reference.
	 * @see #setDomainMetaElement(EClass)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkMapping_DomainMetaElement()
	 * @model
	 * @generated
	 */
	EClass getDomainMetaElement();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LinkMapping#getDomainMetaElement <em>Domain Meta Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Meta Element</em>' reference.
	 * @see #getDomainMetaElement()
	 * @generated
	 */
	void setDomainMetaElement(EClass value);

	/**
	 * Returns the value of the '<em><b>Domain Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specializes further the domain meta element EClass associated with this mapping and should be evaluated in this EClass context
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Specialization</em>' containment reference.
	 * @see #setDomainSpecialization(Constraint)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkMapping_DomainSpecialization()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ocl='if domainMetaElement.oclIsUndefined() then linkMetaFeature.eContainingClass else domainMetaElement endif '"
	 * @generated
	 */
	Constraint getDomainSpecialization();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LinkMapping#getDomainSpecialization <em>Domain Specialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Specialization</em>' containment reference.
	 * @see #getDomainSpecialization()
	 * @generated
	 */
	void setDomainSpecialization(Constraint value);

	/**
	 * Returns the value of the '<em><b>Domain Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Initializer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initializer for the domain model element associated with mapping
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Initializer</em>' containment reference.
	 * @see #setDomainInitializer(ElementInitializer)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkMapping_DomainInitializer()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='let i : FeatureSeqInitializer = domainInitializer.oclAsType( FeatureSeqInitializer) in i.oclIsUndefined() or i.initializers.feature.eContainingClass->forAll(c|c.isSuperTypeOf(domainMetaElement)) '"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ocl='if domainMetaElement.oclIsUndefined() then linkMetaFeature.eContainingClass else domainMetaElement endif '"
	 * @generated
	 */
	ElementInitializer getDomainInitializer();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LinkMapping#getDomainInitializer <em>Domain Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Initializer</em>' containment reference.
	 * @see #getDomainInitializer()
	 * @generated
	 */
	void setDomainInitializer(ElementInitializer value);

	/**
	 * Returns the value of the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Feature</em>' reference.
	 * @see #setContainmentFeature(EReference)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkMapping_ContainmentFeature()
	 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='containmentFeature.oclIsUndefined() or containmentFeature.eReferenceType.isSuperTypeOf(domainMetaElement)'"
	 * @generated
	 */
	EReference getContainmentFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LinkMapping#getContainmentFeature <em>Containment Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment Feature</em>' reference.
	 * @see #getContainmentFeature()
	 * @generated
	 */
	void setContainmentFeature(EReference value);

	/**
	 * Returns the value of the '<em><b>Label Edit Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Edit Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Edit Feature</em>' reference.
	 * @see #setLabelEditFeature(EAttribute)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkMapping_LabelEditFeature()
	 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='labelEditFeature.oclIsUndefined() or labelEditFeature.eContainingClass.isSuperTypeOf(domainMetaElement)'"
	 * @generated
	 */
	EAttribute getLabelEditFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LinkMapping#getLabelEditFeature <em>Label Edit Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Edit Feature</em>' reference.
	 * @see #getLabelEditFeature()
	 * @generated
	 */
	void setLabelEditFeature(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Label Display Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Display Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * By default, same as editFeature, once latter is set
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Display Feature</em>' reference.
	 * @see #setLabelDisplayFeature(EAttribute)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkMapping_LabelDisplayFeature()
	 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='labelDisplayFeature.oclIsUndefined() or labelDisplayFeature.eContainingClass.isSuperTypeOf(domainMetaElement)'"
	 * @generated
	 */
	EAttribute getLabelDisplayFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LinkMapping#getLabelDisplayFeature <em>Label Display Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Display Feature</em>' reference.
	 * @see #getLabelDisplayFeature()
	 * @generated
	 */
	void setLabelDisplayFeature(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Link Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Meta Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Meta Feature</em>' reference.
	 * @see #setLinkMetaFeature(EStructuralFeature)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkMapping_LinkMetaFeature()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='domainMetaElement.oclIsUndefined() or linkMetaFeature.eContainingClass.isSuperTypeOf(domainMetaElement)'"
	 * @generated
	 */
	EStructuralFeature getLinkMetaFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LinkMapping#getLinkMetaFeature <em>Link Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Meta Feature</em>' reference.
	 * @see #getLinkMetaFeature()
	 * @generated
	 */
	void setLinkMetaFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Creation Constraints</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.LinkConstraints#getLinkMapping <em>Link Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies additional restrictions on link creation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Constraints</em>' containment reference.
	 * @see #setCreationConstraints(LinkConstraints)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLinkMapping_CreationConstraints()
	 * @see org.eclipse.gmf.mappings.LinkConstraints#getLinkMapping
	 * @model opposite="linkMapping" containment="true"
	 * @generated
	 */
	LinkConstraints getCreationConstraints();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LinkMapping#getCreationConstraints <em>Creation Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Constraints</em>' containment reference.
	 * @see #getCreationConstraints()
	 * @generated
	 */
	void setCreationConstraints(LinkConstraints value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EClass getDomainMetaClass();

} // LinkMapping
