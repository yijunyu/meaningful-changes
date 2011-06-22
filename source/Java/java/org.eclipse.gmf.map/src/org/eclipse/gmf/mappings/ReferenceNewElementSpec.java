/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferenceNewElementSpec.java,v 1.3 2008/03/03 17:45:08 atikhomirov Exp $
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference New Element Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.ReferenceNewElementSpec#getNewElementInitializers <em>New Element Initializers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getReferenceNewElementSpec()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='feature.many = false implies not (newElementInitializers->size() > 1)' description='FeatureInitializer for single element EReference can\'t contain multiple element initializers'"
 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='let r: ecore::EReference = feature.oclAsType(ecore::EReference) in feature <> null implies r.containment' description='\'feature\' of \'ReferenceNewElementSpec\' must refer to containment ecore::EReference'"
 * @generated
 */
public interface ReferenceNewElementSpec extends FeatureInitializer {
	/**
	 * Returns the value of the '<em><b>New Element Initializers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.FeatureSeqInitializer}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.FeatureSeqInitializer#getCreatingInitializer <em>Creating Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Element Initializers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Element Initializers</em>' containment reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getReferenceNewElementSpec_NewElementInitializers()
	 * @see org.eclipse.gmf.mappings.FeatureSeqInitializer#getCreatingInitializer
	 * @model opposite="creatingInitializer" containment="true" required="true"
	 * @generated
	 */
	EList<FeatureSeqInitializer> getNewElementInitializers();

} // ReferenceNewElementSpec