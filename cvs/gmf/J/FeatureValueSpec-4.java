/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Value Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Value specification associated with a specific feature
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.FeatureValueSpec#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.FeatureValueSpec#getFeatureSeqInitializer <em>Feature Seq Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getFeatureValueSpec()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='ValueSpec'"
 * @generated
 */
public interface FeatureValueSpec extends ValueExpression {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes the feature for which this value expression is specified. Its containing EClass is the context for evaluation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getFeatureValueSpec_Feature()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='type'"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='feature.eContainingClass.isSuperTypeOf(featureSeqInitializer.mappingEntry.getDomainContext())' description='Initialized \'Feature\' must be owned by \'Domain Element\' or its super type'"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.FeatureValueSpec#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Feature Seq Initializer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.FeatureSeqInitializer#getInitializers <em>Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Seq Initializer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Seq Initializer</em>' container reference.
	 * @see #setFeatureSeqInitializer(FeatureSeqInitializer)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getFeatureValueSpec_FeatureSeqInitializer()
	 * @see org.eclipse.gmf.mappings.FeatureSeqInitializer#getInitializers
	 * @model opposite="initializers" required="true"
	 * @generated
	 */
	FeatureSeqInitializer getFeatureSeqInitializer();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.FeatureValueSpec#getFeatureSeqInitializer <em>Feature Seq Initializer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Seq Initializer</em>' container reference.
	 * @see #getFeatureSeqInitializer()
	 * @generated
	 */
	void setFeatureSeqInitializer(FeatureSeqInitializer value);

} // FeatureValueSpec
