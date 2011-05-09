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
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.DiagramElement#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.DiagramElement#getFacets <em>Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends Identity {
	/**
	 * Returns the value of the '<em><b>Figure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.gmfgraph.FigureHandle#getReferencingElements <em>Referencing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure</em>' reference.
	 * @see #setFigure(FigureHandle)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDiagramElement_Figure()
	 * @see org.eclipse.gmf.gmfgraph.FigureHandle#getReferencingElements
	 * @model opposite="referencingElements" required="true"
	 * @generated
	 */
	FigureHandle getFigure();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.DiagramElement#getFigure <em>Figure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure</em>' reference.
	 * @see #getFigure()
	 * @generated
	 */
	void setFigure(FigureHandle value);

	/**
	 * Returns the value of the '<em><b>Facets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.gmfgraph.VisualFacet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * anything to further specify constraint or any other aspect of the element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facets</em>' containment reference list.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDiagramElement_Facets()
	 * @model type="org.eclipse.gmf.gmfgraph.VisualFacet" containment="true"
	 * @generated
	 */
	EList<VisualFacet> getFacets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * utility operation to get first visual facet assignable (in Java terms, {@link Class#isAssignableFrom(Class)}) to variables of designated class. Argument can't be null
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	VisualFacet find(Class facetClass);

} // DiagramElement
