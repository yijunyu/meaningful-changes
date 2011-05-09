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
 * A representation of the model object '<em><b>Gen Feature Seq Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Feature sequence initializer
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getInitializers <em>Initializers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenFeatureSeqInitializer()
 * @model
 * @generated
 */
public interface GenFeatureSeqInitializer extends GenElementInitializer {
	/**
	 * Returns the value of the '<em><b>Initializers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value specifications as initializers for individual features which should be initialized in the order given by this list
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initializers</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenFeatureSeqInitializer_Initializers()
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec" containment="true" required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ocl='typeModelFacet.metaClass.ecoreClass'"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='initializers.feature->forAll(f| f.ecoreFeature.eContainingClass.isSuperTypeOf(typeModelFacet.metaClass.ecoreClass))'"
	 * @generated
	 */
	EList getInitializers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the accessor name of this initializer's element class meta object within its package interface
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getElementClassAccessorName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the qualified name of the package interface which contains this initializer's element class meta object
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getElementQualifiedPackageInterfaceName();

} // GenFeatureSeqInitializer
