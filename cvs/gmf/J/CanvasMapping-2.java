/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.diadef.Canvas;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.CanvasMapping#getDiagramCanvas <em>Diagram Canvas</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.CanvasMapping#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.CanvasMapping#getDomainMetaElement <em>Domain Meta Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getCanvasMapping()
 * @model
 * @generated
 */
public interface CanvasMapping extends MappingEntry{
	/**
	 * Returns the value of the '<em><b>Diagram Canvas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Canvas</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Canvas</em>' reference.
	 * @see #setDiagramCanvas(Canvas)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getCanvasMapping_DiagramCanvas()
	 * @model required="true"
	 * @generated
	 */
	Canvas getDiagramCanvas();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.CanvasMapping#getDiagramCanvas <em>Diagram Canvas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Canvas</em>' reference.
	 * @see #getDiagramCanvas()
	 * @generated
	 */
	void setDiagramCanvas(Canvas value);

	/**
	 * Returns the value of the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model</em>' reference.
	 * @see #setDomainModel(EPackage)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getCanvasMapping_DomainModel()
	 * @model
	 * @generated
	 */
	EPackage getDomainModel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.CanvasMapping#getDomainModel <em>Domain Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model</em>' reference.
	 * @see #getDomainModel()
	 * @generated
	 */
	void setDomainModel(EPackage value);

	/**
	 * Returns the value of the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Meta Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Meta Element</em>' reference.
	 * @see #setDomainMetaElement(EClass)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getCanvasMapping_DomainMetaElement()
	 * @model
	 * @generated
	 */
	EClass getDomainMetaElement();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.CanvasMapping#getDomainMetaElement <em>Domain Meta Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Meta Element</em>' reference.
	 * @see #getDomainMetaElement()
	 * @generated
	 */
	void setDomainMetaElement(EClass value);

} // CanvasMapping
