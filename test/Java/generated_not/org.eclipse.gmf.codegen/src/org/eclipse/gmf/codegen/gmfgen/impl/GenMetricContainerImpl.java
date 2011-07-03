/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Metric Container</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenMetricContainerImpl#getEditorGen <em>Editor Gen</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenMetricContainerImpl#getMetrics <em>Metrics</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenMetricContainerImpl extends EObjectImpl implements GenMetricContainer {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public Set < GenPackage > getAllTargetedModelPackages () {
        HashSet < GenPackage > packages = new HashSet < GenPackage > ();

        for (GenMetricRule nextRule : getMetrics ()) {
            if (nextRule.getTarget () != null && nextRule.getTarget ().getContext () != null) {
                packages.add (nextRule.getTarget ().getContext ().getGenPackage ());
            }

        }

        return packages;

    }

}

//GenMetricContainerImpl
