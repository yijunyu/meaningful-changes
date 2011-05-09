/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for initializers of domain model elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.ElementInitializer#getMappingEntry <em>Mapping Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getElementInitializer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ElementInitializer extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping Entry</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.MappingEntry#getDomainInitializer <em>Domain Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Entry</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Entry</em>' container reference.
	 * @see #setMappingEntry(MappingEntry)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getElementInitializer_MappingEntry()
	 * @see org.eclipse.gmf.mappings.MappingEntry#getDomainInitializer
	 * @model opposite="domainInitializer" required="true"
	 * @generated
	 */
	MappingEntry getMappingEntry();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.ElementInitializer#getMappingEntry <em>Mapping Entry</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Entry</em>' container reference.
	 * @see #getMappingEntry()
	 * @generated
	 */
	void setMappingEntry(MappingEntry value);

} // ElementInitializer
