/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Canvas#getFigures <em>Figures</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Canvas#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Canvas#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Canvas#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Canvas#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCanvas()
 * @model
 * @generated
 */
public interface Canvas extends Identity {
	/**
	 * Returns the value of the '<em><b>Figures</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.gmfgraph.FigureGallery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * containment here doesn't restrict nodes/connection from using figure galeries defined elsewhere. No assumption should be made whether or not node/connection figure is defined in the galery beloning to this canvas
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Figures</em>' containment reference list.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCanvas_Figures()
	 * @model type="org.eclipse.gmf.gmfgraph.FigureGallery" containment="true"
	 * @generated
	 */
	EList getFigures();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.gmfgraph.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCanvas_Nodes()
	 * @model type="org.eclipse.gmf.gmfgraph.Node" containment="true"
	 * @generated
	 */
	EList getNodes();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.gmfgraph.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCanvas_Connections()
	 * @model type="org.eclipse.gmf.gmfgraph.Connection" containment="true"
	 * @generated
	 */
	EList getConnections();

	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.gmfgraph.Compartment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' containment reference list.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCanvas_Compartments()
	 * @model type="org.eclipse.gmf.gmfgraph.Compartment" containment="true"
	 * @generated
	 */
	EList getCompartments();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.gmfgraph.DiagramLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCanvas_Labels()
	 * @model type="org.eclipse.gmf.gmfgraph.DiagramLabel" containment="true"
	 * @generated
	 */
	EList getLabels();

} // Canvas
