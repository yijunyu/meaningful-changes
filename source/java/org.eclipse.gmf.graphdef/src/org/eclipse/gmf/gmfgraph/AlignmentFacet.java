/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alignment Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Makes sense for DiagramLabels of Links only (now). Constants from {@link org.eclipse.draw2d.ConnectionLocator} are: MIDDLE = Alignment.CENTER, TARGET = Alignment.END, SOURCE = Alignment.BEGINNING
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.AlignmentFacet#getAlignment <em>Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getAlignmentFacet()
 * @model
 * @generated
 */
public interface AlignmentFacet extends VisualFacet {
	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.gmfgraph.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see #setAlignment(Alignment)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getAlignmentFacet_Alignment()
	 * @model
	 * @generated
	 */
	Alignment getAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.AlignmentFacet#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(Alignment value);

} // AlignmentFacet
