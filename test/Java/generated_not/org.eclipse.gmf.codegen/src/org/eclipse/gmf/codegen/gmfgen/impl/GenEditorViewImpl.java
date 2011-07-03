/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Editor View</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorViewImpl#getEditorGen <em>Editor Gen</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorViewImpl#getPackageName <em>Package Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorViewImpl#getActionBarContributorClassName <em>Action Bar Contributor Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorViewImpl#getClassName <em>Class Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorViewImpl#getIconPath <em>Icon Path</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorViewImpl#getIconPathX <em>Icon Path X</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorViewImpl#getID <em>ID</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorViewImpl#isEclipseEditor <em>Eclipse Editor</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorViewImpl#getContextID <em>Context ID</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenEditorViewImpl extends EObjectImpl implements GenEditorView {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getActionBarContributorQualifiedClassName () {
        return getPackageName () + '.' + getActionBarContributorClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getQualifiedClassName () {
        return getPackageName () + '.' + getClassName ();

    }

}

//GenEditorViewImpl
