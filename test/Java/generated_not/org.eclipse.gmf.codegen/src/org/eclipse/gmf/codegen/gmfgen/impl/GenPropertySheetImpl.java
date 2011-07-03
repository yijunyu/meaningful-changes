/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Property Sheet</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl#getEditorGen <em>Editor Gen</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl#getTabs <em>Tabs</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl#getPackageName <em>Package Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl#isReadOnly <em>Read Only</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl#isNeedsCaption <em>Needs Caption</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl#getLabelProviderClassName <em>Label Provider Class Name</em>}</li>

   * </ul>
   * </p>
   *
   * @generated
   */ public class GenPropertySheetImpl extends EObjectImpl implements GenPropertySheet {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getLabelProviderQualifiedClassName () {
        return getPackageName () + '.' + getLabelProviderClassName ();

    }

}

//GenPropertySheetImpl
