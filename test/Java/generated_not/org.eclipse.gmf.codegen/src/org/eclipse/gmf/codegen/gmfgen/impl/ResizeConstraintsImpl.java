/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Resize Constraints</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ResizeConstraintsImpl#getResizeHandles <em>Resize Handles</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ResizeConstraintsImpl#getNonResizeHandles <em>Non Resize Handles</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ResizeConstraintsImpl#getResizeHandleNames <em>Resize Handle Names</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ResizeConstraintsImpl#getNonResizeHandleNames <em>Non Resize Handle Names</em>}</li>

   * </ul>
   * </p>
   *
   * @generated
   */ public class ResizeConstraintsImpl extends EObjectImpl implements ResizeConstraints {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < String > getResizeHandleNames () {
        return getPositionConstantNames (getResizeHandles ());

    }

    /**
       * <!-- begin-user-doc -->
       * XXX Actually, we make no use of non-resize handles, perhaps, should remove them
       * from model (to use them, need to override method createSelectionHandles() in editPolicy
       * class returned from getPrimaryDragEditPolicy, and use NonResizableHandleKit.addHandle.
       * It's too much code (which is different from simple setResizeDirections(int), thus, not supported, at least now
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < String > getNonResizeHandleNames () {
        return getPositionConstantNames (getNonResizeHandles ());

    }

}

//ResizeConstraintsImpl
