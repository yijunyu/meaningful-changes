/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Feature Link Model Facet</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureLinkModelFacetImpl#getMetaFeature <em>Meta Feature</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class FeatureLinkModelFacetImpl extends EObjectImpl implements FeatureLinkModelFacet {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getSourceType () {
        if (getMetaFeature () != null) {
            return getMetaFeature ().getGenClass ();

        }

        return null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getTargetType () {
        if (getMetaFeature () != null) {
            return getMetaFeature ().getTypeGenClass ();

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

//FeatureLinkModelFacetImpl
