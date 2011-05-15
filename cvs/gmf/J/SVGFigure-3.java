/**
 * <copyright>
 * </copyright>
 *
 * $Id: SVGFigure.java,v 1.2 2008/08/04 12:45:55 dstadnik Exp $
 */
package org.eclipse.gmf.gmfgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVG Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.SVGFigure#getDocumentURI <em>Document URI</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.SVGFigure#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.SVGFigure#isSafeRendering <em>Safe Rendering</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getSVGFigure()
 * @model
 * @generated
 */
public interface SVGFigure extends RealFigure {
	/**
	 * Returns the value of the '<em><b>Document URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document URI</em>' attribute.
	 * @see #setDocumentURI(String)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getSVGFigure_DocumentURI()
	 * @model
	 * @generated
	 */
	String getDocumentURI();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.SVGFigure#getDocumentURI <em>Document URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document URI</em>' attribute.
	 * @see #getDocumentURI()
	 * @generated
	 */
	void setDocumentURI(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.gmfgraph.SVGProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getSVGFigure_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<SVGProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Safe Rendering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safe Rendering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe Rendering</em>' attribute.
	 * @see #setSafeRendering(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getSVGFigure_SafeRendering()
	 * @model
	 * @generated
	 */
	boolean isSafeRendering();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.SVGFigure#isSafeRendering <em>Safe Rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe Rendering</em>' attribute.
	 * @see #isSafeRendering()
	 * @generated
	 */
	void setSafeRendering(boolean value);

} // SVGFigure