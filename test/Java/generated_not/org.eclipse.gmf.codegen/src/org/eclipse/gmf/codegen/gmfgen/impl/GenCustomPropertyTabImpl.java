/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Custom Property Tab</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCustomPropertyTabImpl#getClassName <em>Class Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCustomPropertyTabImpl#getFilter <em>Filter</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenCustomPropertyTabImpl extends GenPropertyTabImpl implements GenCustomPropertyTab {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getQualifiedClassName () {
        return getSheet ().getPackageName () + '.' + getClassName ();

    }

}

//GenCustomPropertyTabImpl
