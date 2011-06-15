/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;


import org.eclipse.emf.common.util.EList;

import org.eclipse.gmf.gmfgraph.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Both top-level diagram node and any inner node
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.NodeMapping#getDiagramNode <em>Diagram Node</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.NodeMapping#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.NodeMapping#getCompartments <em>Compartments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getNodeMapping()
 * @model
 * @generated
 */
public interface NodeMapping extends MappingEntry, MenuOwner, ToolOwner, AppearanceSteward {
	/**
	 * Returns the value of the '<em><b>Diagram Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Node</em>' reference.
	 * @see #setDiagramNode(Node)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getNodeMapping_DiagramNode()
	 * @model required="true"
	 * @generated
	 */
	Node getDiagramNode();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.NodeMapping#getDiagramNode <em>Diagram Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Node</em>' reference.
	 * @see #getDiagramNode()
	 * @generated
	 */
	void setDiagramNode(Node value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.ChildReference}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.ChildReference#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getNodeMapping_Children()
	 * @see org.eclipse.gmf.mappings.ChildReference#getParentNode
	 * @model opposite="parentNode" containment="true"
	 * @generated
	 */
	EList<ChildReference> getChildren();

	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.CompartmentMapping}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.CompartmentMapping#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' containment reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getNodeMapping_Compartments()
	 * @see org.eclipse.gmf.mappings.CompartmentMapping#getParentNode
	 * @model opposite="parentNode" containment="true"
	 * @generated
	 */
	EList<CompartmentMapping> getCompartments();

} // NodeMapping
