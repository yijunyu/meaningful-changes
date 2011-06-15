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
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Dimension#getDx <em>Dx</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Dimension#getDy <em>Dy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dx</em>' attribute.
	 * @see #setDx(int)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDimension_Dx()
	 * @model
	 * @generated
	 */
	int getDx();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Dimension#getDx <em>Dx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dx</em>' attribute.
	 * @see #getDx()
	 * @generated
	 */
	void setDx(int value);

	/**
	 * Returns the value of the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dy</em>' attribute.
	 * @see #setDy(int)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDimension_Dy()
	 * @model
	 * @generated
	 */
	int getDy();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Dimension#getDy <em>Dy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dy</em>' attribute.
	 * @see #getDy()
	 * @generated
	 */
	void setDy(int value);

} // Dimension
