/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Preference Page</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPreferencePageImpl#getID <em>ID</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPreferencePageImpl#getName <em>Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPreferencePageImpl#getChildren <em>Children</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPreferencePageImpl#getParent <em>Parent</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ abstract public class GenPreferencePageImpl extends EObjectImpl implements GenPreferencePage {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenDiagram getDiagram () {
        if (getParent () != null) {
            return getParent ().getDiagram ();

        }

        if (eContainer () instanceof GenDiagram) {
            return (GenDiagram) eContainer ();

        }

        return null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    abstract public String getQualifiedClassName ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    abstract public String getClassName ();

}

//GenPreferencePageImpl
