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
   *   <li>{@link org.eclipse.gmf.gmfgraph.Node#getAffixedParentSide <em>Affixed Parent Side</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.Node#getContentPane <em>Content Pane</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getNode()
   * @model
   * @generated
   */
public interface Node extends AbstractNode {
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
    Direction getResizeConstraint ();

    /**
       * Returns the value of the '<em><b>Affixed Parent Side</b></em>' attribute.
       * The default value is <code>"NONE"</code>.
       * The literals are from the enumeration {@link org.eclipse.gmf.gmfgraph.Direction}.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Affixed Parent Side</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Affixed Parent Side</em>' attribute.
       * @see org.eclipse.gmf.gmfgraph.Direction
       * @see #setAffixedParentSide(Direction)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getNode_AffixedParentSide()
       * @model default="NONE"
       * @generated
       */
    Direction getAffixedParentSide ();

    /**
       * Returns the value of the '<em><b>Content Pane</b></em>' reference.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Content Pane</em>' reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Content Pane</em>' reference.
       * @see #setContentPane(ChildAccess)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getNode_ContentPane()
       * @model
       * @generated
       */
    ChildAccess getContentPane ();

}

// Node
