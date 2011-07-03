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
   * A representation of the model object '<em><b>Real Figure</b></em>'.
   * <!-- end-user-doc -->
   *
   * <!-- begin-model-doc -->
   * This is exact/specific/concrete figure, unlike proxy/reference-nature FigureRef
   * <!-- end-model-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.gmfgraph.RealFigure#getName <em>Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.RealFigure#getChildren <em>Children</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getRealFigure()
   * @model abstract="true"
   * @generated
   */
public interface RealFigure extends AbstractFigure {
    /**
       * Returns the value of the '<em><b>Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Name</em>' attribute.
       * @see #setName(String)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getRealFigure_Name()
       * @model
       * @generated
       */
    String getName ();

    /**
       * Returns the value of the '<em><b>Children</b></em>' containment reference list.
       * The list contents are of type {@link org.eclipse.gmf.gmfgraph.Figure}.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Children</em>' containment reference list.
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getRealFigure_Children()
       * @model containment="true"
       * @generated
       */
    EList < Figure > getChildren ();

}

// RealFigure
