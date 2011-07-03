/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Parsers</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenParsersImpl#getEditorGen <em>Editor Gen</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenParsersImpl#getPackageName <em>Package Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenParsersImpl#getClassName <em>Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenParsersImpl#isExtensibleViaService <em>Extensible Via Service</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenParsersImpl#getProviderPriority <em>Provider Priority</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenParsersImpl#getImplementations <em>Implementations</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenParsersImpl extends EObjectImpl implements GenParsers {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getQualifiedClassName () {
        return getPackageName () == null ? getClassName () : getPackageName () + '.' + getClassName ();

    }

}

//GenParsersImpl
