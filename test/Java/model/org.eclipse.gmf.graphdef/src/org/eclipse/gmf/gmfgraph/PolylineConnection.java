/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.gmfgraph;

/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>Polyline Connection</b></em>'.
   * <!-- end-user-doc -->
   *
   * <!-- begin-model-doc -->
   * org.eclipse.draw2d.PolylineConnection
   * <!-- end-model-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.gmfgraph.PolylineConnection#getSourceDecoration <em>Source Decoration</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.PolylineConnection#getTargetDecoration <em>Target Decoration</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getPolylineConnection()
   * @model
   * @generated
   */
public interface PolylineConnection extends ConnectionFigure, Polyline {
    /**
       * Returns the value of the '<em><b>Source Decoration</b></em>' reference.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Source Decoration</em>' containment reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Source Decoration</em>' reference.
       * @see #setSourceDecoration(DecorationFigure)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getPolylineConnection_SourceDecoration()
       * @model
       * @generated
       */
    DecorationFigure getSourceDecoration ();

    /**
       * Returns the value of the '<em><b>Target Decoration</b></em>' reference.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Target Decoration</em>' containment reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Target Decoration</em>' reference.
       * @see #setTargetDecoration(DecorationFigure)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getPolylineConnection_TargetDecoration()
       * @model
       * @generated
       */
    DecorationFigure getTargetDecoration ();

}

// PolylineConnection
