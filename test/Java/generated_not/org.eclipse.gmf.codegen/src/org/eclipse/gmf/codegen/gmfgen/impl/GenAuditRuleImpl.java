/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Audit Rule</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#getRoot <em>Root</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#getId <em>Id</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#getRule <em>Rule</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#getTarget <em>Target</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#getMessage <em>Message</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#getSeverity <em>Severity</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#isUseInLiveMode <em>Use In Live Mode</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#isRequiresConstraintAdapter <em>Requires Constraint Adapter</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl#getCategory <em>Category</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenAuditRuleImpl extends GenRuleBaseImpl implements GenAuditRule {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getConstraintAdapterClassName () {
        if (getDiagram () == null || getConstraintAdapterLocalClassName () == null) {
            return null;

        }

        return getDiagram ().getValidationProviderClassName () + "$" + getConstraintAdapterLocalClassName ();

    //$NON-NLS-1$}

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getConstraintAdapterLocalClassName () {
        return "Adapter" + (getRoot ().getRules ().indexOf (this) + 1);

    //$NON-NLS-1$ }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getConstraintAdapterQualifiedClassName () {
        if (getDiagram () == null) {
            return null;

        }

        return getDiagram ().getValidationProviderQualifiedClassName () + "$" + getConstraintAdapterLocalClassName ();

    //$NON-NLS-1$}

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean isRequiresConstraintAdapter () {
        if (getRule () != null) {
            if (getRule ().getProvider ().getLanguage () != GenLanguage.OCL_LITERAL || getTarget () instanceof
              GenDomainAttributeTarget) {
                return true;

            }
            else if (getTarget () != null && getTarget ().getContext () != null) {
                return getTarget ().getContext () != getTarget ().getTargetClass ();

            }

        }

        return false;

    }

}

//GenAuditRuleImpl
