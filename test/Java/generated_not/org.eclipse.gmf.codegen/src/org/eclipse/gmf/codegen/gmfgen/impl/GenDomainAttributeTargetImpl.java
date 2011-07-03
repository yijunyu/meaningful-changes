/**
   * <copyright>
   * </copyright>
   *
   * $Id: GenDomainAttributeTargetImpl.java,v 1.3 2007/04/11 08:10:23 dstadnik Exp $
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Domain Attribute Target</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDomainAttributeTargetImpl#getAttribute <em>Attribute</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDomainAttributeTargetImpl#isNullAsError <em>Null As Error</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenDomainAttributeTargetImpl extends GenAuditableImpl implements GenDomainAttributeTarget {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClassifier getContext () {
        if (getAttribute () == null) {
            return null;

        }

        return getAttribute ().getTypeGenClassifier ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getTargetClass () {
        if (getAttribute () == null) {
            return null;

        }

        return getAttribute ().getGenClass ();

    }

}

//GenDomainAttributeTargetImpl
