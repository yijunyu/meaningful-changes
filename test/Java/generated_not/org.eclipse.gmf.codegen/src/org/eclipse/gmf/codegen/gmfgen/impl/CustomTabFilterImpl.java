/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Custom Tab Filter</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.CustomTabFilterImpl#getTab <em>Tab</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.CustomTabFilterImpl#getClassName <em>Class Name</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class CustomTabFilterImpl extends EObjectImpl implements CustomTabFilter {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getQualifiedClassName () {
        return getTab ().getSheet ().getEditorGen ().getEditor ().getPackageName () + '.' + getClassName ();

    }

}

//CustomTabFilterImpl
