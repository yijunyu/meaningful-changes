/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Audited Metric Target</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditedMetricTargetImpl#getMetric <em>Metric</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditedMetricTargetImpl#getMetricValueContext <em>Metric Value Context</em>}</li>

   * </ul>
   * </p>
   *
   * @generated
   */ public class GenAuditedMetricTargetImpl extends GenAuditableImpl implements GenAuditedMetricTarget {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClassifier getContext () {
        return getMetricValueContext ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getTargetClass () {
        if (getMetric () == null || getMetric ().getTarget () == null) {
            return null;

        }

        GenClassifier genClassifier = getMetric ().getTarget ().getContext ();

        return (genClassifier instanceof GenClass) ? (GenClass) genClassifier : null;

    }

}

//GenAuditedMetricTargetImpl
