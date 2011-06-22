/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Size Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.DefaultSizeFacet#getDefaultSize <em>Default Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDefaultSizeFacet()
 * @model
 * @generated
 */
public interface DefaultSizeFacet extends VisualFacet {
	/**
	 * Returns the value of the '<em><b>Default Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Size</em>' containment reference.
	 * @see #setDefaultSize(Dimension)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDefaultSizeFacet_DefaultSize()
	 * @model containment="true"
	 * @generated
	 */
	Dimension getDefaultSize();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.DefaultSizeFacet#getDefaultSize <em>Default Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Size</em>' containment reference.
	 * @see #getDefaultSize()
	 * @generated
	 */
	void setDefaultSize(Dimension value);

} // DefaultSizeFacet
