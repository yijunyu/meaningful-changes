/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.gmfgraph.DiagramLabel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Label definition; text is taken from the graph model; no editing support; user may contribute custom parser
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.LabelMapping#getDiagramLabel <em>Diagram Label</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LabelMapping#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LabelMapping#getMapEntry <em>Map Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping()
 * @model
 * @generated
 */
public interface LabelMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagram Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Label</em>' reference.
	 * @see #setDiagramLabel(DiagramLabel)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping_DiagramLabel()
	 * @model required="true"
	 * @generated
	 */
	DiagramLabel getDiagramLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LabelMapping#getDiagramLabel <em>Diagram Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Label</em>' reference.
	 * @see #getDiagramLabel()
	 * @generated
	 */
	void setDiagramLabel(DiagramLabel value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping_ReadOnly()
	 * @model
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LabelMapping#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Map Entry</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.MappingEntry#getLabelMappings <em>Label Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Entry</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Entry</em>' container reference.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping_MapEntry()
	 * @see org.eclipse.gmf.mappings.MappingEntry#getLabelMappings
	 * @model opposite="labelMappings" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	MappingEntry getMapEntry();

} // LabelMapping
