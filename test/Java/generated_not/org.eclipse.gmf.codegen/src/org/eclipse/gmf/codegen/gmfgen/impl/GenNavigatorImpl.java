/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Navigator</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#isGenerateDomainModelNavigator <em>Generate Domain Model Navigator</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainContentExtensionID <em>Domain Content Extension ID</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainContentExtensionName <em>Domain Content Extension Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainContentExtensionPriority <em>Domain Content Extension Priority</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainContentProviderClassName <em>Domain Content Provider Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainLabelProviderClassName <em>Domain Label Provider Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainModelElementTesterClassName <em>Domain Model Element Tester Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getDomainNavigatorItemClassName <em>Domain Navigator Item Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getEditorGen <em>Editor Gen</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getContentExtensionID <em>Content Extension ID</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getContentExtensionName <em>Content Extension Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getContentExtensionPriority <em>Content Extension Priority</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getLinkHelperExtensionID <em>Link Helper Extension ID</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getSorterExtensionID <em>Sorter Extension ID</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getActionProviderID <em>Action Provider ID</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getContentProviderClassName <em>Content Provider Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getLabelProviderClassName <em>Label Provider Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getLinkHelperClassName <em>Link Helper Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getSorterClassName <em>Sorter Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getActionProviderClassName <em>Action Provider Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getAbstractNavigatorItemClassName <em>Abstract Navigator Item Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getNavigatorGroupClassName <em>Navigator Group Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getNavigatorItemClassName <em>Navigator Item Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getUriInputTesterClassName <em>Uri Input Tester Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getPackageName <em>Package Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl#getChildReferences <em>Child References</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenNavigatorImpl extends EObjectImpl implements GenNavigator {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getContentProviderQualifiedClassName () {
        return getPackageName () + '.' + getContentProviderClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getLabelProviderQualifiedClassName () {
        return getPackageName () + '.' + getLabelProviderClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getLinkHelperQualifiedClassName () {
        return getPackageName () + '.' + getLinkHelperClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getSorterQualifiedClassName () {
        return getPackageName () + '.' + getSorterClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getActionProviderQualifiedClassName () {
        return getPackageName () + '.' + getActionProviderClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getAbstractNavigatorItemQualifiedClassName () {
        return getPackageName () + '.' + getAbstractNavigatorItemClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getNavigatorGroupQualifiedClassName () {
        return getPackageName () + '.' + getNavigatorGroupClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getNavigatorItemQualifiedClassName () {
        return getPackageName () + '.' + getNavigatorItemClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getUriInputTesterQualifiedClassName () {
        return getEditorGen ().getEditor ().getPackageName () + '.' + getUriInputTesterClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getDomainContentProviderQualifiedClassName () {
        return getPackageName () + '.' + getDomainContentProviderClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getDomainLabelProviderQualifiedClassName () {
        return getPackageName () + '.' + getDomainLabelProviderClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getDomainModelElementTesterQualifiedClassName () {
        return getEditorGen ().getEditor ().getPackageName () + '.' + getDomainModelElementTesterClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getDomainNavigatorItemQualifiedClassName () {
        return getPackageName () + '.' + getDomainNavigatorItemClassName ();

    }

}

//GenNavigatorImpl
