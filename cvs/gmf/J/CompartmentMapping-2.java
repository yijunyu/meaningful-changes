/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.gmfgraph.Compartment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.CompartmentMapping#getParentNodeMapping <em>Parent Node Mapping</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.CompartmentMapping#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.CompartmentMapping#getChildNodes <em>Child Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getCompartmentMapping()
 * @model
 * @generated
 */
public interface CompartmentMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Node Mapping</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.AbstractNodeMapping#getCompartmentMappings <em>Compartment Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node Mapping</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node Mapping</em>' container reference.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getCompartmentMapping_ParentNodeMapping()
	 * @see org.eclipse.gmf.mappings.AbstractNodeMapping#getCompartmentMappings
	 * @model opposite="compartmentMappings" required="true" changeable="false"
	 * @generated
	 */
	AbstractNodeMapping getParentNodeMapping();

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment</em>' reference.
	 * @see #setCompartment(Compartment)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getCompartmentMapping_Compartment()
	 * @model required="true"
	 * @generated
	 */
	Compartment getCompartment();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.CompartmentMapping#getCompartment <em>Compartment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment</em>' reference.
	 * @see #getCompartment()
	 * @generated
	 */
	void setCompartment(Compartment value);

	/**
	 * Returns the value of the '<em><b>Child Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.ChildNodeMapping}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.ChildNodeMapping#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Nodes</em>' reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getCompartmentMapping_ChildNodes()
	 * @see org.eclipse.gmf.mappings.ChildNodeMapping#getCompartment
	 * @model type="org.eclipse.gmf.mappings.ChildNodeMapping" opposite="compartment"
	 * @generated
	 */
	EList getChildNodes();

} // CompartmentMapping
