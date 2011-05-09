/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Element Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for initializers of domain model elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenElementInitializer#getTypeModelFacet <em>Type Model Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenElementInitializer()
 * @model abstract="true"
 * @generated
 */
public interface GenElementInitializer extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Model Facet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getModelElementInitializer <em>Model Element Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type model facet whose domain model element is to be intialized by this initializer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Model Facet</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenElementInitializer_TypeModelFacet()
	 * @see org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getModelElementInitializer
	 * @model opposite="modelElementInitializer" required="true" changeable="false"
	 * @generated
	 */
	TypeModelFacet getTypeModelFacet();

} // GenElementInitializer
