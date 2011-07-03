/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Audit Context</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContextImpl#getRoot <em>Root</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContextImpl#getId <em>Id</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContextImpl#getClassName <em>Class Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContextImpl#getRuleTargets <em>Rule Targets</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenAuditContextImpl extends EObjectImpl implements GenAuditContext {
    /**
       * @generated NOT
       */
    public String getClassName () {
        if (! GenCommonBaseImpl.isEmpty (getClassNameGen ())) {
            return getClassNameGen ();

        }

        return getId ();

    //$NON-NLS-1$}

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getQualifiedClassName () {
        if (getDiagram () == null) {
            return getClassName ();

        }

        return getDiagram ().getValidationProviderQualifiedClassName () + '$' + getClassName ();

    }

}

//GenAuditContextImpl
