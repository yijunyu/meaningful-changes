/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Application</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getEditorGen <em>Editor Gen</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getID <em>ID</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getTitle <em>Title</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getPackageName <em>Package Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getClassName <em>Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getWorkbenchAdvisorClassName <em>Workbench Advisor Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getWorkbenchWindowAdvisorClassName <em>Workbench Window Advisor Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getActionBarAdvisorClassName <em>Action Bar Advisor Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getPerspectiveClassName <em>Perspective Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getPerspectiveId <em>Perspective Id</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#isSupportFiles <em>Support Files</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getSharedContributionItems <em>Shared Contribution Items</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getMainMenu <em>Main Menu</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl#getMainToolBar <em>Main Tool Bar</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenApplicationImpl extends EObjectImpl implements GenApplication {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getWorkbenchAdvisorClassName () {
        return "DiagramEditorWorkbenchAdvisor";

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getWorkbenchWindowAdvisorClassName () {
        return "DiagramEditorWorkbenchWindowAdvisor";

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getActionBarAdvisorClassName () {
        return "DiagramEditorActionBarAdvisor";

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getPerspectiveClassName () {
        return "DiagramEditorPerspective";

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getQualifiedClassName () {
        return getPackageName () + '.' + getClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getWorkbenchAdvisorQualifiedClassName () {
        return getPackageName () + '.' + getWorkbenchAdvisorClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getWorkbenchWindowAdvisorQualifiedClassName () {
        return getPackageName () + '.' + getWorkbenchWindowAdvisorClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getActionBarAdvisorQualifiedClassName () {
        return getPackageName () + '.' + getActionBarAdvisorClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getPerspectiveQualifiedClassName () {
        return getPackageName () + '.' + getPerspectiveClassName ();

    }

}

//GenApplicationImpl
