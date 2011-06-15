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
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * org.eclipse.draw2d.Shape
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Shape#isOutline <em>Outline</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Shape#isFill <em>Fill</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Shape#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Shape#getLineKind <em>Line Kind</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Shape#isXorFill <em>Xor Fill</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Shape#isXorOutline <em>Xor Outline</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Shape#getResolvedChildren <em>Resolved Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends RealFigure {
	/**
	 * Returns the value of the '<em><b>Outline</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline</em>' attribute.
	 * @see #setOutline(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getShape_Outline()
	 * @model default="true"
	 * @generated
	 */
	boolean isOutline();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Shape#isOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline</em>' attribute.
	 * @see #isOutline()
	 * @generated
	 */
	void setOutline(boolean value);

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see #setFill(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getShape_Fill()
	 * @model default="true"
	 * @generated
	 */
	boolean isFill();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Shape#isFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #isFill()
	 * @generated
	 */
	void setFill(boolean value);

	/**
	 * Returns the value of the '<em><b>Line Width</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Width</em>' attribute.
	 * @see #setLineWidth(int)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getShape_LineWidth()
	 * @model default="1"
	 * @generated
	 */
	int getLineWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Shape#getLineWidth <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Width</em>' attribute.
	 * @see #getLineWidth()
	 * @generated
	 */
	void setLineWidth(int value);

	/**
	 * Returns the value of the '<em><b>Line Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.gmfgraph.LineKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Kind</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.LineKind
	 * @see #setLineKind(LineKind)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getShape_LineKind()
	 * @model
	 * @generated
	 */
	LineKind getLineKind();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Shape#getLineKind <em>Line Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Kind</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.LineKind
	 * @see #getLineKind()
	 * @generated
	 */
	void setLineKind(LineKind value);

	/**
	 * Returns the value of the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xor Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xor Fill</em>' attribute.
	 * @see #setXorFill(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getShape_XorFill()
	 * @model
	 * @generated
	 */
	boolean isXorFill();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Shape#isXorFill <em>Xor Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xor Fill</em>' attribute.
	 * @see #isXorFill()
	 * @generated
	 */
	void setXorFill(boolean value);

	/**
	 * Returns the value of the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xor Outline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xor Outline</em>' attribute.
	 * @see #setXorOutline(boolean)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getShape_XorOutline()
	 * @model
	 * @generated
	 */
	boolean isXorOutline();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Shape#isXorOutline <em>Xor Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xor Outline</em>' attribute.
	 * @see #isXorOutline()
	 * @generated
	 */
	void setXorOutline(boolean value);

	/**
	 * Returns the value of the '<em><b>Resolved Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.gmfgraph.Figure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Same as children, but resolves child FigureRefs, if any, to Figures
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolved Children</em>' reference list.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getShape_ResolvedChildren()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Figure> getResolvedChildren();

} // Shape
