/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.internal.bridge.trace.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Node Trace</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>

   *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.GenNodeTraceImpl#getNodeLabelTraces <em>Node Label Traces</em>}</li>


   *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.GenNodeTraceImpl#getCompartmentTraces <em>Compartment Traces</em>}</li>

   * </ul>
   * </p>
   *
   * @generated
   */ public class GenNodeTraceImpl extends MatchingTraceImpl implements GenNodeTrace {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void setContext (GenNode genNode) {
        StringBuffer query = new StringBuffer ();

        if (genNode.getModelFacet () != null) {
            TypeModelFacet modelFacet = genNode.getModelFacet ();

            query.append ("let _eClass_:ecore::EClass = modelFacet.metaClass.ecoreClass in ");
            query.append (getEClassComparision ("_eClass_", modelFacet.getMetaClass ().getEcoreClass ()));
            if (modelFacet.getContainmentMetaFeature () != null) {
                query.insert (0, "(");
                query.append (
                  ") and (let _containmentMF_:ecore::EStructuralFeature = modelFacet.containmentMetaFeature.ecoreFeature in ");
                query.append (getEStructuralFeatureComparison ("_containmentMF_", modelFacet.getContainmentMetaFeature ().
                  getEcoreFeature ()));
                query.append (")");
                if (modelFacet.getContainmentMetaFeature () != modelFacet.getChildMetaFeature ()) {
                    query.append (
                      " and ( let _childMF_:ecore::EStructuralFeature = modelFacet.childMetaFeature.ecoreFeature in ");
                    query.append (getEStructuralFeatureComparison ("_childMF_", modelFacet.getChildMetaFeature ().
                      getEcoreFeature ()));
                    query.append (")");
                }

            }

        }
        else {
            query.append ("modelFacet = null");
        }

        setQueryText (query.toString ());
    }

}

//GenNodeTraceImpl
