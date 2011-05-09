/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Feature Value Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Value specification associated with a specific feature
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec#getFeatureSeqInitializer <em>Feature Seq Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenFeatureValueSpec()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='ValueSpec'"
 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='type' ocl='feature.ecoreFeature'"
 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='feature <> null implies feature.ecoreFeature.eContainingClass.isSuperTypeOf(featureSeqInitializer.typeModelFacet.metaClass.ecoreClass)' description='The feature of \'GenFeatureValueSpec\' must be available in \'Meta Class\' of the initialized element'"
 * @generated
 */
public interface GenFeatureValueSpec extends ValueExpression {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature for which this value expression is specified
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(GenFeature)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenFeatureValueSpec_Feature()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='feature <> null implies not featureSeqInitializer.initializers->exists(i| i <> self and feature = self.feature)' description='The feature is already initialized by another \'GenFeatureValueSpec\' in the sequence'"
	 * @generated
	 */
	GenFeature getFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(GenFeature value);

	/**
	 * Returns the value of the '<em><b>Feature Seq Initializer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getInitializers <em>Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Seq Initializer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Seq Initializer</em>' container reference.
	 * @see #setFeatureSeqInitializer(GenFeatureSeqInitializer)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenFeatureValueSpec_FeatureSeqInitializer()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getInitializers
	 * @model opposite="initializers" required="true"
	 * @generated
	 */
	GenFeatureSeqInitializer getFeatureSeqInitializer();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec#getFeatureSeqInitializer <em>Feature Seq Initializer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Seq Initializer</em>' container reference.
	 * @see #getFeatureSeqInitializer()
	 * @generated
	 */
	void setFeatureSeqInitializer(GenFeatureSeqInitializer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the qualified name of the package interface which contains the given feature meta object
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getFeatureQualifiedPackageInterfaceName();

} // GenFeatureValueSpec
