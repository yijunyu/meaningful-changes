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
   * A representation of the model object '<em><b>Figure Accessor</b></em>'.
   * <!-- end-user-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.gmfgraph.FigureAccessor#getAccessor <em>Accessor</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.FigureAccessor#getTypedFigure <em>Typed Figure</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigureAccessor()
   * @model
   * @generated
   */
public interface FigureAccessor extends EObject {
    /**
       * Returns the value of the '<em><b>Accessor</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Accessor</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Accessor</em>' attribute.
       * @see #setAccessor(String)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigureAccessor_Accessor()
       * @model required="true"
       * @generated
       */
    String getAccessor ();

    /**
       * Returns the value of the '<em><b>Typed Figure</b></em>' containment reference.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Typed Figure</em>' reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Typed Figure</em>' containment reference.
       * @see #setTypedFigure(RealFigure)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigureAccessor_TypedFigure()
       * @model containment="true" required="true"
       * @generated
       */
    RealFigure getTypedFigure ();

}

// FigureAccessor
