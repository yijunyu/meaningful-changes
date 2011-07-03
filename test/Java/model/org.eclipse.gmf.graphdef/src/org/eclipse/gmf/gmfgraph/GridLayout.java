/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.gmfgraph;

/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>Grid Layout</b></em>'.
   * <!-- end-user-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.gmfgraph.GridLayout#getNumColumns <em>Num Columns</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.GridLayout#isEqualWidth <em>Equal Width</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.GridLayout#getMargins <em>Margins</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.GridLayout#getSpacing <em>Spacing</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayout()
   * @model
   * @generated
   */
public interface GridLayout extends Layout {
    /**
       * Returns the value of the '<em><b>Num Columns</b></em>' attribute.
       * The default value is <code>"1"</code>.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Num Columns</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Num Columns</em>' attribute.
       * @see #setNumColumns(int)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayout_NumColumns()
       * @model default="1" required="true"
       * @generated
       */
    int getNumColumns ();

    /**
       * Returns the value of the '<em><b>Equal Width</b></em>' attribute.
       * The default value is <code>"true"</code>.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Equal Width</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Equal Width</em>' attribute.
       * @see #setEqualWidth(boolean)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayout_EqualWidth()
       * @model default="true" required="true"
       * @generated
       */
    boolean isEqualWidth ();

    /**
       * Returns the value of the '<em><b>Margins</b></em>' containment reference.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Margins</em>' containment reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Margins</em>' containment reference.
       * @see #setMargins(Dimension)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayout_Margins()
       * @model containment="true"
       * @generated
       */
    Dimension getMargins ();

    /**
       * Returns the value of the '<em><b>Spacing</b></em>' containment reference.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Spacing</em>' containment reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Spacing</em>' containment reference.
       * @see #setSpacing(Dimension)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getGridLayout_Spacing()
       * @model containment="true"
       * @generated
       */
    Dimension getSpacing ();

}

// GridLayout
