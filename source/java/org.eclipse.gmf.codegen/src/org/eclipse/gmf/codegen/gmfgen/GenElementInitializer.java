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
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GenElementInitializer extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Model Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type model facet whose domain model element is to be intialized by this initializer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Model Facet</em>' reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenElementInitializer_TypeModelFacet()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	TypeModelFacet getTypeModelFacet();
} // GenElementInitializer
