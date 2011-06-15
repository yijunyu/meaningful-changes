/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Seq Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Feature sequence initializer to initialize a sequence of features
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.FeatureSeqInitializer#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.FeatureSeqInitializer#getElementClass <em>Element Class</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.FeatureSeqInitializer#getCreatingInitializer <em>Creating Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getFeatureSeqInitializer()
 * @model
 * @generated
 */
public interface FeatureSeqInitializer extends ElementInitializer {
	/**
	 * Returns the value of the '<em><b>Initializers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.FeatureInitializer}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.FeatureInitializer#getFeatureSeqInitializer <em>Feature Seq Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value specifications as initializers for individual features which should be initialized in the order given by this list
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initializers</em>' containment reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getFeatureSeqInitializer_Initializers()
	 * @see org.eclipse.gmf.mappings.FeatureInitializer#getFeatureSeqInitializer
	 * @model opposite="featureSeqInitializer" containment="true" required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ocl='self.elementClass'"
	 * @generated
	 */
	EList<FeatureInitializer> getInitializers();

	/**
	 * Returns the value of the '<em><b>Element Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Class</em>' reference.
	 * @see #setElementClass(EClass)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getFeatureSeqInitializer_ElementClass()
	 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not creatingInitializer.feature.oclIsUndefined() implies creatingInitializer.feature.oclAsType(ecore::EReference).eReferenceType.isSuperTypeOf(elementClass)' description='\'elementClass\' must be the same as or sub-type of the containing \'GenReferenceNewElementSpec\' reference type'"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not creatingInitializer.feature.oclIsUndefined() implies not (elementClass.interface or elementClass.abstract)' description='\'elementClass\' must be a concrete EClass which is the same or sub-type of the containing \'GenReferenceNewElementSpec\' reference type'"
	 * @generated
	 */
	EClass getElementClass();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.FeatureSeqInitializer#getElementClass <em>Element Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Class</em>' reference.
	 * @see #getElementClass()
	 * @generated
	 */
	void setElementClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Creating Initializer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.ReferenceNewElementSpec#getNewElementInitializers <em>New Element Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creating Initializer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creating Initializer</em>' container reference.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getFeatureSeqInitializer_CreatingInitializer()
	 * @see org.eclipse.gmf.mappings.ReferenceNewElementSpec#getNewElementInitializers
	 * @model opposite="newElementInitializers" resolveProxies="false" transient="false" changeable="false"
	 * @generated
	 */
	ReferenceNewElementSpec getCreatingInitializer();

} // FeatureSeqInitializer
