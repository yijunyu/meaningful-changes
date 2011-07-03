/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Type Link Model Facet</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeLinkModelFacetImpl#getSourceMetaFeature <em>Source Meta Feature</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeLinkModelFacetImpl#getTargetMetaFeature <em>Target Meta Feature</em>}</li>

   * </ul>
   * </p>
   *
   * @generated
   */ public class TypeLinkModelFacetImpl extends TypeModelFacetImpl implements TypeLinkModelFacet {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getSourceType () {
        if (getSourceMetaFeature () != null) {
            return getSourceMetaFeature ().getTypeGenClass ();

        }
        else if (getChildMetaFeature () != null) {
            return getChildMetaFeature ().getGenClass ();

        }

        // child feature defaults to be equal to containment, so if child == null, no reason to check containment return null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getTargetType () {
        if (getTargetMetaFeature () != null) {
            return getTargetMetaFeature ().getTypeGenClass ();

        }

        return null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < GenClass > getAssistantSourceTypes () {
        // TODO: Modify this method in accordance on implementing // AssistantProvider.BasicEList < GenClass > sources = new
          BasicEList < GenClass > ();

        GenClass sourceType = getSourceType ();

        if (sourceType != null) {
            sources.add (sourceType);
        }

        return sources;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < GenClass > getAssistantTargetTypes () {
        // TODO: Modify this method in accordance on implementing // AssistantProvider.BasicEList < GenClass > targets = new
          BasicEList < GenClass > ();

        GenClass targetType = getTargetType ();

        if (targetType != null) {
            targets.add (targetType);
        }

        return targets;

    }

}

//TypeLinkModelFacetImpl
