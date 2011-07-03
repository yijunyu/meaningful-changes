/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Link Constraints</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkConstraintsImpl#getLink <em>Link</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkConstraintsImpl#getSourceEnd <em>Source End</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkConstraintsImpl#getTargetEnd <em>Target End</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenLinkConstraintsImpl extends EObjectImpl implements GenLinkConstraints {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getLinkClass () {
        GenLink owningLink = getLink ();

        if (owningLink != null) {
            if (owningLink.getModelFacet () instanceof TypeLinkModelFacet) {
                TypeLinkModelFacet modelFacet = (TypeLinkModelFacet) owningLink.getModelFacet ();

                return modelFacet.getMetaClass ();

            }

        }

        return null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getSourceEndContextClass () {
        GenLink owningLink = getLink ();

        if (owningLink != null) {
            LinkModelFacet linkFacet = owningLink.getModelFacet ();

            if (linkFacet instanceof TypeLinkModelFacet) {
                TypeLinkModelFacet typeLinkModelFacet = (TypeLinkModelFacet) linkFacet;

                if (typeLinkModelFacet.getSourceMetaFeature () != null) {
                    return typeLinkModelFacet.getSourceMetaFeature ().getTypeGenClass ();

                }

                GenFeature metaFeature = ((TypeLinkModelFacet) linkFacet).getContainmentMetaFeature ();

                return (metaFeature != null) ? metaFeature.getGenClass () : null;

            }
            else if (linkFacet instanceof FeatureLinkModelFacet) {
                GenFeature metaFeature = ((FeatureLinkModelFacet) linkFacet).getMetaFeature ();

                return (metaFeature != null) ? metaFeature.getGenClass () : null;

            }

        }

        return null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getTargetEndContextClass () {
        GenLink owningLink = getLink ();

        if (owningLink != null) {
            LinkModelFacet linkFacet = owningLink.getModelFacet ();

            if (linkFacet instanceof TypeLinkModelFacet) {
                GenFeature targetFeature = ((TypeLinkModelFacet) linkFacet).getTargetMetaFeature ();

                return (targetFeature != null) ? targetFeature.getTypeGenClass () : null;

            }
            else if (linkFacet instanceof FeatureLinkModelFacet) {
                GenFeature metaFeature = ((FeatureLinkModelFacet) linkFacet).getMetaFeature ();

                return (metaFeature != null) ? metaFeature.getTypeGenClass () : null;

            }

        }

        return null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getConstraintsInstanceFieldName () {
        return (getLink () != null) ? getLink ().getUniqueIdentifier () : "";

    //$NON-NLS-1$ }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean isValid () {
        return getSourceEndContextClass () != null && getTargetEndContextClass () != null && (getSourceEnd () != null ||
          getTargetEnd () != null);

    }

}

//GenLinkConstraintsImpl
