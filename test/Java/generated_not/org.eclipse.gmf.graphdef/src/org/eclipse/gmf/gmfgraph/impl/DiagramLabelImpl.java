/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.gmfgraph.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Diagram Label</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.DiagramLabelImpl#isElementIcon <em>Element Icon</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.DiagramLabelImpl#getAccessor <em>Accessor</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.DiagramLabelImpl#getContainer <em>Container</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.DiagramLabelImpl#isExternal <em>External</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class DiagramLabelImpl extends NodeImpl implements DiagramLabel {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean isExternal () {
        ChildAccess labelAccessor = getAccessor ();

        return labelAccessor == null;

    }

}

//DiagramLabelImpl
