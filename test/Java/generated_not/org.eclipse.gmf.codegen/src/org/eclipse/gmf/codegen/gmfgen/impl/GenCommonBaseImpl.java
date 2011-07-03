/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Common Base</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getDiagramRunTimeClass <em>Diagram Run Time Class</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getVisualID <em>Visual ID</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getElementType <em>Element Type</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getEditPartClassName <em>Edit Part Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getItemSemanticEditPolicyClassName <em>Item Semantic Edit Policy Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getNotationViewFactoryClassName <em>Notation View Factory Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getViewmap <em>Viewmap</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getStyles <em>Styles</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#getBehaviour <em>Behaviour</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl#isSansDomain <em>Sans Domain</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ abstract public class GenCommonBaseImpl extends EObjectImpl implements GenCommonBase {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    abstract public boolean isSansDomain ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    abstract public String getClassNamePrefix ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    final public String getClassNameSuffux () {
        return "";

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    final public String getUniqueIdentifier () {
        String prefixPart = isEmpty (getClassNamePrefix ()) ? DEFAULT_CLASS_NAME_PREFIX : getClassNamePrefix ();

        return prefixPart + '_' + getVisualID ();

    }

    /**
       * @generated NOT
       */
    public ViewmapLayoutType getLayoutType () {
        Viewmap viewmap = getViewmap ();

        return viewmap == null ? ViewmapLayoutType.UNKNOWN_LITERAL : viewmap.getLayoutType ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getEditPartQualifiedClassName () {
        return getDiagram ().getEditPartsPackageName () + '.' + getEditPartClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getItemSemanticEditPolicyQualifiedClassName () {
        return getDiagram ().getEditPoliciesPackageName () + '.' + getItemSemanticEditPolicyClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getNotationViewFactoryQualifiedClassName () {
        return getDiagram ().getNotationViewFactoriesPackageName () + '.' + getNotationViewFactoryClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    abstract public GenDiagram getDiagram ();

}

//GenCommonBaseImpl
