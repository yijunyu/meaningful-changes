/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.Mapping#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.Mapping#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.Mapping#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.Mapping#getToolGroups <em>Tool Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject{
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.NodeMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMapping_Nodes()
	 * @model type="org.eclipse.gmf.mappings.NodeMapping" containment="true" resolveProxies="false" required="true"
	 * @generated
	 */
	EList getNodes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.LinkMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMapping_Links()
	 * @model type="org.eclipse.gmf.mappings.LinkMapping" containment="true" resolveProxies="false"
	 * @generated
	 */
	EList getLinks();

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' containment reference.
	 * @see #setDiagram(CanvasMapping)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMapping_Diagram()
	 * @model containment="true" resolveProxies="false" required="true"
	 * @generated
	 */
	CanvasMapping getDiagram();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.Mapping#getDiagram <em>Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' containment reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(CanvasMapping value);

	/**
	 * Returns the value of the '<em><b>Tool Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.ToolGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Groups</em>' containment reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMapping_ToolGroups()
	 * @model type="org.eclipse.gmf.mappings.ToolGroup" containment="true"
	 * @generated
	 */
	EList getToolGroups();

} // Mapping
