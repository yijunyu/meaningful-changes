/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Seq Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Feature sequence initializer
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.FeatureSeqInitializer#getInitializers <em>Initializers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getFeatureSeqInitializer()
 * @model
 * @generated
 */
public interface FeatureSeqInitializer extends ElementInitializer{
	/**
	 * Returns the value of the '<em><b>Initializers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.FeatureValueSpec}.
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
	 * @model type="org.eclipse.gmf.mappings.FeatureValueSpec" containment="true" required="true"
	 * @generated
	 */
	EList getInitializers();

} // FeatureSeqInitializer
