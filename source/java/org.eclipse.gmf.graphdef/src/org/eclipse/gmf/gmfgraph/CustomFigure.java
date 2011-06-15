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
 * A representation of the model object '<em><b>Custom Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Any figure class provided by some bundle
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.CustomFigure#getCustomChildren <em>Custom Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCustomFigure()
 * @model
 * @generated
 */
public interface CustomFigure extends RealFigure, CustomClass {
	/**
	 * Returns the value of the '<em><b>Custom Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.gmfgraph.FigureAccessor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Childrent enumerated with this feature are mere 'access points' to actual structure of the CustomFigure. They are not created, unlike those contained in regular Figure#children
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Children</em>' containment reference list.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCustomFigure_CustomChildren()
	 * @model containment="true"
	 * @generated
	 */
	EList<FigureAccessor> getCustomChildren();

} // CustomFigure
