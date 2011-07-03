/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.internal.bridge.trace.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Link Trace</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>

   *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.GenLinkTraceImpl#getLinkLabelTraces <em>Link Label Traces</em>}</li>

   * </ul>
   * </p>
   *
   * @generated
   */ public class GenLinkTraceImpl extends MatchingTraceImpl implements GenLinkTrace {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void setContext (GenLink genLink) {
        StringBuffer result = new StringBuffer ();

        if (genLink.getModelFacet () instanceof FeatureLinkModelFacet) {
            EStructuralFeature feature = ((FeatureLinkModelFacet) genLink.getModelFacet ()).getMetaFeature ().getEcoreFeature (
              );

            result.append ("modelFacet.oclIsKindOf(gmfgen::FeatureLinkModelFacet) and ");
            result.append (
   "(let _feature_:ecore::EStructuralFeature = modelFacet.oclAsType(gmfgen::FeatureLinkModelFacet).metaFeature.ecoreFeature in "
              );
            result.append (getEStructuralFeatureComparison ("_feature_", feature));
            result.append (")");
        }
        else if (genLink.getModelFacet () instanceof TypeLinkModelFacet) {
            EClass eClass = ((TypeLinkModelFacet) genLink.getModelFacet ()).getMetaClass ().getEcoreClass ();

            result.append ("modelFacet.oclIsKindOf(gmfgen::TypeLinkModelFacet) and ");
            result.append (
              "(let _eClass_:ecore::EClass = modelFacet.oclAsType(gmfgen::TypeLinkModelFacet).metaClass.ecoreClass in ");
            result.append (getEClassComparision ("_eClass_", eClass));
            result.append (")");
        }
        else if (genLink.getModelFacet () == null) {
            result.append ("modelFacet = null");
        }
        else {
            throw new IllegalArgumentException ("Incorrect gen link passed - Feature/TypeLinkModelFacet should be used");

        }

        setQueryText (result.toString ());
    }

}

//GenLinkTraceImpl
