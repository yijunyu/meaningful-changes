/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Value Expression</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ValueExpressionImpl#getBody <em>Body</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ValueExpressionImpl#getLangName <em>Lang Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ValueExpressionImpl#getProvider <em>Provider</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class ValueExpressionImpl extends EObjectImpl implements ValueExpression {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getLangName () {
        GenLanguage langEnum = getProvider () == null ? null : getProvider ().getLanguage ();

        return (langEnum != null) ? langEnum.getName () : "";

    //$NON-NLS-1$}

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getBodyString () {
        return Conversions.toStringLiteral (getBody ());

    }

}

//ValueExpressionImpl
