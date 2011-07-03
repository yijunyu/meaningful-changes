/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Dynamic Model Access</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.DynamicModelAccessImpl#getEditorGen <em>Editor Gen</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.DynamicModelAccessImpl#getPackageName <em>Package Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.DynamicModelAccessImpl#getClassName <em>Class Name</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class DynamicModelAccessImpl extends EObjectImpl implements DynamicModelAccess {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getQualifiedClassName () {
        return getPackageName () + '.' + getClassName ();

    }

}

//DynamicModelAccessImpl
