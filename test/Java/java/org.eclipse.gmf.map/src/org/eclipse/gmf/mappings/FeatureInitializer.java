/**
 * <copyright>
 * </copyright>
 *
 * $Id: FeatureInitializer.java,v 1.6 2008/04/18 14:43:25 atikhomirov Exp $
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.FeatureInitializer#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.FeatureInitializer#getFeatureSeqInitializer <em>Feature Seq Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getFeatureInitializer()
 * @model abstract="true"
 * @generated
 */
public interface FeatureInitializer extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature for which is to be initialized by this initializer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getFeatureInitializer_Feature()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='feature <> null implies not featureSeqInitializer.initializers->exists(i| i <> self and i.feature = self.feature)' description='The feature is already initialized by another \'FeatureInitializer\' in the sequence'"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='feature <> null implies feature.eContainingClass.isSuperTypeOf(featureSeqInitializer.elementClass)' description='The \'feature\' of \'FeatureInitializer\' must be available in \'Meta Class\' of the initialized element'"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='feature <> null implies feature.changeable' description='The \'feature\' of \'FeatureInitializer\' must be changeable'"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.FeatureInitializer#getFeature <em>Feature</em>}' reference.
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
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getFeatureInitializer_FeatureSeqInitializer()
	 * @see org.eclipse.gmf.mappings.FeatureSeqInitializer#getInitializers
	 * @model opposite="initializers" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	FeatureSeqInitializer getFeatureSeqInitializer();

} // FeatureInitializer