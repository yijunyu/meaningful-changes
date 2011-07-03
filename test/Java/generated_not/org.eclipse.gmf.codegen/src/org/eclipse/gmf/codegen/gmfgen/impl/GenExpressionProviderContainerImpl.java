/**
   * <copyright>
   * </copyright>
   *
   * $Id: GenExpressionProviderContainerImpl.java,v 1.9 2008/05/07 13:56:01 atikhomirov Exp $
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Expression Provider Container</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionProviderContainerImpl#getExpressionsPackageName <em>Expressions Package Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionProviderContainerImpl#getAbstractExpressionClassName <em>Abstract Expression Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionProviderContainerImpl#getProviders <em>Providers</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionProviderContainerImpl#getEditorGen <em>Editor Gen</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenExpressionProviderContainerImpl extends EObjectImpl implements GenExpressionProviderContainer {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getExpressionsPackageName () {
        String value = getExpressionsPackageNameGen ();

        if (GenCommonBaseImpl.isEmpty (value)) {
            value = getEditorGen ().getPackageNamePrefix () + ".expressions";
        //$NON-NLS-1$}

        return value;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getAbstractExpressionClassName () {
        String value = getAbstractExpressionClassNameGen ();

        if (GenCommonBaseImpl.isEmpty (value)) {
            String prefix = ((GenEditorGeneratorImpl) getEditorGen ()).getDomainModelCapName ();

            value = prefix + "AbstractExpression";
        //$NON-NLS-1$}

        return value;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getAbstractExpressionQualifiedClassName () {
        return getExpressionsPackageName () + "." + getAbstractExpressionClassName ();

    //$NON-NLS-1$}

}

//GenExpressionProviderContainerImpl
