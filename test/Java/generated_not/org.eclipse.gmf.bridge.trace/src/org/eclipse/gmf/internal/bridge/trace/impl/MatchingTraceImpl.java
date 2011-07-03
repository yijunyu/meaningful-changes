/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.internal.bridge.trace.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Matching Trace</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.MatchingTraceImpl#getQueryText <em>Query Text</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ abstract public class MatchingTraceImpl extends AbstractTraceImpl implements MatchingTrace {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    abstract public EClass getQueryContext ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getEClassComparision (String varName, EClass eClass) {
        StringBuffer result = new StringBuffer ();

        result.append (varName);
        result.append (".ePackage.nsURI = '");
        result.append (eClass.getEPackage ().getNsURI ());
        result.append ("' and ");
        result.append (varName);
        result.append (".name = '");
        result.append (eClass.getName ());
        result.append ("'");
        return result.toString ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getEStructuralFeatureComparison (String varName, EStructuralFeature feature) {
        StringBuffer result = new StringBuffer ();

        result.append ("(let _eClass_:ecore::EClass = ");
        result.append (varName);
        result.append (".eContainingClass in ");
        result.append (getEClassComparision ("_eClass_", feature.getEContainingClass ()));
        result.append (") and ");
        result.append (varName);
        result.append (".name = '");
        result.append (feature.getName ());
        result.append ("'");
        return result.toString ();

    }

}

//MatchingTraceImpl
