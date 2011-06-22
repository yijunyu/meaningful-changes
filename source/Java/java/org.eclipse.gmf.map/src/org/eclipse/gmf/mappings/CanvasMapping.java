/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.tooldef.MainMenu;
import org.eclipse.gmf.tooldef.Palette;
import org.eclipse.gmf.tooldef.Toolbar;

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
 *   <li>{@link org.eclipse.gmf.mappings.CanvasMapping#getPalette <em>Palette</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.CanvasMapping#getMenuContributions <em>Menu Contributions</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.CanvasMapping#getToolbarContributions <em>Toolbar Contributions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getCanvasMapping()
 * @model
 * @generated
 */
public interface CanvasMapping extends EObject {
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
	 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not domainMetaElement.oclIsUndefined() implies not(domainMetaElement.abstract or domainMetaElement.interface)' description='Top-level diagram container must be concrete'"
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

	/**
	 * Returns the value of the '<em><b>Palette</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palette</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette</em>' reference.
	 * @see #setPalette(Palette)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getCanvasMapping_Palette()
	 * @model
	 * @generated
	 */
	Palette getPalette();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.CanvasMapping#getPalette <em>Palette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette</em>' reference.
	 * @see #getPalette()
	 * @generated
	 */
	void setPalette(Palette value);

	/**
	 * Returns the value of the '<em><b>Menu Contributions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.tooldef.MainMenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Contributions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Contributions</em>' reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getCanvasMapping_MenuContributions()
	 * @model
	 * @generated
	 */
	EList<MainMenu> getMenuContributions();

	/**
	 * Returns the value of the '<em><b>Toolbar Contributions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.tooldef.Toolbar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toolbar Contributions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolbar Contributions</em>' reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getCanvasMapping_ToolbarContributions()
	 * @model
	 * @generated
	 */
	EList<Toolbar> getToolbarContributions();

} // CanvasMapping
