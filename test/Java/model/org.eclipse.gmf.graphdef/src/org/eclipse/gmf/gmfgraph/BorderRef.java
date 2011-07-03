/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.gmfgraph;

/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>Border Ref</b></em>'.
   * <!-- end-user-doc -->
   *
   * <!-- begin-model-doc -->
   * Border reuse mechanism
   * <!-- end-model-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.gmfgraph.BorderRef#getActual <em>Actual</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getBorderRef()
   * @model
   * @generated
   */
public interface BorderRef extends Border {
    /**
       * Returns the value of the '<em><b>Actual</b></em>' reference.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * <!-- begin-model-doc -->
       * constraint: actual should not be another BorderRef
       * <!-- end-model-doc -->
       * @return the value of the '<em>Actual</em>' reference.
       * @see #setActual(Border)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getBorderRef_Actual()
       * @model required="true"
       * @generated
       */
    Border getActual ();

}

// BorderRef
