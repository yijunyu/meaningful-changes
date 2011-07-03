/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.gmfgraph;

/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>Line Border</b></em>'.
   * <!-- end-user-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.gmfgraph.LineBorder#getColor <em>Color</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.LineBorder#getWidth <em>Width</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getLineBorder()
   * @model
   * @generated
   */
public interface LineBorder extends Border {
    /**
       * Returns the value of the '<em><b>Color</b></em>' containment reference.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Color</em>' containment reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Color</em>' containment reference.
       * @see #setColor(Color)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getLineBorder_Color()
       * @model containment="true"
       * @generated
       */
    Color getColor ();

    /**
       * Returns the value of the '<em><b>Width</b></em>' attribute.
       * The default value is <code>"1"</code>.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Width</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Width</em>' attribute.
       * @see #setWidth(int)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getLineBorder_Width()
       * @model default="1"
       * @generated
       */
    int getWidth ();

}

// LineBorder
