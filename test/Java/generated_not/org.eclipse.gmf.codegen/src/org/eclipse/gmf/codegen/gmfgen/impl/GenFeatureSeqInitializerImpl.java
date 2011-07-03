/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Feature Seq Initializer</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureSeqInitializerImpl#getTypeModelFacet <em>Type Model Facet</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureSeqInitializerImpl#getInitializers <em>Initializers</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureSeqInitializerImpl#getElementClass <em>Element Class</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureSeqInitializerImpl#getCreatingInitializer <em>Creating Initializer</em>}</li>

   * </ul>
   * </p>
   *
   * @generated
   */ public class GenFeatureSeqInitializerImpl extends EObjectImpl implements GenFeatureSeqInitializer {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getElementClass () {
        if (getCreatingInitializer () == null) {
            return (getTypeModelFacet () != null) ? getTypeModelFacet ().getMetaClass () : null;

        }

        GenClass genClass = getElementClassGen ();

        if (genClass != null) {
            return genClass;

        }

        return (getCreatingInitializer ().getFeature () != null) ? getCreatingInitializer ().getFeature ().getTypeGenClass () :
          null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public TypeModelFacet basicGetTypeModelFacet () {
        EObject container = eContainer ();

        while (container != null && ! (container instanceof TypeModelFacet)) {
            container = container.eContainer ();
        }

        return (container != null) ? (TypeModelFacet) container : null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void setElementClass (GenClass newElementClass) {
        if (getCreatingInitializer () == null && eContainer () != null) {
            return;

        }

        setElementClassGen (newElementClass);
    }

}

//GenFeatureSeqInitializerImpl
