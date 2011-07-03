/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Value Expression</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.mappings.impl.ValueExpressionImpl#getBody <em>Body</em>}</li>
   *   <li>{@link org.eclipse.gmf.mappings.impl.ValueExpressionImpl#getLanguage <em>Language</em>}</li>
   *   <li>{@link org.eclipse.gmf.mappings.impl.ValueExpressionImpl#getLangName <em>Lang Name</em>}</li>
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
        Language langEnum = getLanguage ();

        return (langEnum != null) ? langEnum.getName () : "";

    //$NON-NLS-1$}

}

//ValueExpressionImpl
