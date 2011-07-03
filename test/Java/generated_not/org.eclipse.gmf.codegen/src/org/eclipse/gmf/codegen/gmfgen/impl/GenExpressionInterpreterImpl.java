/**
   * <copyright>
   * </copyright>
   *
   * $Id: GenExpressionInterpreterImpl.java,v 1.7 2008/04/18 14:43:22 atikhomirov Exp $
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Expression Interpreter</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionInterpreterImpl#getLanguage <em>Language</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionInterpreterImpl#getClassName <em>Class Name</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenExpressionInterpreterImpl extends GenExpressionProviderBaseImpl implements GenExpressionInterpreter {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getClassName () {
        String value = getClassNameGen ();

        if (GenCommonBaseImpl.isEmpty (value)) {
            String prefix = ((GenEditorGeneratorImpl) getContainer ().getEditorGen ()).getDomainModelCapName ();

            value = prefix + CodeGenUtil.validJavaIdentifier (getLanguage ().getName ().toUpperCase ()) + "Factory";
        //$NON-NLS-1$}

        return value;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getQualifiedClassName () {
        return getContainer ().getExpressionsPackageName () + "." + getClassName ();

    //$NON-NLS-1$}

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getExpressionAccessor (ValueExpression expression) {
        return "getExpression";

    //$NON-NLS-1$}

}

//GenExpressionInterpreterImpl
