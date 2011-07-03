/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Diagram Element Target</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramElementTargetImpl#getElement <em>Element</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenDiagramElementTargetImpl extends GenAuditableImpl implements GenDiagramElementTarget {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClassifier getContext () {
        if (getElement ().isEmpty ()) {
            return null;

        }

        return getElement ().get (0).getDiagramRunTimeClass ();

    }

}

//GenDiagramElementTargetImpl
