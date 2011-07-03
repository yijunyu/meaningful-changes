/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Auditable</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditableImpl#getContextSelector <em>Context Selector</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ abstract public class GenAuditableImpl extends EObjectImpl implements GenAuditable {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    abstract public GenClassifier getContext ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getTargetClass () {
        if (getContext () instanceof GenClass) {
            return (GenClass) getContext ();

        }

        return null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getTargetClassModelQualifiedName () {
        if (getTargetClass () == null || getTargetClass ().getGenPackage () == null) {
            return null;

        }

        LinkedList < String > packageNames = new LinkedList < String > ();

        for (GenPackage genPackage = getTargetClass ().getGenPackage ();
        genPackage != null;) {
            packageNames.addFirst (genPackage.getPackageName ());
            genPackage = genPackage.getSuperGenPackage ();
        }

        StringBuilder buf = new StringBuilder (getTargetClass ().getQualifiedInterfaceName ().length ());

        for (String next : packageNames) {
            buf.append (next).append ('.');
        }

        return buf.append (getTargetClass ().getName ()).toString ();

    }

}

//GenAuditableImpl
