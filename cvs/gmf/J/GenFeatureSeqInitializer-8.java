/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
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
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getElementClass <em>Element Class</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getCreatingInitializer <em>Creating Initializer</em>}</li>
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
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenFeatureInitializer}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureInitializer#getFeatureSeqInitializer <em>Feature Seq Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value specifications as initializers for individual features which should be initialized in the order given by this list
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initializers</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenFeatureSeqInitializer_Initializers()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenFeatureInitializer#getFeatureSeqInitializer
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenFeatureInitializer" opposite="featureSeqInitializer" containment="true" required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ocl='self.elementClass'"
	 * @generated
	 */
	EList getInitializers();

	/**
	 * Returns the value of the '<em><b>Element Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Class</em>' reference.
	 * @see #setElementClass(GenClass)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenFeatureSeqInitializer_ElementClass()
	 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not creatingInitializer.feature.oclIsUndefined() implies creatingInitializer.feature.ecoreFeature.oclAsType(ecore::EReference).eReferenceType.isSuperTypeOf(elementClass.ecoreClass)' description='\'elementClass\' must be the same as or sub-type of the containing \'GenReferenceNewElementSpec\' reference type'"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not creatingInitializer.feature.oclIsUndefined() implies not (elementClass.ecoreClass.interface or elementClass.ecoreClass.abstract)' description='\'elementClass\' must be a concrete EClass which is the same or sub-type of the containing \'GenReferenceNewElementSpec\' reference type'"
	 * @generated
	 */
	GenClass getElementClass();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getElementClass <em>Element Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Class</em>' reference.
	 * @see #getElementClass()
	 * @generated
	 */
	void setElementClass(GenClass value);

	/**
	 * Returns the value of the '<em><b>Creating Initializer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenReferenceNewElementSpec#getNewElementInitializers <em>New Element Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creating Initializer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creating Initializer</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenFeatureSeqInitializer_CreatingInitializer()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenReferenceNewElementSpec#getNewElementInitializers
	 * @model opposite="newElementInitializers" changeable="false"
	 * @generated
	 */
	GenReferenceNewElementSpec getCreatingInitializer();

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

	List<GenFeatureSeqInitializer> getAllFeatureSeqInitializers();	

} // GenFeatureSeqInitializer
