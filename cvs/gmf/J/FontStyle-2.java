/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.FontStyle#getFaceName <em>Face Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFontStyle()
 * @model
 * @generated
 */
public interface FontStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Face Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Face Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face Name</em>' attribute.
	 * @see #setFaceName(String)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFontStyle_FaceName()
	 * @model
	 * @generated
	 */
	String getFaceName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.FontStyle#getFaceName <em>Face Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Face Name</em>' attribute.
	 * @see #getFaceName()
	 * @generated
	 */
	void setFaceName(String value);

} // FontStyle
