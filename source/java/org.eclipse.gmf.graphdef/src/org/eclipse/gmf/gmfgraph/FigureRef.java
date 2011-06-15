/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Need this to facilitate reuse of figures while keeping (so nice looking) containment relationship in the Figure class
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.FigureRef#getFigure <em>Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigureRef()
 * @model
 * @generated
 */
public interface FigureRef extends AbstractFigure {
	/**
	 * Returns the value of the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not just Figure because don't want to reference figure references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Figure</em>' reference.
	 * @see #setFigure(RealFigure)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigureRef_Figure()
	 * @model required="true"
	 * @generated
	 */
	RealFigure getFigure();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.FigureRef#getFigure <em>Figure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure</em>' reference.
	 * @see #getFigure()
	 * @generated
	 */
	void setFigure(RealFigure value);

} // FigureRef
