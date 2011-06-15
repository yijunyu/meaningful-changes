/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenReferenceNewElementSpec.java,v 1.3 2007/09/07 18:16:49 dstadnik Exp $
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Reference New Element Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenReferenceNewElementSpec#getNewElementInitializers <em>New Element Initializers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenReferenceNewElementSpec()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='feature <> null implies feature.ecoreFeature.oclIsKindOf(ecore::EReference)' description='\'feature\' of \'GenReferenceNewElementSpec\' must refer to ecore::EReference'"
 * @generated
 */
public interface GenReferenceNewElementSpec extends GenFeatureInitializer {
	/**
	 * Returns the value of the '<em><b>New Element Initializers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getCreatingInitializer <em>Creating Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Element Initializers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Element Initializers</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenReferenceNewElementSpec_NewElementInitializers()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getCreatingInitializer
	 * @model opposite="creatingInitializer" containment="true" required="true"
	 * @generated
	 */
	EList<GenFeatureSeqInitializer> getNewElementInitializers();

} // GenReferenceNewElementSpec
