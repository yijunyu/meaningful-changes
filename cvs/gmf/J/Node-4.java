/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.Node#getResizeConstraint <em>Resize Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Resize Constraint</b></em>' attribute.
	 * The default value is <code>"NSEW"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.gmfgraph.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resize Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resize Constraint</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Direction
	 * @see #setResizeConstraint(Direction)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getNode_ResizeConstraint()
	 * @model default="NSEW"
	 * @generated
	 */
	Direction getResizeConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.Node#getResizeConstraint <em>Resize Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resize Constraint</em>' attribute.
	 * @see org.eclipse.gmf.gmfgraph.Direction
	 * @see #getResizeConstraint()
	 * @generated
	 */
	void setResizeConstraint(Direction value);

} // Node
