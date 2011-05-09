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
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenElementInitializer#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenElementInitializer()
 * @model abstract="true"
 * @generated
 */
public interface GenElementInitializer extends EObject{
	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenBaseElement#getModelElementInitializer <em>Model Element Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The genBase element whose domain model element is to be intialized by this initializer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenElementInitializer_Element()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenBaseElement#getModelElementInitializer
	 * @model opposite="modelElementInitializer" required="true" changeable="false"
	 * @generated
	 */
	GenBaseElement getElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the name of the generated method which contains the initialization code for the domain element
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getInitializerMethodName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets full class name of the generated class holding element initializers
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getInitializersQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets IDs of plugins required by this initializer
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.gmf.codegen.gmfgen.StringArray" required="true"
	 * @generated
	 */
	String[] getRequiredPluginIDs();

} // GenElementInitializer
